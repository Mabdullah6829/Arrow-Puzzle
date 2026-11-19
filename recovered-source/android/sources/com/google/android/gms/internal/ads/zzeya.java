package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeya implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzfaf f15134a;

    /* JADX INFO: renamed from: b */
    public final zzini f15135b;

    /* JADX INFO: renamed from: c */
    public final zzini f15136c;

    public zzeya(zzfaf zzfafVar, zzimy zzimyVar, zzimy zzimyVar2) {
        this.f15134a = zzfafVar;
        this.f15135b = zzimyVar;
        this.f15136c = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzfad zzfadVarZzb = this.f15134a.zzb();
        Clock clock = (Clock) this.f15135b.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzexg(zzfadVarZzb, ((Long) zzbkm.f8987e.m5057c()).longValue(), clock, zzhcpVar, (zzdzt) this.f15136c.zzb());
    }
}
