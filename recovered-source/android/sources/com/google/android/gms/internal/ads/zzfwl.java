package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes2.dex */
final class zzfwl implements Runnable {

    /* JADX INFO: renamed from: s */
    public final WebView f16707s;

    public zzfwl(zzfwm zzfwmVar) {
        this.f16707s = zzfwmVar.f16708e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16707s.destroy();
    }
}
