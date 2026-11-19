package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.it */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4625it extends AbstractRunnableC3871Wc {
    public final /* synthetic */ C23737w A00;
    public final /* synthetic */ C3354O8 A01;
    public final /* synthetic */ C23517a A02;

    public C4625it(C23517a c23517a, C3354O8 c3354o8, C23737w c23737w) {
        this.A02 = c23517a;
        this.A01 = c3354o8;
        this.A00 = c23737w;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        AdErrorType adErrorType = AdErrorType.RV_AD_TIMEOUT;
        this.A02.A0B.A0F().A5g(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A02.A07.A0G(new C3821Vm(adErrorType, ""));
    }
}
