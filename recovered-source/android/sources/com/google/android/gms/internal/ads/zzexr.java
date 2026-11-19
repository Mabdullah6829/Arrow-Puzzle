package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzexr implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzfde f15108a;

    /* JADX INFO: renamed from: b */
    public final zzini f15109b;

    /* JADX INFO: renamed from: c */
    public final zzini f15110c;

    public zzexr(zzfde zzfdeVar, zzimy zzimyVar, zzimy zzimyVar2) {
        this.f15108a = zzfdeVar;
        this.f15109b = zzimyVar;
        this.f15110c = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzfdd zzfddVarZzb = this.f15108a.zzb();
        Clock clock = (Clock) this.f15109b.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzexg(zzfddVarZzb, ((Long) zzbkm.f8986d.m5057c()).longValue(), clock, zzhcpVar, (zzdzt) this.f15110c.zzb());
    }
}
