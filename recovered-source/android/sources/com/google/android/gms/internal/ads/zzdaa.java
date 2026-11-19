package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdaa implements com.google.android.gms.ads.internal.client.zza {

    /* JADX INFO: renamed from: s */
    public final zzdae f11857s;

    /* JADX INFO: renamed from: t */
    public final zzflg f11858t;

    public zzdaa(zzdae zzdaeVar, zzflg zzflgVar) {
        this.f11857s = zzdaeVar;
        this.f11858t = zzflgVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    /* JADX INFO: renamed from: k */
    public final void mo2730k() {
        zzflg zzflgVar = this.f11858t;
        zzdae zzdaeVar = this.f11857s;
        String str = zzflgVar.f16043g;
        synchronized (zzdaeVar.f11869a) {
            try {
                ConcurrentHashMap concurrentHashMap = zzdaeVar.f11870b;
                Integer num = (Integer) concurrentHashMap.get(str);
                concurrentHashMap.put(str, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
