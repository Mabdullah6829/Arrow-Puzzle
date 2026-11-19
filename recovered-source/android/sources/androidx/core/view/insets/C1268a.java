package androidx.core.view.insets;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: androidx.core.view.insets.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1268a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2724a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Protection f2725b;

    public /* synthetic */ C1268a(Protection protection, int i2) {
        this.f2724a = i2;
        this.f2725b = protection;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2724a) {
            case 0:
                this.f2725b.lambda$animateInsetsAmount$1(valueAnimator);
                break;
            default:
                this.f2725b.lambda$animateAlpha$0(valueAnimator);
                break;
        }
    }
}
