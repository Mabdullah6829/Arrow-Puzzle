package com.instagram.common.viewpoint.core;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.i2 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4574i2 implements InterfaceC3434PR {
    public static String[] A02 = {"gru2Lda4S7GCbNBLtOIdQEnlbYeRFwfL", "XnGCgKT7Pg2", "mKUX8sgZfunspLF5wjmFH8sDBtb3K48d", "jKk7kH4cQGBiDg5TKe33YqGV3AsPygQR", "TZdQK9usf81OKXIWMb61JsmxOZFMnA3k", "eyC2dzaRwXiJKVGsgdgz1meLL5sRgImY", "S4mkNNYHIh7xNNZ0OEskqLhCY0hDyySt", "ZXfiglEYlIOoTIuj216uQxYNuz12aQjw"};
    public final Rect A00 = new Rect();
    public final /* synthetic */ C3462Pv A01;

    public C4574i2(C3462Pv c3462Pv) {
        this.A01 = c3462Pv;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC3434PR
    public final C3465Py ACw(View view, C3465Py c3465Py) {
        C3465Py c3465PyA06 = AbstractC3449Ph.A06(view, c3465Py);
        if (c3465PyA06.A07()) {
            return c3465PyA06;
        }
        Rect rect = this.A00;
        rect.left = c3465PyA06.A03();
        rect.top = c3465PyA06.A05();
        rect.right = c3465PyA06.A04();
        rect.bottom = c3465PyA06.A02();
        int count = this.A01.getChildCount();
        for (int i2 = 0; i2 < count; i2++) {
            C3465Py c3465PyA05 = AbstractC3449Ph.A05(this.A01.getChildAt(i2), c3465PyA06);
            rect.left = Math.min(c3465PyA05.A03(), rect.left);
            rect.top = Math.min(c3465PyA05.A05(), rect.top);
            rect.right = Math.min(c3465PyA05.A04(), rect.right);
            rect.bottom = Math.min(c3465PyA05.A02(), rect.bottom);
        }
        int i3 = rect.left;
        int i4 = rect.top;
        int i5 = rect.right;
        int i6 = rect.bottom;
        if (A02[1].length() != 11) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[6] = "4mRHs0uPE72ppwyI9I2NgTpzqE63n9j5";
        strArr[2] = "Zp0DshFYJF7gm0rY227qRNMYobzVhEjB";
        C3465Py applied = c3465PyA06.A06(i3, i4, i5, i6);
        return applied;
    }
}
