package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0034e0;

/* JADX INFO: loaded from: classes.dex */
public final class JobCancellationException extends CancellationException {

    /* JADX INFO: renamed from: s */
    public final transient C0034e0 f24638s;

    public JobCancellationException(String str, Throwable th, C0034e0 c0034e0) {
        super(str);
        this.f24638s = c0034e0;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JobCancellationException)) {
            return false;
        }
        JobCancellationException jobCancellationException = (JobCancellationException) obj;
        return AbstractC6452k.m12177a(jobCancellationException.getMessage(), getMessage()) && AbstractC6452k.m12177a(jobCancellationException.f24638s, this.f24638s) && AbstractC6452k.m12177a(jobCancellationException.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        AbstractC6452k.m12178b(message);
        int iHashCode = (this.f24638s.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f24638s;
    }
}
