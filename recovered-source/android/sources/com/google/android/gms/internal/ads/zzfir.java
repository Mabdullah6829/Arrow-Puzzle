package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfir implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzina f15771a;

    /* JADX INFO: renamed from: b */
    public final zzini f15772b;

    /* JADX INFO: renamed from: c */
    public final zzini f15773c;

    /* JADX INFO: renamed from: d */
    public final zzini f15774d;

    /* JADX INFO: renamed from: e */
    public final zzini f15775e;

    public zzfir(zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3, zzina zzinaVar, zzina zzinaVar2) {
        this.f15771a = zzinaVar;
        this.f15772b = zzimyVar;
        this.f15773c = zzinaVar2;
        this.f15774d = zzimyVar2;
        this.f15775e = zzimyVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzfiq((Context) this.f15771a.f20011a, (Executor) this.f15772b.zzb(), (zzcnq) this.f15773c.zzb(), (zzetk) this.f15774d.zzb(), (zzfjr) this.f15775e.zzb(), new zzflf());
    }
}
