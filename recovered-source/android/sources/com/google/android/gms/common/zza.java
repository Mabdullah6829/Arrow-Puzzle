package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        PendingIntent pendingIntent = null;
        String strM3558h = null;
        Integer numValueOf = null;
        int iM3567q = 0;
        int iM3567q2 = 0;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 1) {
                iM3567q = SafeParcelReader.m3567q(i2, parcel);
            } else if (c == 2) {
                iM3567q2 = SafeParcelReader.m3567q(i2, parcel);
            } else if (c == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.m3557g(parcel, i2, PendingIntent.CREATOR);
            } else if (c == 4) {
                strM3558h = SafeParcelReader.m3558h(i2, parcel);
            } else if (c != 5) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                int iM3570t = SafeParcelReader.m3570t(i2, parcel);
                if (iM3570t == 0) {
                    numValueOf = null;
                } else {
                    SafeParcelReader.m3574x(parcel, iM3570t, 4);
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new ConnectionResult(iM3567q, iM3567q2, pendingIntent, strM3558h, numValueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new ConnectionResult[i2];
    }
}
