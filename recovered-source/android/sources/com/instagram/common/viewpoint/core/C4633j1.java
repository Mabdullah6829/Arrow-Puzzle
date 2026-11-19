package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.j1 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4633j1 extends AbstractRunnableC3871Wc {
    public final /* synthetic */ AbstractC4632j0 A00;
    public final /* synthetic */ C3821Vm A01;

    public C4633j1(AbstractC4632j0 abstractC4632j0, C3821Vm c3821Vm) {
        this.A00 = abstractC4632j0;
        this.A01 = c3821Vm;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        this.A00.A0B.A0F().A5g(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A07 != null) {
            this.A00.A07.A0G(this.A01);
        }
    }
}
