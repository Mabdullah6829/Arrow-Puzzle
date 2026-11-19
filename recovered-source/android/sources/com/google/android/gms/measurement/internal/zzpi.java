package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzpi {
    private long zza;
    private com.google.android.gms.internal.measurement.zzib zzb;
    private String zzc;
    private Map zzd;
    private zzls zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private int zzi;

    public final zzpj zza() {
        return new zzpj(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, null);
    }

    public final zzpi zzb(long j2) {
        this.zza = j2;
        return this;
    }

    public final zzpi zzc(com.google.android.gms.internal.measurement.zzib zzibVar) {
        this.zzb = zzibVar;
        return this;
    }

    public final zzpi zzd(String str) {
        this.zzc = str;
        return this;
    }

    public final zzpi zze(Map map) {
        this.zzd = map;
        return this;
    }

    public final zzpi zzf(zzls zzlsVar) {
        this.zze = zzlsVar;
        return this;
    }

    public final zzpi zzg(long j2) {
        this.zzf = j2;
        return this;
    }

    public final zzpi zzh(long j2) {
        this.zzg = j2;
        return this;
    }

    public final zzpi zzi(long j2) {
        this.zzh = j2;
        return this;
    }

    public final zzpi zzj(int i2) {
        this.zzi = i2;
        return this;
    }
}
