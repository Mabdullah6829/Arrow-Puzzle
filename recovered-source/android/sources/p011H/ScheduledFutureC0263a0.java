package p011H;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p022N.AbstractC0355G;

/* JADX INFO: renamed from: H.a0 */
/* JADX INFO: loaded from: classes2.dex */
public final class ScheduledFutureC0263a0 extends AbstractC0355G implements ScheduledFuture, ListenableFuture, Future {

    /* JADX INFO: renamed from: H */
    public final AbstractC0290s f512H;

    /* JADX INFO: renamed from: I */
    public final ScheduledFuture f513I;

    public ScheduledFutureC0263a0(AbstractC0290s abstractC0290s, ScheduledFuture scheduledFuture) {
        super(1);
        this.f512H = abstractC0290s;
        this.f513I = scheduledFuture;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.f512H.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zM391q = m391q(z);
        if (zM391q) {
            this.f513I.cancel(z);
        }
        return zM391q;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f513I.compareTo(delayed);
    }

    @Override // p022N.AbstractC0355G
    /* JADX INFO: renamed from: f */
    public final Object mo390f() {
        return this.f512H;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f512H.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f513I.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f512H.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f512H.isDone();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m391q(boolean z) {
        return this.f512H.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        return this.f512H.get(j2, timeUnit);
    }
}
