package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbi implements Parcelable.Creator {
    public static void zza(zzbh zzbhVar, Parcel parcel, int i2) {
        String str = zzbhVar.zza;
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 2, str);
        SafeParcelWriter.m3582h(parcel, 3, zzbhVar.zzb, i2);
        SafeParcelWriter.m3583i(parcel, 4, zzbhVar.zzc);
        long j2 = zzbhVar.zzd;
        SafeParcelWriter.m3588n(parcel, 5, 8);
        parcel.writeLong(j2);
        long j3 = zzbhVar.zze;
        SafeParcelWriter.m3588n(parcel, 6, 8);
        parcel.writeLong(j3);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        long jM3568r = 0;
        long jM3568r2 = 0;
        String strM3558h = null;
        zzbf zzbfVar = null;
        String strM3558h2 = null;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            char c = (char) i2;
            if (c == 2) {
                strM3558h = SafeParcelReader.m3558h(i2, parcel);
            } else if (c == 3) {
                zzbfVar = (zzbf) SafeParcelReader.m3557g(parcel, i2, zzbf.CREATOR);
            } else if (c == 4) {
                strM3558h2 = SafeParcelReader.m3558h(i2, parcel);
            } else if (c == 5) {
                jM3568r = SafeParcelReader.m3568r(i2, parcel);
            } else if (c != 6) {
                SafeParcelReader.m3571u(i2, parcel);
            } else {
                jM3568r2 = SafeParcelReader.m3568r(i2, parcel);
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzbh(strM3558h, zzbfVar, strM3558h2, jM3568r, jM3568r2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzbh[i2];
    }
}
