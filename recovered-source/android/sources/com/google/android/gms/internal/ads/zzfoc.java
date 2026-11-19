package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfoc implements zzimz {
    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzhcp zzhcvVar;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzgav(0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
        if (executorServiceUnconfigurableExecutorService instanceof zzhcp) {
            zzhcvVar = (zzhcp) executorServiceUnconfigurableExecutorService;
        } else {
            zzhcvVar = executorServiceUnconfigurableExecutorService instanceof ScheduledExecutorService ? new zzhcv((ScheduledExecutorService) executorServiceUnconfigurableExecutorService) : new zzhcr(executorServiceUnconfigurableExecutorService);
        }
        zzinh.m8554a(zzhcvVar);
        return zzhcvVar;
    }
}
