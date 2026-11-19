package p011H;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p001B.AbstractC0076b;
import p001B.C0086l;
import p006D0.C0177l;

/* JADX INFO: renamed from: H.K */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC0247K extends AtomicReference implements Executor, Runnable {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f495w = 0;

    /* JADX INFO: renamed from: s */
    public C0177l f496s;

    /* JADX INFO: renamed from: t */
    public Executor f497t;

    /* JADX INFO: renamed from: u */
    public Runnable f498u;

    /* JADX INFO: renamed from: v */
    public Thread f499v;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == EnumC0246J.f492t) {
            this.f497t = null;
            this.f496s = null;
            return;
        }
        this.f499v = Thread.currentThread();
        try {
            C0177l c0177l = this.f496s;
            Objects.requireNonNull(c0177l);
            C0086l c0086l = (C0086l) c0177l.f332t;
            if (((Thread) c0086l.f112t) == this.f499v) {
                this.f496s = null;
                AbstractC0076b.m138m(((Runnable) c0086l.f113u) == null);
                c0086l.f113u = runnable;
                Executor executor = this.f497t;
                Objects.requireNonNull(executor);
                c0086l.f114v = executor;
                this.f497t = null;
            } else {
                Executor executor2 = this.f497t;
                Objects.requireNonNull(executor2);
                this.f497t = null;
                this.f498u = runnable;
                executor2.execute(this);
            }
        } finally {
            this.f499v = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread != this.f499v) {
            Runnable runnable = this.f498u;
            Objects.requireNonNull(runnable);
            this.f498u = null;
            runnable.run();
            return;
        }
        C0086l c0086l = new C0086l(1);
        c0086l.f112t = threadCurrentThread;
        C0177l c0177l = this.f496s;
        Objects.requireNonNull(c0177l);
        c0177l.f332t = c0086l;
        this.f496s = null;
        try {
            Runnable runnable2 = this.f498u;
            Objects.requireNonNull(runnable2);
            this.f498u = null;
            runnable2.run();
            while (true) {
                Runnable runnable3 = (Runnable) c0086l.f113u;
                if (runnable3 == null || (executor = (Executor) c0086l.f114v) == null) {
                    break;
                }
                c0086l.f113u = null;
                c0086l.f114v = null;
                executor.execute(runnable3);
            }
            c0086l.f112t = null;
        } catch (Throwable th) {
            c0086l.f112t = null;
            throw th;
        }
    }
}
