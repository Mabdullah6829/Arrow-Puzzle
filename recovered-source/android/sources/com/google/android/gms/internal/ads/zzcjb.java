package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzcjb implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ String f10185s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ String f10186t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ int f10187u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ int f10188v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ zzcjk f10189w;

    public zzcjb(zzcjk zzcjkVar, String str, String str2, int i2, int i3) {
        this.f10185s = str;
        this.f10186t = str2;
        this.f10187u = i2;
        this.f10188v = i3;
        this.f10189w = zzcjkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(NotificationCompat.CATEGORY_EVENT, "precacheProgress");
        map.put("src", this.f10185s);
        map.put("cachedSrc", this.f10186t);
        map.put("bytesLoaded", Integer.toString(this.f10187u));
        map.put("totalBytes", Integer.toString(this.f10188v));
        map.put("cacheReady", "0");
        this.f10189w.m5514q(map);
    }
}
