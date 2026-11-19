package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zzo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        int iM3567q = 0;
        int iM3567q2 = 0;
        boolean zM3564n = false;
        int iM3567q3 = 0;
        boolean zM3564n2 = false;
        boolean zM3564n3 = false;
        int iM3567q4 = 0;
        int iM3567q5 = 0;
        int iM3567q6 = 0;
        int iM3567q7 = 0;
        long jM3568r = 0;
        long jM3568r2 = 0;
        long jM3568r3 = 0;
        Bundle bundleM3552b = null;
        ArrayList arrayListM3560j = null;
        String strM3558h = null;
        zzft zzftVar = null;
        Location location = null;
        String strM3558h2 = null;
        Bundle bundleM3552b2 = null;
        Bundle bundleM3552b3 = null;
        ArrayList arrayListM3560j2 = null;
        String strM3558h3 = null;
        String strM3558h4 = null;
        zzc zzcVar = null;
        String strM3558h5 = null;
        ArrayList arrayListM3560j3 = null;
        String strM3558h6 = null;
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
                    bundleM3552b = SafeParcelReader.m3552b(i2, parcel);
                    break;
                case 4:
                    iM3567q2 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 5:
                    arrayListM3560j = SafeParcelReader.m3560j(i2, parcel);
                    break;
                case 6:
                    zM3564n = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 7:
                    iM3567q3 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case '\b':
                    zM3564n2 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case '\t':
                    strM3558h = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '\n':
                    zzftVar = (zzft) SafeParcelReader.m3557g(parcel, i2, zzft.CREATOR);
                    break;
                case 11:
                    location = (Location) SafeParcelReader.m3557g(parcel, i2, Location.CREATOR);
                    break;
                case '\f':
                    strM3558h2 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '\r':
                    bundleM3552b2 = SafeParcelReader.m3552b(i2, parcel);
                    break;
                case 14:
                    bundleM3552b3 = SafeParcelReader.m3552b(i2, parcel);
                    break;
                case 15:
                    arrayListM3560j2 = SafeParcelReader.m3560j(i2, parcel);
                    break;
                case 16:
                    strM3558h3 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 17:
                    strM3558h4 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 18:
                    zM3564n3 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 19:
                    zzcVar = (zzc) SafeParcelReader.m3557g(parcel, i2, zzc.CREATOR);
                    break;
                case 20:
                    iM3567q4 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 21:
                    strM3558h5 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 22:
                    arrayListM3560j3 = SafeParcelReader.m3560j(i2, parcel);
                    break;
                case 23:
                    iM3567q5 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 24:
                    strM3558h6 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 25:
                    iM3567q6 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 26:
                    jM3568r2 = SafeParcelReader.m3568r(i2, parcel);
                    break;
                case 27:
                    jM3568r3 = SafeParcelReader.m3568r(i2, parcel);
                    break;
                case 28:
                    iM3567q7 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                default:
                    SafeParcelReader.m3571u(i2, parcel);
                    break;
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzm(iM3567q, jM3568r, bundleM3552b, iM3567q2, arrayListM3560j, zM3564n, iM3567q3, zM3564n2, strM3558h, zzftVar, location, strM3558h2, bundleM3552b2, bundleM3552b3, arrayListM3560j2, strM3558h3, strM3558h4, zM3564n3, zzcVar, iM3567q4, strM3558h5, arrayListM3560j3, iM3567q5, strM3558h6, iM3567q6, jM3568r2, jM3568r3, iM3567q7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzm[i2];
    }
}
