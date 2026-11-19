package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zaw;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new zaj();

    /* JADX INFO: renamed from: s */
    public final int f23189s;

    /* JADX INFO: renamed from: t */
    public final zaw f23190t;

    public zai(int i2, zaw zawVar) {
        this.f23189s = i2;
        this.f23190t = zawVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f23189s);
        SafeParcelWriter.m3582h(parcel, 2, this.f23190t, i2);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
