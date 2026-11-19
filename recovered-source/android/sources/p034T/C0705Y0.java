package p034T;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import p001B.AbstractC0076b;
import p001B.C0084j;
import p001B.C0087m;
import p030R.AbstractC0560i;
import p030R.AbstractC0562j;
import p030R.AbstractC0570n;
import p030R.C0546b;
import p030R.C0556g;
import p030R.C0559h0;
import p030R.C0567l0;
import p030R.C0586v;
import p030R.C0588w;
import p030R.C0589w0;
import p030R.RunnableC0591x0;

/* JADX INFO: renamed from: T.Y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0705Y0 extends AbstractC0562j {

    /* JADX INFO: renamed from: o */
    public static final C0675O f1627o;

    /* JADX INFO: renamed from: a */
    public final ScheduledFuture f1628a;

    /* JADX INFO: renamed from: b */
    public final Executor f1629b;

    /* JADX INFO: renamed from: c */
    public final C0586v f1630c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f1631d;

    /* JADX INFO: renamed from: e */
    public AbstractC0560i f1632e;

    /* JADX INFO: renamed from: f */
    public AbstractC0562j f1633f;

    /* JADX INFO: renamed from: g */
    public C0589w0 f1634g;

    /* JADX INFO: renamed from: h */
    public List f1635h;

    /* JADX INFO: renamed from: i */
    public C0686S f1636i;

    /* JADX INFO: renamed from: j */
    public final C0586v f1637j;

    /* JADX INFO: renamed from: k */
    public final C0567l0 f1638k;

    /* JADX INFO: renamed from: l */
    public final C0556g f1639l;

    /* JADX INFO: renamed from: m */
    public final long f1640m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C0708Z0 f1641n;

    static {
        Logger.getLogger(C0705Y0.class.getName());
        f1627o = new C0675O(0);
    }

    public C0705Y0(C0708Z0 c0708z0, C0586v c0586v, C0567l0 c0567l0, C0556g c0556g) {
        ScheduledFuture<?> scheduledFutureSchedule;
        this.f1641n = c0708z0;
        C0720c1 c0720c1 = c0708z0.f1656d;
        Logger logger = C0720c1.f1736d0;
        Executor executor = c0556g.f1176b;
        executor = executor == null ? c0720c1.f1780h : executor;
        ScheduledExecutorServiceC0712a1 scheduledExecutorServiceC0712a1 = c0720c1.f1779g;
        C0588w c0588w = c0556g.f1175a;
        this.f1635h = new ArrayList();
        AbstractC0076b.m133h(executor, "callExecutor");
        this.f1629b = executor;
        AbstractC0076b.m133h(scheduledExecutorServiceC0712a1, "scheduler");
        C0586v c0586vM1342b = C0586v.m1342b();
        this.f1630c = c0586vM1342b;
        c0586vM1342b.getClass();
        if (c0588w == null) {
            scheduledFutureSchedule = null;
        } else {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long jM1347c = c0588w.m1347c();
            long jAbs = Math.abs(jM1347c);
            TimeUnit timeUnit2 = TimeUnit.SECONDS;
            long nanos = jAbs / timeUnit2.toNanos(1L);
            long jAbs2 = Math.abs(jM1347c) % timeUnit2.toNanos(1L);
            StringBuilder sb = new StringBuilder();
            if (jM1347c < 0) {
                sb.append("ClientCall started after CallOptions deadline was exceeded. Deadline has been exceeded for ");
            } else {
                sb.append("Deadline CallOptions will be exceeded in ");
            }
            sb.append(nanos);
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
            sb.append("s. ");
            scheduledFutureSchedule = scheduledExecutorServiceC0712a1.f1668s.schedule(new RunnableC0666L(0, this, sb), jM1347c, timeUnit);
        }
        this.f1628a = scheduledFutureSchedule;
        this.f1637j = c0586v;
        this.f1638k = c0567l0;
        this.f1639l = c0556g;
        c0720c1.f1768Y.getClass();
        this.f1640m = System.nanoTime();
    }

    /* JADX INFO: renamed from: a */
    public final void m1574a(C0589w0 c0589w0, boolean z) {
        AbstractC0560i abstractC0560i;
        synchronized (this) {
            try {
                AbstractC0562j abstractC0562j = this.f1633f;
                boolean z2 = true;
                if (abstractC0562j == null) {
                    C0675O c0675o = f1627o;
                    if (abstractC0562j != null) {
                        z2 = false;
                    }
                    AbstractC0076b.m137l("realCall already set to %s", z2, abstractC0562j);
                    ScheduledFuture scheduledFuture = this.f1628a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f1633f = c0675o;
                    abstractC0560i = this.f1632e;
                    this.f1634g = c0589w0;
                    z2 = false;
                } else if (z) {
                    return;
                } else {
                    abstractC0560i = null;
                }
                if (z2) {
                    m1575b(new RunnableC0666L(1, this, c0589w0));
                } else {
                    if (abstractC0560i != null) {
                        this.f1629b.execute(new C0678P(this, abstractC0560i, c0589w0));
                    }
                    m1576c();
                }
                this.f1641n.f1656d.f1785m.execute(new RunnableC0672N(this, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1575b(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f1631d) {
                    runnable.run();
                } else {
                    this.f1635h.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1576c() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.f1635h     // Catch: java.lang.Throwable -> L24
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            r0 = 0
            r3.f1635h = r0     // Catch: java.lang.Throwable -> L24
            r0 = 1
            r3.f1631d = r0     // Catch: java.lang.Throwable -> L24
            T.S r0 = r3.f1636i     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f1629b
            T.w r2 = new T.w
            r2.<init>(r3, r0)
            r1.execute(r2)
        L23:
            return
        L24:
            r0 = move-exception
            goto L44
        L26:
            java.util.List r1 = r3.f1635h     // Catch: java.lang.Throwable -> L24
            r3.f1635h = r0     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r0 = r1.iterator()
        L2f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2f
        L3f:
            r1.clear()
            r0 = r1
            goto L5
        L44:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p034T.C0705Y0.m1576c():void");
    }

    @Override // p030R.AbstractC0562j
    public final void cancel(String str, Throwable th) {
        C0589w0 c0589w0 = C0589w0.f1276f;
        C0589w0 c0589w0M1354g = str != null ? c0589w0.m1354g(str) : c0589w0.m1354g("Call cancelled without message");
        if (th != null) {
            c0589w0M1354g = c0589w0M1354g.m1353f(th);
        }
        m1574a(c0589w0M1354g, false);
    }

    /* JADX INFO: renamed from: d */
    public final void m1577d() {
        C0797w c0797w;
        C0586v c0586vM1343a = this.f1637j.m1343a();
        try {
            C0556g c0556g = this.f1639l;
            C0084j c0084j = AbstractC0570n.f1216a;
            this.f1641n.f1656d.f1768Y.getClass();
            AbstractC0562j abstractC0562jM1582r = this.f1641n.m1582r(this.f1638k, c0556g.m1291c(c0084j, Long.valueOf(System.nanoTime() - this.f1640m)));
            this.f1637j.m1344c(c0586vM1343a);
            synchronized (this) {
                try {
                    AbstractC0562j abstractC0562j = this.f1633f;
                    if (abstractC0562j != null) {
                        c0797w = null;
                    } else {
                        AbstractC0076b.m137l("realCall already set to %s", abstractC0562j == null, abstractC0562j);
                        ScheduledFuture scheduledFuture = this.f1628a;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        this.f1633f = abstractC0562jM1582r;
                        c0797w = new C0797w(this, this.f1630c);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c0797w == null) {
                this.f1641n.f1656d.f1785m.execute(new RunnableC0672N(this, 1));
                return;
            }
            C0720c1 c0720c1 = this.f1641n.f1656d;
            Executor executor = this.f1639l.f1176b;
            if (executor == null) {
                executor = c0720c1.f1780h;
            }
            executor.execute(new RunnableC0666L(19, this, c0797w));
        } catch (Throwable th2) {
            this.f1637j.m1344c(c0586vM1343a);
            throw th2;
        }
    }

    @Override // p030R.AbstractC0562j
    public final C0546b getAttributes() {
        AbstractC0562j abstractC0562j;
        synchronized (this) {
            abstractC0562j = this.f1633f;
        }
        return abstractC0562j != null ? abstractC0562j.getAttributes() : C0546b.f1154b;
    }

    @Override // p030R.AbstractC0562j
    public final void halfClose() {
        m1575b(new RunnableC0672N(this, 0));
    }

    @Override // p030R.AbstractC0562j
    public final boolean isReady() {
        if (this.f1631d) {
            return this.f1633f.isReady();
        }
        return false;
    }

    @Override // p030R.AbstractC0562j
    public final void request(int i2) {
        if (this.f1631d) {
            this.f1633f.request(i2);
        } else {
            m1575b(new RunnableC0726e(this, i2, 1));
        }
    }

    @Override // p030R.AbstractC0562j
    public final void sendMessage(Object obj) {
        if (this.f1631d) {
            this.f1633f.sendMessage(obj);
        } else {
            m1575b(new RunnableC0666L(2, this, obj));
        }
    }

    @Override // p030R.AbstractC0562j
    public final void setMessageCompression(boolean z) {
        if (this.f1631d) {
            this.f1633f.setMessageCompression(z);
        } else {
            m1575b(new RunnableC0669M(this, z, 0));
        }
    }

    @Override // p030R.AbstractC0562j
    public final void start(AbstractC0560i abstractC0560i, C0559h0 c0559h0) {
        C0589w0 c0589w0;
        boolean z;
        AbstractC0076b.m139n(this.f1632e == null, "already started");
        synchronized (this) {
            try {
                AbstractC0076b.m133h(abstractC0560i, "listener");
                this.f1632e = abstractC0560i;
                c0589w0 = this.f1634g;
                z = this.f1631d;
                if (!z) {
                    C0686S c0686s = new C0686S(abstractC0560i);
                    this.f1636i = c0686s;
                    abstractC0560i = c0686s;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0589w0 != null) {
            this.f1629b.execute(new C0678P(this, abstractC0560i, c0589w0));
        } else if (z) {
            this.f1633f.start(abstractC0560i, c0559h0);
        } else {
            m1575b(new RunnableC0591x0(this, abstractC0560i, c0559h0, 1));
        }
    }

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m158b(this.f1633f, "realCall");
        return c0087mM143s.toString();
    }
}
