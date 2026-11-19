package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzche implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ boolean f10009s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzchi f10010t;

    public zzche(zzchi zzchiVar, boolean z) {
        this.f10009s = z;
        this.f10010t = zzchiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10010t.m5434c("windowVisibilityChanged", "isVisible", String.valueOf(this.f10009s));
    }
}
