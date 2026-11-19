package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ET */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2758ET extends AbstractRunnableC3871Wc {
    public final /* synthetic */ C21504L A00;

    public C2758ET(C21504L c21504l) {
        this.A00 = c21504l;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        this.A00.A0C.getEventBus().A04(this.A00.A0E, this.A00.A06, this.A00.A08, this.A00.A05, this.A00.A04, this.A00.A03, this.A00.A07, this.A00.A0A, this.A00.A0B, this.A00.A0D, this.A00.A09);
        if (this.A00.A01 != null) {
            this.A00.A01.A07();
        }
    }
}
