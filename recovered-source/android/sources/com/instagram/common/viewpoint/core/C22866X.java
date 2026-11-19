package com.instagram.common.viewpoint.core;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6X */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C22866X extends C2850Fy {
    public static String[] A00 = {"f1NrkMLFHAOxAk1WYXb4ZQBI9BQGMxNf", "ieQbYkP9qXWhodiL", "FasCpRA2RHhykdlBGUblwYUAQMGKU0mS", "sjzKgK2sh59qhJK5Sm5NCXrbKyy", "73hXtYSYooo4yypUFlMlXcqu25ITYI9G", "jFG3gQjXUuH0GALbmhZbm14pHMTfeDNL", "AB4YZhA3BNaHUCHwFjy4bae76Yz8EFa9", "dMMrkYyDXzmdfTW8HhUzXkOm8W"};

    public C22866X(C19671J c19671j, int i2, List<C4332e5> list, C4439fp c4439fp, Bundle bundle) {
        super(c19671j, i2, list, c4439fp, bundle);
        c19671j.A1h(this);
        this.A03 = new C3225M2(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        int iA25 = this.A0C.A25();
        if (this.A05 == null || iA25 == -1) {
            return;
        }
        int curPos = this.A05.size();
        if (iA25 < curPos - 1) {
            int i2 = iA25 + 1;
            if (A00[2].charAt(8) != 'R') {
                throw new RuntimeException();
            }
            A00[2] = "QoZYEwWSRtnMYn7R6MgH1oBp1kGEXSrp";
            A0U(i2);
        }
    }

    private void A01(int i2) {
        int visibleItem = this.A0C.A26();
        int lastVisibleItem = this.A0C.A27();
        int firstVisibleItem = this.A0C.A25();
        if (firstVisibleItem != visibleItem) {
            A0S(visibleItem);
        }
        if (firstVisibleItem != lastVisibleItem) {
            A0S(lastVisibleItem);
        }
        A0T(firstVisibleItem);
        A0V(visibleItem, lastVisibleItem, i2);
    }

    @Override // com.instagram.common.viewpoint.core.C2850Fy, com.instagram.common.viewpoint.core.AbstractC3535R7
    public final void A0L(C23377M c23377m, int i2) {
    }

    @Override // com.instagram.common.viewpoint.core.C2850Fy, com.instagram.common.viewpoint.core.AbstractC3535R7
    public final void A0M(C23377M c23377m, int i2, int i3) {
        if (this.A0C.A25() != -1) {
            AbstractC3079Jg curCard = (AbstractC3079Jg) this.A0C.A1o(this.A0C.A25());
            if (curCard != null && curCard.A1V() && !curCard.A1U()) {
                curCard.A1S();
            }
            A01(i2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.C2850Fy
    public final void A0X(View view, boolean z) {
        view.setAlpha(z ? 1.0f : 0.8f);
    }

    @Override // com.instagram.common.viewpoint.core.C2850Fy
    public final void A0Z(AbstractC3079Jg abstractC3079Jg, boolean z) {
        A0X(abstractC3079Jg, z);
        if (!z && abstractC3079Jg.A1U()) {
            abstractC3079Jg.A1R();
        }
    }

    @Override // com.instagram.common.viewpoint.core.C2850Fy
    public final boolean A0a(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return ((float) rect.width()) / ((float) view.getWidth()) >= 0.75f;
    }

    public final C4439fp A0b() {
        return this.A04;
    }

    public final void A0c(C4439fp c4439fp) {
        this.A04 = c4439fp;
    }

    public final void A0d(List<C4332e5> list) {
        this.A05 = list;
    }
}
