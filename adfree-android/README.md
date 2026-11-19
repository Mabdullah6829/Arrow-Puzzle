# Arrow Puzzle — ad-free Android build

This is a clean Android WebView wrapper for the recovered game. It intentionally has no network permission, no advertising SDK, no analytics SDK, no Firebase dependency, and no ad-related manifest entry.

Game assets are copied from `../recovered-source/web-game/assets/` into `app/src/main/assets/` before a build.

The debug APK is produced at `app/build/outputs/apk/debug/app-debug.apk`.
