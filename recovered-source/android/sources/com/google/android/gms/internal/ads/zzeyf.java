package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeyf implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzfdi f15147a;

    /* JADX INFO: renamed from: b */
    public final zzini f15148b;

    /* JADX INFO: renamed from: c */
    public final zzini f15149c;

    public zzeyf(zzfdi zzfdiVar, zzimy zzimyVar, zzimy zzimyVar2) {
        this.f15147a = zzfdiVar;
        this.f15148b = zzimyVar;
        this.f15149c = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzfdh zzfdhVarZzb = this.f15147a.zzb();
        Clock clock = (Clock) this.f15148b.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzexg(zzfdhVarZzb, ((Long) zzbkm.f8990h.m5057c()).longValue(), clock, zzhcpVar, (zzdzt) this.f15149c.zzb());
    }
}
