package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzbou implements zzbpx {
    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        zzclb zzclbVar = (zzclb) obj;
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = com.google.android.gms.ads.internal.zzt.f3698C.f3719s;
        Context context = zzclbVar.getContext();
        synchronized (zzzVar) {
            zzzVar.f3392c = zzclbVar;
            if (!zzzVar.m3026a(context)) {
                zzzVar.m3028c("Unable to bind", "on_play_store_bind");
                return;
            }
            HashMap map2 = new HashMap();
            map2.put("action", "fetch_completed");
            zzzVar.m3029d(map2, "on_play_store_bind");
        }
    }
}
