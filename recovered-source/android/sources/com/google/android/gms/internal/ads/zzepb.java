package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzepb extends zzepa {

    /* JADX INFO: renamed from: a */
    public final zzcnq f14468a;

    /* JADX INFO: renamed from: b */
    public final zzdci f14469b;

    /* JADX INFO: renamed from: c */
    public final zzdiz f14470c;

    /* JADX INFO: renamed from: d */
    public final zzepl f14471d;

    /* JADX INFO: renamed from: e */
    public final zzemf f14472e;

    public zzepb(zzcnq zzcnqVar, zzdci zzdciVar, zzdiz zzdizVar, zzepl zzeplVar, zzemf zzemfVar) {
        this.f14468a = zzcnqVar;
        this.f14469b = zzdciVar;
        this.f14470c = zzdizVar;
        this.f14471d = zzeplVar;
        this.f14472e = zzemfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepa
    /* JADX INFO: renamed from: c */
    public final zzfoz mo6305c(zzflg zzflgVar, Bundle bundle, zzfkn zzfknVar, zzfky zzfkyVar) {
        zzdci zzdciVar = this.f14469b;
        zzdciVar.f12022b = zzflgVar;
        zzdciVar.f12023c = bundle;
        zzdciVar.f12025e = new zzdcc(zzfkyVar, zzfknVar, this.f14471d);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8797v4)).booleanValue()) {
            zzdciVar.f12026f = this.f14472e;
        }
        zzcvf zzcvfVarMo5695n = this.f14468a.mo5695n();
        ((zzcpg) zzcvfVarMo5695n).f10852e = new zzdcj(zzdciVar);
        zzcpg zzcpgVar = (zzcpg) zzcvfVarMo5695n;
        zzcpgVar.f10851d = this.f14470c;
        zzcze zzczeVarZza = ((zzcph) zzcpgVar.zzh()).zza();
        return zzczeVarZza.m5877c(zzczeVarZza.m5876b());
    }
}
