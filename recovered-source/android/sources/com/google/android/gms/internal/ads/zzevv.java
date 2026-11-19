package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzevv implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzhcp f14994a;

    /* JADX INFO: renamed from: b */
    public final zzflg f14995b;

    /* JADX INFO: renamed from: c */
    public final zzcfp f14996c;

    public zzevv(zzhcp zzhcpVar, zzflg zzflgVar, zzcfp zzcfpVar) {
        this.f14994a = zzhcpVar;
        this.f14995b = zzflgVar;
        this.f14996c = zzcfpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.f14994a.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzevu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzevv zzevvVar = this.f14993a;
                return new zzevw(zzevvVar.f14995b.f16047k, zzevvVar.f14996c.f9932y);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 9;
    }
}
