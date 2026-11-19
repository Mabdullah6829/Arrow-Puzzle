package p011H;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import p000A0.RunnableC0046k0;

/* JADX INFO: renamed from: H.f0 */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC0273f0 implements Executor {

    /* JADX INFO: renamed from: x */
    public static final Logger f529x = Logger.getLogger(ExecutorC0273f0.class.getName());

    /* JADX INFO: renamed from: s */
    public final Executor f530s;

    /* JADX INFO: renamed from: t */
    public final ArrayDeque f531t = new ArrayDeque();

    /* JADX INFO: renamed from: u */
    public int f532u = 1;

    /* JADX INFO: renamed from: v */
    public long f533v = 0;

    /* JADX INFO: renamed from: w */
    public final RunnableC0046k0 f534w = new RunnableC0046k0(this);

    public ExecutorC0273f0(Executor executor) {
        executor.getClass();
        this.f530s = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f531t) {
            int i2 = this.f532u;
            if (i2 != 4 && i2 != 3) {
                long j2 = this.f533v;
                RunnableC0269d0 runnableC0269d0 = new RunnableC0269d0(0, runnable);
                this.f531t.add(runnableC0269d0);
                this.f532u = 2;
                try {
                    this.f530s.execute(this.f534w);
                    if (this.f532u != 2) {
                        return;
                    }
                    synchronized (this.f531t) {
                        try {
                            if (this.f533v == j2 && this.f532u == 2) {
                                this.f532u = 3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f531t) {
                        try {
                            int i3 = this.f532u;
                            boolean z = true;
                            if ((i3 != 1 && i3 != 2) || !this.f531t.removeLastOccurrence(runnableC0269d0)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.f531t.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f530s + "}";
    }
}
