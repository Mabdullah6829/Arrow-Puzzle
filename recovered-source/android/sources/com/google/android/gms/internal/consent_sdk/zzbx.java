package com.google.android.gms.internal.consent_sdk;

import android.webkit.WebView;
import androidx.annotation.UiThread;

/* JADX INFO: loaded from: classes2.dex */
@UiThread
public final class zzbx extends WebView {

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ int f21604t = 0;

    /* JADX INFO: renamed from: s */
    public boolean f21605s;

    /* JADX INFO: renamed from: a */
    public final void m9120a(String str, String str2) {
        final String str3 = str + "(" + str2 + ");";
        new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbt
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue;
                zzbx zzbxVar = this.f21602s;
                String str4 = str3;
                synchronized (zzda.class) {
                    if (zzda.f21623a == null) {
                        try {
                            zzbxVar.evaluateJavascript("(function(){})()", null);
                            zzda.f21623a = Boolean.TRUE;
                        } catch (IllegalStateException unused) {
                            zzda.f21623a = Boolean.FALSE;
                        }
                        zBooleanValue = zzda.f21623a.booleanValue();
                    } else {
                        zBooleanValue = zzda.f21623a.booleanValue();
                    }
                    throw th;
                }
                if (zBooleanValue) {
                    zzbxVar.evaluateJavascript(str4, null);
                } else {
                    zzbxVar.loadUrl("javascript:".concat(str4));
                }
            }
        };
        throw null;
    }
}
