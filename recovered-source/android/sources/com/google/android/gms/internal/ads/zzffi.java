package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzffi implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final String f15576a;

    public zzffi(String str) {
        this.f15576a = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6399b(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        try {
            String str = this.f15576a;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            com.google.android.gms.ads.internal.util.zzbp.m3123g(jSONObject, "pii").put("adsid", str);
        } catch (JSONException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.f3574b;
            com.google.android.gms.ads.internal.util.client.zzo.m3074g("Failed putting trustless token.", e);
        }
    }
}
