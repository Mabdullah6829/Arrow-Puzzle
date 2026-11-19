package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import p001B.InterfaceC0097w;
import p011H.EnumC0244H;
import p011H.ExecutorServiceC0267c0;
import p011H.InterfaceScheduledExecutorServiceC0260Y;
import p011H.RunnableFutureC0281j0;
import p011H.ScheduledFutureC0263a0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqi implements zzqm {

    /* JADX INFO: renamed from: d */
    public static boolean f22771d;

    /* JADX INFO: renamed from: a */
    public final InterfaceC0097w f22772a;

    /* JADX INFO: renamed from: b */
    public final int f22773b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0097w f22774c;

    public zzqi(InterfaceC0097w interfaceC0097w) {
        zzqh zzqhVar = zzqh.f22770s;
        this.f22772a = interfaceC0097w;
        this.f22773b = Math.max(5, 10);
        this.f22774c = zzqhVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzqm
    public final void zza() {
        synchronized (zzqi.class) {
            try {
                if (!f22771d) {
                    zzqg zzqgVar = new zzqg(this);
                    long j2 = this.f22773b;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    InterfaceScheduledExecutorServiceC0260Y interfaceScheduledExecutorServiceC0260Y = (InterfaceScheduledExecutorServiceC0260Y) this.f22772a.get();
                    zzqf zzqfVar = new zzqf(this, zzqgVar, interfaceScheduledExecutorServiceC0260Y, j2);
                    ExecutorServiceC0267c0 executorServiceC0267c0 = (ExecutorServiceC0267c0) interfaceScheduledExecutorServiceC0260Y;
                    executorServiceC0267c0.getClass();
                    RunnableFutureC0281j0 runnableFutureC0281j0 = new RunnableFutureC0281j0(Executors.callable(zzqfVar, null));
                    ScheduledFutureC0263a0 scheduledFutureC0263a0 = new ScheduledFutureC0263a0(runnableFutureC0281j0, executorServiceC0267c0.f520t.schedule(runnableFutureC0281j0, j2, timeUnit));
                    scheduledFutureC0263a0.addListener(new zzpw(scheduledFutureC0263a0), EnumC0244H.f483s);
                    f22771d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
