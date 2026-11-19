package p034T;

import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import p001B.AbstractC0076b;
import p030R.AbstractC0558h;
import p030R.C0589w0;
import p030R.ExecutorC0517A0;

/* JADX INFO: renamed from: T.B0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0637B0 implements InterfaceC0748j1 {

    /* JADX INFO: renamed from: s */
    public boolean f1401s;

    /* JADX INFO: renamed from: t */
    public final Object f1402t;

    /* JADX INFO: renamed from: u */
    public Object f1403u;

    public C0637B0(C0643D0 c0643d0, C0804y0 c0804y0) {
        this.f1403u = c0643d0;
        this.f1401s = false;
        this.f1402t = c0804y0;
    }

    /* JADX INFO: renamed from: a */
    public void m1479a(ScheduledFuture scheduledFuture) {
        synchronized (this.f1402t) {
            try {
                if (!this.f1401s) {
                    this.f1403u = scheduledFuture;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m1480b(boolean z) {
        C0643D0 c0643d0 = (C0643D0) this.f1403u;
        c0643d0.f1422k.execute(new RunnableC0798w0(c0643d0, (C0804y0) this.f1402t, z));
    }

    /* JADX INFO: renamed from: c */
    public void m1481c(C0589w0 c0589w0) {
        C0643D0 c0643d0 = (C0643D0) this.f1403u;
        c0643d0.f1420i.mo1300g("{0} SHUTDOWN with {1}", new Object[]{((C0804y0) this.f1402t).mo1253d(), C0643D0.m1486i(c0589w0)}, 2);
        this.f1401s = true;
        c0643d0.f1422k.execute(new RunnableC0666L(15, this, c0589w0));
    }

    /* JADX INFO: renamed from: d */
    public void m1482d() {
        AbstractC0076b.m139n(this.f1401s, "transportShutdown() must be called before transportTerminated().");
        C0643D0 c0643d0 = (C0643D0) this.f1403u;
        AbstractC0558h abstractC0558h = c0643d0.f1420i;
        C0804y0 c0804y0 = (C0804y0) this.f1402t;
        abstractC0558h.mo1300g("{0} Terminated", new Object[]{c0804y0.mo1253d()}, 2);
        ExecutorC0517A0 executorC0517A0 = c0643d0.f1422k;
        executorC0517A0.execute(new RunnableC0798w0(c0643d0, c0804y0, false));
        Iterator it = c0643d0.f1421j.iterator();
        if (!it.hasNext()) {
            executorC0517A0.execute(new RunnableC0634A0(this, 1));
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            c0804y0.getAttributes();
            throw null;
        }
    }

    public C0637B0(Object obj) {
        this.f1402t = obj;
    }
}
