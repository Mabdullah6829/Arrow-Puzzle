package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfhb implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzina f15684a;

    /* JADX INFO: renamed from: b */
    public final zzini f15685b;

    /* JADX INFO: renamed from: c */
    public final zzina f15686c;

    /* JADX INFO: renamed from: d */
    public final zzini f15687d;

    /* JADX INFO: renamed from: e */
    public final zzini f15688e;

    /* JADX INFO: renamed from: f */
    public final zzini f15689f;

    /* JADX INFO: renamed from: g */
    public final zzini f15690g;

    public zzfhb(zzimy zzimyVar, zzimy zzimyVar2, zzimy zzimyVar3, zzimy zzimyVar4, zzina zzinaVar, zzina zzinaVar2, zzina zzinaVar3) {
        this.f15684a = zzinaVar;
        this.f15685b = zzimyVar;
        this.f15686c = zzinaVar2;
        this.f15687d = zzinaVar3;
        this.f15688e = zzimyVar2;
        this.f15689f = zzimyVar3;
        this.f15690g = zzimyVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzfha((Context) this.f15684a.f20011a, (Executor) this.f15685b.zzb(), (com.google.android.gms.ads.internal.client.zzr) this.f15686c.f20011a, (zzcnq) this.f15687d.zzb(), (zzetk) this.f15688e.zzb(), (zzeto) this.f15689f.zzb(), new zzflf(), (zzdif) this.f15690g.zzb());
    }
}
