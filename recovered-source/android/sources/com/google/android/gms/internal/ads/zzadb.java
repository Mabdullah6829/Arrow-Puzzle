package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
final class zzadb implements zzaet {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzadg f4954b;

    public zzadb(zzadg zzadgVar) {
        this.f4954b = zzadgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final void zza() {
        zznb zznbVar = this.f4954b.f21176b0;
        if (zznbVar != null) {
            zznbVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final void zzb() {
        zzadg zzadgVar = this.f4954b;
        Surface surface = zzadgVar.f4999o1;
        if (surface != null) {
            zzaeq zzaeqVar = zzadgVar.f4984Z0;
            Handler handler = zzaeqVar.f5132a;
            if (handler != null) {
                handler.post(new zzaek(zzaeqVar, surface, SystemClock.elapsedRealtime()));
            }
            zzadgVar.f5002r1 = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaet
    public final void zzc() {
        zzadg zzadgVar = this.f4954b;
        if (zzadgVar.f4999o1 != null) {
            zzadgVar.m3984J0(0, 1);
        }
    }
}
