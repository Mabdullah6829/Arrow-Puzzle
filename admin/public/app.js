'use strict';
const T = LevelTools;
const $ = (s, r = document) => r.querySelector(s);
const $$ = (s, r = document) => [...r.querySelectorAll(s)];

/** Tiny DOM builder. Text always goes through textContent, never innerHTML. */
function h(tag, attrs, ...kids) {
  const e = document.createElement(tag);
  for (const [k, v] of Object.entries(attrs || {})) {
    if (k === 'class') e.className = v;
    else if (k.startsWith('on')) e.addEventListener(k.slice(2), v);
    else if (v === true) e.setAttribute(k, '');
    else if (v !== false && v != null) e.setAttribute(k, v);
  }
  for (const kid of kids.flat()) if (kid != null && kid !== false) e.append(kid.nodeType ? kid : document.createTextNode(String(kid)));
  return e;
}

async function api(method, url, body) {
  const res = await fetch(url, {
    method,
    headers: { 'Content-Type': 'application/json', 'X-Requested-With': 'arrow-admin' },
    body: body === undefined ? undefined : JSON.stringify(body),
  });
  let data = {};
  try { data = await res.json(); } catch { /* empty body */ }
  if (res.status === 401 && url !== 'api/login') showLogin();
  if (!res.ok) throw new Error(data.error || `Request failed (${res.status})`);
  return data;
}

function toast(msg, isErr) {
  const t = h('div', { class: 'toast' + (isErr ? ' err' : ''), role: isErr ? 'alert' : 'status' }, msg);
  $('#toasts').append(t);
  setTimeout(() => t.remove(), isErr ? 7000 : 3500);
}
const guard = (fn) => async (...a) => { try { return await fn(...a); } catch (e) { toast(e.message, true); } };

/** Modal dialog. `body` is a DOM node; resolves true when OK is pressed. */
function modal(title, body, okLabel = 'OK') {
  const dlg = $('#dlg');
  $('#dlg-title').textContent = title;
  $('#dlg-body').replaceChildren(body);
  $('#dlg-ok').textContent = okLabel;
  return new Promise((resolve) => {
    dlg.addEventListener('close', () => resolve(dlg.returnValue === 'ok'), { once: true });
    dlg.returnValue = 'cancel';
    dlg.showModal();
  });
}
const confirmBox = (title, text, okLabel) => modal(title, h('p', {}, text), okLabel);

// ------------------------------------------------------------------ session / tabs
function showLogin() {
  $('#app').hidden = true;
  $('#login').hidden = false;
  $('#pw').value = '';
  $('#pw').focus();
}
async function showApp() {
  $('#login').hidden = true;
  $('#app').hidden = false;
  await showTab('overview');
}
$('#login-form').addEventListener('submit', async (e) => {
  e.preventDefault();
  $('#login-error').textContent = '';
  try {
    await api('POST', 'api/login', { password: $('#pw').value });
    await showApp();
  } catch (err) {
    $('#login-error').textContent = err.message;
  }
});
$('#logout').addEventListener('click', async () => { await api('POST', 'api/logout').catch(() => {}); showLogin(); });

let currentTab = 'overview';
async function showTab(name) {
  if (name !== currentTab && !(await leaveGuard())) return;
  currentTab = name;
  $$('#tabs button').forEach((b) => b.classList.toggle('active', b.dataset.tab === name));
  $$('.tab').forEach((s) => (s.hidden = s.id !== 'tab-' + name));
  await guard({ overview: loadOverview, levels: loadLevelsTab, texts: loadTexts, backups: loadBackups }[name])();
}
$('#tabs').addEventListener('click', (e) => { const b = e.target.closest('button'); if (b) showTab(b.dataset.tab); });

async function leaveGuard() {
  if (currentTab === 'levels' && isDirty()) return confirmBox('Unsaved level', 'This level has unsaved changes. Discard them?', 'Discard');
  if (currentTab === 'texts' && textsDirty()) return confirmBox('Unsaved texts', 'Your text edits are not saved. Discard them?', 'Discard');
  return true;
}
window.addEventListener('beforeunload', (e) => { if (isDirty() || textsDirty()) e.preventDefault(); });

