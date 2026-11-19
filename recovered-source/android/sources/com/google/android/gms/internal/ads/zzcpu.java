package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class zzcpu implements zzebl {

    /* JADX INFO: renamed from: a */
    public final Context f11041a;

    /* JADX INFO: renamed from: b */
    public final zzbqx f11042b;

    /* JADX INFO: renamed from: c */
    public final zzcpe f11043c;

    /* JADX INFO: renamed from: d */
    public final zzcpu f11044d = this;

    /* JADX INFO: renamed from: e */
    public final zzimy f11045e;

    public zzcpu(zzcpe zzcpeVar, Context context, zzbqx zzbqxVar) {
        this.f11043c = zzcpeVar;
        this.f11041a = context;
        this.f11042b = zzbqxVar;
        this.f11045e = zzimy.m8547a(new zzebj(zzina.m8549a(this), new zzebh(zzina.m8549a(zzbqxVar))));
    }

    @Override // com.google.android.gms.internal.ads.zzebl
    public final zzebi zzb() {
        return (zzebi) this.f11045e.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzebl
    public final zzebd zzc() {
        return new zzcpr(this.f11043c, this.f11044d);
    }
}
