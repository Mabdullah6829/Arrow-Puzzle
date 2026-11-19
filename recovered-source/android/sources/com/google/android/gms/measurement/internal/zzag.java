package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzag implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        long jM3568r = 0;
        long jM3568r2 = 0;
        int iM3567q = 0;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 1) {
                jM3568r = SafeParcelReader.m3568r(i2, parcel);
            } else if (c == 2) {
                iM3567q = SafeParcelReader.m3567q(i2, parcel);
            } else if (c != 3) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                jM3568r2 = SafeParcelReader.m3568r(i2, parcel);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzaf(jM3568r, iM3567q, jM3568r2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzaf[i2];
    }
}
