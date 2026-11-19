package p034T;

import java.util.ArrayList;
import java.util.List;
import p030R.AbstractC0560i;
import p030R.C0559h0;
import p030R.C0589w0;
import p030R.RunnableC0591x0;

/* JADX INFO: renamed from: T.S */
/* JADX INFO: loaded from: classes.dex */
public final class C0686S extends AbstractC0560i {

    /* JADX INFO: renamed from: a */
    public final AbstractC0560i f1564a;

    /* JADX INFO: renamed from: b */
    public volatile boolean f1565b;

    /* JADX INFO: renamed from: c */
    public List f1566c = new ArrayList();

    public C0686S(AbstractC0560i abstractC0560i) {
        this.f1564a = abstractC0560i;
    }

    /* JADX INFO: renamed from: a */
    public final void m1560a(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f1565b) {
                    runnable.run();
                } else {
                    this.f1566c.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p030R.AbstractC0560i
    public final void onClose(C0589w0 c0589w0, C0559h0 c0559h0) {
        m1560a(new RunnableC0591x0(this, c0589w0, c0559h0, 2));
    }

    @Override // p030R.AbstractC0560i
    public final void onHeaders(C0559h0 c0559h0) {
        if (this.f1565b) {
            this.f1564a.onHeaders(c0559h0);
        } else {
            m1560a(new RunnableC0666L(3, this, c0559h0));
        }
    }

    @Override // p030R.AbstractC0560i
    public final void onMessage(Object obj) {
        if (this.f1565b) {
            this.f1564a.onMessage(obj);
        } else {
            m1560a(new RunnableC0666L(4, this, obj));
        }
    }

    @Override // p030R.AbstractC0560i
    public final void onReady() {
        if (this.f1565b) {
            this.f1564a.onReady();
        } else {
            m1560a(new RunnableC0681Q(this, 0));
        }
    }
}
