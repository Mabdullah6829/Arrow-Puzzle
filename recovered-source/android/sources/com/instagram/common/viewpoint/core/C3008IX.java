package com.instagram.common.viewpoint.core;

import android.os.Parcel;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.IX */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3008IX {
    public final int A00;
    public final long A01;
    public final long A02;

    public C3008IX(int i2, long j2, long j3) {
        this.A00 = i2;
        this.A02 = j2;
        this.A01 = j3;
    }

    public /* synthetic */ C3008IX(int i2, long j2, long j3, C3007IW c3007iw) {
        this(i2, j2, j3);
    }

    public static C3008IX A00(Parcel parcel) {
        return new C3008IX(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }

    public final void A01(Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
    }
}
