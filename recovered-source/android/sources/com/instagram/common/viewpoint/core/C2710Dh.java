package com.instagram.common.viewpoint.core;

import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dh */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2710Dh implements InterfaceC4382eu {
    public View A00;
    public C2775Ek A01;
    public EnumC4397f9 A02;
    public boolean A03;
    public final Handler A04;
    public final AbstractC2739EA A05;
    public final AbstractC2733E4 A06;
    public final AbstractC2731E2 A07;
    public final AbstractC2722Dt A08;
    public final boolean A09;
    public final boolean A0A;

    public C2710Dh(View view, EnumC4397f9 enumC4397f9, boolean z) {
        this(view, enumC4397f9, z, false);
    }

    public C2710Dh(View view, EnumC4397f9 enumC4397f9, boolean z, boolean z2) {
        this.A06 = new AbstractC2733E4() { // from class: com.facebook.ads.redexgen.X.3p
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C21404B c21404b) {
                this.A00.A06(1, 0);
            }
        };
        this.A07 = new AbstractC2731E2() { // from class: com.facebook.ads.redexgen.X.3n
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C2732E3 c2732e3) {
                if (!this.A00.A03) {
                    return;
                }
                if (this.A00.A02 == EnumC4397f9.A02 || this.A00.A09) {
                    this.A00.A02 = null;
                    this.A00.A05();
                } else {
                    this.A00.A06(0, 8);
                }
            }
        };
        this.A05 = new AbstractC2739EA() { // from class: com.facebook.ads.redexgen.X.3e
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C21494K c21494k) {
                if (this.A00.A02 == EnumC4397f9.A03) {
                    return;
                }
                this.A00.A00.setAlpha(1.0f);
                this.A00.A00.setVisibility(0);
            }
        };
        this.A08 = new C21063c(this);
        this.A03 = true;
        this.A04 = new Handler();
        this.A09 = z;
        this.A0A = z2;
        A08(view, enumC4397f9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        this.A00.animate().alpha(0.0f).setDuration(500L).setListener(new C4396f8(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(int i2, int i3) {
        this.A04.removeCallbacksAndMessages(null);
        this.A00.clearAnimation();
        this.A00.setAlpha(i2);
        this.A00.setVisibility(i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(AnimatorListenerAdapter animatorListenerAdapter) {
        this.A00.setVisibility(0);
        this.A00.animate().alpha(1.0f).setDuration(500L).setListener(animatorListenerAdapter);
    }

    private final void A08(View view, EnumC4397f9 enumC4397f9) {
        this.A02 = enumC4397f9;
        this.A00 = view;
        this.A00.clearAnimation();
        if (enumC4397f9 == EnumC4397f9.A03) {
            this.A00.setAlpha(0.0f);
            this.A00.setVisibility(8);
        } else {
            this.A00.setAlpha(1.0f);
            this.A00.setVisibility(0);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4382eu
    public final void AAv(C2775Ek c2775Ek) {
        this.A01 = c2775Ek;
        c2775Ek.getEventBus().A03(this.A06, this.A07, this.A08, this.A05);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4382eu
    public final void AKV(C2775Ek c2775Ek) {
        A06(1, 0);
        c2775Ek.getEventBus().A04(this.A05, this.A08, this.A07, this.A06);
        this.A01 = null;
    }
}
