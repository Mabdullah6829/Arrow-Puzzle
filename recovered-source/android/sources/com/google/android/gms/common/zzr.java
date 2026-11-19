package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();

    /* JADX INFO: renamed from: s */
    public final boolean f4697s;

    /* JADX INFO: renamed from: t */
    public final String f4698t;

    /* JADX INFO: renamed from: u */
    public final int f4699u;

    /* JADX INFO: renamed from: v */
    public final int f4700v;

    /* JADX INFO: renamed from: w */
    public final long f4701w;

    public zzr(int i2, int i3, long j2, String str, boolean z) {
        this.f4697s = z;
        this.f4698t = str;
        this.f4699u = zzz.m3676a(i2) - 1;
        this.f4700v = zzc.m3667a(i3) - 1;
        this.f4701w = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4697s ? 1 : 0);
        SafeParcelWriter.m3583i(parcel, 2, this.f4698t);
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(this.f4699u);
        SafeParcelWriter.m3588n(parcel, 4, 4);
        parcel.writeInt(this.f4700v);
        SafeParcelWriter.m3588n(parcel, 5, 8);
        parcel.writeLong(this.f4701w);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
