package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgft implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzina f17151a;

    /* JADX INFO: renamed from: b */
    public final zzini f17152b;

    /* JADX INFO: renamed from: c */
    public final zzina f17153c;

    /* JADX INFO: renamed from: d */
    public final zzini f17154d;

    /* JADX INFO: renamed from: e */
    public final zzina f17155e;

    public zzgft(zzimy zzimyVar, zzimy zzimyVar2, zzina zzinaVar, zzina zzinaVar2, zzina zzinaVar3) {
        this.f17151a = zzinaVar;
        this.f17152b = zzimyVar;
        this.f17153c = zzinaVar2;
        this.f17154d = zzimyVar2;
        this.f17155e = zzinaVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        Context context = (Context) this.f17151a.f20011a;
        zzgew zzgewVar = (zzgew) this.f17152b.zzb();
        ExecutorService executorService = (ExecutorService) this.f17153c.f20011a;
        zzgep zzgepVar = (zzgep) this.f17154d.zzb();
        zzgdq zzgdqVar = (zzgdq) this.f17155e.f20011a;
        return new zzgfx(context, zzgewVar, executorService, zzgepVar, new Random(), zzgdqVar.m6923W().m6949D(), zzgdqVar.m6923W().m6951F(), zzgdqVar.m6923W().m6952G(), zzgdqVar.m6923W().m6950E(), zzgdqVar.m6921U(), zzgdqVar.m6915O(), zzgdqVar.m6913M() - 1);
    }
}
