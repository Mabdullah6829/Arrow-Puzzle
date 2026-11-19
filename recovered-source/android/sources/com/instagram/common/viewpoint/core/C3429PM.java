package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.PM */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3429PM implements InterfaceC3916XN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC3426PJ A01;

    public C3429PM(AbstractC3426PJ abstractC3426PJ, int i2) {
        this.A01 = abstractC3426PJ;
        this.A00 = i2;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3916XN
    public final void ADS() {
        this.A01.A05 = false;
        this.A01.A0c();
        this.A01.A0H.setToolbarActionMode(this.A01.getCloseButtonStyle());
        if (this.A01.A09 && this.A01.A08 != null) {
            this.A01.A08.A06();
            this.A01.A0C.A4j(new C3239MG().A6l());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3916XN
    public final void AFV(float f2) {
        this.A01.A0H.setProgress(100.0f * (1.0f - (f2 / this.A00)));
    }
}
