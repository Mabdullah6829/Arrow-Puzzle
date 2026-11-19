package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzexi implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzhcp f15090a;

    public zzexi(zzhcp zzhcpVar) {
        this.f15090a = zzhcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.f15090a.submit(new zzexh());
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 55;
    }
}
