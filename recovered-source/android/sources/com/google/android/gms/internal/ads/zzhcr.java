package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
class zzhcr extends zzhbb {

    /* JADX INFO: renamed from: s */
    public final ExecutorService f18527s;

    public zzhcr(ExecutorService executorService) {
        executorService.getClass();
        this.f18527s = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j2, TimeUnit timeUnit) {
        return this.f18527s.awaitTermination(j2, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f18527s.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f18527s.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f18527s.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f18527s.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return this.f18527s.shutdownNow();
    }

    public final String toString() {
        String string = super.toString();
        String strValueOf = String.valueOf(this.f18527s);
        return AbstractC1456a.m2451r(new StringBuilder(AbstractC0271e0.m395c(String.valueOf(string).length(), 1, strValueOf.length(), 1)), string, "[", strValueOf, "]");
    }
}
