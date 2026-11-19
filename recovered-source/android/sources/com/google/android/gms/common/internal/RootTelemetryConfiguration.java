package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new zzag();

    /* JADX INFO: renamed from: s */
    public final int f4460s;

    /* JADX INFO: renamed from: t */
    public final boolean f4461t;

    /* JADX INFO: renamed from: u */
    public final boolean f4462u;

    /* JADX INFO: renamed from: v */
    public final int f4463v;

    /* JADX INFO: renamed from: w */
    public final int f4464w;

    public RootTelemetryConfiguration(int i2, int i3, int i4, boolean z, boolean z2) {
        this.f4460s = i2;
        this.f4461t = z;
        this.f4462u = z2;
        this.f4463v = i3;
        this.f4464w = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 1, 4);
        parcel.writeInt(this.f4460s);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f4461t ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(this.f4462u ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 4, 4);
        parcel.writeInt(this.f4463v);
        SafeParcelWriter.m3588n(parcel, 5, 4);
        parcel.writeInt(this.f4464w);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
