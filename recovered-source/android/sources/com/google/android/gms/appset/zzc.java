package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new zzd();

    /* JADX INFO: renamed from: s */
    public final String f4038s;

    /* JADX INFO: renamed from: t */
    public final int f4039t;

    public zzc(String str, int i2) {
        this.f4038s = str;
        this.f4039t = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 1, this.f4038s);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f4039t);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
