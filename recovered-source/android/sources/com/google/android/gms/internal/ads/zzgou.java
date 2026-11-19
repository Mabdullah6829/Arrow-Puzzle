package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgou implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f17948a;

    /* JADX INFO: renamed from: b */
    public final zzini f17949b;

    /* JADX INFO: renamed from: c */
    public final zzini f17950c;

    /* JADX INFO: renamed from: d */
    public final zzini f17951d;

    /* JADX INFO: renamed from: e */
    public final zzini f17952e;

    public zzgou(zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3, zzimy zzimyVar4, zzina zzinaVar) {
        this.f17948a = zzimyVar;
        this.f17949b = zzimyVar2;
        this.f17950c = zzimyVar3;
        this.f17951d = zzinaVar;
        this.f17952e = zzimyVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgot((zzgfe) this.f17948a.zzb(), (zzgfe) this.f17949b.zzb(), zzimy.m8548b(this.f17950c), (ExecutorService) this.f17951d.zzb(), (zzgqo) this.f17952e.zzb());
    }
}
