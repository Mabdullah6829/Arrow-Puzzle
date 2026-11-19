package com.instagram.common.viewpoint.core;

import android.graphics.drawable.ColorDrawable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cy */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4263cy {
    public static AbstractC226067 A00(final C4210c7 c4210c7, int i2, final String str, final C2850Fy c2850Fy) {
        if (i2 == 1) {
            return new AbstractC226067(c4210c7, str, c2850Fy) { // from class: com.facebook.ads.redexgen.X.1G
                public static final int A00 = (int) (AbstractC3926XX.A02 * 20.0f);
                public static final int A01 = (int) (AbstractC3926XX.A02 * 16.0f);

                @Override // com.instagram.common.viewpoint.core.AbstractC4206c3
                public final boolean A03() {
                    return false;
                }

                @Override // com.instagram.common.viewpoint.core.AbstractC226067
                public final void A1X(C4494gi c4494gi) {
                    C4193bq titleDescContainer = getTitleDescContainer();
                    titleDescContainer.setAlignment(3);
                    titleDescContainer.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    titleDescContainer.setPadding(0, 0, 0, A00);
                    getCtaButton().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    LinearLayout linearLayout = new LinearLayout(c4494gi);
                    AbstractC3966YB.A0V(linearLayout, new ColorDrawable(-1));
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(3, getMediaContainer().getId());
                    linearLayout.setLayoutParams(layoutParams);
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(A01, A01, A01, A01);
                    linearLayout.addView(titleDescContainer);
                    linearLayout.addView(getCtaButton());
                    addView(getMediaContainer());
                    addView(linearLayout);
                }
            };
        }
        return new AbstractC226067(c4210c7, str, c2850Fy) { // from class: com.facebook.ads.redexgen.X.1H
            public static final int A00 = (int) (AbstractC3926XX.A02 * 12.0f);

            @Override // com.instagram.common.viewpoint.core.AbstractC4206c3
            public final boolean A02() {
                return false;
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC226067, com.instagram.common.viewpoint.core.AbstractC4206c3
            public final boolean A0A() {
                return false;
            }

            @Override // com.instagram.common.viewpoint.core.AbstractC226067
            public final void A1X(C4494gi c4494gi) {
                C4193bq titleDescContainer = getTitleDescContainer();
                titleDescContainer.setAlignment(3);
                RelativeLayout.LayoutParams adTitleAndDescriptionLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
                adTitleAndDescriptionLayoutParams.addRule(8, getMediaContainer().getId());
                titleDescContainer.setLayoutParams(adTitleAndDescriptionLayoutParams);
                titleDescContainer.setPadding(A00, A00, A00, A00);
                AbstractC3966YB.A0U(titleDescContainer, getAdContextWrapper());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(3, getMediaContainer().getId());
                getCtaButton().setLayoutParams(layoutParams);
                addView(getMediaContainer());
                addView(titleDescContainer);
                addView(getCtaButton());
            }
        };
    }
}
