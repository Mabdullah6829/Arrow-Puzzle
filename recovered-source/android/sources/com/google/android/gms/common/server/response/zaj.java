package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zaj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        String strM3558h = null;
        String strM3558h2 = null;
        com.google.android.gms.common.server.converter.zaa zaaVar = null;
        int iM3567q = 0;
        int iM3567q2 = 0;
        boolean zM3564n = false;
        int iM3567q3 = 0;
        boolean zM3564n2 = false;
        int iM3567q4 = 0;
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
                    zM3564n = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 4:
                    iM3567q3 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 5:
                    zM3564n2 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 6:
                    strM3558h = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 7:
                    iM3567q4 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case '\b':
                    strM3558h2 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '\t':
                    zaaVar = (com.google.android.gms.common.server.converter.zaa) SafeParcelReader.m3557g(parcel, i2, com.google.android.gms.common.server.converter.zaa.CREATOR);
                    break;
                default:
                    SafeParcelReader.m3571u(i2, parcel);
                    break;
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new FastJsonResponse.Field(iM3567q, iM3567q2, zM3564n, iM3567q3, zM3564n2, strM3558h, iM3567q4, strM3558h2, zaaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new FastJsonResponse.Field[i2];
    }
}
