package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.KH */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3116KH extends AbstractRunnableC3871Wc {
    public final /* synthetic */ C3113KE A00;

    public C3116KH(C3113KE c3113ke) {
        this.A00 = c3113ke;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        if (!this.A00.A0Y) {
            AbstractC3966YB.A0F(1000, this.A00.A0K);
        }
        this.A00.postDelayed(this, 2000L);
    }
}
