package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcea implements zzimz {

    /* JADX INFO: renamed from: a */
    public final zzina f9811a;

    /* JADX INFO: renamed from: b */
    public final zzini f9812b;

    public zzcea(zzimy zzimyVar, zzina zzinaVar) {
        this.f9811a = zzinaVar;
        this.f9812b = zzimyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino
    public final Object zzb() {
        return new zzcdz((Clock) this.f9811a.f20011a, (zzcdx) this.f9812b.zzb());
    }
}
