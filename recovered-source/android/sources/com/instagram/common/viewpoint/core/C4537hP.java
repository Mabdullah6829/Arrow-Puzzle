package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hP */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4537hP extends AbstractRunnableC3858WP {
    public final /* synthetic */ C4534hM A00;

    public C4537hP(C4534hM c4534hM) {
        this.A00 = c4534hM;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3858WP
    public final void A01() {
        if (this.A00.A01.A06() != null) {
            this.A00.A01.A06().onAdLoaded(this.A00.A01.A07());
        }
    }
}
