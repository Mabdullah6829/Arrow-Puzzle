package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfbi implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final Bundle f15324a;

    public zzfbi(Bundle bundle) {
        this.f15324a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return zzhcf.m7367a(new zzfbj(this.f15324a));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 30;
    }
}
