package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzewf implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzcfk f15010a;

    /* JADX INFO: renamed from: b */
    public final com.google.android.gms.internal.appset.zzr f15011b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f15012c;

    /* JADX INFO: renamed from: d */
    public final zzhcp f15013d;

    /* JADX INFO: renamed from: e */
    public final Context f15014e;

    public zzewf(Context context, zzcfk zzcfkVar, ScheduledExecutorService scheduledExecutorService, zzhcp zzhcpVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8295R3)).booleanValue()) {
            this.f15011b = new com.google.android.gms.internal.appset.zzr(context);
        }
        this.f15014e = context;
        this.f15010a = zzcfkVar;
        this.f15012c = scheduledExecutorService;
        this.f15013d = zzhcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        Task taskMo3367a;
        zzbio zzbioVar = zzbix.f8227N3;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            if (!((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8312S3)).booleanValue()) {
                if (!((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8244O3)).booleanValue()) {
                    return zzhcf.m7375i(zzgdd.m6899a(this.f15011b.mo3367a()), new zzgti() { // from class: com.google.android.gms.internal.ads.zzewe
                        @Override // com.google.android.gms.internal.ads.zzgti
                        public final Object apply(Object obj) {
                            AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                            return new zzewg(appSetIdInfo.f4034a, appSetIdInfo.f4035b);
                        }
                    }, zzcfy.f9953h);
                }
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8295R3)).booleanValue()) {
                    zzfml.m6536a(this.f15014e, false);
                    synchronized (zzfml.f16113c) {
                        taskMo3367a = zzfml.f16111a;
                    }
                } else {
                    taskMo3367a = this.f15011b.mo3367a();
                }
                if (taskMo3367a == null) {
                    return zzhcf.m7367a(new zzewg(null, -1));
                }
                ListenableFuture listenableFutureM7374h = zzhcf.m7374h(zzgdd.m6899a(taskMo3367a), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzewc
                    @Override // com.google.android.gms.internal.ads.zzhbn
                    /* JADX INFO: renamed from: b */
                    public final ListenableFuture mo3248b(Object obj) {
                        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
                        return appSetIdInfo == null ? zzhcf.m7367a(new zzewg(null, -1)) : zzhcf.m7367a(new zzewg(appSetIdInfo.f4034a, appSetIdInfo.f4035b));
                    }
                }, zzcfy.f9953h);
                if (((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8261P3)).booleanValue()) {
                    listenableFutureM7374h = zzhcf.m7373g(listenableFutureM7374h, ((Long) zzbaVar.f3098c.m5030a(zzbix.f8278Q3)).longValue(), TimeUnit.MILLISECONDS, this.f15012c);
                }
                return zzhcf.m7371e(listenableFutureM7374h, Exception.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzewd
                    @Override // com.google.android.gms.internal.ads.zzgti
                    public final /* synthetic */ Object apply(Object obj) {
                        this.f15008a.f15010a.m5384d("AppSetIdInfoSignal", (Exception) obj);
                        return new zzewg(null, -1);
                    }
                }, this.f15013d);
            }
        }
        return zzhcf.m7367a(new zzewg(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 11;
    }
}
