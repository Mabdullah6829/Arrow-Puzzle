package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gl */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2899Gl implements InterfaceC3991Ya {
    public final /* synthetic */ AbstractC2897Gj A00;

    public C2899Gl(AbstractC2897Gj abstractC2897Gj) {
        this.A00 = abstractC2897Gj;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3991Ya
    public final void ACl(AbstractC3992Yb abstractC3992Yb) {
        if (abstractC3992Yb.getToolbarActionMode() == 8) {
            this.A00.A0g();
            return;
        }
        this.A00.A07.A04(EnumC3791VH.A07, null);
        if (this.A00.A0l()) {
            return;
        }
        this.A00.A05.A0F().AB0();
        this.A00.A0A.A4j(this.A00.A0B.A7w());
    }
}
