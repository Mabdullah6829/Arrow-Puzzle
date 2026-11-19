package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeuy implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final ListenableFuture f14938a;

    /* JADX INFO: renamed from: b */
    public final Executor f14939b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f14940c;

    public zzeuy(ListenableFuture listenableFuture, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f14938a = listenableFuture;
        this.f14939b = executor;
        this.f14940c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        zzeux zzeuxVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzeux
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                return zzhcf.m7367a(new zzeuz((String) obj));
            }
        };
        ListenableFuture listenableFuture = this.f14938a;
        Executor executor = this.f14939b;
        ListenableFuture listenableFutureM7374h = zzhcf.m7374h(listenableFuture, zzeuxVar, executor);
        zzbio zzbioVar = zzbix.f8370Vd;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Integer) zzbaVar.f3098c.m5030a(zzbioVar)).intValue() > 0) {
            listenableFutureM7374h = zzhcf.m7373g(listenableFutureM7374h, ((Integer) zzbaVar.f3098c.m5030a(zzbioVar)).intValue(), TimeUnit.MILLISECONDS, this.f14940c);
        }
        return zzhcf.m7372f(listenableFutureM7374h, Throwable.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzeuw
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                return ((Throwable) obj) instanceof TimeoutException ? zzhcf.m7367a(new zzeuz(Integer.toString(17))) : zzhcf.m7367a(new zzeuz(null));
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 6;
    }
}
