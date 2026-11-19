package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.H0 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2914H0 implements InterfaceC3916XN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractRunnableC3871Wc A01;
    public final /* synthetic */ AbstractC2897Gj A02;
    public final /* synthetic */ C2702DZ A03;

    public C2914H0(AbstractC2897Gj abstractC2897Gj, int i2, C2702DZ c2702dz, AbstractRunnableC3871Wc abstractRunnableC3871Wc) {
        this.A02 = abstractC2897Gj;
        this.A00 = i2;
        this.A03 = c2702dz;
        this.A01 = abstractRunnableC3871Wc;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3916XN
    public final void ADS() throws Throwable {
        this.A01.run();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3916XN
    public final void AFV(float f2) {
        this.A02.A09.setProgress(100.0f * (1.0f - (f2 / this.A00)));
        if (this.A03 != null) {
            C2702DZ c2702dz = this.A03;
            float percentage = this.A00;
            c2702dz.A07((int) ((percentage - f2) * 1000.0f));
        }
    }
}
