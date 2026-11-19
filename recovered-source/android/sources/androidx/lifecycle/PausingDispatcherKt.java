package androidx.lifecycle;

import p000A0.AbstractC0007H;
import p000A0.AbstractC0069y;
import p000A0.C0065u;
import p000A0.InterfaceC0022X;
import p000A0.InterfaceC0066v;
import p010F0.AbstractC0227m;
import p011H.AbstractC0243G;
import p012H0.C0302e;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes.dex */
public final class PausingDispatcherKt {

    /* JADX INFO: renamed from: androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2 */
    @InterfaceC6375e(m12158c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", m12159f = "PausingDispatcher.kt", m12160l = {203}, m12161m = "invokeSuspend")
    public static final class C15742 extends AbstractC6379i implements InterfaceC6502p {
        final /* synthetic */ InterfaceC6502p $block;
        final /* synthetic */ Lifecycle.State $minState;
        final /* synthetic */ Lifecycle $this_whenStateAtLeast;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15742(Lifecycle lifecycle, Lifecycle.State state, InterfaceC6502p interfaceC6502p, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.$this_whenStateAtLeast = lifecycle;
            this.$minState = state;
            this.$block = interfaceC6502p;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            C15742 c15742 = new C15742(this.$this_whenStateAtLeast, this.$minState, this.$block, interfaceC6348c);
            c15742.L$0 = obj;
            return c15742;
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(InterfaceC0066v interfaceC0066v, InterfaceC6348c interfaceC6348c) {
            return ((C15742) create(interfaceC0066v, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            LifecycleController lifecycleController;
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lifecycleController = (LifecycleController) this.L$0;
                try {
                    AbstractC0243G.m377o(obj);
                    lifecycleController.finish();
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    lifecycleController.finish();
                    throw th;
                }
            }
            AbstractC0243G.m377o(obj);
            InterfaceC0022X interfaceC0022X = (InterfaceC0022X) ((InterfaceC0066v) this.L$0).getCoroutineContext().get(C0065u.f80t);
            if (interfaceC0022X == null) {
                throw new IllegalStateException("when[State] methods should have a parent job");
            }
            PausingDispatcher pausingDispatcher = new PausingDispatcher();
            LifecycleController lifecycleController2 = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, pausingDispatcher.dispatchQueue, interfaceC0022X);
            try {
                InterfaceC6502p interfaceC6502p = this.$block;
                this.L$0 = lifecycleController2;
                this.label = 1;
                obj = AbstractC0069y.m119r(interfaceC6502p, pausingDispatcher, this);
                if (obj == enumC6363a) {
                    return enumC6363a;
                }
                lifecycleController = lifecycleController2;
                lifecycleController.finish();
                return obj;
            } catch (Throwable th2) {
                th = th2;
                lifecycleController = lifecycleController2;
                lifecycleController.finish();
                throw th;
            }
        }
    }

    public static final <T> Object whenCreated(LifecycleOwner lifecycleOwner, InterfaceC6502p interfaceC6502p, InterfaceC6348c interfaceC6348c) {
        return whenCreated(lifecycleOwner.getLifecycle(), interfaceC6502p, interfaceC6348c);
    }

    public static final <T> Object whenResumed(LifecycleOwner lifecycleOwner, InterfaceC6502p interfaceC6502p, InterfaceC6348c interfaceC6348c) {
        return whenResumed(lifecycleOwner.getLifecycle(), interfaceC6502p, interfaceC6348c);
    }

    public static final <T> Object whenStarted(LifecycleOwner lifecycleOwner, InterfaceC6502p interfaceC6502p, InterfaceC6348c interfaceC6348c) {
        return whenStarted(lifecycleOwner.getLifecycle(), interfaceC6502p, interfaceC6348c);
    }

    public static final <T> Object whenStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, InterfaceC6502p interfaceC6502p, InterfaceC6348c interfaceC6348c) {
        C0302e c0302e = AbstractC0007H.f4a;
        return AbstractC0069y.m119r(new C15742(lifecycle, state, interfaceC6502p, null), AbstractC0227m.f459a.f153u, interfaceC6348c);
    }

    public static final <T> Object whenCreated(Lifecycle lifecycle, InterfaceC6502p interfaceC6502p, InterfaceC6348c interfaceC6348c) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.CREATED, interfaceC6502p, interfaceC6348c);
    }

    public static final <T> Object whenResumed(Lifecycle lifecycle, InterfaceC6502p interfaceC6502p, InterfaceC6348c interfaceC6348c) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.RESUMED, interfaceC6502p, interfaceC6348c);
    }

    public static final <T> Object whenStarted(Lifecycle lifecycle, InterfaceC6502p interfaceC6502p, InterfaceC6348c interfaceC6348c) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.STARTED, interfaceC6502p, interfaceC6348c);
    }
}
