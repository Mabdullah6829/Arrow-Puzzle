package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzbik extends zzbio {
    @Override // com.google.android.gms.internal.ads.zzbio
    /* JADX INFO: renamed from: a */
    public final Object mo5012a(Bundle bundle) {
        String str = this.f7980b;
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Integer.valueOf(bundle.getInt("com.google.android.gms.ads.flag.".concat(str))) : (Integer) m5021e();
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    /* JADX INFO: renamed from: b */
    public final void mo5013b(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(this.f7980b, ((Integer) obj).intValue());
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    /* JADX INFO: renamed from: c */
    public final Object mo5014c(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(this.f7980b, ((Integer) m5021e()).intValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    /* JADX INFO: renamed from: d */
    public final Object mo5015d(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(this.f7980b, ((Integer) m5021e()).intValue()));
    }
}
