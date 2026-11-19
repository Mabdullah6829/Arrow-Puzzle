package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zaq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        int iM3567q = -1;
        int iM3567q2 = 0;
        int iM3567q3 = 0;
        int iM3567q4 = 0;
        int iM3567q5 = 0;
        String strM3558h = null;
        String strM3558h2 = null;
        long jM3568r = 0;
        long jM3568r2 = 0;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            switch ((char) i2) {
                case 1:
                    iM3567q2 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 2:
                    iM3567q3 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 3:
                    iM3567q4 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 4:
                    jM3568r = SafeParcelReader.m3568r(i2, parcel);
                    break;
                case 5:
                    jM3568r2 = SafeParcelReader.m3568r(i2, parcel);
                    break;
                case 6:
                    strM3558h = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 7:
                    strM3558h2 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '\b':
                    iM3567q5 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case '\t':
                    iM3567q = SafeParcelReader.m3567q(i2, parcel);
                    break;
                default:
                    SafeParcelReader.m3571u(i2, parcel);
                    break;
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new MethodInvocation(iM3567q2, iM3567q3, iM3567q4, jM3568r, jM3568r2, strM3558h, strM3558h2, iM3567q5, iM3567q);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new MethodInvocation[i2];
    }
}
