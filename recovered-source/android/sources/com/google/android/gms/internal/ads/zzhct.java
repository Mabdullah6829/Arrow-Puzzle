package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class zzhct extends zzhca implements zzhco {

    /* JADX INFO: renamed from: t */
    public final ScheduledFuture f18530t;

    public zzhct(zzhay zzhayVar, ScheduledFuture scheduledFuture) {
        super(zzhayVar);
        this.f18530t = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzhbz, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = this.f18513s.cancel(z);
        if (zCancel) {
            this.f18530t.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f18530t.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f18530t.getDelay(timeUnit);
    }
}
