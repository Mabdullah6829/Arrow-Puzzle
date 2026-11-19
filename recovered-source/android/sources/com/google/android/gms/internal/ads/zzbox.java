package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzbox implements zzbpx {
    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        zzgrg zzgrgVar;
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = com.google.android.gms.ads.internal.zzt.f3698C.f3719s;
        if (!zzzVar.f3394e || (zzgrgVar = zzzVar.f3393d) == null) {
            com.google.android.gms.ads.internal.util.zze.m3150k("LastMileDelivery not connected");
        } else {
            ((zzgri) zzgrgVar).f18108a.m7106a(zzzVar.m3030e(), zzzVar.f3395f, 2);
            zzzVar.m3029d(new HashMap(), "onLMDOverlayCollapse");
        }
    }
}
