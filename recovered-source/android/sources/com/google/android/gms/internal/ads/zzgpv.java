package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgpv implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzina f18007a;

    /* JADX INFO: renamed from: b */
    public final zzini f18008b;

    /* JADX INFO: renamed from: c */
    public final zzini f18009c;

    /* JADX INFO: renamed from: d */
    public final zzina f18010d;

    public zzgpv(zzimy zzimyVar, zzimy zzimyVar2, zzina zzinaVar, zzina zzinaVar2) {
        this.f18007a = zzinaVar;
        this.f18008b = zzimyVar;
        this.f18009c = zzimyVar2;
        this.f18010d = zzinaVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzgpu((Context) this.f18007a.f20011a, (zzgdq) this.f18010d.f20011a, (zzgqo) this.f18008b.zzb(), (zzhcp) this.f18009c.zzb());
    }
}
