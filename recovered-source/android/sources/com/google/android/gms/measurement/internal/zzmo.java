package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzmo implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzbf zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ zznl zze;

    public zzmo(zznl zznlVar, boolean z, zzr zzrVar, boolean z2, zzbf zzbfVar, Bundle bundle) {
        this.zza = zzrVar;
        this.zzb = z2;
        this.zzc = zzbfVar;
        this.zzd = bundle;
        Objects.requireNonNull(zznlVar);
        this.zze = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVar = this.zze;
        zzgb zzgbVarZzZ = zznlVar.zzZ();
        if (zzgbVarZzZ == null) {
            AbstractC1456a.m2452s(zznlVar.zzu, "Failed to send default event parameters to service");
            return;
        }
        if (zznlVar.zzu.zzc().zzp(null, zzfy.zzaW)) {
            zzr zzrVar = this.zza;
            Preconditions.m3544h(zzrVar);
            zznlVar.zzm(zzgbVarZzZ, this.zzb ? null : this.zzc, zzrVar);
            return;
        }
        try {
            zzr zzrVar2 = this.zza;
            Preconditions.m3544h(zzrVar2);
            zzgbVarZzZ.zzu(this.zzd, zzrVar2);
            zznlVar.zzV();
        } catch (RemoteException e) {
            this.zze.zzu.zzaW().zzb().zzb("Failed to send default event parameters to service", e);
        }
    }
}
