package p034T;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import p001B.AbstractC0076b;
import p001B.C0092r;
import p030R.AbstractC0558h;
import p030R.C0549c0;
import p030R.C0556g;
import p030R.C0559h0;
import p030R.C0561i0;
import p030R.C0588w;
import p030R.C0589w0;
import p030R.C0592y;
import p033S0.C0613g;
import p036U.C0829j;
import p036U.C0830k;
import p036U.C0840u;
import p049b0.AbstractC1886b;
import p049b0.C1887c;

/* JADX INFO: renamed from: T.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0718c extends AbstractC0761m2 implements InterfaceC0806z {

    /* JADX INFO: renamed from: i */
    public static final Logger f1705i = Logger.getLogger(AbstractC0718c.class.getName());

    /* JADX INFO: renamed from: c */
    public final C0793u2 f1706c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0747j0 f1707d;

    /* JADX INFO: renamed from: e */
    public final boolean f1708e;

    /* JADX INFO: renamed from: f */
    public final boolean f1709f;

    /* JADX INFO: renamed from: g */
    public C0559h0 f1710g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f1711h;

    public AbstractC0718c(C1887c c1887c, C0777q2 c0777q2, C0793u2 c0793u2, C0559h0 c0559h0, C0556g c0556g, boolean z) {
        AbstractC0076b.m133h(c0559h0, "headers");
        AbstractC0076b.m133h(c0793u2, "transportTracer");
        this.f1706c = c0793u2;
        this.f1708e = !Boolean.TRUE.equals(c0556g.m1290a(AbstractC0759m0.f1932n));
        this.f1709f = z;
        if (!z) {
            this.f1707d = new C0768o1(this, c1887c, c0777q2);
            this.f1710g = c0559h0;
            return;
        }
        C0561i0 c0561i0 = new C0561i0();
        c0561i0.f1195e = this;
        AbstractC0076b.m133h(c0559h0, "headers");
        c0561i0.f1192b = c0559h0;
        c0561i0.f1193c = c0777q2;
        this.f1707d = c0561i0;
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: c */
    public final void mo1541c(int i2) {
        this.f1707d.mo1313c(i2);
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: d */
    public final void mo1542d() {
        C0830k c0830k = (C0830k) this;
        if (c0830k.f2231n.f1686n) {
            return;
        }
        c0830k.f2231n.f1686n = true;
        this.f1707d.close();
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: e */
    public final void mo1543e(C0783s0 c0783s0) {
        c0783s0.m1659c(((C0830k) this).f2233p.f1155a.get(AbstractC0558h.f1183a), "remote_addr");
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: g */
    public final void mo1545g(int i2) {
        ((C0830k) this).f2231n.f1673a.f1948t = i2;
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: h */
    public final void mo1546h(C0588w c0588w) {
        C0559h0 c0559h0 = this.f1710g;
        C0549c0 c0549c0 = AbstractC0759m0.f1921c;
        c0559h0.m1305a(c0549c0);
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.f1710g.m1310f(c0549c0, Long.valueOf(Math.max(0L, c0588w.m1347c())));
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: i */
    public final void mo1547i(C0592y c0592y) {
        C0829j c0829j = ((C0830k) this).f2231n;
        AbstractC0076b.m139n(c0829j.f1682j == null, "Already called start");
        AbstractC0076b.m133h(c0592y, "decompressorRegistry");
        c0829j.f1683k = c0592y;
    }

    @Override // p034T.InterfaceC0781r2
    public final boolean isReady() {
        return ((C0830k) this).f2231n.m1589e() && !this.f1711h;
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: j */
    public final void mo1548j(C0589w0 c0589w0) {
        AbstractC0076b.m131f(!c0589w0.m1352e(), "Should not cancel with OK status");
        this.f1711h = true;
        C0092r c0092r = ((C0830k) this).f2232o;
        c0092r.getClass();
        AbstractC1886b.m2715c();
        try {
            synchronized (((C0830k) c0092r.f130t).f2231n.f2222w) {
                ((C0830k) c0092r.f130t).f2231n.m1711l(c0589w0, true, null);
            }
            AbstractC1886b.f2862a.getClass();
        } catch (Throwable th) {
            try {
                AbstractC1886b.f2862a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: l */
    public final void mo1550l(InterfaceC0636B interfaceC0636B) {
        C0830k c0830k = (C0830k) this;
        C0829j c0829j = c0830k.f2231n;
        AbstractC0076b.m139n(c0829j.f1682j == null, "Already called setListener");
        AbstractC0076b.m133h(interfaceC0636B, "listener");
        c0829j.f1682j = interfaceC0636B;
        if (this.f1709f) {
            return;
        }
        c0830k.f2232o.m167g(this.f1710g, null);
        this.f1710g = null;
    }

    /* JADX INFO: renamed from: v */
    public final void m1592v(C0840u c0840u, boolean z, boolean z2, int i2) {
        C0613g c0613g;
        AbstractC0076b.m131f(c0840u != null || z, "null frame before EOS");
        C0092r c0092r = ((C0830k) this).f2232o;
        c0092r.getClass();
        AbstractC1886b.m2715c();
        try {
            if (c0840u == null) {
                c0613g = C0830k.f2226r;
            } else {
                c0613g = c0840u.f2302a;
                int i3 = (int) c0613g.f1342t;
                if (i3 > 0) {
                    C0829j c0829j = ((C0830k) c0092r.f130t).f2231n;
                    synchronized (c0829j.f1674b) {
                        c0829j.f1677e += i3;
                    }
                }
            }
            synchronized (((C0830k) c0092r.f130t).f2231n.f2222w) {
                C0829j.m1710k(((C0830k) c0092r.f130t).f2231n, c0613g, z, z2);
                C0793u2 c0793u2 = ((C0830k) c0092r.f130t).f1706c;
                if (i2 == 0) {
                    c0793u2.getClass();
                } else {
                    c0793u2.getClass();
                    ((C0785s2) c0793u2.f2060t).m1661e();
                }
            }
            AbstractC1886b.f2862a.getClass();
        } catch (Throwable th) {
            try {
                AbstractC1886b.f2862a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
