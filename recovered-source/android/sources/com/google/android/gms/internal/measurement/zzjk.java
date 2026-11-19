package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        byte[] bArrM3553c = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            if (((char) i2) != 2) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                bArrM3553c = SafeParcelReader.m3553c(i2, parcel);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzjj(bArrM3553c);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzjj[i2];
    }
}
