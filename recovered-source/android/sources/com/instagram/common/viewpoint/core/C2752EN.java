package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.EN */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2752EN extends AbstractC3735UN<C2732E3> {
    public final /* synthetic */ C21504L A00;

    public C2752EN(C21504L c21504l) {
        this.A00 = c21504l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C2732E3 c2732e3) {
        if (!this.A00.A02) {
            this.A00.A02 = true;
        } else {
            this.A00.A0d();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
    public final Class<C2732E3> A01() {
        return C2732E3.class;
    }
}
