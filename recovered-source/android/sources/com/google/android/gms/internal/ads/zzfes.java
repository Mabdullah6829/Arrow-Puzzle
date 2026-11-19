package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfes implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final List f15555a;

    public zzfes(List list) {
        this.f15555a = list;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6399b(Object obj) {
        try {
            ((JSONObject) obj).put("eid", TextUtils.join(",", this.f15555a));
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.m3150k("Failed putting experiment ids.");
        }
    }
}