// ------------------------------------------------------------------ overview
const DIFF_COLORS = { 1: 'var(--good)', 2: 'var(--warn)', 3: 'var(--bad)', null: 'var(--muted)' };
async function loadOverview() {
  const o = await api('GET', 'api/overview');
  const sum = (k) => o.files.reduce((n, f) => n + f[k], 0);
  $('#stats').replaceChildren(
    ...[
      ['Levels', sum('count')], ['Arrows', sum('arrows')], ['Unsolvable', sum('unsolvable')],
      ['Game texts', o.texts], ['Backups', o.backups],
    ].map(([label, n]) => h('div', { class: 'stat' }, h('span', { class: 'muted small' }, label), h('b', {}, n.toLocaleString()))),
  );
  $('#file-cards').replaceChildren(
    ...o.files.map((f) =>
      h('button', { class: 'file-card', onclick: () => { state.file = f.file; showTab('levels'); } },
        h('h3', {}, f.file === 'levels_ch' ? 'Challenge levels' : f.file,
          f.unsolvable ? h('span', { class: 'badge bad' }, f.unsolvable + ' unsolvable') : h('span', { class: 'badge good' }, 'all solvable')),
        h('div', { class: 'muted small' }, `${f.count} levels, ${f.arrows.toLocaleString()} arrows`),
        h('div', { class: 'bar', title: 'Difficulty mix' },
          Object.entries(f.diffs).map(([d, n]) => h('i', { style: `width:${(n / f.count) * 100}%;background:${DIFF_COLORS[d] || DIFF_COLORS.null}` }))),
        h('div', { class: 'muted small' }, 'Difficulty ' + Object.entries(f.diffs).map(([d, n]) => `${d === 'null' ? '?' : d}: ${n}`).join('  '),
          f.unused ? `  |  ${f.unused} never reached in game` : '')),
    ),
  );
  $('#roots').textContent = 'Saving writes to: ' + o.roots.join('  and  ');
}

// ------------------------------------------------------------------ levels: state
const state = {
  file: 'levels_0', files: [], list: [], idx: null, level: null, orig: '', isNew: null,
  tool: 'select', brush: 1, selected: null, history: [], future: [], path: null, hover: null,
  painting: false, play: null, flash: new Map(),
};
const isDirty = () => !!state.level && (state.isNew || JSON.stringify(state.level) !== state.orig);

async function loadLevelsTab() {
  if (!state.files.length) state.files = (await api('GET', 'api/overview')).files.map((f) => f.file);
  $('#file-select').replaceChildren(...state.files.map((f) => h('option', { value: f }, f === 'levels_ch' ? 'levels_ch (challenge)' : f)));
  $('#file-select').value = state.file;
  await loadList();
}
async function loadList() {
  state.list = await api('GET', `api/levels/${state.file}`);
  renderList();
}
function renderList() {
  const only = $('#only-problems').checked;
  const rows = state.list.filter((l) => !only || !l.ok || l.game.unused);
  $('#level-list').replaceChildren(
    ...rows.map((l) => {
      const g = l.game.unused ? 'unused' : l.game.challenge ? 'chal.' : l.game.level;
      const dotTitle = !l.ok ? 'Not solvable or invalid' : l.game.unused ? 'Never loaded by the game (index 50 or higher)' : 'Solvable';
      return h('button', { class: 'lrow' + (l.i === state.idx && !state.isNew ? ' sel' : ''), role: 'option', onclick: () => openLevel(l.i) },
        h('span', {}, l.i + 1), h('span', {}, g), h('span', {}, `${l.w}x${l.h}`), h('span', {}, l.arrows), h('span', {}, l.difficulty ?? '?'),
        h('span', { class: 'dot' + (!l.ok ? ' bad' : l.game.unused ? ' unused' : ''), title: dotTitle }));
    }),
  );
}
$('#file-select').addEventListener('change', guard(async (e) => {
  if (!(await leaveGuard())) { e.target.value = state.file; return; }
  state.file = e.target.value;
  closeEditor();
  await loadList();
}));
$('#only-problems').addEventListener('change', renderList);

function closeEditor() {
  state.level = null; state.idx = null; state.isNew = null; state.orig = '';
  $('#editor').hidden = true;
  $('#editor-empty').hidden = false;
}

const openLevel = guard(async (i) => {
  if (state.idx === i && !state.isNew && state.level) return;
  if (!(await leaveGuard())) return;
  const r = await api('GET', `api/level/${state.file}/${i}`);
  loadIntoEditor(r.level, i, null);
});
function loadIntoEditor(level, idx, isNew) {
  state.level = JSON.parse(JSON.stringify(level));
  state.idx = idx;
  state.isNew = isNew;
  state.orig = isNew ? '' : JSON.stringify(state.level);
  state.selected = null; state.history = []; state.future = []; state.path = null; state.play = null;
  setTool('select');
  $('#editor').hidden = false;
  $('#editor-empty').hidden = true;
  renderList();
  refresh(true);
}

