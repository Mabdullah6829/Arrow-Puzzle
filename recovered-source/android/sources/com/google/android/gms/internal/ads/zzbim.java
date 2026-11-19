package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzbim extends zzbio {
    @Override // com.google.android.gms.internal.ads.zzbio
    /* JADX INFO: renamed from: a */
    public final Object mo5012a(Bundle bundle) {
        String str = this.f7980b;
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(str))) : (Float) m5021e();
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    /* JADX INFO: renamed from: b */
    public final void mo5013b(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(this.f7980b, ((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    /* JADX INFO: renamed from: c */
    public final Object mo5014c(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(this.f7980b, ((Float) m5021e()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    /* JADX INFO: renamed from: d */
    public final Object mo5015d(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(this.f7980b, ((Float) m5021e()).floatValue()));
    }
}
