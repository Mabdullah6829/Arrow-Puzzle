package com.google.android.gms.ads.internal.offline.buffering;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        String strM3558h = null;
        String strM3558h2 = null;
        String strM3558h3 = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 1) {
                strM3558h = SafeParcelReader.m3558h(i2, parcel);
            } else if (c == 2) {
                strM3558h2 = SafeParcelReader.m3558h(i2, parcel);
            } else if (c != 3) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                strM3558h3 = SafeParcelReader.m3558h(i2, parcel);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zza(strM3558h, strM3558h2, strM3558h3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zza[i2];
    }
}
