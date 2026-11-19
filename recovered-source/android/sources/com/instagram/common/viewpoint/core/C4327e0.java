package com.instagram.common.viewpoint.core;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.e0 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4327e0 {
    public final int[] A00(View view, int i2, int i3) {
        C3531R3 c3531r3 = (C3531R3) view.getLayoutParams();
        int childHeightSpec = ViewGroup.getChildMeasureSpec(i2, view.getPaddingLeft() + view.getPaddingRight(), c3531r3.width);
        int childWidthSpec = view.getPaddingTop();
        view.measure(childHeightSpec, ViewGroup.getChildMeasureSpec(i3, childWidthSpec + view.getPaddingBottom(), c3531r3.height));
        int childWidthSpec2 = view.getMeasuredWidth();
        int childWidthSpec3 = view.getMeasuredHeight();
        return new int[]{childWidthSpec2 + c3531r3.leftMargin + c3531r3.rightMargin, childWidthSpec3 + c3531r3.bottomMargin + c3531r3.topMargin};
    }
}
