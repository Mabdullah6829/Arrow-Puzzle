package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zah implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        int iM3567q = 0;
        int iM3567q2 = 0;
        Uri uri = null;
        int iM3567q3 = 0;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 1) {
                iM3567q = SafeParcelReader.m3567q(i2, parcel);
            } else if (c == 2) {
                uri = (Uri) SafeParcelReader.m3557g(parcel, i2, Uri.CREATOR);
            } else if (c == 3) {
                iM3567q3 = SafeParcelReader.m3567q(i2, parcel);
            } else if (c != 4) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                iM3567q2 = SafeParcelReader.m3567q(i2, parcel);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new WebImage(iM3567q, uri, iM3567q3, iM3567q2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new WebImage[i2];
    }
}
