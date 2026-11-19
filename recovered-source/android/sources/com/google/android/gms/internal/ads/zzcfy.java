package com.google.android.gms.internal.ads;

import androidx.webkit.Profile;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcfy {

    /* JADX INFO: renamed from: a */
    public static final zzhcp f9946a;

    /* JADX INFO: renamed from: b */
    public static final zzhcp f9947b;

    /* JADX INFO: renamed from: c */
    public static final zzhcp f9948c;

    /* JADX INFO: renamed from: d */
    public static final ScheduledExecutorService f9949d;

    /* JADX INFO: renamed from: e */
    public static final zzhcq f9950e;

    /* JADX INFO: renamed from: f */
    public static final zzhcp f9951f;

    /* JADX INFO: renamed from: g */
    public static final ExecutorService f9952g;

    /* JADX INFO: renamed from: h */
    public static final zzhcp f9953h;

    /* JADX WARN: Code duplicated, block: B:11:0x0061  */
    static {
        ThreadPoolExecutor threadPoolExecutor;
        zzbio zzbioVar = zzbix.f8134Hc;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        zzbiv zzbivVar = zzbaVar.f3098c;
        zzbiv zzbivVar2 = zzbaVar.f3098c;
        if (zzbivVar.m5031b(zzbioVar) == null || !((Boolean) zzbivVar2.m5031b(zzbioVar)).booleanValue()) {
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcfv(Profile.DEFAULT_PROFILE_NAME));
        } else {
            zzbio zzbioVar2 = zzbix.f8151Ic;
            if (zzbivVar2.m5031b(zzbioVar2) != null) {
                zzbio zzbioVar3 = zzbix.f8168Jc;
                if (zzbivVar2.m5031b(zzbioVar3) != null) {
                    threadPoolExecutor = new ThreadPoolExecutor(((Integer) zzbivVar2.m5031b(zzbioVar2)).intValue(), ((Integer) zzbivVar2.m5031b(zzbioVar2)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzcfv(Profile.DEFAULT_PROFILE_NAME));
                    threadPoolExecutor.allowCoreThreadTimeOut(((Boolean) zzbivVar2.m5031b(zzbioVar3)).booleanValue());
                } else {
                    threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcfv(Profile.DEFAULT_PROFILE_NAME));
                }
            } else {
                threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzcfv(Profile.DEFAULT_PROFILE_NAME));
            }
        }
        f9946a = new zzcfx(threadPoolExecutor);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, timeUnit, new LinkedBlockingQueue(), new zzcfv("Loader"));
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
        f9947b = new zzcfx(threadPoolExecutor2);
        ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new zzcfv("Activeview"));
        threadPoolExecutor3.allowCoreThreadTimeOut(true);
        f9948c = new zzcfx(threadPoolExecutor3);
        zzcfu zzcfuVar = new zzcfu(3, new zzcfv("Schedule"));
        f9949d = zzcfuVar;
        f9950e = new zzhcv(zzcfuVar);
        f9951f = new zzcfx(new zzcfw());
        f9952g = Executors.newSingleThreadExecutor(new zzcfv("AdQualityMetrics"));
        f9953h = new zzcfx(zzhbu.f18506s);
    }
}
