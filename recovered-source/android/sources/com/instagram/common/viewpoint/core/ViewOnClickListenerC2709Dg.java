package com.instagram.common.viewpoint.core;

import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dg */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class ViewOnClickListenerC2709Dg extends RelativeLayout implements InterfaceC4382eu, View.OnClickListener {
    public C2775Ek A00;
    public final AbstractC2739EA A01;
    public final AbstractC2733E4 A02;
    public final AbstractC2731E2 A03;
    public final AbstractC2729E0 A04;
    public final C4406fI A05;
    public static final int A07 = (int) (AbstractC3926XX.A02 * 16.0f);
    public static final int A06 = (int) (AbstractC3926XX.A02 * 6.0f);

    public ViewOnClickListenerC2709Dg(C4494gi c4494gi) {
        super(c4494gi);
        this.A04 = new AbstractC2729E0() { // from class: com.facebook.ads.redexgen.X.3a
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C2730E1 c2730e1) {
                this.A00.setVisibility(0);
            }
        };
        this.A02 = new AbstractC2733E4() { // from class: com.facebook.ads.redexgen.X.3Z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C21404B c21404b) {
                this.A00.A05.setChecked(true);
            }
        };
        this.A03 = new AbstractC2731E2() { // from class: com.facebook.ads.redexgen.X.3Y
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C2732E3 c2732e3) {
                this.A00.A05.setChecked(false);
            }
        };
        this.A01 = new AbstractC2739EA() { // from class: com.facebook.ads.redexgen.X.3X
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C21494K c21494k) {
                this.A00.A05.setChecked(true);
            }
        };
        AbstractC3966YB.A0V(this, AbstractC3966YB.A06(855638016, A06));
        this.A05 = new C4406fI(c4494gi, true);
        this.A05.setChecked(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(A07, A07);
        layoutParams.addRule(13);
        setVisibility(8);
        addView(this.A05, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4382eu
    public final void AAv(C2775Ek c2775Ek) {
        this.A00 = c2775Ek;
        setOnClickListener(this);
        this.A05.setOnClickListener(this);
        if (this.A00 != null) {
            this.A00.getEventBus().A03(this.A04, this.A01, this.A02, this.A03);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC4382eu
    public final void AKV(C2775Ek c2775Ek) {
        if (this.A00 != null) {
            this.A00.getEventBus().A04(this.A03, this.A02, this.A01, this.A04);
        }
        setOnClickListener(null);
        this.A05.setOnClickListener(null);
        this.A00 = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            if (this.A00 == null) {
                return;
            }
            if (this.A00.getState() == EnumC4436fm.A07 || this.A00.getState() == EnumC4436fm.A05 || this.A00.getState() == EnumC4436fm.A06) {
                this.A00.A0e(EnumC4381et.A04, 11);
            } else if (this.A00.getState() == EnumC4436fm.A0A) {
                this.A00.A0i(true, 7);
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }

    public void setPauseAccessibilityLabel(String str) {
        this.A05.setPauseAccessibilityLabel(str);
    }

    public void setPlayAccessibilityLabel(String str) {
        this.A05.setPlayAccessibilityLabel(str);
    }
}
