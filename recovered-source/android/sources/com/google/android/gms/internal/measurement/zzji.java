package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzji implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        long jM3568r = 0;
        String strM3558h = null;
        String strM3558h2 = null;
        zzjf[] zzjfVarArr = null;
        byte[] bArrM3553c = null;
        boolean zM3564n = false;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            switch ((char) i2) {
                case 2:
                    strM3558h = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 3:
                    strM3558h2 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 4:
                    zzjfVarArr = (zzjf[]) SafeParcelReader.m3561k(parcel, i2, zzjf.CREATOR);
                    break;
                case 5:
                    zM3564n = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 6:
                    bArrM3553c = SafeParcelReader.m3553c(i2, parcel);
                    break;
                case 7:
                    jM3568r = SafeParcelReader.m3568r(i2, parcel);
                    break;
                default:
                    SafeParcelReader.m3571u(i2, parcel);
                    break;
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzjh(strM3558h, strM3558h2, zzjfVarArr, zM3564n, bArrM3553c, jM3568r);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzjh[i2];
    }
}
