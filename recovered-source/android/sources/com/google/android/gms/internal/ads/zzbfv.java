package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
final class zzbfv implements Runnable {

    /* JADX INFO: renamed from: s */
    public final ValueCallback f7780s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ WebView f7781t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ zzbfx f7782u;

    public zzbfv(zzbfx zzbfxVar, zzbfn zzbfnVar, WebView webView, boolean z) {
        this.f7781t = webView;
        this.f7782u = zzbfxVar;
        this.f7780s = new zzbfu(this, zzbfnVar, webView, z);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ValueCallback<String> valueCallback = this.f7780s;
        WebView webView = this.f7781t;
        if (webView.getSettings().getJavaScriptEnabled()) {
            try {
                webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", valueCallback);
            } catch (Throwable unused) {
                ((zzbfu) valueCallback).onReceiveValue("");
            }
        }
    }
}
