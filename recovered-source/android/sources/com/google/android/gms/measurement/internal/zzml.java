package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzml implements Runnable {
    final /* synthetic */ zzr zza;
    final /* synthetic */ zznl zzb;

    public zzml(zznl zznlVar, zzr zzrVar) {
        this.zza = zzrVar;
        Objects.requireNonNull(zznlVar);
        this.zzb = zznlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zznl zznlVar = this.zzb;
        zzgb zzgbVarZzZ = zznlVar.zzZ();
        if (zzgbVarZzZ == null) {
            AbstractC1456a.m2459z(zznlVar.zzu, "Failed to send app backgrounded");
            return;
        }
        try {
            zzr zzrVar = this.zza;
            Preconditions.m3544h(zzrVar);
            zzgbVarZzZ.zzA(zzrVar);
            zznlVar.zzV();
        } catch (RemoteException e) {
            this.zzb.zzu.zzaW().zzb().zzb("Failed to send app backgrounded to the service", e);
        }
    }
}
