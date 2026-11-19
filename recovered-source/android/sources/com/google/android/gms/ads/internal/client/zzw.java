package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        String strM3558h = null;
        zze zzeVar = null;
        Bundle bundleM3552b = null;
        String strM3558h2 = null;
        String strM3558h3 = null;
        String strM3558h4 = null;
        String strM3558h5 = null;
        long jM3568r = 0;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            switch ((char) i2) {
                case 1:
                    strM3558h = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 2:
                    jM3568r = SafeParcelReader.m3568r(i2, parcel);
                    break;
                case 3:
                    zzeVar = (zze) SafeParcelReader.m3557g(parcel, i2, zze.CREATOR);
                    break;
                case 4:
                    bundleM3552b = SafeParcelReader.m3552b(i2, parcel);
                    break;
                case 5:
                    strM3558h2 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 6:
                    strM3558h3 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 7:
                    strM3558h4 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '\b':
                    strM3558h5 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                default:
                    SafeParcelReader.m3571u(i2, parcel);
                    break;
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzv(strM3558h, jM3568r, zzeVar, bundleM3552b, strM3558h2, strM3558h3, strM3558h4, strM3558h5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzv[i2];
    }
}
