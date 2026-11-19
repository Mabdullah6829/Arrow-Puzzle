package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzcjc implements Runnable {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ int f10190A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ int f10191B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ zzcjh f10192C;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ String f10193s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ String f10194t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ long f10195u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ long f10196v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ long f10197w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f10198x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f10199y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f10200z;

    public zzcjc(zzcjh zzcjhVar, String str, String str2, long j2, long j3, long j4, long j5, long j6, boolean z, int i2, int i3) {
        this.f10193s = str;
        this.f10194t = str2;
        this.f10195u = j2;
        this.f10196v = j3;
        this.f10197w = j4;
        this.f10198x = j5;
        this.f10199y = j6;
        this.f10200z = z;
        this.f10190A = i2;
        this.f10191B = i3;
        this.f10192C = zzcjhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        map.put("src", this.f10193s);
        map.put("cachedSrc", this.f10194t);
        map.put("bufferedDuration", Long.toString(this.f10195u));
        map.put("totalDuration", Long.toString(this.f10196v));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8829x2)).booleanValue()) {
            map.put("qoeLoadedBytes", Long.toString(this.f10197w));
            map.put("qoeCachedBytes", Long.toString(this.f10198x));
            map.put("totalBytes", Long.toString(this.f10199y));
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            map.put("reportTime", Long.toString(System.currentTimeMillis()));
        }
        map.put("cacheReady", true != this.f10200z ? "0" : "1");
        map.put("playerCount", Integer.toString(this.f10190A));
        map.put("playerPreparedCount", Integer.toString(this.f10191B));
        this.f10192C.m5514q(map);
    }
}
