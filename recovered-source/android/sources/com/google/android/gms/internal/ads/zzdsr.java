package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdsr implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f12826a;

    /* JADX INFO: renamed from: b */
    public final zzini f12827b;

    public zzdsr(zzini zziniVar, zzini zziniVar2) {
        this.f12826a = zziniVar;
        this.f12827b = zziniVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        com.google.android.gms.ads.internal.util.zzbl zzblVar = (com.google.android.gms.ads.internal.util.zzbl) this.f12826a.zzb();
        Clock clock = (Clock) this.f12827b.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzdsq(zzblVar, clock, zzhcpVar);
    }
}
