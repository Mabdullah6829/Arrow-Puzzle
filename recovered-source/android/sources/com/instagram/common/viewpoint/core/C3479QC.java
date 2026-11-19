package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.QC */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C3479QC extends AccessibilityNodeProvider {
    public final /* synthetic */ InterfaceC3480QD A00;

    public C3479QC(InterfaceC3480QD interfaceC3480QD) {
        this.A00 = interfaceC3480QD;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        return (AccessibilityNodeInfo) this.A00.A5G(i2);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i2) {
        return this.A00.A6Y(str, i2);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i2) {
        return (AccessibilityNodeInfo) this.A00.A6Z(i2);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i2, int i3, Bundle bundle) {
        return this.A00.AGv(i2, i3, bundle);
    }
}
