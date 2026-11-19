package com.instagram.common.viewpoint.core;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.X7 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class InterpolatorC3900X7 implements Interpolator {
    public final float A00;

    public InterpolatorC3900X7(float f2) {
        this.A00 = f2;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        return (float) Math.pow(f2, this.A00);
    }
}
