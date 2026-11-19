package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzggk implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f17202a;

    /* JADX INFO: renamed from: b */
    public final zzini f17203b;

    /* JADX INFO: renamed from: c */
    public final zzini f17204c;

    /* JADX INFO: renamed from: d */
    public final zzina f17205d;

    /* JADX INFO: renamed from: e */
    public final zzina f17206e;

    /* JADX INFO: renamed from: f */
    public final zzini f17207f;

    public zzggk(zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3, zzina zzinaVar, zzina zzinaVar2, zzimy zzimyVar4) {
        this.f17202a = zzimyVar;
        this.f17203b = zzimyVar2;
        this.f17204c = zzimyVar3;
        this.f17205d = zzinaVar;
        this.f17206e = zzinaVar2;
        this.f17207f = zzimyVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzggj(zzimy.m8548b(this.f17202a), zzimy.m8548b(this.f17203b), zzimy.m8548b(this.f17204c), (zzgdq) this.f17205d.f20011a, (ExecutorService) this.f17206e.f20011a, (zzgqo) this.f17207f.zzb());
    }
}
