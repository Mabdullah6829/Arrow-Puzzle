package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Es */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2783Es extends AbstractRunnableC3871Wc {
    public final /* synthetic */ C2775Ek A00;

    public C2783Es(C2775Ek c2775Ek) {
        this.A00 = c2775Ek;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        if (!this.A00.A04) {
            C3734UM c3734um = this.A00.A0C;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            c3734um.A02(new AbstractC2740EB(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.4A
            });
            this.A00.A08.postDelayed(this, this.A00.A01);
        }
    }
}
