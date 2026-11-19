package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbpy implements zzbpx {

    /* JADX INFO: renamed from: a */
    public final zzecz f9247a;

    public zzbpy(zzecz zzeczVar) {
        this.f9247a = zzeczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        if (map == null || !map.containsKey("persistentData") || TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
            return;
        }
        zzecz zzeczVar = this.f9247a;
        String str = (String) map.get("persistentData");
        synchronized (zzeczVar) {
            zzeczVar.f13653x = str;
            com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g().m3179d(zzeczVar.f13653x);
        }
    }
}
