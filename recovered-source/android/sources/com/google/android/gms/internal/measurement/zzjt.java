package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        ArrayList arrayListM3562l = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            if (((char) i2) != 2) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                arrayListM3562l = SafeParcelReader.m3562l(parcel, i2, zzjq.CREATOR);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzjs(arrayListM3562l);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzjs[i2];
    }
}
