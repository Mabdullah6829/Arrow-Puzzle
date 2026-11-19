package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.i4 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4576i4 extends C3427PK {
    @Override // com.instagram.common.viewpoint.core.C3427PK
    public final View.AccessibilityDelegate A00(AbstractC3428PL abstractC3428PL) {
        return new C3425PI(this, abstractC3428PL);
    }

    @Override // com.instagram.common.viewpoint.core.C3427PK
    public final C3475Q8 A01(View.AccessibilityDelegate accessibilityDelegate, View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C3475Q8(accessibilityNodeProvider);
        }
        return null;
    }

    @Override // com.instagram.common.viewpoint.core.C3427PK
    public final boolean A02(View.AccessibilityDelegate accessibilityDelegate, View view, int i2, Bundle bundle) {
        return accessibilityDelegate.performAccessibilityAction(view, i2, bundle);
    }
}
