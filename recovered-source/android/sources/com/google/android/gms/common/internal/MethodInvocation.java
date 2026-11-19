package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new zaq();

    /* JADX INFO: renamed from: A */
    public final int f4446A;

    /* JADX INFO: renamed from: s */
    public final int f4447s;

    /* JADX INFO: renamed from: t */
    public final int f4448t;

    /* JADX INFO: renamed from: u */
    public final int f4449u;

    /* JADX INFO: renamed from: v */
    public final long f4450v;

    /* JADX INFO: renamed from: w */
    public final long f4451w;

    /* JADX INFO: renamed from: x */
    public final String f4452x;

    /* JADX INFO: renamed from: y */
    public final String f4453y;

    /* JADX INFO: renamed from: z */
    public final int f4454z;

    public MethodInvocation(int i2, int i3, int i4, long j2, long j3, String str, String str2, int i5, int i6) {
        this.f4447s = i2;
        this.f4448t = i3;
        this.f4449u = i4;
        this.f4450v = j2;
        this.f4451w = j3;
        this.f4452x = str;
        this.f4453y = str2;
        this.f4454z = i5;
        this.f4446A = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4447s);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f4448t);
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(this.f4449u);
        SafeParcelWriter.m3588n(parcel, 4, 8);
        parcel.writeLong(this.f4450v);
        SafeParcelWriter.m3588n(parcel, 5, 8);
        parcel.writeLong(this.f4451w);
        SafeParcelWriter.m3583i(parcel, 6, this.f4452x);
        SafeParcelWriter.m3583i(parcel, 7, this.f4453y);
        SafeParcelWriter.m3588n(parcel, 8, 4);
        parcel.writeInt(this.f4454z);
        SafeParcelWriter.m3588n(parcel, 9, 4);
        parcel.writeInt(this.f4446A);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
