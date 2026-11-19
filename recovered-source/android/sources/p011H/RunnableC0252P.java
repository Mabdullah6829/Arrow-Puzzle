package p011H;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: H.P */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0252P extends AbstractC0283l implements Runnable {

    /* JADX INFO: renamed from: z */
    public ListenableFuture f502z;

    @Override // p011H.AbstractC0290s
    /* JADX INFO: renamed from: c */
    public final void mo340c() {
        this.f502z = null;
    }

    @Override // p011H.AbstractC0290s
    /* JADX INFO: renamed from: j */
    public final String mo342j() {
        ListenableFuture listenableFuture = this.f502z;
        if (listenableFuture == null) {
            return null;
        }
        return "delegate=[" + listenableFuture + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.f502z;
        if (listenableFuture != null) {
            m439n(listenableFuture);
        }
    }
}
