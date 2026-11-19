package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        Bundle bundleM3552b = null;
        String strM3558h = null;
        boolean zM3564n = false;
        long jM3568r = 0;
        long jM3568r2 = 0;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 1) {
                jM3568r = SafeParcelReader.m3568r(i2, parcel);
            } else if (c == 2) {
                jM3568r2 = SafeParcelReader.m3568r(i2, parcel);
            } else if (c == 3) {
                zM3564n = SafeParcelReader.m3564n(i2, parcel);
            } else if (c == 7) {
                bundleM3552b = SafeParcelReader.m3552b(i2, parcel);
            } else if (c != '\b') {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                strM3558h = SafeParcelReader.m3558h(i2, parcel);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzdb(jM3568r, jM3568r2, zM3564n, bundleM3552b, strM3558h);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzdb[i2];
    }
}
