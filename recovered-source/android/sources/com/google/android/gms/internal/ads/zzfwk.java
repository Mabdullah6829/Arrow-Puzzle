package com.google.android.gms.internal.ads;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.datastore.preferences.protobuf.AbstractC1456a;

/* JADX INFO: loaded from: classes2.dex */
final class zzfwk extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzfwm f16706a;

    public zzfwk(zzfwm zzfwmVar) {
        this.f16706a = zzfwmVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        String string = renderProcessGoneDetail.toString();
        String strValueOf = String.valueOf(webView);
        Log.w("NativeBridge", AbstractC1456a.m2451r(new StringBuilder(String.valueOf(string).length() + 36 + strValueOf.length()), "WebView renderer gone: ", string, "for WebView: ", strValueOf));
        zzfwm zzfwmVar = this.f16706a;
        if (zzfwmVar.m6743c() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            zzfwmVar.f16703b = new zzfxk(null);
        }
        webView.destroy();
        return true;
    }
}
