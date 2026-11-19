package p011H;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: H.i */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0278i implements Runnable {

    /* JADX INFO: renamed from: s */
    public final AbstractC0290s f548s;

    /* JADX INFO: renamed from: t */
    public final ListenableFuture f549t;

    public RunnableC0278i(AbstractC0290s abstractC0290s, ListenableFuture listenableFuture) {
        this.f548s = abstractC0290s;
        this.f549t = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f548s.f567s != this) {
            return;
        }
        if (AbstractC0290s.f565x.mo419d(this.f548s, this, AbstractC0290s.m432h(this.f549t))) {
            AbstractC0290s.m429e(this.f548s, false);
        }
    }
}
