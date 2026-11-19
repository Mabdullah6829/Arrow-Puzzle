package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.common.internal.service.zat;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgq {
    private static zzgq zza;
    private final zzic zzb;
    private final TelemetryLoggingClient zzc;
    private final AtomicLong zzd = new AtomicLong(-1);

    private zzgq(Context context, zzic zzicVar) {
        TelemetryLoggingOptions telemetryLoggingOptions = TelemetryLoggingOptions.f4469t;
        TelemetryLoggingOptions.Builder builder = new TelemetryLoggingOptions.Builder();
        builder.f4471a = "measurement:api";
        this.zzc = new zat(context, zat.f4476k, new TelemetryLoggingOptions(builder.f4471a), GoogleApi.Settings.f4198c);
        this.zzb = zzicVar;
    }

    public static zzgq zza(zzic zzicVar) {
        if (zza == null) {
            zza = new zzgq(zzicVar.zzaZ(), zzicVar);
        }
        return zza;
    }

    public final synchronized void zzb(int i2, int i3, long j2, long j3, int i4) {
        final long jMo3639a = this.zzb.zzba().mo3639a();
        AtomicLong atomicLong = this.zzd;
        if (atomicLong.get() != -1 && jMo3639a - atomicLong.get() <= 1800000) {
            return;
        }
        this.zzc.mo3550b(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i3, 0, j2, j3, null, null, 0, i4)))).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.measurement.internal.zzgp
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final /* synthetic */ void onFailure(Exception exc) {
                this.zza.zzc(jMo3639a, exc);
            }
        });
    }

    public final /* synthetic */ void zzc(long j2, Exception exc) {
        this.zzd.set(j2);
    }
}
