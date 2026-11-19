package p011H;

import com.google.common.util.concurrent.ListenableFuture;
import p001B.AbstractC0076b;

/* JADX INFO: renamed from: H.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C0262a extends AbstractRunnableC0266c {
    @Override // p011H.AbstractRunnableC0266c
    /* JADX INFO: renamed from: p */
    public final Object mo388p(Object obj, Throwable th) {
        InterfaceC0238B interfaceC0238B = (InterfaceC0238B) obj;
        ListenableFuture listenableFutureApply = interfaceC0238B.apply(th);
        AbstractC0076b.m134i(listenableFutureApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", interfaceC0238B);
        return listenableFutureApply;
    }

    @Override // p011H.AbstractRunnableC0266c
    /* JADX INFO: renamed from: q */
    public final void mo389q(Object obj) {
        m439n((ListenableFuture) obj);
    }
}
