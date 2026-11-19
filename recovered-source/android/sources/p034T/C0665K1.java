package p034T;

import io.grpc.StatusRuntimeException;
import p030R.C0589w0;

/* JADX INFO: renamed from: T.K1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0665K1 implements Thread.UncaughtExceptionHandler {
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        throw new StatusRuntimeException(C0589w0.m1350d(th).m1354g("Uncaught exception in the SynchronizationContext. Re-thrown."));
    }
}
