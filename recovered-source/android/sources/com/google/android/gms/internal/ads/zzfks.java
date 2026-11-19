package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfks {

    /* JADX INFO: renamed from: a */
    public final String f15992a;

    /* JADX INFO: renamed from: b */
    public final String f15993b;

    /* JADX INFO: renamed from: c */
    public final JSONObject f15994c;

    /* JADX INFO: renamed from: d */
    public final JSONObject f15995d;

    public zzfks(JsonReader jsonReader) {
        JSONObject jSONObjectM3119c = com.google.android.gms.ads.internal.util.zzbp.m3119c(jsonReader);
        this.f15995d = jSONObjectM3119c;
        this.f15992a = jSONObjectM3119c.optString("ad_html", null);
        this.f15993b = jSONObjectM3119c.optString("ad_base_url", null);
        this.f15994c = jSONObjectM3119c.optJSONObject("ad_json");
    }
}
