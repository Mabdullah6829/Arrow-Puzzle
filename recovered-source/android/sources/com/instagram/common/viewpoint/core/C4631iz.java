package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.iz */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4631iz extends AbstractRunnableC3871Wc {
    public final /* synthetic */ C4691jz A00;
    public final /* synthetic */ C3354O8 A01;
    public final /* synthetic */ C23607j A02;

    public C4631iz(C23607j c23607j, C3354O8 c3354o8, C4691jz c4691jz) {
        this.A02 = c23607j;
        this.A01 = c3354o8;
        this.A00 = c4691jz;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        C3821Vm c3821VmA00 = C3821Vm.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0F().A5g(c3821VmA00.A03().getErrorCode(), c3821VmA00.A04());
        this.A02.A07.A0G(c3821VmA00);
    }
}
