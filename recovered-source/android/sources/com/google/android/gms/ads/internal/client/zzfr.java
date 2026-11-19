package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public final class zzfr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfr> CREATOR = new zzfs();

    /* JADX INFO: renamed from: s */
    public final int f3194s;

    /* JADX INFO: renamed from: t */
    public final int f3195t;

    public zzfr(int i2, int i3) {
        this.f3194s = i2;
        this.f3195t = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f3194s);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f3195t);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
