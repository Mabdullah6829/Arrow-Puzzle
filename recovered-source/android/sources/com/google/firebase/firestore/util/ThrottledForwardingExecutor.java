package com.google.firebase.firestore.util;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes2.dex */
class ThrottledForwardingExecutor implements Executor {
    private final Semaphore availableSlots;
    private final Executor executor;

    public ThrottledForwardingExecutor(int i2, Executor executor) {
        this.availableSlots = new Semaphore(i2);
        this.executor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$0(Runnable runnable) {
        runnable.run();
        this.availableSlots.release();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (!this.availableSlots.tryAcquire()) {
            runnable.run();
            return;
        }
        try {
            this.executor.execute(new RunnableC5980e(2, this, runnable));
        } catch (RejectedExecutionException unused) {
            runnable.run();
        }
    }
}
