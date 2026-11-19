#!/usr/bin/env bash
# Deploy the Arrow Puzzle web game + PHP Super Admin to the shared host.
#
#   deploy/deploy.sh                 code + game assets (keeps live levels/texts edited through the admin)
#   deploy/deploy.sh --data          ALSO overwrite live levels and texts with the local copies
#   deploy/deploy.sh --init          first time: also create the admin password (prints it once)
#   deploy/deploy.sh --dry-run       build the package and list it, upload nothing
#
# Configuration: deploy/deploy.conf (see deploy.conf.example). The SSH password is never stored:
# use a key (DEPLOY_KEY) or export ARROW_SSH_PW for the session.
# This script only ever writes inside DEPLOY_PATH (the arrow.* site folder).
set -euo pipefail

HERE="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
ROOT="$(cd "$HERE/.." && pwd)"
[ -f "$HERE/deploy.conf" ] && . "$HERE/deploy.conf"

: "${DEPLOY_HOST:?set DEPLOY_HOST in deploy/deploy.conf}"
: "${DEPLOY_PORT:?set DEPLOY_PORT in deploy/deploy.conf}"
: "${DEPLOY_USER:?set DEPLOY_USER in deploy/deploy.conf}"
: "${DEPLOY_PATH:?set DEPLOY_PATH in deploy/deploy.conf}"
: "${DEPLOY_DOMAIN:?set DEPLOY_DOMAIN in deploy/deploy.conf}"

DATA=0; INIT=0; DRY=0
for a in "$@"; do
  case "$a" in
    --data) DATA=1 ;; --init) INIT=1 ;; --dry-run) DRY=1 ;;
    *) echo "unknown option: $a" >&2; exit 2 ;;
  esac
done

# Safety: only ever deploy into an "arrow" site folder under public_html.
if ! [[ "$DEPLOY_PATH" =~ ^/home/[a-z0-9]+/domains/[a-z0-9.-]+/public_html/arrow$ ]]; then
  echo "Refusing to deploy: DEPLOY_PATH must look like /home/<user>/domains/<site>/public_html/arrow (got: $DEPLOY_PATH)" >&2
  exit 1
fi

TMP="$(mktemp -d)"
trap 'rm -rf "$TMP"' EXIT

# --- SSH auth: key if given, otherwise the password from the environment (never written to disk)
SSH_OPTS=(-p "$DEPLOY_PORT" -o ConnectTimeout=20 -o StrictHostKeyChecking=accept-new)
if [ -n "${DEPLOY_KEY:-}" ]; then
  SSH_OPTS+=(-i "$DEPLOY_KEY" -o IdentitiesOnly=yes)
elif [ -n "${ARROW_SSH_PW:-}" ]; then
  printf '#!/bin/sh\necho "$ARROW_SSH_PW"\n' > "$TMP/askpass.sh"; chmod +x "$TMP/askpass.sh"
  export SSH_ASKPASS="$TMP/askpass.sh" SSH_ASKPASS_REQUIRE=force DISPLAY=none
  SSH_OPTS+=(-o PreferredAuthentications=password,keyboard-interactive)
elif [ "$DRY" -eq 0 ]; then
  echo "No credentials: set DEPLOY_KEY in deploy.conf or export ARROW_SSH_PW for this session." >&2
  exit 1
fi
remote() { ssh "${SSH_OPTS[@]}" "$DEPLOY_USER@$DEPLOY_HOST" "$@"; }

# --- Build the package
GAME="$ROOT/adfree-android/app/src/main/assets"
STAGE="$TMP/stage"
mkdir -p "$STAGE/admin" "$STAGE/_private/lib"

cp -r "$GAME/src" "$GAME/info" "$STAGE/"
mkdir -p "$STAGE/assets"
for d in audio spritesheets splash; do cp -r "$GAME/assets/$d" "$STAGE/assets/"; done
cp "$GAME/assets/myFont.ttf" "$STAGE/assets/"
if [ "$DATA" -eq 1 ] || [ "$INIT" -eq 1 ]; then
  cp -r "$GAME/assets/levels" "$GAME/assets/dat" "$STAGE/assets/"
