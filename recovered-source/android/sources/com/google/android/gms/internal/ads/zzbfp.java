package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class zzbfp implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzbfq f7760s;

    public zzbfp(zzbfq zzbfqVar) {
        this.f7760s = zzbfqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbfq zzbfqVar = this.f7760s;
        synchronized (zzbfqVar.f7765u) {
            if (zzbfqVar.f7766v.get() && zzbfqVar.f7767w) {
                zzbfqVar.f7766v.set(false);
                int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3068a("App went background");
                ArrayList arrayList = zzbfqVar.f7768x;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    try {
                        ((zzbfr) obj).mo2997k0(false);
                    } catch (Exception e) {
                        com.google.android.gms.ads.internal.util.client.zzo.m3071d("", e);
                    }
                }
            } else {
                int i4 = com.google.android.gms.ads.internal.util.zze.f3574b;
                com.google.android.gms.ads.internal.util.client.zzo.m3068a("App is still foreground");
            }
        }
    }
}
