package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import com.google.android.material.internal.ExpandCollapseAnimationHelper;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.DeterminateDrawable;
import com.google.android.material.shape.MaterialShapeDrawable;

/* JADX INFO: renamed from: com.google.android.material.appbar.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5193b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23361a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23362b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f23363c;

    public /* synthetic */ C5193b(int i2, Object obj, Object obj2) {
        this.f23361a = i2;
        this.f23362b = obj;
        this.f23363c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23361a) {
            case 0:
                ((AppBarLayout) this.f23362b).lambda$initializeLiftOnScrollWithElevation$1((MaterialShapeDrawable) this.f23363c, valueAnimator);
                break;
            case 1:
                ((ExpandCollapseAnimationHelper) this.f23362b).lambda$getExpandCollapseAnimator$0((Rect) this.f23363c, valueAnimator);
                break;
            default:
                ((DeterminateDrawable) this.f23362b).lambda$new$0((BaseProgressIndicatorSpec) this.f23363c, valueAnimator);
                break;
        }
    }
}
