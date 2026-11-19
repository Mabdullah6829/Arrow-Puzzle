package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public final class zaaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaaa> CREATOR = new zaab();

    /* JADX INFO: renamed from: s */
    public final int f4478s;

    /* JADX INFO: renamed from: t */
    public final int f4479t;

    /* JADX INFO: renamed from: u */
    public final int f4480u;

    /* JADX INFO: renamed from: v */
    public final Scope[] f4481v;

    public zaaa(int i2, int i3, int i4, Scope[] scopeArr) {
        this.f4478s = i2;
        this.f4479t = i3;
        this.f4480u = i4;
        this.f4481v = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4478s);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f4479t);
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(this.f4480u);
        SafeParcelWriter.m3586l(parcel, 4, this.f4481v, i2);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
