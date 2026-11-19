package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        String strM3558h = null;
        byte[] bArrM3553c = null;
        byte[][] bArrM3554d = null;
        byte[][] bArrM3554d2 = null;
        byte[][] bArrM3554d3 = null;
        byte[][] bArrM3554d4 = null;
        int[] iArrM3555e = null;
        byte[][] bArrM3554d5 = null;
        int[] iArrM3555e2 = null;
        byte[][] bArrM3554d6 = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            switch ((char) i2) {
                case 2:
                    strM3558h = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 3:
                    bArrM3553c = SafeParcelReader.m3553c(i2, parcel);
                    break;
                case 4:
                    bArrM3554d = SafeParcelReader.m3554d(i2, parcel);
                    break;
                case 5:
                    bArrM3554d2 = SafeParcelReader.m3554d(i2, parcel);
                    break;
                case 6:
                    bArrM3554d3 = SafeParcelReader.m3554d(i2, parcel);
                    break;
                case 7:
                    bArrM3554d4 = SafeParcelReader.m3554d(i2, parcel);
                    break;
                case '\b':
                    iArrM3555e = SafeParcelReader.m3555e(i2, parcel);
                    break;
                case '\t':
                    bArrM3554d5 = SafeParcelReader.m3554d(i2, parcel);
                    break;
                case '\n':
                    iArrM3555e2 = SafeParcelReader.m3555e(i2, parcel);
                    break;
                case 11:
                    bArrM3554d6 = SafeParcelReader.m3554d(i2, parcel);
                    break;
                default:
                    SafeParcelReader.m3571u(i2, parcel);
                    break;
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzjl(strM3558h, bArrM3553c, bArrM3554d, bArrM3554d2, bArrM3554d3, bArrM3554d4, iArrM3555e, bArrM3554d5, iArrM3555e2, bArrM3554d6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzjl[i2];
    }
}
