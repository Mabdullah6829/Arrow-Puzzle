package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3x */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C21263x extends AbstractC2731E2 {
    public final /* synthetic */ C2715Dm A00;

    public C21263x(C2715Dm c2715Dm) {
        this.A00 = c2715Dm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C2732E3 c2732e3) {
        if ((this.A00.A03 && this.A00.A02) || !this.A00.A05 || !this.A00.A04) {
            return;
        }
        this.A00.A05 = false;
        if (!this.A00.A0G(EnumC4407fJ.A03) && !this.A00.A06) {
            if (!this.A00.A0G(EnumC4407fJ.A02)) {
                return;
            }
            this.A00.A03();
            this.A00.A06(true, true);
            return;
        }
        this.A00.A06 = false;
        this.A00.A07.postDelayed(new C2717Do(this), this.A00.A00);
    }
}
