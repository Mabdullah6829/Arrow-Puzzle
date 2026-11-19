/*
 * Arrow Puzzle - Super Admin server (no dependencies).
 *
 *   node server.js            -> http://127.0.0.1:4000
 *
 * Reads and writes the game's level JSON files and m.xml. Binds to localhost only, requires a
 * password, validates every level before saving, and backs up each file before its first change.
 */
const http = require('http');
const fs = require('fs');
const path = require('path');
const crypto = require('crypto');
const T = require('./public/level-tools.js');

const PORT = Number(process.env.ADMIN_PORT) || 4000;
const HOST = '127.0.0.1';
const APP_ROOT = path.resolve(__dirname, '..');
// First root is read from; every root is written to, so the Android build and the recovered copy stay in step.
const ROOTS = (process.env.ARROW_ASSETS_ROOTS
  ? process.env.ARROW_ASSETS_ROOTS.split(path.delimiter)
  : [
      path.join(APP_ROOT, "adfree-android", "app", "src", "main", "assets", "assets"),
      path.join(APP_ROOT, "recovered-source", "web-game", "assets", "assets"),
    ]
).filter((r) => fs.existsSync(r));
if (!ROOTS.length) {
  console.error('Could not find the game assets folder. Expected adfree-android/app/src/main/assets/assets');
  process.exit(1);
}
const LEVEL_FILES = ['levels_0', 'levels_1', 'levels_2', 'levels_3', 'levels_4', 'levels_5', 'levels_6', 'levels_7', 'levels_ch'];
const LEVEL_DIR = 'levels';
const TEXT_FILE = path.join('dat', 'm.xml');
const BACKUP_DIR = process.env.ARROW_BACKUP_DIR || path.join(__dirname, 'backups');
const PUBLIC_DIR = path.join(__dirname, 'public');

// ---------- password ----------
const PW_FILE = path.join(__dirname, '.admin-password');
let PASSWORD = process.env.ARROW_ADMIN_PASSWORD;
let pwSource = 'environment variable ARROW_ADMIN_PASSWORD';
if (!PASSWORD) {
  if (fs.existsSync(PW_FILE)) {
    PASSWORD = fs.readFileSync(PW_FILE, 'utf8').trim();
    pwSource = PW_FILE;
  } else {
    PASSWORD = crypto.randomBytes(9).toString('base64url');
    fs.writeFileSync(PW_FILE, PASSWORD + '\n', { mode: 0o600 });
    pwSource = PW_FILE + ' (generated just now)';
  }
}
const safeEqual = (a, b) => {
  const x = crypto.createHash('sha256').update(String(a)).digest();
  const y = crypto.createHash('sha256').update(String(b)).digest();
  return crypto.timingSafeEqual(x, y);
};
const sessions = new Map(); // sid -> expiry
const SESSION_MS = 8 * 3600 * 1000;
let failures = []; // timestamps of recent failed logins

// ---------- file helpers ----------
const levelPath = (root, file) => path.join(root, LEVEL_DIR, file + '.json');
const cache = new Map();
const backedUp = new Set();

function readLevels(file) {
  if (!cache.has(file)) cache.set(file, JSON.parse(fs.readFileSync(levelPath(ROOTS[0], file), 'utf8')));
  return cache.get(file);
}
function serializeLevels(arr) {
  // Same layout as the shipped files (one level per line, no trailing newline) so saves create no noise.
  return '[\n  ' + arr.map((l) => JSON.stringify(l)).join(',\n  ') + '\n]';
}
function atomicWrite(p, data) {
  const tmp = p + '.tmp';
  fs.writeFileSync(tmp, data);
  fs.renameSync(tmp, p);
}
function backupOnce(relPath) {
  if (backedUp.has(relPath)) return;
  const src = path.join(ROOTS[0], relPath);
  if (!fs.existsSync(src)) return;
  const dir = path.join(BACKUP_DIR, new Date().toISOString().replace(/[:.]/g, '-'));
  fs.mkdirSync(path.dirname(path.join(dir, relPath)), { recursive: true });
  fs.copyFileSync(src, path.join(dir, relPath));
  backedUp.add(relPath);
}
function writeLevels(file, arr) {
  const rel = path.join(LEVEL_DIR, file + '.json');
  backupOnce(rel);
  const data = serializeLevels(arr);
  for (const r of ROOTS) atomicWrite(levelPath(r, file), data);
  cache.set(file, arr);
}

