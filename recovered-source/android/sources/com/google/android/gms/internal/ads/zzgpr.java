package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgpr implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzina f17995a;

    /* JADX INFO: renamed from: b */
    public final zzini f17996b;

    /* JADX INFO: renamed from: c */
    public final zzina f17997c;

    /* JADX INFO: renamed from: d */
    public final zzini f17998d;

    public zzgpr(zzimy zzimyVar, zzimy zzimyVar2, zzina zzinaVar, zzina zzinaVar2) {
        this.f17995a = zzinaVar;
        this.f17996b = zzimyVar;
        this.f17997c = zzinaVar2;
        this.f17998d = zzimyVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzgpq((Context) this.f17995a.f20011a, (zzgdq) this.f17997c.f20011a, (zzgqo) this.f17996b.zzb(), (zzhcp) this.f17998d.zzb());
    }
}
