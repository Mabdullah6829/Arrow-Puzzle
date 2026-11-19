package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.LQ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3187LQ extends AbstractRunnableC3871Wc {
    public final /* synthetic */ C4147b6 A00;

    public C3187LQ(C4147b6 c4147b6) {
        this.A00 = c4147b6;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        this.A00.A03();
        if (!this.A00.A08) {
            return;
        }
        this.A00.A0D.postDelayed(this.A00.A0F, 250L);
    }
}
