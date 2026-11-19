package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lz */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4812lz implements InterfaceC3071JY {
    public long A00 = -1;
    public long A01 = -1;
    public C2932HI A02;
    public C2933HJ A03;

    public C4812lz(C2933HJ c2933hj, C2932HI c2932hi) {
        this.A03 = c2933hj;
        this.A02 = c2932hi;
    }

    public final void A00(long j2) {
        this.A00 = j2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3071JY
    public final InterfaceC2948HY A5Z() {
        AbstractC21273y.A08(this.A00 != -1);
        return new C4852mp(this.A03, this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3071JY
    public final long AHN(InterfaceC4855ms interfaceC4855ms) {
        if (this.A01 < 0) {
            return -1L;
        }
        long result = -(this.A01 + 2);
        this.A01 = -1L;
        return result;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3071JY
    public final void AKC(long j2) {
        long[] jArr = this.A02.A01;
        this.A01 = jArr[AbstractC22035C.A0L(jArr, j2, true, true)];
    }
}
