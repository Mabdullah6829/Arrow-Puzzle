package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: com.google.android.material.internal.a */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5361a implements MultiViewUpdateListener.Listener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23436a;

    public /* synthetic */ C5361a(int i2) {
        this.f23436a = i2;
    }

    @Override // com.google.android.material.internal.MultiViewUpdateListener.Listener
    public final void onAnimationUpdate(ValueAnimator valueAnimator, View view) {
        switch (this.f23436a) {
            case 0:
                MultiViewUpdateListener.setTranslationX(valueAnimator, view);
                break;
            case 1:
                MultiViewUpdateListener.setScale(valueAnimator, view);
                break;
            case 2:
                MultiViewUpdateListener.setTranslationY(valueAnimator, view);
                break;
            default:
                MultiViewUpdateListener.setAlpha(valueAnimator, view);
                break;
        }
    }
}
