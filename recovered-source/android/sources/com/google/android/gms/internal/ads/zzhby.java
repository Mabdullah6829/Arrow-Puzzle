package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class zzhby extends zzhbx {

    /* JADX INFO: renamed from: z */
    public final ListenableFuture f18508z;

    public zzhby(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.f18508z = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzhay, com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.f18508z.addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhay, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f18508z.cancel(z);
    }

    @Override // com.google.android.gms.internal.ads.zzhay, java.util.concurrent.Future
    public final Object get() {
        return this.f18508z.get();
    }

    @Override // com.google.android.gms.internal.ads.zzhay, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f18508z.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzhay, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f18508z.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzhay
    public final String toString() {
        return this.f18508z.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhay, java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        return this.f18508z.get(j2, timeUnit);
    }
}
