# Arrow App

Workspace for recovering the **Arrow Puzzle | Puzzle Arrow** Android game (v1.2), rebuilding it as an ad-free Android app, and managing its levels and texts from a local admin dashboard.

The game is a **Phaser (HTML5/JavaScript)** game running inside a native Android **WebView**. Its game logic and assets were stored as plaintext, so they can be edited directly. The native Android shell was compiled code, so it was decompiled and then reimplemented from scratch.

- GitHub (HTTPS): https://github.com/Mabdullah6829/Arrow-Puzzle.git
- GitHub (SSH): `git@github.com:Mabdullah6829/Arrow-Puzzle.git`
- This folder is **not yet a git repository** and nothing has been pushed.

## Layout

| Path | What it is |
| --- | --- |
| `Arrow+Puzzle+_+Puzzle+Arrow_1.2_APKPure.xapk` | Original package from APKPure. Left untouched. |
| `recovered-source/` | Everything extracted from the XAPK. See its [README](recovered-source/README.md). |
| `recovered-source/web-game/assets/` | Phaser game code (`src/game.js`, `src/ads.js`), levels, spritesheets, audio, font. |
| `recovered-source/android/` | JADX decompilation and decoded resources of the original APK. Reference only. |
| `adfree-android/` | Clean Gradle project that wraps the game in a WebView. See its [README](adfree-android/README.md). |
| `admin/` | **Super Admin** dashboard frontend, plus a dependency-free Node server used for local development and tests. |
| `server-php/` | PHP backend for the dashboard, web-server config and live tests, for the shared host (no Node there). |
| `deploy/` | `deploy.sh`: builds and uploads the web game + admin to the server. |
| `expo-app/` | Expo Go preview shell that loads the game from a local server. |
| `.mcp.json` | Project-level GitHub MCP server config (no secrets in it). |

## How the pieces fit together

1. The original app loads `file:///android_asset/info/file.html` in a WebView and exposes a JavaScript `Android` bridge (`showAd`, `showRewardedAd`, `landscape`, `portrait`, `rateThisApp`, `shareText`, `shareThisApp`, `showAlert`).
2. The web game was changed to be ad-free: banner and interstitial calls are disabled, reward ads grant hints and revives immediately, and the `Watch AD` label now reads `FREE`.
3. `adfree-android` is a new native shell with no ad SDKs, no analytics, no Firebase, and no network permission. Game assets are copied from `recovered-source/web-game/assets/` into `adfree-android/app/src/main/assets/`.

## Ad-free app

- Package: `com.arrow.puzzle.adfree`, version 1.0.0 (versionCode 1), minSdk 24, targetSdk 36
- Single activity: [MainActivity.java](adfree-android/app/src/main/java/com/arrow/puzzle/adfree/MainActivity.java) (immersive full-screen WebView)

Build from `adfree-android/`:

```
gradlew assembleDebug
```

The debug APK is written to `adfree-android/app/build/outputs/apk/debug/app-debug.apk`. After changing anything in `recovered-source/web-game/assets/`, copy it into `adfree-android/app/src/main/assets/` before building. The `build/` folders are generated output.

Debugging: the WebView console is written to logcat under the tag `ArrowPuzzle` (`adb logcat -s ArrowPuzzle`), and WebView remote debugging is enabled in debug builds.

## Web deployment (shared host, PHP)

The game and the Super Admin run as a normal website on a shared host (LiteSpeed, PHP 8.3, **no Node**). From now on changes are **deployed to the server**, not run locally.

```
cp deploy/deploy.conf.example deploy/deploy.conf   # host, port, user, domain, path (git-ignored, no password)
export ARROW_SSH_PW='...'                          # or set DEPLOY_KEY to an SSH key; never stored on disk
deploy/deploy.sh --init       # first time only: uploads everything and creates the admin password (printed once)
deploy/deploy.sh              # normal deploy: code + game assets; keeps levels/texts edited through the admin
deploy/deploy.sh --data       # also overwrite the live levels/texts with the local copies
deploy/deploy.sh --dry-run    # build the package and list it, upload nothing
```

