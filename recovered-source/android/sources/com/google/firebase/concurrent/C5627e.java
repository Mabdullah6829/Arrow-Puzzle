package com.google.firebase.concurrent;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.firebase.concurrent.e */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5627e implements DelegatingScheduledFuture.Resolver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23567a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DelegatingScheduledExecutorService f23568b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Runnable f23569c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f23570d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f23571e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TimeUnit f23572f;

    public /* synthetic */ C5627e(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, long j2, long j3, TimeUnit timeUnit, int i2) {
        this.f23567a = i2;
        this.f23568b = delegatingScheduledExecutorService;
        this.f23569c = runnable;
        this.f23570d = j2;
        this.f23571e = j3;
        this.f23572f = timeUnit;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
        switch (this.f23567a) {
            case 0:
                return this.f23568b.lambda$scheduleAtFixedRate$8(this.f23569c, this.f23570d, this.f23571e, this.f23572f, completer);
            default:
                return this.f23568b.lambda$scheduleWithFixedDelay$11(this.f23569c, this.f23570d, this.f23571e, this.f23572f, completer);
        }
    }
}
