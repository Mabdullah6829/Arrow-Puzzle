package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzcjf implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ String f10215s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ String f10216t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ long f10217u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zzcjh f10218v;

    public zzcjf(zzcjh zzcjhVar, String str, String str2, long j2) {
        this.f10215s = str;
        this.f10216t = str2;
        this.f10217u = j2;
        this.f10218v = zzcjhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
        map.put("src", this.f10215s);
        map.put("cachedSrc", this.f10216t);
        map.put("totalDuration", Long.toString(this.f10217u));
        this.f10218v.m5514q(map);
    }
}
