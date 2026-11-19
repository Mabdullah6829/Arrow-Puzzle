package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class zzcpy implements zzfis {

    /* JADX INFO: renamed from: a */
    public final zzcpe f11129a;

    /* JADX INFO: renamed from: b */
    public Context f11130b;

    /* JADX INFO: renamed from: c */
    public String f11131c;

    /* JADX INFO: renamed from: d */
    public com.google.android.gms.ads.internal.client.zzr f11132d;

    public /* synthetic */ zzcpy(zzcpe zzcpeVar) {
        this.f11129a = zzcpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfis
    /* JADX INFO: renamed from: D */
    public final /* bridge */ /* synthetic */ zzfis mo5778D(String str) {
        str.getClass();
        this.f11131c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfis
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ zzfis mo5779a(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzrVar.getClass();
        this.f11132d = zzrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfis
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ zzfis mo5780b(Context context) {
        context.getClass();
        this.f11130b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfis
    public final zzfit zza() {
        zzinh.m8555b(Context.class, this.f11130b);
        zzinh.m8555b(String.class, this.f11131c);
        zzinh.m8555b(com.google.android.gms.ads.internal.client.zzr.class, this.f11132d);
        return new zzcpz(this.f11129a, this.f11130b, this.f11131c, this.f11132d);
    }
}
