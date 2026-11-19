<?php
declare(strict_types=1);

/*
 * Arrow Puzzle Super Admin - PHP API (runs on the shared host, no Node needed).
 * Deployed to <site>/admin/api.php; the browser calls /admin/api/<route> (see admin/.htaccess).
 *
 * Edits the live game data in <site>/assets/levels/*.json and <site>/assets/dat/m.xml.
 * Private state (password hash, sessions, backups) lives in <site>/_private, which the web server denies.
 */

$SITE = dirname(__DIR__);
$PRIV = $SITE . '/_private';
$ASSETS = $SITE . '/assets';

ini_set('display_errors', '0');
header('Content-Type: application/json; charset=utf-8');
header('Cache-Control: no-store');
header('X-Content-Type-Options: nosniff');
header('X-Robots-Tag: noindex, nofollow');

function out($data, int $code = 200): never
{
    http_response_code($code);
    echo json_encode($data, JSON_UNESCAPED_SLASHES | JSON_UNESCAPED_UNICODE);
    exit;
}
function fail(int $code, string $msg): never
{
    out(['error' => $msg], $code);
}
set_exception_handler(static function (Throwable $e): void {
    error_log('arrow-admin: ' . $e->getMessage());
    fail(500, 'Server error');
});

if (!is_file($PRIV . '/config.php')) {
    fail(503, 'Admin is not configured yet');
}
$CFG = require $PRIV . '/config.php';
require $PRIV . '/lib/level_tools.php';

const LEVEL_FILES = ['levels_0', 'levels_1', 'levels_2', 'levels_3', 'levels_4', 'levels_5', 'levels_6', 'levels_7', 'levels_ch'];
const TEXT_REL = 'dat/m.xml';

// ------------------------------------------------------------ request guards
function is_https(): bool
{
    if (!empty($_SERVER['HTTPS']) && $_SERVER['HTTPS'] !== 'off') {
        return true;
    }
    if (strtolower($_SERVER['HTTP_X_FORWARDED_PROTO'] ?? '') === 'https') {
        return true;
    }
    return strpos($_SERVER['HTTP_CF_VISITOR'] ?? '', '"scheme":"https"') !== false;
}
function client_ip(): string
{
    return preg_replace('/[^0-9a-fA-F:.]/', '', $_SERVER['HTTP_CF_CONNECTING_IP'] ?? $_SERVER['REMOTE_ADDR'] ?? '0') ?: '0';
}

$host = strtolower(preg_replace('/:\d+$/', '', $_SERVER['HTTP_HOST'] ?? ''));
if (!in_array($host, $CFG['allowed_hosts'], true)) {
    fail(403, 'Bad host');
}
if (($CFG['require_https'] ?? true) && !is_https()) {
    fail(403, 'HTTPS required. Open the admin over https://');
}
$method = $_SERVER['REQUEST_METHOD'] ?? 'GET';
if ($method !== 'GET') {
    $origin = $_SERVER['HTTP_ORIGIN'] ?? '';
    $originHost = $origin !== '' ? strtolower((string)parse_url($origin, PHP_URL_HOST)) : '';
    if (($_SERVER['HTTP_X_REQUESTED_WITH'] ?? '') !== 'arrow-admin' || ($originHost !== '' && $originHost !== $host)) {
        fail(403, 'Blocked cross-site request');
    }
}

// ------------------------------------------------------------ session
$sessDir = $PRIV . '/sessions';
if (!is_dir($sessDir)) {
    mkdir($sessDir, 0700, true);
}
session_name('arrowadmin');
session_save_path($sessDir);
session_set_cookie_params(['lifetime' => 0, 'path' => '/admin/', 'secure' => is_https(), 'httponly' => true, 'samesite' => 'Strict']);
ini_set('session.gc_maxlifetime', '28800');
ini_set('session.gc_probability', '1');
ini_set('session.gc_divisor', '20');
ini_set('session.use_strict_mode', '1');

$route = trim((string)($_GET['r'] ?? ''), '/');
$p = $route === '' ? [] : explode('/', $route);
$key = $method . ' ' . ($p[0] ?? '');

// Only open a session for a real existing one or a login attempt, so anonymous requests
// cannot fill the sessions folder with empty files.
$sid = (string)($_COOKIE['arrowadmin'] ?? '');
$hasSession = preg_match('/^[A-Za-z0-9,-]{22,128}$/', $sid) === 1 && is_file($sessDir . '/sess_' . $sid);
if ($hasSession || $key === 'POST login') {
    session_start();
}
$authed = session_status() === PHP_SESSION_ACTIVE && !empty($_SESSION['ok']) && ($_SESSION['exp'] ?? 0) > time();