// ------------------------------------------------------------------ levels: editing helpers
function snapshot() {
  state.history.push(JSON.stringify(state.level));
  if (state.history.length > 200) state.history.shift();
  state.future = [];
}
function undo() {
  if (!state.history.length) return;
  state.future.push(JSON.stringify(state.level));
  state.level = JSON.parse(state.history.pop());
  state.selected = null;
  refresh();
}
function redo() {
  if (!state.future.length) return;
  state.history.push(JSON.stringify(state.level));
  state.level = JSON.parse(state.future.pop());
  state.selected = null;
  refresh();
}
const arrowAt = (x, y) => state.level.arrows.findIndex((a) => a.points.some((p) => p.x === x && p.y === y));
const dirKey = (d) => `${d.x},${d.y}`;

function chooseExit(points, excludeIndex) {
  // Prefer the direction that continues away from the body, then any direction that is free right now.
  // excludeIndex: an existing arrow being replaced (e.g. flipped), so its old copy does not block the new one.
  const others = state.level.arrows.filter((_, i) => i !== excludeIndex);
  const L = { ...state.level, arrows: [...others, { points, exitDir: { x: 1, y: 0 } }] };
  const me = L.arrows.length - 1;
  const away = points.length > 1 ? { x: points[0].x - points[1].x, y: points[0].y - points[1].y } : { x: -1, y: 0 };
  const order = [away, ...T.DIRS.filter((d) => dirKey(d) !== dirKey(away))];
  for (const d of order) {
    L.arrows[me].exitDir = d;
    if (T.blocker(L, T.buildOcc(L.arrows), me) === -1) return d;
  }
  return away;
}

let msgTimer;
function refresh(full) {
  const L = state.level;
  if (!L) return;
  const v = T.validate(L);
  state.validation = v;
  const loc = state.isNew ? 'New level (not saved yet)' : `${state.file} #${state.idx + 1}`;
  const g = state.isNew ? null : T.gameLevelFor(state.file, state.idx);
  $('#editor-title').textContent = loc + (g ? (g.unused ? '  -  never loaded by the game' : g.challenge ? '  -  challenge level' : `  -  in game: level ${g.level}`) : '');
  $('#dirty').hidden = !isDirty();
  $('#in-w').value = L.gridWidth;
  $('#in-h').value = L.gridHeight;
  $('#in-diff').value = String(L.difficulty ?? 1);
  $('#in-move').max = state.list.length;
  $('#in-move').value = state.isNew ? '' : state.idx + 1;
  $('#btn-undo').disabled = !state.history.length;
  $('#btn-redo').disabled = !state.future.length;
  const sel = state.selected != null ? L.arrows[state.selected] : null;
  $$('#dirs button').forEach((b) => { b.disabled = !sel || state.tool === 'play'; b.classList.toggle('active', !!sel && b.dataset.dir === dirKey(sel.exitDir)); });
  $('#btn-flip').disabled = !sel || sel.points.length < 2;
  $('#btn-del-arrow').disabled = !sel;
  $('#btn-save').disabled = v.errors.length > 0;
  $('#btn-dup').disabled = !!state.isNew;
  $('#btn-move').disabled = !!state.isNew;
  $('#btn-del').disabled = !!state.isNew;
  $('#btn-revert').disabled = !isDirty();
  const msgs = [
    ...v.errors.map((m) => h('div', { class: 'msg err' }, m)),
    ...v.warnings.map((m) => h('div', { class: 'msg warn' }, m)),
  ];
  if (!v.errors.length && v.solvable && L.arrows.length) msgs.push(h('div', { class: 'msg ok' }, `Solvable. ${L.arrows.length} arrows, cleared in ${v.order.length} moves.`));
  $('#messages').replaceChildren(...msgs);
  draw();
}

// ------------------------------------------------------------------ canvas
const board = $('#board');
const ctx = board.getContext('2d');
let cell = 24;
const css = (n) => getComputedStyle(document.documentElement).getPropertyValue(n).trim();
const arrowColor = (i) => `hsl(${(i * 47) % 360} 68% 52%)`;

