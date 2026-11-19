package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        boolean zM3564n = false;
        boolean zM3564n2 = false;
        boolean zM3564n3 = false;
        boolean zM3564n4 = false;
        boolean zM3564n5 = false;
        String strM3558h = null;
        IBinder iBinderM3566p = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            switch ((char) i2) {
                case 1:
                    strM3558h = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 2:
                    zM3564n = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 3:
                    zM3564n2 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 4:
                    iBinderM3566p = SafeParcelReader.m3566p(i2, parcel);
                    break;
                case 5:
                    zM3564n3 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 6:
                    zM3564n4 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 7:
                default:
                    SafeParcelReader.m3571u(i2, parcel);
                    break;
                case '\b':
                    zM3564n5 = SafeParcelReader.m3564n(i2, parcel);
                    break;
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzp(strM3558h, zM3564n, zM3564n2, iBinderM3566p, zM3564n3, zM3564n4, zM3564n5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzp[i2];
    }
}
