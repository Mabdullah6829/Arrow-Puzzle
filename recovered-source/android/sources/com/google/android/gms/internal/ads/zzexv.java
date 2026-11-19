package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzexv implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzews f15120a;

    /* JADX INFO: renamed from: b */
    public final zzini f15121b;

    /* JADX INFO: renamed from: c */
    public final zzini f15122c;

    public zzexv(zzews zzewsVar, zzimy zzimyVar, zzimy zzimyVar2) {
        this.f15120a = zzewsVar;
        this.f15121b = zzimyVar;
        this.f15122c = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzewq zzewqVarZzb = this.f15120a.zzb();
        Clock clock = (Clock) this.f15121b.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzexg(zzewqVarZzb, ((Long) zzbkm.f8984b.m5057c()).longValue(), clock, zzhcpVar, (zzdzt) this.f15122c.zzb());
    }
}
