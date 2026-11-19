package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfdx implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final Executor f15525a;

    /* JADX INFO: renamed from: b */
    public final String f15526b;

    public zzfdx(Executor executor, String str) {
        this.f15525a = executor;
        this.f15526b = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        ListenableFuture listenableFutureM7367a = zzhcf.m7367a(this.f15526b);
        zzfdw zzfdwVar = new zzgti() { // from class: com.google.android.gms.internal.ads.zzfdw
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return new zzfdy((String) obj);
            }
        };
        Executor executor = this.f15525a;
        return zzhcf.m7372f(zzhcf.m7375i(listenableFutureM7367a, zzfdwVar, executor), Throwable.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzfdv
            @Override // com.google.android.gms.internal.ads.zzhbn
            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListenableFuture mo3248b(Object obj) {
                return zzhcf.m7367a(new zzfdy(this.f15523a.f15526b));
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 41;
    }
}
