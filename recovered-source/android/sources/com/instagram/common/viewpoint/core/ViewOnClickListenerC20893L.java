package com.instagram.common.viewpoint.core;

import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3L */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class ViewOnClickListenerC20893L extends AbstractC2742ED implements View.OnClickListener {
    public final AbstractC2739EA A00;
    public final AbstractC2733E4 A01;
    public final AbstractC2731E2 A02;
    public final AbstractC2729E0 A03;
    public final C4406fI A04;

    public ViewOnClickListenerC20893L(C4494gi c4494gi) {
        this(c4494gi, null);
    }

    public ViewOnClickListenerC20893L(C4494gi c4494gi, AttributeSet attributeSet) {
        this(c4494gi, attributeSet, 0);
    }

    public ViewOnClickListenerC20893L(C4494gi c4494gi, AttributeSet attributeSet, int i2) {
        super(c4494gi, attributeSet, i2);
        this.A03 = new AbstractC2729E0() { // from class: com.facebook.ads.redexgen.X.3R
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C2730E1 c2730e1) {
                this.A00.setVisibility(0);
            }
        };
        this.A01 = new AbstractC2733E4() { // from class: com.facebook.ads.redexgen.X.3Q
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C21404B c21404b) {
                this.A00.A04.setChecked(true);
            }
        };
        this.A02 = new AbstractC2731E2() { // from class: com.facebook.ads.redexgen.X.3O
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C2732E3 c2732e3) {
                this.A00.A04.setChecked(false);
            }
        };
        this.A00 = new AbstractC2739EA() { // from class: com.facebook.ads.redexgen.X.3M
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C21494K c21494k) {
                this.A00.A04.setChecked(true);
            }
        };
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.A04 = new C4406fI(c4494gi);
        this.A04.setChecked(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 25.0f), (int) (displayMetrics.density * 25.0f));
        setVisibility(8);
        addView(this.A04, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2742ED
    public final void A07() {
        super.A07();
        setOnClickListener(this);
        this.A04.setOnClickListener(this);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A03, this.A00, this.A01, this.A02);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2742ED
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A01, this.A00, this.A03);
        }
        setOnClickListener(null);
        this.A04.setOnClickListener(null);
        super.A08();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (AbstractC3863WU.A02(this)) {
            return;
        }
        try {
            C2775Ek videoView = getVideoView();
            if (videoView == null) {
                return;
            }
            if (videoView.getState() == EnumC4436fm.A07 || videoView.getState() == EnumC4436fm.A05 || videoView.getState() == EnumC4436fm.A06) {
                videoView.A0e(EnumC4381et.A04, 11);
            } else if (videoView.getState() == EnumC4436fm.A0A) {
                videoView.A0i(true, 7);
            }
        } catch (Throwable th) {
            AbstractC3863WU.A00(th, this);
        }
    }

    public void setPauseAccessibilityLabel(String str) {
        this.A04.setPauseAccessibilityLabel(str);
    }

    public void setPlayAccessibilityLabel(String str) {
        this.A04.setPlayAccessibilityLabel(str);
    }
}
