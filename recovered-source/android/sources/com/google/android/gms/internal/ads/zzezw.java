package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzezw implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzhcp f15239a;

    /* JADX INFO: renamed from: b */
    public final zzflg f15240b;

    public zzezw(zzhcp zzhcpVar, zzflg zzflgVar) {
        this.f15239a = zzhcpVar;
        this.f15240b = zzflgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.f15239a.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzezv
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new zzezx("requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzv.m3346b(this.f15238a.f15240b.f16040d)));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 21;
    }
}
