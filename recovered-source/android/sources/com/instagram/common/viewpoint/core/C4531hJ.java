package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hJ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4531hJ extends AbstractRunnableC3871Wc {
    public final /* synthetic */ C4530hI A00;
    public final /* synthetic */ C225562 A01;

    public C4531hJ(C4530hI c4530hI, C225562 c225562) {
        this.A00 = c4530hI;
        this.A01 = c225562;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        this.A01.setAdViewabilityChecker(this.A00.A02.A1G());
        this.A00.A02.A1o(true, true);
    }
}
