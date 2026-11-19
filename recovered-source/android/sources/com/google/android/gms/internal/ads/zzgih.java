package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgih implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzini f17513a;

    /* JADX INFO: renamed from: b */
    public final zzini f17514b;

    /* JADX INFO: renamed from: c */
    public final zzini f17515c;

    /* JADX INFO: renamed from: d */
    public final zzini f17516d;

    /* JADX INFO: renamed from: e */
    public final zzini f17517e;

    /* JADX INFO: renamed from: f */
    public final zzini f17518f;

    /* JADX INFO: renamed from: g */
    public final zzini f17519g;

    public zzgih(zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3, zzimy zzimyVar4, zzina zzinaVar, zzina zzinaVar2, zzina zzinaVar3) {
        this.f17513a = zzinaVar;
        this.f17514b = zzinaVar2;
        this.f17515c = zzimyVar;
        this.f17516d = zzimyVar2;
        this.f17517e = zzimyVar3;
        this.f17518f = zzimyVar4;
        this.f17519g = zzinaVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context context = (Context) this.f17513a.zzb();
        ExecutorService executorService = (ExecutorService) this.f17514b.zzb();
        zzghl zzghlVar = (zzghl) this.f17515c.zzb();
        zzgid zzgidVar = (zzgid) this.f17516d.zzb();
        File file = (File) this.f17517e.zzb();
        zzgqo zzgqoVar = (zzgqo) this.f17518f.zzb();
        zzgdq zzgdqVar = (zzgdq) this.f17519g.zzb();
        return new zzgig(context, executorService, zzghlVar, zzgidVar, file, zzgqoVar, zzgdqVar.m6933g0(), zzgik.m7016a());
    }
}
