package com.instagram.common.viewpoint.core;

import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Q0 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3467Q0 {
    public static final C3466Pz A00 = new C4571hy() { // from class: com.facebook.ads.redexgen.X.7S
        @Override // com.instagram.common.viewpoint.core.C3466Pz
        public final int A00(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        @Override // com.instagram.common.viewpoint.core.C3466Pz
        public final void A01(AccessibilityEvent accessibilityEvent, int i2) {
            accessibilityEvent.setContentChangeTypes(i2);
        }
    };

    public static int A00(AccessibilityEvent accessibilityEvent) {
        return A00.A00(accessibilityEvent);
    }

    public static void A01(AccessibilityEvent accessibilityEvent, int i2) {
        A00.A01(accessibilityEvent, i2);
    }
}
