package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzext implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzewb f15114a;

    /* JADX INFO: renamed from: b */
    public final zzini f15115b;

    /* JADX INFO: renamed from: c */
    public final zzini f15116c;

    public zzext(zzewb zzewbVar, zzimy zzimyVar, zzimy zzimyVar2) {
        this.f15114a = zzewbVar;
        this.f15115b = zzimyVar;
        this.f15116c = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzevz zzevzVarZzb = this.f15114a.zzb();
        Clock clock = (Clock) this.f15115b.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzexg(zzevzVarZzb, ((Long) zzbkm.f8983a.m5057c()).longValue(), clock, zzhcpVar, (zzdzt) this.f15116c.zzb());
    }
}
