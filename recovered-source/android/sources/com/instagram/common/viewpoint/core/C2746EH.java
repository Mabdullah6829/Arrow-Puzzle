package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.EH */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2746EH extends AbstractC3385Od {
    public final /* synthetic */ C2744EF A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2746EH(C2744EF c2744ef, double d, double d2, double d3, boolean z) {
        super(d, d2, d3, z);
        this.A00 = c2744ef;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3385Od
    public final void A00(boolean z, boolean z2, C3387Of c3387Of) {
        if ((!C3763Up.A0z(this.A00.A0D) || !this.A00.A09) && z2) {
            this.A00.A09 = true;
            this.A00.A0R(this.A00.A0J, this.A00.A0J(EnumC4372ek.A03));
        }
    }
}
