package p011H;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: H.c0 */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorServiceC0267c0 extends AbstractExecutorService implements InterfaceScheduledExecutorServiceC0260Y, ExecutorService, AutoCloseable {

    /* JADX INFO: renamed from: s */
    public final ScheduledExecutorService f519s;

    /* JADX INFO: renamed from: t */
    public final ScheduledExecutorService f520t;

    public ExecutorServiceC0267c0(ScheduledExecutorService scheduledExecutorService) {
        scheduledExecutorService.getClass();
        this.f519s = scheduledExecutorService;
        this.f520t = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j2, TimeUnit timeUnit) {
        return this.f519s.awaitTermination(j2, timeUnit);
    }

    /* JADX INFO: renamed from: c */
    public final ListenableFuture m392c(Runnable runnable) {
        return (ListenableFuture) super.submit(runnable);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ScheduledExecutorService scheduledExecutorService;
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = (scheduledExecutorService = this.f519s).isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = scheduledExecutorService.awaitTermination(1L, TimeUnit.DAYS);
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

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f519s.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f519s.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f519s.isTerminated();
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new RunnableFutureC0281j0(callable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j2, TimeUnit timeUnit) {
        RunnableFutureC0281j0 runnableFutureC0281j0 = new RunnableFutureC0281j0(callable);
        return new ScheduledFutureC0263a0(runnableFutureC0281j0, this.f520t.schedule(runnableFutureC0281j0, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        RunnableC0265b0 runnableC0265b0 = new RunnableC0265b0(runnable);
        return new ScheduledFutureC0263a0(runnableC0265b0, this.f520t.scheduleAtFixedRate(runnableC0265b0, j2, j3, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        RunnableC0265b0 runnableC0265b0 = new RunnableC0265b0(runnable);
        return new ScheduledFutureC0263a0(runnableC0265b0, this.f520t.scheduleWithFixedDelay(runnableC0265b0, j2, j3, timeUnit));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f519s.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f519s.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return (ListenableFuture) super.submit(runnable);
    }

    public final String toString() {
        return super.toString() + "[" + this.f519s + "]";
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new RunnableFutureC0281j0(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return (ListenableFuture) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return (ListenableFuture) super.submit(callable);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
        RunnableFutureC0281j0 runnableFutureC0281j0 = new RunnableFutureC0281j0(Executors.callable(runnable, null));
        return new ScheduledFutureC0263a0(runnableFutureC0281j0, this.f520t.schedule(runnableFutureC0281j0, j2, timeUnit));
    }
}
