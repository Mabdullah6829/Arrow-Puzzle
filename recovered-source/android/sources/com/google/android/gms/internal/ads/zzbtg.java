package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzbtg implements zzbpx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f9336a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzbua f9337b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzbte f9338c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzbub f9339d;

    public zzbtg(zzbub zzbubVar, long j2, zzbua zzbuaVar, zzbte zzbteVar) {
        this.f9336a = j2;
        this.f9337b = zzbuaVar;
        this.f9338c = zzbteVar;
        this.f9339d = zzbubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f9336a;
        StringBuilder sb = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 42);
        sb.append("onGmsg /jsLoaded. JsLoaded latency is ");
        sb.append(jCurrentTimeMillis);
        sb.append(" ms.");
        com.google.android.gms.ads.internal.util.zze.m3150k(sb.toString());
        com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        zzbub zzbubVar = this.f9339d;
        synchronized (zzbubVar.f9382a) {
            com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            zzbua zzbuaVar = this.f9337b;
            if (zzbuaVar.f9964b.get() != -1 && zzbuaVar.f9964b.get() != 1) {
                zzbubVar.f9390i = 0;
                zzbte zzbteVar = this.f9338c;
                zzbteVar.mo5134r("/log", zzbpw.f9227g);
                zzbteVar.mo5134r("/result", zzbpw.f9235o);
                zzbuaVar.f9963a.m5397a(zzbteVar);
                zzbubVar.f9389h = zzbuaVar;
                com.google.android.gms.ads.internal.util.zze.m3150k("Successfully loaded JS Engine.");
                com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
