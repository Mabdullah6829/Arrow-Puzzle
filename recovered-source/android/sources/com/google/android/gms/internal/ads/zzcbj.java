package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcbj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            if (((char) i2) != 2) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.m3557g(parcel, i2, ParcelFileDescriptor.CREATOR);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzcbi(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzcbi[i2];
    }
}
