package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.h9 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4521h9 extends C3462Pv {
    public int A00;

    public C4521h9(Context context) {
        super(context);
        this.A00 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00(int i2) {
        this.A00 = i2;
    }

    @Override // com.instagram.common.viewpoint.core.C3462Pv, android.view.View
    public final void onMeasure(int i2, int i3) {
        int h2 = this.A00;
        for (int i4 = 0; i4 < height; i4++) {
            View childAt = getChildAt(i4);
            int height = View.MeasureSpec.makeMeasureSpec(0, 0);
            childAt.measure(i2, height);
            int height2 = childAt.getMeasuredHeight();
            if (height2 > h2) {
                h2 = height2;
            }
        }
        int height3 = View.MeasureSpec.makeMeasureSpec(h2, BasicMeasure.EXACTLY);
        super.onMeasure(i2, height3);
    }
}
