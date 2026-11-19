package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzbtt implements zzcgh {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbtv f9370a;

    public zzbtt(zzbtv zzbtvVar) {
        Objects.requireNonNull(zzbtvVar);
        this.f9370a = zzbtvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo5135b(Object obj) {
        com.google.android.gms.ads.internal.util.zze.m3150k("Releasing engine reference.");
        this.f9370a.f9373d.m5138e();
    }
}
