package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        boolean zM3564n = false;
        String strM3558h = null;
        String strM3558h2 = null;
        zzjo zzjoVar = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 2) {
                strM3558h = SafeParcelReader.m3558h(i2, parcel);
            } else if (c == 3) {
                strM3558h2 = SafeParcelReader.m3558h(i2, parcel);
            } else if (c == 4) {
                zzjoVar = (zzjo) SafeParcelReader.m3557g(parcel, i2, zzjo.CREATOR);
            } else if (c != 5) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                zM3564n = SafeParcelReader.m3564n(i2, parcel);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzjq(strM3558h, strM3558h2, zzjoVar, zM3564n);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzjq[i2];
    }
}
