package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzbth implements zzbpx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbte f9340a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ com.google.android.gms.ads.internal.util.zzbv f9341b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzbub f9342c;

    public zzbth(zzbub zzbubVar, zzbte zzbteVar, com.google.android.gms.ads.internal.util.zzbv zzbvVar) {
        this.f9340a = zzbteVar;
        this.f9341b = zzbvVar;
        this.f9342c = zzbubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        zzbub zzbubVar = this.f9342c;
        synchronized (zzbubVar.f9382a) {
            try {
                com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > /requestReload handler: Lock acquired");
                com.google.android.gms.ads.internal.util.client.zzo.m3072e("JS Engine is requesting an update");
                if (zzbubVar.f9390i == 0) {
                    com.google.android.gms.ads.internal.util.client.zzo.m3072e("Starting reload.");
                    zzbubVar.f9390i = 2;
                    zzbubVar.m5141a();
                }
                this.f9340a.mo5133n("/requestReload", (zzbpx) this.f9341b.f3546a);
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.util.zze.m3150k("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
