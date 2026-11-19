package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zaw;

/* JADX INFO: loaded from: classes2.dex */
public final class zaj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        zaw zawVar = null;
        int iM3567q = 0;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 1) {
                iM3567q = SafeParcelReader.m3567q(i2, parcel);
            } else if (c != 2) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                zawVar = (zaw) SafeParcelReader.m3557g(parcel, i2, zaw.CREATOR);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zai(iM3567q, zawVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zai[i2];
    }
}
