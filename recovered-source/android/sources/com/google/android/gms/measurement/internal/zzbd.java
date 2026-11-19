package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
final class zzbd {
    final String zza;
    final String zzb;
    final long zzc;
    final long zzd;
    final long zze;
    final long zzf;
    final long zzg;
    final Long zzh;
    final Long zzi;
    final Long zzj;
    final Boolean zzk;

    public zzbd(String str, String str2, long j2, long j3, long j4, long j5, long j6, Long l2, Long l3, Long l4, Boolean bool) {
        Preconditions.m3541e(str);
        Preconditions.m3541e(str2);
        Preconditions.m3537a(j2 >= 0);
        Preconditions.m3537a(j3 >= 0);
        Preconditions.m3537a(j4 >= 0);
        Preconditions.m3537a(j6 >= 0);
        this.zza = str;
        this.zzb = str2;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4;
        this.zzf = j5;
        this.zzg = j6;
        this.zzh = l2;
        this.zzi = l3;
        this.zzj = l4;
        this.zzk = bool;
    }

    public final zzbd zza(long j2) {
        return new zzbd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, j2, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk);
    }

    public final zzbd zzb(long j2, long j3) {
        return new zzbd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, j2, Long.valueOf(j3), this.zzi, this.zzj, this.zzk);
    }

    public final zzbd zzc(Long l2, Long l3, Boolean bool) {
        return new zzbd(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, l2, l3, bool);
    }
}
