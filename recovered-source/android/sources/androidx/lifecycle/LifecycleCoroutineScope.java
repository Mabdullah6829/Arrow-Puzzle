package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractC0069y;
import p000A0.InterfaceC0022X;
import p000A0.InterfaceC0066v;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes.dex */
public abstract class LifecycleCoroutineScope implements InterfaceC0066v {

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1 */
    @InterfaceC6375e(m12158c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", m12159f = "Lifecycle.kt", m12160l = {337}, m12161m = "invokeSuspend")
    public static final class C15691 extends AbstractC6379i implements InterfaceC6502p {
        final /* synthetic */ InterfaceC6502p $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15691(InterfaceC6502p interfaceC6502p, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.$block = interfaceC6502p;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            return LifecycleCoroutineScope.this.new C15691(this.$block, interfaceC6348c);
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(InterfaceC0066v interfaceC0066v, InterfaceC6348c interfaceC6348c) {
            return ((C15691) create(interfaceC0066v, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            if (i2 == 0) {
                AbstractC0243G.m377o(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle$lifecycle_common();
                InterfaceC6502p interfaceC6502p = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.whenCreated(lifecycle$lifecycle_common, interfaceC6502p, this) == enumC6363a) {
                    return enumC6363a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj);
            }
            return C6289k.f24318a;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1 */
    @InterfaceC6375e(m12158c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenResumed$1", m12159f = "Lifecycle.kt", m12160l = {375}, m12161m = "invokeSuspend")
    public static final class C15701 extends AbstractC6379i implements InterfaceC6502p {
        final /* synthetic */ InterfaceC6502p $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15701(InterfaceC6502p interfaceC6502p, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.$block = interfaceC6502p;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            return LifecycleCoroutineScope.this.new C15701(this.$block, interfaceC6348c);
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(InterfaceC0066v interfaceC0066v, InterfaceC6348c interfaceC6348c) {
            return ((C15701) create(interfaceC0066v, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            if (i2 == 0) {
                AbstractC0243G.m377o(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle$lifecycle_common();
                InterfaceC6502p interfaceC6502p = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.whenResumed(lifecycle$lifecycle_common, interfaceC6502p, this) == enumC6363a) {
                    return enumC6363a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj);
            }
            return C6289k.f24318a;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1 */
    @InterfaceC6375e(m12158c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenStarted$1", m12159f = "Lifecycle.kt", m12160l = {356}, m12161m = "invokeSuspend")
    public static final class C15711 extends AbstractC6379i implements InterfaceC6502p {
        final /* synthetic */ InterfaceC6502p $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15711(InterfaceC6502p interfaceC6502p, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.$block = interfaceC6502p;
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            return LifecycleCoroutineScope.this.new C15711(this.$block, interfaceC6348c);
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(InterfaceC0066v interfaceC0066v, InterfaceC6348c interfaceC6348c) {
            return ((C15711) create(interfaceC0066v, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            if (i2 == 0) {
                AbstractC0243G.m377o(obj);
                Lifecycle lifecycle$lifecycle_common = LifecycleCoroutineScope.this.getLifecycle$lifecycle_common();
                InterfaceC6502p interfaceC6502p = this.$block;
                this.label = 1;
                if (PausingDispatcherKt.whenStarted(lifecycle$lifecycle_common, interfaceC6502p, this) == enumC6363a) {
                    return enumC6363a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj);
            }
            return C6289k.f24318a;
        }
    }

    @Override // p000A0.InterfaceC0066v
    public abstract /* synthetic */ InterfaceC6353h getCoroutineContext();

    public abstract Lifecycle getLifecycle$lifecycle_common();

    public final InterfaceC0022X launchWhenCreated(InterfaceC6502p block) {
        AbstractC6452k.m12181e(block, "block");
        return AbstractC0069y.m111j(this, null, new C15691(block, null), 3);
    }

    public final InterfaceC0022X launchWhenResumed(InterfaceC6502p block) {
        AbstractC6452k.m12181e(block, "block");
        return AbstractC0069y.m111j(this, null, new C15701(block, null), 3);
    }

    public final InterfaceC0022X launchWhenStarted(InterfaceC6502p block) {
        AbstractC6452k.m12181e(block, "block");
        return AbstractC0069y.m111j(this, null, new C15711(block, null), 3);
    }
}
