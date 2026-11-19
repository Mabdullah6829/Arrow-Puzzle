package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class zzbil extends zzbio {
    @Override // com.google.android.gms.internal.ads.zzbio
    /* JADX INFO: renamed from: a */
    public final Object mo5012a(Bundle bundle) {
        String str = this.f7980b;
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(str)) ? Long.valueOf(bundle.getLong("com.google.android.gms.ads.flag.".concat(str))) : (Long) m5021e();
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    /* JADX INFO: renamed from: b */
    public final void mo5013b(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(this.f7980b, ((Long) obj).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    /* JADX INFO: renamed from: c */
    public final Object mo5014c(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(this.f7980b, ((Long) m5021e()).longValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzbio
    /* JADX INFO: renamed from: d */
    public final Object mo5015d(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(this.f7980b, ((Long) m5021e()).longValue()));
    }
}
