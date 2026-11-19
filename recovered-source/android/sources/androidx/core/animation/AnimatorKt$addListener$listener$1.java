package androidx.core.animation;

import android.animation.Animator;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatorKt$addListener$listener$1 implements Animator.AnimatorListener {
    final /* synthetic */ InterfaceC6498l $onCancel;
    final /* synthetic */ InterfaceC6498l $onEnd;
    final /* synthetic */ InterfaceC6498l $onRepeat;
    final /* synthetic */ InterfaceC6498l $onStart;

    public AnimatorKt$addListener$listener$1(InterfaceC6498l interfaceC6498l, InterfaceC6498l interfaceC6498l2, InterfaceC6498l interfaceC6498l3, InterfaceC6498l interfaceC6498l4) {
        this.$onRepeat = interfaceC6498l;
        this.$onEnd = interfaceC6498l2;
        this.$onCancel = interfaceC6498l3;
        this.$onStart = interfaceC6498l4;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.$onCancel.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.$onEnd.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        this.$onRepeat.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.$onStart.invoke(animator);
    }
}
