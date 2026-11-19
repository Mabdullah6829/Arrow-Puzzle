package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfeo implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final String f15549a;

    /* JADX INFO: renamed from: b */
    public final String f15550b;

    public zzfeo(String str, String str2) {
        this.f15549a = str;
        this.f15550b = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6399b(Object obj) {
        try {
            JSONObject jSONObjectM3123g = com.google.android.gms.ads.internal.util.zzbp.m3123g((JSONObject) obj, "pii");
            jSONObjectM3123g.put("doritos", this.f15549a);
            jSONObjectM3123g.put("doritos_v2", this.f15550b);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.m3150k("Failed putting doritos string.");
        }
    }
}
