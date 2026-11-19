package com.google.android.gms.ads.internal.util.client;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import p011H.AbstractC0271e0;

/* JADX INFO: loaded from: classes.dex */
public final class VersionInfoParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VersionInfoParcel> CREATOR = new zzy();

    /* JADX INFO: renamed from: s */
    public final String f3396s;

    /* JADX INFO: renamed from: t */
    public final int f3397t;

    /* JADX INFO: renamed from: u */
    public final int f3398u;

    /* JADX INFO: renamed from: v */
    public final boolean f3399v;

    /* JADX INFO: renamed from: w */
    public final boolean f3400w;

    public VersionInfoParcel(int i2, int i3, boolean z) {
        this(i2, i3, 0, z, false);
    }

    /* JADX INFO: renamed from: w */
    public static VersionInfoParcel m3031w() {
        return new VersionInfoParcel(12451000, 12451000, true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3583i(parcel, 2, this.f3396s);
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(this.f3397t);
        SafeParcelWriter.m3588n(parcel, 4, 4);
        parcel.writeInt(this.f3398u);
        SafeParcelWriter.m3588n(parcel, 5, 4);
        parcel.writeInt(this.f3399v ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 6, 4);
        parcel.writeInt(this.f3400w ? 1 : 0);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }

    public VersionInfoParcel(int i2, int i3, int i4, boolean z, boolean z2) {
        String str = z ? "0" : "1";
        StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + String.valueOf(i2).length() + 13 + 2);
        AbstractC1456a.m2455v(sb, "afma-sdk-a-v", i2, ".", i3);
        this(AbstractC0271e0.m403k(sb, ".", str), i2, i3, z, z2);
    }

    public VersionInfoParcel(String str, int i2, int i3, boolean z, boolean z2) {
        this.f3396s = str;
        this.f3397t = i2;
        this.f3398u = i3;
        this.f3399v = z;
        this.f3400w = z2;
    }
}
