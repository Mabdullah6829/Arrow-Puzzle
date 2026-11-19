package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcas implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        ArrayList arrayListM3560j = null;
        boolean zM3564n = false;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 2) {
                zM3564n = SafeParcelReader.m3564n(i2, parcel);
            } else if (c != 3) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                arrayListM3560j = SafeParcelReader.m3560j(i2, parcel);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzcar(arrayListM3560j, zM3564n);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzcar[i2];
    }
}
