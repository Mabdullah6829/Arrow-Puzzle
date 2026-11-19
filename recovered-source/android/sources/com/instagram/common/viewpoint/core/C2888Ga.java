package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ga */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2888Ga extends AbstractRunnableC3871Wc {
    public final /* synthetic */ C21884x A00;

    public C2888Ga(C21884x c21884x) {
        this.A00 = c21884x;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        if (this.A00.A00 != null) {
            this.A00.A00.A1F();
        }
        this.A00.A09.setToolbarActionMode(this.A00.getCloseButtonStyle());
        this.A00.A09.A0A();
        this.A00.A06.set(true);
    }
}
