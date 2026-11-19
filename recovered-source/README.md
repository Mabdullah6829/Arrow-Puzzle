# Recovered Arrow Puzzle source

This directory was recovered from the supplied `Arrow Puzzle Game` v1.2 XAPK. The original package remains untouched.

## Contents

- `web-game/assets/src/game.js` — Phaser game code (directly recovered; syntax validated).
- `web-game/assets/src/ads.js` — JavaScript-to-Android advertising bridge.
- `web-game/assets/assets/` — all recovered level data, localization, images, font, and audio.
- `android/sources/` — JADX decompilation of the base APK, including all dependencies.
- `android/sources/com/arrow/puzzle/escape/maze/free/game/` — the six app-specific Java classes.
- `android/resources/` — decoded manifest, layouts, values, drawables, and other Android resources.

## What was recovered versus what cannot be recovered

The web game was stored as plaintext JavaScript, so it is directly editable. The Android application was compiled into DEX bytecode, so its Java is best-effort decompiled output: names are partially obfuscated, comments and original formatting are gone, and no Gradle build files, dependency versions, signing key, keystore, Firebase credentials, or original project history exist in this package.

## Important reconstruction findings

- The native shell loads `file:///android_asset/info/file.html` in a WebView and exposes the JavaScript object `Android`.
- Recovered bridge methods are: `showAd`, `showRewardedAd`, `landscape`, `portrait`, `rateThisApp`, `shareText`, `shareThisApp`, and `showAlert`.
- The shipped `ads.js` also calls `showAndroidBanner` and `removeAds`; neither method exists in the recovered bridge, so both calls are currently caught and do nothing.
- The XAPK is split and targets Android SDK 36. A rebuild must generate new compatible splits (or an AAB) and must be signed with a new/recovered authorized release key.

## Ad-free game layer

The recovered web game is now configured as ad-free. Banner and interstitial dispatches are disabled, reward ads grant hints and revives immediately, and the visible `Watch AD` label was changed to `FREE`.

The next native Gradle project must deliberately omit the Google Mobile Ads and Facebook Audience Network dependencies, their manifest declarations, and the recovered ad views. Editing this recovery workspace alone cannot alter the already-signed XAPK.

## Do not ship this folder directly

Create a clean Android Gradle project around the recovered game assets and deliberately reimplement the required native pieces. Validate it on devices before any release.
