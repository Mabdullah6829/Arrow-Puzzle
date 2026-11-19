package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
public final class zzbrw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbrw> CREATOR = new zzbrx();

    /* JADX INFO: renamed from: s */
    public final String f9309s;

    /* JADX INFO: renamed from: t */
    public final boolean f9310t;

    /* JADX INFO: renamed from: u */
    public final int f9311u;

    /* JADX INFO: renamed from: v */
    public final String f9312v;

    public zzbrw(int i2, String str, String str2, boolean z) {
        this.f9309s = str;
        this.f9310t = z;
        this.f9311u = i2;
        this.f9312v = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 1, this.f9309s);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f9310t ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(this.f9311u);
        SafeParcelWriter.m3583i(parcel, 4, this.f9312v);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
