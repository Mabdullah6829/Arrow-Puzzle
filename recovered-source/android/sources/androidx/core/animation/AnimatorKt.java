package androidx.core.animation;

import android.animation.Animator;
import kotlin.jvm.internal.AbstractC6453l;
import p057d0.C6289k;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class AnimatorKt {

    /* JADX INFO: renamed from: androidx.core.animation.AnimatorKt$addListener$1 */
    public static final class C11421 extends AbstractC6453l implements InterfaceC6498l {
        public static final C11421 INSTANCE = new C11421();

        public C11421() {
            super(1);
        }

        public final void invoke(Animator animator) {
        }

        @Override // p078p0.InterfaceC6498l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Animator) obj);
            return C6289k.f24318a;
        }
    }

    /* JADX INFO: renamed from: androidx.core.animation.AnimatorKt$addListener$2 */
    public static final class C11432 extends AbstractC6453l implements InterfaceC6498l {
        public static final C11432 INSTANCE = new C11432();

        public C11432() {
            super(1);
        }

        public final void invoke(Animator animator) {
        }

        @Override // p078p0.InterfaceC6498l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Animator) obj);
            return C6289k.f24318a;
        }
    }

    /* JADX INFO: renamed from: androidx.core.animation.AnimatorKt$addListener$3 */
    public static final class C11443 extends AbstractC6453l implements InterfaceC6498l {
        public static final C11443 INSTANCE = new C11443();

        public C11443() {
            super(1);
        }

        public final void invoke(Animator animator) {
        }

        @Override // p078p0.InterfaceC6498l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Animator) obj);
            return C6289k.f24318a;
        }
    }

    /* JADX INFO: renamed from: androidx.core.animation.AnimatorKt$addListener$4 */
    public static final class C11454 extends AbstractC6453l implements InterfaceC6498l {
        public static final C11454 INSTANCE = new C11454();

        public C11454() {
            super(1);
        }

        public final void invoke(Animator animator) {
        }

        @Override // p078p0.InterfaceC6498l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Animator) obj);
            return C6289k.f24318a;
        }
    }

    /* JADX INFO: renamed from: androidx.core.animation.AnimatorKt$addPauseListener$1 */
    public static final class C11461 extends AbstractC6453l implements InterfaceC6498l {
        public static final C11461 INSTANCE = new C11461();

        public C11461() {
            super(1);
        }

        public final void invoke(Animator animator) {
        }

        @Override // p078p0.InterfaceC6498l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Animator) obj);
            return C6289k.f24318a;
        }
    }

    /* JADX INFO: renamed from: androidx.core.animation.AnimatorKt$addPauseListener$2 */
    public static final class C11472 extends AbstractC6453l implements InterfaceC6498l {
        public static final C11472 INSTANCE = new C11472();

        public C11472() {
            super(1);
        }

        public final void invoke(Animator animator) {
        }

        @Override // p078p0.InterfaceC6498l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Animator) obj);
            return C6289k.f24318a;
        }
    }

    public static final Animator.AnimatorListener addListener(Animator animator, InterfaceC6498l interfaceC6498l, InterfaceC6498l interfaceC6498l2, InterfaceC6498l interfaceC6498l3, InterfaceC6498l interfaceC6498l4) {
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(interfaceC6498l4, interfaceC6498l, interfaceC6498l3, interfaceC6498l2);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static /* synthetic */ Animator.AnimatorListener addListener$default(Animator animator, InterfaceC6498l interfaceC6498l, InterfaceC6498l interfaceC6498l2, InterfaceC6498l interfaceC6498l3, InterfaceC6498l interfaceC6498l4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            interfaceC6498l = C11421.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            interfaceC6498l2 = C11432.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            interfaceC6498l3 = C11443.INSTANCE;
        }
        if ((i2 & 8) != 0) {
            interfaceC6498l4 = C11454.INSTANCE;
        }
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(interfaceC6498l4, interfaceC6498l, interfaceC6498l3, interfaceC6498l2);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static final Animator.AnimatorPauseListener addPauseListener(Animator animator, final InterfaceC6498l interfaceC6498l, final InterfaceC6498l interfaceC6498l2) {
        Animator.AnimatorPauseListener animatorPauseListener = new Animator.AnimatorPauseListener() { // from class: androidx.core.animation.AnimatorKt$addPauseListener$listener$1
            @Override // android.animation.Animator.AnimatorPauseListener
            public void onAnimationPause(Animator animator2) {
                interfaceC6498l2.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorPauseListener
            public void onAnimationResume(Animator animator2) {
                interfaceC6498l.invoke(animator2);
            }
        };
        animator.addPauseListener(animatorPauseListener);
        return animatorPauseListener;
    }

    public static /* synthetic */ Animator.AnimatorPauseListener addPauseListener$default(Animator animator, InterfaceC6498l interfaceC6498l, InterfaceC6498l interfaceC6498l2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            interfaceC6498l = C11461.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            interfaceC6498l2 = C11472.INSTANCE;
        }
        return addPauseListener(animator, interfaceC6498l, interfaceC6498l2);
    }

    public static final Animator.AnimatorListener doOnCancel(Animator animator, final InterfaceC6498l interfaceC6498l) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnCancel$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
                interfaceC6498l.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorListener doOnEnd(Animator animator, final InterfaceC6498l interfaceC6498l) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnEnd$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                interfaceC6498l.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorPauseListener doOnPause(Animator animator, InterfaceC6498l interfaceC6498l) {
        return addPauseListener$default(animator, null, interfaceC6498l, 1, null);
    }

    public static final Animator.AnimatorListener doOnRepeat(Animator animator, final InterfaceC6498l interfaceC6498l) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnRepeat$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
                interfaceC6498l.invoke(animator2);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorPauseListener doOnResume(Animator animator, InterfaceC6498l interfaceC6498l) {
        return addPauseListener$default(animator, interfaceC6498l, null, 2, null);
    }

    public static final Animator.AnimatorListener doOnStart(Animator animator, final InterfaceC6498l interfaceC6498l) {
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnStart$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator2) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator2) {
                interfaceC6498l.invoke(animator2);
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }
}
