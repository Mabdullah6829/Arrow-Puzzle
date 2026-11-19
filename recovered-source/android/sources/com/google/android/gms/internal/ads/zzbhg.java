package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbhg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        boolean zM3564n = false;
        boolean zM3564n2 = false;
        boolean zM3564n3 = false;
        long jM3568r = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.m3557g(parcel, i2, ParcelFileDescriptor.CREATOR);
            } else if (c == 3) {
                zM3564n = SafeParcelReader.m3564n(i2, parcel);
            } else if (c == 4) {
                zM3564n2 = SafeParcelReader.m3564n(i2, parcel);
            } else if (c == 5) {
                jM3568r = SafeParcelReader.m3568r(i2, parcel);
            } else if (c != 6) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                zM3564n3 = SafeParcelReader.m3564n(i2, parcel);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzbhf(parcelFileDescriptor, zM3564n, zM3564n2, jM3568r, zM3564n3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzbhf[i2];
    }
}
