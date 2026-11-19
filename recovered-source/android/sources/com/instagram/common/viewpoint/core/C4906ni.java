package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ni */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4906ni implements InterfaceC2790Ez {
    public long A00;
    public long A01;
    public C4906ni A02;
    public C2789Ey A03;

    public C4906ni(long j2, int i2) {
        A02(j2, i2);
    }

    public final int A00(long j2) {
        return ((int) (j2 - this.A01)) + this.A03.A00;
    }

    public final C4906ni A01() {
        this.A03 = null;
        C4906ni c4906ni = this.A02;
        this.A02 = null;
        return c4906ni;
    }

    public final void A02(long j2, int i2) {
        AbstractC21273y.A08(this.A03 == null);
        this.A01 = j2;
        this.A00 = ((long) i2) + j2;
    }

    public final void A03(C2789Ey c2789Ey, C4906ni c4906ni) {
        this.A03 = c2789Ey;
        this.A02 = c4906ni;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2790Ez
    public final C2789Ey A6u() {
        return (C2789Ey) AbstractC21273y.A01(this.A03);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2790Ez
    public final C4906ni ACc() {
        if (this.A02 == null || this.A02.A03 == null) {
            return null;
        }
        return this.A02;
    }
}
