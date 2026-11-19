package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class zzc implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zze f3925s;

    @Override // java.lang.Runnable
    public final void run() {
        WebViewClient webViewClient;
        zze zzeVar = this.f3925s;
        synchronized (zzeVar.f3929c) {
            WebView webView = zzeVar.f3932f;
            if (webView == null) {
                return;
            }
            try {
                com.google.android.gms.ads.internal.util.zzs zzsVar = com.google.android.gms.ads.internal.zzt.f3698C.f3703c;
                if (Build.VERSION.SDK_INT < 26) {
                    if (WebViewFeature.isFeatureSupported(WebViewFeature.GET_WEB_VIEW_CLIENT)) {
                        try {
                            webViewClient = WebViewCompat.getWebViewClient(webView);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("AdUtil.getWebViewClient", e);
                        }
                    }
                    throw new IllegalStateException("getWebViewClient not supported");
                }
                webViewClient = webView.getWebViewClient();
                if (webViewClient == zzeVar) {
                    return;
                }
                if (webViewClient != null) {
                    zzeVar.f3931e = webViewClient;
                }
                webView.setWebViewClient(zzeVar);
                zzeVar.m3333b();
            } catch (IllegalStateException unused) {
            }
        }
    }
}
