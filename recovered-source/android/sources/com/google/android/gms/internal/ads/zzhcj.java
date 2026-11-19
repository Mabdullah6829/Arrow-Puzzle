package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
final class zzhcj implements ListenableFuture {

    /* JADX INFO: renamed from: t */
    public static final ListenableFuture f18518t = new zzhcj(null);

    /* JADX INFO: renamed from: u */
    public static final zzhcn f18519u = new zzhcn(zzhcj.class);

    /* JADX INFO: renamed from: s */
    public final Object f18520s;

    public zzhcj(Object obj) {
        this.f18520s = obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        zzgtr.m7135h(runnable, "Runnable was null.");
        zzgtr.m7135h(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger loggerM7383a = f18519u.m7383a();
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            loggerM7383a.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", AbstractC1456a.m2451r(new StringBuilder(strValueOf.length() + 57 + strValueOf2.length()), "RuntimeException while executing runnable ", strValueOf, " with executor ", strValueOf2), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f18520s;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        String string = super.toString();
        String strValueOf = String.valueOf(this.f18520s);
        return AbstractC1456a.m2451r(new StringBuilder(String.valueOf(string).length() + 25 + strValueOf.length() + 2), string, "[status=SUCCESS, result=[", strValueOf, "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f18520s;
    }
}
