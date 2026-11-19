package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjs {
    final Context zza;

    @Nullable
    Boolean zzb;
    long zzc;

    @Nullable
    com.google.android.gms.internal.measurement.zzdb zzd;
    boolean zze;

    @Nullable
    final Long zzf;

    @Nullable
    final Long zzg;

    @Nullable
    String zzh;

    public zzjs(Context context, @Nullable com.google.android.gms.internal.measurement.zzdb zzdbVar, @Nullable Long l2, @Nullable Long l3) {
        this.zze = true;
        Preconditions.m3544h(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.m3544h(applicationContext);
        this.zza = applicationContext;
        this.zzf = l2;
        this.zzg = l3;
        if (zzdbVar != null) {
            this.zzd = zzdbVar;
            this.zze = zzdbVar.f22355u;
            this.zzc = zzdbVar.f22354t;
            this.zzh = zzdbVar.f22357w;
            Bundle bundle = zzdbVar.f22356v;
            if (bundle != null) {
                this.zzb = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
