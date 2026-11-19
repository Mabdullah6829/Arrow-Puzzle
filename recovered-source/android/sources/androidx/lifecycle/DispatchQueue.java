package androidx.lifecycle;

import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractC0007H;
import p002B0.C0104d;
import p010F0.AbstractC0227m;
import p011H.RunnableC0294w;
import p012H0.C0302e;
import p062g0.InterfaceC6353h;

/* JADX INFO: loaded from: classes.dex */
public final class DispatchQueue {
    private boolean finished;
    private boolean isDraining;
    private boolean paused = true;
    private final Queue<Runnable> queue = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchAndEnqueue$lambda$2$lambda$1(DispatchQueue this$0, Runnable runnable) {
        AbstractC6452k.m12181e(this$0, "this$0");
        AbstractC6452k.m12181e(runnable, "$runnable");
        this$0.enqueue(runnable);
    }

    private final void enqueue(Runnable runnable) {
        if (!this.queue.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables");
        }
        drainQueue();
    }

    public final boolean canRun() {
        return this.finished || !this.paused;
    }

    public final void dispatchAndEnqueue(InterfaceC6353h context, Runnable runnable) {
        AbstractC6452k.m12181e(context, "context");
        AbstractC6452k.m12181e(runnable, "runnable");
        C0302e c0302e = AbstractC0007H.f4a;
        C0104d c0104d = AbstractC0227m.f459a.f153u;
        if (c0104d.isDispatchNeeded(context) || canRun()) {
            c0104d.dispatch(context, new RunnableC0294w(5, this, runnable));
        } else {
            enqueue(runnable);
        }
    }

    public final void drainQueue() {
        if (this.isDraining) {
            return;
        }
        try {
            this.isDraining = true;
            while (!this.queue.isEmpty() && canRun()) {
                Runnable runnablePoll = this.queue.poll();
                if (runnablePoll != null) {
                    runnablePoll.run();
                }
            }
            this.isDraining = false;
        } catch (Throwable th) {
            this.isDraining = false;
            throw th;
        }
    }

    public final void finish() {
        this.finished = true;
        drainQueue();
    }

    public final void pause() {
        this.paused = true;
    }

    public final void resume() {
        if (this.paused) {
            if (this.finished) {
                throw new IllegalStateException("Cannot resume a finished dispatcher");
            }
            this.paused = false;
            drainQueue();
        }
    }
}
