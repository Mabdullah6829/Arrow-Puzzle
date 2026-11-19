package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcsq implements zzcsa {

    /* JADX INFO: renamed from: a */
    public final Context f11334a;

    /* JADX INFO: renamed from: b */
    public final com.google.android.gms.ads.internal.util.zzj f11335b = com.google.android.gms.ads.internal.zzt.f3698C.f3708h.m5387g();

    public zzcsq(Context context) {
        this.f11334a = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcsa
    /* JADX INFO: renamed from: a */
    public final void mo5814a(HashMap map) {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        boolean z = Boolean.parseBoolean(str);
        this.f11335b.mo3157S(z);
        if (z) {
            com.google.android.gms.ads.internal.util.zzac.m3088a(this.f11334a);
        }
    }
}
