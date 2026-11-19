package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzcgv implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzcgy f9979s;

    public zzcgv(zzcgy zzcgyVar) {
        this.f9979s = zzcgyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcgy zzcgyVar = this.f9979s;
        zzchi zzchiVar = zzcgyVar.f9992I;
        if (zzchiVar != null) {
            if (!zzcgyVar.f9993J) {
                zzchiVar.m5444m();
                zzcgyVar.f9993J = true;
            }
            zzcgyVar.f9992I.m5438g();
        }
    }
}
