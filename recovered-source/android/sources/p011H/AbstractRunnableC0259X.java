package p011H;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: H.X */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC0259X extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: s */
    public static final RunnableC0258W f508s = new RunnableC0258W();

    /* JADX INFO: renamed from: t */
    public static final RunnableC0258W f509t = new RunnableC0258W();

    /* JADX INFO: renamed from: a */
    public abstract void mo335a(Throwable th);

    /* JADX INFO: renamed from: b */
    public abstract void mo336b(Object obj);

    /* JADX INFO: renamed from: c */
    public final void m386c() {
        RunnableC0258W runnableC0258W = f509t;
        RunnableC0258W runnableC0258W2 = f508s;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            RunnableC0257V runnableC0257V = new RunnableC0257V(this);
            RunnableC0257V.m385a(runnableC0257V, Thread.currentThread());
            if (compareAndSet(runnable, runnableC0257V)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(runnableC0258W2)) == runnableC0258W) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo337d();

    /* JADX INFO: renamed from: e */
    public abstract Object mo338e();

    /* JADX INFO: renamed from: f */
    public abstract String mo339f();

    /* JADX INFO: renamed from: g */
    public final void m387g(Thread thread) {
        Runnable runnable = (Runnable) get();
        RunnableC0257V runnableC0257V = null;
        boolean z = false;
        int i2 = 0;
        while (true) {
            boolean z2 = runnable instanceof RunnableC0257V;
            RunnableC0258W runnableC0258W = f509t;
            if (!z2 && runnable != runnableC0258W) {
                break;
            }
            if (z2) {
                runnableC0257V = (RunnableC0257V) runnable;
            }
            i2++;
            if (i2 <= 1000) {
                Thread.yield();
            } else if (runnable == runnableC0258W || compareAndSet(runnable, runnableC0258W)) {
                z = Thread.interrupted() || z;
                LockSupport.park(runnableC0257V);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objMo338e = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zMo337d = mo337d();
            RunnableC0258W runnableC0258W = f508s;
            if (!zMo337d) {
                try {
                    objMo338e = mo338e();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, runnableC0258W)) {
                            m387g(threadCurrentThread);
                        }
                        if (zMo337d) {
                            return;
                        }
                        mo335a(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, runnableC0258W)) {
                            m387g(threadCurrentThread);
                        }
                        if (!zMo337d) {
                            mo336b(null);
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, runnableC0258W)) {
                m387g(threadCurrentThread);
            }
            if (zMo337d) {
                return;
            }
            mo336b(objMo338e);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f508s) {
            str = "running=[DONE]";
        } else if (runnable instanceof RunnableC0257V) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder sbM410r = AbstractC0271e0.m410r(str, ", ");
        sbM410r.append(mo339f());
        return sbM410r.toString();
    }
}
