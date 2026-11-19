package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgv {

    @NonNull
    public final String zza;

    @NonNull
    public final String zzb;
    public final long zzc;
    public final long zzd;

    @NonNull
    public final Bundle zze;

    public zzgv(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle, long j2, long j3) {
        this.zza = str;
        this.zzb = str2;
        this.zze = bundle;
        this.zzc = j2;
        this.zzd = j3;
    }

    public static zzgv zza(zzbh zzbhVar) {
        return new zzgv(zzbhVar.zza, zzbhVar.zzc, zzbhVar.zzb.zzf(), zzbhVar.zzd, zzbhVar.zze);
    }

    public final String toString() {
        String str = this.zzb;
        String string = this.zze.toString();
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        AbstractC0271e0.m413u(sb, "origin=", str, ",name=", str2);
        return AbstractC0271e0.m403k(sb, ",params=", string);
    }

    public final zzbh zzb() {
        return new zzbh(this.zza, new zzbf(new Bundle(this.zze)), this.zzb, this.zzc, this.zzd);
    }
}
