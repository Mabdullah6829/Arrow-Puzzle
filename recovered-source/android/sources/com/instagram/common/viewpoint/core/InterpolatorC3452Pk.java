package com.instagram.common.viewpoint.core;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pk */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class InterpolatorC3452Pk implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        float f3 = f2 - 1.0f;
        return (f3 * f3 * f3 * f3 * f3) + 1.0f;
    }
}
