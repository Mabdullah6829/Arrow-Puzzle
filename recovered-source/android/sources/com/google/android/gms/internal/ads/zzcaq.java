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
public final class zzcaq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        Bundle bundleM3552b = null;
        com.google.android.gms.ads.internal.client.zzm zzmVar = null;
        com.google.android.gms.ads.internal.client.zzr zzrVar = null;
        String strM3558h = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String strM3558h2 = null;
        String strM3558h3 = null;
        String strM3558h4 = null;
        VersionInfoParcel versionInfoParcel = null;
        Bundle bundleM3552b2 = null;
        ArrayList arrayListM3560j = null;
        Bundle bundleM3552b3 = null;
        String strM3558h5 = null;
        String strM3558h6 = null;
        ArrayList arrayListM3560j2 = null;
        String strM3558h7 = null;
        zzbma zzbmaVar = null;
        ArrayList arrayListM3560j3 = null;
        String strM3558h8 = null;
        String strM3558h9 = null;
        String strM3558h10 = null;
        Bundle bundleM3552b4 = null;
        String strM3558h11 = null;
        com.google.android.gms.ads.internal.client.zzee zzeeVar = null;
        Bundle bundleM3552b5 = null;
        String strM3558h12 = null;
        String strM3558h13 = null;
        String strM3558h14 = null;
        ArrayList arrayListM3556f = null;
        String strM3558h15 = null;
        ArrayList arrayListM3560j4 = null;
        ArrayList arrayListM3560j5 = null;
        String strM3558h16 = null;
        zzbsi zzbsiVar = null;
        String strM3558h17 = null;
        Bundle bundleM3552b6 = null;
        int iM3567q = 0;
        int iM3567q2 = 0;
        boolean zM3564n = false;
        int iM3567q3 = 0;
        int iM3567q4 = 0;
        boolean zM3564n2 = false;
        int iM3567q5 = 0;
        int iM3567q6 = 0;
        boolean zM3564n3 = false;
        boolean zM3564n4 = false;
        int iM3567q7 = 0;
        boolean zM3564n5 = false;
        boolean zM3564n6 = false;
        int iM3567q8 = 0;
        boolean zM3564n7 = false;
        boolean zM3564n8 = false;
        boolean zM3564n9 = false;
        float fM3565o = 0.0f;
        float fM3565o2 = 0.0f;
        long jM3568r = 0;
        long jM3568r2 = 0;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            switch ((char) i2) {
                case 1:
                    iM3567q = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 2:
                    bundleM3552b = SafeParcelReader.m3552b(i2, parcel);
                    break;
                case 3:
                    zzmVar = (com.google.android.gms.ads.internal.client.zzm) SafeParcelReader.m3557g(parcel, i2, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                    break;
                case 4:
                    zzrVar = (com.google.android.gms.ads.internal.client.zzr) SafeParcelReader.m3557g(parcel, i2, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                    break;
                case 5:
                    strM3558h = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) SafeParcelReader.m3557g(parcel, i2, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) SafeParcelReader.m3557g(parcel, i2, PackageInfo.CREATOR);
                    break;
                case '\b':
                    strM3558h2 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '\t':
                    strM3558h3 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '\n':
                    strM3558h4 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 11:
                    versionInfoParcel = (VersionInfoParcel) SafeParcelReader.m3557g(parcel, i2, VersionInfoParcel.CREATOR);
                    break;
                case '\f':
                    bundleM3552b2 = SafeParcelReader.m3552b(i2, parcel);
                    break;
                case '\r':
                    iM3567q2 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 14:
                    arrayListM3560j = SafeParcelReader.m3560j(i2, parcel);
                    break;
                case 15:
                    bundleM3552b3 = SafeParcelReader.m3552b(i2, parcel);
                    break;
                case 16:
                    zM3564n = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case ' ':
                case '&':
                case '>':
                default:
                    SafeParcelReader.m3571u(i2, parcel);
                    break;
                case 18:
                    iM3567q3 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 19:
                    iM3567q4 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 20:
                    fM3565o = SafeParcelReader.m3565o(i2, parcel);
                    break;
                case 21:
                    strM3558h5 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 25:
                    jM3568r = SafeParcelReader.m3568r(i2, parcel);
                    break;
                case 26:
                    strM3558h6 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 27:
                    arrayListM3560j2 = SafeParcelReader.m3560j(i2, parcel);
                    break;
                case 28:
                    strM3558h7 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 29:
                    zzbmaVar = (zzbma) SafeParcelReader.m3557g(parcel, i2, zzbma.CREATOR);
                    break;
                case 30:
                    arrayListM3560j3 = SafeParcelReader.m3560j(i2, parcel);
                    break;
                case 31:
                    jM3568r2 = SafeParcelReader.m3568r(i2, parcel);
                    break;
                case '!':
                    strM3558h8 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '\"':
                    fM3565o2 = SafeParcelReader.m3565o(i2, parcel);
                    break;
                case '#':
                    iM3567q5 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case '$':
                    iM3567q6 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case '%':
                    zM3564n3 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case '\'':
                    strM3558h9 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '(':
                    zM3564n2 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case ')':
                    strM3558h10 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '*':
                    zM3564n4 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case '+':
                    iM3567q7 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case ',':
                    bundleM3552b4 = SafeParcelReader.m3552b(i2, parcel);
                    break;
                case '-':
                    strM3558h11 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '.':
                    zzeeVar = (com.google.android.gms.ads.internal.client.zzee) SafeParcelReader.m3557g(parcel, i2, com.google.android.gms.ads.internal.client.zzee.CREATOR);
                    break;
                case '/':
                    zM3564n5 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case '0':
                    bundleM3552b5 = SafeParcelReader.m3552b(i2, parcel);
                    break;
                case '1':
                    strM3558h12 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '2':
                    strM3558h13 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '3':
                    strM3558h14 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '4':
                    zM3564n6 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case '5':
                    arrayListM3556f = SafeParcelReader.m3556f(i2, parcel);
                    break;
                case '6':
                    strM3558h15 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '7':
                    arrayListM3560j4 = SafeParcelReader.m3560j(i2, parcel);
                    break;
                case '8':
                    iM3567q8 = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case '9':
                    zM3564n7 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case ':':
                    zM3564n8 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case ';':
                    zM3564n9 = SafeParcelReader.m3564n(i2, parcel);
                    break;
                case '<':
                    arrayListM3560j5 = SafeParcelReader.m3560j(i2, parcel);
                    break;
                case '=':
                    strM3558h16 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '?':
                    zzbsiVar = (zzbsi) SafeParcelReader.m3557g(parcel, i2, zzbsi.CREATOR);
                    break;
                case '@':
                    strM3558h17 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 'A':
                    bundleM3552b6 = SafeParcelReader.m3552b(i2, parcel);
                    break;
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzcap(iM3567q, bundleM3552b, zzmVar, zzrVar, strM3558h, applicationInfo, packageInfo, strM3558h2, strM3558h3, strM3558h4, versionInfoParcel, bundleM3552b2, iM3567q2, arrayListM3560j, bundleM3552b3, zM3564n, iM3567q3, iM3567q4, fM3565o, strM3558h5, jM3568r, strM3558h6, arrayListM3560j2, strM3558h7, zzbmaVar, arrayListM3560j3, jM3568r2, strM3558h8, fM3565o2, zM3564n2, iM3567q5, iM3567q6, zM3564n3, strM3558h9, strM3558h10, zM3564n4, iM3567q7, bundleM3552b4, strM3558h11, zzeeVar, zM3564n5, bundleM3552b5, strM3558h12, strM3558h13, strM3558h14, zM3564n6, arrayListM3556f, strM3558h15, arrayListM3560j4, iM3567q8, zM3564n7, zM3564n8, zM3564n9, arrayListM3560j5, strM3558h16, zzbsiVar, strM3558h17, bundleM3552b6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzcap[i2];
    }
}
