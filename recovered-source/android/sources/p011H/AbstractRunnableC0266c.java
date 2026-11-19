package p011H;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import p013I.AbstractC0311a;

/* JADX INFO: renamed from: H.c */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractRunnableC0266c extends AbstractC0248L implements Runnable {

    /* JADX INFO: renamed from: D */
    public static final /* synthetic */ int f515D = 0;

    /* JADX INFO: renamed from: A */
    public ListenableFuture f516A;

    /* JADX INFO: renamed from: B */
    public Class f517B;

    /* JADX INFO: renamed from: C */
    public Object f518C;

    public AbstractRunnableC0266c(ListenableFuture listenableFuture, Class cls, Object obj) {
        listenableFuture.getClass();
        this.f516A = listenableFuture;
        this.f517B = cls;
        obj.getClass();
        this.f518C = obj;
    }

    @Override // p011H.AbstractC0290s
    /* JADX INFO: renamed from: c */
    public final void mo340c() {
        ListenableFuture listenableFuture = this.f516A;
        if ((listenableFuture != null) & (this.f567s instanceof C0268d)) {
            listenableFuture.cancel(m440o());
        }
        this.f516A = null;
        this.f517B = null;
        this.f518C = null;
    }

    @Override // p011H.AbstractC0290s
    /* JADX INFO: renamed from: j */
    public final String mo342j() {
        String str;
        ListenableFuture listenableFuture = this.f516A;
        Class cls = this.f517B;
        Object obj = this.f518C;
        String strMo342j = super.mo342j();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strMo342j != null) {
                return AbstractC0271e0.m414v(str, strMo342j);
            }
            return null;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
    }

    /* JADX INFO: renamed from: p */
    public abstract Object mo388p(Object obj, Throwable th);

    /* JADX INFO: renamed from: q */
    public abstract void mo389q(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable e;
        Object objM379b;
        ListenableFuture listenableFuture = this.f516A;
        Class cls = this.f517B;
        Object obj = this.f518C;
        if (((obj == null) || ((listenableFuture == 0) | (cls == null))) || (this.f567s instanceof C0268d)) {
            return;
        }
        this.f516A = null;
        try {
            e = listenableFuture instanceof AbstractC0311a ? ((AbstractC0311a) listenableFuture).mo433a() : null;
            objM379b = e == null ? AbstractC0253Q.m379b(listenableFuture) : null;
        } catch (Error e2) {
            e = e2;
        } catch (RuntimeException e3) {
            e = e3;
        } catch (ExecutionException e4) {
            Throwable cause = e4.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + listenableFuture.getClass() + " threw " + e4.getClass() + " without a cause");
            }
            e = cause;
        }
        if (e == null) {
            m437l(objM379b);
            return;
        }
        if (!cls.isInstance(e)) {
            m439n(listenableFuture);
            return;
        }
        try {
            Object objMo388p = mo388p(obj, e);
            this.f517B = null;
            this.f518C = null;
            mo389q(objMo388p);
        } catch (Throwable th) {
            try {
                if (th instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                m438m(th);
            } finally {
                this.f517B = null;
                this.f518C = null;
            }
        }
    }
}
