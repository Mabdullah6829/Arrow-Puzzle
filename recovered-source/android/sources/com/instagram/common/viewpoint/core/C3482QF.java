package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.QF */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3482QF implements InterfaceC3946Xr {
    public final C3945Xq A00;
    public final InterfaceC3946Xr A01;

    public C3482QF(InterfaceC3946Xr interfaceC3946Xr, int i2, int i3) {
        this.A01 = interfaceC3946Xr;
        this.A00 = new C3945Xq(i2, i3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3946Xr
    public final void AH8(String str) {
        this.A00.A04(str);
        if (this.A00.A02() != null && AbstractC3948Xt.A08(this.A00)) {
            this.A01.AH8(this.A00.A02());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3946Xr
    public final void flush() {
        this.A00.A03();
        while (this.A00.A02() != null) {
            if (AbstractC3948Xt.A08(this.A00)) {
                this.A01.AH8(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
