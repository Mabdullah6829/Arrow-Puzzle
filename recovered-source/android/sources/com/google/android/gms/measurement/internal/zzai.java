package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzai implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        String strM3558h = null;
        String strM3558h2 = null;
        zzpl zzplVar = null;
        String strM3558h3 = null;
        zzbh zzbhVar = null;
        zzbh zzbhVar2 = null;
        zzbh zzbhVar3 = null;
        long jM3568r = 0;
        long jM3568r2 = 0;
        long jM3568r3 = 0;
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
                    zzplVar = (zzpl) SafeParcelReader.m3557g(parcel, i2, zzpl.CREATOR);
                    break;
                case 5:
                    jM3568r = SafeParcelReader.m3568r(i2, parcel);
                    break;
                case 6:
                    zM3564n = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 7:
                    strM3558h3 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '\b':
                    zzbhVar = (zzbh) SafeParcelReader.m3557g(parcel, i2, zzbh.CREATOR);
                    break;
                case '\t':
                    jM3568r2 = SafeParcelReader.m3568r(i2, parcel);
                    break;
                case '\n':
                    zzbhVar2 = (zzbh) SafeParcelReader.m3557g(parcel, i2, zzbh.CREATOR);
                    break;
                case 11:
                    jM3568r3 = SafeParcelReader.m3568r(i2, parcel);
                    break;
                case '\f':
                    zzbhVar3 = (zzbh) SafeParcelReader.m3557g(parcel, i2, zzbh.CREATOR);
                    break;
                default:
                    SafeParcelReader.m3571u(i2, parcel);
                    break;
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzah(strM3558h, strM3558h2, zzplVar, jM3568r, zM3564n, strM3558h3, zzbhVar, jM3568r2, zzbhVar2, jM3568r3, zzbhVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzah[i2];
    }
}
