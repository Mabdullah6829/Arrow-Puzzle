package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzcgq implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzcgy f9970s;

    public zzcgq(zzcgy zzcgyVar) {
        this.f9970s = zzcgyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzchi zzchiVar = this.f9970s.f9992I;
        if (zzchiVar != null) {
            zzchiVar.m5440i();
        }
    }
}
