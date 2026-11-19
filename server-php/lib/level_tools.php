<?php
declare(strict_types=1);

/*
 * Level rules for Arrow Puzzle (PHP port of admin/public/level-tools.js).
 *
 * Level: { gridWidth, gridHeight, grid: [[1|0|-1]], arrows: [{ points: [{x,y}], exitDir: {x,y} }], difficulty }
 * - points[0] is the arrow HEAD; each step goes to a neighbouring cell
 * - the head slides along exitDir and can leave only if no other remaining arrow sits on that line
 */

const LT_MAX_GRID = 60;
const LT_DIRS = [[1, 0], [-1, 0], [0, 1], [0, -1]];

function lt_is_dir($d): bool
{
    return is_array($d) && isset($d['x'], $d['y']) && is_int($d['x']) && is_int($d['y'])
        && in_array([$d['x'], $d['y']], LT_DIRS, true);
}

/** @return array<string,int> "x,y" => arrow index, for arrows in $alive (all when null) */
function lt_build_occ(array $arrows, ?array $alive = null): array
{
    $occ = [];
    foreach ($arrows as $i => $a) {
        if ($alive !== null && !isset($alive[$i])) {
            continue;
        }
        foreach ($a['points'] as $p) {
            $occ[$p['x'] . ',' . $p['y']] = $i;
        }
    }
    return $occ;
}

/** Index of the first arrow blocking arrow $i's exit line, or -1 when it can leave. */
function lt_blocker(array $L, array $occ, int $i): int
{
    $a = $L['arrows'][$i];
    $h = $a['points'][0];
    $dx = $a['exitDir']['x'];
    $dy = $a['exitDir']['y'];
    $x = $h['x'] + $dx;
    $y = $h['y'] + $dy;
    while ($x >= 0 && $y >= 0 && $x < $L['gridWidth'] && $y < $L['gridHeight']) {
        $k = $x . ',' . $y;
        if (isset($occ[$k]) && $occ[$k] !== $i) {
            return $occ[$k];
        }
        $x += $dx;
        $y += $dy;
    }
    return -1;
}

/** Greedy removal is exact: taking out a free arrow can never block another. */
function lt_solve(array $L): array
{
    $alive = [];
    foreach ($L['arrows'] as $i => $_) {
        $alive[$i] = true;
    }
    $occ = lt_build_occ($L['arrows'], $alive);
    $order = [];
    $progress = true;
    while ($alive && $progress) {
        $progress = false;
        foreach (array_keys($alive) as $i) {
            if (lt_blocker($L, $occ, $i) === -1) {
                unset($alive[$i]);
                foreach ($L['arrows'][$i]['points'] as $p) {
                    unset($occ[$p['x'] . ',' . $p['y']]);
                }
                $order[] = $i;
                $progress = true;
            }
        }
    }
    return ['solvable' => !$alive, 'order' => $order, 'stuck' => array_values(array_keys($alive))];
}

