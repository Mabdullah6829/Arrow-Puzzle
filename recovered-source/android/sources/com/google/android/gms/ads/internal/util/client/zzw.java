package com.google.android.gms.ads.internal.util.client;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzw {
    /* JADX INFO: renamed from: d */
    public static zzw m3085d(JSONObject jSONObject) {
        return new zzm(jSONObject.optInt("impression_prerequisite", 0), jSONObject.optInt("click_prerequisite", 0), jSONObject.optBoolean("notification_flow_enabled", false));
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo3061a();

    /* JADX INFO: renamed from: b */
    public abstract int mo3062b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo3063c();
}
