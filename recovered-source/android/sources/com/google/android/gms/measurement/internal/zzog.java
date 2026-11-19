package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: loaded from: classes2.dex */
final class zzog {
    private final Clock zza;
    private long zzb;

    public zzog(Clock clock) {
        Preconditions.m3544h(clock);
        this.zza = clock;
    }

    public final void zza() {
        this.zzb = this.zza.mo3639a();
    }

    public final void zzb() {
        this.zzb = 0L;
    }

    public final boolean zzc(long j2) {
        return this.zzb == 0 || this.zza.mo3639a() - this.zzb >= 3600000;
    }
}
