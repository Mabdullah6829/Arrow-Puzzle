package com.google.firebase.firestore.util;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.firebase.firestore.util.c */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC5978c implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23965a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Runnable f23966b;

    public /* synthetic */ CallableC5978c(int i2, Runnable runnable) {
        this.f23965a = i2;
        this.f23966b = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f23965a) {
            case 0:
                return AsyncQueue.SynchronizedShutdownAwareExecutor.lambda$executeAndInitiateShutdown$2(this.f23966b);
            default:
                return AsyncQueue.lambda$enqueue$2(this.f23966b);
        }
    }
}
