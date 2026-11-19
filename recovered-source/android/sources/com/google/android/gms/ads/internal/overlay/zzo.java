package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: loaded from: classes.dex */
public final class zzo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        long jM3568r = 0;
        boolean zM3564n = false;
        int iM3567q = 0;
        int iM3567q2 = 0;
        boolean zM3564n2 = false;
        zzc zzcVar = null;
        IBinder iBinderM3566p = null;
        IBinder iBinderM3566p2 = null;
        IBinder iBinderM3566p3 = null;
        IBinder iBinderM3566p4 = null;
        String strM3558h = null;
        String strM3558h2 = null;
        IBinder iBinderM3566p5 = null;
        String strM3558h3 = null;
        VersionInfoParcel versionInfoParcel = null;
        String strM3558h4 = null;
        com.google.android.gms.ads.internal.zzl zzlVar = null;
        IBinder iBinderM3566p6 = null;
        String strM3558h5 = null;
        String strM3558h6 = null;
        String strM3558h7 = null;
        IBinder iBinderM3566p7 = null;
        IBinder iBinderM3566p8 = null;
        IBinder iBinderM3566p9 = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            switch ((char) i2) {
                case 2:
                    zzcVar = (zzc) SafeParcelReader.m3557g(parcel, i2, zzc.CREATOR);
                    break;
                case 3:
                    iBinderM3566p = SafeParcelReader.m3566p(i2, parcel);
                    break;
                case 4:
                    iBinderM3566p2 = SafeParcelReader.m3566p(i2, parcel);
                    break;
                case 5:
                    iBinderM3566p3 = SafeParcelReader.m3566p(i2, parcel);
                    break;
                case 6:
                    iBinderM3566p4 = SafeParcelReader.m3566p(i2, parcel);
                    break;
                case 7:
                    strM3558h = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '\b':
                    zM3564n = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case '\t':
                    strM3558h2 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '\n':
                    iBinderM3566p5 = SafeParcelReader.m3566p(i2, parcel);
                    break;
                case 11:
                    iM3567q = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case '\f':
                    iM3567q2 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case '\r':
                    strM3558h3 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 14:
                    versionInfoParcel = (VersionInfoParcel) SafeParcelReader.m3557g(parcel, i2, VersionInfoParcel.CREATOR);
                    break;
                case 15:
                case 20:
                case 21:
                case 22:
                case 23:
                default:
                    SafeParcelReader.m3571u(i2, parcel);
                    break;
                case 16:
                    strM3558h4 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 17:
                    zzlVar = (com.google.android.gms.ads.internal.zzl) SafeParcelReader.m3557g(parcel, i2, com.google.android.gms.ads.internal.zzl.CREATOR);
                    break;
                case 18:
                    iBinderM3566p6 = SafeParcelReader.m3566p(i2, parcel);
                    break;
                case 19:
                    strM3558h5 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 24:
                    strM3558h6 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 25:
                    strM3558h7 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 26:
                    iBinderM3566p7 = SafeParcelReader.m3566p(i2, parcel);
                    break;
                case 27:
                    iBinderM3566p8 = SafeParcelReader.m3566p(i2, parcel);
                    break;
                case 28:
                    iBinderM3566p9 = SafeParcelReader.m3566p(i2, parcel);
                    break;
                case 29:
                    zM3564n2 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 30:
                    jM3568r = SafeParcelReader.m3568r(i2, parcel);
                    break;
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new AdOverlayInfoParcel(zzcVar, iBinderM3566p, iBinderM3566p2, iBinderM3566p3, iBinderM3566p4, strM3558h, zM3564n, strM3558h2, iBinderM3566p5, iM3567q, iM3567q2, strM3558h3, versionInfoParcel, strM3558h4, zzlVar, iBinderM3566p6, strM3558h5, strM3558h6, strM3558h7, iBinderM3566p7, iBinderM3566p8, iBinderM3566p9, zM3564n2, jM3568r);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new AdOverlayInfoParcel[i2];
    }
}
