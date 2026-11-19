package p000A0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p012H0.C0302e;
import p012H0.ExecutorC0301d;
import p062g0.InterfaceC6353h;

/* JADX INFO: renamed from: A0.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C0016Q extends AbstractC0015P implements InterfaceC0003D {

    /* JADX INFO: renamed from: s */
    public final Executor f18s;

    public C0016Q(Executor executor) {
        this.f18s = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f18s;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // p000A0.AbstractC0063t
    public final void dispatch(InterfaceC6353h interfaceC6353h, Runnable runnable) {
        try {
            this.f18s.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            InterfaceC0022X interfaceC0022X = (InterfaceC0022X) interfaceC6353h.get(C0065u.f80t);
            if (interfaceC0022X != null) {
                interfaceC0022X.mo29e(cancellationException);
            }
            C0302e c0302e = AbstractC0007H.f4a;
            ExecutorC0301d.f608s.dispatch(interfaceC6353h, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0016Q) && ((C0016Q) obj).f18s == this.f18s;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f18s);
    }

    @Override // p000A0.InterfaceC0003D
    /* JADX INFO: renamed from: i */
    public final void mo1i(long j2, C0039h c0039h) {
        Executor executor = this.f18s;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            RunnableC0046k0 runnableC0046k0 = new RunnableC0046k0(0, this, c0039h);
            InterfaceC6353h interfaceC6353h = c0039h.f52w;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnableC0046k0, j2, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                InterfaceC0022X interfaceC0022X = (InterfaceC0022X) interfaceC6353h.get(C0065u.f80t);
                if (interfaceC0022X != null) {
                    interfaceC0022X.mo29e(cancellationException);
                }
            }
        }
        if (scheduledFutureSchedule != null) {
            c0039h.m89u(new C0033e(scheduledFutureSchedule, 0));
        } else {
            RunnableC0070z.f97z.mo1i(j2, c0039h);
        }
    }

    @Override // p000A0.AbstractC0015P
    /* JADX INFO: renamed from: j */
    public final Executor mo25j() {
        return this.f18s;
    }

    @Override // p000A0.AbstractC0063t
    public final String toString() {
        return this.f18s.toString();
    }
}
