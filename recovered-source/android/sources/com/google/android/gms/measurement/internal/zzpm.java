package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpm implements Parcelable.Creator {
    public static void zza(zzpl zzplVar, Parcel parcel, int i2) {
        int i3 = zzplVar.zza;
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(i3);
        SafeParcelWriter.m3583i(parcel, 2, zzplVar.zzb);
        long j2 = zzplVar.zzc;
        SafeParcelWriter.m3588n(parcel, 3, 8);
        parcel.writeLong(j2);
        SafeParcelWriter.m3581g(parcel, 4, zzplVar.zzd);
        SafeParcelWriter.m3583i(parcel, 6, zzplVar.zze);
        SafeParcelWriter.m3583i(parcel, 7, zzplVar.zzf);
        Double d = zzplVar.zzg;
        if (d != null) {
            SafeParcelWriter.m3588n(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM3572v = SafeParcelReader.m3572v(parcel);
        String strM3558h = null;
        Long lM3569s = null;
        Float fValueOf = null;
        String strM3558h2 = null;
        String strM3558h3 = null;
        Double dValueOf = null;
        long jM3568r = 0;
        int iM3567q = 0;
        while (parcel.dataPosition() < iM3572v) {
            int i2 = parcel.readInt();
            switch ((char) i2) {
                case 1:
                    iM3567q = SafeParcelReader.m3567q(i2, parcel);
                    break;
                case 2:
                    strM3558h = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 3:
                    jM3568r = SafeParcelReader.m3568r(i2, parcel);
                    break;
                case 4:
                    lM3569s = SafeParcelReader.m3569s(i2, parcel);
                    break;
                case 5:
                    int iM3570t = SafeParcelReader.m3570t(i2, parcel);
                    if (iM3570t != 0) {
                        SafeParcelReader.m3574x(parcel, iM3570t, 4);
                        fValueOf = Float.valueOf(parcel.readFloat());
                    } else {
                        fValueOf = null;
                    }
                    break;
                case 6:
                    strM3558h2 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case 7:
                    strM3558h3 = SafeParcelReader.m3558h(i2, parcel);
                    break;
                case '\b':
                    int iM3570t2 = SafeParcelReader.m3570t(i2, parcel);
                    if (iM3570t2 != 0) {
                        SafeParcelReader.m3574x(parcel, iM3570t2, 8);
                        dValueOf = Double.valueOf(parcel.readDouble());
                    } else {
                        dValueOf = null;
                    }
                    break;
                default:
                    SafeParcelReader.m3571u(i2, parcel);
                    break;
            }
        }
        SafeParcelReader.m3563m(iM3572v, parcel);
        return new zzpl(iM3567q, strM3558h, jM3568r, lM3569s, fValueOf, strM3558h2, strM3558h3, dValueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i2) {
        return new zzpl[i2];
    }
}
