package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        String strM3558h = null;
        String strM3558h2 = null;
        zze zzeVar = null;
        IBinder iBinderM3566p = null;
        int iM3567q = 0;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 1) {
                iM3567q = SafeParcelReader.m3567q(i2, parcel);
            } else if (c == 2) {
                strM3558h = SafeParcelReader.m3558h(i2, parcel);
            } else if (c == 3) {
                strM3558h2 = SafeParcelReader.m3558h(i2, parcel);
            } else if (c == 4) {
                zzeVar = (zze) SafeParcelReader.m3557g(parcel, i2, zze.CREATOR);
            } else if (c != 5) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                iBinderM3566p = SafeParcelReader.m3566p(i2, parcel);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zze(iM3567q, strM3558h, strM3558h2, zzeVar, iBinderM3566p);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zze[i2];
    }
}
