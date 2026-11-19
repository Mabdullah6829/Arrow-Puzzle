package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.f4 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4392f4 extends AbstractRunnableC3871Wc {
    public final /* synthetic */ C4490ge A00;

    public C4392f4(C4490ge c4490ge) {
        this.A00 = c4490ge;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        for (C3685TY c3685ty : C3684TX.A02()) {
            C3684TX.A0A(this.A00, c3685ty.A02(), c3685ty.A00(), c3685ty.A01(), false);
        }
        C3684TX.A02().clear();
    }
}
