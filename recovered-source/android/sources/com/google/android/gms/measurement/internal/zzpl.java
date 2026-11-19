package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
public final class zzpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpl> CREATOR = new zzpm();

    @SafeParcelable.Field
    public final int zza;

    @SafeParcelable.Field
    public final String zzb;

    @SafeParcelable.Field
    public final long zzc;

    @Nullable
    @SafeParcelable.Field
    public final Long zzd;

    @Nullable
    @SafeParcelable.Field
    public final String zze;

    @SafeParcelable.Field
    public final String zzf;

    @Nullable
    @SafeParcelable.Field
    public final Double zzg;

    @SafeParcelable.Constructor
    public zzpl(@SafeParcelable.Param int i2, @SafeParcelable.Param String str, @SafeParcelable.Param long j2, @Nullable @SafeParcelable.Param Long l2, @SafeParcelable.Param Float f2, @Nullable @SafeParcelable.Param String str2, @SafeParcelable.Param String str3, @Nullable @SafeParcelable.Param Double d) {
        this.zza = i2;
        this.zzb = str;
        this.zzc = j2;
        this.zzd = l2;
        this.zzg = i2 == 1 ? f2 != null ? Double.valueOf(f2.doubleValue()) : null : d;
        this.zze = str2;
        this.zzf = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        zzpm.zza(this, parcel, i2);
    }

    @Nullable
    public final Object zza() {
        Long l2 = this.zzd;
        if (l2 != null) {
            return l2;
        }
        Double d = this.zzg;
        if (d != null) {
            return d;
        }
        String str = this.zze;
        if (str != null) {
            return str;
        }
        return null;
    }

    public zzpl(zzpn zzpnVar) {
        this(zzpnVar.zzc, zzpnVar.zzd, zzpnVar.zze, zzpnVar.zzb);
    }

    public zzpl(String str, long j2, @Nullable Object obj, String str2) {
        Preconditions.m3541e(str);
        this.zza = 2;
        this.zzb = str;
        this.zzc = j2;
        this.zzf = str2;
        if (obj == null) {
            this.zzd = null;
            this.zzg = null;
            this.zze = null;
            return;
        }
        if (obj instanceof Long) {
            this.zzd = (Long) obj;
            this.zzg = null;
            this.zze = null;
        } else if (obj instanceof String) {
            this.zzd = null;
            this.zzg = null;
            this.zze = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.zzd = null;
                this.zzg = (Double) obj;
                this.zze = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