- **What is deployed:** the game (`index.html`, `info/`, `src/`, `assets/`) at the site root, and the admin at `/admin/`. The server copy of `assets/levels` and `assets/dat` is the live source of truth: edits made in the admin are written there, and a normal deploy does not touch them.
- **Scope:** `deploy.sh` refuses to run unless `DEPLOY_PATH` ends in `public_html/arrow`, and only writes inside that folder. Other sites on the same hosting account are never touched.
- **Security:** the admin needs HTTPS (it refuses plain HTTP; behind Cloudflare it reads `CF-Visitor` / `X-Forwarded-Proto`), only answers for the configured host name, uses an HttpOnly SameSite=Strict session cookie, a custom header on every write (CSRF), rate-limits failed logins and keeps only a password hash in `_private/config.php` (mode 600). `_private/` (hash, sessions, backups, PHP library) and directory listings return 403. The whole site sends `X-Robots-Tag: noindex` and `robots.txt` disallows everything.
- **DNS:** the subdomain needs a DNS record at your DNS provider (the zone is on Cloudflare): an `A` record for `arrow` pointing at the server IP. Until it exists the site can only be reached through the server IP with the right `Host` header.
- **Live data vs local copies:** the live levels/texts are the newest copy after admin edits. Download them before running `deploy.sh --data`, or you will overwrite those edits.
- **Tests:** `php < server-php/test-lib.php` run on the server (read-only self-test of the PHP rules against the live data), and `ARROW_ADMIN_PASSWORD=... node server-php/test-remote.js <domain> [server-ip]` (16 live API tests that only do reversible changes).

## Super Admin dashboard (`admin/`)

A web dashboard for editing the game's content. The same frontend runs on the server (PHP backend, see above) and locally (Node, for development and tests). No `npm install` needed (Node 18+).

```
cd admin
node server.js        # then open http://127.0.0.1:4000
npm test              # 20 end-to-end tests on a temporary copy of the assets
```

- **Login:** the password comes from `ARROW_ADMIN_PASSWORD`, otherwise it is generated on first start, saved in `admin/.admin-password` and printed in the console. The server only listens on `127.0.0.1`, rejects foreign `Host` headers, uses an HttpOnly SameSite cookie, requires a custom header on every write, and rate-limits failed logins.
- **Overview:** counts, difficulty mix and solvability per level file.
- **Levels:** list, edit, add, duplicate, delete and reorder levels in all 9 files. The board editor has Select, Draw arrow (drag from the tip along the body), Paint cells (dot / empty / void), and Play test (click arrows to try the level, or "Show solution"). It also has undo/redo, resize, difficulty, live validation and a random solvable-level generator. Shortcuts: `S`/`D`/`P`/`T` tools, arrow keys set the exit direction, `Del` deletes an arrow, `Ctrl+Z/Y`, `Ctrl+S`.
- **Texts:** edit every string in `m.xml`, add new ones, search.
- **Backups:** each file is copied to `admin/backups/` before its first change per session. Restore any file, or snapshot everything.
- **Saving** writes to both `adfree-android/.../assets/assets` and `recovered-source/web-game/assets/assets` so they stay in step. Saves of unchanged data leave the files byte-identical. Structural errors (arrow outside the grid, overlapping arrows, bad exit direction) block saving. An unsolvable level only warns.
- **Level rules** (reverse-engineered, all 607 shipped levels solvable under them): `points[0]` is the arrow head, each step goes to a neighbouring cell, and the head slides in a straight line along `exitDir`. It can leave only if no other remaining arrow sits on that line. Grid cells: `1` dot, `0` empty, `-1` outside the board shape. The game maps level numbers to files as: levels 1-100 use `levels_0[n-1]`, and level `n` above 100 uses `levels_(n%7+1)[floor(n/7)%50]`. So `levels_0` index 100 and above, and index 50 and above in `levels_1` to `levels_3`, are **never loaded by the game**. The dashboard flags them.
- Saved changes land directly in the Android assets folder, so rebuild the APK (`gradlew assembleDebug`) or reload the Expo preview to see them in the game.

