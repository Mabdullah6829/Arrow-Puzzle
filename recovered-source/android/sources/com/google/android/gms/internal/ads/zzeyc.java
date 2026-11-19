package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeyc implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f15139a;

    /* JADX INFO: renamed from: b */
    public final zzini f15140b;

    public zzeyc(zzimy zzimyVar, zzimy zzimyVar2) {
        this.f15139a = zzimyVar;
        this.f15140b = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzfkm((Clock) this.f15139a.zzb(), (zzdzt) this.f15140b.zzb());
    }
}
