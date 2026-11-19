package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzbij extends zzbio {
    public zzbij(Boolean bool, int i2, Boolean bool2, String str) {
        super(i2, str, bool, bool2);
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    /* JADX INFO: renamed from: a */
    public final Object mo5012a(Bundle bundle) {
        String str = this.f7980b;
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Boolean.valueOf(bundle.getBoolean("com.google.android.gms.ads.flag.".concat(str))) : (Boolean) m5021e();
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    /* JADX INFO: renamed from: b */
    public final void mo5013b(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(this.f7980b, ((Boolean) obj).booleanValue());
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    /* JADX INFO: renamed from: c */
    public final Object mo5014c(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(this.f7980b, ((Boolean) m5021e()).booleanValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    /* JADX INFO: renamed from: d */
    public final Object mo5015d(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(this.f7980b, ((Boolean) m5021e()).booleanValue()));
    }
}
