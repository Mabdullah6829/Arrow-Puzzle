package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new zzq();

    /* JADX INFO: renamed from: s */
    public final String f4690s;

    /* JADX INFO: renamed from: t */
    public final boolean f4691t;

    /* JADX INFO: renamed from: u */
    public final boolean f4692u;

    /* JADX INFO: renamed from: v */
    public final Context f4693v;

    /* JADX INFO: renamed from: w */
    public final boolean f4694w;

    /* JADX INFO: renamed from: x */
    public final boolean f4695x;

    /* JADX INFO: renamed from: y */
    public final boolean f4696y;

    public zzp(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4, boolean z5) {
        this.f4690s = str;
        this.f4691t = z;
        this.f4692u = z2;
        this.f4693v = (Context) ObjectWrapper.m3697u0(IObjectWrapper.Stub.m3696k0(iBinder));
        this.f4694w = z3;
        this.f4695x = z4;
        this.f4696y = z5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 1, this.f4690s);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f4691t ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(this.f4692u ? 1 : 0);
        SafeParcelWriter.m3578d(parcel, 4, new ObjectWrapper(this.f4693v));
        SafeParcelWriter.m3588n(parcel, 5, 4);
        parcel.writeInt(this.f4694w ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 6, 4);
        parcel.writeInt(this.f4695x ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 8, 4);
        parcel.writeInt(this.f4696y ? 1 : 0);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
