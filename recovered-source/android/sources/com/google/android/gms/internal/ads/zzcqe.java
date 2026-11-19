package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class zzcqe implements zzfkg {

    /* JADX INFO: renamed from: a */
    public final zzcpe f11145a;

    /* JADX INFO: renamed from: b */
    public Context f11146b;

    /* JADX INFO: renamed from: c */
    public String f11147c;

    public /* synthetic */ zzcqe(zzcpe zzcpeVar) {
        this.f11145a = zzcpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfkg
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ zzfkg mo5786d(Context context) {
        context.getClass();
        this.f11146b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfkg
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ zzfkg mo5787m(String str) {
        this.f11147c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfkg
    public final zzfkh zza() {
        zzinh.m8555b(Context.class, this.f11146b);
        return new zzcqf(this.f11145a, this.f11146b, this.f11147c);
    }
}
