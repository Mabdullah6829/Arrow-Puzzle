package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfzd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        String strM3558h = null;
        String strM3558h2 = null;
        int iM3567q = 0;
        int iM3567q2 = 0;
        int iM3567q3 = 0;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 1) {
                iM3567q = SafeParcelReader.m3567q(i2, parcel);
            } else if (c == 2) {
                iM3567q2 = SafeParcelReader.m3567q(i2, parcel);
            } else if (c == 3) {
                strM3558h = SafeParcelReader.m3558h(i2, parcel);
            } else if (c == 4) {
                strM3558h2 = SafeParcelReader.m3558h(i2, parcel);
            } else if (c != 5) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                iM3567q3 = SafeParcelReader.m3567q(i2, parcel);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzfzc(strM3558h, iM3567q, strM3558h2, iM3567q2, iM3567q3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzfzc[i2];
    }
}
