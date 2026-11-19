package com.google.android.gms.internal.measurement;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class zzrh implements zzrl {
    @Override // com.google.android.gms.internal.measurement.zzrl
    /* JADX INFO: renamed from: a */
    public final boolean mo10624a(zzrg zzrgVar) {
        zzrgVar.getClass();
        String str = "false";
        try {
            str = (String) zzrm.f22821a.invoke(null, "tiktok_systrace", "false");
        } catch (Exception e) {
            Log.e("SystemProperties", "get error", e);
        }
        return str.equals("true");
    }
}
