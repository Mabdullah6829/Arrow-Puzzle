package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbhj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        boolean zM3564n = false;
        int iM3567q = 0;
        String strM3558h = null;
        String strM3558h2 = null;
        String strM3558h3 = null;
        String strM3558h4 = null;
        Bundle bundleM3552b = null;
        String strM3558h5 = null;
        long jM3568r = 0;
        long jM3568r2 = 0;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            switch ((char) i2) {
                case 2:
                    strM3558h = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 3:
                    jM3568r = SafeParcelReader.m3568r(i2, parcel);
                    break;
                case 4:
                    strM3558h2 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 5:
                    strM3558h3 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 6:
                    strM3558h4 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 7:
                    bundleM3552b = SafeParcelReader.m3552b(i2, parcel);
                    break;
                case '\b':
                    zM3564n = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case '\t':
                    jM3568r2 = SafeParcelReader.m3568r(i2, parcel);
                    break;
                case '\n':
                    strM3558h5 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 11:
                    iM3567q = SafeParcelReader.m3567q(i2, parcel);
                    break;
                default:
                    SafeParcelReader.m3571u(i2, parcel);
                    break;
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzbhi(strM3558h, jM3568r, strM3558h2, strM3558h3, strM3558h4, bundleM3552b, zM3564n, jM3568r2, strM3558h5, iM3567q);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzbhi[i2];
    }
}
