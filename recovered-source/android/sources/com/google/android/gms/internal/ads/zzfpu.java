package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfpu implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f16275a;

    /* JADX INFO: renamed from: b */
    public final zzfpv f16276b;

    public zzfpu(zzimy zzimyVar, zzfpv zzfpvVar) {
        this.f16275a = zzimyVar;
        this.f16276b = zzfpvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzfps(zzhcpVar, (ScheduledExecutorService) this.f16275a.zzb(), new zzfpr(this.f16276b.f16277a.zzb()));
    }
}
