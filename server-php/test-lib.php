<?php
declare(strict_types=1);

/*
 * READ-ONLY self-test of the PHP level logic, run on the server against the live data:
 *   cd <site folder> && php < server-php/test-lib.php        (or: ssh ... "cd arrow && php" < test-lib.php)
 * Writes nothing.
 */
$site = getcwd();
require $site . '/_private/lib/level_tools.php';

$fail = 0;
$ok = 0;
function check(string $name, bool $cond, string $detail = ''): void
{
    global $fail, $ok;
    if ($cond) {
        $ok++;
        echo "  ok   $name\n";
    } else {
        $fail++;
        echo "  FAIL $name $detail\n";
    }
}
function serialize_levels(array $arr): string
{
    return "[\n  " . implode(",\n  ", array_map(static fn($l) => json_encode($l, JSON_UNESCAPED_SLASHES | JSON_UNESCAPED_UNICODE), $arr)) . "\n]";
}

$files = ['levels_0', 'levels_1', 'levels_2', 'levels_3', 'levels_4', 'levels_5', 'levels_6', 'levels_7', 'levels_ch'];
$total = 0;
$solvable = 0;
$identical = 0;
foreach ($files as $f) {
    $raw = (string)file_get_contents("$site/assets/levels/$f.json");
    $levels = json_decode($raw, true);
    if (serialize_levels($levels) === $raw) {
        $identical++;
    }
    foreach ($levels as $L) {
        $total++;
        $v = lt_validate($L);
        if (!$v['errors'] && $v['solvable']) {
            $solvable++;
        }
    }
}
echo "Existing data\n";
check('all 9 level files re-serialise byte-identically', $identical === 9, "($identical/9)");
check('607 levels, all valid and solvable', $total === 607 && $solvable === 607, "(total $total, solvable $solvable)");

echo "Validation rejects bad input\n";
$good = json_decode((string)file_get_contents("$site/assets/levels/levels_0.json"), true)[0];
$mut = static function (callable $f) use ($good): array {
    $c = $good;
    $f($c);
    return $c;
};
$cases = [
    'point outside grid' => $mut(function (&$c) { $c['arrows'][0]['points'][1] = ['x' => 9, 'y' => 9]; }),
    'overlapping arrows' => $mut(function (&$c) { $c['arrows'][1]['points'][0] = $c['arrows'][0]['points'][0]; }),
    'bad exit direction' => $mut(function (&$c) { $c['arrows'][0]['exitDir'] = ['x' => 1, 'y' => 1]; }),
    'bad cell value' => $mut(function (&$c) { $c['grid'][0][0] = 7; }),
    'non-neighbour step' => $mut(function (&$c) { $c['arrows'][0]['points'][2] = ['x' => 0, 'y' => 0]; }),
    'missing gridHeight' => ['gridWidth' => 3],
    'wrong grid shape' => $mut(function (&$c) { $c['grid'] = [[1]]; }),
    'arrows not a list' => $mut(function (&$c) { $c['arrows'] = 'x'; }),
    'float width' => $mut(function (&$c) { $c['gridWidth'] = 4.5; }),
    'not an object' => 'x',
    'width too big' => $mut(function (&$c) { $c['gridWidth'] = 999; }),
];
foreach ($cases as $name => $lv) {
    $v = lt_validate($lv);
    check("rejects: $name", count($v['errors']) > 0 && $v['solvable'] === false);
}
$unsolvable = ['gridWidth' => 3, 'gridHeight' => 1, 'grid' => [[1, 1, 1]], 'difficulty' => 1, 'arrows' => [
    ['points' => [['x' => 0, 'y' => 0], ['x' => 1, 'y' => 0]], 'exitDir' => ['x' => 1, 'y' => 0]],
    ['points' => [['x' => 2, 'y' => 0]], 'exitDir' => ['x' => -1, 'y' => 0]],
]];
$v = lt_validate($unsolvable);
check('unsolvable level: no errors, solvable=false, a warning', !$v['errors'] && !$v['solvable'] && count($v['warnings']) === 1);
check('good level still validates', !lt_validate($good)['errors'] && lt_validate($good)['solvable']);

echo "Generator\n";
$gen = 0;
$arrows = 0;
for ($s = 1; $s <= 300; $s++) {
    $L = lt_generate(5 + ($s % 12), 5 + (($s * 7) % 11), ['seed' => $s, 'difficulty' => 1 + ($s % 3)]);
    $v = lt_validate($L);
    if (!$v['errors'] && $v['solvable']) {
        $gen++;
    }
    $arrows += count($L['arrows']);
}
check('300 generated levels: all valid and solvable', $gen === 300, "($gen/300)");
check('generated levels contain arrows (avg > 4)', $arrows / 300 > 4, '(avg ' . round($arrows / 300, 1) . ')');

echo "Mapping\n";
check('levels_0 idx 99 -> level 100, idx 100 unused', lt_game_level_for('levels_0', 99) === ['level' => 100] && lt_game_level_for('levels_0', 100) === ['unused' => true]);
check('levels_2 idx 50 unused; levels_3 idx 5 -> level 387', lt_game_level_for('levels_2', 50) === ['unused' => true] && lt_game_level_for('levels_3', 5) === ['level' => 387]);
$bad = 0;
for ($n = 1; $n <= 3000; $n++) {
    if ($n <= 100) {
        $r = lt_game_level_for('levels_0', $n - 1);
        if (($r['level'] ?? 0) !== $n) {
            $bad++;
        }
    } else {
        $r = lt_game_level_for('levels_' . ($n % 7 + 1), intdiv($n, 7) % 50);
        if (!isset($r['level']) || $r['level'] > $n || ($r['level'] % 7 + 1) !== ($n % 7 + 1)) {
            $bad++;
        }
    }
}
check('mapping agrees with the game formula for levels 1..3000', $bad === 0, "($bad mismatches)");

echo "\n$ok passed" . ($fail ? ", $fail FAILED" : '') . "\n";
exit($fail ? 1 : 0);
