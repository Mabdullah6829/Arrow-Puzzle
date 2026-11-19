package p034T;

import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.Future;
import p030R.C0589w0;

/* JADX INFO: renamed from: T.L1 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0668L1 implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Collection f1500s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C0709Z1 f1501t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Future f1502u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Future f1503v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C0684R0 f1504w;

    public RunnableC0668L1(C0684R0 c0684r0, Collection collection, C0709Z1 c0709z1, Future future, Future future2) {
        this.f1504w = c0684r0;
        this.f1500s = collection;
        this.f1501t = c0709z1;
        this.f1502u = future;
        this.f1503v = future2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0589w0 c0589w0;
        for (C0709Z1 c0709z1 : this.f1500s) {
            if (c0709z1 != this.f1501t) {
                c0709z1.f1657a.mo1548j(C0684R0.f1531G);
            }
        }
        Future future = this.f1502u;
        if (future != null) {
            future.cancel(false);
        }
        Future future2 = this.f1503v;
        if (future2 != null) {
            future2.cancel(false);
        }
        C0684R0 c0684r0 = this.f1504w;
        C0742i c0742i = ((C0720c1) c0684r0.f1536D.f1473b).f1749F;
        synchronized (c0742i.f1886s) {
            try {
                ((HashSet) c0742i.f1887t).remove(c0684r0);
                if (((HashSet) c0742i.f1887t).isEmpty()) {
                    c0589w0 = (C0589w0) c0742i.f1888u;
                    c0742i.f1887t = new HashSet();
                } else {
                    c0589w0 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0589w0 != null) {
            ((C0720c1) c0742i.f1889v).f1748E.mo1563b(c0589w0);
        }
    }
}
