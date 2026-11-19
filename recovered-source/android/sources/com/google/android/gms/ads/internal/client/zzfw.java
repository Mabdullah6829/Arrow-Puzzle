package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* JADX INFO: loaded from: classes.dex */
public final class zzfw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfw> CREATOR = new zzfx();

    /* JADX INFO: renamed from: s */
    public final boolean f3198s;

    /* JADX INFO: renamed from: t */
    public final boolean f3199t;

    /* JADX INFO: renamed from: u */
    public final boolean f3200u;

    public zzfw(VideoOptions videoOptions) {
        this(videoOptions.f2985a, videoOptions.f2986b, videoOptions.f2987c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM3589o = SafeParcelWriter.m3589o(20293, parcel);
        SafeParcelWriter.m3588n(parcel, 2, 4);
        parcel.writeInt(this.f3198s ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 3, 4);
        parcel.writeInt(this.f3199t ? 1 : 0);
        SafeParcelWriter.m3588n(parcel, 4, 4);
        parcel.writeInt(this.f3200u ? 1 : 0);
        SafeParcelWriter.m3590p(iM3589o, parcel);
    }

    public zzfw(boolean z, boolean z2, boolean z3) {
        this.f3198s = z;
        this.f3199t = z2;
        this.f3200u = z3;
    }
}
