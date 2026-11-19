package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.QL */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3488QL implements InterfaceC3946Xr {
    public int A00;
    public final InterfaceC3946Xr A01;
    public final InterfaceC3946Xr A02;

    public C3488QL(InterfaceC3946Xr interfaceC3946Xr, int i2, InterfaceC3946Xr interfaceC3946Xr2) {
        this.A01 = interfaceC3946Xr;
        this.A00 = i2;
        this.A02 = interfaceC3946Xr2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3946Xr
    public final void AH8(String str) {
        if (this.A00 > 0) {
            this.A01.AH8(str);
            this.A01.flush();
            this.A00--;
            return;
        }
        this.A02.AH8(str);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3946Xr
    public final void flush() {
        this.A02.flush();
    }
}