// ---------- texts (m.xml) ----------
const unesc = (s) => s.replace(/&lt;/g, '<').replace(/&gt;/g, '>').replace(/&quot;/g, '"').replace(/&apos;/g, "'").replace(/&amp;/g, '&');
const esc = (s) => String(s).replace(/&/g, '&amp;').replace(/</g, '&lt;').replace(/>/g, '&gt;');
function readTexts() {
  const xml = fs.readFileSync(path.join(ROOTS[0], TEXT_FILE), 'utf8');
  const out = [];
  for (const m of xml.matchAll(/<string\s+id="([^"]*)"\s*>([\s\S]*?)<\/string>/g)) {
    const values = {};
    for (const l of m[2].matchAll(/<(\w+)>([\s\S]*?)<\/\1>/g)) values[l[1]] = unesc(l[2]);
    out.push({ id: unesc(m[1]), values });
  }
  return out;
}
function serializeTexts(list) {
  let s = '<?xml version="1.0" encoding="UTF-8" standalone="no"?>\n<stringresources>\n    <strings>\n\n';
  for (const t of list) {
    s += `        <string id="${esc(t.id).replace(/"/g, '&quot;')}">\n`;
    for (const [lang, text] of Object.entries(t.values)) s += `            <${lang}>${esc(text)}</${lang}>\n`;
    s += '        </string>\n\n';
  }
  return s + '    </strings>\n</stringresources>\n';
}
function validateTexts(list) {
  if (!Array.isArray(list)) return 'texts must be an array';
  const ids = new Set();
  for (const t of list) {
    if (!t || typeof t.id !== 'string' || !/^[A-Za-z0-9_ .\-]+$/.test(t.id)) return `Invalid text id: ${t && t.id}`;
    if (ids.has(t.id)) return `Duplicate text id: ${t.id}`;
    ids.add(t.id);
    if (!t.values || typeof t.values !== 'object') return `Text ${t.id} has no values`;
    for (const [lang, v] of Object.entries(t.values)) {
      if (!/^[a-z]{2}$/.test(lang) || typeof v !== 'string') return `Text ${t.id}: bad language entry ${lang}`;
    }
  }
  return null;
}

// ---------- level summaries ----------
function summarize(file) {
  return readLevels(file).map((L, i) => {
    const v = T.validate(L);
    return {
      i,
      w: L.gridWidth,
      h: L.gridHeight,
      arrows: Array.isArray(L.arrows) ? L.arrows.length : 0,
      difficulty: L.difficulty === undefined ? null : L.difficulty,
      ok: !v.errors.length && v.solvable,
      errors: v.errors.length,
      game: T.gameLevelFor(file, i),
    };
  });
}

// ---------- http plumbing ----------
class HttpError extends Error {
  constructor(status, message) {
    super(message);
    this.status = status;
  }
}
const send = (res, status, body, headers = {}) => {
  const isObj = typeof body === 'object' && !Buffer.isBuffer(body);
  res.writeHead(status, {
    'Content-Type': isObj ? 'application/json' : 'text/plain; charset=utf-8',
    'Cache-Control': 'no-store',
    'X-Content-Type-Options': 'nosniff',
    ...headers,
  });
  res.end(isObj ? JSON.stringify(body) : body);
};
function readBody(req) {
  return new Promise((resolve, reject) => {
    let size = 0;
    const chunks = [];
    req.on('data', (c) => {
      size += c.length;
      if (size > 8 * 1024 * 1024) {
        reject(new HttpError(413, 'Body too large'));
        req.destroy();
      } else chunks.push(c);
    });
    req.on('end', () => {
      if (!chunks.length) return resolve({});
      try {
        resolve(JSON.parse(Buffer.concat(chunks).toString('utf8')));
      } catch {
        reject(new HttpError(400, 'Invalid JSON'));
      }
    });
    req.on('error', reject);
  });
}
const getSid = (req) => ((req.headers.cookie || '').match(/(?:^|;\s*)sid=([A-Za-z0-9_-]+)/) || [])[1];
function authed(req) {
  const sid = getSid(req);
  const exp = sid && sessions.get(sid);
  if (!exp) return false;
  if (exp < Date.now()) {
    sessions.delete(sid);
    return false;
  }
  return true;
}
const fileParam = (f) => {
  if (!LEVEL_FILES.includes(f)) throw new HttpError(404, 'Unknown level file');
  return f;
};
const indexParam = (s, max) => {
  const n = Number(s);
  if (!Number.isInteger(n) || n < 0 || n > max) throw new HttpError(404, 'Level index out of range');
  return n;
};
function checkLevel(L) {
  const v = T.validate(L);
  if (v.errors.length) throw new HttpError(422, v.errors.join('; '));
  return v;
}

