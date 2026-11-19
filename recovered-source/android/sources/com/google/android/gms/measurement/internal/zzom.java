package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
public final class zzom extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzom> CREATOR = new zzon();

    @SafeParcelable.Field
    public final long zza;

    @SafeParcelable.Field
    public byte[] zzb;

    @SafeParcelable.Field
    public final String zzc;

    @SafeParcelable.Field
    public final Bundle zzd;

    @SafeParcelable.Field
    public final int zze;

    @SafeParcelable.Field
    public final long zzf;

    @SafeParcelable.Field
    public String zzg;

    @SafeParcelable.Constructor
    public zzom(@SafeParcelable.Param long j2, @SafeParcelable.Param byte[] bArr, @SafeParcelable.Param String str, @SafeParcelable.Param Bundle bundle, @SafeParcelable.Param int i2, @SafeParcelable.Param long j3, @SafeParcelable.Param String str2) {
        this.zza = j2;
        this.zzb = bArr;
        this.zzc = str;
        this.zzd = bundle;
        this.zze = i2;
        this.zzf = j3;
        this.zzg = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        long j2 = this.zza;
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 8);
        parcel.writeLong(j2);
        SafeParcelWriter.m3576b(parcel, 2, this.zzb);
        SafeParcelWriter.m3583i(parcel, 3, this.zzc);
        SafeParcelWriter.m3575a(4, this.zzd, parcel);
        int i3 = this.zze;
        SafeParcelWriter.m3588n(parcel, 5, 4);
        parcel.writeInt(i3);
        long j3 = this.zzf;
        SafeParcelWriter.m3588n(parcel, 6, 8);
        parcel.writeLong(j3);
        SafeParcelWriter.m3583i(parcel, 7, this.zzg);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
