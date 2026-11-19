package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeph extends zzepa {

    /* JADX INFO: renamed from: a */
    public final zzcnq f14510a;

    /* JADX INFO: renamed from: b */
    public final zzdci f14511b;

    /* JADX INFO: renamed from: c */
    public final zzdiz f14512c;

    /* JADX INFO: renamed from: d */
    public final zzepl f14513d;

    /* JADX INFO: renamed from: e */
    public final zzfkz f14514e;

    /* JADX INFO: renamed from: f */
    public final zzemf f14515f;

    public zzeph(zzcnq zzcnqVar, zzdci zzdciVar, zzdiz zzdizVar, zzfkz zzfkzVar, zzepl zzeplVar, zzemf zzemfVar) {
        this.f14510a = zzcnqVar;
        this.f14511b = zzdciVar;
        this.f14512c = zzdizVar;
        this.f14514e = zzfkzVar;
        this.f14513d = zzeplVar;
        this.f14515f = zzemfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzepa
    /* JADX INFO: renamed from: c */
    public final zzfoz mo6305c(zzflg zzflgVar, Bundle bundle, zzfkn zzfknVar, zzfky zzfkyVar) {
        zzfkz zzfkzVar;
        zzdci zzdciVar = this.f14511b;
        zzdciVar.f12022b = zzflgVar;
        zzdciVar.f12023c = bundle;
        zzdciVar.f12025e = new zzdcc(zzfkyVar, zzfknVar, this.f14513d);
        zzbio zzbioVar = zzbix.f8780u4;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() && (zzfkzVar = this.f14514e) != null) {
            zzdciVar.f12024d = zzfkzVar;
        }
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8797v4)).booleanValue()) {
            zzdciVar.f12026f = this.f14515f;
        }
        zzdvy zzdvyVarMo5700s = this.f14510a.mo5700s();
        ((zzcqh) zzdvyVarMo5700s).f11180e = new zzdcj(zzdciVar);
        zzcqh zzcqhVar = (zzcqh) zzdvyVarMo5700s;
        zzcqhVar.f11179d = this.f14512c;
        zzcze zzczeVarZza = ((zzcqi) zzcqhVar.zzh()).zza();
        return zzczeVarZza.m5877c(zzczeVarZza.m5876b());
    }
}
