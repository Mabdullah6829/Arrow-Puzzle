package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.PL */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3428PL {
    public final View.AccessibilityDelegate A00 = A02.A00(this);
    public static final C3427PK A02 = new C4576i4();
    public static final View.AccessibilityDelegate A01 = new View.AccessibilityDelegate();

    public final View.AccessibilityDelegate A00() {
        return this.A00;
    }

    public final C3475Q8 A01(View view) {
        return A02.A01(A01, view);
    }

    public final void A02(View view, int i2) {
        A01.sendAccessibilityEvent(view, i2);
    }

    public final void A03(View view, AccessibilityEvent accessibilityEvent) {
        A01.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final void A04(View view, AccessibilityEvent accessibilityEvent) {
        A01.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public final boolean A05(View view, AccessibilityEvent accessibilityEvent) {
        return A01.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public final boolean A06(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return A01.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void A07(View view, AccessibilityEvent accessibilityEvent) {
        A01.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void A08(View view, C3473Q6 c3473q6) {
        A01.onInitializeAccessibilityNodeInfo(view, c3473q6.A0M());
    }

    public boolean A09(View view, int i2, Bundle bundle) {
        return A02.A02(A01, view, i2, bundle);
    }
}
