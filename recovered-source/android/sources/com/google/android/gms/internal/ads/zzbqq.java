package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbqq implements zzbpx {

    /* JADX INFO: renamed from: a */
    public final zzbqp f9284a;

    public zzbqq(zzbqp zzbqpVar) {
        this.f9284a = zzbqpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        String str = (String) map.get("action");
        boolean zEquals = "grant".equals(str);
        zzbqp zzbqpVar = this.f9284a;
        if (!zEquals) {
            if ("video_start".equals(str)) {
                zzbqpVar.mo5116u();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    zzbqpVar.zzc();
                    return;
                }
                return;
            }
        }
        zzcci zzcciVar = null;
        try {
            int i2 = Integer.parseInt((String) map.get("amount"));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzcciVar = new zzcci(str2, i2);
            }
        } catch (NumberFormatException e) {
            int i3 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Unable to parse reward amount.", e);
        }
        zzbqpVar.mo5117x(zzcciVar);
    }
}
