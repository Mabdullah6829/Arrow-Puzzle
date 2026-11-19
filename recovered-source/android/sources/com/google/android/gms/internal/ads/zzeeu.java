package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeeu implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzefh f13769a;

    /* JADX INFO: renamed from: b */
    public final zzeir f13770b;

    public zzeeu(zzefh zzefhVar, zzeir zzeirVar) {
        this.f13769a = zzefhVar;
        this.f13770b = zzeirVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        zzhcp zzhcpVar = zzcfy.f9947b;
        zzinh.m8554a(zzhcpVar);
        zzhcp zzhcpVar2 = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar2);
        return new zzeet(zzhcpVar, zzhcpVar2, new zzegd((Context) this.f13769a.f13790a.zzb(), zzhcpVar2), zzimy.m8548b(this.f13770b));
    }
}
