package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.JO */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C3061JO {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final C5064qI A07;
    public final long[] A08;
    public final long[] A09;
    public final C3062JP[] A0A;

    public C3061JO(int i2, int i3, long j2, long j3, long j4, C5064qI c5064qI, int i4, C3062JP[] c3062jpArr, int i5, long[] jArr, long[] jArr2) {
        this.A00 = i2;
        this.A03 = i3;
        this.A06 = j2;
        this.A05 = j3;
        this.A04 = j4;
        this.A07 = c5064qI;
        this.A02 = i4;
        this.A0A = c3062jpArr;
        this.A01 = i5;
        this.A08 = jArr;
        this.A09 = jArr2;
    }

    public final C3062JP A00(int i2) {
        if (this.A0A == null) {
            return null;
        }
        return this.A0A[i2];
    }
}
