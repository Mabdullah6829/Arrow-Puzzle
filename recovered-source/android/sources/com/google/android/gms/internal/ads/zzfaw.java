package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfaw implements zzfcs {

    /* JADX INFO: renamed from: b */
    public static String f15292b;

    /* JADX INFO: renamed from: a */
    public final zzhcp f15293a;

    public zzfaw(Context context, zzhcp zzhcpVar) {
        this.f15293a = zzhcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.f15293a.submit(new zzfav());
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 27;
    }
}
