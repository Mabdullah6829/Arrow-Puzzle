package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfyr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        byte[] bArrM3553c = null;
        int iM3567q = 0;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 1) {
                iM3567q = SafeParcelReader.m3567q(i2, parcel);
            } else if (c != 2) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                bArrM3553c = SafeParcelReader.m3553c(i2, parcel);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzfyq(iM3567q, bArrM3553c);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzfyq[i2];
    }
}
