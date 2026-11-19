package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
public final class zzoh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoh> CREATOR = new zzoi();

    @SafeParcelable.Field
    public final String zza;

    @SafeParcelable.Field
    public final long zzb;

    @SafeParcelable.Field
    public final int zzc;

    @SafeParcelable.Constructor
    public zzoh(@SafeParcelable.Param String str, @SafeParcelable.Param long j2, @SafeParcelable.Param int i2) {
        this.zza = str;
        this.zzb = j2;
        this.zzc = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String str = this.zza;
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 1, str);
        long j2 = this.zzb;
        SafeParcelWriter.m3588n(parcel, 2, 8);
        parcel.writeLong(j2);
        int i3 = this.zzc;
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(i3);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
