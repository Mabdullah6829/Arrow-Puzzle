package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcss implements zzcsa {

    /* JADX INFO: renamed from: a */
    public final com.google.android.gms.ads.internal.util.zzg f11337a;

    public zzcss(com.google.android.gms.ads.internal.util.zzj zzjVar) {
        this.f11337a = zzjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsa
    /* JADX INFO: renamed from: a */
    public final void mo5814a(HashMap map) {
        int iIntValue;
        String str = (String) map.get("default_queue_capacity");
        if (str == null || (iIntValue = Float.valueOf(str).intValue()) <= 0) {
            return;
        }
        this.f11337a.mo3165c0(iIntValue);
    }
}
