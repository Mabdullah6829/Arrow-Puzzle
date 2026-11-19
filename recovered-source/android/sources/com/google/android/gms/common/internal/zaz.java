package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zaz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        int iM3567q = 0;
        boolean zM3564n = false;
        boolean zM3564n2 = false;
        IBinder iBinderM3566p = null;
        ConnectionResult connectionResult = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 1) {
                iM3567q = SafeParcelReader.m3567q(i2, parcel);
            } else if (c == 2) {
                iBinderM3566p = SafeParcelReader.m3566p(i2, parcel);
            } else if (c == 3) {
                connectionResult = (ConnectionResult) SafeParcelReader.m3557g(parcel, i2, ConnectionResult.CREATOR);
            } else if (c == 4) {
                zM3564n = SafeParcelReader.m3564n(i2, parcel);
            } else if (c != 5) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                zM3564n2 = SafeParcelReader.m3564n(i2, parcel);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zay(iM3567q, iBinderM3566p, connectionResult, zM3564n, zM3564n2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zay[i2];
    }
}
