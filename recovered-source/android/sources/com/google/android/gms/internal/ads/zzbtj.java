package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
final class zzbtj implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ zzbua f9344s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ zzbte f9345t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ ArrayList f9346u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ long f9347v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ zzbub f9348w;

    public zzbtj(long j2, zzbte zzbteVar, zzbua zzbuaVar, zzbub zzbubVar, ArrayList arrayList) {
        this.f9344s = zzbuaVar;
        this.f9345t = zzbteVar;
        this.f9346u = arrayList;
        this.f9347v = j2;
        this.f9348w = zzbubVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string;
        com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        zzbub zzbubVar = this.f9348w;
        synchronized (zzbubVar.f9382a) {
            try {
                com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                zzbua zzbuaVar = this.f9344s;
                if (zzbuaVar.f9964b.get() != -1 && zzbuaVar.f9964b.get() != 1) {
                    zzbio zzbioVar = zzbix.f8045C8;
                    com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
                    if (((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
                        zzbuaVar.m5401c("SdkJavascriptFactory.loadJavascriptEngine.Runnable", new TimeoutException("Unable to fully load JS engine."));
                    } else {
                        zzbuaVar.m5400b();
                    }
                    zzhcp zzhcpVar = zzcfy.f9951f;
                    final zzbte zzbteVar = this.f9345t;
                    ((zzcfx) zzhcpVar).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbti
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzbteVar.zzj();
                        }
                    });
                    String strValueOf = String.valueOf(zzbaVar.f3098c.m5030a(zzbix.f8504e));
                    int i2 = zzbuaVar.f9964b.get();
                    int i3 = zzbubVar.f9390i;
                    ArrayList arrayList = this.f9346u;
                    if (arrayList.isEmpty()) {
                        string = ". Still waiting for the engine to be loaded";
                    } else {
                        String strValueOf2 = String.valueOf(arrayList.get(0));
                        StringBuilder sb = new StringBuilder(strValueOf2.length() + 88);
                        sb.append(". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ");
                        sb.append(strValueOf2);
                        string = sb.toString();
                    }
                    com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f9347v;
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 107 + String.valueOf(i2).length() + 36 + String.valueOf(i3).length() + string.length() + 39 + String.valueOf(jCurrentTimeMillis).length() + 26);
                    sb2.append("Could not finish the full JS engine loading in ");
                    sb2.append(strValueOf);
                    sb2.append(" ms. JS engine session reference status(fullLoadTimeout) is ");
                    sb2.append(i2);
                    sb2.append(". Update status(fullLoadTimeout) is ");
                    sb2.append(i3);
                    sb2.append(string);
                    sb2.append(" ms. Total latency(fullLoadTimeout) is ");
                    sb2.append(jCurrentTimeMillis);
                    sb2.append(" ms at timeout. Rejecting.");
                    com.google.android.gms.ads.internal.util.zze.m3150k(sb2.toString());
                    com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                    return;
                }
                com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
