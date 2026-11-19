package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zaae implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        ArrayList arrayListM3562l = null;
        int iM3567q = 0;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 1) {
                iM3567q = SafeParcelReader.m3567q(i2, parcel);
            } else if (c != 2) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                arrayListM3562l = SafeParcelReader.m3562l(parcel, i2, MethodInvocation.CREATOR);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new TelemetryData(iM3567q, arrayListM3562l);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new TelemetryData[i2];
    }
}
