package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdrh implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzdpc f12730a;

    /* JADX INFO: renamed from: b */
    public final zzini f12731b;

    public zzdrh(zzdpc zzdpcVar, zzimy zzimyVar) {
        this.f12730a = zzdpcVar;
        this.f12731b = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzdvf zzdvfVar = this.f12730a.f12523a.f12515b;
        zzinh.m8554a(zzdvfVar);
        return new zzdrg(zzdvfVar, (Clock) this.f12731b.zzb());
    }
}
