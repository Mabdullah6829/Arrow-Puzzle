package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzcgt implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f9975s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ int f9976t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ zzcgy f9977u;

    public zzcgt(zzcgy zzcgyVar, int i2, int i3) {
        this.f9975s = i2;
        this.f9976t = i3;
        this.f9977u = zzcgyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzchi zzchiVar = this.f9977u.f9992I;
        if (zzchiVar != null) {
            zzchiVar.m5443l(this.f9975s, this.f9976t);
        }
    }
}
