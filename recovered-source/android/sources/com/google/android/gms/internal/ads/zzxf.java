package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public final class zzxf extends zzbf {

    /* JADX INFO: renamed from: b */
    public final zzak f21265b;

    public zzxf(zzak zzakVar) {
        this.f21265b = zzakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    /* JADX INFO: renamed from: a */
    public final int mo4735a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    /* JADX INFO: renamed from: b */
    public final zzbe mo4736b(int i2, zzbe zzbeVar, long j2) {
        Object obj = zzbe.f7673m;
        zzbeVar.m4776a(this.f21265b, false, true, null, -9223372036854775807L);
        zzbeVar.f7683i = true;
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    /* JADX INFO: renamed from: c */
    public final int mo4737c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    /* JADX INFO: renamed from: d */
    public final zzbd mo4738d(int i2, zzbd zzbdVar, boolean z) {
        Integer num = z ? 0 : null;
        Object obj = z ? zzxe.f21262e : null;
        zzc zzcVar = zzc.f9573b;
        zzbdVar.m4753a(num, obj, 0, -9223372036854775807L, true);
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    /* JADX INFO: renamed from: e */
    public final int mo4739e(Object obj) {
        return obj == zzxe.f21262e ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbf
    /* JADX INFO: renamed from: f */
    public final Object mo4740f(int i2) {
        return zzxe.f21262e;
    }
}
