package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3c */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C21063c extends AbstractC2722Dt {
    public final /* synthetic */ C2710Dh A00;

    public C21063c(C2710Dh c2710Dh) {
        this.A00 = c2710Dh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C2723Du c2723Du) {
        if (this.A00.A01 == null || c2723Du.A00().getAction() != 0) {
            return;
        }
        this.A00.A04.removeCallbacksAndMessages(null);
        this.A00.A07(new C4395f7(this));
    }
}
