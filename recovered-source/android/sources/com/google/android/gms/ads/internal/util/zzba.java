package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public final class zzba extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzba> CREATOR = new zzbb();

    /* JADX INFO: renamed from: s */
    public final String f3510s;

    /* JADX INFO: renamed from: t */
    public final int f3511t;

    public zzba(String str, int i2) {
        this.f3510s = str == null ? "" : str;
        this.f3511t = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 1, this.f3510s);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f3511t);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
