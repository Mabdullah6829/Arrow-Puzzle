package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfhv implements zzfie {

    /* JADX INFO: renamed from: a */
    public final zzfhu f15726a;

    /* JADX INFO: renamed from: b */
    public zzdch f15727b;

    public zzfhv(zzfhu zzfhuVar) {
        this.f15726a = zzfhuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfie
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ ListenableFuture mo6447a(zzfif zzfifVar, zzfid zzfidVar) {
        return m6454b(zzfifVar, zzfidVar, null);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized ListenableFuture m6454b(zzfif zzfifVar, zzfid zzfidVar, zzdch zzdchVar) {
        zzcbk zzcbkVar;
        this.f15727b = zzdchVar;
        if (zzdchVar == null || (zzcbkVar = zzfifVar.f15741a) == null) {
            return this.f15726a.m6453b(zzfifVar, zzfidVar, zzdchVar);
        }
        zzcze zzczeVarZza = zzdchVar.zza();
        return zzczeVarZza.m5877c(zzczeVarZza.m5875a(zzhcf.m7367a(zzcbkVar)));
    }

    @Override // com.google.android.gms.internal.ads.zzfie
    /* JADX INFO: renamed from: d */
    public final Object mo6449d() {
        zzdch zzdchVar;
        synchronized (this) {
            zzdchVar = this.f15727b;
        }
        return zzdchVar;
    }
}
