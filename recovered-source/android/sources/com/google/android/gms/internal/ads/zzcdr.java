package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class
@SafeParcelable.Reserved
public final class zzcdr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcdr> CREATOR = new zzcds();

    /* JADX INFO: renamed from: s */
    public final String f9788s;

    /* JADX INFO: renamed from: t */
    public final String f9789t;

    /* JADX INFO: renamed from: u */
    public final boolean f9790u;

    /* JADX INFO: renamed from: v */
    public final boolean f9791v;

    /* JADX INFO: renamed from: w */
    public final List f9792w;

    /* JADX INFO: renamed from: x */
    public final boolean f9793x;

    /* JADX INFO: renamed from: y */
    public final boolean f9794y;

    /* JADX INFO: renamed from: z */
    public final List f9795z;

    public zzcdr(String str, String str2, boolean z, boolean z2, List list, boolean z3, boolean z4, List list2) {
        this.f9788s = str;
        this.f9789t = str2;
        this.f9790u = z;
        this.f9791v = z2;
        this.f9792w = list;
        this.f9793x = z3;
        this.f9794y = z4;
        this.f9795z = list2 == null ? new ArrayList() : list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 2, this.f9788s);
        SafeParcelWriter.m3583i(parcel, 3, this.f9789t);
        SafeParcelWriter.m3588n(parcel, 4, 4);
        parcel.writeInt(this.f9790u ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 5, 4);
        parcel.writeInt(this.f9791v ? 1 : 0);
        SafeParcelWriter.m3585k(parcel, 6, this.f9792w);
        SafeParcelWriter.m3588n(parcel, 7, 4);
        parcel.writeInt(this.f9793x ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 8, 4);
        parcel.writeInt(this.f9794y ? 1 : 0);
        SafeParcelWriter.m3585k(parcel, 9, this.f9795z);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
