package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
final class zzerw implements com.google.android.gms.ads.internal.zzg {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzdmi f14749a;

    public zzerw(zzerx zzerxVar, zzdmi zzdmiVar) {
        this.f14749a = zzdmiVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    /* JADX INFO: renamed from: a */
    public final void mo3251a(View view) {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        this.f14749a.mo5767b().mo2730k();
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        zzdmi zzdmiVar = this.f14749a;
        zzdmiVar.mo5734c().m5905u();
        zzdli zzdliVarMo5768d = zzdmiVar.mo5768d();
        synchronized (zzdliVarMo5768d) {
            zzdliVarMo5768d.m5923J0(zzdlh.f12305a);
        }
    }
}
