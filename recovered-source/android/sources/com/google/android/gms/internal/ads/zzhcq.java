package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public interface zzhcq extends ScheduledExecutorService, zzhcp, AutoCloseable {
    @Override // com.google.android.gms.internal.ads.zzhcp, java.lang.AutoCloseable
    /* synthetic */ default void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    zzhco schedule(Runnable runnable, long j2, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    zzhco schedule(Callable callable, long j2, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    zzhco scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit);

    @Override // java.util.concurrent.ScheduledExecutorService
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    zzhco scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit);
}