// ---------- API ----------
async function api(req, res, url) {
  const route = `${req.method} ${url.pathname}`;
  const parts = url.pathname.split('/').filter(Boolean).slice(1); // drop "api"
  const body = req.method === 'GET' ? {} : await readBody(req);

  if (route === 'POST /api/login') {
    const now = Date.now();
    failures = failures.filter((t) => now - t < 60000);
    if (failures.length >= 8) throw new HttpError(429, 'Too many attempts. Wait a minute.');
    if (!safeEqual(body.password || '', PASSWORD)) {
      failures.push(now);
      await new Promise((r) => setTimeout(r, 600));
      throw new HttpError(401, 'Wrong password');
    }
    const sid = crypto.randomBytes(24).toString('base64url');
    sessions.set(sid, now + SESSION_MS);
    return send(res, 200, { ok: true }, { 'Set-Cookie': `sid=${sid}; HttpOnly; SameSite=Strict; Path=/; Max-Age=${SESSION_MS / 1000}` });
  }
  if (route === 'GET /api/session') return send(res, 200, { authed: authed(req) });
  if (!authed(req)) throw new HttpError(401, 'Not logged in');
  if (route === 'POST /api/logout') {
    sessions.delete(getSid(req));
    return send(res, 200, { ok: true }, { 'Set-Cookie': 'sid=; HttpOnly; SameSite=Strict; Path=/; Max-Age=0' });
  }

  if (route === 'GET /api/overview') {
    const files = LEVEL_FILES.map((file) => {
      const list = summarize(file);
      const diffs = {};
      list.forEach((l) => (diffs[l.difficulty] = (diffs[l.difficulty] || 0) + 1));
      return {
        file,
        count: list.length,
        unsolvable: list.filter((l) => !l.ok).length,
        unused: list.filter((l) => l.game.unused).length,
        arrows: list.reduce((n, l) => n + l.arrows, 0),
        diffs,
      };
    });
    return send(res, 200, { files, texts: readTexts().length, roots: ROOTS, backups: listBackups().length });
  }

  if (parts[0] === 'levels' && req.method === 'GET') return send(res, 200, summarize(fileParam(parts[1])));

  if (parts[0] === 'level') {
    const file = fileParam(parts[1]);
    const arr = readLevels(file);
    if (req.method === 'GET') {
      const i = indexParam(parts[2], arr.length - 1);
      return send(res, 200, { level: arr[i], validation: T.validate(arr[i]), game: T.gameLevelFor(file, i) });
    }
    if (req.method === 'PUT') {
      const i = indexParam(parts[2], arr.length - 1);
      const v = checkLevel(body.level);
      const next = arr.slice();
      next[i] = body.level;
      writeLevels(file, next);
      return send(res, 200, { ok: true, validation: v });
    }
    if (req.method === 'POST' && parts.length === 2) {
      // insert a new level; at = position (default: end)
      const v = checkLevel(body.level);
      const at = body.at === undefined ? arr.length : indexParam(body.at, arr.length);
      const next = arr.slice();
      next.splice(at, 0, body.level);
      writeLevels(file, next);
      return send(res, 200, { ok: true, index: at, validation: v });
    }
    if (req.method === 'DELETE') {
      const i = indexParam(parts[2], arr.length - 1);
      if (arr.length <= 1) throw new HttpError(422, 'A file must keep at least one level');
      const next = arr.slice();
      next.splice(i, 1);
      writeLevels(file, next);
      return send(res, 200, { ok: true });
    }
    if (req.method === 'POST' && parts[3] === 'move') {
      const i = indexParam(parts[2], arr.length - 1);
      const to = indexParam(body.to, arr.length - 1);
      const next = arr.slice();
      const [item] = next.splice(i, 1);
      next.splice(to, 0, item);
      writeLevels(file, next);
      return send(res, 200, { ok: true, index: to });
    }
  }

  if (route === 'POST /api/generate') {
    const w = Number(body.w);
    const h = Number(body.h);
    if (!Number.isInteger(w) || !Number.isInteger(h) || w < 3 || h < 3 || w > 40 || h > 40) throw new HttpError(422, 'Size must be 3-40');
    const L = T.generateLevel(w, h, {
      minLen: Math.max(2, Number(body.minLen) || 3),
      maxLen: Math.min(40, Number(body.maxLen) || 10),
      fill: Math.min(0.98, Math.max(0.2, Number(body.fill) || 0.9)),
      difficulty: Math.min(3, Math.max(1, Number(body.difficulty) || 1)),
    });
    return send(res, 200, { level: L, validation: T.validate(L) });
  }

  if (route === 'GET /api/texts') return send(res, 200, readTexts());
  if (route === 'PUT /api/texts') {
    const err = validateTexts(body.texts);
    if (err) throw new HttpError(422, err);
    backupOnce(TEXT_FILE);
    const data = serializeTexts(body.texts);
    for (const r of ROOTS) atomicWrite(path.join(r, TEXT_FILE), data);
    return send(res, 200, { ok: true, count: body.texts.length });
  }

  if (route === 'GET /api/backups') return send(res, 200, listBackups());
  if (route === 'POST /api/backups/snapshot') {
    const dir = path.join(BACKUP_DIR, new Date().toISOString().replace(/[:.]/g, '-') + '-manual');
    for (const rel of [...LEVEL_FILES.map((f) => path.join(LEVEL_DIR, f + '.json')), TEXT_FILE]) {
      fs.mkdirSync(path.dirname(path.join(dir, rel)), { recursive: true });
      fs.copyFileSync(path.join(ROOTS[0], rel), path.join(dir, rel));
    }
    return send(res, 200, { ok: true });
  }
  if (route === 'POST /api/backups/restore') {
    const id = String(body.id || '');
    const rel = String(body.file || '');
    const allowed = [...LEVEL_FILES.map((f) => path.join(LEVEL_DIR, f + '.json')), TEXT_FILE].map((p) => p.replace(/\\/g, '/'));
    if (!/^[\w.\-]+$/.test(id) || !allowed.includes(rel.replace(/\\/g, '/'))) throw new HttpError(400, 'Bad backup reference');
    const src = path.join(BACKUP_DIR, id, rel);
    if (!fs.existsSync(src)) throw new HttpError(404, 'Backup file not found');
    const data = fs.readFileSync(src);
    if (rel.endsWith('.json')) {
      const parsed = JSON.parse(data.toString('utf8'));
      if (!Array.isArray(parsed)) throw new HttpError(422, 'Backup is not a level list');
    }
    backupOnce(rel); // keep what we are about to overwrite
    for (const r of ROOTS) atomicWrite(path.join(r, rel), data);
    cache.clear();
    return send(res, 200, { ok: true });
  }

  throw new HttpError(404, 'Not found');
}
function listBackups() {
  if (!fs.existsSync(BACKUP_DIR)) return [];
  const walk = (d, base = '') =>
    fs.readdirSync(path.join(d, base), { withFileTypes: true }).flatMap((e) => {
      const rel = path.join(base, e.name);
      return e.isDirectory() ? walk(d, rel) : [rel.replace(/\\/g, '/')];
    });
  return fs
    .readdirSync(BACKUP_DIR)
    .filter((n) => fs.statSync(path.join(BACKUP_DIR, n)).isDirectory())
    .sort()
    .reverse()
    .map((id) => ({ id, files: walk(path.join(BACKUP_DIR, id)) }));
}

