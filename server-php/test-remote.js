/*
 * Live API test for the deployed PHP admin. Only REVERSIBLE operations (insert then delete a level,
 * edit then restore a text), so run it as often as you like.
 *
 *   ARROW_ADMIN_PASSWORD=... node server-php/test-remote.js [domain] [server-ip]
 *
 * If the domain does not resolve yet, pass the server IP: the request goes to the IP with the right Host
 * header, and X-Forwarded-Proto: https is added (Cloudflare adds the same header for real visitors).
 */
const http = require('http');
const https = require('https');
const assert = require('assert');

const DOMAIN = process.argv[2];
const IP = process.argv[3] || '';
const PASSWORD = process.env.ARROW_ADMIN_PASSWORD;
if (!DOMAIN || !PASSWORD) {
  console.error('Usage: ARROW_ADMIN_PASSWORD=... node server-php/test-remote.js <domain> [server-ip]');
  process.exit(2);
}

let cookie = '';
let passed = 0;

function call(method, path, body, opts = {}) {
  return new Promise((resolve, reject) => {
    const payload = body === undefined ? null : JSON.stringify(body);
    const headers = {
      Host: opts.host || DOMAIN,
      ...(IP ? { 'X-Forwarded-Proto': 'https' } : {}),
      ...(opts.noHttps ? { 'X-Forwarded-Proto': '' } : {}),
      ...(opts.noCsrf ? {} : { 'X-Requested-With': 'arrow-admin' }),
      ...(cookie && !opts.noCookie ? { Cookie: cookie } : {}),
      ...(payload ? { 'Content-Type': 'application/json', 'Content-Length': Buffer.byteLength(payload) } : {}),
    };
    if (opts.noHttps) delete headers['X-Forwarded-Proto'];
    const mod = IP ? http : https;
    const req = mod.request({ host: IP || DOMAIN, port: IP ? 80 : 443, path: '/admin/api/' + path, method, headers }, (res) => {
      const chunks = [];
      res.on('data', (c) => chunks.push(c));
      res.on('end', () => {
        const set = res.headers['set-cookie'];
        if (set && !opts.noCookie) { const c = set[0].split(';')[0]; if (!c.endsWith('=')) cookie = c; }
        let data = null;
        try { data = JSON.parse(Buffer.concat(chunks).toString('utf8')); } catch { /* not json */ }
        resolve({ status: res.statusCode, data });
      });
    });
    req.on('error', reject);
    if (payload) req.write(payload);
    req.end();
  });
}
async function test(name, fn) {
  try { await fn(); passed++; console.log('  ok   ' + name); }
  catch (e) { console.log('  FAIL ' + name + '\n       ' + (e.message || e)); process.exitCode = 1; }
}

