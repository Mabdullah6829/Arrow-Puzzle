package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgdf implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzina f17013a;

    public zzgdf(zzina zzinaVar) {
        this.f17013a = zzinaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzhcp zzhcvVar;
        ExecutorService executorService = (ExecutorService) this.f17013a.f20011a;
        if (executorService instanceof zzhcp) {
            zzhcvVar = (zzhcp) executorService;
        } else {
            zzhcvVar = executorService instanceof ScheduledExecutorService ? new zzhcv((ScheduledExecutorService) executorService) : new zzhcr(executorService);
        }
        zzinh.m8554a(zzhcvVar);
        return zzhcvVar;
    }
}
