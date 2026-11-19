package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcuy implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzcyr f11532a;

    public zzcuy(zzcyr zzcyrVar) {
        this.f11532a = zzcyrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(this.f11532a.m5872a().f15966z);
        } catch (JSONException unused) {
            return null;
        }
    }
}
