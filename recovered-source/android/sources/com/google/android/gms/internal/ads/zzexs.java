package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzexs implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzeuk f15111a;

    /* JADX INFO: renamed from: b */
    public final zzini f15112b;

    /* JADX INFO: renamed from: c */
    public final zzini f15113c;

    public zzexs(zzeuk zzeukVar, zzimy zzimyVar, zzimy zzimyVar2) {
        this.f15111a = zzeukVar;
        this.f15112b = zzimyVar;
        this.f15113c = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzeui zzeuiVar = new zzeui(((zzcnz) this.f15111a.f14909a).m5709a());
        Clock clock = (Clock) this.f15112b.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzexg(zzeuiVar, 2147483647L, clock, zzhcpVar, (zzdzt) this.f15113c.zzb());
    }
}
