package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzen implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzeo f14257s;

    public /* synthetic */ zzen(zzeo zzeoVar) {
        this.f14257s = zzeoVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        zzeo zzeoVar = this.f14257s;
        zzem zzemVar = (zzem) zzeoVar.f14361a.get();
        if (zzemVar != null) {
            zzemVar.zza(zzeoVar.f14363c.m6321b());
        }
    }
}
