package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfec implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final String f15535a;

    /* JADX INFO: renamed from: b */
    public final int f15536b;

    public zzfec(String str, int i2) {
        this.f15535a = str;
        this.f15536b = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6399b(Object obj) {
        int i2;
        JSONObject jSONObject = (JSONObject) obj;
        String str = this.f15535a;
        if (TextUtils.isEmpty(str) || (i2 = this.f15536b) == -1) {
            return;
        }
        try {
            JSONObject jSONObjectM3123g = com.google.android.gms.ads.internal.util.zzbp.m3123g(jSONObject, "pii");
            jSONObjectM3123g.put("pvid", str);
            jSONObjectM3123g.put("pvid_s", i2);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.m3151l("Failed putting gms core app set ID info.", e);
        }
    }
}
