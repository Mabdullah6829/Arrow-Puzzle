package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.k3 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4695k3 extends AbstractRunnableC3871Wc {
    public final /* synthetic */ C4694k2 A00;
    public final /* synthetic */ C225562 A01;

    public C4695k3(C4694k2 c4694k2, C225562 c225562) {
        this.A00 = c4694k2;
        this.A01 = c225562;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        this.A00.A00.A0A();
        if (this.A00.A00.A0B != null) {
            this.A01.setAdViewabilityChecker(this.A00.A00.A0B);
            this.A00.A00.A0B.A0U();
        }
    }
}
