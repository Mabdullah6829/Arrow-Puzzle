package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zaa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        int iM3567q = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        int iM3567q2 = 0;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 1) {
                iM3567q = SafeParcelReader.m3567q(i2, parcel);
            } else if (c == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.m3557g(parcel, i2, ParcelFileDescriptor.CREATOR);
            } else if (c != 3) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                iM3567q2 = SafeParcelReader.m3567q(i2, parcel);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new BitmapTeleporter(iM3567q, parcelFileDescriptor, iM3567q2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new BitmapTeleporter[i2];
    }
}
