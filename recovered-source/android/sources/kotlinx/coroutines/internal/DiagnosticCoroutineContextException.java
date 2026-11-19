package kotlinx.coroutines.internal;

import p062g0.InterfaceC6353h;

/* JADX INFO: loaded from: classes.dex */
public final class DiagnosticCoroutineContextException extends RuntimeException {

    /* JADX INFO: renamed from: s */
    public final transient InterfaceC6353h f24640s;

    public DiagnosticCoroutineContextException(InterfaceC6353h interfaceC6353h) {
        this.f24640s = interfaceC6353h;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f24640s.toString();
    }
}
