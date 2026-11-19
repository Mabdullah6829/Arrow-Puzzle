/*
 * End-to-end tests for the admin server. Runs against a TEMPORARY COPY of the game assets,
 * so your real levels are never touched.   npm test
 */
const { spawn } = require('child_process');
const fs = require('fs');
const os = require('os');
const path = require('path');
const assert = require('assert');
const T = require('./public/level-tools.js');

const SRC = path.resolve(__dirname, '..', 'adfree-android', 'app', 'src', 'main', 'assets', 'assets');
const tmp = fs.mkdtempSync(path.join(os.tmpdir(), 'arrow-admin-test-'));
const copy = (dest) => fs.cpSync(SRC, dest, { recursive: true, filter: (s) => !/(audio|spritesheets|splash|myFont)/.test(s) });
const rootA = path.join(tmp, 'a');
const rootB = path.join(tmp, 'b');
copy(rootA);
copy(rootB);
const PORT = 4100 + Math.floor(Math.random() * 500);
const BASE = `http://127.0.0.1:${PORT}`;
let cookie = '';
let passed = 0;

async function call(method, url, body, opts = {}) {
  const res = await fetch(BASE + url, {
    method,
    headers: { 'Content-Type': 'application/json', ...(opts.noCsrf ? {} : { 'X-Requested-With': 'arrow-admin' }), ...(opts.noCookie ? {} : { Cookie: cookie }), ...(opts.headers || {}) },
    body: body === undefined ? undefined : JSON.stringify(body),
  });
  const set = res.headers.get('set-cookie');
  if (set && set.startsWith('sid=') && !set.startsWith('sid=;')) cookie = set.split(';')[0];
  let data = null;
  try { data = await res.json(); } catch { /* not json */ }
  return { status: res.status, data };
}
async function test(name, fn) {
  try { await fn(); passed++; console.log('  ok   ' + name); }
  catch (e) { console.log('  FAIL ' + name + '\n       ' + (e.stack || e).split('\n').slice(0, 3).join('\n       ')); process.exitCode = 1; }
}
const hash = (p) => require('crypto').createHash('sha1').update(fs.readFileSync(p)).digest('hex');
const lv = (root, f) => path.join(root, 'levels', f + '.json');

