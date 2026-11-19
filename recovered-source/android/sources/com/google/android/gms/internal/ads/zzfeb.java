package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Tasks;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfeb implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzcfk f15532a;

    /* JADX INFO: renamed from: b */
    public final ScheduledExecutorService f15533b;

    /* JADX INFO: renamed from: c */
    public final zzhcp f15534c;

    public zzfeb(zzcfk zzcfkVar, ScheduledExecutorService scheduledExecutorService, zzhcp zzhcpVar) {
        this.f15532a = zzcfkVar;
        this.f15533b = scheduledExecutorService;
        this.f15534c = zzhcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        zzbio zzbioVar = zzbix.f8227N3;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8312S3)).booleanValue()) {
                ListenableFuture listenableFutureM6899a = zzgdd.m6899a(Tasks.m10776f(null));
                zzfea zzfeaVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzfea
                    @Override // com.google.android.gms.internal.ads.zzhbn
                    /* JADX INFO: renamed from: b */
                    public final ListenableFuture mo3248b(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        return appSetIdInfo == null ? zzhcf.m7367a(new zzfec(null, -1)) : zzhcf.m7367a(new zzfec(appSetIdInfo.f4034a, appSetIdInfo.f4035b));
                    }
                };
                zzhcp zzhcpVar = this.f15534c;
                ListenableFuture listenableFutureM7374h = zzhcf.m7374h(listenableFutureM6899a, zzfeaVar, zzhcpVar);
                if (((Boolean) zzbkk.f8980a.m5057c()).booleanValue()) {
                    listenableFutureM7374h = zzhcf.m7373g(listenableFutureM7374h, ((Long) zzbkk.f8981b.m5057c()).longValue(), TimeUnit.MILLISECONDS, this.f15533b);
                }
                return zzhcf.m7371e(listenableFutureM7374h, Exception.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzfdz
                    @Override // com.google.android.gms.internal.ads.zzgti
                    public final /* synthetic */ Object apply(Object obj) {
                        this.f15528a.f15532a.m5384d("AppSetIdInfoGmscoreSignal", (Exception) obj);
                        return new zzfec(null, -1);
                    }
                }, zzhcpVar);
            }
        }
        return zzhcf.m7367a(new zzfec(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 43;
    }
}
