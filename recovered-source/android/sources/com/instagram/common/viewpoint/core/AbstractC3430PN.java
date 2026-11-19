package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.PN */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3430PN {
    public static boolean A00(MotionEvent motionEvent, int i2) {
        return (motionEvent.getSource() & i2) == i2;
    }
}
