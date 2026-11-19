package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgnc implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f17850a;

    /* JADX INFO: renamed from: b */
    public final zzini f17851b;

    /* JADX INFO: renamed from: c */
    public final zzini f17852c;

    /* JADX INFO: renamed from: d */
    public final zzini f17853d;

    /* JADX INFO: renamed from: e */
    public final zzini f17854e;

    /* JADX INFO: renamed from: f */
    public final zzini f17855f;

    public zzgnc(zzina zzinaVar, zzina zzinaVar2, zzina zzinaVar3, zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3) {
        this.f17850a = zzinaVar;
        this.f17851b = zzinaVar2;
        this.f17852c = zzinaVar3;
        this.f17853d = zzimyVar;
        this.f17854e = zzimyVar2;
        this.f17855f = zzimyVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgnb((Context) this.f17850a.zzb(), (ExecutorService) this.f17851b.zzb(), (zzgdq) this.f17852c.zzb(), (zzgep) this.f17853d.zzb(), (zzgqo) this.f17854e.zzb(), (zzgnd) this.f17855f.zzb());
    }
}
