package com.instagram.common.viewpoint.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lq */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3213Lq extends AbstractC4438fo {
    public final /* synthetic */ C3192LV A00;

    public C3213Lq(C3192LV c3192lv) {
        this.A00 = c3192lv;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4438fo
    public final void A03() {
        if (this.A00.A05 || !this.A00.A01.A07()) {
            this.A00.A01.A05();
        }
        if (this.A00.A0A.get() != null) {
            ((InterfaceC4142b1) this.A00.A0A.get()).AEA();
        }
    }
}
