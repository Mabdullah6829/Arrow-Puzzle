package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class zzhcv extends zzhcr implements zzhcq {

    /* JADX INFO: renamed from: t */
    public final ScheduledExecutorService f18532t;

    public zzhcv(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f18532t = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzhcq, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: k */
    public final zzhco schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
        zzhde zzhdeVar = new zzhde(Executors.callable(runnable, null));
        return new zzhct(zzhdeVar, this.f18532t.schedule(zzhdeVar, j2, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzhcq, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: q */
    public final zzhco schedule(Callable callable, long j2, TimeUnit timeUnit) {
        zzhde zzhdeVar = new zzhde(callable);
        return new zzhct(zzhdeVar, this.f18532t.schedule(zzhdeVar, j2, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzhcq, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: t */
    public final zzhco scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        zzhcu zzhcuVar = new zzhcu(runnable);
        return new zzhct(zzhcuVar, this.f18532t.scheduleWithFixedDelay(zzhcuVar, j2, j3, timeUnit));
    }

    @Override // com.google.android.gms.internal.ads.zzhcq, java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: v */
    public final zzhco scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        zzhcu zzhcuVar = new zzhcu(runnable);
        return new zzhct(zzhcuVar, this.f18532t.scheduleAtFixedRate(zzhcuVar, j2, j3, timeUnit));
    }
}
