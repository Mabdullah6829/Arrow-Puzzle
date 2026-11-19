package p033S0;

import java.io.InterruptedIOException;

/* JADX INFO: renamed from: S0.E */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0605E {

    /* JADX INFO: renamed from: a */
    public static final C0604D f1325a = new C0604D();

    /* JADX INFO: renamed from: a */
    public void mo1360a() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
    }
}
