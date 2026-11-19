package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jt */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3092Jt implements InterfaceC4171bU {
    public final /* synthetic */ C3081Ji A00;

    public C3092Jt(C3081Ji c3081Ji) {
        this.A00 = c3081Ji;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4171bU
    public final void ADY() {
        this.A00.A0Y.A04(EnumC3791VH.A0J, null);
        if (this.A00.A0W != null) {
            this.A00.A0m(((C238285) this.A00.A0W).A0M().toString());
        }
        if (this.A00.A0b.A0D() != null) {
            this.A00.A0b.A0D().ACQ();
        }
        if (this.A00.A09 != null) {
            this.A00.A09.A0B();
            this.A00.A09 = null;
        }
        this.A00.A0q(true);
    }
}
