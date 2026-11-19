package com.google.android.gms.measurement.internal;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public final class zzph {
    final Context zza;

    @VisibleForTesting
    public zzph(Context context) {
        Preconditions.m3544h(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.m3544h(applicationContext);
        this.zza = applicationContext;
    }
}
