package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfoz implements ListenableFuture {

    /* JADX INFO: renamed from: s */
    public final Object f16219s;

    /* JADX INFO: renamed from: t */
    public final String f16220t;

    /* JADX INFO: renamed from: u */
    public final ListenableFuture f16221u;

    public zzfoz(Object obj, String str, ListenableFuture listenableFuture) {
        this.f16219s = obj;
        this.f16220t = str;
        this.f16221u = listenableFuture;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.f16221u.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f16221u.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f16221u.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f16221u.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f16221u.isDone();
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        String str = this.f16220t;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(iIdentityHashCode).length());
        sb.append(str);
        sb.append("@");
        sb.append(iIdentityHashCode);
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        return this.f16221u.get(j2, timeUnit);
    }
}
