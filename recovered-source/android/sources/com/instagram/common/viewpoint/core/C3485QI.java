package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.QI */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3485QI implements InterfaceC3946Xr {
    public int A00;
    public final InterfaceC3946Xr A01;

    public C3485QI(InterfaceC3946Xr interfaceC3946Xr, int i2) {
        this.A01 = interfaceC3946Xr;
        this.A00 = i2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3946Xr
    public final void AH8(String str) {
        if (this.A00 > 0) {
            this.A01.AH8(str);
            this.A00--;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3946Xr
    public final void flush() {
        this.A01.flush();
    }
}
