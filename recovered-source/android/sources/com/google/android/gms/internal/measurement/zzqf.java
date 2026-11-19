package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import p011H.EnumC0244H;
import p011H.ExecutorServiceC0267c0;
import p011H.InterfaceScheduledExecutorServiceC0260Y;
import p011H.RunnableFutureC0281j0;
import p011H.ScheduledFutureC0263a0;

/* JADX INFO: loaded from: classes2.dex */
final class zzqf implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Runnable f22766s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceScheduledExecutorServiceC0260Y f22767t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ long f22768u;

    public zzqf(zzqi zzqiVar, Runnable runnable, InterfaceScheduledExecutorServiceC0260Y interfaceScheduledExecutorServiceC0260Y, long j2) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f22766s = runnable;
        this.f22767t = interfaceScheduledExecutorServiceC0260Y;
        this.f22768u = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((zzqg) this.f22766s).run();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        ExecutorServiceC0267c0 executorServiceC0267c0 = (ExecutorServiceC0267c0) this.f22767t;
        executorServiceC0267c0.getClass();
        RunnableFutureC0281j0 runnableFutureC0281j0 = new RunnableFutureC0281j0(Executors.callable(this, null));
        ScheduledFutureC0263a0 scheduledFutureC0263a0 = new ScheduledFutureC0263a0(runnableFutureC0281j0, executorServiceC0267c0.f520t.schedule(runnableFutureC0281j0, this.f22768u, timeUnit));
        scheduledFutureC0263a0.addListener(new zzpw(scheduledFutureC0263a0), EnumC0244H.f483s);
    }
}
