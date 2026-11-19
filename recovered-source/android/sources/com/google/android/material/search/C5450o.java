package com.google.android.material.search;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: com.google.android.material.search.o */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5450o implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23479a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SearchViewAnimationHelper.ContainedAnimationDelegate f23480b;

    public /* synthetic */ C5450o(SearchViewAnimationHelper.ContainedAnimationDelegate containedAnimationDelegate, int i2) {
        this.f23479a = i2;
        this.f23480b = containedAnimationDelegate;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23479a) {
            case 0:
                this.f23480b.lambda$getToolbarAlphaAnimator$1(valueAnimator);
                break;
            case 1:
                this.f23480b.lambda$getBackgroundAlphaAnimator$0(valueAnimator);
                break;
            default:
                this.f23480b.lambda$getDummyTextViewWidthAnimator$2(valueAnimator);
                break;
        }
    }
}
