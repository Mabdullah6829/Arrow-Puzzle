package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kV */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4722kV implements InterfaceC22225V {
    public InterfaceC3248MP A02;
    public long A01 = 5242880;
    public int A00 = 20480;

    public final C4722kV A00(InterfaceC3248MP interfaceC3248MP) {
        this.A02 = interfaceC3248MP;
        return this;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC22225V
    public final C4721kU A5H() {
        return new C4721kU((InterfaceC3248MP) AbstractC21273y.A01(this.A02), this.A01, this.A00);
    }
}
