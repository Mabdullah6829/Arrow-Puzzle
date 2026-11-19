package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfef implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzhcp f15540a;

    public zzfef(zzhcp zzhcpVar) {
        this.f15540a = zzhcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.f15540a.submit(new zzfee());
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 45;
    }
}
