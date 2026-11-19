package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mB */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4824mB implements InterfaceC3034Ix {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final C21864v A04;

    public C4824mB(C4826mD c4826mD) {
        this.A04 = c4826mD.A00;
        this.A04.A0f(12);
        this.A02 = this.A04.A0L() & 255;
        this.A03 = this.A04.A0L();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3034Ix
    public final int A8A() {
        return -1;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3034Ix
    public final int A8v() {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3034Ix
    public final int AHS() {
        if (this.A02 == 8) {
            return this.A04.A0I();
        }
        if (this.A02 == 16) {
            return this.A04.A0M();
        }
        int i2 = this.A01;
        this.A01 = i2 + 1;
        if (i2 % 2 == 0) {
            this.A00 = this.A04.A0I();
            return (this.A00 & 240) >> 4;
        }
        return this.A00 & 15;
    }
}
