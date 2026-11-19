package com.google.android.gms.internal.ads;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfev implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final Bundle f15558a;

    public zzfev(Bundle bundle) {
        this.f15558a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final void mo6399b(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        Bundle bundle = this.f15558a;
        if (bundle != null) {
            try {
                com.google.android.gms.ads.internal.util.zzbp.m3123g(com.google.android.gms.ads.internal.util.zzbp.m3123g(jSONObject, "device"), "play_store").put("parental_controls", com.google.android.gms.ads.internal.client.zzay.f3085g.f3086a.m3049n(bundle));
            } catch (JSONException unused) {
                com.google.android.gms.ads.internal.util.zze.m3150k("Failed putting parental controls bundle.");
            }
        }
    }
}
