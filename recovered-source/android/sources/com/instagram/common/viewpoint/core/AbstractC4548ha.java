package com.instagram.common.viewpoint.core;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ha */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC4548ha extends AbstractC3526Qy {
    public static String[] A01 = {"ofgeN", "GcYePxlnDkyLzFZQt8gXTfFAd", "bIohWxIGlUqKJ41hMBKnFxYrg", "ROugplE3NXuve66PKoPS6E1ZAyp", "eD20R2wAf", "s8oLKbIochRuLWrY7HR296xJjla", "faP6eJ6K6STeOEuOEXCJ6OuUaXzDbpLW", "oXM2gF3tn"};
    public boolean A00 = true;

    public abstract boolean A0X(AbstractC3548RK abstractC3548RK);

    public abstract boolean A0Y(AbstractC3548RK abstractC3548RK);

    public abstract boolean A0Z(AbstractC3548RK abstractC3548RK, int i2, int i3, int i4, int i5);

    public abstract boolean A0a(AbstractC3548RK abstractC3548RK, AbstractC3548RK abstractC3548RK2, int i2, int i3, int i4, int i5);

    @Override // com.instagram.common.viewpoint.core.AbstractC3526Qy
    public final boolean A0N(AbstractC3548RK abstractC3548RK) {
        return !this.A00 || abstractC3548RK.A0f();
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3526Qy
    public final boolean A0O(AbstractC3548RK abstractC3548RK, C3525Qx c3525Qx, C3525Qx c3525Qx2) {
        if (c3525Qx != null && (c3525Qx.A01 != c3525Qx2.A01 || c3525Qx.A03 != c3525Qx2.A03)) {
            return A0Z(abstractC3548RK, c3525Qx.A01, c3525Qx.A03, c3525Qx2.A01, c3525Qx2.A03);
        }
        return A0X(abstractC3548RK);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3526Qy
    public final boolean A0P(AbstractC3548RK abstractC3548RK, C3525Qx c3525Qx, C3525Qx c3525Qx2) {
        int i2 = c3525Qx.A01;
        int oldLeft = c3525Qx.A03;
        View view = abstractC3548RK.A0H;
        int oldTop = c3525Qx2 == null ? view.getLeft() : c3525Qx2.A01;
        String[] strArr = A01;
        if (strArr[7].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "jyZdeafgD";
        strArr2[4] = "NUmje91r8";
        int top = c3525Qx2 == null ? view.getTop() : c3525Qx2.A03;
        if (!abstractC3548RK.A0g() && (i2 != oldTop || oldLeft != top)) {
            view.layout(oldTop, top, view.getWidth() + oldTop, view.getHeight() + top);
            return A0Z(abstractC3548RK, i2, oldLeft, oldTop, top);
        }
        return A0Y(abstractC3548RK);
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3526Qy
    public final boolean A0Q(AbstractC3548RK abstractC3548RK, C3525Qx c3525Qx, C3525Qx c3525Qx2) {
        if (c3525Qx.A01 != c3525Qx2.A01 || c3525Qx.A03 != c3525Qx2.A03) {
            return A0Z(abstractC3548RK, c3525Qx.A01, c3525Qx.A03, c3525Qx2.A01, c3525Qx2.A03);
        }
        A0U(abstractC3548RK);
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3526Qy
    public final boolean A0R(AbstractC3548RK abstractC3548RK, AbstractC3548RK abstractC3548RK2, C3525Qx c3525Qx, C3525Qx c3525Qx2) {
        int i2;
        int i3;
        int i4 = c3525Qx.A01;
        int i5 = c3525Qx.A03;
        if (abstractC3548RK2.A0l()) {
            i2 = c3525Qx.A01;
            i3 = c3525Qx.A03;
        } else {
            i2 = c3525Qx2.A01;
            i3 = c3525Qx2.A03;
        }
        return A0a(abstractC3548RK, abstractC3548RK2, i4, i5, i2, i3);
    }

    public final void A0T(AbstractC3548RK abstractC3548RK) {
        A0K(abstractC3548RK);
    }

    public final void A0U(AbstractC3548RK abstractC3548RK) {
        A0K(abstractC3548RK);
    }

    public final void A0V(AbstractC3548RK abstractC3548RK) {
        A0K(abstractC3548RK);
    }

    public final void A0W(AbstractC3548RK abstractC3548RK, boolean z) {
        A0K(abstractC3548RK);
    }
}
