package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzq implements zzjq {
    public final com.google.android.gms.internal.measurement.zzcy zza;
    final /* synthetic */ AppMeasurementDynamiteService zzb;

    public zzq(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcy zzcyVar) {
        Objects.requireNonNull(appMeasurementDynamiteService);
        this.zzb = appMeasurementDynamiteService;
        this.zza = zzcyVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjq
    public final void onEvent(String str, String str2, Bundle bundle, long j2) {
        try {
            this.zza.mo9835y0(str, str2, bundle, j2);
        } catch (RemoteException e) {
            zzic zzicVar = this.zzb.zza;
            if (zzicVar != null) {
                zzicVar.zzaW().zze().zzb("Event listener threw exception", e);
            }
        }
    }
}