// ------------------------------------------------------------ helpers
function body(): array
{
    $raw = file_get_contents('php://input');
    if ($raw === '' || $raw === false) {
        return [];
    }
    if (strlen($raw) > 8 * 1024 * 1024) {
        fail(413, 'Body too large');
    }
    $d = json_decode($raw, true);
    if (!is_array($d)) {
        fail(400, 'Invalid JSON');
    }
    return $d;
}
function file_param(string $f): string
{
    if (!in_array($f, LEVEL_FILES, true)) {
        fail(404, 'Unknown level file');
    }
    return $f;
}
function index_param($s, int $max): int
{
    if (!is_string($s) && !is_int($s)) {
        fail(404, 'Level index out of range');
    }
    if (!preg_match('/^\d+$/', (string)$s) || (int)$s > $max) {
        fail(404, 'Level index out of range');
    }
    return (int)$s;
}
function atomic_write(string $path, string $data): void
{
    $tmp = $path . '.tmp' . getmypid();
    if (file_put_contents($tmp, $data, LOCK_EX) === false || !rename($tmp, $path)) {
        @unlink($tmp);
        throw new RuntimeException('write failed: ' . basename($path));
    }
}
function level_path(string $f): string
{
    global $ASSETS;
    return "$ASSETS/levels/$f.json";
}
function read_levels(string $f): array
{
    $d = json_decode((string)file_get_contents(level_path($f)), true);
    if (!is_array($d)) {
        throw new RuntimeException('corrupt level file ' . $f);
    }
    return $d;
}
function serialize_levels(array $arr): string
{
    // Same layout as the shipped files: one level per line, no trailing newline.
    $parts = array_map(static fn($l) => json_encode($l, JSON_UNESCAPED_SLASHES | JSON_UNESCAPED_UNICODE), $arr);
    return "[\n  " . implode(",\n  ", $parts) . "\n]";
}
function backup_once(string $rel): void
{
    global $PRIV, $ASSETS;
    if (!empty($_SESSION['backed'][$rel])) {
        return;
    }
    $src = "$ASSETS/$rel";
    if (!is_file($src)) {
        return;
    }
    $dir = $PRIV . '/backups/' . gmdate('Y-m-d\TH-i-s\Z') . '-' . bin2hex(random_bytes(2));
    $dst = "$dir/$rel";
    if (!is_dir(dirname($dst))) {
        mkdir(dirname($dst), 0700, true);
    }
    copy($src, $dst);
    $_SESSION['backed'][$rel] = true;
}
function write_levels(string $f, array $arr): void
{
    backup_once("levels/$f.json");
    atomic_write(level_path($f), serialize_levels($arr));
}
function check_level($L): array
{
    $v = lt_validate($L);
    if ($v['errors']) {
        fail(422, implode('; ', $v['errors']));
    }
    return $v;
}
function summarize(string $file): array
{
    $out = [];
    foreach (read_levels($file) as $i => $L) {
        $v = lt_validate($L);
        $out[] = [
            'i' => $i,
            'w' => $L['gridWidth'] ?? 0,
            'h' => $L['gridHeight'] ?? 0,
            'arrows' => is_array($L['arrows'] ?? null) ? count($L['arrows']) : 0,
            'difficulty' => $L['difficulty'] ?? null,
            'ok' => !$v['errors'] && $v['solvable'],
            'errors' => count($v['errors']),
            'game' => lt_game_level_for($file, $i),
        ];
    }
    return $out;
}

