package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzfav implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzbio zzbioVar = zzbix.f8562h6;
        com.google.android.gms.ads.internal.client.zzba zzbaVar = com.google.android.gms.ads.internal.client.zzba.f3095e;
        if (!((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue()) {
            return new zzfax(null);
        }
        if (!((Boolean) zzbaVar.f3098c.m5030a(zzbix.f8714q6)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3724x.getClass();
            return new zzfax(((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() ? (String) zzelp.m6272i(new zzelo() { // from class: com.google.android.gms.internal.ads.zzele
                @Override // com.google.android.gms.internal.ads.zzelo
                public final /* synthetic */ Object zza() {
                    return "a.1.5.2-google_20241009";
                }
            }) : null);
        }
        if (zzfaw.f15292b == null) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3724x.getClass();
            zzfaw.f15292b = ((Boolean) zzbaVar.f3098c.m5030a(zzbioVar)).booleanValue() ? (String) zzelp.m6272i(new zzelo() { // from class: com.google.android.gms.internal.ads.zzele
                @Override // com.google.android.gms.internal.ads.zzelo
                public final /* synthetic */ Object zza() {
                    return "a.1.5.2-google_20241009";
                }
            }) : null;
        }
        return new zzfax(zzfaw.f15292b);
    }
}
