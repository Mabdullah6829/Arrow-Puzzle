package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzcjd implements Runnable {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ int f10201A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ zzcjn f10202B;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ String f10203s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ String f10204t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ int f10205u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ int f10206v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ long f10207w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f10208x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f10209y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f10210z;

    public zzcjd(zzcjn zzcjnVar, String str, String str2, int i2, int i3, long j2, long j3, boolean z, int i4, int i5) {
        this.f10203s = str;
        this.f10204t = str2;
        this.f10205u = i2;
        this.f10206v = i3;
        this.f10207w = j2;
        this.f10208x = j3;
        this.f10209y = z;
        this.f10210z = i4;
        this.f10201A = i5;
        this.f10202B = zzcjnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        map.put("src", this.f10203s);
        map.put("cachedSrc", this.f10204t);
        map.put("bytesLoaded", Integer.toString(this.f10205u));
        map.put("totalBytes", Integer.toString(this.f10206v));
        map.put("bufferedDuration", Long.toString(this.f10207w));
        map.put("totalDuration", Long.toString(this.f10208x));
        map.put("cacheReady", true != this.f10209y ? "0" : "1");
        map.put("playerCount", Integer.toString(this.f10210z));
        map.put("playerPreparedCount", Integer.toString(this.f10201A));
        this.f10202B.m5514q(map);
    }
}
