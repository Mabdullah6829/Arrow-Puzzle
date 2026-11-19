package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfao implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzfkm f15278a;

    public zzfao(zzfkm zzfkmVar) {
        this.f15278a = zzfkmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return zzhcf.m7367a(new zzfap(this.f15278a));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 25;
    }
}
