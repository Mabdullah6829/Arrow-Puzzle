package com.google.android.material.search;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import com.google.android.material.internal.FadeThroughDrawable;

/* JADX INFO: renamed from: com.google.android.material.search.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5437b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23453a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23454b;

    public /* synthetic */ C5437b(Object obj, int i2) {
        this.f23453a = i2;
        this.f23454b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23453a) {
            case 0:
                ((View) this.f23454b).setAlpha(0.0f);
                break;
            case 1:
                SearchViewAnimationHelper.lambda$addDrawerArrowDrawableAnimatorIfNeeded$3((DrawerArrowDrawable) this.f23454b, valueAnimator);
                break;
            case 2:
                SearchViewAnimationHelper.lambda$addFadeThroughDrawableAnimatorIfNeeded$4((FadeThroughDrawable) this.f23454b, valueAnimator);
                break;
            case 3:
                SearchViewAnimationHelper.lambda$addBackButtonAnimatorIfNeeded$2((ImageButton) this.f23454b, valueAnimator);
                break;
            default:
                ((SearchViewAnimationHelper.DefaultAnimationDelegate) this.f23454b).lambda$addTextFadeAnimatorIfNeeded$2(valueAnimator);
                break;
        }
    }
}
