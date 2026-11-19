package com.google.android.gms.internal.ads;

import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzffm implements zzfcq {

    /* JADX INFO: renamed from: a */
    public final HashMap f15584a;

    public zzffm(HashMap map) {
        this.f15584a = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    /* JADX INFO: renamed from: b */
    public final void mo6399b(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", com.google.android.gms.ads.internal.client.zzay.f3085g.f3086a.m3048m(this.f15584a));
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.m3150k("Could not encode video decoder properties: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