function draw() {
  const L = state.level;
  if (!L) return;
  const wrapW = Math.max(200, $('#canvas-wrap').clientWidth - 22);
  const maxH = Math.max(260, window.innerHeight * 0.68);
  cell = Math.max(10, Math.min(46, Math.floor(Math.min(wrapW / L.gridWidth, maxH / L.gridHeight))));
  const W = L.gridWidth * cell;
  const H = L.gridHeight * cell;
  const dpr = window.devicePixelRatio || 1;
  board.width = W * dpr; board.height = H * dpr;
  board.style.width = W + 'px'; board.style.height = H + 'px';
  ctx.setTransform(dpr, 0, 0, dpr, 0, 0);
  ctx.clearRect(0, 0, W, H);

  ctx.fillStyle = css('--board');
  ctx.fillRect(0, 0, W, H);
  for (let y = 0; y < L.gridHeight; y++) {
    for (let x = 0; x < L.gridWidth; x++) {
      const v = L.grid[y][x];
      if (v === -1) { ctx.fillStyle = css('--cell-void'); ctx.fillRect(x * cell, y * cell, cell, cell); }
      else if (v === 1) { ctx.fillStyle = css('--cell-dot'); ctx.beginPath(); ctx.arc((x + 0.5) * cell, (y + 0.5) * cell, cell * 0.07, 0, 7); ctx.fill(); }
    }
  }
  const playing = state.tool === 'play' && state.play;
  const now = performance.now();
  L.arrows.forEach((a, i) => {
    if (playing && !state.play.alive.has(i)) return;
    const flashing = (state.flash.get(i) || 0) > now;
    const col = flashing ? '#ff3b4f' : arrowColor(i);
    const c = (p) => [(p.x + 0.5) * cell, (p.y + 0.5) * cell];
    if (state.selected === i && !playing) {
      ctx.strokeStyle = css('--text'); ctx.lineWidth = cell * 0.5; ctx.globalAlpha = 0.25; tracePath(a.points, c); ctx.stroke(); ctx.globalAlpha = 1;
    }
    ctx.strokeStyle = col; ctx.lineWidth = Math.max(3, cell * 0.28); ctx.lineCap = 'round'; ctx.lineJoin = 'round';
    tracePath(a.points, c); ctx.stroke();
    // arrow head at points[0], pointing along exitDir
    const [hx, hy] = c(a.points[0]);
    const d = a.exitDir;
    ctx.fillStyle = col;
    ctx.beginPath();
    ctx.moveTo(hx + d.x * cell * 0.46, hy + d.y * cell * 0.46);
    ctx.lineTo(hx - d.x * cell * 0.04 + d.y * cell * 0.3, hy - d.y * cell * 0.04 + d.x * cell * 0.3);
    ctx.lineTo(hx - d.x * cell * 0.04 - d.y * cell * 0.3, hy - d.y * cell * 0.04 - d.x * cell * 0.3);
    ctx.closePath(); ctx.fill();
  });
  // exit line of the selected arrow: green when free, red when something blocks it
  if (state.selected != null && !playing && L.arrows[state.selected]) {
    const a = L.arrows[state.selected];
    const blocked = T.blocker(L, T.buildOcc(L.arrows), state.selected) !== -1;
    const hx = (a.points[0].x + 0.5) * cell, hy = (a.points[0].y + 0.5) * cell;
    ctx.strokeStyle = blocked ? css('--bad') : css('--good');
    ctx.lineWidth = 2; ctx.setLineDash([5, 4]);
    ctx.beginPath(); ctx.moveTo(hx + a.exitDir.x * cell * 0.5, hy + a.exitDir.y * cell * 0.5);
    ctx.lineTo(hx + a.exitDir.x * W * 2, hy + a.exitDir.y * H * 2); ctx.stroke(); ctx.setLineDash([]);
  }
  if (state.path && state.path.length) {
    ctx.strokeStyle = css('--accent'); ctx.lineWidth = Math.max(3, cell * 0.28); ctx.lineCap = 'round'; ctx.lineJoin = 'round'; ctx.globalAlpha = 0.8;
    tracePath(state.path, (p) => [(p.x + 0.5) * cell, (p.y + 0.5) * cell]); ctx.stroke(); ctx.globalAlpha = 1;
  }
  if (state.hover && !playing) {
    ctx.strokeStyle = css('--accent'); ctx.lineWidth = 2;
    ctx.strokeRect(state.hover.x * cell + 1, state.hover.y * cell + 1, cell - 2, cell - 2);
  }
}
function tracePath(points, c) {
  ctx.beginPath();
  points.forEach((p, k) => { const [x, y] = c(p); if (k) ctx.lineTo(x, y); else ctx.moveTo(x, y); });
  if (points.length === 1) { const [x, y] = c(points[0]); ctx.lineTo(x + 0.01, y); }
}
window.addEventListener('resize', () => draw());

