package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeoy extends zzepa {

    /* JADX INFO: renamed from: a */
    public final zzcnq f14454a;

    /* JADX INFO: renamed from: b */
    public final zzdof f14455b;

    /* JADX INFO: renamed from: c */
    public final zzdci f14456c;

    /* JADX INFO: renamed from: d */
    public final zzdiz f14457d;

    /* JADX INFO: renamed from: e */
    public final zzepl f14458e;

    /* JADX INFO: renamed from: f */
    public final zzemf f14459f;

    public zzeoy(zzcnq zzcnqVar, zzdof zzdofVar, zzdci zzdciVar, zzdiz zzdizVar, zzepl zzeplVar, zzemf zzemfVar) {
        this.f14454a = zzcnqVar;
        this.f14455b = zzdofVar;
        this.f14456c = zzdciVar;
        this.f14457d = zzdizVar;
        this.f14458e = zzeplVar;
        this.f14459f = zzemfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepa
    /* JADX INFO: renamed from: c */
    public final zzfoz mo6305c(zzflg zzflgVar, Bundle bundle, zzfkn zzfknVar, zzfky zzfkyVar) {
        zzdci zzdciVar = this.f14456c;
        zzdciVar.f12022b = zzflgVar;
        zzdciVar.f12023c = bundle;
        zzdciVar.f12025e = new zzdcc(zzfkyVar, zzfknVar, this.f14458e);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8797v4)).booleanValue()) {
            zzdciVar.f12026f = this.f14459f;
        }
        zzdoj zzdojVarMo5699r = this.f14454a.mo5699r();
        ((zzcpb) zzdojVarMo5699r).f10660e = new zzdcj(zzdciVar);
        zzcpb zzcpbVar = (zzcpb) zzdojVarMo5699r;
        zzcpbVar.f10659d = this.f14457d;
        zzcpbVar.f10661f = this.f14455b;
        zzcpbVar.f10662g = new zzcvp(null);
        zzcze zzczeVarMo5725a = zzcpbVar.zzh().mo5725a();
        return zzczeVarMo5725a.m5877c(zzczeVarMo5725a.m5876b());
    }
}
