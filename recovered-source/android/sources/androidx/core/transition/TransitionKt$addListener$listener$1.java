package androidx.core.transition;

import android.transition.Transition;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class TransitionKt$addListener$listener$1 implements Transition.TransitionListener {
    final /* synthetic */ InterfaceC6498l $onCancel;
    final /* synthetic */ InterfaceC6498l $onEnd;
    final /* synthetic */ InterfaceC6498l $onPause;
    final /* synthetic */ InterfaceC6498l $onResume;
    final /* synthetic */ InterfaceC6498l $onStart;

    public TransitionKt$addListener$listener$1(InterfaceC6498l interfaceC6498l, InterfaceC6498l interfaceC6498l2, InterfaceC6498l interfaceC6498l3, InterfaceC6498l interfaceC6498l4, InterfaceC6498l interfaceC6498l5) {
        this.$onEnd = interfaceC6498l;
        this.$onResume = interfaceC6498l2;
        this.$onPause = interfaceC6498l3;
        this.$onCancel = interfaceC6498l4;
        this.$onStart = interfaceC6498l5;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
        this.$onCancel.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        this.$onEnd.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
        this.$onPause.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
        this.$onResume.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
        this.$onStart.invoke(transition);
    }
}
