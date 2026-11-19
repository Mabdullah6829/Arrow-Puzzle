package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        boolean zM3564n = false;
        boolean zM3564n2 = false;
        boolean zM3564n3 = false;
        int iM3567q = 0;
        boolean zM3564n4 = false;
        boolean zM3564n5 = false;
        boolean zM3564n6 = false;
        float fM3565o = 0.0f;
        String strM3558h = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            switch ((char) i2) {
                case 2:
                    zM3564n = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 3:
                    zM3564n2 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 4:
                    strM3558h = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 5:
                    zM3564n3 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 6:
                    fM3565o = SafeParcelReader.m3565o(i2, parcel);
                    break;
                case 7:
                    iM3567q = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case '\b':
                    zM3564n4 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case '\t':
                    zM3564n5 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case '\n':
                    zM3564n6 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                default:
                    SafeParcelReader.m3571u(i2, parcel);
                    break;
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzl(zM3564n, zM3564n2, strM3558h, zM3564n3, fM3565o, iM3567q, zM3564n4, zM3564n5, zM3564n6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzl[i2];
    }
}
