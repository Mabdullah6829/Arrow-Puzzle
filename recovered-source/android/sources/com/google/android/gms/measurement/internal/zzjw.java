package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.util.SparseArray;
import java.util.Objects;
import p011H.InterfaceC0251O;

/* JADX INFO: loaded from: classes2.dex */
final class zzjw implements InterfaceC0251O {
    final /* synthetic */ zzoh zza;
    final /* synthetic */ zzlj zzb;

    public zzjw(zzlj zzljVar, zzoh zzohVar) {
        this.zza = zzohVar;
        Objects.requireNonNull(zzljVar);
        this.zzb = zzljVar;
    }

    @Override // p011H.InterfaceC0251O
    public final void onFailure(Throwable th) {
        zzlj zzljVar = this.zzb;
        zzljVar.zzg();
        zzljVar.zzal(false);
        zzljVar.zzx().add(this.zza);
        if (zzljVar.zzam() > ((Integer) zzfy.zzav.zzb(null)).intValue()) {
            zzljVar.zzan(1);
            zzljVar.zzu.zzaW().zze().zzc("registerTriggerAsync failed. May try later. App ID, throwable", zzgu.zzl(zzljVar.zzu.zzv().zzj()), zzgu.zzl(th.toString()));
        } else {
            zzljVar.zzu.zzaW().zze().zzd("registerTriggerAsync failed. App ID, delay in seconds, throwable", zzgu.zzl(zzljVar.zzu.zzv().zzj()), zzgu.zzl(String.valueOf(zzljVar.zzam())), zzgu.zzl(th.toString()));
            zzljVar.zzah(zzljVar.zzam());
            int iZzam = zzljVar.zzam();
            zzljVar.zzan(iZzam + iZzam);
        }
    }

    @Override // p011H.InterfaceC0251O
    public final void onSuccess(Object obj) {
        zzlj zzljVar = this.zzb;
        zzljVar.zzg();
        zzic zzicVar = zzljVar.zzu;
        SparseArray sparseArrayZzf = zzicVar.zzd().zzf();
        zzoh zzohVar = this.zza;
        sparseArrayZzf.put(zzohVar.zzc, Long.valueOf(zzohVar.zzb));
        zzhh zzhhVarZzd = zzicVar.zzd();
        int[] iArr = new int[sparseArrayZzf.size()];
        long[] jArr = new long[sparseArrayZzf.size()];
        for (int i2 = 0; i2 < sparseArrayZzf.size(); i2++) {
            iArr[i2] = sparseArrayZzf.keyAt(i2);
            jArr[i2] = ((Long) sparseArrayZzf.valueAt(i2)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        zzhhVarZzd.zzi.zzb(bundle);
        zzljVar.zzal(false);
        zzljVar.zzan(1);
        zzicVar.zzaW().zzj().zzb("Successfully registered trigger URI", zzohVar.zza);
        zzljVar.zzy();
    }
}
