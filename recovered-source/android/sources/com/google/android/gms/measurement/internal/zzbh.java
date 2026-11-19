package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzbh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbh> CREATOR = new zzbi();

    @SafeParcelable.Field
    public final String zza;

    @SafeParcelable.Field
    public final zzbf zzb;

    @SafeParcelable.Field
    public final String zzc;

    @SafeParcelable.Field
    public final long zzd;

    @SafeParcelable.Field
    public final long zze;

    public zzbh(zzbh zzbhVar, long j2, long j3) {
        Preconditions.m3544h(zzbhVar);
        this.zza = zzbhVar.zza;
        this.zzb = zzbhVar.zzb;
        this.zzc = zzbhVar.zzc;
        this.zzd = j2;
        this.zze = j3;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        String str = this.zzc;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        AbstractC0271e0.m413u(sb, "origin=", str, ",name=", str2);
        return AbstractC0271e0.m403k(sb, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        zzbi.zza(this, parcel, i2);
    }

    @SafeParcelable.Constructor
    public zzbh(@SafeParcelable.Param String str, @SafeParcelable.Param zzbf zzbfVar, @SafeParcelable.Param String str2, @SafeParcelable.Param long j2, @SafeParcelable.Param long j3) {
        this.zza = str;
        this.zzb = zzbfVar;
        this.zzc = str2;
        this.zzd = j2;
        this.zze = j3;
    }
}
