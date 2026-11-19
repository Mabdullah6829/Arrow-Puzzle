package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzbpa implements zzbpx {
    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        try {
            String str = (String) map.get("enabled");
            zzbpx zzbpxVar = zzbpw.f9221a;
            if (!zzgsz.m7122d("true", str) && !zzgsz.m7122d("false", str)) {
                return;
            }
            zzgcs zzgcsVarM6881a = zzgcs.m6881a(zzclbVar.getContext());
            boolean z = Boolean.parseBoolean(str);
            zzgcsVarM6881a.getClass();
            synchronized (zzgcs.class) {
                zzgcsVarM6881a.f16990a.m6883a("paidv2_user_option", Boolean.valueOf(z));
            }
        } catch (IOException e) {
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5384d("DefaultGmsgHandlers.SetPaidv2PersonalizationEnabled", e);
        }
    }
}
