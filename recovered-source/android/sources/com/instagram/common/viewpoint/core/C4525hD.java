package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4525hD implements InterfaceC3916XN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C4524hC A01;

    public C4525hD(C4524hC c4524hC, int i2) {
        this.A01 = c4524hC;
        this.A00 = i2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3916XN
    public final void ADS() {
        this.A01.A0C.A0F().ABa();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3916XN
    public final void AFV(float f2) {
        float f3 = 1.0f - (f2 / this.A00);
        if (this.A01.A0G != null) {
            this.A01.A0G.setProgressWithAnimation(100.0f * f3);
        }
    }
}
