package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzchd implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzchi f10008s;

    public zzchd(zzchi zzchiVar) {
        this.f10008s = zzchiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10008s.m5434c("surfaceDestroyed", new String[0]);
    }
}
