package p034T;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p001B.AbstractC0076b;
import p001B.C0086l;
import p030R.AbstractC0553e0;
import p030R.AbstractC0570n;
import p030R.C0546b;
import p030R.C0549c0;
import p030R.C0554f;
import p030R.C0556g;
import p030R.C0559h0;
import p030R.C0567l0;
import p030R.C0572o;
import p030R.C0586v;
import p030R.C0588w;
import p030R.C0589w0;
import p030R.C0592y;
import p030R.ExecutorC0517A0;
import p030R.InterfaceC0574p;
import p041Y.C0873a;

/* JADX INFO: renamed from: T.R0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0684R0 implements InterfaceC0806z {

    /* JADX INFO: renamed from: E */
    public static final C0549c0 f1529E;

    /* JADX INFO: renamed from: F */
    public static final C0549c0 f1530F;

    /* JADX INFO: renamed from: G */
    public static final C0589w0 f1531G;

    /* JADX INFO: renamed from: H */
    public static final Random f1532H;

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ C0567l0 f1533A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ C0556g f1534B;

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ C0586v f1535C;

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ C0660J f1536D;

    /* JADX INFO: renamed from: a */
    public final C0567l0 f1537a;

    /* JADX INFO: renamed from: b */
    public final Executor f1538b;

    /* JADX INFO: renamed from: c */
    public final ExecutorC0517A0 f1539c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f1540d;

    /* JADX INFO: renamed from: e */
    public final C0559h0 f1541e;

    /* JADX INFO: renamed from: f */
    public final C0717b2 f1542f;

    /* JADX INFO: renamed from: g */
    public final C0767o0 f1543g;

    /* JADX INFO: renamed from: h */
    public final boolean f1544h;

    /* JADX INFO: renamed from: i */
    public final Object f1545i;

    /* JADX INFO: renamed from: j */
    public final C0738h f1546j;

    /* JADX INFO: renamed from: k */
    public final long f1547k;

    /* JADX INFO: renamed from: l */
    public final long f1548l;

    /* JADX INFO: renamed from: m */
    public final C0713a2 f1549m;

    /* JADX INFO: renamed from: n */
    public final C0783s0 f1550n;

    /* JADX INFO: renamed from: o */
    public volatile C0700W1 f1551o;

    /* JADX INFO: renamed from: p */
    public final AtomicBoolean f1552p;

    /* JADX INFO: renamed from: q */
    public final AtomicInteger f1553q;

    /* JADX INFO: renamed from: r */
    public final AtomicInteger f1554r;

    /* JADX INFO: renamed from: s */
    public C0086l f1555s;

    /* JADX INFO: renamed from: t */
    public long f1556t;

    /* JADX INFO: renamed from: u */
    public InterfaceC0636B f1557u;

    /* JADX INFO: renamed from: v */
    public C0637B0 f1558v;

    /* JADX INFO: renamed from: w */
    public C0637B0 f1559w;

    /* JADX INFO: renamed from: x */
    public long f1560x;

    /* JADX INFO: renamed from: y */
    public C0589w0 f1561y;

    /* JADX INFO: renamed from: z */
    public boolean f1562z;

    static {
        C0572o c0572o = C0559h0.f1187d;
        BitSet bitSet = AbstractC0553e0.f1161d;
        f1529E = new C0549c0("grpc-previous-rpc-attempts", c0572o);
        f1530F = new C0549c0("grpc-retry-pushback-ms", c0572o);
        f1531G = C0589w0.f1276f.m1354g("Stream thrown away because RetriableStream committed");
        f1532H = new Random();
    }

    public C0684R0(C0660J c0660j, C0567l0 c0567l0, C0559h0 c0559h0, C0556g c0556g, C0717b2 c0717b2, C0767o0 c0767o0, C0586v c0586v) {
        this.f1536D = c0660j;
        this.f1533A = c0567l0;
        this.f1534B = c0556g;
        this.f1535C = c0586v;
        C0720c1 c0720c1 = (C0720c1) c0660j.f1473b;
        C0738h c0738h = c0720c1.f1764U;
        long j2 = c0720c1.f1765V;
        long j3 = c0720c1.f1766W;
        Executor executor = c0556g.f1176b;
        executor = executor == null ? c0720c1.f1780h : executor;
        ScheduledExecutorService scheduledExecutorService = c0720c1.f1778f.f2014s.f2189v;
        C0713a2 c0713a2 = (C0713a2) c0660j.f1472a;
        this.f1539c = new ExecutorC0517A0(new C0665K1());
        this.f1545i = new Object();
        this.f1550n = new C0783s0(0, (byte) 0);
        this.f1551o = new C0700W1(new ArrayList(8), Collections.EMPTY_LIST, null, null, false, false, false, 0);
        this.f1552p = new AtomicBoolean();
        this.f1553q = new AtomicInteger();
        this.f1554r = new AtomicInteger();
        this.f1537a = c0567l0;
        this.f1546j = c0738h;
        this.f1547k = j2;
        this.f1548l = j3;
        this.f1538b = executor;
        this.f1540d = scheduledExecutorService;
        this.f1541e = c0559h0;
        this.f1542f = c0717b2;
        if (c0717b2 != null) {
            this.f1560x = c0717b2.f1700b;
        }
        this.f1543g = c0767o0;
        AbstractC0076b.m131f(c0717b2 == null || c0767o0 == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.f1544h = c0767o0 != null;
        this.f1549m = c0713a2;
    }

    /* JADX INFO: renamed from: n */
    public static void m1538n(C0684R0 c0684r0, Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            c0684r0.m1556s();
            return;
        }
        synchronized (c0684r0.f1545i) {
            try {
                C0637B0 c0637b0 = c0684r0.f1559w;
                if (c0637b0 == null) {
                    return;
                }
                c0637b0.f1401s = true;
                Future future = (Future) c0637b0.f1403u;
                C0637B0 c0637b1 = new C0637B0(c0684r0.f1545i);
                c0684r0.f1559w = c0637b1;
                if (future != null) {
                    future.cancel(false);
                }
                c0637b1.m1479a(c0684r0.f1540d.schedule(new RunnableC0666L(21, c0684r0, c0637b1), num.intValue(), TimeUnit.MILLISECONDS));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p034T.InterfaceC0781r2
    /* JADX INFO: renamed from: a */
    public final void mo1539a(InterfaceC0574p interfaceC0574p) {
        m1554q(new C0671M1(interfaceC0574p, 0));
    }

    @Override // p034T.InterfaceC0781r2
    /* JADX INFO: renamed from: b */
    public final void mo1540b(boolean z) {
        m1554q(new C0680P1(z));
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: c */
    public final void mo1541c(int i2) {
        m1554q(new C0677O1(i2, 1));
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: d */
    public final void mo1542d() {
        m1554q(new C0674N1(1));
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: e */
    public final void mo1543e(C0783s0 c0783s0) {
        C0700W1 c0700w1;
        synchronized (this.f1545i) {
            c0783s0.m1659c(this.f1550n, "closed");
            c0700w1 = this.f1551o;
        }
        if (c0700w1.f1614f != null) {
            C0783s0 c0783s1 = new C0783s0(0, (byte) 0);
            c0700w1.f1614f.f1657a.mo1543e(c0783s1);
            c0783s0.m1659c(c0783s1, "committed");
            return;
        }
        C0783s0 c0783s2 = new C0783s0(0, (byte) 0);
        for (C0709Z1 c0709z1 : c0700w1.f1611c) {
            C0783s0 c0783s3 = new C0783s0(0, (byte) 0);
            c0709z1.f1657a.mo1543e(c0783s3);
            c0783s2.f2033b.add(String.valueOf(c0783s3));
        }
        c0783s0.m1659c(c0783s2, "open");
    }

    @Override // p034T.InterfaceC0781r2
    /* JADX INFO: renamed from: f */
    public final void mo1544f(int i2) {
        C0700W1 c0700w1 = this.f1551o;
        if (c0700w1.f1609a) {
            c0700w1.f1614f.f1657a.mo1544f(i2);
        } else {
            m1554q(new C0677O1(i2, 2));
        }
    }

    @Override // p034T.InterfaceC0781r2
    public final void flush() {
        C0700W1 c0700w1 = this.f1551o;
        if (c0700w1.f1609a) {
            c0700w1.f1614f.f1657a.flush();
        } else {
            m1554q(new C0674N1(0));
        }
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: g */
    public final void mo1545g(int i2) {
        m1554q(new C0677O1(i2, 0));
    }

    @Override // p034T.InterfaceC0806z
    public final C0546b getAttributes() {
        return this.f1551o.f1614f != null ? this.f1551o.f1614f.f1657a.getAttributes() : C0546b.f1154b;
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: h */
    public final void mo1546h(C0588w c0588w) {
        m1554q(new C0671M1(c0588w, 1));
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: i */
    public final void mo1547i(C0592y c0592y) {
        m1554q(new C0671M1(c0592y, 2));
    }

    @Override // p034T.InterfaceC0781r2
    public final boolean isReady() {
        Iterator it = this.f1551o.f1611c.iterator();
        while (it.hasNext()) {
            if (((C0709Z1) it.next()).f1657a.isReady()) {
                return true;
            }
        }
        return false;
    }

    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: j */
    public final void mo1548j(C0589w0 c0589w0) {
        C0709Z1 c0709z1;
        C0709Z1 c0709z2 = new C0709Z1(0);
        c0709z2.f1657a = new C0776q1();
        RunnableC0668L1 runnableC0668L1M1552o = m1552o(c0709z2);
        if (runnableC0668L1M1552o != null) {
            synchronized (this.f1545i) {
                this.f1551o = this.f1551o.m1572e(c0709z2);
            }
            runnableC0668L1M1552o.run();
            m1558u(c0589w0, EnumC0633A.f1391s, new C0559h0());
            return;
        }
        synchronized (this.f1545i) {
            try {
                if (this.f1551o.f1611c.contains(this.f1551o.f1614f)) {
                    c0709z1 = this.f1551o.f1614f;
                } else {
                    this.f1561y = c0589w0;
                    c0709z1 = null;
                }
                C0700W1 c0700w1 = this.f1551o;
                this.f1551o = new C0700W1(c0700w1.f1610b, c0700w1.f1611c, c0700w1.f1612d, c0700w1.f1614f, true, c0700w1.f1609a, c0700w1.f1616h, c0700w1.f1613e);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0709z1 != null) {
            c0709z1.f1657a.mo1548j(c0589w0);
        }
    }

    @Override // p034T.InterfaceC0781r2
    /* JADX INFO: renamed from: k */
    public final void mo1549k(C0873a c0873a) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0068 A[Catch: all -> 0x0072, TryCatch #0 {all -> 0x0072, blocks: (B:27:0x0047, B:29:0x0057, B:31:0x005b, B:35:0x0068, B:38:0x0074), top: B:50:0x0047 }] */
    @Override // p034T.InterfaceC0806z
    /* JADX INFO: renamed from: l */
    public final void mo1550l(InterfaceC0636B interfaceC0636B) {
        C0589w0 c0589w0;
        C0637B0 c0637b0;
        this.f1557u = interfaceC0636B;
        C0742i c0742i = ((C0720c1) this.f1536D.f1473b).f1749F;
        synchronized (c0742i.f1886s) {
            try {
                c0589w0 = (C0589w0) c0742i.f1888u;
                c0637b0 = null;
                if (c0589w0 == null) {
                    ((HashSet) c0742i.f1887t).add(this);
                    c0589w0 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c0589w0 != null) {
            mo1548j(c0589w0);
            return;
        }
        synchronized (this.f1545i) {
            this.f1551o.f1610b.add(new C0697V1(this));
        }
        C0709Z1 c0709z1M1553p = m1553p(0, false);
        if (c0709z1M1553p == null) {
            return;
        }
        if (this.f1544h) {
            synchronized (this.f1545i) {
                try {
                    this.f1551o = this.f1551o.m1568a(c0709z1M1553p);
                    if (m1557t(this.f1551o)) {
                        C0713a2 c0713a2 = this.f1549m;
                        if (c0713a2 == null) {
                            c0637b0 = new C0637B0(this.f1545i);
                            this.f1559w = c0637b0;
                        } else {
                            if (c0713a2.f1672d.get() > c0713a2.f1670b) {
                                c0637b0 = new C0637B0(this.f1545i);
                                this.f1559w = c0637b0;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (c0637b0 != null) {
                c0637b0.m1479a(this.f1540d.schedule(new RunnableC0666L(21, this, c0637b0), this.f1543g.f1972b, TimeUnit.NANOSECONDS));
            }
        }
        m1555r(c0709z1M1553p);
    }

    @Override // p034T.InterfaceC0781r2
    /* JADX INFO: renamed from: m */
    public final void mo1551m() {
        m1554q(new C0674N1(2));
    }

    /* JADX INFO: renamed from: o */
    public final RunnableC0668L1 m1552o(C0709Z1 c0709z1) {
        List list;
        boolean z;
        Collection collectionSingleton;
        Future future;
        Future future2;
        synchronized (this.f1545i) {
            try {
                if (this.f1551o.f1614f != null) {
                    return null;
                }
                Collection collection = this.f1551o.f1611c;
                C0700W1 c0700w1 = this.f1551o;
                AbstractC0076b.m139n(c0700w1.f1614f == null, "Already committed");
                List list2 = c0700w1.f1610b;
                if (c0700w1.f1611c.contains(c0709z1)) {
                    list = null;
                    collectionSingleton = Collections.singleton(c0709z1);
                    z = true;
                } else {
                    list = list2;
                    z = false;
                    collectionSingleton = Collections.EMPTY_LIST;
                }
                this.f1551o = new C0700W1(list, collectionSingleton, c0700w1.f1612d, c0709z1, c0700w1.f1615g, z, c0700w1.f1616h, c0700w1.f1613e);
                this.f1546j.f1883a.addAndGet(-this.f1556t);
                C0637B0 c0637b0 = this.f1558v;
                if (c0637b0 != null) {
                    c0637b0.f1401s = true;
                    Future future3 = (Future) c0637b0.f1403u;
                    this.f1558v = null;
                    future = future3;
                } else {
                    future = null;
                }
                C0637B0 c0637b1 = this.f1559w;
                if (c0637b1 != null) {
                    c0637b1.f1401s = true;
                    Future future4 = (Future) c0637b1.f1403u;
                    this.f1559w = null;
                    future2 = future4;
                } else {
                    future2 = null;
                }
                return new RunnableC0668L1(this, collection, c0709z1, future, future2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final C0709Z1 m1553p(int i2, boolean z) {
        AtomicInteger atomicInteger;
        int i3;
        do {
            atomicInteger = this.f1554r;
            i3 = atomicInteger.get();
            if (i3 < 0) {
                return null;
            }
        } while (!atomicInteger.compareAndSet(i3, i3 + 1));
        C0709Z1 c0709z1 = new C0709Z1(i2);
        C0685R1 c0685r1 = new C0685R1(new C0691T1(this, c0709z1));
        C0559h0 c0559h0 = new C0559h0();
        c0559h0.m1308d(this.f1541e);
        if (i2 > 0) {
            c0559h0.m1310f(f1529E, String.valueOf(i2));
        }
        C0556g c0556g = this.f1534B;
        c0556g.getClass();
        List list = c0556g.f1179e;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(c0685r1);
        C0554f c0554fM1289b = C0556g.m1289b(c0556g);
        c0554fM1289b.f1169e = Collections.unmodifiableList(arrayList);
        C0556g c0556g2 = new C0556g(c0554fM1289b);
        AbstractC0570n[] abstractC0570nArrM1622c = AbstractC0759m0.m1622c(c0556g2, c0559h0, i2, z);
        C0567l0 c0567l0 = this.f1533A;
        InterfaceC0639C interfaceC0639CM1517a = this.f1536D.m1517a(new C0641C1(c0567l0, c0559h0, c0556g2));
        C0586v c0586v = this.f1535C;
        C0586v c0586vM1343a = c0586v.m1343a();
        try {
            InterfaceC0806z interfaceC0806zMo1483c = interfaceC0639CM1517a.mo1483c(c0567l0, c0559h0, c0556g2, abstractC0570nArrM1622c);
            c0586v.m1344c(c0586vM1343a);
            c0709z1.f1657a = interfaceC0806zMo1483c;
            return c0709z1;
        } catch (Throwable th) {
            c0586v.m1344c(c0586vM1343a);
            throw th;
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m1554q(InterfaceC0688S1 interfaceC0688S1) {
        Collection collection;
        synchronized (this.f1545i) {
            try {
                if (!this.f1551o.f1609a) {
                    this.f1551o.f1610b.add(interfaceC0688S1);
                }
                collection = this.f1551o.f1611c;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            interfaceC0688S1.mo1523a((C0709Z1) it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
    
        r2 = r3.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
    
        if (r5 >= r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0093, code lost:
    
        r6 = r3.get(r5);
        r5 = r5 + 1;
        r6 = (p034T.InterfaceC0688S1) r6;
        r6.mo1523a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a0, code lost:
    
        if ((r6 instanceof p034T.C0697V1) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a2, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a3, code lost:
    
        r6 = r9.f1551o;
        r8 = r6.f1614f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a7, code lost:
    
        if (r8 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a9, code lost:
    
        if (r8 == r10) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ae, code lost:
    
        if (r6.f1615g == false) goto L66;
     */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1555r(p034T.C0709Z1 r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r4 = r2
            r3 = r1
        L5:
            java.lang.Object r5 = r9.f1545i
            monitor-enter(r5)
            T.W1 r6 = r9.f1551o     // Catch: java.lang.Throwable -> L12
            T.Z1 r7 = r6.f1614f     // Catch: java.lang.Throwable -> L12
            if (r7 == 0) goto L15
            if (r7 == r10) goto L15
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            goto L39
        L12:
            r10 = move-exception
            goto Lb3
        L15:
            boolean r7 = r6.f1615g     // Catch: java.lang.Throwable -> L12
            if (r7 == 0) goto L1b
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            goto L39
        L1b:
            java.util.List r7 = r6.f1610b     // Catch: java.lang.Throwable -> L12
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L12
            if (r2 != r7) goto L5f
            T.W1 r0 = r6.m1572e(r10)     // Catch: java.lang.Throwable -> L12
            r9.f1551o = r0     // Catch: java.lang.Throwable -> L12
            boolean r0 = r9.isReady()     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L31
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            return
        L31:
            T.Q r1 = new T.Q     // Catch: java.lang.Throwable -> L12
            r0 = 8
            r1.<init>(r9, r0)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
        L39:
            if (r1 == 0) goto L41
            R.A0 r10 = r9.f1539c
            r10.execute(r1)
            return
        L41:
            if (r4 != 0) goto L4e
            T.z r0 = r10.f1657a
            T.u2 r1 = new T.u2
            r2 = 4
            r1.<init>(r2, r9, r10)
            r0.mo1550l(r1)
        L4e:
            T.z r0 = r10.f1657a
            T.W1 r1 = r9.f1551o
            T.Z1 r1 = r1.f1614f
            if (r1 != r10) goto L59
            R.w0 r10 = r9.f1561y
            goto L5b
        L59:
            R.w0 r10 = p034T.C0684R0.f1531G
        L5b:
            r0.mo1548j(r10)
            return
        L5f:
            boolean r7 = r10.f1658b     // Catch: java.lang.Throwable -> L12
            if (r7 == 0) goto L65
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            return
        L65:
            int r7 = r2 + 128
            java.util.List r8 = r6.f1610b     // Catch: java.lang.Throwable -> L12
            int r8 = r8.size()     // Catch: java.lang.Throwable -> L12
            int r7 = java.lang.Math.min(r7, r8)     // Catch: java.lang.Throwable -> L12
            if (r3 != 0) goto L7f
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L12
            java.util.List r6 = r6.f1610b     // Catch: java.lang.Throwable -> L12
            java.util.List r2 = r6.subList(r2, r7)     // Catch: java.lang.Throwable -> L12
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L12
            goto L8b
        L7f:
            r3.clear()     // Catch: java.lang.Throwable -> L12
            java.util.List r6 = r6.f1610b     // Catch: java.lang.Throwable -> L12
            java.util.List r2 = r6.subList(r2, r7)     // Catch: java.lang.Throwable -> L12
            r3.addAll(r2)     // Catch: java.lang.Throwable -> L12
        L8b:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            int r2 = r3.size()
            r5 = r0
        L91:
            if (r5 >= r2) goto Lb0
            java.lang.Object r6 = r3.get(r5)
            int r5 = r5 + 1
            T.S1 r6 = (p034T.InterfaceC0688S1) r6
            r6.mo1523a(r10)
            boolean r6 = r6 instanceof p034T.C0697V1
            if (r6 == 0) goto La3
            r4 = 1
        La3:
            T.W1 r6 = r9.f1551o
            T.Z1 r8 = r6.f1614f
            if (r8 == 0) goto Lac
            if (r8 == r10) goto Lac
            goto Lb0
        Lac:
            boolean r6 = r6.f1615g
            if (r6 == 0) goto L91
        Lb0:
            r2 = r7
            goto L5
        Lb3:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p034T.C0684R0.m1555r(T.Z1):void");
    }

    /* JADX INFO: renamed from: s */
    public final void m1556s() {
        Future future;
        synchronized (this.f1545i) {
            try {
                C0637B0 c0637b0 = this.f1559w;
                future = null;
                if (c0637b0 != null) {
                    c0637b0.f1401s = true;
                    Future future2 = (Future) c0637b0.f1403u;
                    this.f1559w = null;
                    future = future2;
                }
                C0700W1 c0700w1 = this.f1551o;
                if (!c0700w1.f1616h) {
                    c0700w1 = new C0700W1(c0700w1.f1610b, c0700w1.f1611c, c0700w1.f1612d, c0700w1.f1614f, c0700w1.f1615g, c0700w1.f1609a, true, c0700w1.f1613e);
                }
                this.f1551o = c0700w1;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m1557t(C0700W1 c0700w1) {
        return c0700w1.f1614f == null && c0700w1.f1613e < this.f1543g.f1971a && !c0700w1.f1616h;
    }

    /* JADX INFO: renamed from: u */
    public final void m1558u(C0589w0 c0589w0, EnumC0633A enumC0633A, C0559h0 c0559h0) {
        this.f1555s = new C0086l(c0589w0, enumC0633A, c0559h0, 4);
        if (this.f1554r.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.f1539c.execute(new RunnableC0710a(this, c0589w0, enumC0633A, c0559h0, 2));
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m1559v(Object obj) {
        C0700W1 c0700w1 = this.f1551o;
        if (c0700w1.f1609a) {
            c0700w1.f1614f.f1657a.mo1549k(this.f1537a.m1320d(obj));
        } else {
            m1554q(new C0683Q1(this, obj));
        }
    }
}
