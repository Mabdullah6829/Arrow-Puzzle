package com.google.android.material.search;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import com.google.android.material.shape.MaterialShapeDrawable;

/* JADX INFO: renamed from: com.google.android.material.search.e */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5440e implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23461a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f23462b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f23463c;

    public /* synthetic */ C5440e(int i2, Object obj, Object obj2) {
        this.f23461a = i2;
        this.f23462b = obj;
        this.f23463c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23461a) {
            case 0:
                SearchBarAnimationHelper.lambda$getExpandedViewBackgroundUpdateListener$1((MaterialShapeDrawable) this.f23462b, (View) this.f23463c, valueAnimator);
                break;
            default:
                ((SearchViewAnimationHelper.DefaultAnimationDelegate) this.f23462b).lambda$addEditTextClipAnimator$1((Rect) this.f23463c, valueAnimator);
                break;
        }
    }
}
