package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzepf extends zzepa {

    /* JADX INFO: renamed from: a */
    public final zzcnq f14498a;

    /* JADX INFO: renamed from: b */
    public final zzdci f14499b;

    /* JADX INFO: renamed from: c */
    public final zzerq f14500c;

    /* JADX INFO: renamed from: d */
    public final zzdiz f14501d;

    /* JADX INFO: renamed from: e */
    public final zzepl f14502e;

    /* JADX INFO: renamed from: f */
    public final zzemf f14503f;

    public zzepf(zzcnq zzcnqVar, zzdci zzdciVar, zzerq zzerqVar, zzdiz zzdizVar, zzepl zzeplVar, zzemf zzemfVar) {
        this.f14498a = zzcnqVar;
        this.f14499b = zzdciVar;
        this.f14500c = zzerqVar;
        this.f14501d = zzdizVar;
        this.f14502e = zzeplVar;
        this.f14503f = zzemfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepa
    /* JADX INFO: renamed from: c */
    public final zzfoz mo6305c(zzflg zzflgVar, Bundle bundle, zzfkn zzfknVar, zzfky zzfkyVar) {
        zzdci zzdciVar = this.f14499b;
        zzdciVar.f12022b = zzflgVar;
        zzdciVar.f12023c = bundle;
        zzdciVar.f12025e = new zzdcc(zzfkyVar, zzfknVar, this.f14502e);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8797v4)).booleanValue()) {
            zzdciVar.f12026f = this.f14503f;
        }
        zzdnn zzdnnVarMo5697p = this.f14498a.mo5697p();
        ((zzcpw) zzdnnVarMo5697p).f11075e = new zzdcj(zzdciVar);
        zzcpw zzcpwVar = (zzcpw) zzdnnVarMo5697p;
        zzcpwVar.f11074d = this.f14501d;
        zzcpwVar.f11076f = this.f14500c;
        zzcze zzczeVarMo5775b = zzcpwVar.zzh().mo5775b();
        return zzczeVarMo5775b.m5877c(zzczeVarMo5775b.m5876b());
    }
}
