package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzegx implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzing f13902a;

    /* JADX INFO: renamed from: b */
    public final zzdge f13903b;

    public zzegx(zzing zzingVar, zzdge zzdgeVar) {
        this.f13902a = zzingVar;
        this.f13903b = zzdgeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Map map = this.f13902a.f19999a;
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzegw(map, zzhcpVar, new zzdgd(this.f13903b.f12155a.zzb()));
    }
}
