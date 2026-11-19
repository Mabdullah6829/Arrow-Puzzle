package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfcw implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f15435a;

    /* JADX INFO: renamed from: b */
    public final zzinl f15436b;

    /* JADX INFO: renamed from: c */
    public final zzini f15437c;

    public zzfcw(zzini zziniVar, zzinl zzinlVar, zzini zziniVar2) {
        this.f15435a = zziniVar;
        this.f15436b = zzinlVar;
        this.f15437c = zziniVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final zzfcv zzb() {
        Context contextM5709a = ((zzcnz) this.f15435a).m5709a();
        zzhcp zzhcpVar = zzcfy.f9946a;
        zzinh.m8554a(zzhcpVar);
        return new zzfcv(contextM5709a, zzhcpVar, this.f15436b.zzb(), (zzfqq) this.f15437c.zzb());
    }
}
