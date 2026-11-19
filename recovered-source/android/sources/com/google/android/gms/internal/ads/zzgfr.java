package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgfr implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzinl f17147a;

    /* JADX INFO: renamed from: b */
    public final zzinl f17148b;

    /* JADX INFO: renamed from: c */
    public final zzina f17149c;

    /* JADX INFO: renamed from: d */
    public final zzini f17150d;

    public zzgfr(zzinl zzinlVar, zzinl zzinlVar2, zzina zzinaVar, zzimy zzimyVar) {
        this.f17147a = zzinlVar;
        this.f17148b = zzinlVar2;
        this.f17149c = zzinaVar;
        this.f17150d = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzgfq(zzimy.m8548b(this.f17147a), zzimy.m8548b(this.f17148b), (ExecutorService) this.f17149c.f20011a, zzimy.m8548b(this.f17150d));
    }
}
