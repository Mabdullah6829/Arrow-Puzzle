package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class zzcgd implements ListenableFuture {

    /* JADX INFO: renamed from: s */
    public final zzhcy f9959s = zzhcy.m7389q();

    /* JADX INFO: renamed from: a */
    public final boolean m5397a(Object obj) {
        boolean zM7320c = this.f9959s.m7320c(obj);
        if (!zM7320c) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
        }
        return zM7320c;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.f9959s.addListener(runnable, executor);
    }

    /* JADX INFO: renamed from: b */
    public final void m5398b(Throwable th) {
        if (this.f9959s.m7321d(th)) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5385e("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f9959s.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f9959s.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9959s.f18457s instanceof zzhay.zza;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f9959s.isDone();
    }

    public void zza(String str) {
        m5397a(str);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        return this.f9959s.get(j2, timeUnit);
    }
}
