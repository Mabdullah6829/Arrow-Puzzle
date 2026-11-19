package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.GE */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2866GE implements InterfaceC4324dx {
    public final /* synthetic */ C21604V A00;

    public C2866GE(C21604V c21604v) {
        this.A00 = c21604v;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4324dx
    public final void A9l() {
        if (this.A00.A02 instanceof C22706H) {
            ((C22706H) this.A00.A02).A1X();
            C3792VI.A02(EnumC3791VH.A0e, null, ((AbstractC2897Gj) this.A00).A03.A2E(), ((AbstractC2897Gj) this.A00).A05.A0A());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4324dx
    public final void AJz() {
        if (this.A00.A02 instanceof C22706H) {
            ((C22706H) this.A00.A02).A1b(this.A00.A0N);
            C3792VI.A02(EnumC3791VH.A0e, null, ((AbstractC2897Gj) this.A00).A03.A2E(), ((AbstractC2897Gj) this.A00).A05.A0A());
        }
        this.A00.A0n();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4324dx
    public final void AKE() {
        this.A00.A0e();
        if (this.A00.A02 instanceof C22706H) {
            ((C22706H) this.A00.A02).getAdDetailsView().setVisibility(8);
        }
    }
}
