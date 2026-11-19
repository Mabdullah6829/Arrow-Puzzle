package p034T;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001B.AbstractC0076b;

/* JADX INFO: renamed from: T.g2 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0737g2 implements Executor {

    /* JADX INFO: renamed from: u */
    public static final Logger f1880u = Logger.getLogger(ExecutorC0737g2.class.getName());

    /* JADX INFO: renamed from: s */
    public boolean f1881s;

    /* JADX INFO: renamed from: t */
    public ArrayDeque f1882t;

    /* JADX INFO: renamed from: a */
    public final void m1610a() {
        while (true) {
            Runnable runnable = (Runnable) this.f1882t.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th) {
                f1880u.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC0076b.m133h(runnable, "'task' must not be null.");
        if (this.f1881s) {
            if (this.f1882t == null) {
                this.f1882t = new ArrayDeque(4);
            }
            this.f1882t.add(runnable);
            return;
        }
        this.f1881s = true;
        try {
            runnable.run();
            if (this.f1882t != null) {
                m1610a();
            }
            this.f1881s = false;
        } catch (Throwable th) {
            try {
                f1880u.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            } finally {
                if (this.f1882t != null) {
                    m1610a();
                }
                this.f1881s = false;
            }
        }
    }
}