/** Structural errors block saving; warnings do not. Assumes nothing about the input. */
function lt_validate($L): array
{
    $errors = [];
    $warnings = [];
    // By-reference capture on purpose: an arrow fn would copy the (still empty) arrays when created,
    // and every early return would then wrongly report "no errors".
    $bad = function () use (&$errors, &$warnings): array {
        return ['errors' => $errors, 'warnings' => $warnings, 'solvable' => false, 'order' => [], 'stuck' => []];
    };

    if (!is_array($L)) {
        $errors[] = 'Level is not an object';
        return $bad();
    }
    $w = $L['gridWidth'] ?? null;
    $h = $L['gridHeight'] ?? null;
    if (!is_int($w) || !is_int($h) || $w < 1 || $h < 1 || $w > LT_MAX_GRID || $h > LT_MAX_GRID) {
        $errors[] = 'gridWidth/gridHeight must be integers between 1 and ' . LT_MAX_GRID;
        return $bad();
    }
    $grid = $L['grid'] ?? null;
    $okGrid = is_array($grid) && count($grid) === $h && array_is_list($grid);
    if ($okGrid) {
        foreach ($grid as $row) {
            if (!is_array($row) || count($row) !== $w || !array_is_list($row)) {
                $okGrid = false;
                break;
            }
        }
    }
    if (!$okGrid) {
        $errors[] = "grid must be $h rows of $w cells";
        return $bad();
    }
    foreach ($grid as $row) {
        foreach ($row as $v) {
            if ($v !== 1 && $v !== 0 && $v !== -1) {
                $errors[] = 'grid cells must be 1, 0 or -1';
                return $bad();
            }
        }
    }
    $arrows = $L['arrows'] ?? null;
    if (!is_array($arrows) || !array_is_list($arrows)) {
        $errors[] = 'arrows must be an array';
        return $bad();
    }
    if (array_key_exists('difficulty', $L)) {
        $d = $L['difficulty'];
        if (!is_int($d)) {
            $errors[] = 'difficulty must be an integer';
        } elseif ($d < 1 || $d > 3) {
            $warnings[] = 'difficulty is outside 1-3 (the game uses 1, 2, 3)';
        }
    }

    $used = [];
    foreach ($arrows as $i => $a) {
        $tag = 'Arrow ' . ($i + 1);
        if (!is_array($a) || !isset($a['points']) || !is_array($a['points']) || !array_is_list($a['points']) || count($a['points']) < 1) {
            $errors[] = "$tag: needs at least one point";
            continue;
        }
        if (!lt_is_dir($a['exitDir'] ?? null)) {
            $errors[] = "$tag: exitDir must be one of (±1,0) or (0,±1)";
        }
        foreach ($a['points'] as $k => $p) {
            if (!is_array($p) || !isset($p['x'], $p['y']) || !is_int($p['x']) || !is_int($p['y'])
                || $p['x'] < 0 || $p['y'] < 0 || $p['x'] >= $w || $p['y'] >= $h) {
                $errors[] = "$tag: point " . ($k + 1) . ' is outside the grid';
                continue;
            }
            if ($k > 0) {
                $q = $a['points'][$k - 1];
                if (is_array($q) && isset($q['x'], $q['y']) && is_int($q['x']) && is_int($q['y'])
                    && abs($q['x'] - $p['x']) + abs($q['y'] - $p['y']) !== 1) {
                    $errors[] = "$tag: points $k and " . ($k + 1) . ' are not neighbours';
                }
            }
            $key = $p['x'] . ',' . $p['y'];
            if (isset($used[$key])) {
                $errors[] = "Cell ({$p['x']},{$p['y']}) is used by arrow " . ($used[$key] + 1) . ' and arrow ' . ($i + 1);
            } else {
                $used[$key] = $i;
            }
            if ($grid[$p['y']][$p['x']] === -1) {
                $warnings[] = "$tag: point " . ($k + 1) . ' sits on a cell outside the board shape';
            }
        }
    }
    if ($errors) {
        return ['errors' => $errors, 'warnings' => $warnings, 'solvable' => false, 'order' => [], 'stuck' => []];
    }
    if (!$arrows) {
        $warnings[] = 'Level has no arrows';
    }
    $s = lt_solve($L);
    if (!$s['solvable']) {
        $warnings[] = 'Not solvable: arrows ' . implode(', ', array_map(static fn($i) => $i + 1, $s['stuck'])) . ' can never leave';
    }
    return ['errors' => $errors, 'warnings' => $warnings] + $s;
}

function lt_blank_level(int $w, int $h, int $difficulty = 1): array
{
    return [
        'gridWidth' => $w,
        'gridHeight' => $h,
        'grid' => array_fill(0, $h, array_fill(0, $w, 1)),
        'arrows' => [],
        'difficulty' => $difficulty,
    ];
}

/**
 * Random solvable level. Arrows are placed in REVERSE removal order: each new arrow only has to keep
 * its exit line clear of the arrows already placed (those are removed after it).
 */
