package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gw */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2910Gw {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public final long A05;
    public final long A06;
    public final long A07;

    public C2910Gw(long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.A06 = j2;
        this.A07 = j3;
        this.A03 = j4;
        this.A01 = j5;
        this.A02 = j6;
        this.A00 = j7;
        this.A05 = j8;
        this.A04 = A05(j3, j4, j5, j6, j7, j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A00() {
        return this.A00;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A01() {
        return this.A02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A02() {
        return this.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A03() {
        return this.A06;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A04() {
        return this.A07;
    }

    public static long A05(long j2, long j3, long j4, long bytesToSkip, long confidenceInterval, long j5) {
        if (bytesToSkip + 1 >= confidenceInterval || j3 + 1 >= j4) {
            return bytesToSkip;
        }
        long j6 = (long) ((j2 - j3) * ((confidenceInterval - bytesToSkip) / (j4 - j3)));
        return AbstractC22035C.A0T(((bytesToSkip + j6) - j5) - (j6 / 20), bytesToSkip, confidenceInterval - 1);
    }

    private void A0B() {
        this.A04 = A05(this.A07, this.A03, this.A01, this.A02, this.A00, this.A05);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C(long j2, long j3) {
        this.A01 = j2;
        this.A00 = j3;
        A0B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(long j2, long j3) {
        this.A03 = j2;
        this.A02 = j3;
        A0B();
    }
}
