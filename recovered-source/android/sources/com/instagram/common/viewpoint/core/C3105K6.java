package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.K6 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3105K6 extends AbstractRunnableC3871Wc {
    public final /* synthetic */ C3081Ji A00;
    public final /* synthetic */ boolean A01;

    public C3105K6(C3081Ji c3081Ji, boolean z) {
        this.A00 = c3081Ji;
        this.A01 = z;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        AbstractC3992Yb abstractC3992YbA0B = this.A00.A0b.A0B();
        if (abstractC3992YbA0B == null) {
            return;
        }
        abstractC3992YbA0B.setPageDetailsVisible((this.A01 || abstractC3992YbA0B.A0E()) ? false : true);
        abstractC3992YbA0B.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
