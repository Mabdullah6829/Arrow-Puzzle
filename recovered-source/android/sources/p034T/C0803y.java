package p034T;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001B.AbstractC0076b;
import p001B.C0084j;
import p001B.C0086l;
import p001B.C0087m;
import p011H.EnumC0244H;
import p030R.AbstractC0553e0;
import p030R.AbstractC0560i;
import p030R.AbstractC0562j;
import p030R.AbstractC0570n;
import p030R.C0546b;
import p030R.C0554f;
import p030R.C0556g;
import p030R.C0559h0;
import p030R.C0567l0;
import p030R.C0572o;
import p030R.C0576q;
import p030R.C0586v;
import p030R.C0588w;
import p030R.C0589w0;
import p030R.C0592y;
import p030R.EnumC0565k0;
import p049b0.AbstractC1886b;

/* JADX INFO: renamed from: T.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0803y extends AbstractC0562j {

    /* JADX INFO: renamed from: p */
    public static final Logger f2093p = Logger.getLogger(C0803y.class.getName());

    /* JADX INFO: renamed from: q */
    public static final double f2094q;

    /* JADX INFO: renamed from: a */
    public final C0567l0 f2095a;

    /* JADX INFO: renamed from: b */
    public final Executor f2096b;

    /* JADX INFO: renamed from: c */
    public final boolean f2097c;

    /* JADX INFO: renamed from: d */
    public final C0742i f2098d;

    /* JADX INFO: renamed from: e */
    public final C0586v f2099e;

    /* JADX INFO: renamed from: f */
    public volatile ScheduledFuture f2100f;

    /* JADX INFO: renamed from: g */
    public final boolean f2101g;

    /* JADX INFO: renamed from: h */
    public C0556g f2102h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0806z f2103i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f2104j;

    /* JADX INFO: renamed from: k */
    public boolean f2105k;

    /* JADX INFO: renamed from: l */
    public boolean f2106l;

    /* JADX INFO: renamed from: m */
    public final C0660J f2107m;

    /* JADX INFO: renamed from: n */
    public final ScheduledExecutorService f2108n;

    /* JADX INFO: renamed from: o */
    public C0592y f2109o = C0592y.f1297d;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        f2094q = TimeUnit.SECONDS.toNanos(1L) * 1.0d;
    }

    public C0803y(C0567l0 c0567l0, Executor executor, C0556g c0556g, C0660J c0660j, ScheduledExecutorService scheduledExecutorService, C0742i c0742i) {
        C0576q c0576q = C0576q.f1225b;
        this.f2095a = c0567l0;
        String str = c0567l0.f1201b;
        System.identityHashCode(this);
        AbstractC1886b.f2862a.getClass();
        if (executor == EnumC0244H.f483s) {
            this.f2096b = new ExecutorC0737g2();
            this.f2097c = true;
        } else {
            this.f2096b = new ExecutorC0749j2(executor);
            this.f2097c = false;
        }
        this.f2098d = c0742i;
        this.f2099e = C0586v.m1342b();
        EnumC0565k0 enumC0565k0 = c0567l0.f1200a;
        this.f2101g = enumC0565k0 == EnumC0565k0.f1196s || enumC0565k0 == EnumC0565k0.f1197t;
        this.f2102h = c0556g;
        this.f2107m = c0660j;
        this.f2108n = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public final void m1673a(String str, Throwable th) {
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            f2093p.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.f2105k) {
            return;
        }
        this.f2105k = true;
        try {
            if (this.f2103i != null) {
                C0589w0 c0589w0 = C0589w0.f1276f;
                C0589w0 c0589w0M1354g = str != null ? c0589w0.m1354g(str) : c0589w0.m1354g("Call cancelled without message");
                if (th != null) {
                    c0589w0M1354g = c0589w0M1354g.m1353f(th);
                }
                this.f2103i.mo1548j(c0589w0M1354g);
            }
        } finally {
            m1674b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1674b() {
        this.f2099e.getClass();
        ScheduledFuture scheduledFuture = this.f2100f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1675c(Object obj) {
        AbstractC0076b.m139n(this.f2103i != null, "Not started");
        AbstractC0076b.m139n(!this.f2105k, "call was cancelled");
        AbstractC0076b.m139n(!this.f2106l, "call was half-closed");
        try {
            InterfaceC0806z interfaceC0806z = this.f2103i;
            if (interfaceC0806z instanceof C0684R0) {
                ((C0684R0) interfaceC0806z).m1559v(obj);
            } else {
                interfaceC0806z.mo1549k(this.f2095a.m1320d(obj));
            }
            if (this.f2101g) {
                return;
            }
            this.f2103i.flush();
        } catch (Error e) {
            this.f2103i.mo1548j(C0589w0.f1276f.m1354g("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.f2103i.mo1548j(C0589w0.f1276f.m1353f(e2).m1354g("Failed to stream message"));
        }
    }

    @Override // p030R.AbstractC0562j
    public final void cancel(String str, Throwable th) {
        AbstractC1886b.m2715c();
        try {
            AbstractC1886b.m2713a();
            m1673a(str, th);
            AbstractC1886b.f2862a.getClass();
        } catch (Throwable th2) {
            try {
                AbstractC1886b.f2862a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1676d(AbstractC0560i abstractC0560i, C0559h0 c0559h0) {
        long j2;
        C0556g c0556g;
        InterfaceC0806z c0684r0;
        C0572o c0572o = C0572o.f1219t;
        AbstractC0076b.m139n(this.f2103i == null, "Already started");
        AbstractC0076b.m139n(!this.f2105k, "call was cancelled");
        AbstractC0076b.m133h(abstractC0560i, "observer");
        AbstractC0076b.m133h(c0559h0, "headers");
        this.f2099e.getClass();
        C0556g c0556g2 = this.f2102h;
        C0084j c0084j = C0736g1.f1873g;
        C0736g1 c0736g1 = (C0736g1) c0556g2.m1290a(c0084j);
        if (c0736g1 == null) {
            j2 = 0;
        } else {
            Integer num = c0736g1.f1877d;
            Integer num2 = c0736g1.f1876c;
            Long l2 = c0736g1.f1874a;
            if (l2 != null) {
                long jLongValue = l2.longValue();
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                C0572o c0572o2 = C0588w.f1267v;
                if (timeUnit == null) {
                    throw new NullPointerException("units");
                }
                C0588w c0588w = new C0588w(timeUnit.toNanos(jLongValue));
                C0556g c0556g3 = this.f2102h;
                C0588w c0588w2 = c0556g3.f1175a;
                if (c0588w2 != null) {
                    C0572o c0572o3 = c0588w.f1271s;
                    if (c0572o3 != c0588w2.f1271s) {
                        throw new AssertionError("Tickers (" + c0572o3 + " and " + c0588w2.f1271s + ") don't match. Custom Ticker should only be used in tests!");
                    }
                    j2 = 0;
                    if (c0588w.f1272t - c0588w2.f1272t < 0) {
                    }
                } else {
                    j2 = 0;
                }
                c0556g3.getClass();
                C0554f c0554fM1289b = C0556g.m1289b(c0556g3);
                c0554fM1289b.f1165a = c0588w;
                this.f2102h = new C0556g(c0554fM1289b);
            } else {
                j2 = 0;
            }
            Boolean bool = c0736g1.f1875b;
            if (bool != null) {
                if (bool.booleanValue()) {
                    C0556g c0556g4 = this.f2102h;
                    c0556g4.getClass();
                    C0554f c0554fM1289b2 = C0556g.m1289b(c0556g4);
                    c0554fM1289b2.f1170f = Boolean.TRUE;
                    c0556g = new C0556g(c0554fM1289b2);
                } else {
                    C0556g c0556g5 = this.f2102h;
                    c0556g5.getClass();
                    C0554f c0554fM1289b3 = C0556g.m1289b(c0556g5);
                    c0554fM1289b3.f1170f = Boolean.FALSE;
                    c0556g = new C0556g(c0554fM1289b3);
                }
                this.f2102h = c0556g;
            }
            if (num2 != null) {
                C0556g c0556g6 = this.f2102h;
                Integer num3 = c0556g6.f1181g;
                if (num3 != null) {
                    int iMin = Math.min(num3.intValue(), num2.intValue());
                    AbstractC0076b.m127b(iMin, "invalid maxsize %s", iMin >= 0);
                    C0554f c0554fM1289b4 = C0556g.m1289b(c0556g6);
                    c0554fM1289b4.f1171g = Integer.valueOf(iMin);
                    this.f2102h = new C0556g(c0554fM1289b4);
                } else {
                    int iIntValue = num2.intValue();
                    AbstractC0076b.m127b(iIntValue, "invalid maxsize %s", iIntValue >= 0);
                    C0554f c0554fM1289b5 = C0556g.m1289b(c0556g6);
                    c0554fM1289b5.f1171g = num2;
                    this.f2102h = new C0556g(c0554fM1289b5);
                }
            }
            if (num != null) {
                C0556g c0556g7 = this.f2102h;
                Integer num4 = c0556g7.f1182h;
                if (num4 != null) {
                    int iMin2 = Math.min(num4.intValue(), num.intValue());
                    AbstractC0076b.m127b(iMin2, "invalid maxsize %s", iMin2 >= 0);
                    C0554f c0554fM1289b6 = C0556g.m1289b(c0556g7);
                    c0554fM1289b6.f1172h = Integer.valueOf(iMin2);
                    this.f2102h = new C0556g(c0554fM1289b6);
                } else {
                    int iIntValue2 = num.intValue();
                    AbstractC0076b.m127b(iIntValue2, "invalid maxsize %s", iIntValue2 >= 0);
                    C0554f c0554fM1289b7 = C0556g.m1289b(c0556g7);
                    c0554fM1289b7.f1172h = num;
                    this.f2102h = new C0556g(c0554fM1289b7);
                }
            }
        }
        this.f2102h.getClass();
        C0592y c0592y = this.f2109o;
        c0559h0.m1305a(AbstractC0759m0.f1926h);
        c0559h0.m1305a(AbstractC0759m0.f1922d);
        AbstractC0553e0 abstractC0553e0 = AbstractC0759m0.f1923e;
        c0559h0.m1305a(abstractC0553e0);
        byte[] bArr = c0592y.f1299b;
        if (bArr.length != 0) {
            c0559h0.m1310f(abstractC0553e0, bArr);
        }
        c0559h0.m1305a(AbstractC0759m0.f1924f);
        c0559h0.m1305a(AbstractC0759m0.f1925g);
        C0588w c0588w3 = this.f2102h.f1175a;
        this.f2099e.getClass();
        C0588w c0588w4 = c0588w3 == null ? null : c0588w3;
        if (c0588w4 == null || !c0588w4.m1346b()) {
            this.f2099e.getClass();
            C0588w c0588w5 = this.f2102h.f1175a;
            Logger logger = f2093p;
            if (logger.isLoggable(Level.FINE) && c0588w4 != null && c0588w4.equals(null)) {
                TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                long jMax = Math.max(j2, c0588w4.m1347c());
                Locale locale = Locale.US;
                StringBuilder sb = new StringBuilder("Call timeout set to '" + jMax + "' ns, due to context deadline.");
                if (c0588w5 == null) {
                    sb.append(" Explicit call timeout was not set.");
                } else {
                    sb.append(" Explicit call timeout was '" + c0588w5.m1347c() + "' ns.");
                }
                logger.fine(sb.toString());
            }
            C0660J c0660j = this.f2107m;
            C0567l0 c0567l0 = this.f2095a;
            C0556g c0556g8 = this.f2102h;
            C0586v c0586v = this.f2099e;
            if (((C0720c1) c0660j.f1473b).f1767X) {
                C0736g1 c0736g2 = (C0736g1) c0556g8.m1290a(c0084j);
                c0684r0 = new C0684R0(c0660j, c0567l0, c0559h0, c0556g8, c0736g2 == null ? null : c0736g2.f1878e, c0736g2 == null ? null : c0736g2.f1879f, c0586v);
            } else {
                InterfaceC0639C interfaceC0639CM1517a = c0660j.m1517a(new C0641C1(c0567l0, c0559h0, c0556g8));
                C0586v c0586vM1343a = c0586v.m1343a();
                try {
                    c0684r0 = interfaceC0639CM1517a.mo1483c(c0567l0, c0559h0, c0556g8, AbstractC0759m0.m1622c(c0556g8, c0559h0, 0, false));
                    c0586v.m1344c(c0586vM1343a);
                } catch (Throwable th) {
                    c0586v.m1344c(c0586vM1343a);
                    throw th;
                }
            }
            this.f2103i = c0684r0;
        } else {
            AbstractC0570n[] abstractC0570nArrM1622c = AbstractC0759m0.m1622c(this.f2102h, c0559h0, 0, false);
            C0588w c0588w6 = this.f2102h.f1175a;
            this.f2099e.getClass();
            String str = c0588w6 == null ? "Context" : "CallOptions";
            Long l3 = (Long) this.f2102h.m1290a(AbstractC0570n.f1216a);
            TimeUnit timeUnit3 = TimeUnit.NANOSECONDS;
            double dM1347c = c0588w4.m1347c();
            double d = f2094q;
            this.f2103i = new C0731f0(C0589w0.f1278h.m1354g(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, Double.valueOf(dM1347c / d), Double.valueOf(l3 == null ? 0.0d : l3.longValue() / d))), EnumC0633A.f1391s, abstractC0570nArrM1622c);
        }
        if (this.f2097c) {
            this.f2103i.mo1551m();
        }
        this.f2102h.getClass();
        Integer num5 = this.f2102h.f1181g;
        if (num5 != null) {
            this.f2103i.mo1545g(num5.intValue());
        }
        Integer num6 = this.f2102h.f1182h;
        if (num6 != null) {
            this.f2103i.mo1541c(num6.intValue());
        }
        if (c0588w4 != null) {
            this.f2103i.mo1546h(c0588w4);
        }
        this.f2103i.mo1539a(c0572o);
        this.f2103i.mo1547i(this.f2109o);
        C0742i c0742i = this.f2098d;
        ((InterfaceC0670M0) c0742i.f1887t).mo1516a();
        ((C0785s2) c0742i.f1886s).m1661e();
        this.f2103i.mo1550l(new C0086l(this, abstractC0560i));
        this.f2099e.getClass();
        Logger logger2 = C0586v.f1245a;
        if (c0588w4 != null) {
            this.f2099e.getClass();
            if (!c0588w4.equals(null) && this.f2108n != null) {
                TimeUnit timeUnit4 = TimeUnit.NANOSECONDS;
                long jM1347c = c0588w4.m1347c();
                this.f2100f = this.f2108n.schedule(new RunnableC0667L0(new RunnableC0800x(this, jM1347c)), jM1347c, timeUnit4);
            }
        }
        if (this.f2104j) {
            m1674b();
        }
    }

    @Override // p030R.AbstractC0562j
    public final C0546b getAttributes() {
        InterfaceC0806z interfaceC0806z = this.f2103i;
        return interfaceC0806z != null ? interfaceC0806z.getAttributes() : C0546b.f1154b;
    }

    @Override // p030R.AbstractC0562j
    public final void halfClose() {
        AbstractC1886b.m2715c();
        try {
            AbstractC1886b.m2713a();
            AbstractC0076b.m139n(this.f2103i != null, "Not started");
            AbstractC0076b.m139n(!this.f2105k, "call was cancelled");
            AbstractC0076b.m139n(!this.f2106l, "call already half-closed");
            this.f2106l = true;
            this.f2103i.mo1542d();
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

    @Override // p030R.AbstractC0562j
    public final boolean isReady() {
        if (this.f2106l) {
            return false;
        }
        return this.f2103i.isReady();
    }

    @Override // p030R.AbstractC0562j
    public final void request(int i2) {
        AbstractC1886b.m2715c();
        try {
            AbstractC1886b.m2713a();
            AbstractC0076b.m139n(this.f2103i != null, "Not started");
            AbstractC0076b.m131f(i2 >= 0, "Number requested must be non-negative");
            this.f2103i.mo1544f(i2);
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

    @Override // p030R.AbstractC0562j
    public final void sendMessage(Object obj) {
        AbstractC1886b.m2715c();
        try {
            AbstractC1886b.m2713a();
            m1675c(obj);
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

    @Override // p030R.AbstractC0562j
    public final void setMessageCompression(boolean z) {
        AbstractC0076b.m139n(this.f2103i != null, "Not started");
        this.f2103i.mo1540b(z);
    }

    @Override // p030R.AbstractC0562j
    public final void start(AbstractC0560i abstractC0560i, C0559h0 c0559h0) {
        AbstractC1886b.m2715c();
        try {
            AbstractC1886b.m2713a();
            m1676d(abstractC0560i, c0559h0);
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

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m158b(this.f2095a, FirebaseAnalytics.Param.METHOD);
        return c0087mM143s.toString();
    }
}
