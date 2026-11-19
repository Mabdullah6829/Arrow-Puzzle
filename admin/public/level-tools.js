/*
 * Level rules for Arrow Puzzle, shared by the admin server (Node) and the dashboard (browser).
 *
 * Level format (reverse-engineered from the shipped levels, all 607 verified solvable):
 *   { gridWidth, gridHeight, grid: [[...]], arrows: [{ points: [{x,y}...], exitDir: {x,y} }], difficulty }
 *   - grid cell: 1 = playable cell (dot), 0 = empty cell, -1 = outside the board shape
 *   - arrow.points[0] is the HEAD; the rest is the body, each step is to a neighbouring cell
 *   - the head slides along exitDir in a straight line; it can leave only if no other
 *     remaining arrow occupies a cell on that line before the edge of the grid
 */
(function (root, factory) {
  if (typeof module === 'object' && module.exports) module.exports = factory();
  else root.LevelTools = factory();
})(typeof self !== 'undefined' ? self : this, function () {
  const DIRS = [
    { x: 1, y: 0 },
    { x: -1, y: 0 },
    { x: 0, y: 1 },
    { x: 0, y: -1 },
  ];
  const MAX_GRID = 60;

  const isDir = (d) => !!d && DIRS.some((v) => v.x === d.x && v.y === d.y);
  const isInt = (n) => Number.isInteger(n);

  function buildOcc(arrows, alive) {
    const occ = new Map();
    arrows.forEach((a, i) => {
      if (!alive || alive.has(i)) a.points.forEach((p) => occ.set(p.x + ',' + p.y, i));
    });
    return occ;
  }

  /** Index of the first arrow blocking arrow i's exit line, or -1 if it can leave. */
  function blocker(L, occ, i) {
    const a = L.arrows[i];
    const h = a.points[0];
    let x = h.x + a.exitDir.x;
    let y = h.y + a.exitDir.y;
    while (x >= 0 && y >= 0 && x < L.gridWidth && y < L.gridHeight) {
      const o = occ.get(x + ',' + y);
      if (o !== undefined && o !== i) return o;
      x += a.exitDir.x;
      y += a.exitDir.y;
    }
    return -1;
  }

  /** Greedy removal is exact here: removing a free arrow can never block another. */
  function solve(L) {
    const alive = new Set(L.arrows.map((_, i) => i));
    const occ = buildOcc(L.arrows, alive);
    const order = [];
    let progress = true;
    while (alive.size && progress) {
      progress = false;
      for (const i of [...alive]) {
        if (blocker(L, occ, i) === -1) {
          alive.delete(i);
          L.arrows[i].points.forEach((p) => occ.delete(p.x + ',' + p.y));
          order.push(i);
          progress = true;
        }
      }
    }
    return { solvable: alive.size === 0, order, stuck: [...alive] };
  }

  /** Structural errors block saving; warnings do not. Assumes nothing about the input. */
  function validate(L) {
    const errors = [];
    const warnings = [];
    const bad = () => ({ errors, warnings, solvable: false, order: [], stuck: [] });
    if (!L || typeof L !== 'object') {
      errors.push('Level is not an object');
      return bad();
    }
    const { gridWidth: w, gridHeight: h } = L;
    if (!isInt(w) || !isInt(h) || w < 1 || h < 1 || w > MAX_GRID || h > MAX_GRID) {
      errors.push(`gridWidth/gridHeight must be integers between 1 and ${MAX_GRID}`);
      return bad();
    }
    if (!Array.isArray(L.grid) || L.grid.length !== h || L.grid.some((r) => !Array.isArray(r) || r.length !== w)) {
      errors.push(`grid must be ${h} rows of ${w} cells`);
      return bad();
    }
    if (L.grid.some((r) => r.some((v) => v !== 1 && v !== 0 && v !== -1))) {
      errors.push('grid cells must be 1, 0 or -1');
      return bad();
    }
    if (!Array.isArray(L.arrows)) {
      errors.push('arrows must be an array');
      return bad();
    }
    if (L.difficulty !== undefined && !isInt(L.difficulty)) errors.push('difficulty must be an integer');
    else if (L.difficulty !== undefined && (L.difficulty < 1 || L.difficulty > 3)) warnings.push('difficulty is outside 1-3 (the game uses 1, 2, 3)');

    const used = new Map();
    L.arrows.forEach((a, i) => {
      const tag = `Arrow ${i + 1}`;
      if (!a || !Array.isArray(a.points) || a.points.length < 1) return errors.push(`${tag}: needs at least one point`);
      if (!isDir(a.exitDir)) errors.push(`${tag}: exitDir must be one of (±1,0) or (0,±1)`);
      a.points.forEach((p, k) => {
        if (!p || !isInt(p.x) || !isInt(p.y) || p.x < 0 || p.y < 0 || p.x >= w || p.y >= h) {
          return errors.push(`${tag}: point ${k + 1} is outside the grid`);
        }
        if (k > 0) {
          const q = a.points[k - 1];
          if (q && Math.abs(q.x - p.x) + Math.abs(q.y - p.y) !== 1) errors.push(`${tag}: points ${k} and ${k + 1} are not neighbours`);
        }
        const key = p.x + ',' + p.y;
        if (used.has(key)) errors.push(`Cell (${p.x},${p.y}) is used by arrow ${used.get(key) + 1} and arrow ${i + 1}`);
        else used.set(key, i);
        if (L.grid[p.y][p.x] === -1) warnings.push(`${tag}: point ${k + 1} sits on a cell outside the board shape`);
      });
    });
    if (errors.length) return { errors, warnings, solvable: false, order: [], stuck: [] };
    if (!L.arrows.length) warnings.push('Level has no arrows');
    const s = solve(L);
    if (!s.solvable) warnings.push(`Not solvable: arrows ${s.stuck.map((i) => i + 1).join(', ')} can never leave`);
    return { errors, warnings, ...s };
  }

  function blankLevel(w, h, difficulty) {
    return {
      gridWidth: w,
      gridHeight: h,
      grid: Array.from({ length: h }, () => Array(w).fill(1)),
      arrows: [],
      difficulty: difficulty || 1,
    };
  }

  /** Crop or extend the grid. Fails if an arrow would fall outside. */
  function resizeLevel(L, w, h) {
    for (const a of L.arrows) for (const p of a.points) if (p.x >= w || p.y >= h) return { error: 'An arrow reaches outside the new size. Move or delete it first.' };
    const grid = Array.from({ length: h }, (_, y) => Array.from({ length: w }, (_, x) => (L.grid[y] && L.grid[y][x] !== undefined ? L.grid[y][x] : 1)));
    return { level: { ...L, gridWidth: w, gridHeight: h, grid } };
  }

  function mulberry32(a) {
    return function () {
      a |= 0;
      a = (a + 0x6d2b79f5) | 0;
      let t = Math.imul(a ^ (a >>> 15), 1 | a);
      t = (t + Math.imul(t ^ (t >>> 7), 61 | t)) ^ t;
      return ((t ^ (t >>> 14)) >>> 0) / 4294967296;
    };
  }

  /**
   * Random solvable level. Arrows are placed in REVERSE removal order: each new arrow only has to
   * keep its exit line clear of the arrows already placed (those are removed after it).
   */
  function generateLevel(w, h, opts) {
    const o = Object.assign({ minLen: 3, maxLen: 10, fill: 0.9, difficulty: 1, seed: (Math.random() * 2 ** 32) >>> 0 }, opts || {});
    const rnd = mulberry32(o.seed);
    const L = blankLevel(w, h, o.difficulty);
    const occ = new Set();
    const free = (x, y) => x >= 0 && y >= 0 && x < w && y < h && !occ.has(x + ',' + y);
    const target = Math.floor(w * h * o.fill);
    let cells = 0;
    for (let attempt = 0; attempt < w * h * 40 && cells < target; attempt++) {
      const sx = Math.floor(rnd() * w);
      const sy = Math.floor(rnd() * h);
      if (!free(sx, sy)) continue;
      const len = o.minLen + Math.floor(rnd() * (o.maxLen - o.minLen + 1));
      const pts = [{ x: sx, y: sy }];
      const own = new Set([sx + ',' + sy]);
      let lastDir = null;
      while (pts.length < len) {
        const t = pts[pts.length - 1];
        const options = DIRS.filter((d) => free(t.x + d.x, t.y + d.y) && !own.has(t.x + d.x + ',' + (t.y + d.y)));
        if (!options.length) break;
        const straight = lastDir && options.find((d) => d.x === lastDir.x && d.y === lastDir.y);
        const d = straight && rnd() < 0.55 ? straight : options[Math.floor(rnd() * options.length)];
        pts.push({ x: t.x + d.x, y: t.y + d.y });
        own.add(t.x + d.x + ',' + (t.y + d.y));
        lastDir = d;
      }
      if (pts.length < Math.min(o.minLen, 2)) continue;
      // exit candidates: line from the head to the edge must avoid every arrow already placed
      const head = pts[0];
      const clear = DIRS.filter((d) => {
        let x = head.x + d.x;
        let y = head.y + d.y;
        while (x >= 0 && y >= 0 && x < w && y < h) {
          if (occ.has(x + ',' + y)) return false;
          x += d.x;
          y += d.y;
        }
        return true;
      });
      if (!clear.length) continue;
      const away = pts.length > 1 ? { x: head.x - pts[1].x, y: head.y - pts[1].y } : null;
      const pick = away && clear.find((d) => d.x === away.x && d.y === away.y);
      const exitDir = pick && rnd() < 0.7 ? pick : clear[Math.floor(rnd() * clear.length)];
      L.arrows.push({ points: pts, exitDir: { x: exitDir.x, y: exitDir.y } });
      pts.forEach((p) => occ.add(p.x + ',' + p.y));
      cells += pts.length;
    }
    // placed in reverse removal order; reverse so the file reads in solving order like the originals
    L.arrows.reverse();
    return L;
  }

  /**
   * Which in-game level number reads this file/index (mirrors the game's own lookup):
   *   1..100      -> levels_0[n-1]
   *   n > 100     -> levels_(n % 7 + 1)[floor(n / 7) % 50]
   */
  function gameLevelFor(file, idx) {
    if (file === 'levels_0') return idx < 100 ? { level: idx + 1 } : { unused: true };
    if (file === 'levels_ch') return { challenge: true };
    const k = Number(file.split('_')[1]);
    if (!k || idx >= 50) return { unused: true };
    for (let m = 0; m < 1000; m++) {
      const n = 7 * (idx + 50 * m) + (k - 1);
      if (n > 100) return { level: n };
    }
    return { unused: true };
  }

  return { DIRS, MAX_GRID, isDir, buildOcc, blocker, solve, validate, blankLevel, resizeLevel, generateLevel, gameLevelFor };
});
