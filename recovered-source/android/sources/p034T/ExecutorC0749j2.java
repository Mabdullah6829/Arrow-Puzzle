package p034T;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001B.AbstractC0076b;

/* JADX INFO: renamed from: T.j2 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0749j2 implements Executor, Runnable {

    /* JADX INFO: renamed from: v */
    public static final Logger f1898v = Logger.getLogger(ExecutorC0749j2.class.getName());

    /* JADX INFO: renamed from: w */
    public static final AbstractC0761m2 f1899w;

    /* JADX INFO: renamed from: s */
    public final Executor f1900s;

    /* JADX INFO: renamed from: t */
    public final ConcurrentLinkedQueue f1901t = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: u */
    public volatile int f1902u = 0;

    static {
        AbstractC0761m2 c0745i2;
        try {
            c0745i2 = new C0741h2(AtomicIntegerFieldUpdater.newUpdater(ExecutorC0749j2.class, "u"));
        } catch (Throwable th) {
            f1898v.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            c0745i2 = new C0745i2();
        }
        f1899w = c0745i2;
    }

    public ExecutorC0749j2(Executor executor) {
        AbstractC0076b.m133h(executor, "'executor' must not be null.");
        this.f1900s = executor;
    }

    /* JADX INFO: renamed from: a */
    public final void m1617a(Runnable runnable) {
        AbstractC0761m2 abstractC0761m2 = f1899w;
        if (abstractC0761m2.mo1612r(this)) {
            try {
                this.f1900s.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f1901t.remove(runnable);
                }
                abstractC0761m2.mo1613s(this);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC0076b.m133h(runnable, "'r' must not be null.");
        this.f1901t.add(runnable);
        m1617a(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0761m2 abstractC0761m2 = f1899w;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f1901t;
        while (true) {
            try {
                Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                if (runnable == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e) {
                    f1898v.log(Level.SEVERE, "Exception while executing runnable " + runnable, (Throwable) e);
                }
            } catch (Throwable th) {
                abstractC0761m2.mo1613s(this);
                throw th;
            }
        }
        abstractC0761m2.mo1613s(this);
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        m1617a(null);
    }
}
