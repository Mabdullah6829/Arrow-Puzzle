package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfkb implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzina f15838a;

    /* JADX INFO: renamed from: b */
    public final zzini f15839b;

    /* JADX INFO: renamed from: c */
    public final zzini f15840c;

    /* JADX INFO: renamed from: d */
    public final zzfih f15841d;

    /* JADX INFO: renamed from: e */
    public final zzini f15842e;

    /* JADX INFO: renamed from: f */
    public final zzini f15843f;

    public zzfkb(zzina zzinaVar, zzimy zzimyVar, zzina zzinaVar2, zzfih zzfihVar, zzimy zzimyVar2, zzimy zzimyVar3) {
        this.f15838a = zzinaVar;
        this.f15839b = zzimyVar;
        this.f15840c = zzinaVar2;
        this.f15841d = zzfihVar;
        this.f15842e = zzimyVar2;
        this.f15843f = zzimyVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzfka((Context) this.f15838a.f20011a, (Executor) this.f15839b.zzb(), (zzcnq) this.f15840c.zzb(), this.f15841d.zzb(), (zzfjr) this.f15842e.zzb(), new zzflf(), (zzfkz) this.f15843f.zzb());
    }
}
