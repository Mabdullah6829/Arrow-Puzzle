package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfow implements zzbfr {

    /* JADX INFO: renamed from: s */
    public final ScheduledExecutorService f16214s;

    /* JADX INFO: renamed from: t */
    public final Executor f16215t;

    /* JADX INFO: renamed from: u */
    public final HashMap f16216u = new HashMap();

    /* JADX INFO: renamed from: v */
    public boolean f16217v = false;

    public zzfow(ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f16214s = scheduledExecutorService;
        this.f16215t = executor;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m6550a(Runnable runnable, long j2) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        synchronized (this) {
            try {
                if (!this.f16217v) {
                    com.google.android.gms.ads.internal.zzt.f3698C.f3707g.m4852b(this);
                    this.f16217v = true;
                }
                com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                final zzfov zzfovVar = new zzfov(this, runnable, System.currentTimeMillis() + timeUnit.toMillis(j2));
                ScheduledFuture<?> scheduledFutureSchedule = this.f16214s.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfot
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzfov zzfovVar2;
                        zzfov zzfovVar3 = zzfovVar;
                        zzfow zzfowVar = zzfovVar3.f16213d;
                        synchronized (zzfowVar) {
                            try {
                                ScheduledFuture scheduledFuture = zzfovVar3.f16212c;
                                zzfovVar2 = scheduledFuture != null ? (zzfov) zzfowVar.f16216u.remove(scheduledFuture) : null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (zzfovVar2 != null) {
                            zzfovVar3.f16213d.f16215t.execute(zzfovVar3.f16210a);
                        }
                    }
                }, j2, timeUnit);
                zzfovVar.f16212c = scheduledFutureSchedule;
                this.f16216u.put(scheduledFutureSchedule, zzfovVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfr
    /* JADX INFO: renamed from: k0 */
    public final void mo2997k0(boolean z) {
        if (z) {
            this.f16215t.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfou
                @Override // java.lang.Runnable
                public final void run() {
                    zzfow zzfowVar = this.f16209s;
                    synchronized (zzfowVar) {
                        HashMap map = zzfowVar.f16216u;
                        ArrayList arrayList = new ArrayList(map.keySet());
                        int size = arrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ScheduledFuture scheduledFuture = (ScheduledFuture) arrayList.get(i2);
                            zzfov zzfovVar = (zzfov) map.get(scheduledFuture);
                            if (zzfovVar != null && scheduledFuture != null && !scheduledFuture.isDone()) {
                                scheduledFuture.cancel(false);
                                map.remove(scheduledFuture);
                                com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                                long jCurrentTimeMillis = zzfovVar.f16211b - System.currentTimeMillis();
                                Runnable runnable = zzfovVar.f16210a;
                                long jMax = Math.max(0L, jCurrentTimeMillis);
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                zzfowVar.m6550a(runnable, jMax);
                            }
                        }
                    }
                }
            });
        }
    }
}
