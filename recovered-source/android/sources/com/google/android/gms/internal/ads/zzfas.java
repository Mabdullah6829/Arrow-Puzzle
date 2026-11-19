package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfas implements zzfcs {

    /* JADX INFO: renamed from: a */
    public final zzhcp f15282a;

    /* JADX INFO: renamed from: b */
    public final zzflg f15283b;

    /* JADX INFO: renamed from: c */
    public final PackageInfo f15284c;

    /* JADX INFO: renamed from: d */
    public final com.google.android.gms.ads.internal.util.zzg f15285d;

    public zzfas(zzhcp zzhcpVar, zzflg zzflgVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzj zzjVar) {
        this.f15282a = zzhcpVar;
        this.f15283b = zzflgVar;
        this.f15284c = packageInfo;
        this.f15285d = zzjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final ListenableFuture zza() {
        return this.f15282a.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfar
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                zzfas zzfasVar = this.f15281a;
                return new zzfat(zzfasVar.f15283b, zzfasVar.f15284c, zzfasVar.f15285d);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 26;
    }
}
