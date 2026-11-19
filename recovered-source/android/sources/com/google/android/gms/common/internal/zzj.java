package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();

    /* JADX INFO: renamed from: s */
    public Bundle f4530s;

    /* JADX INFO: renamed from: t */
    public Feature[] f4531t;

    /* JADX INFO: renamed from: u */
    public int f4532u;

    /* JADX INFO: renamed from: v */
    public ConnectionTelemetryConfiguration f4533v;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3575a(1, this.f4530s, parcel);
        SafeParcelWriter.m3586l(parcel, 2, this.f4531t, i2);
        int i3 = this.f4532u;
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(i3);
        SafeParcelWriter.m3582h(parcel, 4, this.f4533v, i2);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }
}
