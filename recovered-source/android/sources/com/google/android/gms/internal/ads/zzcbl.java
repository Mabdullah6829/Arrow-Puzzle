package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcbl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        Bundle bundleM3552b = null;
        VersionInfoParcel versionInfoParcel = null;
        ApplicationInfo applicationInfo = null;
        String strM3558h = null;
        ArrayList arrayListM3560j = null;
        PackageInfo packageInfo = null;
        String strM3558h2 = null;
        String strM3558h3 = null;
        zzfnc zzfncVar = null;
        String strM3558h4 = null;
        Bundle bundleM3552b2 = null;
        boolean zM3564n = false;
        boolean zM3564n2 = false;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            switch ((char) i2) {
                case 1:
                    bundleM3552b = SafeParcelReader.m3552b(i2, parcel);
                    break;
                case 2:
                    versionInfoParcel = (VersionInfoParcel) SafeParcelReader.m3557g(parcel, i2, VersionInfoParcel.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.m3557g(parcel, i2, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    strM3558h = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 5:
                    arrayListM3560j = SafeParcelReader.m3560j(i2, parcel);
                    break;
                case 6:
                    packageInfo = (PackageInfo) SafeParcelReader.m3557g(parcel, i2, PackageInfo.CREATOR);
                    break;
                case 7:
                    strM3558h2 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '\b':
                default:
                    SafeParcelReader.m3571u(i2, parcel);
                    break;
                case '\t':
                    strM3558h3 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '\n':
                    zzfncVar = (zzfnc) SafeParcelReader.m3557g(parcel, i2, zzfnc.CREATOR);
                    break;
                case 11:
                    strM3558h4 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '\f':
                    zM3564n = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case '\r':
                    zM3564n2 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 14:
                    bundleM3552b2 = SafeParcelReader.m3552b(i2, parcel);
                    break;
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzcbk(bundleM3552b, versionInfoParcel, applicationInfo, strM3558h, arrayListM3560j, packageInfo, strM3558h2, strM3558h3, zzfncVar, strM3558h4, zM3564n, zM3564n2, bundleM3552b2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzcbk[i2];
    }
}
