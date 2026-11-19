package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zac implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        ArrayList arrayListM3562l = null;
        String strM3558h = null;
        boolean zM3564n = false;
        String strM3558h2 = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 1) {
                arrayListM3562l = SafeParcelReader.m3562l(parcel, i2, Feature.CREATOR);
            } else if (c == 2) {
                zM3564n = SafeParcelReader.m3564n(i2, parcel);
            } else if (c == 3) {
                strM3558h2 = SafeParcelReader.m3558h(i2, parcel);
            } else if (c != 4) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                strM3558h = SafeParcelReader.m3558h(i2, parcel);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new ApiFeatureRequest(arrayListM3562l, zM3564n, strM3558h2, strM3558h);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new ApiFeatureRequest[i2];
    }
}
