package com.instagram.common.viewpoint.core;

import android.widget.LinearLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bm */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4189bm extends LinearLayout {
    public static final int A06 = (int) (AbstractC3926XX.A02 * 4.0f);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C4494gi A04;
    public final C4190bn[] A05;

    public C4189bm(C4494gi c4494gi, int i2, int i3, int i4, int i5) {
        super(c4494gi);
        this.A00 = A06;
        this.A04 = c4494gi;
        setOrientation(0);
        this.A03 = i2;
        this.A01 = i4;
        this.A02 = i5;
        this.A05 = new C4190bn[i3];
        for (int i6 = 0; i6 < i3; i6++) {
            this.A05[i6] = A00();
            addView(this.A05[i6]);
        }
        A01();
    }

    private C4190bn A00() {
        C4190bn c4190bn = new C4190bn(this.A04, this.A01, this.A02);
        LinearLayout.LayoutParams starRatingViewParams = new LinearLayout.LayoutParams(this.A03, this.A03);
        starRatingViewParams.gravity = 16;
        c4190bn.setLayoutParams(starRatingViewParams);
        return c4190bn;
    }

    private void A01() {
        int i2 = 0;
        while (i2 < i) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.A05[i2].getLayoutParams();
            int i3 = i2 == 0 ? 0 : this.A00;
            layoutParams.leftMargin = i3;
            i2++;
        }
        requestLayout();
    }

    private void A02(float f2) {
        for (int i2 = 0; i2 < i; i2++) {
            float fillRatio = Math.min(1.0f, f2 - i2);
            if (fillRatio < 0.0f) {
                fillRatio = 0.0f;
            }
            this.A05[i2].setFillRatio(fillRatio);
        }
    }

    public void setItemSpacing(int i2) {
        this.A00 = i2;
        A01();
    }

    public void setRating(float f2) {
        A02(f2);
    }
}
