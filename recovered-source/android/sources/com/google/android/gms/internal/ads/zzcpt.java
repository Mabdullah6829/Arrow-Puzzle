package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class zzcpt implements zzebk {

    /* JADX INFO: renamed from: a */
    public final zzcpe f11038a;

    /* JADX INFO: renamed from: b */
    public Context f11039b;

    /* JADX INFO: renamed from: c */
    public zzbqx f11040c;

    public /* synthetic */ zzcpt(zzcpe zzcpeVar) {
        this.f11038a = zzcpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebk
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ zzebk mo5765a(zzbqx zzbqxVar) {
        zzbqxVar.getClass();
        this.f11040c = zzbqxVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzebk
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ zzebk mo5766d(Context context) {
        context.getClass();
        this.f11039b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzebk
    public final zzebl zza() {
        zzinh.m8555b(Context.class, this.f11039b);
        zzinh.m8555b(zzbqx.class, this.f11040c);
        return new zzcpu(this.f11038a, this.f11039b, this.f11040c);
    }
}
