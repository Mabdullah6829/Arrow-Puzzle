package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hZ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4547hZ extends AbstractC3535R7 {
    public boolean A00 = false;
    public final /* synthetic */ AbstractC4542hU A01;

    public C4547hZ(AbstractC4542hU abstractC4542hU) {
        this.A01 = abstractC4542hU;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3535R7
    public final void A0L(C23377M c23377m, int i2) {
        super.A0L(c23377m, i2);
        if (i2 == 0 && this.A00) {
            this.A00 = false;
            this.A01.A0F();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3535R7
    public final void A0M(C23377M c23377m, int i2, int i3) {
        if (i2 != 0 || i3 != 0) {
            this.A00 = true;
        }
    }
}
