package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfhu implements zzfie {

    /* JADX INFO: renamed from: a */
    public zzdch f15725a;

    @Override // com.google.android.gms.internal.ads.zzfie
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ ListenableFuture mo6447a(zzfif zzfifVar, zzfid zzfidVar) {
        return m6453b(zzfifVar, zzfidVar, null);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized ListenableFuture m6453b(zzfif zzfifVar, zzfid zzfidVar, zzdch zzdchVar) {
        zzcze zzczeVarZza;
        try {
            if (zzdchVar != null) {
                this.f15725a = zzdchVar;
            } else {
                this.f15725a = (zzdch) zzfidVar.mo6431a(zzfifVar.f15742b).zzh();
            }
            zzczeVarZza = this.f15725a.zza();
        } catch (Throwable th) {
            throw th;
        }
        return zzczeVarZza.m5877c(zzczeVarZza.m5876b());
    }

    @Override // com.google.android.gms.internal.ads.zzfie
    /* JADX INFO: renamed from: d */
    public final Object mo6449d() {
        zzdch zzdchVar;
        synchronized (this) {
            zzdchVar = this.f15725a;
        }
        return zzdchVar;
    }
}
