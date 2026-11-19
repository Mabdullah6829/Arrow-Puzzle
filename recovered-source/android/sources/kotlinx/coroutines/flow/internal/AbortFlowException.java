package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import p006D0.InterfaceC0171f;

/* JADX INFO: loaded from: classes.dex */
public final class AbortFlowException extends CancellationException {

    /* JADX INFO: renamed from: s */
    public final transient Object f24639s;

    public AbortFlowException(InterfaceC0171f interfaceC0171f) {
        super("Flow was aborted, no more elements needed");
        this.f24639s = interfaceC0171f;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
