package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeup implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final Clock f14921a;

    /* JADX INFO: renamed from: b */
    public final zzflg f14922b;

    /* JADX INFO: renamed from: c */
    public final long f14923c;

    public zzeup(Clock clock, zzflg zzflgVar, long j2) {
        this.f14921a = clock;
        this.f14922b = zzflgVar;
        this.f14923c = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return zzhcf.m7367a(new zzeuq(this.f14922b, this.f14921a.currentTimeMillis(), this.f14923c));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 4;
    }
}
