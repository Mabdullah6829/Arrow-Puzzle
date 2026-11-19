package androidx.activity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC6452k;
import p078p0.InterfaceC6487a;

/* JADX INFO: loaded from: classes.dex */
public final class FullyDrawnReporter {
    private final Executor executor;
    private final Object lock;
    private final List<InterfaceC6487a> onReportCallbacks;
    private final InterfaceC6487a reportFullyDrawn;
    private boolean reportPosted;
    private final Runnable reportRunnable;
    private boolean reportedFullyDrawn;
    private int reporterCount;

    public FullyDrawnReporter(Executor executor, InterfaceC6487a reportFullyDrawn) {
        AbstractC6452k.m12181e(executor, "executor");
        AbstractC6452k.m12181e(reportFullyDrawn, "reportFullyDrawn");
        this.executor = executor;
        this.reportFullyDrawn = reportFullyDrawn;
        this.lock = new Object();
        this.onReportCallbacks = new ArrayList();
        this.reportRunnable = new RunnableC0947d(this, 3);
    }

    private final void postWhenReportersAreDone() {
        if (this.reportPosted || this.reporterCount != 0) {
            return;
        }
        this.reportPosted = true;
        this.executor.execute(this.reportRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reportRunnable$lambda$2(FullyDrawnReporter this$0) {
        AbstractC6452k.m12181e(this$0, "this$0");
        synchronized (this$0.lock) {
            this$0.reportPosted = false;
            if (this$0.reporterCount == 0 && !this$0.reportedFullyDrawn) {
                this$0.reportFullyDrawn.invoke();
                this$0.fullyDrawnReported();
            }
        }
    }

    public final void addOnReportDrawnListener(InterfaceC6487a callback) {
        boolean z;
        AbstractC6452k.m12181e(callback, "callback");
        synchronized (this.lock) {
            if (this.reportedFullyDrawn) {
                z = true;
            } else {
                this.onReportCallbacks.add(callback);
                z = false;
            }
        }
        if (z) {
            callback.invoke();
        }
    }

    public final void addReporter() {
        synchronized (this.lock) {
            if (!this.reportedFullyDrawn) {
                this.reporterCount++;
            }
        }
    }

    public final void fullyDrawnReported() {
        synchronized (this.lock) {
            try {
                this.reportedFullyDrawn = true;
                Iterator<T> it = this.onReportCallbacks.iterator();
                while (it.hasNext()) {
                    ((InterfaceC6487a) it.next()).invoke();
                }
                this.onReportCallbacks.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean isFullyDrawnReported() {
        boolean z;
        synchronized (this.lock) {
            z = this.reportedFullyDrawn;
        }
        return z;
    }

    public final void removeOnReportDrawnListener(InterfaceC6487a callback) {
        AbstractC6452k.m12181e(callback, "callback");
        synchronized (this.lock) {
            this.onReportCallbacks.remove(callback);
        }
    }

    public final void removeReporter() {
        int i2;
        synchronized (this.lock) {
            if (!this.reportedFullyDrawn && (i2 = this.reporterCount) > 0) {
                this.reporterCount = i2 - 1;
                postWhenReportersAreDone();
            }
        }
    }
}
