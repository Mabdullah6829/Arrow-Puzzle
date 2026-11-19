package com.google.android.gms.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AdError {

    /* JADX INFO: renamed from: a */
    public final int f2928a;

    /* JADX INFO: renamed from: b */
    public final String f2929b;

    /* JADX INFO: renamed from: c */
    public final String f2930c;

    /* JADX INFO: renamed from: d */
    public final AdError f2931d;

    public AdError(int i2, String str, String str2, AdError adError) {
        this.f2928a = i2;
        this.f2929b = str;
        this.f2930c = str2;
        this.f2931d = adError;
    }

    /* JADX INFO: renamed from: a */
    public final com.google.android.gms.ads.internal.client.zze m2745a() {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        AdError adError = this.f2931d;
        if (adError == null) {
            zzeVar = null;
        } else {
            zzeVar = new com.google.android.gms.ads.internal.client.zze(adError.f2928a, adError.f2929b, adError.f2930c, null, null);
        }
        return new com.google.android.gms.ads.internal.client.zze(this.f2928a, this.f2929b, this.f2930c, zzeVar, null);
    }

    /* JADX INFO: renamed from: b */
    public JSONObject mo2746b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f2928a);
        jSONObject.put("Message", this.f2929b);
        jSONObject.put("Domain", this.f2930c);
        AdError adError = this.f2931d;
        if (adError == null) {
            jSONObject.put("Cause", "null");
            return jSONObject;
        }
        jSONObject.put("Cause", adError.mo2746b());
        return jSONObject;
    }

    public String toString() {
        try {
            return mo2746b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