## Expo Go preview (`expo-app/`)

Expo Go only runs React Native apps, so `expo-app` is a small shell whose WebView loads the game from a tiny static server on your laptop.

```
cd expo-app
npm run game          # serves the game on port 8080
npx expo start --lan  # then scan the QR code in Expo Go (same Wi-Fi)
```

It only works while both servers run on your laptop, and the link changes if your Wi-Fi address changes. Allow Node through Windows Firewall when asked. Expo SDK 58.

## GitHub MCP

`.mcp.json` registers the GitHub MCP server (`https://api.githubcopilot.com/mcp/`). It reads the token from the `GITHUB_PERSONAL_ACCESS_TOKEN` environment variable, so nothing secret is stored in the file. To activate it: create a GitHub personal access token with the repo access you want, set that variable, restart Claude Code in this folder and approve the server (`/mcp` shows its status).

## Known limitations

- The decompiled Java in `recovered-source/android/` is best-effort. Names are partly obfuscated, and comments and formatting are gone.
- Gradle files, dependency versions, signing keys and the original project history were not in the package.
- `ads.js` calls `showAndroidBanner` and `removeAds`, which the recovered bridge never defined, so those calls are caught and do nothing.
- A release build needs your own signing key. The original XAPK's signature can't be reused.
- The game logs `STR(LEVEL 1) MISSING!` and `STR(START) MISSING!` because it asks for two text ids that `m.xml` does not define (identical to the original). It is harmless in the tested screens but unverified elsewhere.
- Tested on the Android emulator (Pixel 7 Pro) only, not on a physical phone.
- The original game belongs to its publisher. Check you have the right to redistribute a modified version before publishing this repository.

## Update log

Newest first. Every task adds an entry here.

