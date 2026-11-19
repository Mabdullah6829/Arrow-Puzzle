package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class zzcyj implements zzhcc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzhcc f11775a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzcyp f11776b;

    public zzcyj(zzcyp zzcypVar, zzhcc zzhccVar) {
        this.f11775a = zzhccVar;
        this.f11776b = zzcypVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: a */
    public final void mo3316a(Object obj) {
        List<ListenableFuture> list = ((zzcyi) obj).f11774a;
        final zzcyp zzcypVar = this.f11776b;
        Executor executor = zzcypVar.f11785a;
        final zzhcc zzhccVar = this.f11775a;
        if (list == null || list.isEmpty()) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcyo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    ((zzeue) zzhccVar).mo3317b(new zzeel(3));
                }
            });
            return;
        }
        ListenableFuture listenableFutureM7374h = zzhcj.f18518t;
        for (final ListenableFuture listenableFuture : list) {
            listenableFutureM7374h = zzhcf.m7374h(zzhcf.m7372f(listenableFutureM7374h, Throwable.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzcyl
                @Override // com.google.android.gms.internal.ads.zzhbn
                /* JADX INFO: renamed from: b */
                public final ListenableFuture mo3248b(Object obj2) {
                    zzhccVar.mo3317b((Throwable) obj2);
                    return zzhcj.f18518t;
                }
            }, executor), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzcym
                @Override // com.google.android.gms.internal.ads.zzhbn
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ListenableFuture mo3248b(Object obj2) {
                    zzcya zzcyaVar = (zzcya) obj2;
                    zzcyp zzcypVar2 = zzcypVar;
                    zzcypVar2.getClass();
                    if (zzcyaVar != null) {
                        ((zzeue) zzhccVar).mo3316a(zzcyaVar);
                    }
                    long jLongValue = ((Long) zzbll.f9133a.m5057c()).longValue();
                    ScheduledExecutorService scheduledExecutorService = zzcypVar2.f11786b;
                    return zzhcf.m7373g(listenableFuture, jLongValue, TimeUnit.MILLISECONDS, scheduledExecutorService);
                }
            }, executor);
        }
        listenableFutureM7374h.addListener(new zzhcd(listenableFutureM7374h, new zzcyk(zzcypVar, zzhccVar)), executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    /* JADX INFO: renamed from: b */
    public final void mo3317b(Throwable th) {
        ((zzeue) this.f11775a).mo3317b(th);
        zzcyp zzcypVar = this.f11776b;
        zzcypVar.getClass();
        ((zzcfx) zzcfy.f9951f).execute(new zzcyn(zzcypVar));
    }
}
