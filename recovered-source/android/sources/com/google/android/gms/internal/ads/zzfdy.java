package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfdy implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final String f15527a;

    public zzfdy(String str) {
        this.f15527a = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6399b(Object obj) {
        try {
            ((JSONObject) obj).put("ms", this.f15527a);
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.m3151l("Failed putting Ad ID.", e);
        }
    }
}
