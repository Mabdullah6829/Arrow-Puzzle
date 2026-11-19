package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.DQ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2693DQ implements InterfaceC4408fK {
    public ViewPropertyAnimator A00;
    public EnumC4407fJ A01 = EnumC4407fJ.A04;
    public final int A02;
    public final View A03;
    public final boolean A04;

    public C2693DQ(View view, int i2, boolean z) {
        this.A02 = i2;
        this.A03 = view;
        this.A04 = z;
    }

    private void A04(boolean z) {
        this.A01 = EnumC4407fJ.A03;
        if (this.A04) {
            AbstractC3966YB.A0L(this.A03);
        }
        if (!z) {
            this.A03.setAlpha(1.0f);
            this.A01 = EnumC4407fJ.A02;
        } else {
            this.A00 = this.A03.animate().alpha(1.0f).setDuration(this.A02).setListener(new C4412fO(this));
        }
    }

    private void A05(boolean z) {
        this.A01 = EnumC4407fJ.A05;
        if (!z) {
            this.A03.setAlpha(0.0f);
            this.A01 = EnumC4407fJ.A04;
        } else {
            this.A00 = this.A03.animate().alpha(0.0f).setDuration(this.A02).setListener(new C4413fP(this));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4408fK
    public final void A4A(boolean z, boolean z2) {
        if (z2) {
            A05(z);
        } else {
            A04(z);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4408fK
    public final EnumC4407fJ A9B() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4408fK
    public final void cancel() {
        this.A03.clearAnimation();
        if (this.A00 != null) {
            this.A00.cancel();
        }
    }
}
