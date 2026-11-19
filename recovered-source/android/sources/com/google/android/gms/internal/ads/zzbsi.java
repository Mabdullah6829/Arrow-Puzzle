package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
public final class zzbsi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbsi> CREATOR = new zzbsj();

    /* JADX INFO: renamed from: s */
    public final int f9315s;

    /* JADX INFO: renamed from: t */
    public final int f9316t;

    /* JADX INFO: renamed from: u */
    public final String f9317u;

    /* JADX INFO: renamed from: v */
    public final int f9318v;

    public zzbsi(int i2, int i3, int i4, String str) {
        this.f9315s = i2;
        this.f9316t = i3;
        this.f9317u = str;
        this.f9318v = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f9316t);
        SafeParcelWriter.m3583i(parcel, 2, this.f9317u);
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(this.f9318v);
        SafeParcelWriter.m3588n(parcel, 1000, 4);
        parcel.writeInt(this.f9315s);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
