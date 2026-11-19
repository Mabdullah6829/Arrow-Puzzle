package com.instagram.common.viewpoint.core;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.DA */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2677DA implements InterfaceC4408fK {
    public ValueAnimator A00;
    public EnumC4407fJ A01 = EnumC4407fJ.A04;
    public final int A02;
    public final int A03;
    public final int A04;
    public final View A05;

    public C2677DA(View view, int i2, int i3, int i4) {
        this.A05 = view;
        this.A02 = i2;
        this.A04 = i3;
        this.A03 = i4;
    }

    private ValueAnimator A00(View view, int i2, int i3) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, i3);
        valueAnimatorOfInt.setDuration(this.A02);
        valueAnimatorOfInt.addUpdateListener(new C4417fT(this, view));
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        if (this.A00 != null) {
            this.A00.removeAllListeners();
            this.A00 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z) {
        if (z) {
            this.A01 = EnumC4407fJ.A05;
            this.A00 = A00(this.A05, this.A03, this.A04);
            this.A00.addListener(new C4416fS(this));
            this.A00.start();
            return;
        }
        this.A05.setTranslationY(this.A04);
        AbstractC3966YB.A0H(this.A05);
        this.A01 = EnumC4407fJ.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09(boolean z) {
        AbstractC3966YB.A0L(this.A05);
        if (z) {
            this.A01 = EnumC4407fJ.A03;
            this.A00 = A00(this.A05, this.A04, this.A03);
            this.A00.addListener(new C4415fR(this));
            this.A00.start();
            return;
        }
        this.A05.setTranslationY(this.A03);
        this.A01 = EnumC4407fJ.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4408fK
    public final void A4A(boolean z, boolean z2) {
        if (z2) {
            A08(z);
        } else {
            A09(z);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4408fK
    public final EnumC4407fJ A9B() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4408fK
    public final void cancel() {
        if (this.A00 != null) {
            this.A00.cancel();
        }
    }
}
