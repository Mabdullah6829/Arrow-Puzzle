package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcey implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        String strM3558h = null;
        String strM3558h2 = null;
        com.google.android.gms.ads.internal.client.zzr zzrVar = null;
        com.google.android.gms.ads.internal.client.zzm zzmVar = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 1) {
                strM3558h = SafeParcelReader.m3558h(i2, parcel);
            } else if (c == 2) {
                strM3558h2 = SafeParcelReader.m3558h(i2, parcel);
            } else if (c == 3) {
                zzrVar = (com.google.android.gms.ads.internal.client.zzr) SafeParcelReader.m3557g(parcel, i2, com.google.android.gms.ads.internal.client.zzr.CREATOR);
            } else if (c != 4) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                zzmVar = (com.google.android.gms.ads.internal.client.zzm) SafeParcelReader.m3557g(parcel, i2, com.google.android.gms.ads.internal.client.zzm.CREATOR);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzcex(strM3558h, strM3558h2, zzrVar, zzmVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzcex[i2];
    }
}
