package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzbin extends zzbio {
    public zzbin(String str, String str2, String str3) {
        super(1, str, str2, str3);
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    /* JADX INFO: renamed from: a */
    public final Object mo5012a(Bundle bundle) {
        String str = this.f7980b;
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? bundle.getString("com.google.android.gms.ads.flag.".concat(str)) : (String) m5021e();
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    /* JADX INFO: renamed from: b */
    public final void mo5013b(SharedPreferences.Editor editor, Object obj) {
        editor.putString(this.f7980b, (String) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    /* JADX INFO: renamed from: c */
    public final Object mo5014c(JSONObject jSONObject) {
        return jSONObject.optString(this.f7980b, (String) m5021e());
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    /* JADX INFO: renamed from: d */
    public final Object mo5015d(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(this.f7980b, (String) m5021e());
    }
}
