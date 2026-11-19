package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Sr */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3642Sr extends AbstractRunnableC3871Wc {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C3844WA A01;
    public final /* synthetic */ C3847WD A02;
    public final /* synthetic */ String A03;

    public C3642Sr(C3847WD c3847wd, String str, long j2, C3844WA c3844wa) {
        this.A02 = c3847wd;
        this.A03 = str;
        this.A00 = j2;
        this.A01 = c3844wa;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC3871Wc
    public final void A07() {
        this.A02.A0N(this.A03, this.A00, this.A01);
    }
}
