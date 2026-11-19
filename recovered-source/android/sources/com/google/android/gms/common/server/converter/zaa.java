package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new zab();

    /* JADX INFO: renamed from: s */
    public final int f4584s;

    /* JADX INFO: renamed from: t */
    public final StringToIntConverter f4585t;

    public zaa(int i2, StringToIntConverter stringToIntConverter) {
        this.f4584s = i2;
        this.f4585t = stringToIntConverter;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4584s);
        SafeParcelWriter.m3582h(parcel, 2, this.f4585t, i2);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }

    public zaa(StringToIntConverter stringToIntConverter) {
        this.f4584s = 1;
        this.f4585t = stringToIntConverter;
    }
}
