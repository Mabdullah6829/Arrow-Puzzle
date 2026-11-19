package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new zak();

    /* JADX INFO: renamed from: s */
    public final int f4610s;

    /* JADX INFO: renamed from: t */
    public final String f4611t;

    /* JADX INFO: renamed from: u */
    public final FastJsonResponse.Field f4612u;

    public zam(int i2, String str, FastJsonResponse.Field field) {
        this.f4610s = i2;
        this.f4611t = str;
        this.f4612u = field;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4610s);
        SafeParcelWriter.m3583i(parcel, 2, this.f4611t);
        SafeParcelWriter.m3582h(parcel, 3, this.f4612u, i2);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }

    public zam(String str, FastJsonResponse.Field field) {
        this.f4610s = 1;
        this.f4611t = str;
        this.f4612u = field;
    }
}
