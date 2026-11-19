package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractC0007H;
import p000A0.C0050m0;
import p000A0.C0057q;
import p002B0.C0104d;
import p010F0.AbstractC0227m;
import p012H0.C0302e;
import p062g0.C6354i;
import p062g0.InterfaceC6353h;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleKt {
    public static final LifecycleCoroutineScope getCoroutineScope(Lifecycle lifecycle) {
        AbstractC6452k.m12181e(lifecycle, "<this>");
        while (true) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) lifecycle.getInternalScopeRef().get();
            if (lifecycleCoroutineScopeImpl != null) {
                return lifecycleCoroutineScopeImpl;
            }
            InterfaceC6353h c0050m0 = new C0050m0();
            C0302e c0302e = AbstractC0007H.f4a;
            C0104d context = AbstractC0227m.f459a.f153u;
            AbstractC6452k.m12181e(context, "context");
            if (context != C6354i.f24409s) {
                c0050m0 = (InterfaceC6353h) context.fold(c0050m0, new C0057q(10));
            }
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = new LifecycleCoroutineScopeImpl(lifecycle, c0050m0);
            AtomicReference<Object> internalScopeRef = lifecycle.getInternalScopeRef();
            do {
                if (internalScopeRef.compareAndSet(null, lifecycleCoroutineScopeImpl2)) {
                    lifecycleCoroutineScopeImpl2.register();
                    return lifecycleCoroutineScopeImpl2;
                }
            } while (internalScopeRef.get() == null);
        }
    }
}
