package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzcgu implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzcgy f9978s;

    public zzcgu(zzcgy zzcgyVar) {
        this.f9978s = zzcgyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcgy zzcgyVar = this.f9978s;
        zzchi zzchiVar = zzcgyVar.f9992I;
        if (zzchiVar != null) {
            zzchiVar.m5439h();
            zzcgyVar.f9992I.m5442k();
        }
    }
}
