package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfnd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        int iM3567q = 0;
        int iM3567q2 = 0;
        int iM3567q3 = 0;
        int iM3567q4 = 0;
        int iM3567q5 = 0;
        int iM3567q6 = 0;
        String strM3558h = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            switch ((char) i2) {
                case 1:
                    iM3567q = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 2:
                    iM3567q2 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 3:
                    iM3567q3 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 4:
                    iM3567q4 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 5:
                    strM3558h = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 6:
                    iM3567q5 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 7:
                    iM3567q6 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                default:
                    SafeParcelReader.m3571u(i2, parcel);
                    break;
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzfnc(iM3567q, iM3567q2, iM3567q3, iM3567q4, strM3558h, iM3567q5, iM3567q6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzfnc[i2];
    }
}
