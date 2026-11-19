package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC6452k;
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
import p062g0.InterfaceC6353h;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements LifecycleEventObserver {
    private final InterfaceC6353h coroutineContext;
    private final Lifecycle lifecycle;

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1 */
    @InterfaceC6375e(m12158c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", m12159f = "Lifecycle.kt", m12160l = {}, m12161m = "invokeSuspend")
    public static final class C15721 extends AbstractC6379i implements InterfaceC6502p {
        private /* synthetic */ Object L$0;
        int label;

        public C15721(InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            C15721 c15721 = LifecycleCoroutineScopeImpl.this.new C15721(interfaceC6348c);
            c15721.L$0 = obj;
            return c15721;
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(InterfaceC0066v interfaceC0066v, InterfaceC6348c interfaceC6348c) {
            return ((C15721) create(interfaceC0066v, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0243G.m377o(obj);
            InterfaceC0066v interfaceC0066v = (InterfaceC0066v) this.L$0;
            if (LifecycleCoroutineScopeImpl.this.getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.INITIALIZED) >= 0) {
                LifecycleCoroutineScopeImpl.this.getLifecycle$lifecycle_common().addObserver(LifecycleCoroutineScopeImpl.this);
            } else {
                InterfaceC0022X interfaceC0022X = (InterfaceC0022X) interfaceC0066v.getCoroutineContext().get(C0065u.f80t);
                if (interfaceC0022X != null) {
                    interfaceC0022X.mo29e(null);
                }
            }
            return C6289k.f24318a;
        }
    }

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, InterfaceC6353h coroutineContext) {
        InterfaceC0022X interfaceC0022X;
        AbstractC6452k.m12181e(lifecycle, "lifecycle");
        AbstractC6452k.m12181e(coroutineContext, "coroutineContext");
        this.lifecycle = lifecycle;
        this.coroutineContext = coroutineContext;
        if (getLifecycle$lifecycle_common().getCurrentState() != Lifecycle.State.DESTROYED || (interfaceC0022X = (InterfaceC0022X) getCoroutineContext().get(C0065u.f80t)) == null) {
            return;
        }
        interfaceC0022X.mo29e(null);
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope, p000A0.InterfaceC0066v
    public InterfaceC6353h getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope
    public Lifecycle getLifecycle$lifecycle_common() {
        return this.lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        AbstractC6452k.m12181e(source, "source");
        AbstractC6452k.m12181e(event, "event");
        if (getLifecycle$lifecycle_common().getCurrentState().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            getLifecycle$lifecycle_common().removeObserver(this);
            InterfaceC0022X interfaceC0022X = (InterfaceC0022X) getCoroutineContext().get(C0065u.f80t);
            if (interfaceC0022X != null) {
                interfaceC0022X.mo29e(null);
            }
        }
    }

    public final void register() {
        C0302e c0302e = AbstractC0007H.f4a;
        AbstractC0069y.m111j(this, AbstractC0227m.f459a.f153u, new C15721(null), 2);
    }
}
