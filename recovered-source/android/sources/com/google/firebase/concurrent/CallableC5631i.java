package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.firebase.concurrent.i */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class CallableC5631i implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23579a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Runnable f23580b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f23581c;

    public /* synthetic */ CallableC5631i(Runnable runnable, Object obj, int i2) {
        this.f23579a = i2;
        this.f23580b = runnable;
        this.f23581c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f23579a) {
            case 0:
                return LimitedConcurrencyExecutorService.lambda$submit$0(this.f23580b, this.f23581c);
            default:
                return PausableExecutorServiceImpl.lambda$submit$0(this.f23580b, this.f23581c);
        }
    }
}
