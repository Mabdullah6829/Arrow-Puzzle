package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qe */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3507Qe extends AbstractRunnableC3871Wc {
    public final /* synthetic */ C3917XO A00;

    public C3507Qe(C3917XO c3917xo) {
        this.A00 = c3917xo;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        if (!this.A00.A05()) {
            return;
        }
        this.A00.A02();
        this.A00.A05.postDelayed(this, this.A00.A02);
    }
}
