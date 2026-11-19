package com.google.firebase.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.firebase.concurrent.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5624b implements DelegatingScheduledFuture.Resolver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23555a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DelegatingScheduledExecutorService f23556b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f23557c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TimeUnit f23558d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f23559e;

    public /* synthetic */ C5624b(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Object obj, long j2, TimeUnit timeUnit, int i2) {
        this.f23555a = i2;
        this.f23556b = delegatingScheduledExecutorService;
        this.f23559e = obj;
        this.f23557c = j2;
        this.f23558d = timeUnit;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
        switch (this.f23555a) {
            case 0:
                return this.f23556b.lambda$schedule$2((Runnable) this.f23559e, this.f23557c, this.f23558d, completer);
            default:
                return this.f23556b.lambda$schedule$5((Callable) this.f23559e, this.f23557c, this.f23558d, completer);
        }
    }
}
