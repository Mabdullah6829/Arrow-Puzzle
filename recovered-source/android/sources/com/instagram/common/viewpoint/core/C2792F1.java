package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.F1 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2792F1 extends AbstractRunnableC3871Wc {
    public final /* synthetic */ C2785Eu A00;

    public C2792F1(C2785Eu c2785Eu) {
        this.A00 = c2785Eu;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        this.A00.A03.A07();
        this.A00.A04.getEventBus().A04(this.A00.A06, this.A00.A05);
    }
}
