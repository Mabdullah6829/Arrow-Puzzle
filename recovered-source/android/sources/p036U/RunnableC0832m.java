package p036U;

import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import p006D0.C0177l;
import p030R.C0589w0;
import p034T.C0664K0;
import p039W.C0868h;
import p039W.EnumC0861a;

/* JADX INFO: renamed from: U.m */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0832m implements Runnable {

    /* JADX INFO: renamed from: s */
    public final C0177l f2235s;

    /* JADX INFO: renamed from: t */
    public final C0868h f2236t;

    /* JADX INFO: renamed from: u */
    public boolean f2237u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C0833n f2238v;

    public RunnableC0832m(C0833n c0833n, C0868h c0868h) {
        this.f2238v = c0833n;
        Level level = Level.FINE;
        this.f2235s = new C0177l(10);
        this.f2237u = true;
        this.f2236t = c0868h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0589w0 c0589w0M1354g;
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName("OkHttpClientTransport");
        while (this.f2236t.m1782c(this)) {
            try {
                C0664K0 c0664k0 = this.f2238v.f2246F;
                if (c0664k0 != null) {
                    c0664k0.m1521a();
                }
            } catch (Throwable th) {
                try {
                    C0833n c0833n = this.f2238v;
                    EnumC0861a enumC0861a = EnumC0861a.PROTOCOL_ERROR;
                    C0589w0 c0589w0M1353f = C0589w0.f1283m.m1354g("error in frame handler").m1353f(th);
                    Map map = C0833n.f2239P;
                    c0833n.m1728r(0, enumC0861a, c0589w0M1353f);
                    try {
                        this.f2236t.close();
                    } catch (IOException e) {
                        e = e;
                        C0833n.f2240Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                    } catch (RuntimeException e2) {
                        if (!"bio == null".equals(e2.getMessage())) {
                            throw e2;
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        this.f2236t.close();
                    } catch (IOException e3) {
                        C0833n.f2240Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e3);
                    } catch (RuntimeException e4) {
                        if (!"bio == null".equals(e4.getMessage())) {
                            throw e4;
                        }
                    }
                    this.f2238v.f2263h.m1482d();
                    Thread.currentThread().setName(name);
                    throw th2;
                }
            }
        }
        synchronized (this.f2238v.f2266k) {
            c0589w0M1354g = this.f2238v.f2277v;
        }
        if (c0589w0M1354g == null) {
            c0589w0M1354g = C0589w0.f1284n.m1354g("End of stream or IOException");
        }
        this.f2238v.m1728r(0, EnumC0861a.INTERNAL_ERROR, c0589w0M1354g);
        try {
            this.f2236t.close();
        } catch (IOException e5) {
            e = e5;
            C0833n.f2240Q.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
        } catch (RuntimeException e6) {
            if (!"bio == null".equals(e6.getMessage())) {
                throw e6;
            }
        }
        this.f2238v.f2263h.m1482d();
        Thread.currentThread().setName(name);
    }
}
