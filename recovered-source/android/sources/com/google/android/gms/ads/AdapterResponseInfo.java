package com.google.android.gms.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzv;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AdapterResponseInfo {

    /* JADX INFO: renamed from: a */
    public final zzv f2964a;

    /* JADX INFO: renamed from: b */
    public final AdError f2965b;

    public AdapterResponseInfo(zzv zzvVar) {
        this.f2964a = zzvVar;
        com.google.android.gms.ads.internal.client.zze zzeVar = zzvVar.f3271u;
        this.f2965b = zzeVar == null ? null : zzeVar.m2926w();
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m2752a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        zzv zzvVar = this.f2964a;
        jSONObject.put("Adapter", zzvVar.f3269s);
        jSONObject.put("Latency", zzvVar.f3270t);
        String str = zzvVar.f3273w;
        if (str == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", str);
        }
        String str2 = zzvVar.f3274x;
        if (str2 == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", str2);
        }
        String str3 = zzvVar.f3275y;
        if (str3 == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", str3);
        }
        String str4 = zzvVar.f3276z;
        if (str4 == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", str4);
        }
        JSONObject jSONObject2 = new JSONObject();
        Bundle bundle = zzvVar.f3272v;
        for (String str5 : bundle.keySet()) {
            jSONObject2.put(str5, bundle.get(str5));
        }
        jSONObject.put("Credentials", jSONObject2);
        AdError adError = this.f2965b;
        if (adError == null) {
            jSONObject.put("Ad Error", "null");
            return jSONObject;
        }
        jSONObject.put("Ad Error", adError.mo2746b());
        return jSONObject;
    }

    public final String toString() {
        try {
            return m2752a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
