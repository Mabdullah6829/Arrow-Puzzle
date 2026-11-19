package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.KV */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3130KV implements InterfaceC3916XN {
    public final /* synthetic */ C22706H A00;

    public C3130KV(C22706H c22706h) {
        this.A00 = c22706h;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3916XN
    public final void ADS() {
        this.A00.A0B = false;
        if (this.A00.A05 != null) {
            this.A00.A05.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3916XN
    public final void AFV(float f2) {
        if (this.A00.A05 != null) {
            this.A00.A05.setProgressImmediate(100.0f * (1.0f - (f2 / this.A00.getAdInfo().A0K().A00())));
        }
    }
}
