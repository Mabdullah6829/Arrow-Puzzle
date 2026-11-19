package com.google.android.gms.internal.consent_sdk;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzcd implements zzd {
    /* JADX INFO: renamed from: a */
    public final void m9121a(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        uri.getQueryParameter("action");
        uri.getQueryParameter("args");
        throw null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.consent_sdk.zzd
    /* JADX INFO: renamed from: j */
    public final boolean mo9116j(JSONObject jSONObject, String str) {
        byte b;
        byte b2 = -1;
        switch (str) {
            case "load_complete":
                b = 0;
                break;
            case "configure_app_assets":
                b = 3;
                break;
            case "browser":
                b = 2;
                break;
            case "dismiss":
                b = 1;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            throw null;
        }
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    return false;
                }
                new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzcc
                    @Override // java.lang.Runnable
                    public final void run() {
                        new JSONObject();
                        throw null;
                    }
                };
                throw null;
            }
            String strOptString = jSONObject.optString("url");
            if (TextUtils.isEmpty(strOptString)) {
                Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
            }
            Uri uri = Uri.parse(strOptString);
            if (uri.getScheme() == null) {
                Log.d("UserMessagingPlatform", "Action[browser]: empty scheme: ".concat(String.valueOf(strOptString)));
            }
            try {
                new Intent("android.intent.action.VIEW", uri);
                throw null;
            } catch (ActivityNotFoundException e) {
                Log.d("UserMessagingPlatform", "Action[browser]: can not open url: ".concat(String.valueOf(strOptString)), e);
                return true;
            }
        }
        String strOptString2 = jSONObject.optString(NotificationCompat.CATEGORY_STATUS);
        switch (strOptString2.hashCode()) {
            case -954325659:
                if (strOptString2.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                    b2 = 3;
                }
                break;
            case -258041904:
                if (strOptString2.equals("personalized")) {
                    b2 = 0;
                }
                break;
            case 429411856:
                if (strOptString2.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                    b2 = 4;
                }
                break;
            case 467888915:
                if (strOptString2.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                    b2 = 1;
                }
                break;
            case 1666911234:
                if (strOptString2.equals("non_personalized")) {
                    b2 = 2;
                }
                break;
            case 1725474845:
                if (strOptString2.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                    b2 = 5;
                }
                break;
        }
        if (b2 == 0 || b2 == 1 || b2 == 2 || b2 == 3 || b2 == 4 || b2 == 5) {
            throw null;
        }
        new zzg(1, "We are getting something wrong with the webview.");
        throw null;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public final Executor zza() {
        Objects.requireNonNull(null);
        throw null;
    }
}
