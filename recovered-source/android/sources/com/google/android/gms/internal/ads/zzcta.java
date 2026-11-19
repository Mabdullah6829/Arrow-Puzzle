package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcta implements zzcsa {

    /* JADX INFO: renamed from: a */
    public final com.google.android.gms.ads.internal.util.zzg f11353a;

    public zzcta(com.google.android.gms.ads.internal.util.zzj zzjVar) {
        this.f11353a = zzjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsa
    /* JADX INFO: renamed from: a */
    public final void mo5814a(HashMap map) {
        int iIntValue;
        String str = (String) map.get("total_inflight_ad_limit");
        if (str == null || (iIntValue = Float.valueOf(str).intValue()) <= 0) {
            return;
        }
        this.f11353a.mo3161Z(iIntValue);
    }
}
