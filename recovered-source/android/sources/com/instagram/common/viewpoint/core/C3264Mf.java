package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mf */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3264Mf {
    public final long A00;
    public final long A01;

    public C3264Mf(long j2, long j3) {
        this.A01 = j2;
        this.A00 = j3;
    }

    public final boolean A00(long j2, long j3) {
        if (this.A00 == -1) {
            return j2 >= this.A01;
        }
        return j3 != -1 && this.A01 <= j2 && j2 + j3 <= this.A01 + this.A00;
    }

    public final boolean A01(long j2, long j3) {
        if (this.A01 <= j2) {
            return this.A00 == -1 || this.A01 + this.A00 > j2;
        }
        return j3 == -1 || j2 + j3 > this.A01;
    }
}
