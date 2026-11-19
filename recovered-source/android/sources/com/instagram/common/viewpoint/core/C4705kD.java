package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.kD */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4705kD extends AbstractRunnableC3871Wc {
    public final /* synthetic */ C3292N8 A00;

    public C4705kD(C3292N8 c3292n8) {
        this.A00 = c3292n8;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        this.A00.A07();
        this.A00.A02.A06();
        this.A00.A05.countDown();
    }
}
