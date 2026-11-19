package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfbe implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzfcs f15309a;

    /* JADX INFO: renamed from: b */
    public final long f15310b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f15311c;

    public zzfbe(zzfcs zzfcsVar, long j2, ScheduledExecutorService scheduledExecutorService) {
        this.f15309a = zzfcsVar;
        this.f15310b = j2;
        this.f15311c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        ListenableFuture listenableFutureZza = this.f15309a.zza();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8440a3)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j2 = this.f15310b;
        if (j2 > 0) {
            listenableFutureZza = zzhcf.m7373g(listenableFutureZza, j2, timeUnit, this.f15311c);
        }
        return zzhcf.m7372f(listenableFutureZza, Throwable.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzfbd
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final ListenableFuture mo3248b(Object obj) {
                Throwable th = (Throwable) obj;
                zzfbe zzfbeVar = this.f15308a;
                zzfbeVar.getClass();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8407Y2)).booleanValue()) {
                    zzfcs zzfcsVar = zzfbeVar.f15309a;
                    zzcfk zzcfkVar = com.google.android.gms.ads.internal.zzt.f3698C.f3708h;
                    int iZzb = zzfcsVar.zzb();
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzb).length() + 22);
                    sb.append("OptionalSignalTimeout:");
                    sb.append(iZzb);
                    zzcfkVar.m5384d(sb.toString(), th);
                }
                return zzhcj.f18518t;
            }
        }, zzcfy.f9953h);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return this.f15309a.zzb();
    }
}
