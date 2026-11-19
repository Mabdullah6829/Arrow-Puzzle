package com.google.android.material.motion;

import android.animation.ValueAnimator;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.navigation.DrawerLayoutUtils;
import com.google.android.material.progressindicator.DeterminateDrawable;

/* JADX INFO: renamed from: com.google.android.material.motion.d */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5381d implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23446a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23447b;

    public /* synthetic */ C5381d(Object obj, int i2) {
        this.f23446a = i2;
        this.f23447b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23446a) {
            case 0:
                MaterialMainContainerBackHelper.lambda$createCornerAnimator$1((ClippableRoundedCornerLayout) this.f23447b, valueAnimator);
                break;
            case 1:
                DrawerLayoutUtils.lambda$getScrimCloseAnimatorUpdateListener$0((DrawerLayout) this.f23447b, valueAnimator);
                break;
            default:
                ((DeterminateDrawable) this.f23447b).lambda$maybeInitializeAmplitudeAnimator$1(valueAnimator);
                break;
        }
    }
}
