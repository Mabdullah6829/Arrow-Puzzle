package androidx.core.transition;

import android.transition.Transition;
import kotlin.jvm.internal.AbstractC6453l;
import p057d0.C6289k;
import p078p0.InterfaceC6498l;

/* JADX INFO: loaded from: classes.dex */
public final class TransitionKt {

    /* JADX INFO: renamed from: androidx.core.transition.TransitionKt$addListener$1 */
    public static final class C12121 extends AbstractC6453l implements InterfaceC6498l {
        public static final C12121 INSTANCE = new C12121();

        public C12121() {
            super(1);
        }

        public final void invoke(Transition transition) {
        }

        @Override // p078p0.InterfaceC6498l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Transition) obj);
            return C6289k.f24318a;
        }
    }

    /* JADX INFO: renamed from: androidx.core.transition.TransitionKt$addListener$2 */
    public static final class C12132 extends AbstractC6453l implements InterfaceC6498l {
        public static final C12132 INSTANCE = new C12132();

        public C12132() {
            super(1);
        }

        public final void invoke(Transition transition) {
        }

        @Override // p078p0.InterfaceC6498l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Transition) obj);
            return C6289k.f24318a;
        }
    }

    /* JADX INFO: renamed from: androidx.core.transition.TransitionKt$addListener$3 */
    public static final class C12143 extends AbstractC6453l implements InterfaceC6498l {
        public static final C12143 INSTANCE = new C12143();

        public C12143() {
            super(1);
        }

        public final void invoke(Transition transition) {
        }

        @Override // p078p0.InterfaceC6498l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Transition) obj);
            return C6289k.f24318a;
        }
    }

    /* JADX INFO: renamed from: androidx.core.transition.TransitionKt$addListener$4 */
    public static final class C12154 extends AbstractC6453l implements InterfaceC6498l {
        public static final C12154 INSTANCE = new C12154();

        public C12154() {
            super(1);
        }

        public final void invoke(Transition transition) {
        }

        @Override // p078p0.InterfaceC6498l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Transition) obj);
            return C6289k.f24318a;
        }
    }

    /* JADX INFO: renamed from: androidx.core.transition.TransitionKt$addListener$5 */
    public static final class C12165 extends AbstractC6453l implements InterfaceC6498l {
        public static final C12165 INSTANCE = new C12165();

        public C12165() {
            super(1);
        }

        public final void invoke(Transition transition) {
        }

        @Override // p078p0.InterfaceC6498l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Transition) obj);
            return C6289k.f24318a;
        }
    }

    public static final Transition.TransitionListener addListener(Transition transition, InterfaceC6498l interfaceC6498l, InterfaceC6498l interfaceC6498l2, InterfaceC6498l interfaceC6498l3, InterfaceC6498l interfaceC6498l4, InterfaceC6498l interfaceC6498l5) {
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(interfaceC6498l, interfaceC6498l4, interfaceC6498l5, interfaceC6498l3, interfaceC6498l2);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static /* synthetic */ Transition.TransitionListener addListener$default(Transition transition, InterfaceC6498l interfaceC6498l, InterfaceC6498l interfaceC6498l2, InterfaceC6498l interfaceC6498l3, InterfaceC6498l interfaceC6498l4, InterfaceC6498l interfaceC6498l5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            interfaceC6498l = C12121.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            interfaceC6498l2 = C12132.INSTANCE;
        }
        InterfaceC6498l interfaceC6498l6 = interfaceC6498l2;
        if ((i2 & 4) != 0) {
            interfaceC6498l3 = C12143.INSTANCE;
        }
        if ((i2 & 8) != 0) {
            interfaceC6498l4 = C12154.INSTANCE;
        }
        if ((i2 & 16) != 0) {
            interfaceC6498l5 = C12165.INSTANCE;
        }
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(interfaceC6498l, interfaceC6498l4, interfaceC6498l5, interfaceC6498l3, interfaceC6498l6);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static final Transition.TransitionListener doOnCancel(Transition transition, final InterfaceC6498l interfaceC6498l) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnCancel$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
                interfaceC6498l.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnEnd(Transition transition, final InterfaceC6498l interfaceC6498l) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnEnd$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
                interfaceC6498l.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnPause(Transition transition, final InterfaceC6498l interfaceC6498l) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnPause$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
                interfaceC6498l.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnResume(Transition transition, final InterfaceC6498l interfaceC6498l) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnResume$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
                interfaceC6498l.invoke(transition2);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnStart(Transition transition, final InterfaceC6498l interfaceC6498l) {
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnStart$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition2) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition2) {
                interfaceC6498l.invoke(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }
}
