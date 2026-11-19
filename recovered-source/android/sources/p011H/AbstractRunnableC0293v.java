package p011H;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: H.v */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC0293v extends AbstractC0248L implements Runnable {

    /* JADX INFO: renamed from: C */
    public static final /* synthetic */ int f570C = 0;

    /* JADX INFO: renamed from: A */
    public ListenableFuture f571A;

    /* JADX INFO: renamed from: B */
    public Object f572B;

    public AbstractRunnableC0293v(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.f571A = listenableFuture;
        obj.getClass();
        this.f572B = obj;
    }

    @Override // p011H.AbstractC0290s
    /* JADX INFO: renamed from: c */
    public final void mo340c() {
        ListenableFuture listenableFuture = this.f571A;
        if ((listenableFuture != null) & (this.f567s instanceof C0268d)) {
            listenableFuture.cancel(m440o());
        }
        this.f571A = null;
        this.f572B = null;
    }

    @Override // p011H.AbstractC0290s
    /* JADX INFO: renamed from: j */
    public final String mo342j() {
        String str;
        ListenableFuture listenableFuture = this.f571A;
        Object obj = this.f572B;
        String strMo342j = super.mo342j();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strMo342j != null) {
                return AbstractC0271e0.m414v(str, strMo342j);
            }
            return null;
        }
        return str + "function=[" + obj + "]";
    }

    /* JADX INFO: renamed from: p */
    public abstract Object mo441p(Object obj, Object obj2);

    /* JADX INFO: renamed from: q */
    public abstract void mo442q(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.f571A;
        Object obj = this.f572B;
        if (((this.f567s instanceof C0268d) | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.f571A = null;
        if (listenableFuture.isCancelled()) {
            m439n(listenableFuture);
            return;
        }
        try {
            try {
                Object objMo441p = mo441p(obj, AbstractC0253Q.m379b(listenableFuture));
                this.f572B = null;
                mo442q(objMo441p);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    m438m(th);
                } finally {
                    this.f572B = null;
                }
            }
        } catch (Error e) {
            m438m(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            m438m(e2);
        } catch (ExecutionException e3) {
            m438m(e3.getCause());
        }
    }
}
