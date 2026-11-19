package p011H;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: H.N */
/* JADX INFO: loaded from: classes2.dex */
public final class C0250N extends AbstractC0249M {

    /* JADX INFO: renamed from: A */
    public final ListenableFuture f501A;

    public C0250N(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.f501A = listenableFuture;
    }

    @Override // p011H.AbstractC0290s, com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.f501A.addListener(runnable, executor);
    }

    @Override // p011H.AbstractC0290s, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f501A.cancel(z);
    }

    @Override // p011H.AbstractC0290s, java.util.concurrent.Future
    public final Object get() {
        return this.f501A.get();
    }

    @Override // p011H.AbstractC0290s, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f501A.isCancelled();
    }

    @Override // p011H.AbstractC0290s, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f501A.isDone();
    }

    @Override // p011H.AbstractC0290s
    public final String toString() {
        return this.f501A.toString();
    }

    @Override // p011H.AbstractC0290s, java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        return this.f501A.get(j2, timeUnit);
    }
}
