package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdoy implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzdpa f12518a;

    public zzdoy(zzdpa zzdpaVar) {
        this.f12518a = zzdpaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzdqf zzdqfVar = (zzdqf) this.f12518a.f12521a.zzb();
        zzinh.m8554a(zzdqfVar);
        JSONObject jSONObject = zzdqfVar.f12635b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(zzdqfVar.f12642a.f15966z);
        } catch (JSONException unused) {
            return null;
        }
    }
}
