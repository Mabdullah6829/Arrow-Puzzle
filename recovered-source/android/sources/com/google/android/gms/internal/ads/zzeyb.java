package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeyb implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f15137a;

    /* JADX INFO: renamed from: b */
    public final zzini f15138b;

    public zzeyb(zzimy zzimyVar, zzimy zzimyVar2) {
        this.f15137a = zzimyVar;
        this.f15138b = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        zzfal zzfalVar = new zzfal(zzhcpVar);
        Clock clock = (Clock) this.f15137a.zzb();
        zzinh.m8554a(zzhcpVar);
        return new zzexg(zzfalVar, ((Long) zzbkm.f8988f.m5057c()).longValue(), clock, zzhcpVar, (zzdzt) this.f15138b.zzb());
    }
}
