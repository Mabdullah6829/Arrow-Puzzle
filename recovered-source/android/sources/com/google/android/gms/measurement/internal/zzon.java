package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzon implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        byte[] bArrM3553c = null;
        String strM3558h = null;
        Bundle bundleM3552b = null;
        String strM3558h2 = null;
        long jM3568r = 0;
        long jM3568r2 = 0;
        int iM3567q = 0;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            switch ((char) i2) {
                case 1:
                    jM3568r = SafeParcelReader.m3568r(i2, parcel);
                    break;
                case 2:
                    bArrM3553c = SafeParcelReader.m3553c(i2, parcel);
                    break;
                case 3:
                    strM3558h = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 4:
                    bundleM3552b = SafeParcelReader.m3552b(i2, parcel);
                    break;
                case 5:
                    iM3567q = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 6:
                    jM3568r2 = SafeParcelReader.m3568r(i2, parcel);
                    break;
                case 7:
                    strM3558h2 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                default:
                    SafeParcelReader.m3571u(i2, parcel);
                    break;
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzom(jM3568r, bArrM3553c, strM3558h, bundleM3552b, iM3567q, jM3568r2, strM3558h2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzom[i2];
    }
}
