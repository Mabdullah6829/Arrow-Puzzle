package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfac implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzcvq f15258a;

    /* JADX INFO: renamed from: b */
    public final zzini f15259b;

    /* JADX INFO: renamed from: c */
    public final zzinl f15260c;

    public zzfac(zzcvq zzcvqVar, zzini zziniVar, zzinl zzinlVar) {
        this.f15258a = zzcvqVar;
        this.f15259b = zziniVar;
        this.f15260c = zzinlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzfaa zzb() {
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzfaa(zzhcpVar, this.f15258a.f11580a.f11579a, (Context) this.f15259b.zzb(), this.f15260c.zzb());
    }
}
