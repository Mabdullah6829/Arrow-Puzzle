package p011H;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001B.AbstractC0076b;

/* JADX INFO: renamed from: H.U */
/* JADX INFO: loaded from: classes2.dex */
public final class C0256U implements ListenableFuture {

    /* JADX INFO: renamed from: t */
    public static final C0256U f504t = new C0256U(null);

    /* JADX INFO: renamed from: u */
    public static final Logger f505u = Logger.getLogger(C0256U.class.getName());

    /* JADX INFO: renamed from: s */
    public final Object f506s;

    public C0256U(Object obj) {
        this.f506s = obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        AbstractC0076b.m133h(runnable, "Runnable was null.");
        AbstractC0076b.m133h(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f505u.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f506s;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f506s + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f506s;
    }
}
