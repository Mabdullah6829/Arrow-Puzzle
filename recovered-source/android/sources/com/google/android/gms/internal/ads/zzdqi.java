package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdqi implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzcyr f12644a;

    /* JADX INFO: renamed from: b */
    public final zzdoz f12645b;

    public zzdqi(zzcyr zzcyrVar, zzdoz zzdozVar) {
        this.f12644a = zzcyrVar;
        this.f12645b = zzdozVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzfkn zzfknVarM5872a = this.f12644a.m5872a();
        JSONObject jSONObject = this.f12645b.f12519a.f12514a;
        zzinh.m8554a(jSONObject);
        return new zzdqf(zzfknVarM5872a, jSONObject);
    }
}
