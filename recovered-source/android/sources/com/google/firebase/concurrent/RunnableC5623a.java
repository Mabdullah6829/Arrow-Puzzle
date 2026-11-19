package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.firebase.concurrent.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5623a implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f23552s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f23553t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f23554u;

    public /* synthetic */ RunnableC5623a(int i2, Object obj, Object obj2) {
        this.f23552s = i2;
        this.f23553t = obj;
        this.f23554u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23552s) {
            case 0:
                ((CustomThreadFactory) this.f23553t).lambda$newThread$0((Runnable) this.f23554u);
                break;
            case 1:
                DelegatingScheduledExecutorService.lambda$schedule$3((Callable) this.f23553t, (DelegatingScheduledFuture.Completer) this.f23554u);
                break;
            default:
                ((LimitedConcurrencyExecutor) this.f23553t).lambda$decorate$0((Runnable) this.f23554u);
                break;
        }
    }
}
