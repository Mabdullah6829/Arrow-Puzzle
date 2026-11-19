package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzdos implements zzbpx {

    /* JADX INFO: renamed from: a */
    public final WeakReference f12449a;

    @Override // com.google.android.gms.internal.ads.zzbpx
    /* JADX INFO: renamed from: a */
    public final void mo5095a(Object obj, Map map) {
        zzdov zzdovVar = (zzdov) this.f12449a.get();
        if (zzdovVar == null) {
            return;
        }
        zzdle zzdleVar = zzdovVar.f12456A;
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
