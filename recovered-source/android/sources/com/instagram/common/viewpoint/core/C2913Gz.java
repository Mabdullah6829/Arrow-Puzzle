package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gz */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2913Gz {
    public static final C2913Gz A03 = new C2913Gz(-3, -9223372036854775807L, -1);
    public final int A00;
    public final long A01;
    public final long A02;

    public C2913Gz(int i2, long j2, long j3) {
        this.A00 = i2;
        this.A02 = j2;
        this.A01 = j3;
    }

    public static C2913Gz A03(long j2) {
        return new C2913Gz(0, -9223372036854775807L, j2);
    }

    public static C2913Gz A04(long j2, long j3) {
        return new C2913Gz(-1, j2, j3);
    }

    public static C2913Gz A05(long j2, long j3) {
        return new C2913Gz(-2, j2, j3);
    }
}
