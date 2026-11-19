package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.f0 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4388f0 implements InterfaceC3689Tc {
    public final C3659T8 A00;

    public C4388f0(C3659T8 c3659t8) {
        this.A00 = c3659t8;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3689Tc
    public final void A4I(Throwable th) {
        C3684TX.A0E(th);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3689Tc
    public final void AA3(String str) {
        C3795VL.A08(this.A00, str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3689Tc
    public final void AA4(String str) {
        C3795VL.A09(this.A00, str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3689Tc
    public final void ABC(String str, int i2, C3691Te c3691Te) {
        C3684TX.A06(this.A00, str, i2, c3691Te);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3689Tc
    public final void ABD(String str, int i2, C3691Te c3691Te) {
        C3684TX.A06(this.A00, str, i2, c3691Te);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3689Tc
    public final void ABo(long j2, long j3, long j4, long j5, int i2, Exception exc) {
        AbstractC3695Ti.A03(this.A00, j2, j3, j4, j5, i2, exc);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3689Tc
    public final void ABz(String str, int i2, C3691Te c3691Te) {
        C3684TX.A07(this.A00, str, i2, c3691Te);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3689Tc
    public final void ACA(String str, int i2, C3691Te c3691Te) {
        C3684TX.A08(this.A00, str, i2, c3691Te);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3689Tc
    public final void ACP() {
        this.A00.A04().ACP();
    }
}
