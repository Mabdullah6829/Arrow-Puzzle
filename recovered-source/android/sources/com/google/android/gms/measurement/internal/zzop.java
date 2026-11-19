package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzop implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        ArrayList arrayListM3556f = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            if (((char) i2) != 1) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                arrayListM3556f = SafeParcelReader.m3556f(i2, parcel);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzoo(arrayListM3556f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzoo[i2];
    }
}
