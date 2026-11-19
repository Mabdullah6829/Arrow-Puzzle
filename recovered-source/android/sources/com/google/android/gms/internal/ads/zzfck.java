package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfck implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final boolean f15416a;

    public zzfck(zzfii zzfiiVar) {
        this.f15416a = zzfiiVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return zzhcf.m7367a(new zzfcj(this.f15416a));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 36;
    }
}
