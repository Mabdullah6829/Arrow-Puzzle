package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new zzl();

    /* JADX INFO: renamed from: s */
    public final RootTelemetryConfiguration f4418s;

    /* JADX INFO: renamed from: t */
    public final boolean f4419t;

    /* JADX INFO: renamed from: u */
    public final boolean f4420u;

    /* JADX INFO: renamed from: v */
    public final int[] f4421v;

    /* JADX INFO: renamed from: w */
    public final int f4422w;

    /* JADX INFO: renamed from: x */
    public final int[] f4423x;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z, boolean z2, int[] iArr, int i2, int[] iArr2) {
        this.f4418s = rootTelemetryConfiguration;
        this.f4419t = z;
        this.f4420u = z2;
        this.f4421v = iArr;
        this.f4422w = i2;
        this.f4423x = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3582h(parcel, 1, this.f4418s, i2);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f4419t ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(this.f4420u ? 1 : 0);
        SafeParcelWriter.m3579e(parcel, 4, this.f4421v);
        SafeParcelWriter.m3588n(parcel, 5, 4);
        parcel.writeInt(this.f4422w);
        SafeParcelWriter.m3579e(parcel, 6, this.f4423x);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
