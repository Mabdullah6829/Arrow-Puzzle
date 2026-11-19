package com.instagram.common.viewpoint.core;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.view.PointerIconCompat;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.34 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C207434 extends AbstractC2742ED {
    public final Paint A00;
    public final C4494gi A01;
    public final C3792VI A02;
    public final AbstractC2739EA A03;
    public final AbstractC2733E4 A04;
    public final AbstractC2731E2 A05;
    public final C4406fI A06;

    public C207434(C4494gi c4494gi, boolean z, C3792VI c3792vi) {
        super(c4494gi);
        this.A04 = new AbstractC2733E4() { // from class: com.facebook.ads.redexgen.X.3A
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C21404B c21404b) {
                this.A00.A06.setChecked(true);
            }
        };
        this.A05 = new AbstractC2731E2() { // from class: com.facebook.ads.redexgen.X.39
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C2732E3 c2732e3) {
                this.A00.A06.setChecked(false);
            }
        };
        this.A03 = new AbstractC2739EA() { // from class: com.facebook.ads.redexgen.X.38
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.instagram.common.viewpoint.core.AbstractC3735UN
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C21494K c21494k) {
                this.A00.A06.setChecked(true);
            }
        };
        this.A02 = c3792vi;
        this.A01 = c4494gi;
        this.A06 = new C4406fI(c4494gi, z);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        RelativeLayout.LayoutParams btnLayout = new RelativeLayout.LayoutParams((int) (((double) displayMetrics.density) * 23.76d), (int) (((double) displayMetrics.density) * 23.76d));
        btnLayout.addRule(13);
        this.A06.setLayoutParams(btnLayout);
        this.A06.setChecked(true);
        this.A06.setClickable(false);
        this.A00 = new Paint();
        this.A00.setStyle(Paint.Style.FILL);
        if (z) {
            this.A00.setColor(-1728053248);
        } else {
            this.A00.setColor(-1);
            this.A00.setAlpha(204);
        }
        AbstractC3966YB.A0N(this, 0);
        addView(this.A06);
        setGravity(17);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (((double) displayMetrics.density) * 72.0d), (int) (((double) displayMetrics.density) * 72.0d));
        layoutParams.addRule(13);
        setLayoutParams(layoutParams);
        AbstractC3966YB.A0G(PointerIconCompat.TYPE_WAIT, this);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2742ED
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A04, this.A05, this.A03);
        }
        View.OnClickListener clickListener = new ViewOnClickListenerC4403fF(this);
        setOnClickListener(clickListener);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2742ED
    public final void A08() {
        setOnClickListener(null);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A03, this.A05, this.A04);
        }
        super.A08();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = getHeight();
        int width2 = getPaddingTop();
        int i2 = height - width2;
        int width3 = getPaddingBottom();
        int height2 = i2 - width3;
        int width4 = Math.min(width, height2);
        int centerY = width4 / 2;
        int height3 = width4 / 2;
        int width5 = getPaddingLeft();
        float f2 = width5 + centerY;
        int width6 = getPaddingTop();
        canvas.drawCircle(f2, width6 + height3, centerY, this.A00);
        super.onDraw(canvas);
    }
}
