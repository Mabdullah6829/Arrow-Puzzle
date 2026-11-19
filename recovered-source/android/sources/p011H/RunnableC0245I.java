package p011H;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.firestore.core.ComponentProvider;
import com.google.firebase.firestore.core.FirestoreClient;
import com.google.firebase.firestore.remote.GrpcMetadataProvider;

/* JADX INFO: renamed from: H.I */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0245I implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f485s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f486t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f487u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f488v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Object f489w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f490x;

    public /* synthetic */ RunnableC0245I(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2) {
        this.f485s = i2;
        this.f486t = obj;
        this.f487u = obj2;
        this.f488v = obj3;
        this.f489w = obj4;
        this.f490x = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f485s;
        Object obj = this.f490x;
        Object obj2 = this.f489w;
        Object obj3 = this.f488v;
        Object obj4 = this.f487u;
        Object obj5 = this.f486t;
        switch (i2) {
            case 0:
                RunnableFutureC0281j0 runnableFutureC0281j0 = (RunnableFutureC0281j0) obj5;
                C0275g0 c0275g0 = (C0275g0) obj4;
                ListenableFuture listenableFuture = (ListenableFuture) obj3;
                ListenableFuture listenableFuture2 = (ListenableFuture) obj2;
                ExecutorC0247K executorC0247K = (ExecutorC0247K) obj;
                if (runnableFutureC0281j0.isDone()) {
                    c0275g0.m439n(listenableFuture);
                } else if (listenableFuture2.isCancelled()) {
                    int i3 = ExecutorC0247K.f495w;
                    if (executorC0247K.compareAndSet(EnumC0246J.f491s, EnumC0246J.f492t)) {
                        runnableFutureC0281j0.cancel(false);
                    }
                }
                break;
            default:
                ((FirestoreClient) obj5).lambda$new$0((TaskCompletionSource) obj4, (Context) obj3, (ComponentProvider) obj2, (GrpcMetadataProvider) obj);
                break;
        }
    }
}
