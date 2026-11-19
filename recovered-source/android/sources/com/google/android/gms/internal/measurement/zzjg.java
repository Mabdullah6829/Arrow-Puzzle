package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        zzjo[] zzjoVarArr = null;
        int iM3567q = 0;
        String[] strArrM3559i = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 2) {
                iM3567q = SafeParcelReader.m3567q(i2, parcel);
            } else if (c == 3) {
                zzjoVarArr = (zzjo[]) SafeParcelReader.m3561k(parcel, i2, zzjo.CREATOR);
            } else if (c != 4) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                strArrM3559i = SafeParcelReader.m3559i(i2, parcel);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzjf(iM3567q, zzjoVarArr, strArrM3559i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzjf[i2];
    }
}
