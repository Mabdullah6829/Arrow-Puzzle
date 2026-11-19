package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ep */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2780Ep extends AbstractRunnableC3871Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C2775Ek A02;

    public C2780Ep(C2775Ek c2775Ek, int i2, int i3) {
        this.A02 = c2775Ek;
        this.A00 = i2;
        this.A01 = i3;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        this.A02.A0C.A02(new C2727Dy(this.A00, this.A01));
    }
}
