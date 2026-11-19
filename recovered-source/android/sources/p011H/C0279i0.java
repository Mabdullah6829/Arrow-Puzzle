package p011H;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import p001B.AbstractC0076b;

/* JADX INFO: renamed from: H.i0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0279i0 extends AbstractRunnableC0259X {

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ int f550u = 0;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ RunnableFutureC0281j0 f551v;

    /* JADX INFO: renamed from: w */
    public final Object f552w;

    public C0279i0(RunnableFutureC0281j0 runnableFutureC0281j0, Callable callable) {
        this.f551v = runnableFutureC0281j0;
        callable.getClass();
        this.f552w = callable;
    }

    @Override // p011H.AbstractRunnableC0259X
    /* JADX INFO: renamed from: a */
    public final void mo335a(Throwable th) {
        switch (this.f550u) {
            case 0:
                this.f551v.m438m(th);
                break;
            default:
                this.f551v.m438m(th);
                break;
        }
    }

    @Override // p011H.AbstractRunnableC0259X
    /* JADX INFO: renamed from: b */
    public final void mo336b(Object obj) {
        switch (this.f550u) {
            case 0:
                this.f551v.m439n((ListenableFuture) obj);
                break;
            default:
                this.f551v.m437l(obj);
                break;
        }
    }

    @Override // p011H.AbstractRunnableC0259X
    /* JADX INFO: renamed from: d */
    public final boolean mo337d() {
        switch (this.f550u) {
            case 0:
                break;
        }
        return this.f551v.isDone();
    }

    @Override // p011H.AbstractRunnableC0259X
    /* JADX INFO: renamed from: e */
    public final Object mo338e() {
        switch (this.f550u) {
            case 0:
                InterfaceC0237A interfaceC0237A = (InterfaceC0237A) this.f552w;
                ListenableFuture listenableFutureCall = interfaceC0237A.call();
                AbstractC0076b.m134i(listenableFutureCall, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC0237A);
                return listenableFutureCall;
            default:
                return ((Callable) this.f552w).call();
        }
    }

    @Override // p011H.AbstractRunnableC0259X
    /* JADX INFO: renamed from: f */
    public final String mo339f() {
        switch (this.f550u) {
            case 0:
                return ((InterfaceC0237A) this.f552w).toString();
            default:
                return ((Callable) this.f552w).toString();
        }
    }

    public C0279i0(RunnableFutureC0281j0 runnableFutureC0281j0, InterfaceC0237A interfaceC0237A) {
        this.f551v = runnableFutureC0281j0;
        this.f552w = interfaceC0237A;
    }
}
