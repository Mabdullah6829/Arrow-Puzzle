package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhcf extends zzhch {
    /* JADX INFO: renamed from: a */
    public static ListenableFuture m7367a(Object obj) {
        return obj == null ? zzhcj.f18518t : new zzhcj(obj);
    }

    /* JADX INFO: renamed from: b */
    public static ListenableFuture m7368b(Throwable th) {
        th.getClass();
        zzhci zzhciVar = new zzhci();
        zzhciVar.m7321d(th);
        return zzhciVar;
    }

    /* JADX INFO: renamed from: c */
    public static ListenableFuture m7369c(Executor executor, Callable callable) {
        zzhde zzhdeVar = new zzhde(callable);
        executor.execute(zzhdeVar);
        return zzhdeVar;
    }

    /* JADX INFO: renamed from: d */
    public static ListenableFuture m7370d(zzhbm zzhbmVar, Executor executor) {
        zzhde zzhdeVar = new zzhde();
        zzhdeVar.f18541z = new zzhdc(zzhdeVar, zzhbmVar);
        executor.execute(zzhdeVar);
        return zzhdeVar;
    }

    /* JADX INFO: renamed from: e */
    public static ListenableFuture m7371e(ListenableFuture listenableFuture, Class cls, zzgti zzgtiVar, Executor executor) {
        int i2 = zzhax.f18437C;
        zzhaw zzhawVar = new zzhaw(listenableFuture, cls, zzgtiVar);
        listenableFuture.addListener(zzhawVar, zzhcw.m7388a(executor, zzhawVar));
        return zzhawVar;
    }

    /* JADX INFO: renamed from: f */
    public static ListenableFuture m7372f(ListenableFuture listenableFuture, Class cls, zzhbn zzhbnVar, Executor executor) {
        int i2 = zzhax.f18437C;
        zzhav zzhavVar = new zzhav(listenableFuture, cls, zzhbnVar);
        listenableFuture.addListener(zzhavVar, zzhcw.m7388a(executor, zzhavVar));
        return zzhavVar;
    }

    /* JADX INFO: renamed from: g */
    public static ListenableFuture m7373g(ListenableFuture listenableFuture, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        zzhdb zzhdbVar = new zzhdb();
        zzhdbVar.f18536z = listenableFuture;
        zzhcz zzhczVar = new zzhcz();
        zzhczVar.f18533s = zzhdbVar;
        zzhdbVar.f18535A = scheduledExecutorService.schedule(zzhczVar, j2, timeUnit);
        listenableFuture.addListener(zzhczVar, zzhbu.f18506s);
        return zzhdbVar;
    }

    /* JADX INFO: renamed from: h */
    public static ListenableFuture m7374h(ListenableFuture listenableFuture, zzhbn zzhbnVar, Executor executor) {
        int i2 = zzhbe.f18481B;
        zzhbc zzhbcVar = new zzhbc(listenableFuture, zzhbnVar);
        listenableFuture.addListener(zzhbcVar, zzhcw.m7388a(executor, zzhbcVar));
        return zzhbcVar;
    }

    /* JADX INFO: renamed from: i */
    public static ListenableFuture m7375i(ListenableFuture listenableFuture, zzgti zzgtiVar, Executor executor) {
        int i2 = zzhbe.f18481B;
        zzhbd zzhbdVar = new zzhbd(listenableFuture, zzgtiVar);
        listenableFuture.addListener(zzhbdVar, zzhcw.m7388a(executor, zzhbdVar));
        return zzhbdVar;
    }

    /* JADX INFO: renamed from: j */
    public static ListenableFuture m7376j(ArrayList arrayList) {
        return new zzhbo(zzgwt.m7220t(arrayList), true);
    }

    /* JADX INFO: renamed from: k */
    public static void m7377k(ListenableFuture listenableFuture, zzhcc zzhccVar, Executor executor) {
        listenableFuture.addListener(new zzhcd(listenableFuture, zzhccVar), executor);
    }

    /* JADX INFO: renamed from: l */
    public static Object m7378l(Future future) {
        if (future.isDone()) {
            return zzhdg.m7390a(future);
        }
        throw new IllegalStateException(zzgui.m7149b("Future was expected to be done: %s", future));
    }

    /* JADX INFO: renamed from: m */
    public static Object m7379m(zzcgd zzcgdVar) {
        try {
            return zzhdg.m7390a(zzcgdVar);
        } catch (ExecutionException e) {
            if (e.getCause() instanceof Error) {
                throw new zzhbv((Error) e.getCause());
            }
            throw new zzhdf(e.getCause());
        }
    }
}
