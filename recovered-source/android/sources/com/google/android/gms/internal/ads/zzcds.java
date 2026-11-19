package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcds implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        String strM3558h = null;
        String strM3558h2 = null;
        ArrayList arrayListM3560j = null;
        ArrayList arrayListM3560j2 = null;
        boolean zM3564n = false;
        boolean zM3564n2 = false;
        boolean zM3564n3 = false;
        boolean zM3564n4 = false;
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
                    zM3564n = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 5:
                    zM3564n2 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 6:
                    arrayListM3560j = SafeParcelReader.m3560j(i2, parcel);
                    break;
                case 7:
                    zM3564n3 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case '\b':
                    zM3564n4 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case '\t':
                    arrayListM3560j2 = SafeParcelReader.m3560j(i2, parcel);
                    break;
                default:
                    SafeParcelReader.m3571u(i2, parcel);
                    break;
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzcdr(strM3558h, strM3558h2, zM3564n, zM3564n2, arrayListM3560j, zM3564n3, zM3564n4, arrayListM3560j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzcdr[i2];
    }
}
