package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kl */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3146Kl extends AbstractRunnableC3871Wc {
    public final /* synthetic */ AbstractC4178bb A00;

    public C3146Kl(AbstractC4178bb abstractC4178bb) {
        this.A00 = abstractC4178bb;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        this.A00.setPressed(false);
        this.A00.postOnAnimationDelayed(this.A00.A09, this.A00.A08);
    }
}
