package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new zzb();

    /* JADX INFO: renamed from: s */
    public final String f4036s;

    /* JADX INFO: renamed from: t */
    public final String f4037t;

    public zza(String str, String str2) {
        this.f4036s = str;
        this.f4037t = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 1, this.f4036s);
        SafeParcelWriter.m3583i(parcel, 2, this.f4037t);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
