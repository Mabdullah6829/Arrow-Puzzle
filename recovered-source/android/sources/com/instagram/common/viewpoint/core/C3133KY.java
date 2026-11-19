package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.KY */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3133KY implements InterfaceC3916XN {
    public final /* synthetic */ C22736K A00;

    public C3133KY(C22736K c22736k) {
        this.A00 = c22736k;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3916XN
    public final void ADS() {
        this.A00.A02 = false;
        if (this.A00.A07 != null) {
            this.A00.A07.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3916XN
    public final void AFV(float f2) {
        if (this.A00.A07 != null) {
            this.A00.A07.setProgressImmediate(100.0f * (1.0f - (f2 / this.A00.getAdInfo().A0K().A00())));
        }
    }
}
