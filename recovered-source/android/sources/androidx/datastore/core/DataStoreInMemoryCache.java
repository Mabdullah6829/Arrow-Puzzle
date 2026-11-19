package androidx.datastore.core;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6452k;
import p006D0.C0162B;
import p006D0.InterfaceC0170e;
import p006D0.InterfaceC0189x;
import p008E0.AbstractC0205h;

/* JADX INFO: loaded from: classes.dex */
public final class DataStoreInMemoryCache<T> {
    private final InterfaceC0189x cachedValue;

    public DataStoreInMemoryCache() {
        UnInitialized unInitialized = UnInitialized.INSTANCE;
        AbstractC6452k.m12179c(unInitialized, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.cachedValue = new C0162B(unInitialized);
    }

    private static /* synthetic */ void getCachedValue$annotations() {
    }

    public final State<T> getCurrentState() {
        C0162B c0162b = (C0162B) this.cachedValue;
        c0162b.getClass();
        Object obj = C0162B.f289w.get(c0162b);
        if (obj == AbstractC0205h.f407a) {
            obj = null;
        }
        return (State) obj;
    }

    public final InterfaceC0170e getFlow() {
        return this.cachedValue;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    public final State<T> tryUpdate(State<T> newState) {
        C0162B c0162b;
        Object obj;
        Object obj2;
        State<T> state;
        AbstractC6452k.m12181e(newState, "newState");
        InterfaceC0189x interfaceC0189x = this.cachedValue;
        do {
            c0162b = (C0162B) interfaceC0189x;
            c0162b.getClass();
            obj = C0162B.f289w.get(c0162b);
            obj2 = AbstractC0205h.f407a;
            if (obj == obj2) {
                obj = null;
            }
            state = (State) obj;
            if (state instanceof ReadException ? true : AbstractC6452k.m12177a(state, UnInitialized.INSTANCE)) {
                state = newState;
            } else if (state instanceof Data) {
                if (newState.getVersion() > state.getVersion()) {
                    state = newState;
                }
            } else if (!(state instanceof Final)) {
                throw new NoWhenBranchMatchedException();
            }
            if (obj == null) {
                obj = obj2;
            }
            if (state != null) {
                obj2 = state;
            }
        } while (!c0162b.m257a(obj, obj2));
        return state;
    }
}
