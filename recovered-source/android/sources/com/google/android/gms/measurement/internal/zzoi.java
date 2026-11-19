package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzoi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        int iM3567q = 0;
        long jM3568r = 0;
        String strM3558h = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 1) {
                strM3558h = SafeParcelReader.m3558h(i2, parcel);
            } else if (c == 2) {
                jM3568r = SafeParcelReader.m3568r(i2, parcel);
            } else if (c != 3) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                iM3567q = SafeParcelReader.m3567q(i2, parcel);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzoh(strM3558h, jM3568r, iM3567q);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzoh[i2];
    }
}
