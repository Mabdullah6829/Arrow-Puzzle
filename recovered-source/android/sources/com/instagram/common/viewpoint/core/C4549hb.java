package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hb */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4549hb extends AbstractC3428PL {
    public final AbstractC3428PL A00 = new C4552he(this);
    public final C23377M A01;

    public C4549hb(C23377M c23377m) {
        this.A01 = c23377m;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3428PL
    public final void A07(View view, AccessibilityEvent accessibilityEvent) {
        super.A07(view, accessibilityEvent);
        accessibilityEvent.setClassName(C23377M.class.getName());
        if ((view instanceof C23377M) && !A0B()) {
            C23377M c23377m = (C23377M) view;
            if (c23377m.getLayoutManager() != null) {
                c23377m.getLayoutManager().A1v(accessibilityEvent);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3428PL
    public final void A08(View view, C3473Q6 c3473q6) {
        super.A08(view, c3473q6);
        c3473q6.A0O(C23377M.class.getName());
        if (!A0B() && this.A01.getLayoutManager() != null) {
            this.A01.getLayoutManager().A1H(c3473q6);
        }
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC3428PL
    public final boolean A09(View view, int i2, Bundle bundle) {
        if (super.A09(view, i2, bundle)) {
            return true;
        }
        if (!A0B() && this.A01.getLayoutManager() != null) {
            return this.A01.getLayoutManager().A1X(i2, bundle);
        }
        return false;
    }

    public final AbstractC3428PL A0A() {
        return this.A00;
    }

    public final boolean A0B() {
        return this.A01.A1r();
    }
}
