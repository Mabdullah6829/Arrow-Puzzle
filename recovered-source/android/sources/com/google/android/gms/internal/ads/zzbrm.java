package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbrm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        long jM3568r = 0;
        boolean zM3564n = false;
        int iM3567q = 0;
        boolean zM3564n2 = false;
        String strM3558h = null;
        byte[] bArrM3553c = null;
        String[] strArrM3559i = null;
        String[] strArrM3559i2 = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            switch ((char) i2) {
                case 1:
                    zM3564n = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 2:
                    strM3558h = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 3:
                    iM3567q = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 4:
                    bArrM3553c = SafeParcelReader.m3553c(i2, parcel);
                    break;
                case 5:
                    strArrM3559i = SafeParcelReader.m3559i(i2, parcel);
                    break;
                case 6:
                    strArrM3559i2 = SafeParcelReader.m3559i(i2, parcel);
                    break;
                case 7:
                    zM3564n2 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case '\b':
                    jM3568r = SafeParcelReader.m3568r(i2, parcel);
                    break;
                default:
                    SafeParcelReader.m3571u(i2, parcel);
                    break;
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzbrl(zM3564n, strM3558h, iM3567q, bArrM3553c, strArrM3559i, strArrM3559i2, zM3564n2, jM3568r);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzbrl[i2];
    }
}
