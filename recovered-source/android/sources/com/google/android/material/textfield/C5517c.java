package com.google.android.material.textfield;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: com.google.android.material.textfield.c */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5517c implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23507a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EndIconDelegate f23508b;

    public /* synthetic */ C5517c(EndIconDelegate endIconDelegate, int i2) {
        this.f23507a = i2;
        this.f23508b = endIconDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23507a) {
            case 0:
                ((ClearTextEndIconDelegate) this.f23508b).lambda$getAlphaAnimator$3(valueAnimator);
                break;
            case 1:
                ((ClearTextEndIconDelegate) this.f23508b).lambda$getScaleAnimator$4(valueAnimator);
                break;
            default:
                ((DropdownMenuEndIconDelegate) this.f23508b).lambda$getAlphaAnimator$6(valueAnimator);
                break;
        }
    }
}
