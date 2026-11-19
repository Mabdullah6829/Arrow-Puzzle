package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfox implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f16218a;

    public zzfox(zzimy zzimyVar) {
        this.f16218a = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f16218a.zzb();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzfow(scheduledExecutorService, zzhcpVar);
    }
}
