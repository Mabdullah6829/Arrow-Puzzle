package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        IBinder iBinderM3566p = null;
        boolean zM3564n = false;
        IBinder iBinderM3566p2 = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 1) {
                zM3564n = SafeParcelReader.m3564n(i2, parcel);
            } else if (c == 2) {
                iBinderM3566p = SafeParcelReader.m3566p(i2, parcel);
            } else if (c != 3) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                iBinderM3566p2 = SafeParcelReader.m3566p(i2, parcel);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new PublisherAdViewOptions(zM3564n, iBinderM3566p, iBinderM3566p2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new PublisherAdViewOptions[i2];
    }
}
