package com.instagram.common.viewpoint.core;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.DR */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2694DR implements InterfaceC4408fK {
    public int A00;
    public ValueAnimator A01;
    public EnumC4407fJ A02 = EnumC4407fJ.A04;
    public final int A03;
    public final int A04;
    public final View A05;

    public C2694DR(View view, int i2, int i3, int i4) {
        this.A05 = view;
        this.A03 = i2;
        this.A00 = i3;
        this.A04 = i4;
    }

    private ValueAnimator A00(int i2, int i3, View view) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, i3);
        valueAnimatorOfInt.setDuration(this.A03);
        valueAnimatorOfInt.addUpdateListener(new C4411fN(this, view));
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(boolean z) {
        if (z) {
            this.A02 = EnumC4407fJ.A05;
            this.A01 = A00(this.A00, this.A04, this.A05);
            this.A01.addListener(new C4410fM(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A04;
        this.A05.setLayoutParams(layoutParams);
        AbstractC3966YB.A0H(this.A05);
        this.A02 = EnumC4407fJ.A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08(boolean z) {
        AbstractC3966YB.A0L(this.A05);
        if (z) {
            this.A02 = EnumC4407fJ.A03;
            this.A01 = A00(this.A04, this.A00, this.A05);
            this.A01.addListener(new C4409fL(this));
            this.A01.start();
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.A05.getLayoutParams();
        layoutParams.height = this.A00;
        this.A05.setLayoutParams(layoutParams);
        this.A02 = EnumC4407fJ.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4408fK
    public final void A4A(boolean z, boolean z2) {
        if (z2) {
            A07(z);
        } else {
            A08(z);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4408fK
    public final EnumC4407fJ A9B() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4408fK
    public final void cancel() {
        if (this.A01 != null) {
            this.A01.cancel();
        }
    }
}
