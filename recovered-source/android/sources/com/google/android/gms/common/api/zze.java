package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zze implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        String strM3558h = null;
        ConnectionResult connectionResult = null;
        int iM3567q = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 1) {
                iM3567q = SafeParcelReader.m3567q(i2, parcel);
            } else if (c == 2) {
                strM3558h = SafeParcelReader.m3558h(i2, parcel);
            } else if (c == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.m3557g(parcel, i2, PendingIntent.CREATOR);
            } else if (c != 4) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                connectionResult = (ConnectionResult) SafeParcelReader.m3557g(parcel, i2, ConnectionResult.CREATOR);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new Status(iM3567q, strM3558h, pendingIntent, connectionResult);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new Status[i2];
    }
}
