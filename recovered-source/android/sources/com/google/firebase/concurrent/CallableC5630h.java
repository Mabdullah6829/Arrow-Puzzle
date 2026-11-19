package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.firebase.concurrent.h */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC5630h implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23577a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Runnable f23578b;

    public /* synthetic */ CallableC5630h(int i2, Runnable runnable) {
        this.f23577a = i2;
        this.f23578b = runnable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f23577a) {
            case 0:
                return LimitedConcurrencyExecutorService.lambda$submit$1(this.f23578b);
            default:
                return PausableExecutorServiceImpl.lambda$submit$1(this.f23578b);
        }
    }
}
