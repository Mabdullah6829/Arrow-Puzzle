package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tt */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3706Tt extends AbstractRunnableC3858WP {
    public final /* synthetic */ C23136y A00;
    public final /* synthetic */ C3821Vm A01;

    public C3706Tt(C23136y c23136y, C3821Vm c3821Vm) {
        this.A00 = c23136y;
        this.A01 = c3821Vm;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3858WP
    public final void A01() {
        this.A00.A01.onError(this.A00.A00, AbstractC3907XE.A00(this.A01));
    }
}
