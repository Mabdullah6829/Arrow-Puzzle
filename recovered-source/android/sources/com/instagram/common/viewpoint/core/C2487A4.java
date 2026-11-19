package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.A4 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2487A4 implements InterfaceC21143l {
    public final C24819y A00;
    public final C4942oJ A01;
    public final InterfaceC21133k[] A02;

    public C2487A4(InterfaceC21133k... interfaceC21133kArr) {
        this(interfaceC21133kArr, new C24819y(), new C4942oJ());
    }

    public C2487A4(InterfaceC21133k[] interfaceC21133kArr, C24819y c24819y, C4942oJ c4942oJ) {
        this.A02 = new InterfaceC21133k[interfaceC21133kArr.length + 2];
        System.arraycopy(interfaceC21133kArr, 0, this.A02, 0, interfaceC21133kArr.length);
        this.A00 = c24819y;
        this.A01 = c4942oJ;
        this.A02[interfaceC21133kArr.length] = c24819y;
        this.A02[interfaceC21133kArr.length + 1] = c4942oJ;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21143l
    public final C5043px A4F(C5043px c5043px) {
        this.A01.A02(c5043px.A01);
        this.A01.A01(c5043px.A00);
        return c5043px;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21143l
    public final boolean A4G(boolean z) {
        this.A00.A0D(z);
        return z;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21143l
    public final InterfaceC21133k[] A6z() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21143l
    public final long A8U(long j2) {
        return this.A01.A00(j2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC21143l
    public final long A98() {
        return this.A00.A0C();
    }
}