function lt_generate(int $w, int $h, array $o = []): array
{
    $minLen = max(2, (int)($o['minLen'] ?? 3));
    $maxLen = max($minLen, (int)($o['maxLen'] ?? 10));
    $fill = (float)($o['fill'] ?? 0.9);
    $difficulty = (int)($o['difficulty'] ?? 1);
    mt_srand(isset($o['seed']) ? (int)$o['seed'] : random_int(1, 2147483646));
    $rnd = static fn(): float => mt_rand() / mt_getrandmax();

    $L = lt_blank_level($w, $h, $difficulty);
    $occ = [];
    // By reference: $occ grows as arrows are placed (an arrow fn would only see its initial empty value).
    $free = function (int $x, int $y) use (&$occ, $w, $h): bool {
        return $x >= 0 && $y >= 0 && $x < $w && $y < $h && !isset($occ[$x . ',' . $y]);
    };
    $target = (int)floor($w * $h * $fill);
    $cells = 0;
    $arrows = [];
    for ($attempt = 0; $attempt < $w * $h * 40 && $cells < $target; $attempt++) {
        $sx = (int)floor($rnd() * $w);
        $sy = (int)floor($rnd() * $h);
        if (!$free($sx, $sy)) {
            continue;
        }
        $len = $minLen + (int)floor($rnd() * ($maxLen - $minLen + 1));
        $pts = [['x' => $sx, 'y' => $sy]];
        $own = [$sx . ',' . $sy => true];
        $last = null;
        while (count($pts) < $len) {
            $t = $pts[count($pts) - 1];
            $options = [];
            foreach (LT_DIRS as $d) {
                $nx = $t['x'] + $d[0];
                $ny = $t['y'] + $d[1];
                if ($free($nx, $ny) && !isset($own[$nx . ',' . $ny])) {
                    $options[] = $d;
                }
            }
            if (!$options) {
                break;
            }
            $straight = null;
            if ($last !== null) {
                foreach ($options as $d) {
                    if ($d === $last) {
                        $straight = $d;
                    }
                }
            }
            $d = ($straight !== null && $rnd() < 0.55) ? $straight : $options[(int)floor($rnd() * count($options))];
            $nx = $t['x'] + $d[0];
            $ny = $t['y'] + $d[1];
            $pts[] = ['x' => $nx, 'y' => $ny];
            $own[$nx . ',' . $ny] = true;
            $last = $d;
        }
        if (count($pts) < min($minLen, 2)) {
            continue;
        }
        $head = $pts[0];
        $clear = [];
        foreach (LT_DIRS as $d) {
            $x = $head['x'] + $d[0];
            $y = $head['y'] + $d[1];
            $ok = true;
            while ($x >= 0 && $y >= 0 && $x < $w && $y < $h) {
                if (isset($occ[$x . ',' . $y])) {
                    $ok = false;
                    break;
                }
                $x += $d[0];
                $y += $d[1];
            }
            if ($ok) {
                $clear[] = $d;
            }
        }
        if (!$clear) {
            continue;
        }
        $away = count($pts) > 1 ? [$head['x'] - $pts[1]['x'], $head['y'] - $pts[1]['y']] : null;
        $pick = null;
        if ($away !== null) {
            foreach ($clear as $d) {
                if ($d === $away) {
                    $pick = $d;
                }
            }
        }
        $exit = ($pick !== null && $rnd() < 0.7) ? $pick : $clear[(int)floor($rnd() * count($clear))];
        $arrows[] = ['points' => $pts, 'exitDir' => ['x' => $exit[0], 'y' => $exit[1]]];
        foreach ($pts as $p) {
            $occ[$p['x'] . ',' . $p['y']] = true;
        }
        $cells += count($pts);
    }
    $L['arrows'] = array_reverse($arrows);
    return $L;
}

/**
 * Which in-game level number reads this file/index (mirrors the game's own lookup):
 *   1..100  -> levels_0[n-1];   n > 100 -> levels_(n % 7 + 1)[floor(n / 7) % 50]
 */
function lt_game_level_for(string $file, int $idx): array
{
    if ($file === 'levels_0') {
        return $idx < 100 ? ['level' => $idx + 1] : ['unused' => true];
    }
    if ($file === 'levels_ch') {
        return ['challenge' => true];
    }
    $k = (int)substr($file, strlen('levels_'));
    if ($k < 1 || $idx >= 50) {
        return ['unused' => true];
    }
    for ($m = 0; $m < 1000; $m++) {
        $n = 7 * ($idx + 50 * $m) + ($k - 1);
        if ($n > 100) {
            return ['level' => $n];
        }
    }
    return ['unused' => true];
}
