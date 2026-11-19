package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzexp implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzewz f15102a;

    /* JADX INFO: renamed from: b */
    public final zzini f15103b;

    /* JADX INFO: renamed from: c */
    public final zzini f15104c;

    public zzexp(zzewz zzewzVar, zzimy zzimyVar, zzimy zzimyVar2) {
        this.f15102a = zzewzVar;
        this.f15103b = zzimyVar;
        this.f15104c = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        zzewx zzewxVar = new zzewx(this.f15102a.f15074a.m5709a(), zzhcpVar);
        Clock clock = (Clock) this.f15103b.zzb();
        zzinh.m8554a(zzhcpVar);
        return new zzexg(zzewxVar, ((Long) zzbkm.f8985c.m5057c()).longValue(), clock, zzhcpVar, (zzdzt) this.f15104c.zzb());
    }
}
