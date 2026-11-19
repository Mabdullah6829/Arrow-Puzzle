package com.instagram.common.viewpoint.core;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.DS */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2695DS implements InterfaceC4408fK {
    public TransitionDrawable A00;
    public TransitionDrawable A01;
    public final int A03;
    public final Drawable A04;
    public final Drawable A05;
    public final View A07;
    public final Handler A06 = new Handler();
    public EnumC4407fJ A02 = EnumC4407fJ.A04;

    public C2695DS(View view, int i2, Drawable drawable, Drawable drawable2) {
        this.A03 = i2;
        this.A07 = view;
        this.A05 = drawable;
        this.A04 = drawable2;
        this.A01 = new TransitionDrawable(new Drawable[]{drawable, drawable2});
        this.A01.setCrossFadeEnabled(true);
        this.A00 = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        this.A00.setCrossFadeEnabled(true);
        AbstractC3966YB.A0V(this.A07, this.A01);
    }

    private void A04(boolean z) {
        this.A06.removeCallbacksAndMessages(null);
        if (z) {
            this.A02 = EnumC4407fJ.A05;
            AbstractC3966YB.A0V(this.A07, this.A00);
            this.A00.startTransition(this.A03);
            this.A06.postDelayed(new C2698DV(this), this.A03);
            return;
        }
        AbstractC3966YB.A0V(this.A07, this.A05);
        this.A02 = EnumC4407fJ.A04;
    }

    private void A05(boolean z) {
        this.A06.removeCallbacksAndMessages(null);
        if (z) {
            this.A02 = EnumC4407fJ.A03;
            AbstractC3966YB.A0V(this.A07, this.A01);
            this.A01.startTransition(this.A03);
            this.A06.postDelayed(new C2701DY(this), this.A03);
            return;
        }
        AbstractC3966YB.A0V(this.A07, this.A04);
        this.A02 = EnumC4407fJ.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4408fK
    public final void A4A(boolean z, boolean z2) {
        if (z2) {
            A04(z);
        } else {
            A05(z);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4408fK
    public final EnumC4407fJ A9B() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4408fK
    public final void cancel() {
        EnumC4407fJ enumC4407fJ;
        this.A06.removeCallbacksAndMessages(null);
        this.A01.resetTransition();
        this.A00.resetTransition();
        if (this.A02 == EnumC4407fJ.A03) {
            enumC4407fJ = EnumC4407fJ.A04;
        } else {
            enumC4407fJ = EnumC4407fJ.A02;
        }
        this.A02 = enumC4407fJ;
    }
}
