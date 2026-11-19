package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import p062g0.InterfaceC6348c;

/* JADX INFO: loaded from: classes.dex */
final class ContinuationConsumer<T> extends AtomicBoolean implements java.util.function.Consumer<T> {
    private final InterfaceC6348c continuation;

    public ContinuationConsumer(InterfaceC6348c interfaceC6348c) {
        super(false);
        this.continuation = interfaceC6348c;
    }

    @Override // java.util.function.Consumer
    public void accept(T t) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(t);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
