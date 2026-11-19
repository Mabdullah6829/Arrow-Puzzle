package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ky */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4749ky implements InterfaceC2948HY {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C3184LN A04;

    public C4749ky(C3184LN c3184ln, int i2, long j2, long j3) {
        this.A04 = c3184ln;
        this.A00 = i2;
        this.A03 = j2;
        this.A01 = (j3 - j2) / ((long) c3184ln.A02);
        this.A02 = A00(this.A01);
    }

    private long A00(long j2) {
        return AbstractC22035C.A0U(j2 * ((long) this.A00), 1000000L, this.A04.A04);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final long A7t() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final C2947HX A91(long j2) {
        long jA0T = AbstractC22035C.A0T((((long) this.A04.A04) * j2) / (((long) this.A00) * 1000000), 0L, this.A01 - 1);
        long j3 = this.A03 + (((long) this.A04.A02) * jA0T);
        long jA00 = A00(jA0T);
        C2949HZ c2949hz = new C2949HZ(jA00, j3);
        if (jA00 >= j2 || jA0T == this.A01 - 1) {
            return new C2947HX(c2949hz);
        }
        long j4 = 1 + jA0T;
        return new C2947HX(c2949hz, new C2949HZ(A00(j4), this.A03 + (((long) this.A04.A02) * j4)));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final boolean AAj() {
        return true;
    }
}
