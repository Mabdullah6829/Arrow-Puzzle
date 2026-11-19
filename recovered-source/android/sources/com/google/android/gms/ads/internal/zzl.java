package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new zzm();

    /* JADX INFO: renamed from: A */
    public final boolean f3674A;

    /* JADX INFO: renamed from: s */
    public final boolean f3675s;

    /* JADX INFO: renamed from: t */
    public final boolean f3676t;

    /* JADX INFO: renamed from: u */
    public final String f3677u;

    /* JADX INFO: renamed from: v */
    public final boolean f3678v;

    /* JADX INFO: renamed from: w */
    public final float f3679w;

    /* JADX INFO: renamed from: x */
    public final int f3680x;

    /* JADX INFO: renamed from: y */
    public final boolean f3681y;

    /* JADX INFO: renamed from: z */
    public final boolean f3682z;

    public zzl(boolean z, boolean z2, String str, boolean z3, float f2, int i2, boolean z4, boolean z5, boolean z6) {
        this.f3675s = z;
        this.f3676t = z2;
        this.f3677u = str;
        this.f3678v = z3;
        this.f3679w = f2;
        this.f3680x = i2;
        this.f3681y = z4;
        this.f3682z = z5;
        this.f3674A = z6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f3675s ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(this.f3676t ? 1 : 0);
        SafeParcelWriter.m3583i(parcel, 4, this.f3677u);
        SafeParcelWriter.m3588n(parcel, 5, 4);
        parcel.writeInt(this.f3678v ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 6, 4);
        parcel.writeFloat(this.f3679w);
        SafeParcelWriter.m3588n(parcel, 7, 4);
        parcel.writeInt(this.f3680x);
        SafeParcelWriter.m3588n(parcel, 8, 4);
        parcel.writeInt(this.f3681y ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 9, 4);
        parcel.writeInt(this.f3682z ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 10, 4);
        parcel.writeInt(this.f3674A ? 1 : 0);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }

    public zzl(boolean z, boolean z2, boolean z3, float f2, boolean z4, boolean z5, boolean z6) {
        this(z, z2, null, z3, f2, -1, z4, z5, z6);
    }
}
