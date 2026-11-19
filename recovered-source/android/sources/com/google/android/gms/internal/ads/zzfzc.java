package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
public final class zzfzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfzc> CREATOR = new zzfzd();

    /* JADX INFO: renamed from: s */
    public final int f16836s;

    /* JADX INFO: renamed from: t */
    public final int f16837t;

    /* JADX INFO: renamed from: u */
    public final String f16838u;

    /* JADX INFO: renamed from: v */
    public final String f16839v;

    /* JADX INFO: renamed from: w */
    public final int f16840w;

    public zzfzc(String str, int i2, String str2, int i3, int i4) {
        this.f16836s = i2;
        this.f16837t = i3;
        this.f16838u = str;
        this.f16839v = str2;
        this.f16840w = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f16836s);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f16837t);
        SafeParcelWriter.m3583i(parcel, 3, this.f16838u);
        SafeParcelWriter.m3583i(parcel, 4, this.f16839v);
        SafeParcelWriter.m3588n(parcel, 5, 4);
        parcel.writeInt(this.f16840w);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