fi
# Web entry point: same page as the app's info/file.html, without the <base href="../"> it needs inside the APK
sed '/<base href="..\/">/d' "$GAME/info/file.html" > "$STAGE/index.html"
# Inline favicon so browsers do not request (and 404 on) /favicon.ico
FAV='<link rel="icon" href="data:image/svg+xml,%3Csvg xmlns=%27http://www.w3.org/2000/svg%27 viewBox=%270 0 32 32%27%3E%3Crect width=%2732%27 height=%2732%27 rx=%278%27 fill=%27%230b1430%27/%3E%3Cpath d=%27M8 16h14m-6-6 6 6-6 6%27 stroke=%27%2389b6ff%27 stroke-width=%273%27 fill=%27none%27 stroke-linecap=%27round%27 stroke-linejoin=%27round%27/%3E%3C/svg%3E">'
sed -i "s|</head>|${FAV}</head>|" "$STAGE/index.html"

cp "$ROOT/server-php/htaccess-site"    "$STAGE/.htaccess"
cp "$ROOT/server-php/robots.txt"       "$STAGE/robots.txt"
cp "$ROOT/server-php/htaccess-private" "$STAGE/_private/.htaccess"
cp "$ROOT/server-php/lib/level_tools.php" "$STAGE/_private/lib/"
cp "$ROOT/server-php/api.php"          "$STAGE/admin/api.php"
cp "$ROOT/server-php/htaccess-admin"   "$STAGE/admin/.htaccess"
for f in index.html app.js level-tools.js style.css; do cp "$ROOT/admin/public/$f" "$STAGE/admin/"; done

echo "Package: $(find "$STAGE" -type f | wc -l) files, $(du -sh "$STAGE" | cut -f1)  (live levels/texts $([ "$DATA" -eq 1 ] && echo 'WILL be overwritten' || echo 'kept as they are on the server'))"
if [ "$DRY" -eq 1 ]; then (cd "$STAGE" && find . -type f | sort | head -40); echo "(dry run, nothing uploaded)"; exit 0; fi

# --- Upload (tar over ssh, only into DEPLOY_PATH)
echo "Uploading to $DEPLOY_DOMAIN ..."
remote "set -e; cd '$DEPLOY_PATH'; mkdir -p _private/sessions _private/backups; chmod 700 _private/sessions _private/backups"
tar -C "$STAGE" -cf - . | remote "cd '$DEPLOY_PATH' && tar -xf -"
remote "cd '$DEPLOY_PATH' && find . -type d -exec chmod 755 {} + && find . -type f -exec chmod 644 {} + && chmod 700 _private/sessions _private/backups"

# --- First-time admin password
if [ "$INIT" -eq 1 ]; then
  PW="${DEPLOY_ADMIN_PASSWORD:-$(head -c 18 /dev/urandom | base64 | tr '+/' '-_' | tr -d '=')}"
  printf '%s' "$PW" | remote "cd '$DEPLOY_PATH' && php -r '\$h = password_hash(trim(fgets(STDIN)), PASSWORD_DEFAULT); file_put_contents(\"_private/config.php\", \"<?php\\nreturn \" . var_export([\"password_hash\" => \$h, \"allowed_hosts\" => [\"$DEPLOY_DOMAIN\"], \"require_https\" => true], true) . \";\\n\"); chmod(\"_private/config.php\", 0600);'"
  echo
  echo "Admin password (shown once, store it in a password manager): $PW"
fi

# --- Smoke test: use the real DNS name, or the server IP if the name does not resolve yet
CURL=(curl -s -m 20 -o /dev/null -w '%{http_code}')
if ! nslookup "$DEPLOY_DOMAIN" >/dev/null 2>&1 || nslookup "$DEPLOY_DOMAIN" 2>&1 | grep -qi "non-existent"; then
  echo "(DNS for $DEPLOY_DOMAIN does not resolve yet; testing through the server IP instead)"
  CURL+=(--resolve "$DEPLOY_DOMAIN:80:$DEPLOY_HOST")
fi
check() { printf '  %-28s %s (expected %s)\n' "$1" "$("${CURL[@]}" "http://$DEPLOY_DOMAIN$1")" "$2"; }
check /                       200
check /info/file.html         200
check /assets/levels/levels_0.json 200
check /admin/                 200
check /_private/config.php    403
check /_private/lib/level_tools.php 403
echo "Done."
