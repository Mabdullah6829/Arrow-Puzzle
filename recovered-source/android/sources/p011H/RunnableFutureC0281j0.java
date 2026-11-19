package p011H;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: renamed from: H.j0 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableFutureC0281j0 extends AbstractC0248L implements RunnableFuture {

    /* JADX INFO: renamed from: A */
    public volatile AbstractRunnableC0259X f553A;

    public RunnableFutureC0281j0(Callable callable) {
        this.f553A = new C0279i0(this, callable);
    }

    @Override // p011H.AbstractC0290s
    /* JADX INFO: renamed from: c */
    public final void mo340c() {
        AbstractRunnableC0259X abstractRunnableC0259X;
        if (m440o() && (abstractRunnableC0259X = this.f553A) != null) {
            abstractRunnableC0259X.m386c();
        }
        this.f553A = null;
    }

    @Override // p011H.AbstractC0290s
    /* JADX INFO: renamed from: j */
    public final String mo342j() {
        AbstractRunnableC0259X abstractRunnableC0259X = this.f553A;
        if (abstractRunnableC0259X == null) {
            return super.mo342j();
        }
        return "task=[" + abstractRunnableC0259X + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        AbstractRunnableC0259X abstractRunnableC0259X = this.f553A;
        if (abstractRunnableC0259X != null) {
            abstractRunnableC0259X.run();
        }
        this.f553A = null;
    }
}
