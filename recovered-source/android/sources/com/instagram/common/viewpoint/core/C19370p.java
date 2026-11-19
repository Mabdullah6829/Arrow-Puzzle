package com.instagram.common.viewpoint.core;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0p */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C19370p extends C19460y {
    @Override // com.instagram.common.viewpoint.core.C3469Q2
    public final Object A00(int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        return AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z, z2);
    }

    @Override // com.instagram.common.viewpoint.core.C3469Q2
    public final Object A01(int i2, int i3, boolean z, int i4) {
        return AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z, i4);
    }
}