// texts (m.xml)
function xml_unesc(string $s): string
{
    return str_replace(['&lt;', '&gt;', '&quot;', '&apos;', '&amp;'], ['<', '>', '"', "'", '&'], $s);
}
function xml_esc(string $s): string
{
    return str_replace(['&', '<', '>'], ['&amp;', '&lt;', '&gt;'], $s);
}
function read_texts(): array
{
    global $ASSETS;
    $xml = (string)file_get_contents($ASSETS . '/' . TEXT_REL);
    $out = [];
    preg_match_all('/<string\s+id="([^"]*)"\s*>([\s\S]*?)<\/string>/', $xml, $blocks, PREG_SET_ORDER);
    foreach ($blocks as $b) {
        $values = [];
        preg_match_all('/<(\w+)>([\s\S]*?)<\/\1>/', $b[2], $langs, PREG_SET_ORDER);
        foreach ($langs as $l) {
            $values[$l[1]] = xml_unesc($l[2]);
        }
        $out[] = ['id' => xml_unesc($b[1]), 'values' => (object)$values];
    }
    return $out;
}
function serialize_texts(array $list): string
{
    $s = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n<stringresources>\n    <strings>\n\n";
    foreach ($list as $t) {
        $s .= '        <string id="' . str_replace('"', '&quot;', xml_esc($t['id'])) . "\">\n";
        foreach ($t['values'] as $lang => $text) {
            $s .= "            <$lang>" . xml_esc($text) . "</$lang>\n";
        }
        $s .= "        </string>\n\n";
    }
    return $s . "    </strings>\n</stringresources>\n";
}
function validate_texts($list): ?string
{
    if (!is_array($list) || !array_is_list($list)) {
        return 'texts must be an array';
    }
    $ids = [];
    foreach ($list as $t) {
        if (!is_array($t) || !isset($t['id']) || !is_string($t['id']) || !preg_match('/^[A-Za-z0-9_ .\-]+$/', $t['id'])) {
            return 'Invalid text id: ' . (is_array($t) && isset($t['id']) && is_string($t['id']) ? $t['id'] : '?');
        }
        if (isset($ids[$t['id']])) {
            return 'Duplicate text id: ' . $t['id'];
        }
        $ids[$t['id']] = true;
        if (!isset($t['values']) || !is_array($t['values'])) {
            return 'Text ' . $t['id'] . ' has no values';
        }
        foreach ($t['values'] as $lang => $v) {
            if (!is_string($lang) || !preg_match('/^[a-z]{2}$/', $lang) || !is_string($v)) {
                return 'Text ' . $t['id'] . ': bad language entry ' . $lang;
            }
        }
    }
    return null;
}

// backups
function backup_files_allowed(): array
{
    return array_merge(array_map(static fn($f) => "levels/$f.json", LEVEL_FILES), [TEXT_REL]);
}
function list_backups(): array
{
    global $PRIV;
    $base = $PRIV . '/backups';
    if (!is_dir($base)) {
        return [];
    }
    $ids = array_values(array_filter(scandir($base) ?: [], static fn($n) => $n[0] !== '.' && is_dir("$base/$n")));
    rsort($ids);
    return array_map(static function ($id) use ($base) {
        $files = [];
        $it = new RecursiveIteratorIterator(new RecursiveDirectoryIterator("$base/$id", FilesystemIterator::SKIP_DOTS));
        foreach ($it as $f) {
            $files[] = str_replace('\\', '/', substr($f->getPathname(), strlen("$base/$id/")));
        }
        sort($files);
        return ['id' => $id, 'files' => $files];
    }, $ids);
}

// ------------------------------------------------------------ routing
if ($key === 'POST login') {
    $rl = $PRIV . '/ratelimit.json';
    $now = time();
    $all = is_file($rl) ? (json_decode((string)file_get_contents($rl), true) ?: []) : [];
    $ip = client_ip();
    $mine = array_values(array_filter($all[$ip] ?? [], static fn($t) => $now - $t < 60));
    if (count($mine) >= 8) {
        fail(429, 'Too many attempts. Wait a minute.');
    }
    $in = body();
    if (!is_string($in['password'] ?? null) || !password_verify($in['password'], $CFG['password_hash'])) {
        $mine[] = $now;
        $all[$ip] = $mine;
        $all = array_filter($all, static fn($v) => $v);
        @file_put_contents($rl, json_encode($all), LOCK_EX);
        usleep(600000);
        if (session_status() === PHP_SESSION_ACTIVE) {
            session_destroy(); // do not keep an empty session file for a failed login
        }
        fail(401, 'Wrong password');
    }
    session_regenerate_id(true);
    $_SESSION['ok'] = true;
    $_SESSION['exp'] = $now + 8 * 3600;
    out(['ok' => true]);
}
if ($key === 'GET session') {
    out(['authed' => $authed]);
}
if (!$authed) {
    fail(401, 'Not logged in');
}
if ($key === 'POST logout') {
    $_SESSION = [];
    session_destroy();
    out(['ok' => true]);
}

if ($key === 'GET overview') {
    $files = [];
    foreach (LEVEL_FILES as $file) {
        $list = summarize($file);
        $diffs = [];
        foreach ($list as $l) {
            $k = $l['difficulty'] === null ? 'null' : (string)$l['difficulty'];
            $diffs[$k] = ($diffs[$k] ?? 0) + 1;
        }
        $files[] = [
            'file' => $file,
            'count' => count($list),
            'unsolvable' => count(array_filter($list, static fn($l) => !$l['ok'])),
            'unused' => count(array_filter($list, static fn($l) => !empty($l['game']['unused']))),
            'arrows' => array_sum(array_column($list, 'arrows')),
            'diffs' => (object)$diffs,
        ];
    }
    out(['files' => $files, 'texts' => count(read_texts()), 'roots' => ['live site (' . $host . ')'], 'backups' => count(list_backups())]);
}

