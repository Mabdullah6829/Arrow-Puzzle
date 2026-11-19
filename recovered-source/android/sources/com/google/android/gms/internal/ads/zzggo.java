package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzggo implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzina f17216a;

    /* JADX INFO: renamed from: b */
    public final zzini f17217b;

    /* JADX INFO: renamed from: c */
    public final zzini f17218c;

    /* JADX INFO: renamed from: d */
    public final zzina f17219d;

    /* JADX INFO: renamed from: e */
    public final zzini f17220e;

    public zzggo(zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3, zzina zzinaVar, zzina zzinaVar2) {
        this.f17216a = zzinaVar;
        this.f17217b = zzimyVar;
        this.f17218c = zzimyVar2;
        this.f17219d = zzinaVar2;
        this.f17220e = zzimyVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzggn((zzgdq) this.f17216a.f20011a, (zzggj) this.f17217b.zzb(), (zzggd) this.f17218c.zzb(), (ExecutorService) this.f17219d.f20011a, (zzgqo) this.f17220e.zzb());
    }
}
