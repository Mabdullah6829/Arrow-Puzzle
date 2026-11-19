package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbqf implements zzbpx {

    /* JADX INFO: renamed from: a */
    public final zzeaw f9260a;

    public zzbqf(zzeaw zzeawVar) {
        this.f9260a = zzeawVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        if (map == null || !map.containsKey("id") || TextUtils.isEmpty((CharSequence) map.get("id")) || !map.containsKey("event_type") || TextUtils.isEmpty((CharSequence) map.get("event_type"))) {
            com.google.android.gms.ads.internal.util.zze.m3150k("Ignoring onDeviceStorageEvent GMSG: missing required parameters.");
            return;
        }
        try {
            long j2 = Long.parseLong((String) map.get("id"));
            int i2 = Integer.parseInt((String) map.get("event_type"));
            com.google.android.gms.ads.internal.zzt.f3698C.f3711k.getClass();
            this.f9260a.m6139a(i2, j2, System.currentTimeMillis());
        } catch (NumberFormatException e) {
            com.google.android.gms.ads.internal.util.zze.m3151l("Ignoring onDeviceStorageEvent GMSG: invalid number format for ID or eventType.", e);
        }
    }
}