function cellFrom(e) {
  const r = board.getBoundingClientRect();
  const x = Math.floor(((e.clientX - r.left) / r.width) * state.level.gridWidth);
  const y = Math.floor(((e.clientY - r.top) / r.height) * state.level.gridHeight);
  return x >= 0 && y >= 0 && x < state.level.gridWidth && y < state.level.gridHeight ? { x, y } : null;
}

board.addEventListener('pointerdown', (e) => {
  if (!state.level) return;
  const c = cellFrom(e);
  if (!c) return;
  board.setPointerCapture(e.pointerId);
  if (state.tool === 'select') {
    const i = arrowAt(c.x, c.y);
    state.selected = i === -1 ? null : i;
    refresh();
  } else if (state.tool === 'draw') {
    if (arrowAt(c.x, c.y) === -1) { state.path = [c]; draw(); }
    else toast('Start on an empty cell: that is the arrow tip.', true);
  } else if (state.tool === 'paint') {
    state.painting = true;
    snapshot();
    paintCell(c);
  } else if (state.tool === 'play') {
    playClick(arrowAt(c.x, c.y));
  }
});
board.addEventListener('pointermove', (e) => {
  if (!state.level) return;
  const c = cellFrom(e);
  const moved = !state.hover || !c || state.hover.x !== c.x || state.hover.y !== c.y;
  state.hover = c;
  if (c && moved) {
    if (state.tool === 'draw' && state.path) extendPath(c);
    if (state.tool === 'paint' && state.painting) paintCell(c);
    draw();
  }
});
board.addEventListener('pointerleave', () => { state.hover = null; draw(); });
const endPointer = () => {
  if (state.tool === 'draw' && state.path) {
    const pts = state.path;
    state.path = null;
    if (pts.length >= 2) {
      snapshot();
      state.level.arrows.push({ points: pts.map((p) => ({ x: p.x, y: p.y })), exitDir: chooseExit(pts) });
      state.selected = state.level.arrows.length - 1;
    } else if (pts.length === 1) toast('Drag across at least two cells to draw an arrow.', true);
    refresh();
  }
  if (state.painting) { state.painting = false; refresh(); }
};
board.addEventListener('pointerup', endPointer);
board.addEventListener('pointercancel', () => { state.path = null; state.painting = false; draw(); });

function extendPath(c) {
  const path = state.path;
  const inPath = (x, y) => path.some((p) => p.x === x && p.y === y);
  for (let guardN = 0; guardN < 200; guardN++) {
    const last = path[path.length - 1];
    if (last.x === c.x && last.y === c.y) return;
    if (path.length >= 2 && path[path.length - 2].x === c.x && path[path.length - 2].y === c.y) { path.pop(); continue; }
    const dx = c.x - last.x, dy = c.y - last.y;
    const step = Math.abs(dx) >= Math.abs(dy) ? { x: Math.sign(dx), y: 0 } : { x: 0, y: Math.sign(dy) };
    const nx = last.x + step.x, ny = last.y + step.y;
    if (inPath(nx, ny) || arrowAt(nx, ny) !== -1) return;
    path.push({ x: nx, y: ny });
  }
}
function paintCell(c) {
  const g = state.level.grid;
  if (g[c.y][c.x] === state.brush) return;
  g[c.y][c.x] = state.brush;
  draw();
  $('#dirty').hidden = false;
}

