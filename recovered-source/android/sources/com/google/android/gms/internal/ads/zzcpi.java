package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class zzcpi implements zzffo {

    /* JADX INFO: renamed from: a */
    public final zzcpe f10905a;

    /* JADX INFO: renamed from: b */
    public Context f10906b;

    /* JADX INFO: renamed from: c */
    public String f10907c;

    public /* synthetic */ zzcpi(zzcpe zzcpeVar) {
        this.f10905a = zzcpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzffo
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ zzffo mo5745d(Context context) {
        context.getClass();
        this.f10906b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffo
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ zzffo mo5746m(String str) {
        str.getClass();
        this.f10907c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzffo
    public final zzffp zza() {
        zzinh.m8555b(Context.class, this.f10906b);
        zzinh.m8555b(String.class, this.f10907c);
        return new zzcpj(this.f10905a, this.f10906b, this.f10907c);
    }
}
