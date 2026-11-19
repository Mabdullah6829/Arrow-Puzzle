package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
public final class zzfyt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfyt> CREATOR = new zzfyu();

    /* JADX INFO: renamed from: s */
    public final int f16813s;

    /* JADX INFO: renamed from: t */
    public final String f16814t;

    /* JADX INFO: renamed from: u */
    public final String f16815u;

    public zzfyt(int i2, String str, String str2) {
        this.f16813s = i2;
        this.f16814t = str;
        this.f16815u = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f16813s);
        SafeParcelWriter.m3583i(parcel, 2, this.f16814t);
        SafeParcelWriter.m3583i(parcel, 3, this.f16815u);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