// ------------------------------------------------------------------ tools
function setTool(t) {
  state.tool = t;
  state.path = null;
  $$('#tools button').forEach((b) => b.classList.toggle('active', b.dataset.tool === t));
  $('#brushes').hidden = t !== 'paint';
  $('#play-bar').hidden = t !== 'play';
  board.style.cursor = t === 'play' ? 'pointer' : t === 'select' ? 'default' : 'crosshair';
  if (t === 'play') resetPlay();
  if (state.level) refresh();
}
$('#tools').addEventListener('click', (e) => { const b = e.target.closest('button'); if (b) setTool(b.dataset.tool); });
$('#brushes').addEventListener('click', (e) => {
  const b = e.target.closest('button');
  if (!b) return;
  state.brush = Number(b.dataset.brush);
  $$('#brushes button').forEach((x) => x.classList.toggle('active', x === b));
});
function setExit(d) {
  const a = state.level.arrows[state.selected];
  if (!a || dirKey(a.exitDir) === dirKey(d)) return;
  snapshot();
  a.exitDir = { x: d.x, y: d.y };
  refresh();
}
$('#dirs').addEventListener('click', (e) => {
  const b = e.target.closest('button');
  if (!b || b.disabled) return;
  const [x, y] = b.dataset.dir.split(',').map(Number);
  setExit({ x, y });
});
$('#btn-flip').addEventListener('click', () => {
  const a = state.level.arrows[state.selected];
  if (!a) return;
  snapshot();
  a.points.reverse();
  a.exitDir = chooseExit(a.points, state.selected);
  refresh();
});
function deleteSelectedArrow() {
  if (state.selected == null) return;
  snapshot();
  state.level.arrows.splice(state.selected, 1);
  state.selected = null;
  refresh();
}
$('#btn-del-arrow').addEventListener('click', deleteSelectedArrow);
$('#btn-undo').addEventListener('click', undo);
$('#btn-redo').addEventListener('click', redo);

// ---- play test
function resetPlay() {
  state.play = { alive: new Set(state.level.arrows.map((_, i) => i)), moves: 0, auto: null };
  updatePlayStatus();
  draw();
}
function updatePlayStatus() {
  const p = state.play;
  if (!p) return;
  $('#play-status').textContent = p.alive.size ? `${p.alive.size} arrows left, ${p.moves} moves. Click an arrow to send it out.` : `Cleared in ${p.moves} moves.`;
}
function playClick(i) {
  const p = state.play;
  if (!p || i === -1 || !p.alive.has(i)) return;
  const b = T.blocker(state.level, T.buildOcc(state.level.arrows, p.alive), i);
  if (b === -1) { p.alive.delete(i); p.moves++; }
  else { state.flash.set(i, performance.now() + 450); state.flash.set(b, performance.now() + 450); setTimeout(draw, 470); }
  updatePlayStatus();
  draw();
}
$('#btn-play-reset').addEventListener('click', () => { clearInterval(state.play && state.play.auto); resetPlay(); });
$('#btn-play-auto').addEventListener('click', () => {
  resetPlay();
  const v = T.validate(state.level);
  if (!v.solvable) return toast('This level has no solution.', true);
  let k = 0;
  state.play.auto = setInterval(() => {
    if (state.tool !== 'play' || k >= v.order.length) return clearInterval(state.play && state.play.auto);
    playClick(v.order[k++]);
  }, 260);
});

// ------------------------------------------------------------------ level properties and actions
$('#btn-resize').addEventListener('click', () => {
  const w = Number($('#in-w').value), hgt = Number($('#in-h').value);
  if (!Number.isInteger(w) || !Number.isInteger(hgt) || w < 1 || hgt < 1 || w > T.MAX_GRID || hgt > T.MAX_GRID) return toast(`Size must be 1-${T.MAX_GRID}`, true);
  const r = T.resizeLevel(state.level, w, hgt);
  if (r.error) return toast(r.error, true);
  snapshot();
  state.level = r.level;
  refresh();
});
$('#in-diff').addEventListener('change', (e) => { snapshot(); state.level.difficulty = Number(e.target.value); refresh(); });

$('#btn-save').addEventListener('click', guard(async () => {
  const v = T.validate(state.level);
  if (v.errors.length) return toast('Fix the errors first.', true);
  if (!v.solvable && !(await confirmBox('Level is not solvable', 'Players could get stuck. Save anyway?', 'Save anyway'))) return;
  if (state.isNew) {
    const at = state.isNew.at;
    const r = await api('POST', `api/level/${state.file}`, { level: state.level, at });
    await loadList();
    state.isNew = null; state.idx = r.index;
  } else {
    await api('PUT', `api/level/${state.file}/${state.idx}`, { level: state.level });
    await loadList();
  }
  state.orig = JSON.stringify(state.level);
  state.history = []; state.future = [];
  toast('Saved. The game files were updated.');
  renderList();
  refresh();
}));
$('#btn-revert').addEventListener('click', async () => {
  if (!(await confirmBox('Revert changes', 'Throw away your edits to this level?', 'Revert'))) return;
  if (state.isNew) return closeEditor();
  loadIntoEditor(JSON.parse(state.orig), state.idx, null);
});
$('#btn-dup').addEventListener('click', guard(async () => {
  if (!(await leaveGuard())) return;
  loadIntoEditor(state.level, state.idx, { at: state.idx + 1 });
  toast('Copy created. Edit it and press Save to insert it after the original.');
}));
$('#btn-del').addEventListener('click', guard(async () => {
  if (!(await confirmBox('Delete level', `Delete ${state.file} #${state.idx + 1}? Every later level shifts down by one in the game. A backup is kept.`, 'Delete'))) return;
  await api('DELETE', `api/level/${state.file}/${state.idx}`);
  closeEditor();
  await loadList();
  toast('Level deleted.');
}));
$('#btn-move').addEventListener('click', guard(async () => {
  const to = Number($('#in-move').value) - 1;
  if (!Number.isInteger(to) || to < 0 || to >= state.list.length) return toast('Position out of range', true);
  if (to === state.idx) return;
  if (isDirty() && !(await confirmBox('Unsaved changes', 'Moving reloads the level from disk and drops unsaved edits.', 'Continue'))) return;
  const r = await api('POST', `api/level/${state.file}/${state.idx}/move`, { to });
  await loadList();
  const lvl = await api('GET', `api/level/${state.file}/${r.index}`);
  loadIntoEditor(lvl.level, r.index, null);
  toast('Level moved.');
}));

