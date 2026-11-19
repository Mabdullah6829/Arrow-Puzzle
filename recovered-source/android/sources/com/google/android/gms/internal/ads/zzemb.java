package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzemb implements zzema {

    /* JADX INFO: renamed from: a */
    public final zzema f14189a;

    /* JADX INFO: renamed from: b */
    public final zzgti f14190b;

    public zzemb(zzema zzemaVar, zzgti zzgtiVar) {
        this.f14189a = zzemaVar;
        this.f14190b = zzgtiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzema
    /* JADX INFO: renamed from: a */
    public final ListenableFuture mo6284a(zzfky zzfkyVar, zzfkn zzfknVar) {
        return zzhcf.m7375i(this.f14189a.mo6284a(zzfkyVar, zzfknVar), this.f14190b, zzcfy.f9946a);
    }

    @Override // com.google.android.gms.internal.ads.zzema
    /* JADX INFO: renamed from: b */
    public final boolean mo6285b(zzfky zzfkyVar, zzfkn zzfknVar) {
        return this.f14189a.mo6285b(zzfkyVar, zzfknVar);
    }
}
