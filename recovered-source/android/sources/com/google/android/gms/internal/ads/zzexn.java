package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzexn implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final JSONObject f15097a;

    /* JADX INFO: renamed from: b */
    public final JSONObject f15098b;

    public zzexn(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f15097a = jSONObject;
        this.f15098b = jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6399b(Object obj) {
        Bundle bundle = (Bundle) obj;
        JSONObject jSONObject = this.f15097a;
        if (jSONObject != null) {
            bundle.putString("fwd_cld", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f15098b;
        if (jSONObject2 != null) {
            bundle.putString("fwd_common_cld", jSONObject2.toString());
        }
    }
}
