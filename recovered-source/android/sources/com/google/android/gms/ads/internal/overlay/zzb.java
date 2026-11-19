package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
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
        String strM3558h4 = null;
        String strM3558h5 = null;
        String strM3558h6 = null;
        String strM3558h7 = null;
        Intent intent = null;
        IBinder iBinderM3566p = null;
        Bundle bundleM3552b = null;
        boolean zM3564n = false;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            switch ((char) i2) {
                case 2:
                    strM3558h = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 3:
                    strM3558h2 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 4:
                    strM3558h3 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 5:
                    strM3558h4 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 6:
                    strM3558h5 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 7:
                    strM3558h6 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '\b':
                    strM3558h7 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '\t':
                    intent = (Intent) SafeParcelReader.m3557g(parcel, i2, Intent.CREATOR);
                    break;
                case '\n':
                    iBinderM3566p = SafeParcelReader.m3566p(i2, parcel);
                    break;
                case 11:
                    zM3564n = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case '\f':
                    bundleM3552b = SafeParcelReader.m3552b(i2, parcel);
                    break;
                default:
                    SafeParcelReader.m3571u(i2, parcel);
                    break;
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzc(strM3558h, strM3558h2, strM3558h3, strM3558h4, strM3558h5, strM3558h6, strM3558h7, intent, iBinderM3566p, zM3564n, bundleM3552b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzc[i2];
    }
}
