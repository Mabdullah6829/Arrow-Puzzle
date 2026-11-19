package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class zzcpn implements zzfhc {

    /* JADX INFO: renamed from: a */
    public final zzcpe f11007a;

    /* JADX INFO: renamed from: b */
    public Context f11008b;

    /* JADX INFO: renamed from: c */
    public String f11009c;

    /* JADX INFO: renamed from: d */
    public com.google.android.gms.ads.internal.client.zzr f11010d;

    public /* synthetic */ zzcpn(zzcpe zzcpeVar) {
        this.f11007a = zzcpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    /* JADX INFO: renamed from: D */
    public final /* bridge */ /* synthetic */ zzfhc mo5757D(String str) {
        str.getClass();
        this.f11009c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ zzfhc mo5758a(com.google.android.gms.ads.internal.client.zzr zzrVar) {
        zzrVar.getClass();
        this.f11010d = zzrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ zzfhc mo5759b(Context context) {
        context.getClass();
        this.f11008b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfhc
    public final zzfhd zza() {
        zzinh.m8555b(Context.class, this.f11008b);
        zzinh.m8555b(String.class, this.f11009c);
        zzinh.m8555b(com.google.android.gms.ads.internal.client.zzr.class, this.f11010d);
        return new zzcpo(this.f11007a, this.f11008b, this.f11009c, this.f11010d);
    }
}