function numField(label, id, val, min, max) {
  return h('label', {}, label, h('input', { id, type: 'number', value: val, min, max, required: true }));
}
$('#btn-new').addEventListener('click', guard(async () => {
  if (!(await leaveGuard())) return;
  const body = h('div', { class: 'formgrid' }, numField('Width', 'f-w', 8, 1, T.MAX_GRID), numField('Height', 'f-h', 8, 1, T.MAX_GRID));
  if (!(await modal('New blank level', body, 'Create'))) return;
  const w = Number($('#f-w').value), hh = Number($('#f-h').value);
  if (!(w >= 1 && hh >= 1 && w <= T.MAX_GRID && hh <= T.MAX_GRID)) return toast('Invalid size', true);
  loadIntoEditor(T.blankLevel(w, hh), null, { at: state.list.length });
}));
$('#btn-gen').addEventListener('click', guard(async () => {
  if (!(await leaveGuard())) return;
  const body = h('div', { class: 'formgrid' },
    numField('Width', 'f-w', 10, 3, 40), numField('Height', 'f-h', 10, 3, 40),
    numField('Min arrow length', 'f-min', 3, 2, 40), numField('Max arrow length', 'f-max', 10, 2, 40),
    h('label', {}, 'Fill %', h('input', { id: 'f-fill', type: 'number', value: 90, min: 20, max: 98 })),
    h('label', {}, 'Difficulty', h('select', { id: 'f-diff' }, [1, 2, 3].map((d) => h('option', { value: d }, d)))));
  if (!(await modal('Generate a random solvable level', body, 'Generate'))) return;
  const r = await api('POST', 'api/generate', {
    w: Number($('#f-w').value), h: Number($('#f-h').value), minLen: Number($('#f-min').value), maxLen: Number($('#f-max').value),
    fill: Number($('#f-fill').value) / 100, difficulty: Number($('#f-diff').value),
  });
  loadIntoEditor(r.level, null, { at: state.list.length });
  toast('Generated. Review it, then Save to add it to the end of ' + state.file + '.');
}));

document.addEventListener('keydown', (e) => {
  if (currentTab !== 'levels' || !state.level || $('#dlg').open) return;
  const typing = /^(INPUT|SELECT|TEXTAREA)$/.test(document.activeElement.tagName);
  const mod = e.ctrlKey || e.metaKey;
  if (mod && e.key.toLowerCase() === 'z') { e.preventDefault(); e.shiftKey ? redo() : undo(); return; }
  if (mod && e.key.toLowerCase() === 'y') { e.preventDefault(); redo(); return; }
  if (mod && e.key.toLowerCase() === 's') { e.preventDefault(); $('#btn-save').click(); return; }
  if (typing) return;
  const keyTool = { s: 'select', d: 'draw', p: 'paint', t: 'play' }[e.key.toLowerCase()];
  if (keyTool && !mod) return setTool(keyTool);
  if ((e.key === 'Delete' || e.key === 'Backspace') && state.tool !== 'play') { e.preventDefault(); deleteSelectedArrow(); }
  const arrowKeys = { ArrowLeft: [-1, 0], ArrowRight: [1, 0], ArrowUp: [0, -1], ArrowDown: [0, 1] }[e.key];
  if (arrowKeys && state.selected != null && state.tool !== 'play') { e.preventDefault(); setExit({ x: arrowKeys[0], y: arrowKeys[1] }); }
  if (e.key === 'Escape') { state.path = null; state.selected = null; refresh(); }
});

