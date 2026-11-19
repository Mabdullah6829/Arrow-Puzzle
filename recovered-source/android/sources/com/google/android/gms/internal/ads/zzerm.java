package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
final class zzerm implements com.google.android.gms.ads.internal.zzg {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzcgd f14729a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzfky f14730b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzfkn f14731c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzert f14732d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzero f14733e;

    public zzerm(zzero zzeroVar, zzcgd zzcgdVar, zzfky zzfkyVar, zzfkn zzfknVar, zzert zzertVar) {
        this.f14729a = zzcgdVar;
        this.f14730b = zzfkyVar;
        this.f14731c = zzfknVar;
        this.f14732d = zzertVar;
        this.f14733e = zzeroVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    /* JADX INFO: renamed from: a */
    public final void mo3251a(View view) {
        zzert zzertVar = this.f14732d;
        zzerx zzerxVar = this.f14733e.f14739d;
        zzfky zzfkyVar = this.f14730b;
        zzfkn zzfknVar = this.f14731c;
        zzcgd zzcgdVar = this.f14729a;
        zzerv zzervVar = new zzerv(new zzeru(zzerxVar, zzfknVar), null);
        zzdmi zzdmiVarMo5777d = zzerxVar.f14750a.mo5777d(new zzcyq(zzfkyVar, zzfknVar, null), zzervVar);
        zzerw zzerwVar = new zzerw(zzerxVar, zzdmiVarMo5777d);
        synchronized (zzertVar) {
            zzertVar.f14747a = zzerwVar;
        }
        zzcgdVar.m5397a(zzdmiVarMo5777d.mo5769g());
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
    }
}
