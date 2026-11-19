package com.instagram.common.viewpoint.core;

import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lF */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4766lF implements InterfaceC3169L8 {
    public C5064qI A00;
    public C219453 A01;
    public InterfaceC2953Hd A02;

    public C4766lF(String str) {
        this.A00 = new C20592p().A11(str).A14();
    }

    @EnsuresNonNull({"timestampAdjuster", "output"})
    private void A00() {
        AbstractC21273y.A02(this.A01);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3169L8
    public final void A5A(C21864v c21864v) {
        A00();
        long jA03 = this.A01.A03();
        long jA04 = this.A01.A04();
        if (jA03 == -9223372036854775807L || jA04 == -9223372036854775807L) {
            return;
        }
        if (jA04 != this.A00.A0M) {
            this.A00 = this.A00.A07().A0s(jA04).A14();
            this.A02.A6e(this.A00);
        }
        int iA07 = c21864v.A07();
        this.A02.AIr(c21864v, iA07);
        this.A02.AIu(jA03, 1, iA07, 0, null);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3169L8
    public final void AAA(C219453 c219453, InterfaceC2924HA interfaceC2924HA, C3177LG c3177lg) {
        this.A01 = c219453;
        c3177lg.A05();
        this.A02 = interfaceC2924HA.AKS(c3177lg.A03(), 5);
        this.A02.A6e(this.A00);
    }
}
