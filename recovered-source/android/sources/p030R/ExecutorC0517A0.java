package p030R;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p001B.AbstractC0076b;
import p006D0.C0177l;

/* JADX INFO: renamed from: R.A0 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0517A0 implements Executor {

    /* JADX INFO: renamed from: s */
    public final Thread.UncaughtExceptionHandler f1096s;

    /* JADX INFO: renamed from: t */
    public final ConcurrentLinkedQueue f1097t = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: u */
    public final AtomicReference f1098u = new AtomicReference();

    public ExecutorC0517A0(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f1096s = uncaughtExceptionHandler;
    }

    /* JADX INFO: renamed from: a */
    public final void m1234a() {
        AtomicReference atomicReference;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f1097t;
        do {
            Thread threadCurrentThread = Thread.currentThread();
            do {
                atomicReference = this.f1098u;
                if (atomicReference.compareAndSet(null, threadCurrentThread)) {
                    while (true) {
                        try {
                            Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                            if (runnable == null) {
                                break;
                            }
                            try {
                                runnable.run();
                            } catch (Throwable th) {
                                this.f1096s.uncaughtException(Thread.currentThread(), th);
                            }
                        } catch (Throwable th2) {
                            atomicReference.set(null);
                            throw th2;
                        }
                    }
                    atomicReference.set(null);
                }
            } while (atomicReference.get() == null);
            return;
        } while (!concurrentLinkedQueue.isEmpty());
    }

    /* JADX INFO: renamed from: b */
    public final void m1235b(Runnable runnable) {
        AbstractC0076b.m133h(runnable, "runnable is null");
        this.f1097t.add(runnable);
    }

    /* JADX INFO: renamed from: c */
    public final C0177l m1236c(Runnable runnable, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        RunnableC0595z0 runnableC0595z0 = new RunnableC0595z0(runnable);
        return new C0177l(runnableC0595z0, scheduledExecutorService.schedule(new RunnableC0591x0(this, runnableC0595z0, runnable, 0), j2, timeUnit));
    }

    /* JADX INFO: renamed from: d */
    public final void m1237d() {
        AbstractC0076b.m139n(Thread.currentThread() == this.f1098u.get(), "Not called from the SynchronizationContext");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m1235b(runnable);
        m1234a();
    }
}