if ($key === 'GET levels') {
    out(summarize(file_param($p[1] ?? '')));
}

if (($p[0] ?? '') === 'level') {
    $file = file_param($p[1] ?? '');
    $arr = read_levels($file);
    if ($method === 'GET') {
        $i = index_param($p[2] ?? null, count($arr) - 1);
        out(['level' => $arr[$i], 'validation' => lt_validate($arr[$i]), 'game' => lt_game_level_for($file, $i)]);
    }
    $in = body();
    if ($method === 'PUT') {
        $i = index_param($p[2] ?? null, count($arr) - 1);
        $v = check_level($in['level'] ?? null);
        $arr[$i] = $in['level'];
        write_levels($file, $arr);
        out(['ok' => true, 'validation' => $v]);
    }
    if ($method === 'POST' && count($p) === 2) {
        $v = check_level($in['level'] ?? null);
        $at = array_key_exists('at', $in) ? index_param($in['at'], count($arr)) : count($arr);
        array_splice($arr, $at, 0, [$in['level']]);
        write_levels($file, $arr);
        out(['ok' => true, 'index' => $at, 'validation' => $v]);
    }
    if ($method === 'DELETE') {
        $i = index_param($p[2] ?? null, count($arr) - 1);
        if (count($arr) <= 1) {
            fail(422, 'A file must keep at least one level');
        }
        array_splice($arr, $i, 1);
        write_levels($file, $arr);
        out(['ok' => true]);
    }
    if ($method === 'POST' && ($p[3] ?? '') === 'move') {
        $i = index_param($p[2] ?? null, count($arr) - 1);
        $to = index_param($in['to'] ?? null, count($arr) - 1);
        $item = array_splice($arr, $i, 1);
        array_splice($arr, $to, 0, $item);
        write_levels($file, $arr);
        out(['ok' => true, 'index' => $to]);
    }
}

if ($key === 'POST generate') {
    $in = body();
    $w = $in['w'] ?? null;
    $h = $in['h'] ?? null;
    if (!is_int($w) || !is_int($h) || $w < 3 || $h < 3 || $w > 40 || $h > 40) {
        fail(422, 'Size must be 3-40');
    }
    $L = lt_generate($w, $h, [
        'minLen' => max(2, (int)($in['minLen'] ?? 3)),
        'maxLen' => min(40, (int)($in['maxLen'] ?? 10) ?: 10),
        'fill' => min(0.98, max(0.2, (float)($in['fill'] ?? 0.9) ?: 0.9)),
        'difficulty' => min(3, max(1, (int)($in['difficulty'] ?? 1))),
    ]);
    out(['level' => $L, 'validation' => lt_validate($L)]);
}

if ($key === 'GET texts') {
    out(read_texts());
}
if ($key === 'PUT texts') {
    $in = body();
    $err = validate_texts($in['texts'] ?? null);
    if ($err !== null) {
        fail(422, $err);
    }
    backup_once(TEXT_REL);
    atomic_write($ASSETS . '/' . TEXT_REL, serialize_texts($in['texts']));
    out(['ok' => true, 'count' => count($in['texts'])]);
}

if ($key === 'GET backups') {
    out(list_backups());
}
if ($method === 'POST' && ($p[0] ?? '') === 'backups' && ($p[1] ?? '') === 'snapshot') {
    $dir = $PRIV . '/backups/' . gmdate('Y-m-d\TH-i-s\Z') . '-manual';
    foreach (backup_files_allowed() as $rel) {
        if (!is_dir(dirname("$dir/$rel"))) {
            mkdir(dirname("$dir/$rel"), 0700, true);
        }
        copy("$ASSETS/$rel", "$dir/$rel");
    }
    out(['ok' => true]);
}
if ($method === 'POST' && ($p[0] ?? '') === 'backups' && ($p[1] ?? '') === 'restore') {
    $in = body();
    $id = (string)($in['id'] ?? '');
    $rel = str_replace('\\', '/', (string)($in['file'] ?? ''));
    if (!preg_match('/^[\w.\-]+$/', $id) || !in_array($rel, backup_files_allowed(), true)) {
        fail(400, 'Bad backup reference');
    }
    $src = "$PRIV/backups/$id/$rel";
    if (!is_file($src)) {
        fail(404, 'Backup file not found');
    }
    $data = (string)file_get_contents($src);
    if (str_ends_with($rel, '.json') && !is_array(json_decode($data, true))) {
        fail(422, 'Backup is not a level list');
    }
    backup_once($rel);
    atomic_write("$ASSETS/$rel", $data);
    out(['ok' => true]);
}

fail(404, 'Not found');
