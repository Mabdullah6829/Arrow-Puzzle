package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8b */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C24148b implements InterfaceC4828mF {
    public long A00;
    public final long A01;
    public final C21724h A03 = new C21724h();
    public final C21724h A02 = new C21724h();

    public C24148b(long j2, long j3, long j4) {
        this.A00 = j2;
        this.A01 = j4;
        this.A03.A04(0L);
        this.A02.A04(j3);
    }

    public final void A00(long j2) {
        this.A00 = j2;
    }

    public final void A01(long j2, long j3) {
        if (A02(j2)) {
            return;
        }
        this.A03.A04(j2);
        this.A02.A04(j3);
    }

    public final boolean A02(long j2) {
        long lastIndexedTimeUs = this.A03.A03(this.A03.A02() - 1);
        return j2 - lastIndexedTimeUs < 100000;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4828mF
    public final long A7j() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final long A7t() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final C2947HX A91(long j2) {
        int iA0C = AbstractC22035C.A0C(this.A03, j2, true, true);
        C2949HZ c2949hz = new C2949HZ(this.A03.A03(iA0C), this.A02.A03(iA0C));
        if (c2949hz.A01 != j2) {
            int targetIndex = this.A03.A02();
            if (iA0C != targetIndex - 1) {
                int targetIndex2 = iA0C + 1;
                long jA03 = this.A03.A03(targetIndex2);
                int targetIndex3 = iA0C + 1;
                C2949HZ nextSeekPoint = new C2949HZ(jA03, this.A02.A03(targetIndex3));
                return new C2947HX(c2949hz, nextSeekPoint);
            }
        }
        return new C2947HX(c2949hz);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4828mF
    public final long A9H(long j2) {
        return this.A03.A03(AbstractC22035C.A0C(this.A02, j2, true, true));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final boolean AAj() {
        return true;
    }
}
