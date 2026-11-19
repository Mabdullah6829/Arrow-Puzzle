package com.google.android.gms.measurement.internal;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzlu {

    @Nullable
    public final String zza;

    @Nullable
    public final String zzb;
    public final long zzc;
    boolean zzd;
    public final boolean zze;
    public final long zzf;
    public final long zzg;

    public zzlu(@Nullable String str, @Nullable String str2, long j2, boolean z, long j3, long j4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j2;
        this.zzd = false;
        this.zze = z;
        this.zzf = j3;
        this.zzg = j4;
    }

    public zzlu(@Nullable String str, @Nullable String str2, long j2) {
        this(str, str2, j2, false, 0L, 0L);
    }
}
