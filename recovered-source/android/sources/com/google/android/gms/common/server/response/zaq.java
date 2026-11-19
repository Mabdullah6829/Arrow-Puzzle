package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zaq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        int iM3567q = 0;
        Parcel parcel2 = null;
        zan zanVar = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 1) {
                iM3567q = SafeParcelReader.m3567q(i2, parcel);
            } else if (c == 2) {
                int iM3570t = SafeParcelReader.m3570t(i2, parcel);
                int iDataPosition = parcel.dataPosition();
                if (iM3570t == 0) {
                    parcel2 = null;
                } else {
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.appendFrom(parcel, iDataPosition, iM3570t);
                    parcel.setDataPosition(iDataPosition + iM3570t);
                    parcel2 = parcelObtain;
                }
            } else if (c != 3) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                zanVar = (zan) SafeParcelReader.m3557g(parcel, i2, zan.CREATOR);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new SafeParcelResponse(iM3567q, parcel2, zanVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new SafeParcelResponse[i2];
    }
}
