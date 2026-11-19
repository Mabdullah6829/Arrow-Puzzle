package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gp */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2903Gp implements InterfaceC3996Yf {
    public final /* synthetic */ AbstractC2897Gj A00;

    public C2903Gp(AbstractC2897Gj abstractC2897Gj) {
        this.A00 = abstractC2897Gj;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3996Yf
    public final void AEZ(int i2) {
        this.A00.A0d();
        if (this.A00.A01 != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = i2;
            this.A00.A01.setLayoutParams(layoutParams);
        }
    }
}