### 2026-11-19
- **Deployed to the web server and switched the admin to run there:** new PHP backend for the dashboard (`server-php/`, a port of the Node server: login, validation, solver, generator, level/text/backup endpoints), web-server config files, and `deploy/deploy.sh`. The game is live at the site root and the admin at `/admin/`. Verified on the server: PHP lint, a read-only PHP self-test (20 checks over all 607 levels, byte-identical re-serialisation of every data file, 11 invalid-input cases, 300 generated levels), 16 live API tests, and a real-browser run (Chrome) covering the game page and every admin tab. **Bugs found by those tests and fixed:** (1) in PHP an `fn() =>` closure copies variables when it is created, so the validator's early-return helper always reported "no errors" and a deliberately malformed level (`{"gridWidth":3}`) overwrote level 1 of the live `levels_0.json`; it was restored from the local original (all 10 live data files verified byte-identical afterwards) and the closures now capture by reference; the generator had the same flaw. (2) Anonymous requests created empty session files; sessions now start only for existing sessions or login attempts. The live test now probes invalid levels on the challenge file and cleans up if one is wrongly accepted. The temporary backups made by the tests were deleted.
- **Not reachable by domain yet:** the arrow subdomain does not exist in public DNS (the parent domain is on Cloudflare). It was tested through the server IP with the right Host header. An `A` record for `arrow` must be added; HTTPS on the origin was not confirmed, so the admin relies on Cloudflare's HTTPS headers.
- **Repository prepared for a push:** `expo-app` had a nested `.git` from the Expo scaffolder (moved out, so its files are tracked normally). The original publisher's Google/Firebase API key, Firebase IDs and AdMob IDs (in `recovered-source/android/resources/res/values/strings.xml` and `res/layout/activity_main.xml`) are excluded through `.gitignore`. The staged content was scanned for tokens, passwords, server details and those IDs: clean.
- **GitHub CLI logged in and verified:** `gh auth status` shows account `Mabdullah6829` (browser OAuth, token in the Windows keyring, HTTPS git protocol, scopes gist/read:org/repo/workflow). `gh repo view Mabdullah6829/Arrow-Puzzle` reports the repo is PUBLIC, EMPTY, and the account has ADMIN permission. Nothing was pushed. The old PAT is no longer needed.
- **GitHub CLI installed:** `gh` 2.105.0 via `winget install --id GitHub.cli` (at `C:Program FilesGitHub CLIgh.exe`; new terminals will have it on PATH). Not logged in yet: `gh auth login` needs an interactive terminal, so the user runs it (GitHub.com, HTTPS, login with a web browser). Nothing was pushed.
- **GitHub without MCP (options only, no project changes):** git 2.51 is installed and the git identity is set; there is no SSH key yet (`Permission denied (publickey)`), `gh` is not installed, Docker is installed. Options: git over HTTPS with Git Credential Manager browser sign-in, a new SSH key added on github.com, or the local `github-mcp-server` Docker image with a token. Nothing was pushed. (The SSH test also added github.com to `~/.ssh/known_hosts`.)
- **GitHub MCP reconfigured (OAuth attempt):** `.mcp.json` no longer lists the PAT-header `github` server (it is now `{"mcpServers": {}}`). The CLI is not on PATH or in npm global, but the VS Code extension bundles `claude.exe` (v2.1.328), which was used to run `claude mcp add --transport http github https://api.githubcopilot.com/mcp/` (local scope, no header). It does not connect: `Incompatible auth server: does not support dynamic client registration`, so GitHub's endpoint cannot be used with Claude Code's browser OAuth. Pending decision: PAT header again (needs VS Code fully restarted so the env var is visible) or a pre-registered OAuth app. Scanned the project, memory and `~/.claude.json`: no token value is stored there. **To-do for the user: revoke the old `claude-code-mcp` token on github.com.** The user environment variable `GITHUB_PERSONAL_ACCESS_TOKEN` still holds it until removed.
- **GitHub MCP: first connection attempt failed (400 "Authorization header is badly formatted").** The token is stored correctly in the user environment (93 chars), but the restarted Claude Code session still saw an empty `GITHUB_PERSONAL_ACCESS_TOKEN`, because VS Code keeps the environment it was launched with (a window reload does not refresh it). Fix: fully quit every VS Code window/process and reopen it from the Start menu, then approve the `github` server. The token was verified earlier against the GitHub API (user `Mabdullah6829`, push access to `Arrow-Puzzle`, repo public and empty) and is in no project file. It was pasted into a chat, so rotate it when possible.
- **Admin dashboard fixes after browser testing:** `levels_0` index 100+ is now reported as never loaded by the game (previously shown as a playable level). Added a favicon. Added a test for the level-number mapping (20 tests pass).
- **GitHub:** recorded the repository remotes, added `.gitignore` (keeps the admin password, backups, build output, keystores and the original XAPK out of git) and `.mcp.json` for the GitHub MCP server. Nothing was pushed.
- **Super Admin dashboard (`admin/`):** new local dashboard for levels, texts and backups, with a board editor, play test, generator and validation. Verified with 20 API tests plus a real-browser run (Edge) covering login, editing, drawing, painting, saving, texts, backups and the mobile layout.
- **Expo Go preview (`expo-app/`):** added an Expo shell and a static game server so the game can be opened in Expo Go over Wi-Fi.
- **Fixed "only the splash screen shows":** the Codex-generated `MainActivity` did not enable `setAllowFileAccessFromFileURLs` / `setAllowUniversalAccessFromFileURLs`, so Phaser's XHR loads of the XML, atlas, level and audio files were blocked and the game stalled after the splash. Restored them, added the orientation bridge and logcat console logging. Confirmed on the emulator: the tutorial level loads and arrows respond to touch.
- **Analysis:** decompiled the base APK again with JADX v1.5.7 and compared it with `recovered-source`. The original `MainActivity` loads `file:///android_asset/info/file.html` with those two file-access flags, a JS bridge named `Android`, AdMob banner, interstitial and rewarded ads, and Facebook Audience Network. `MyApplication` initialises AdMob, Audience Network and Firestore, and shows app-open ads. `StartActivity` loads a native ad, requests notification permission, and uses in-app update and review flows.
- Wrote this README.
