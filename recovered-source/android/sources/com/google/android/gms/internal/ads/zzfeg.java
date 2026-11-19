package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfeg implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final JSONObject f15541a;

    public zzfeg(JSONObject jSONObject) {
        this.f15541a = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6399b(Object obj) {
        try {
            ((JSONObject) obj).put("cache_state", this.f15541a);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.m3150k("Unable to get cache_state");
        }
    }
}
