package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kq */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3151Kq extends AbstractRunnableC3871Wc {
    public final /* synthetic */ AbstractC4178bb A00;

    public C3151Kq(AbstractC4178bb abstractC4178bb) {
        this.A00 = abstractC4178bb;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        if (!this.A00.isPressed()) {
            this.A00.setPressed(true);
            this.A00.postOnAnimationDelayed(this.A00.A0A, 250L);
        } else {
            this.A00.postDelayed(this, this.A00.A08);
        }
    }
}
