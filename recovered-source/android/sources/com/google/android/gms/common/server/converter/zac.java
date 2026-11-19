package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new zae();

    /* JADX INFO: renamed from: s */
    public final int f4586s;

    /* JADX INFO: renamed from: t */
    public final String f4587t;

    /* JADX INFO: renamed from: u */
    public final int f4588u;

    public zac(int i2, String str, int i3) {
        this.f4586s = i2;
        this.f4587t = str;
        this.f4588u = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4586s);
        SafeParcelWriter.m3583i(parcel, 2, this.f4587t);
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(this.f4588u);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }

    public zac(String str, int i2) {
        this.f4586s = 1;
        this.f4587t = str;
        this.f4588u = i2;
    }
}
