package com.google.android.gms.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class LoadAdError extends AdError {

    /* JADX INFO: renamed from: e */
    public final ResponseInfo f2968e;

    public LoadAdError(int i2, String str, String str2, AdError adError, ResponseInfo responseInfo) {
        super(i2, str, str2, adError);
        this.f2968e = responseInfo;
    }

    @Override // com.google.android.gms.ads.AdError
    /* JADX INFO: renamed from: b */
    public final JSONObject mo2746b() throws JSONException {
        JSONObject jSONObjectMo2746b = super.mo2746b();
        ResponseInfo responseInfo = this.f2968e;
        if (responseInfo == null) {
            jSONObjectMo2746b.put("Response Info", "null");
            return jSONObjectMo2746b;
        }
        jSONObjectMo2746b.put("Response Info", responseInfo.m2759a());
        return jSONObjectMo2746b;
    }

    @Override // com.google.android.gms.ads.AdError
    public final String toString() {
        try {
            return mo2746b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
