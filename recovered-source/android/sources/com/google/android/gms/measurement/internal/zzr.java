package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();

    @SafeParcelable.Field
    public final long zzA;

    @Nullable
    @SafeParcelable.Field
    public final String zzB;

    @SafeParcelable.Field
    public final String zzC;

    @SafeParcelable.Field
    public final long zzD;

    @SafeParcelable.Field
    public final int zzE;

    @SafeParcelable.Field
    public final long zzF;

    @Nullable
    @SafeParcelable.Field
    public final String zza;

    @Nullable
    @SafeParcelable.Field
    public final String zzb;

    @Nullable
    @SafeParcelable.Field
    public final String zzc;

    @Nullable
    @SafeParcelable.Field
    public final String zzd;

    @SafeParcelable.Field
    public final long zze;

    @SafeParcelable.Field
    public final long zzf;

    @Nullable
    @SafeParcelable.Field
    public final String zzg;

    @SafeParcelable.Field
    public final boolean zzh;

    @SafeParcelable.Field
    public final boolean zzi;

    @SafeParcelable.Field
    public final long zzj;

    @Nullable
    @SafeParcelable.Field
    public final String zzk;

    @SafeParcelable.Field
    public final long zzl;

    @SafeParcelable.Field
    public final int zzm;

    @SafeParcelable.Field
    public final boolean zzn;

    @SafeParcelable.Field
    public final boolean zzo;

    @Nullable
    @SafeParcelable.Field
    public final Boolean zzp;

    @SafeParcelable.Field
    public final long zzq;

    @Nullable
    @SafeParcelable.Field
    public final List zzr;

    @SafeParcelable.Field
    public final String zzs;

    @SafeParcelable.Field
    public final String zzt;

    @Nullable
    @SafeParcelable.Field
    public final String zzu;

    @SafeParcelable.Field
    public final boolean zzv;

    @SafeParcelable.Field
    public final long zzw;

    @SafeParcelable.Field
    public final int zzx;

    @SafeParcelable.Field
    public final String zzy;

    @SafeParcelable.Field
    public final int zzz;

    public zzr(@Nullable String str, @Nullable String str2, @Nullable String str3, long j2, @Nullable String str4, long j3, long j4, @Nullable String str5, boolean z, boolean z2, @Nullable String str6, long j5, int i2, boolean z3, boolean z4, @Nullable Boolean bool, long j6, @Nullable List list, String str7, String str8, @Nullable String str9, boolean z5, long j7, int i3, String str10, int i4, long j8, @Nullable String str11, String str12, long j9, int i5, long j10) {
        Preconditions.m3541e(str);
        this.zza = str;
        this.zzb = true == TextUtils.isEmpty(str2) ? null : str2;
        this.zzc = str3;
        this.zzj = j2;
        this.zzd = str4;
        this.zze = j3;
        this.zzf = j4;
        this.zzg = str5;
        this.zzh = z;
        this.zzi = z2;
        this.zzk = str6;
        this.zzl = j5;
        this.zzm = i2;
        this.zzn = z3;
        this.zzo = z4;
        this.zzp = bool;
        this.zzq = j6;
        this.zzr = list;
        this.zzs = str7;
        this.zzt = str8;
        this.zzu = str9;
        this.zzv = z5;
        this.zzw = j7;
        this.zzx = i3;
        this.zzy = str10;
        this.zzz = i4;
        this.zzA = j8;
        this.zzB = str11;
        this.zzC = str12;
        this.zzD = j9;
        this.zzE = i5;
        this.zzF = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        String str = this.zza;
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 2, str);
        SafeParcelWriter.m3583i(parcel, 3, this.zzb);
        SafeParcelWriter.m3583i(parcel, 4, this.zzc);
        SafeParcelWriter.m3583i(parcel, 5, this.zzd);
        long j2 = this.zze;
        SafeParcelWriter.m3588n(parcel, 6, 8);
        parcel.writeLong(j2);
        long j3 = this.zzf;
        SafeParcelWriter.m3588n(parcel, 7, 8);
        parcel.writeLong(j3);
        SafeParcelWriter.m3583i(parcel, 8, this.zzg);
        boolean z = this.zzh;
        SafeParcelWriter.m3588n(parcel, 9, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.zzi;
        SafeParcelWriter.m3588n(parcel, 10, 4);
        parcel.writeInt(z2 ? 1 : 0);
        long j4 = this.zzj;
        SafeParcelWriter.m3588n(parcel, 11, 8);
        parcel.writeLong(j4);
        SafeParcelWriter.m3583i(parcel, 12, this.zzk);
        long j5 = this.zzl;
        SafeParcelWriter.m3588n(parcel, 14, 8);
        parcel.writeLong(j5);
        int i3 = this.zzm;
        SafeParcelWriter.m3588n(parcel, 15, 4);
        parcel.writeInt(i3);
        boolean z3 = this.zzn;
        SafeParcelWriter.m3588n(parcel, 16, 4);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = this.zzo;
        SafeParcelWriter.m3588n(parcel, 18, 4);
        parcel.writeInt(z4 ? 1 : 0);
        Boolean bool = this.zzp;
        if (bool != null) {
            SafeParcelWriter.m3588n(parcel, 21, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        long j6 = this.zzq;
        SafeParcelWriter.m3588n(parcel, 22, 8);
        parcel.writeLong(j6);
        SafeParcelWriter.m3585k(parcel, 23, this.zzr);
        SafeParcelWriter.m3583i(parcel, 25, this.zzs);
        SafeParcelWriter.m3583i(parcel, 26, this.zzt);
        SafeParcelWriter.m3583i(parcel, 27, this.zzu);
        boolean z5 = this.zzv;
        SafeParcelWriter.m3588n(parcel, 28, 4);
        parcel.writeInt(z5 ? 1 : 0);
        long j7 = this.zzw;
        SafeParcelWriter.m3588n(parcel, 29, 8);
        parcel.writeLong(j7);
        int i4 = this.zzx;
        SafeParcelWriter.m3588n(parcel, 30, 4);
        parcel.writeInt(i4);
        SafeParcelWriter.m3583i(parcel, 31, this.zzy);
        int i5 = this.zzz;
        SafeParcelWriter.m3588n(parcel, 32, 4);
        parcel.writeInt(i5);
        long j8 = this.zzA;
        SafeParcelWriter.m3588n(parcel, 34, 8);
        parcel.writeLong(j8);
        SafeParcelWriter.m3583i(parcel, 35, this.zzB);
        SafeParcelWriter.m3583i(parcel, 36, this.zzC);
        long j9 = this.zzD;
        SafeParcelWriter.m3588n(parcel, 37, 8);
        parcel.writeLong(j9);
        int i6 = this.zzE;
        SafeParcelWriter.m3588n(parcel, 38, 4);
        parcel.writeInt(i6);
        long j10 = this.zzF;
        SafeParcelWriter.m3588n(parcel, 39, 8);
        parcel.writeLong(j10);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }

    @SafeParcelable.Constructor
    public zzr(@Nullable @SafeParcelable.Param String str, @Nullable @SafeParcelable.Param String str2, @Nullable @SafeParcelable.Param String str3, @Nullable @SafeParcelable.Param String str4, @SafeParcelable.Param long j2, @SafeParcelable.Param long j3, @Nullable @SafeParcelable.Param String str5, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param long j4, @Nullable @SafeParcelable.Param String str6, @SafeParcelable.Param long j5, @SafeParcelable.Param int i2, @SafeParcelable.Param boolean z3, @SafeParcelable.Param boolean z4, @Nullable @SafeParcelable.Param Boolean bool, @SafeParcelable.Param long j6, @Nullable @SafeParcelable.Param List list, @SafeParcelable.Param String str7, @SafeParcelable.Param String str8, @SafeParcelable.Param String str9, @SafeParcelable.Param boolean z5, @SafeParcelable.Param long j7, @SafeParcelable.Param int i3, @SafeParcelable.Param String str10, @SafeParcelable.Param int i4, @SafeParcelable.Param long j8, @Nullable @SafeParcelable.Param String str11, @SafeParcelable.Param String str12, @SafeParcelable.Param long j9, @SafeParcelable.Param int i5, @SafeParcelable.Param long j10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzj = j4;
        this.zzd = str4;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = str5;
        this.zzh = z;
        this.zzi = z2;
        this.zzk = str6;
        this.zzl = j5;
        this.zzm = i2;
        this.zzn = z3;
        this.zzo = z4;
        this.zzp = bool;
        this.zzq = j6;
        this.zzr = list;
        this.zzs = str7;
        this.zzt = str8;
        this.zzu = str9;
        this.zzv = z5;
        this.zzw = j7;
        this.zzx = i3;
        this.zzy = str10;
        this.zzz = i4;
        this.zzA = j8;
        this.zzB = str11;
        this.zzC = str12;
        this.zzD = j9;
        this.zzE = i5;
        this.zzF = j10;
    }
}
