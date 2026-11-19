package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeyd implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzfbh f15141a;

    /* JADX INFO: renamed from: b */
    public final zzini f15142b;

    /* JADX INFO: renamed from: c */
    public final zzini f15143c;

    public zzeyd(zzfbh zzfbhVar, zzimy zzimyVar, zzimy zzimyVar2) {
        this.f15141a = zzfbhVar;
        this.f15142b = zzimyVar;
        this.f15143c = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzfbf zzfbfVarZzb = this.f15141a.zzb();
        Clock clock = (Clock) this.f15142b.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzexg(zzfbfVarZzb, 2147483647L, clock, zzhcpVar, (zzdzt) this.f15143c.zzb());
    }
}
