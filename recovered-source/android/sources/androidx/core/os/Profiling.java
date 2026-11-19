package androidx.core.os;

import android.content.Context;
import android.os.ProfilingManager;
import android.os.ProfilingResult;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6453l;
import p004C0.C0151p;
import p004C0.EnumC0136a;
import p004C0.InterfaceC0152q;
import p006D0.C0168c;
import p006D0.InterfaceC0170e;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.C6354i;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p066i0.InterfaceC6375e;
import p078p0.InterfaceC6487a;
import p078p0.InterfaceC6502p;

/* JADX INFO: loaded from: classes.dex */
public final class Profiling {
    private static final String KEY_BUFFER_FILL_POLICY = "KEY_BUFFER_FILL_POLICY";
    private static final String KEY_DURATION_MS = "KEY_DURATION_MS";
    private static final String KEY_FREQUENCY_HZ = "KEY_FREQUENCY_HZ";
    private static final String KEY_SAMPLING_INTERVAL_BYTES = "KEY_SAMPLING_INTERVAL_BYTES";
    private static final String KEY_SIZE_KB = "KEY_SIZE_KB";
    private static final String KEY_TRACK_JAVA_ALLOCATIONS = "KEY_TRACK_JAVA_ALLOCATIONS";
    private static final int VALUE_BUFFER_FILL_POLICY_DISCARD = 1;
    private static final int VALUE_BUFFER_FILL_POLICY_RING_BUFFER = 2;

    /* JADX INFO: renamed from: androidx.core.os.Profiling$registerForAllProfilingResults$1 */
    @InterfaceC6375e(m12158c = "androidx.core.os.Profiling$registerForAllProfilingResults$1", m12159f = "Profiling.kt", m12160l = {79}, m12161m = "invokeSuspend")
    public static final class C11951 extends AbstractC6379i implements InterfaceC6502p {
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.core.os.Profiling$registerForAllProfilingResults$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends AbstractC6453l implements InterfaceC6487a {
            final /* synthetic */ Consumer<ProfilingResult> $listener;
            final /* synthetic */ ProfilingManager $service;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ProfilingManager profilingManager, Consumer<ProfilingResult> consumer) {
                super(0);
                this.$service = profilingManager;
                this.$listener = consumer;
            }

            @Override // p078p0.InterfaceC6487a
            public /* bridge */ /* synthetic */ Object invoke() {
                m12280invoke();
                return C6289k.f24318a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m12280invoke() {
                this.$service.unregisterForAllProfilingResults(this.$listener);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11951(Context context, InterfaceC6348c interfaceC6348c) {
            super(2, interfaceC6348c);
            this.$context = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(InterfaceC0152q interfaceC0152q, ProfilingResult result) {
            AbstractC6452k.m12180d(result, "result");
            ((C0151p) interfaceC0152q).mo227g(result);
        }

        @Override // p066i0.AbstractC6371a
        public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
            C11951 c11951 = new C11951(this.$context, interfaceC6348c);
            c11951.L$0 = obj;
            return c11951;
        }

        @Override // p078p0.InterfaceC6502p
        public final Object invoke(InterfaceC0152q interfaceC0152q, InterfaceC6348c interfaceC6348c) {
            return ((C11951) create(interfaceC0152q, interfaceC6348c)).invokeSuspend(C6289k.f24318a);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.core.os.b, java.util.function.Consumer] */
        @Override // p066i0.AbstractC6371a
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            int i2 = this.label;
            if (i2 == 0) {
                AbstractC0243G.m377o(obj);
                final InterfaceC0152q interfaceC0152q = (InterfaceC0152q) this.L$0;
                ?? r1 = new Consumer() { // from class: androidx.core.os.b
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        Profiling.C11951.invokeSuspend$lambda$0(interfaceC0152q, (ProfilingResult) obj2);
                    }
                };
                ProfilingManager profilingManagerM2260s = AbstractC1196a.m2260s(this.$context.getSystemService(AbstractC1196a.m2261t()));
                profilingManagerM2260s.registerForAllProfilingResults(new ExecutorC1198c(), r1);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(profilingManagerM2260s, r1);
                this.label = 1;
                if (AbstractC0243G.m367e(interfaceC0152q, anonymousClass2, this) == enumC6363a) {
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

    public static final InterfaceC0170e registerForAllProfilingResults(Context context) {
        AbstractC6452k.m12181e(context, "context");
        return new C0168c(new C11951(context, null), C6354i.f24409s, -2, EnumC0136a.f215s);
    }

    public static final void requestProfiling(Context context, ProfilingRequest profilingRequest, Executor executor, Consumer<ProfilingResult> consumer) {
        AbstractC6452k.m12181e(context, "context");
        AbstractC6452k.m12181e(profilingRequest, "profilingRequest");
        AbstractC1196a.m2260s(context.getSystemService(AbstractC1196a.m2261t())).requestProfiling(profilingRequest.getProfilingType(), profilingRequest.getParams(), profilingRequest.getTag(), profilingRequest.getCancellationSignal(), executor, consumer);
    }

    public static final void unregisterForAllProfilingResults(Context context, Consumer<ProfilingResult> listener) {
        AbstractC6452k.m12181e(context, "context");
        AbstractC6452k.m12181e(listener, "listener");
        AbstractC1196a.m2260s(context.getSystemService(AbstractC1196a.m2261t())).unregisterForAllProfilingResults(listener);
    }

    public static final void registerForAllProfilingResults(Context context, Executor executor, Consumer<ProfilingResult> listener) {
        AbstractC6452k.m12181e(context, "context");
        AbstractC6452k.m12181e(executor, "executor");
        AbstractC6452k.m12181e(listener, "listener");
        AbstractC1196a.m2260s(context.getSystemService(AbstractC1196a.m2261t())).registerForAllProfilingResults(executor, listener);
    }
}
