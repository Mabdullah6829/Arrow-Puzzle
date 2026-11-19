package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes2.dex */
public final class zzewo implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f15050a;

    public zzewo(zzcop zzcopVar) {
        this.f15050a = zzcopVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzewm zzb() {
        VersionInfoParcel versionInfoParcelM5711a = ((zzcop) this.f15050a).m5711a();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzewm(versionInfoParcelM5711a, zzhcpVar);
    }
}
