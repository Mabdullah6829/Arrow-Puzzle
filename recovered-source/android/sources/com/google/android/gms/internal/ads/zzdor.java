package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzdor implements zzbpx {

    /* JADX INFO: renamed from: a */
    public final WeakReference f12448a;

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        zzdov zzdovVar = (zzdov) this.f12448a.get();
        if (zzdovVar == null) {
            return;
        }
        zzdle zzdleVar = zzdovVar.f12456A;
        if ("_ac".equals((String) map.get("eventName"))) {
            zzdovVar.f12488z.mo2730k();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f3095e.f3098c.m5030a(zzbix.f8551gc)).booleanValue()) {
                zzdleVar.mo5626C();
                if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    return;
                }
                zzdleVar.mo5627F0();
            }
        }
    }
}
