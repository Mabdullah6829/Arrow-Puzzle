package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new zzag();

    @SafeParcelable.Field
    public final long zza;

    @SafeParcelable.Field
    public final int zzb;

    @SafeParcelable.Field
    public final long zzc;

    @SafeParcelable.Constructor
    public zzaf(@SafeParcelable.Param long j2, @SafeParcelable.Param int i2, @SafeParcelable.Param long j3) {
        this.zza = j2;
        this.zzb = i2;
        this.zzc = j3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        long j2 = this.zza;
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 8);
        parcel.writeLong(j2);
        int i3 = this.zzb;
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(i3);
        long j3 = this.zzc;
        SafeParcelWriter.m3588n(parcel, 3, 8);
        parcel.writeLong(j3);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
