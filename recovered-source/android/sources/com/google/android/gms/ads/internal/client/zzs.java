package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        int iM3567q = 0;
        int iM3567q2 = 0;
        boolean zM3564n = false;
        int iM3567q3 = 0;
        int iM3567q4 = 0;
        boolean zM3564n2 = false;
        boolean zM3564n3 = false;
        boolean zM3564n4 = false;
        boolean zM3564n5 = false;
        boolean zM3564n6 = false;
        boolean zM3564n7 = false;
        boolean zM3564n8 = false;
        boolean zM3564n9 = false;
        boolean zM3564n10 = false;
        String strM3558h = null;
        zzr[] zzrVarArr = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            switch ((char) i2) {
                case 2:
                    strM3558h = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 3:
                    iM3567q = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 4:
                    iM3567q2 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 5:
                    zM3564n = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 6:
                    iM3567q3 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 7:
                    iM3567q4 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case '\b':
                    zzrVarArr = (zzr[]) SafeParcelReader.m3561k(parcel, i2, zzr.CREATOR);
                    break;
                case '\t':
                    zM3564n2 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case '\n':
                    zM3564n3 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 11:
                    zM3564n4 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case '\f':
                    zM3564n5 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case '\r':
                    zM3564n6 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 14:
                    zM3564n7 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 15:
                    zM3564n8 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 16:
                    zM3564n9 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 17:
                    zM3564n10 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                default:
                    SafeParcelReader.m3571u(i2, parcel);
                    break;
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzr(strM3558h, iM3567q, iM3567q2, zM3564n, iM3567q3, iM3567q4, zzrVarArr, zM3564n2, zM3564n3, zM3564n4, zM3564n5, zM3564n6, zM3564n7, zM3564n8, zM3564n9, zM3564n10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzr[i2];
    }
}