// ---------- static files ----------
const MIME = { '.html': 'text/html; charset=utf-8', '.js': 'application/javascript; charset=utf-8', '.css': 'text/css; charset=utf-8', '.svg': 'image/svg+xml' };
function serveStatic(req, res, url) {
  const rel = url.pathname === '/' ? 'index.html' : decodeURIComponent(url.pathname).replace(/^\/+/, '');
  const file = path.resolve(PUBLIC_DIR, rel);
  if (!file.startsWith(PUBLIC_DIR + path.sep) || !fs.existsSync(file) || !fs.statSync(file).isFile()) return send(res, 404, 'Not found');
  res.writeHead(200, { 'Content-Type': MIME[path.extname(file)] || 'application/octet-stream', 'Cache-Control': 'no-store', 'X-Content-Type-Options': 'nosniff' });
  fs.createReadStream(file).pipe(res);
}

const server = http.createServer(async (req, res) => {
  try {
    // Reject DNS-rebinding and cross-site writes.
    const host = (req.headers.host || '').split(':')[0];
    if (host !== '127.0.0.1' && host !== 'localhost') throw new HttpError(403, 'Bad host');
    const url = new URL(req.url, `http://${req.headers.host}`);
    if (url.pathname.startsWith('/api/')) {
      if (req.method !== 'GET') {
        const origin = req.headers.origin;
        if (req.headers['x-requested-with'] !== 'arrow-admin' || (origin && new URL(origin).host !== req.headers.host)) throw new HttpError(403, 'Blocked cross-site request');
      }
      return await api(req, res, url);
    }
    if (req.method !== 'GET') throw new HttpError(405, 'Method not allowed');
    serveStatic(req, res, url);
  } catch (e) {
    if (!(e instanceof HttpError)) console.error(e);
    if (!res.headersSent) send(res, e.status || 500, { error: e.status ? e.message : 'Server error' });
  }
});

if (require.main === module) {
  server.listen(PORT, HOST, () => {
    console.log(`\nArrow Puzzle Super Admin  ->  http://${HOST}:${PORT}`);
    console.log(`Password from ${pwSource}`);
    if (pwSource.includes('generated')) console.log(`Password: ${PASSWORD}`);
    console.log('Writing to:\n  ' + ROOTS.join('\n  ') + '\n');
  });
}
module.exports = { server, serializeLevels, serializeTexts, readTexts };
