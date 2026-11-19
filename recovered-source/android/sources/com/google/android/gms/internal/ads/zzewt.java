package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzewt implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzflg f15066a;

    public zzewt(zzflg zzflgVar) {
        this.f15066a = zzflgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return zzhcf.m7367a(new zzewu(this.f15066a.f16053q));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 58;
    }
}
