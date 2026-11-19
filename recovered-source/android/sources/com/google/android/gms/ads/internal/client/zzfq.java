package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzfq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        int iM3567q = 0;
        int iM3567q2 = 0;
        boolean zM3564n = false;
        String strM3558h = null;
        zzm zzmVar = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 1) {
                strM3558h = SafeParcelReader.m3558h(i2, parcel);
            } else if (c == 2) {
                iM3567q = SafeParcelReader.m3567q(i2, parcel);
            } else if (c == 3) {
                zzmVar = (zzm) SafeParcelReader.m3557g(parcel, i2, zzm.CREATOR);
            } else if (c == 4) {
                iM3567q2 = SafeParcelReader.m3567q(i2, parcel);
            } else if (c != 5) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                zM3564n = SafeParcelReader.m3564n(i2, parcel);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzfp(strM3558h, iM3567q, zzmVar, iM3567q2, zM3564n);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzfp[i2];
    }
}
