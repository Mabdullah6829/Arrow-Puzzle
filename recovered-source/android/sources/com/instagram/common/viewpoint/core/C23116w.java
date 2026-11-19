package com.instagram.common.viewpoint.core;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6w */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C23116w extends C4563hq {
    public static String[] A01 = {"5vbH5h", "J", "C4GDfN5QjjsYSTm6MxZFmUsCMcA9wBBJ", "6VFwzkwOMMM2Di2Z85K5QmwqwgWhrd8W", "uhhUuQP5WsjWPtKrx", "v18Pv4VwePGedZr395LFzqQB6yfdWBSj", "eHjrumjSh1wPfIUStRl2rH8Zl9vSSm7d", "psLA63BrOeuZ89bQmrhMweOfIVNK7DGd"};
    public final /* synthetic */ C23106v A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.C4563hq
    public final int A0O(View view, int i2) {
        AbstractC3530R2 abstractC3530R2A08 = A08();
        if (!abstractC3530R2A08.A22()) {
            return 0;
        }
        C3531R3 c3531r3 = (C3531R3) view.getLayoutParams();
        int iA0N = A0N(abstractC3530R2A08.A0m(view) - c3531r3.leftMargin, abstractC3530R2A08.A0p(view) + c3531r3.rightMargin, abstractC3530R2A08.A0g(), abstractC3530R2A08.A0j() - abstractC3530R2A08.A0h(), i2) + this.A00.A02;
        if (A01[0].length() != 6) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "LE8phwfR0RxAHMOOl0X9IEx3wOgwcDNd";
        strArr[7] = "Bj9ROfqsKQjGAcpCTsOWpU0U4DTJlpud";
        return iA0N;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23116w(C23106v c23106v, C4494gi c4494gi) {
        super(c4494gi);
        this.A00 = c23106v;
    }

    @Override // com.instagram.common.viewpoint.core.C4563hq
    public final float A0J(DisplayMetrics displayMetrics) {
        return this.A00.A00 / displayMetrics.densityDpi;
    }

    @Override // com.instagram.common.viewpoint.core.C4563hq
    public final int A0K() {
        return -1;
    }

    @Override // com.instagram.common.viewpoint.core.C4563hq
    public final PointF A0P(int i2) {
        return this.A00.A56(i2);
    }
}
