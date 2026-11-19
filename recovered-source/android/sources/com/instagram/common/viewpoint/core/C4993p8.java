package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.p8 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4993p8 implements InterfaceC22255Y {
    public final InterfaceC22465t A00;

    public C4993p8() {
        this(null);
    }

    public C4993p8(InterfaceC22465t interfaceC22465t) {
        this.A00 = interfaceC22465t;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC22255Y
    public final InterfaceC5000pF A5I() {
        C19931j c19931j = new C19931j();
        if (this.A00 != null) {
            c19931j.A43(this.A00);
        }
        return c19931j;
    }
}
