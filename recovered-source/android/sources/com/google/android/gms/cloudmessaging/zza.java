package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            if (((char) i2) != 1) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                intent = (Intent) SafeParcelReader.m3557g(parcel, i2, Intent.CREATOR);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new CloudMessage(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new CloudMessage[i2];
    }
}
