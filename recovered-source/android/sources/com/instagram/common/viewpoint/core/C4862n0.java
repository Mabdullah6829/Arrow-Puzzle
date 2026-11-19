package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.n0 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4862n0 implements InterfaceC2948HY {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final InterfaceC2911Gx A06;

    public C4862n0(InterfaceC2911Gx interfaceC2911Gx, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.A06 = interfaceC2911Gx;
        this.A03 = j2;
        this.A05 = j3;
        this.A02 = j4;
        this.A04 = j5;
        this.A01 = j6;
        this.A00 = j7;
    }

    public final long A05(long j2) {
        return this.A06.AKQ(j2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final long A7t() {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final C2947HX A91(long j2) {
        return new C2947HX(new C2949HZ(j2, C2910Gw.A05(this.A06.AKQ(j2), this.A05, this.A02, this.A04, this.A01, this.A00)));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final boolean AAj() {
        return true;
    }
}
