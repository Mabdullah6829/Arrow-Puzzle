package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzbtw implements zzcgh {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbtv f9375a;

    public zzbtw(zzbua zzbuaVar, zzbtv zzbtvVar) {
        this.f9375a = zzbtvVar;
        Objects.requireNonNull(zzbuaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    /* JADX INFO: renamed from: b */
    public final void mo5135b(Object obj) {
        com.google.android.gms.ads.internal.util.zze.m3150k("Getting a new session for JS Engine.");
        this.f9375a.f9963a.m5397a(((zzbsw) obj).zzl());
    }
}
