package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzcje implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ String f10211s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ String f10212t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ int f10213u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ zzcjh f10214v;

    public zzcje(zzcjh zzcjhVar, String str, String str2, int i2) {
        this.f10211s = str;
        this.f10212t = str2;
        this.f10213u = i2;
        this.f10214v = zzcjhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
        map.put("src", this.f10211s);
        map.put("cachedSrc", this.f10212t);
        map.put("totalBytes", Integer.toString(this.f10213u));
        this.f10214v.m5514q(map);
    }
}
