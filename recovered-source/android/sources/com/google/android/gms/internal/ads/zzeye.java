package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeye implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzfci f15144a;

    /* JADX INFO: renamed from: b */
    public final zzini f15145b;

    /* JADX INFO: renamed from: c */
    public final zzini f15146c;

    public zzeye(zzfci zzfciVar, zzimy zzimyVar, zzimy zzimyVar2) {
        this.f15144a = zzfciVar;
        this.f15145b = zzimyVar;
        this.f15146c = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzfcg zzfcgVarZzb = this.f15144a.zzb();
        Clock clock = (Clock) this.f15145b.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzexg(zzfcgVarZzb, ((Long) zzbkm.f8989g.m5057c()).longValue(), clock, zzhcpVar, (zzdzt) this.f15146c.zzb());
    }
}
