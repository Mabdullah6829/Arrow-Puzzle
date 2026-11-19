package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcte implements zzcsa {

    /* JADX INFO: renamed from: a */
    public final zzecz f11357a;

    public zzcte(zzecz zzeczVar) {
        this.f11357a = zzeczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcsa
    /* JADX INFO: renamed from: a */
    public final void mo5814a(HashMap map) {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f11357a.m6163b(str.equals("true"));
    }
}