(async () => {
  console.log(`Target: ${DOMAIN}${IP ? ' via ' + IP : ''}`);
  console.log('Guards');
  await test('plain HTTP is refused (HTTPS required)', async () => assert.strictEqual((await call('GET', 'session', undefined, { noHttps: true })).status, 403));
  await test('foreign Host header never reaches the admin (403 from the app, or 404 from the web server)', async () => {
    const s = (await call('GET', 'session', undefined, { host: 'evil.example' })).status;
    assert.ok(s === 403 || s === 404, 'status ' + s);
  });
  await test('API is closed before login', async () => assert.strictEqual((await call('GET', 'overview', undefined, { noCookie: true })).status, 401));
  await test('writes without the CSRF header are refused', async () => assert.strictEqual((await call('POST', 'login', { password: PASSWORD }, { noCsrf: true })).status, 403));
  await test('wrong password is rejected', async () => assert.strictEqual((await call('POST', 'login', { password: 'definitely-wrong' })).status, 401));
  await test('correct password logs in', async () => { const r = await call('POST', 'login', { password: PASSWORD }); assert.strictEqual(r.status, 200); assert.ok(cookie, 'no session cookie'); });

  console.log('Reading');
  let totals;
  await test('overview: 9 files, 607 levels, none unsolvable, 46 texts', async () => {
    const { data } = await call('GET', 'overview');
    assert.strictEqual(data.files.length, 9);
    totals = data.files.reduce((n, f) => n + f.count, 0);
    assert.strictEqual(totals, 607);
    assert.strictEqual(data.files.reduce((n, f) => n + f.unsolvable, 0), 0);
    assert.strictEqual(data.texts, 46);
    assert.strictEqual(data.files.find((f) => f.file === 'levels_1').unused, 50);
  });
  await test('level list, single level, game-level mapping', async () => {
    const list = (await call('GET', 'levels/levels_0')).data;
    assert.strictEqual(list.length, 100);
    assert.strictEqual(list[2].game.level, 3);
    const one = (await call('GET', 'level/levels_0/2')).data;
    assert.strictEqual(one.level.gridWidth, 10);
    assert.ok(one.validation.solvable);
    assert.strictEqual((await call('GET', 'level/levels_0/999')).status, 404);
    assert.strictEqual((await call('GET', 'levels/levels_99')).status, 404);
  });

  console.log('Writing (reversible)');
  await test('saving an unchanged level is accepted and changes nothing', async () => {
    const { level } = (await call('GET', 'level/levels_0/5')).data;
    assert.strictEqual((await call('PUT', 'level/levels_0/5', { level })).status, 200);
    assert.deepStrictEqual((await call('GET', 'level/levels_0/5')).data.level, level);
  });
  await test('invalid levels are rejected (probed on the challenge file, auto-cleaned if wrongly accepted)', async () => {
    const { level } = (await call('GET', 'level/levels_0/0')).data;
    const clone = () => JSON.parse(JSON.stringify(level));
    const outside = clone(); outside.arrows[0].points[1] = { x: 9, y: 9 };
    const overlap = clone(); overlap.arrows[1].points[0] = overlap.arrows[0].points[0];
    const badExit = clone(); badExit.arrows[0].exitDir = { x: 1, y: 1 };
    const badCell = clone(); badCell.grid[0][0] = 7;
    const cases = { outside, overlap, badExit, badCell, missing: { gridWidth: 3 }, notObject: 'x', noArrows: { gridWidth: 2, gridHeight: 2, grid: [[1, 1], [1, 1]] } };
    const accepted = [];
    for (const [name, lv] of Object.entries(cases)) {
      const n = (await call('GET', 'levels/levels_ch')).data.length;
      const r = await call('POST', 'level/levels_ch', { level: lv });
      if (r.status === 200) { accepted.push(name); await call('DELETE', 'level/levels_ch/' + n); }
    }
    assert.deepStrictEqual(accepted, [], 'wrongly accepted: ' + accepted.join(', '));
  });
  await test('generate -> insert -> move -> delete restores the file', async () => {
    const n0 = (await call('GET', 'levels/levels_ch')).data.length;
    const gen = (await call('POST', 'generate', { w: 9, h: 9, minLen: 3, maxLen: 8, fill: 0.9, difficulty: 3 })).data;
    assert.ok(gen.validation.solvable && !gen.validation.errors.length);
    const ins = (await call('POST', 'level/levels_ch', { level: gen.level })).data;
    assert.strictEqual(ins.index, n0);
    assert.strictEqual((await call('POST', `level/levels_ch/${n0}/move`, { to: 0 })).status, 200);
    assert.deepStrictEqual((await call('GET', 'level/levels_ch/0')).data.level, gen.level);
    assert.strictEqual((await call('DELETE', 'level/levels_ch/0')).status, 200);
    assert.strictEqual((await call('GET', 'levels/levels_ch')).data.length, n0);
  });
  await test('generator: 25 random sizes all solvable', async () => {
    for (let s = 0; s < 25; s++) {
      const g = (await call('POST', 'generate', { w: 5 + (s % 12), h: 5 + ((s * 3) % 11) })).data;
      assert.ok(g.validation.solvable && !g.validation.errors.length, 'size ' + (5 + (s % 12)));
    }
  });
  await test('an unsolvable level can be saved with a warning, then removed', async () => {
    const level = { gridWidth: 3, gridHeight: 1, grid: [[1, 1, 1]], difficulty: 1, arrows: [
      { points: [{ x: 0, y: 0 }, { x: 1, y: 0 }], exitDir: { x: 1, y: 0 } }, { points: [{ x: 2, y: 0 }], exitDir: { x: -1, y: 0 } }] };
    const r = (await call('POST', 'level/levels_ch', { level })).data;
    assert.strictEqual(r.validation.solvable, false);
    assert.strictEqual((await call('DELETE', 'level/levels_ch/' + r.index)).status, 200);
  });

  console.log('Texts and backups');
  await test('texts: unchanged save, edit, restore from backup', async () => {
    const orig = (await call('GET', 'texts')).data;
    assert.strictEqual(orig.length, 46);
    assert.strictEqual((await call('PUT', 'texts', { texts: orig })).status, 200);
    const edited = JSON.parse(JSON.stringify(orig));
    edited[0].values.en = 'Tap & <go> "now"';
    assert.strictEqual((await call('PUT', 'texts', { texts: edited })).status, 200);
    assert.strictEqual((await call('GET', 'texts')).data[0].values.en, 'Tap & <go> "now"');
    const backups = (await call('GET', 'backups')).data;
    const b = backups.find((x) => x.files.includes('dat/m.xml'));
    assert.ok(b, 'no m.xml backup');
    assert.strictEqual((await call('POST', 'backups/restore', { id: b.id, file: 'dat/m.xml' })).status, 200);
    assert.deepStrictEqual((await call('GET', 'texts')).data, orig);
  });
  await test('bad text ids / duplicate ids / bad backup refs are rejected', async () => {
    assert.strictEqual((await call('PUT', 'texts', { texts: [{ id: '"><x', values: { en: 'a' } }] })).status, 422);
    assert.strictEqual((await call('PUT', 'texts', { texts: [{ id: 'A', values: { en: 'a' } }, { id: 'A', values: { en: 'b' } }] })).status, 422);
    assert.strictEqual((await call('POST', 'backups/restore', { id: '../..', file: 'dat/m.xml' })).status, 400);
    assert.strictEqual((await call('POST', 'backups/restore', { id: 'x', file: '../../_private/config.php' })).status, 400);
  });
  await test('logout closes the session', async () => {
    assert.strictEqual((await call('POST', 'logout')).status, 200);
    assert.strictEqual((await call('GET', 'overview')).status, 401);
  });

  console.log(`\n${passed} passed${process.exitCode ? ', some FAILED' : ''}`);
})();
