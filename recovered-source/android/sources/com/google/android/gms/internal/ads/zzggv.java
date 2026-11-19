package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzggv implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f17230a;

    /* JADX INFO: renamed from: b */
    public final zzini f17231b;

    /* JADX INFO: renamed from: c */
    public final zzini f17232c;

    /* JADX INFO: renamed from: d */
    public final zzini f17233d;

    /* JADX INFO: renamed from: e */
    public final zzini f17234e;

    /* JADX INFO: renamed from: f */
    public final zzini f17235f;

    /* JADX INFO: renamed from: g */
    public final zzini f17236g;

    public zzggv(zzina zzinaVar, zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3, zzimy zzimyVar4, zzini zziniVar, zzina zzinaVar2) {
        this.f17230a = zzinaVar;
        this.f17231b = zzimyVar;
        this.f17232c = zzimyVar2;
        this.f17233d = zzimyVar3;
        this.f17234e = zzimyVar4;
        this.f17235f = zziniVar;
        this.f17236g = zzinaVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzggs((ExecutorService) this.f17230a.zzb(), zzimy.m8548b(this.f17231b), zzimy.m8548b(this.f17232c), (zzgpj) this.f17233d.zzb(), zzimy.m8548b(this.f17234e), this.f17235f, (zzgdq) this.f17236g.zzb());
    }
}
