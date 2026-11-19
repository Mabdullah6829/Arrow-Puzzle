package com.google.android.gms.ads.internal.util.client;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzv {

    /* JADX INFO: renamed from: a */
    public final zzx f3446a;

    public zzv() {
        this.f3446a = new zzn(1, 0, 1.0d, false);
    }

    /* JADX INFO: renamed from: a */
    public static zzv m3084a(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ping_strategy");
        return new zzv(jSONObjectOptJSONObject == null ? new zzn(1, 0, 1.0d, false) : new zzn(jSONObjectOptJSONObject.optInt("max_attempts", 1), jSONObjectOptJSONObject.optInt("initial_backoff_ms", 0), jSONObjectOptJSONObject.optDouble("backoff_multiplier", 1.0d), jSONObjectOptJSONObject.optBoolean("buffer_after_max_attempts", false)));
    }

    public zzv(zzx zzxVar) {
        this.f3446a = zzxVar;
    }
}
