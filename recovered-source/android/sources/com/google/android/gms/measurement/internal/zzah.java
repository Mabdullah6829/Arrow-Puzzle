package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new zzai();

    @Nullable
    @SafeParcelable.Field
    public String zza;

    @SafeParcelable.Field
    public String zzb;

    @SafeParcelable.Field
    public zzpl zzc;

    @SafeParcelable.Field
    public long zzd;

    @SafeParcelable.Field
    public boolean zze;

    @Nullable
    @SafeParcelable.Field
    public String zzf;

    @Nullable
    @SafeParcelable.Field
    public final zzbh zzg;

    @SafeParcelable.Field
    public long zzh;

    @Nullable
    @SafeParcelable.Field
    public zzbh zzi;

    @SafeParcelable.Field
    public final long zzj;

    @Nullable
    @SafeParcelable.Field
    public final zzbh zzk;

    public zzah(zzah zzahVar) {
        Preconditions.m3544h(zzahVar);
        this.zza = zzahVar.zza;
        this.zzb = zzahVar.zzb;
        this.zzc = zzahVar.zzc;
        this.zzd = zzahVar.zzd;
        this.zze = zzahVar.zze;
        this.zzf = zzahVar.zzf;
        this.zzg = zzahVar.zzg;
        this.zzh = zzahVar.zzh;
        this.zzi = zzahVar.zzi;
        this.zzj = zzahVar.zzj;
        this.zzk = zzahVar.zzk;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 2, this.zza);
        SafeParcelWriter.m3583i(parcel, 3, this.zzb);
        SafeParcelWriter.m3582h(parcel, 4, this.zzc, i2);
        long j2 = this.zzd;
        SafeParcelWriter.m3588n(parcel, 5, 8);
        parcel.writeLong(j2);
        boolean z = this.zze;
        SafeParcelWriter.m3588n(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        SafeParcelWriter.m3583i(parcel, 7, this.zzf);
        SafeParcelWriter.m3582h(parcel, 8, this.zzg, i2);
        long j3 = this.zzh;
        SafeParcelWriter.m3588n(parcel, 9, 8);
        parcel.writeLong(j3);
        SafeParcelWriter.m3582h(parcel, 10, this.zzi, i2);
        long j4 = this.zzj;
        SafeParcelWriter.m3588n(parcel, 11, 8);
        parcel.writeLong(j4);
        SafeParcelWriter.m3582h(parcel, 12, this.zzk, i2);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }

    @SafeParcelable.Constructor
    public zzah(@Nullable @SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param zzpl zzplVar, @SafeParcelable.Param long j2, @SafeParcelable.Param boolean z, @Nullable @SafeParcelable.Param String str3, @Nullable @SafeParcelable.Param zzbh zzbhVar, @SafeParcelable.Param long j3, @Nullable @SafeParcelable.Param zzbh zzbhVar2, @SafeParcelable.Param long j4, @Nullable @SafeParcelable.Param zzbh zzbhVar3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzplVar;
        this.zzd = j2;
        this.zze = z;
        this.zzf = str3;
        this.zzg = zzbhVar;
        this.zzh = j3;
        this.zzi = zzbhVar2;
        this.zzj = j4;
        this.zzk = zzbhVar3;
    }
}