(async () => {
  const server = spawn(process.execPath, [path.join(__dirname, 'server.js')], {
    env: { ...process.env, ADMIN_PORT: String(PORT), ARROW_ADMIN_PASSWORD: 'pw-test', ARROW_ASSETS_ROOTS: [rootA, rootB].join(path.delimiter), ARROW_BACKUP_DIR: path.join(tmp, 'backups') },
    stdio: 'ignore',
  });
  for (let i = 0; i < 50; i++) { try { await fetch(BASE + '/api/session'); break; } catch { await new Promise((r) => setTimeout(r, 100)); } }

  console.log('Security');
  await test('API is closed before login', async () => assert.strictEqual((await call('GET', '/api/overview', undefined, { noCookie: true })).status, 401));
  await test('wrong password is rejected', async () => assert.strictEqual((await call('POST', '/api/login', { password: 'nope' })).status, 401));
  await test('writes without the CSRF header are blocked', async () => assert.strictEqual((await call('POST', '/api/login', { password: 'pw-test' }, { noCsrf: true })).status, 403));
  await test('foreign Host header is blocked (DNS rebinding)', async () => {
    // fetch() will not let a script override Host, so use a raw http request
    const status = await new Promise((resolve, reject) =>
      require('http').get({ host: '127.0.0.1', port: PORT, path: '/api/session', headers: { Host: 'evil.example' } }, (res) => { res.resume(); resolve(res.statusCode); }).on('error', reject));
    assert.strictEqual(status, 403);
  });
  await test('path traversal is blocked', async () => {
    const r = await fetch(BASE + '/..%2f..%2fserver.js');
    assert.ok(r.status === 404 || r.status === 403, 'status ' + r.status);
  });
  await test('correct password logs in', async () => { const r = await call('POST', '/api/login', { password: 'pw-test' }); assert.strictEqual(r.status, 200); assert.ok(cookie); });

  console.log('Reading');
  await test('overview lists 9 files, all levels solvable', async () => {
    const { data } = await call('GET', '/api/overview');
    assert.strictEqual(data.files.length, 9);
    assert.strictEqual(data.files.reduce((n, f) => n + f.count, 0), 607);
    assert.strictEqual(data.files.reduce((n, f) => n + f.unsolvable, 0), 0);
    assert.strictEqual(data.texts, 46);
  });
  await test('level list and single level', async () => {
    const list = (await call('GET', '/api/levels/levels_0')).data;
    assert.strictEqual(list.length, 100);
    assert.strictEqual(list[0].game.level, 1);
    const one = (await call('GET', '/api/level/levels_0/0')).data;
    assert.strictEqual(one.level.gridWidth, 4);
    assert.ok(one.validation.solvable);
  });
  await test('game-level mapping matches the game (levels_0 only reaches index 99; others index 49)', async () => {
    assert.deepStrictEqual(T.gameLevelFor('levels_0', 99), { level: 100 });
    assert.ok(T.gameLevelFor('levels_0', 100).unused);
    assert.ok(T.gameLevelFor('levels_2', 50).unused);
    const o = (await call('GET', '/api/overview')).data.files;
    assert.strictEqual(o.find((f) => f.file === 'levels_1').unused, 50);
    assert.strictEqual(o.find((f) => f.file === 'levels_0').unused, 0);
  });
  await test('unknown file and bad index give 404', async () => {
    assert.strictEqual((await call('GET', '/api/levels/levels_99')).status, 404);
    assert.strictEqual((await call('GET', '/api/level/levels_0/9999')).status, 404);
    assert.strictEqual((await call('GET', '/api/level/..%2f..%2fserver/0')).status, 404);
  });

  console.log('Writing levels');
  await test('saving an unchanged level leaves the files byte-identical in both roots', async () => {
    const before = hash(lv(rootA, 'levels_0'));
    const { level } = (await call('GET', '/api/level/levels_0/5')).data;
    assert.strictEqual((await call('PUT', '/api/level/levels_0/5', { level })).status, 200);
    assert.strictEqual(hash(lv(rootA, 'levels_0')), before);
    assert.strictEqual(hash(lv(rootB, 'levels_0')), before);
  });
  await test('invalid levels are rejected and nothing is written', async () => {
    const before = hash(lv(rootA, 'levels_0'));
    const { level } = (await call('GET', '/api/level/levels_0/0')).data;
    const bad = JSON.parse(JSON.stringify(level));
    bad.arrows[0].points[1] = { x: 9, y: 9 };
    const r = await call('PUT', '/api/level/levels_0/0', { level: bad });
    assert.strictEqual(r.status, 422);
    assert.strictEqual(hash(lv(rootA, 'levels_0')), before);
    const overlap = JSON.parse(JSON.stringify(level));
    overlap.arrows[1].points[0] = overlap.arrows[0].points[0];
    assert.strictEqual((await call('PUT', '/api/level/levels_0/0', { level: overlap })).status, 422);
  });
  await test('edit, insert, move and delete keep counts and both copies in step', async () => {
    const n0 = (await call('GET', '/api/levels/levels_4')).data.length;
    const gen = (await call('POST', '/api/generate', { w: 9, h: 9, minLen: 3, maxLen: 8, fill: 0.9, difficulty: 2 })).data;
    assert.ok(gen.validation.solvable && !gen.validation.errors.length);
    const ins = (await call('POST', '/api/level/levels_4', { level: gen.level, at: 0 })).data;
    assert.strictEqual(ins.index, 0);
    assert.strictEqual((await call('GET', '/api/levels/levels_4')).data.length, n0 + 1);
    assert.deepStrictEqual(JSON.parse(fs.readFileSync(lv(rootB, 'levels_4'), 'utf8'))[0], gen.level);
    assert.strictEqual((await call('POST', '/api/level/levels_4/0/move', { to: 3 })).status, 200);
    assert.deepStrictEqual((await call('GET', '/api/level/levels_4/3')).data.level, gen.level);
    assert.strictEqual((await call('DELETE', '/api/level/levels_4/3')).status, 200);
    assert.strictEqual((await call('GET', '/api/levels/levels_4')).data.length, n0);
    assert.strictEqual(hash(lv(rootA, 'levels_4')), hash(lv(rootB, 'levels_4')));
  });
  await test('an unsolvable level can be saved (warning, not error)', async () => {
    const level = { gridWidth: 3, gridHeight: 1, grid: [[1, 1, 1]], difficulty: 1, arrows: [
      { points: [{ x: 0, y: 0 }, { x: 1, y: 0 }], exitDir: { x: 1, y: 0 } }, { points: [{ x: 2, y: 0 }], exitDir: { x: -1, y: 0 } } ] };
    const r = (await call('POST', '/api/level/levels_ch', { level })).data;
    assert.strictEqual(r.validation.solvable, false);
    assert.strictEqual((await call('DELETE', '/api/level/levels_ch/' + r.index)).status, 200);
  });
  await test('cannot delete the last level of a file', async () => {
    const n = (await call('GET', '/api/levels/levels_ch')).data.length;
    for (let i = n - 1; i >= 1; i--) await call('DELETE', '/api/level/levels_ch/' + i);
    assert.strictEqual((await call('DELETE', '/api/level/levels_ch/0')).status, 422);
  });

  console.log('Texts');
  await test('texts round-trip exactly and edits persist', async () => {
    const orig = fs.readFileSync(path.join(rootA, 'dat', 'm.xml'), 'utf8');
    const list = (await call('GET', '/api/texts')).data;
    assert.strictEqual((await call('PUT', '/api/texts', { texts: list })).status, 200);
    assert.strictEqual(fs.readFileSync(path.join(rootA, 'dat', 'm.xml'), 'utf8'), orig);
    list[0].values.en = 'Tap & <go> "now"';
    list.push({ id: 'NEW_TEXT', values: { en: 'Hello' } });
    assert.strictEqual((await call('PUT', '/api/texts', { texts: list })).status, 200);
    const back = (await call('GET', '/api/texts')).data;
    assert.strictEqual(back[0].values.en, 'Tap & <go> "now"');
    assert.strictEqual(back.length, 47);
    assert.strictEqual(fs.readFileSync(path.join(rootA, 'dat', 'm.xml'), 'utf8'), fs.readFileSync(path.join(rootB, 'dat', 'm.xml'), 'utf8'));
  });
  await test('bad text ids and duplicates are rejected', async () => {
    assert.strictEqual((await call('PUT', '/api/texts', { texts: [{ id: '"><x', values: { en: 'a' } }] })).status, 422);
    assert.strictEqual((await call('PUT', '/api/texts', { texts: [{ id: 'A', values: { en: 'a' } }, { id: 'A', values: { en: 'b' } }] })).status, 422);
  });

  console.log('Backups');
  await test('first change made a backup that restores the original', async () => {
    const list = (await call('GET', '/api/backups')).data;
    assert.ok(list.length >= 1);
    const b = list.find((x) => x.files.includes('dat/m.xml'));
    assert.ok(b, 'no m.xml backup');
    assert.strictEqual((await call('POST', '/api/backups/restore', { id: b.id, file: 'dat/m.xml' })).status, 200);
    assert.strictEqual((await call('GET', '/api/texts')).data.length, 46);
    assert.strictEqual((await call('POST', '/api/backups/restore', { id: '../..', file: 'dat/m.xml' })).status, 400);
    assert.strictEqual((await call('POST', '/api/backups/restore', { id: b.id, file: '../../server.js' })).status, 400);
  });
  await test('snapshot copies everything', async () => {
    assert.strictEqual((await call('POST', '/api/backups/snapshot')).status, 200);
    const snap = (await call('GET', '/api/backups')).data.find((x) => x.id.endsWith('-manual'));
    assert.strictEqual(snap.files.length, 10);
  });

  console.log('Logic');
  await test('generator makes solvable levels; resize protects arrows', () => {
    for (let s = 1; s <= 50; s++) { const v = T.validate(T.generateLevel(6 + (s % 9), 6 + (s % 7), { seed: s })); assert.ok(v.solvable && !v.errors.length, 'seed ' + s); }
    const L = T.generateLevel(8, 8, { seed: 7 });
    assert.ok(T.resizeLevel(L, 3, 3).error);
    assert.ok(T.resizeLevel(L, 12, 12).level);
  });

  server.kill();
  fs.rmSync(tmp, { recursive: true, force: true });
  console.log(`\n${passed} passed${process.exitCode ? ', some FAILED' : ''}`);
})();
