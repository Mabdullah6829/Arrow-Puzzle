package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzece {

    /* JADX INFO: renamed from: d */
    public final long f13543d;

    /* JADX INFO: renamed from: f */
    public final Context f13545f;

    /* JADX INFO: renamed from: g */
    public final WeakReference f13546g;

    /* JADX INFO: renamed from: h */
    public final zzdxk f13547h;

    /* JADX INFO: renamed from: i */
    public final Executor f13548i;

    /* JADX INFO: renamed from: j */
    public final Executor f13549j;

    /* JADX INFO: renamed from: k */
    public final ScheduledExecutorService f13550k;

    /* JADX INFO: renamed from: l */
    public final zzeae f13551l;

    /* JADX INFO: renamed from: m */
    public final VersionInfoParcel f13552m;

    /* JADX INFO: renamed from: o */
    public final zzdkf f13554o;

    /* JADX INFO: renamed from: p */
    public final zzfqt f13555p;

    /* JADX INFO: renamed from: a */
    public boolean f13540a = false;

    /* JADX INFO: renamed from: b */
    public boolean f13541b = false;

    /* JADX INFO: renamed from: c */
    public boolean f13542c = false;

    /* JADX INFO: renamed from: e */
    public final zzcgd f13544e = new zzcgd();

    /* JADX INFO: renamed from: n */
    public final ConcurrentHashMap f13553n = new ConcurrentHashMap();

    /* JADX INFO: renamed from: q */
    public boolean f13556q = true;

    public zzece(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdxk zzdxkVar, ScheduledExecutorService scheduledExecutorService, zzeae zzeaeVar, VersionInfoParcel versionInfoParcel, zzdkf zzdkfVar, zzfqt zzfqtVar) {
        this.f13547h = zzdxkVar;
        this.f13545f = context;
        this.f13546g = weakReference;
        this.f13548i = executor2;
        this.f13550k = scheduledExecutorService;
        this.f13549j = executor;
        this.f13551l = zzeaeVar;
        this.f13552m = versionInfoParcel;
        this.f13554o = zzdkfVar;
        this.f13555p = zzfqtVar;
        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
        this.f13543d = SystemClock.elapsedRealtime();
        m6153d(0, "com.google.android.gms.ads.MobileAds", "", false);
    }

    /* JADX INFO: renamed from: a */
    public final void m6150a() {
        if (!((Boolean) zzbld.f9112a.m5057c()).booleanValue()) {
            int i2 = this.f13552m.f3398u;
            zzbio zzbioVar = zzbix.f8778u2;
            com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
            if (i2 >= ((Integer) zzbaVar.f3098c.m5030a(zzbioVar)).intValue() && this.f13556q) {
                if (this.f13540a) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f13540a) {
                            return;
                        }
                        this.f13551l.m6132d();
                        this.f13554o.mo5930a();
                        zzcgd zzcgdVar = this.f13544e;
                        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzebw
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzece zzeceVar = this.f13520s;
                                zzeae zzeaeVar = zzeceVar.f13551l;
                                synchronized (zzeaeVar) {
                                    try {
                                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8107G2)).booleanValue() && !zzeaeVar.f13459d) {
                                            HashMap mapM6133e = zzeaeVar.m6133e();
                                            mapM6133e.put("action", "init_finished");
                                            ArrayList arrayList = zzeaeVar.f13457b;
                                            arrayList.add(mapM6133e);
                                            int size = arrayList.size();
                                            int i3 = 0;
                                            while (i3 < size) {
                                                Object obj = arrayList.get(i3);
                                                i3++;
                                                zzeaeVar.f13461f.m6127b((Map) obj);
                                            }
                                            zzeaeVar.f13459d = true;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                zzeceVar.f13554o.mo5931b();
                                zzeceVar.f13541b = true;
                            }
                        };
                        Executor executor = this.f13548i;
                        zzcgdVar.addListener(runnable, executor);
                        this.f13540a = true;
                        ListenableFuture listenableFutureM6152c = m6152c();
                        this.f13550k.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeby
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzece zzeceVar = this.f13523s;
                                synchronized (zzeceVar) {
                                    try {
                                        if (zzeceVar.f13542c) {
                                            return;
                                        }
                                        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                                        zzeceVar.m6153d((int) (SystemClock.elapsedRealtime() - zzeceVar.f13543d), "com.google.android.gms.ads.MobileAds", "Timeout.", false);
                                        zzeceVar.f13551l.m6131c("com.google.android.gms.ads.MobileAds", "timeout");
                                        zzeceVar.f13554o.mo5932d("com.google.android.gms.ads.MobileAds", "timeout");
                                        zzeceVar.f13544e.m5398b(new Exception());
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        }, ((Long) zzbaVar.f3098c.m5030a(zzbix.f8812w2)).longValue(), TimeUnit.SECONDS);
                        listenableFutureM6152c.addListener(new zzhcd(listenableFutureM6152c, new zzebu(this)), executor);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.f13540a) {
            return;
        }
        m6153d(0, "com.google.android.gms.ads.MobileAds", "", true);
        this.f13544e.m5397a(Boolean.FALSE);
        this.f13540a = true;
        this.f13541b = true;
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m6151b() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap concurrentHashMap = this.f13553n;
        for (String str : concurrentHashMap.keySet()) {
            zzbrw zzbrwVar = (zzbrw) concurrentHashMap.get(str);
            arrayList.add(new zzbrw(zzbrwVar.f9311u, str, zzbrwVar.f9312v, zzbrwVar.f9310t));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized ListenableFuture m6152c() {
        com.google.android.gms.ads.internal.zzt zztVar = com.google.android.gms.ads.internal.zzt.f3698C;
        String str = zztVar.f3708h.m5387g().zzi().f9877e;
        if (!TextUtils.isEmpty(str)) {
            return zzhcf.m7367a(str);
        }
        final zzcgd zzcgdVar = new zzcgd();
        com.google.android.gms.ads.internal.util.zzj zzjVarM5387g = zztVar.f3708h.m5387g();
        zzjVarM5387g.f3587c.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                final zzcgd zzcgdVar2 = zzcgdVar;
                this.f13521s.f13548i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecc
                    @Override // java.lang.Runnable
                    public final void run() {
                        String str2 = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g().zzi().f9877e;
                        boolean zIsEmpty = TextUtils.isEmpty(str2);
                        zzcgd zzcgdVar3 = zzcgdVar2;
                        if (zIsEmpty) {
                            zzcgdVar3.m5398b(new Exception());
                        } else {
                            zzcgdVar3.m5397a(str2);
                        }
                    }
                });
            }
        });
        return zzcgdVar;
    }

    /* JADX INFO: renamed from: d */
    public final void m6153d(int i2, String str, String str2, boolean z) {
        this.f13553n.put(str, new zzbrw(i2, str, str2, z));
    }
}
