package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzexu implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzewo f15117a;

    /* JADX INFO: renamed from: b */
    public final zzini f15118b;

    /* JADX INFO: renamed from: c */
    public final zzini f15119c;

    public zzexu(zzewo zzewoVar, zzimy zzimyVar, zzimy zzimyVar2) {
        this.f15117a = zzewoVar;
        this.f15118b = zzimyVar;
        this.f15119c = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzewm zzewmVarZzb = this.f15117a.zzb();
        Clock clock = (Clock) this.f15118b.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzexg(zzewmVarZzb, 2147483647L, clock, zzhcpVar, (zzdzt) this.f15119c.zzb());
    }
}
