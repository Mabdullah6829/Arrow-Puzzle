package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mn */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4850mn implements InterfaceC2948HY {
    public final long A00;
    public final C2947HX A01;

    public C4850mn(long j2) {
        this(j2, 0L);
    }

    public C4850mn(long j2, long j3) {
        this.A00 = j2;
        this.A01 = new C2947HX(j3 == 0 ? C2949HZ.A04 : new C2949HZ(0L, j3));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final long A7t() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final C2947HX A91(long j2) {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2948HY
    public final boolean AAj() {
        return false;
    }
}
