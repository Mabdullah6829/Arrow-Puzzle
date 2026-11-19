package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgmx implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f17830a;

    /* JADX INFO: renamed from: b */
    public final zzini f17831b;

    /* JADX INFO: renamed from: c */
    public final zzini f17832c;

    /* JADX INFO: renamed from: d */
    public final zzini f17833d;

    /* JADX INFO: renamed from: e */
    public final zzini f17834e;

    /* JADX INFO: renamed from: f */
    public final zzini f17835f;

    /* JADX INFO: renamed from: g */
    public final zzini f17836g;

    public zzgmx(zzina zzinaVar, zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3, zzina zzinaVar2, zzimy zzimyVar4, zzimy zzimyVar5) {
        this.f17830a = zzinaVar;
        this.f17831b = zzimyVar;
        this.f17832c = zzimyVar2;
        this.f17833d = zzimyVar3;
        this.f17834e = zzinaVar2;
        this.f17835f = zzimyVar4;
        this.f17836g = zzimyVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgmw((Context) this.f17830a.zzb(), zzimy.m8548b(this.f17831b), (zzgng) this.f17832c.zzb(), (zzgqo) this.f17833d.zzb(), (ExecutorService) this.f17834e.zzb(), (zzgll) this.f17835f.zzb(), (zzfxq) this.f17836g.zzb());
    }
}
