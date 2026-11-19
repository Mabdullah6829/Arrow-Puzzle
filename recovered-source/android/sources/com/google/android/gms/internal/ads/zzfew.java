package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfew implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f15559a;

    /* JADX INFO: renamed from: b */
    public final zzini f15560b;

    public zzfew(zzcnz zzcnzVar, zzimy zzimyVar) {
        this.f15559a = zzimyVar;
        this.f15560b = zzcnzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        new zzbzm();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f15559a.zzb();
        ((zzcnz) this.f15560b).m5709a();
        return new zzfeu(scheduledExecutorService);
    }
}
