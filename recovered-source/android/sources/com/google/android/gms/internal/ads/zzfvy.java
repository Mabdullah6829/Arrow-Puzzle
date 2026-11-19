package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
final class zzfvy implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ WebView f16685s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ String f16686t;

    public zzfvy(zzfvz zzfvzVar, WebView webView, String str) {
        this.f16685s = webView;
        this.f16686t = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfvz.m6734b(this.f16685s, this.f16686t);
    }
}
