package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;

/* JADX INFO: loaded from: classes.dex */
final class ContinuationRunnable extends AtomicBoolean implements Runnable {
    private final InterfaceC6348c continuation;

    public ContinuationRunnable(InterfaceC6348c interfaceC6348c) {
        super(false);
        this.continuation = interfaceC6348c;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(C6289k.f24318a);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
