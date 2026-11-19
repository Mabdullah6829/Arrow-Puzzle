package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        boolean zM3564n = false;
        int iM3567q = 0;
        int iM3567q2 = 0;
        int iM3567q3 = 0;
        String strM3558h = null;
        String strM3558h2 = null;
        byte[] bArrM3553c = null;
        double d = 0.0d;
        long jM3568r = 0;
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
                    zM3564n = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 5:
                    SafeParcelReader.m3573w(parcel, i2, 8);
                    d = parcel.readDouble();
                    break;
                case 6:
                    strM3558h2 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 7:
                    bArrM3553c = SafeParcelReader.m3553c(i2, parcel);
                    break;
                case '\b':
                    iM3567q = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case '\t':
                    iM3567q2 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case '\n':
                    iM3567q3 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                default:
                    SafeParcelReader.m3571u(i2, parcel);
                    break;
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzjo(strM3558h, jM3568r, zM3564n, d, strM3558h2, bArrM3553c, iM3567q, iM3567q2, iM3567q3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzjo[i2];
    }
}
