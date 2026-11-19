package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zac implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        int iM3567q = 0;
        int iM3567q2 = 0;
        boolean zM3564n = false;
        long jM3568r = 0;
        String strM3558h = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 1) {
                iM3567q = SafeParcelReader.m3567q(i2, parcel);
            } else if (c == 2) {
                strM3558h = SafeParcelReader.m3558h(i2, parcel);
            } else if (c == 3) {
                jM3568r = SafeParcelReader.m3568r(i2, parcel);
            } else if (c == 4) {
                iM3567q2 = SafeParcelReader.m3567q(i2, parcel);
            } else if (c != 5) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                zM3564n = SafeParcelReader.m3564n(i2, parcel);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zab(iM3567q, iM3567q2, jM3568r, strM3558h, zM3564n);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zab[i2];
    }
}
