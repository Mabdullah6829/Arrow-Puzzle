package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbuy {

    /* JADX INFO: renamed from: a */
    public final zzbub f9422a;

    /* JADX INFO: renamed from: b */
    public ListenableFuture f9423b;

    public zzbuy(zzbub zzbubVar) {
        this.f9422a = zzbubVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m5150a() {
        if (this.f9423b == null) {
            final zzcgd zzcgdVar = new zzcgd();
            this.f9423b = zzcgdVar;
            this.f9422a.m5142b().m5399a(new zzcgh() { // from class: com.google.android.gms.internal.ads.zzbux
                @Override // com.google.android.gms.internal.ads.zzcgh
                /* JADX INFO: renamed from: b */
                public final /* synthetic */ void mo5135b(Object obj) {
                    zzcgdVar.m5397a((zzbuc) obj);
                }
            }, new zzcgf() { // from class: com.google.android.gms.internal.ads.zzbuu
                @Override // com.google.android.gms.internal.ads.zzcgf
                public final void zza() {
                    zzcgdVar.m5398b(new zzbue("Cannot get Javascript Engine"));
                }
            });
        }
    }
}
