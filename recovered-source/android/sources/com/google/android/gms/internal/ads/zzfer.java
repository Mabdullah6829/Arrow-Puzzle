package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfer implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzhcp f15553a;

    /* JADX INFO: renamed from: b */
    public final List f15554b;

    public zzfer(zzhcp zzhcpVar, List list) {
        this.f15553a = zzhcpVar;
        this.f15554b = list;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.f15553a.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfeq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzfes(this.f15552a.f15554b);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 48;
    }
}
