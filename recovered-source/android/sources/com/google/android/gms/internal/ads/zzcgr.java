package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzcgr implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ String f9971s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ String f9972t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ zzcgy f9973u;

    public zzcgr(zzcgy zzcgyVar, String str, String str2) {
        this.f9971s = str;
        this.f9972t = str2;
        this.f9973u = zzcgyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzchi zzchiVar = this.f9973u.f9992I;
        if (zzchiVar != null) {
            zzchiVar.m5441j(this.f9971s, this.f9972t);
        }
    }
}
