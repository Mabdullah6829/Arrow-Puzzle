package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        long jM3568r = 0;
        long jM3568r2 = 0;
        long jM3568r3 = 0;
        long jM3568r4 = 0;
        long jM3568r5 = 0;
        long jM3568r6 = 0;
        long jM3568r7 = 0;
        long jM3568r8 = 0;
        boolean zM3564n = false;
        int iM3567q = 0;
        boolean zM3564n2 = false;
        boolean zM3564n3 = false;
        int iM3567q2 = 0;
        int iM3567q3 = 0;
        String strM3558h = "";
        String strM3558h2 = strM3558h;
        String strM3558h3 = strM3558h2;
        String strM3558h4 = strM3558h3;
        String strM3558h5 = null;
        String strM3558h6 = null;
        String strM3558h7 = null;
        String strM3558h8 = null;
        String strM3558h9 = null;
        String strM3558h10 = null;
        Boolean boolValueOf = null;
        ArrayList arrayListM3560j = null;
        String strM3558h11 = null;
        String strM3558h12 = null;
        int iM3567q4 = 100;
        boolean zM3564n4 = true;
        boolean zM3564n5 = true;
        long jM3568r9 = -2147483648L;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            switch ((char) i2) {
                case 2:
                    strM3558h5 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 3:
                    strM3558h6 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 4:
                    strM3558h7 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 5:
                    strM3558h8 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 6:
                    jM3568r = SafeParcelReader.m3568r(i2, parcel);
                    break;
                case 7:
                    jM3568r2 = SafeParcelReader.m3568r(i2, parcel);
                    break;
                case '\b':
                    strM3558h9 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '\t':
                    zM3564n4 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case '\n':
                    zM3564n = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 11:
                    jM3568r9 = SafeParcelReader.m3568r(i2, parcel);
                    break;
                case '\f':
                    strM3558h10 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '\r':
                case 17:
                case 19:
                case 20:
                case 24:
                case '!':
                default:
                    SafeParcelReader.m3571u(i2, parcel);
                    break;
                case 14:
                    jM3568r3 = SafeParcelReader.m3568r(i2, parcel);
                    break;
                case 15:
                    iM3567q = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 16:
                    zM3564n5 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 18:
                    zM3564n2 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 21:
                    int iM3570t = SafeParcelReader.m3570t(i2, parcel);
                    if (iM3570t != 0) {
                        SafeParcelReader.m3574x(parcel, iM3570t, 4);
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    } else {
                        boolValueOf = null;
                    }
                    break;
                case 22:
                    jM3568r4 = SafeParcelReader.m3568r(i2, parcel);
                    break;
                case 23:
                    arrayListM3560j = SafeParcelReader.m3560j(i2, parcel);
                    break;
                case 25:
                    strM3558h = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 26:
                    strM3558h2 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 27:
                    strM3558h11 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 28:
                    zM3564n3 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 29:
                    jM3568r5 = SafeParcelReader.m3568r(i2, parcel);
                    break;
                case 30:
                    iM3567q4 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 31:
                    strM3558h3 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case ' ':
                    iM3567q2 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case '\"':
                    jM3568r6 = SafeParcelReader.m3568r(i2, parcel);
                    break;
                case '#':
                    strM3558h12 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '$':
                    strM3558h4 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '%':
                    jM3568r7 = SafeParcelReader.m3568r(i2, parcel);
                    break;
                case '&':
                    iM3567q3 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case '\'':
                    jM3568r8 = SafeParcelReader.m3568r(i2, parcel);
                    break;
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzr(strM3558h5, strM3558h6, strM3558h7, strM3558h8, jM3568r, jM3568r2, strM3558h9, zM3564n4, zM3564n, jM3568r9, strM3558h10, jM3568r3, iM3567q, zM3564n5, zM3564n2, boolValueOf, jM3568r4, arrayListM3560j, strM3558h, strM3558h2, strM3558h11, zM3564n3, jM3568r5, iM3567q4, strM3558h3, iM3567q2, jM3568r6, strM3558h12, strM3558h4, jM3568r7, iM3567q3, jM3568r8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzr[i2];
    }
}
