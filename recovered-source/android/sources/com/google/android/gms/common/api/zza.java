package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
final class zza implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public static final zza f4380a;

    static {
        new zzb();
        f4380a = new zza();
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        if (parcel.readInt() == -204102970) {
            return zzb.m3526a(parcel);
        }
        parcel.setDataPosition(iDataPosition - 4);
        return ApiMetadata.f4178v;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        return new ApiMetadata[i2];
    }
}
