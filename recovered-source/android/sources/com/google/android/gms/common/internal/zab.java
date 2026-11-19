package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public final class zab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zab> CREATOR = new zac();

    /* JADX INFO: renamed from: s */
    public final int f4483s;

    /* JADX INFO: renamed from: t */
    public final String f4484t;

    /* JADX INFO: renamed from: u */
    public final long f4485u;

    /* JADX INFO: renamed from: v */
    public final int f4486v;

    /* JADX INFO: renamed from: w */
    public final boolean f4487w;

    public zab(int i2, int i3, long j2, String str, boolean z) {
        this.f4483s = i2;
        this.f4484t = str;
        this.f4485u = j2;
        this.f4486v = i3;
        this.f4487w = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4483s);
        SafeParcelWriter.m3583i(parcel, 2, this.f4484t);
        SafeParcelWriter.m3588n(parcel, 3, 8);
        parcel.writeLong(this.f4485u);
        SafeParcelWriter.m3588n(parcel, 4, 4);
        parcel.writeInt(this.f4486v);
        SafeParcelWriter.m3588n(parcel, 5, 4);
        parcel.writeInt(this.f4487w ? 1 : 0);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
