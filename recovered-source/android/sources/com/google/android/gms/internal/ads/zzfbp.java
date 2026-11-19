package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfbp implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final String f15341a;

    public zzfbp(String str) {
        this.f15341a = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return zzhcf.m7367a(new zzfbq(this.f15341a));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 31;
    }
}
