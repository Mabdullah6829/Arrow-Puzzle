package com.instagram.common.viewpoint.core;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Fx */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2849Fx extends AbstractC4438fo {
    public final /* synthetic */ C21594U A00;

    public C2849Fx(C21594U c21594u) {
        this.A00 = c21594u;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC4438fo
    public final void A03() {
        if (!this.A00.A04.A07()) {
            this.A00.setImpressionRecordingFlag(this.A00.A04);
            if (!TextUtils.isEmpty(this.A00.A08)) {
                this.A00.A0F.ABJ(this.A00.A08, new C4150b9().A03(this.A00.A07).A02(this.A00.A04).A04(this.A00.A0D.A0z()).A05());
                C3326Ng.A07(this.A00.A0D.A2A(), this.A00.A0E);
                this.A00.A0E.A0F().A3L();
                AbstractC3382Oa.A02(this.A00.A0D.A0y(), AbstractC3941Xm.A00(this.A00.A0D.A10()));
            }
        }
    }
}
