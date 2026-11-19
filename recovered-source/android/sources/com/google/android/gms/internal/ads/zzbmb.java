package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbmb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        int iM3567q = 0;
        boolean zM3564n = false;
        int iM3567q2 = 0;
        boolean zM3564n2 = false;
        int iM3567q3 = 0;
        boolean zM3564n3 = false;
        int iM3567q4 = 0;
        int iM3567q5 = 0;
        boolean zM3564n4 = false;
        int iM3567q6 = 0;
        com.google.android.gms.ads.internal.client.zzfw zzfwVar = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            switch ((char) i2) {
                case 1:
                    iM3567q = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 2:
                    zM3564n = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 3:
                    iM3567q2 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 4:
                    zM3564n2 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 5:
                    iM3567q3 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 6:
                    zzfwVar = (com.google.android.gms.ads.internal.client.zzfw) SafeParcelReader.m3557g(parcel, i2, com.google.android.gms.ads.internal.client.zzfw.CREATOR);
                    break;
                case 7:
                    zM3564n3 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case '\b':
                    iM3567q4 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case '\t':
                    iM3567q5 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case '\n':
                    zM3564n4 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 11:
                    iM3567q6 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                default:
                    SafeParcelReader.m3571u(i2, parcel);
                    break;
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzbma(iM3567q, zM3564n, iM3567q2, zM3564n2, iM3567q3, zzfwVar, zM3564n3, iM3567q4, iM3567q5, zM3564n4, iM3567q6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzbma[i2];
    }
}
