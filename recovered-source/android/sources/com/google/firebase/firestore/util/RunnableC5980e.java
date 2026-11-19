package com.google.firebase.firestore.util;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.firebase.firestore.util.e */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5980e implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23968s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f23969t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f23970u;

    public /* synthetic */ RunnableC5980e(int i2, Object obj, Object obj2) {
        this.f23968s = i2;
        this.f23969t = obj;
        this.f23970u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23968s) {
            case 0:
                AsyncQueue.SynchronizedShutdownAwareExecutor.lambda$executeAndReportResult$1((TaskCompletionSource) this.f23969t, (Callable) this.f23970u);
                break;
            case 1:
                BackgroundQueue.submit$lambda$1((Runnable) this.f23969t, (BackgroundQueue.State) this.f23970u);
                break;
            case 2:
                ((ThrottledForwardingExecutor) this.f23969t).lambda$execute$0((Runnable) this.f23970u);
                break;
            case 3:
                ((AsyncQueue) this.f23969t).lambda$runDelayedTasksUntil$6((AsyncQueue.TimerId) this.f23970u);
                break;
            default:
                ((ExponentialBackoff) this.f23969t).lambda$backoffAndRun$0((Runnable) this.f23970u);
                break;
        }
    }
}
