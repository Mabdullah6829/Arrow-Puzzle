package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.h8 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4520h8 extends AbstractRunnableC3858WP {
    public final /* synthetic */ C4517h5 A00;
    public final /* synthetic */ C3821Vm A01;

    public C4520h8(C4517h5 c4517h5, C3821Vm c3821Vm) {
        this.A00 = c4517h5;
        this.A01 = c3821Vm;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3858WP
    public final void A01() {
        if (this.A00.A01.A00() != null) {
            this.A00.A01.A00().onAdError(AbstractC3907XE.A00(this.A01));
        }
    }
}
