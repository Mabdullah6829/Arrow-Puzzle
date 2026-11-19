package androidx.core.os;

import android.p046os.OutcomeReceiver;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import p011H.AbstractC0243G;
import p062g0.InterfaceC6348c;

/* JADX INFO: loaded from: classes.dex */
final class ContinuationOutcomeReceiver<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {
    private final InterfaceC6348c continuation;

    public ContinuationOutcomeReceiver(InterfaceC6348c interfaceC6348c) {
        super(false);
        this.continuation = interfaceC6348c;
    }

    public void onError(E e) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(AbstractC0243G.m372j(e));
        }
    }

    public void onResult(R r2) {
        if (compareAndSet(false, true)) {
            this.continuation.resumeWith(r2);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
