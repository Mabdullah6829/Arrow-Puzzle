package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcuz implements zzbfr {

    /* JADX INFO: renamed from: s */
    public final ScheduledExecutorService f11533s;

    /* JADX INFO: renamed from: t */
    public final Clock f11534t;

    /* JADX INFO: renamed from: u */
    public ScheduledFuture f11535u;

    /* JADX INFO: renamed from: v */
    public long f11536v = -1;

    /* JADX INFO: renamed from: w */
    public long f11537w = -1;

    /* JADX INFO: renamed from: x */
    public Runnable f11538x = null;

    /* JADX INFO: renamed from: y */
    public boolean f11539y = false;

    public zzcuz(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        this.f11533s = scheduledExecutorService;
        this.f11534t = clock;
        com.google.android.gms.ads.internal.zzt.f3698C.f3707g.m4852b(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbfr
    /* JADX INFO: renamed from: k0 */
    public final void mo2997k0(boolean z) {
        ScheduledFuture scheduledFuture;
        if (z) {
            synchronized (this) {
                try {
                    if (this.f11539y) {
                        if (this.f11537w > 0 && (scheduledFuture = this.f11535u) != null && scheduledFuture.isCancelled()) {
                            this.f11535u = this.f11533s.schedule(this.f11538x, this.f11537w, TimeUnit.MILLISECONDS);
                        }
                        this.f11539y = false;
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (this) {
            try {
                if (this.f11539y) {
                    return;
                }
                ScheduledFuture scheduledFuture2 = this.f11535u;
                if (scheduledFuture2 == null || scheduledFuture2.isDone()) {
                    this.f11537w = -1L;
                } else {
                    this.f11535u.cancel(true);
                    this.f11537w = this.f11536v - this.f11534t.mo3639a();
                }
                this.f11539y = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
