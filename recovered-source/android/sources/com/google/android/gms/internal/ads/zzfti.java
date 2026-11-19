package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfti {

    /* JADX INFO: renamed from: a */
    public final zzfsx f16488a;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f16489b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public volatile ScheduledFuture f16490c;

    /* JADX INFO: renamed from: d */
    public final zzful f16491d;

    public zzfti(final zzfsx zzfsxVar, ScheduledExecutorService scheduledExecutorService, long j2, final zzful zzfulVar) {
        this.f16491d = zzfulVar;
        this.f16488a = zzfsxVar;
        if (j2 > 0) {
            this.f16490c = scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfth
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    if (this.f16485s.f16489b.compareAndSet(false, true)) {
                        zzfsxVar.m6646b(zzfulVar, true);
                    }
                }
            }, j2, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6668a() {
        if (this.f16489b.compareAndSet(false, true)) {
            if (this.f16490c != null) {
                this.f16490c.cancel(false);
            }
            this.f16488a.m6646b(this.f16491d, false);
        }
    }
}
