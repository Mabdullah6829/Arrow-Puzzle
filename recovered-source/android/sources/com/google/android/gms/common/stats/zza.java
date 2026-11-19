package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        int iM3567q = 0;
        int iM3567q2 = 0;
        int iM3567q3 = 0;
        int iM3567q4 = 0;
        boolean zM3564n = false;
        String strM3558h = null;
        ArrayList arrayListM3560j = null;
        String strM3558h2 = null;
        String strM3558h3 = null;
        String strM3558h4 = null;
        String strM3558h5 = null;
        long jM3568r = 0;
        long jM3568r2 = 0;
        long jM3568r3 = 0;
        float fM3565o = 0.0f;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            switch ((char) i2) {
                case 1:
                    iM3567q = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 2:
                    jM3568r = SafeParcelReader.m3568r(i2, parcel);
                    break;
                case 3:
                case 7:
                case '\t':
                default:
                    SafeParcelReader.m3571u(i2, parcel);
                    break;
                case 4:
                    strM3558h = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 5:
                    iM3567q3 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 6:
                    arrayListM3560j = SafeParcelReader.m3560j(i2, parcel);
                    break;
                case '\b':
                    jM3568r2 = SafeParcelReader.m3568r(i2, parcel);
                    break;
                case '\n':
                    strM3558h3 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 11:
                    iM3567q2 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case '\f':
                    strM3558h2 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '\r':
                    strM3558h4 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 14:
                    iM3567q4 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 15:
                    fM3565o = SafeParcelReader.m3565o(i2, parcel);
                    break;
                case 16:
                    jM3568r3 = SafeParcelReader.m3568r(i2, parcel);
                    break;
                case 17:
                    strM3558h5 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 18:
                    zM3564n = SafeParcelReader.m3564n(i2, parcel);
                    break;
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new WakeLockEvent(iM3567q, jM3568r, iM3567q2, strM3558h, iM3567q3, arrayListM3560j, strM3558h2, jM3568r2, iM3567q4, strM3558h3, strM3558h4, fM3565o, jM3568r3, strM3558h5, zM3564n);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new WakeLockEvent[i2];
    }
}
