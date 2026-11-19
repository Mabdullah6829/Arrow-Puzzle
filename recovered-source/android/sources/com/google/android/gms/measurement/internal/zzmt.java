package com.google.android.gms.measurement.internal;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzmt implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzbh zzc;
    final /* synthetic */ zznl zzd;

    public zzmt(zznl zznlVar, boolean z, zzr zzrVar, boolean z2, zzbh zzbhVar, String str) {
        this.zza = zzrVar;
        this.zzb = z2;
        this.zzc = zzbhVar;
        Objects.requireNonNull(zznlVar);
        this.zzd = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVar = this.zzd;
        zzgb zzgbVarZzZ = zznlVar.zzZ();
        if (zzgbVarZzZ == null) {
            AbstractC1456a.m2452s(zznlVar.zzu, "Discarding data. Failed to send event to service");
            return;
        }
        zzr zzrVar = this.zza;
        Preconditions.m3544h(zzrVar);
        zznlVar.zzm(zzgbVarZzZ, this.zzb ? null : this.zzc, zzrVar);
        zznlVar.zzV();
    }
}
