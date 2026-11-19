package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfed implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzfey f15537a;

    /* JADX INFO: renamed from: b */
    public final zzini f15538b;

    /* JADX INFO: renamed from: c */
    public final zzini f15539c;

    public zzfed(zzfey zzfeyVar, zzimy zzimyVar, zzimy zzimyVar2) {
        this.f15537a = zzfeyVar;
        this.f15538b = zzimyVar;
        this.f15539c = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzfeb zzb() {
        zzinh.m8554a(this.f15537a.f15563a.f15561a.f9685v);
        new zzbgz();
        zzcfk zzcfkVar = (zzcfk) this.f15538b.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f15539c.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzfeb(zzcfkVar, scheduledExecutorService, zzhcpVar);
    }
}