// ------------------------------------------------------------------ texts
let texts = [];
let textsOrig = '';
const textsDirty = () => !!textsOrig && JSON.stringify(texts) !== textsOrig;
async function loadTexts() {
  texts = await api('GET', 'api/texts');
  textsOrig = JSON.stringify(texts);
  renderTexts();
}
const textLangs = () => [...new Set(['en', ...texts.flatMap((t) => Object.keys(t.values))])];
function renderTexts() {
  const q = $('#text-search').value.trim().toLowerCase();
  const langs = textLangs();
  const origById = new Map(JSON.parse(textsOrig || '[]').map((t) => [t.id, JSON.stringify(t.values)]));
  $('#texts-head').replaceChildren(h('tr', {}, h('th', {}, 'ID'), langs.map((l) => h('th', {}, l.toUpperCase())), h('th', {})));
  $('#texts-body').replaceChildren(
    ...texts.filter((t) => !q || t.id.toLowerCase().includes(q) || Object.values(t.values).some((v) => v.toLowerCase().includes(q))).map((t) => {
      const tr = h('tr', { class: origById.get(t.id) !== JSON.stringify(t.values) ? 'changed' : '' },
        h('td', { class: 'id' }, t.id),
        langs.map((l) => h('td', {}, h('input', {
          class: 'text', value: t.values[l] ?? '', 'aria-label': `${t.id} (${l})`,
          oninput: (e) => {
            if (e.target.value !== '' || l in t.values) t.values[l] = e.target.value;
            tr.classList.toggle('changed', origById.get(t.id) !== JSON.stringify(t.values));
          },
        }))),
        h('td', { class: 'act' }, h('button', { class: 'btn small danger', title: 'Delete this text', onclick: () => { texts = texts.filter((x) => x !== t); renderTexts(); } }, 'x')));
      return tr;
    }),
  );
}
$('#text-search').addEventListener('input', renderTexts);
$('#btn-text-add').addEventListener('click', guard(async () => {
  const body = h('div', { class: 'formgrid' },
    h('label', {}, 'ID (letters, digits, _)', h('input', { id: 'f-id', required: true, pattern: '[A-Za-z0-9_]+' })),
    h('label', {}, 'English text', h('input', { id: 'f-en' })));
  if (!(await modal('Add text', body, 'Add'))) return;
  const id = $('#f-id').value.trim();
  if (!/^[A-Za-z0-9_]+$/.test(id)) return toast('Invalid id', true);
  if (texts.some((t) => t.id === id)) return toast('That id already exists', true);
  texts.push({ id, values: { en: $('#f-en').value } });
  $('#text-search').value = '';
  renderTexts();
}));
$('#btn-text-save').addEventListener('click', guard(async () => {
  await api('PUT', 'api/texts', { texts });
  textsOrig = JSON.stringify(texts);
  renderTexts();
  toast('Texts saved. The game reads them at start-up, so restart it to see changes.');
}));

// ------------------------------------------------------------------ backups
async function loadBackups() {
  const list = await api('GET', 'api/backups');
  $('#backup-list').replaceChildren(
    ...(list.length ? list.map((b) =>
      h('div', { class: 'card backup' }, h('h3', {}, b.id),
        h('div', { class: 'files' }, b.files.map((f) =>
          h('button', { class: 'btn small', title: 'Restore this file', onclick: guard(async () => {
            if (!(await confirmBox('Restore backup', `Replace the current ${f} with the copy from ${b.id}? The current version is backed up first.`, 'Restore'))) return;
            await api('POST', 'api/backups/restore', { id: b.id, file: f });
            state.list = []; closeEditor();
            await loadBackups();
            toast(`Restored ${f}.`);
          }) }, f))))) : [h('p', { class: 'muted' }, 'No backups yet. One is created automatically before the first change to each file.')]),
  );
}
$('#btn-snapshot').addEventListener('click', guard(async () => { await api('POST', 'api/backups/snapshot'); toast('Snapshot created.'); await loadBackups(); }));

// ------------------------------------------------------------------ boot
(async () => {
  try {
    const s = await api('GET', 'api/session');
    if (s.authed) await showApp(); else showLogin();
  } catch (e) {
    showLogin();
    $('#login-error').textContent = 'Cannot reach the admin server: ' + e.message;
  }
})();
