package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.IU */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3005IU implements InterfaceC3916XN {
    public final /* synthetic */ C22195S A00;

    public C3005IU(C22195S c22195s) {
        this.A00 = c22195s;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3916XN
    public final void ADS() {
        this.A00.A0P.ADc(this.A00.A0F);
        this.A00.A0P.ADA();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3916XN
    public final void AFV(float f2) {
        int i2;
        float totalForce = (this.A00.A0F - f2) + (this.A00.A0d ? 0 : this.A00.A0S.getDuration());
        if (this.A00.A0d) {
            i2 = this.A00.A0F;
        } else {
            i2 = this.A00.A0E;
        }
        float seenTime = i2;
        this.A00.A0P.AKd(totalForce / seenTime);
    }
}
