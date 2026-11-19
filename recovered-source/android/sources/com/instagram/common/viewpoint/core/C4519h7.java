package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.h7 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4519h7 extends AbstractRunnableC3858WP {
    public final /* synthetic */ C4518h6 A00;

    public C4519h7(C4518h6 c4518h6) {
        this.A00 = c4518h6;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3858WP
    public final void A01() {
        if (this.A00.A01.A01.A00() != null) {
            this.A00.A01.A01.A00().onAdsLoaded();
        }
    }
}
