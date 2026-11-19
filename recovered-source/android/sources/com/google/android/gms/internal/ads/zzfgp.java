package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfgp implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzina f15632a;

    /* JADX INFO: renamed from: b */
    public final zzini f15633b;

    /* JADX INFO: renamed from: c */
    public final zzini f15634c;

    /* JADX INFO: renamed from: d */
    public final zzfig f15635d;

    /* JADX INFO: renamed from: e */
    public final zzini f15636e;

    /* JADX INFO: renamed from: f */
    public final zzini f15637f;

    public zzfgp(zzina zzinaVar, zzimy zzimyVar, zzina zzinaVar2, zzfig zzfigVar, zzimy zzimyVar2, zzcop zzcopVar) {
        this.f15632a = zzinaVar;
        this.f15633b = zzimyVar;
        this.f15634c = zzinaVar2;
        this.f15635d = zzfigVar;
        this.f15636e = zzimyVar2;
        this.f15637f = zzcopVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzfgo((Context) this.f15632a.f20011a, (Executor) this.f15633b.zzb(), (zzcnq) this.f15634c.zzb(), this.f15635d.zzb(), (zzfgm) this.f15636e.zzb(), new zzflf(), ((zzcop) this.f15637f).m5711a());
    }
}
