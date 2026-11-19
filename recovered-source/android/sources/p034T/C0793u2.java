package p034T;

import io.grpc.StatusRuntimeException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import p001B.AbstractC0076b;
import p001B.C0087m;
import p001B.C0092r;
import p030R.C0540W;
import p030R.C0549c0;
import p030R.C0559h0;
import p030R.C0589w0;

/* JADX INFO: renamed from: T.u2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0793u2 implements InterfaceC0636B {

    /* JADX INFO: renamed from: v */
    public static final C0785s2 f2058v = new C0785s2(18);

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f2059s;

    /* JADX INFO: renamed from: t */
    public final Object f2060t;

    /* JADX INFO: renamed from: u */
    public final Object f2061u;

    public /* synthetic */ C0793u2(int i2, Object obj, Object obj2) {
        this.f2059s = i2;
        this.f2061u = obj;
        this.f2060t = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x022d  */
    @Override // p034T.InterfaceC0636B
    /* JADX INFO: renamed from: a */
    public void mo148a(C0589w0 c0589w0, EnumC0633A enumC0633A, C0559h0 c0559h0) {
        boolean z;
        C0694U1 c0694u1;
        C0684R0 c0684r0;
        C0637B0 c0637b0;
        switch (this.f2059s) {
            case 2:
                C0742i c0742i = ((C0801x0) this.f2061u).f2090b.f2111b;
                if (c0589w0.m1352e()) {
                    ((InterfaceC0670M0) c0742i.f1888u).mo1516a();
                } else {
                    ((InterfaceC0670M0) c0742i.f1889v).mo1516a();
                }
                ((InterfaceC0636B) this.f2060t).mo148a(c0589w0, enumC0633A, c0559h0);
                return;
            default:
                Integer numValueOf = -1;
                synchronized (((C0684R0) this.f2061u).f1545i) {
                    C0684R0 c0684r1 = (C0684R0) this.f2061u;
                    c0684r1.f1551o = c0684r1.f1551o.m1571d((C0709Z1) this.f2060t);
                    ((C0684R0) this.f2061u).f1550n.f2033b.add(String.valueOf(c0589w0.f1287a));
                    break;
                }
                if (((C0684R0) this.f2061u).f1554r.decrementAndGet() == Integer.MIN_VALUE) {
                    ((C0684R0) this.f2061u).f1539c.execute(new RunnableC0706Y1(this, 0));
                    return;
                }
                C0709Z1 c0709z1 = (C0709Z1) this.f2060t;
                if (c0709z1.f1659c) {
                    C0684R0 c0684r2 = (C0684R0) this.f2061u;
                    RunnableC0668L1 runnableC0668L1M1552o = c0684r2.m1552o(c0709z1);
                    if (runnableC0668L1M1552o != null) {
                        c0684r2.f1538b.execute(runnableC0668L1M1552o);
                    }
                    if (((C0684R0) this.f2061u).f1551o.f1614f == ((C0709Z1) this.f2060t)) {
                        ((C0684R0) this.f2061u).m1558u(c0589w0, enumC0633A, c0559h0);
                        return;
                    }
                    return;
                }
                EnumC0633A enumC0633A2 = EnumC0633A.f1394v;
                if (enumC0633A == enumC0633A2 && ((C0684R0) this.f2061u).f1553q.incrementAndGet() > 1000) {
                    C0684R0 c0684r3 = (C0684R0) this.f2061u;
                    RunnableC0668L1 runnableC0668L1M1552o2 = c0684r3.m1552o((C0709Z1) this.f2060t);
                    if (runnableC0668L1M1552o2 != null) {
                        c0684r3.f1538b.execute(runnableC0668L1M1552o2);
                    }
                    if (((C0684R0) this.f2061u).f1551o.f1614f == ((C0709Z1) this.f2060t)) {
                        ((C0684R0) this.f2061u).m1558u(C0589w0.f1283m.m1354g("Too many transparent retries. Might be a bug in gRPC").m1353f(new StatusRuntimeException(c0589w0)), enumC0633A, c0559h0);
                        return;
                    }
                    return;
                }
                if (((C0684R0) this.f2061u).f1551o.f1614f == null) {
                    if (enumC0633A == enumC0633A2 || (enumC0633A == EnumC0633A.f1392t && ((C0684R0) this.f2061u).f1552p.compareAndSet(false, true))) {
                        C0709Z1 c0709z1M1553p = ((C0684R0) this.f2061u).m1553p(((C0709Z1) this.f2060t).f1660d, true);
                        if (c0709z1M1553p == null) {
                            return;
                        }
                        C0684R0 c0684r4 = (C0684R0) this.f2061u;
                        if (c0684r4.f1544h) {
                            synchronized (c0684r4.f1545i) {
                                C0684R0 c0684r5 = (C0684R0) this.f2061u;
                                c0684r5.f1551o = c0684r5.f1551o.m1570c((C0709Z1) this.f2060t, c0709z1M1553p);
                                break;
                            }
                        }
                        ((C0684R0) this.f2061u).f1538b.execute(new RunnableC0703X1(this, c0709z1M1553p, 1));
                        return;
                    }
                    if (enumC0633A == EnumC0633A.f1393u) {
                        C0684R0 c0684r6 = (C0684R0) this.f2061u;
                        if (c0684r6.f1544h) {
                            c0684r6.m1556s();
                        }
                    } else {
                        ((C0684R0) this.f2061u).f1552p.set(true);
                        C0684R0 c0684r7 = (C0684R0) this.f2061u;
                        if (c0684r7.f1544h) {
                            String str = (String) c0559h0.m1307c(C0684R0.f1530F);
                            if (str != null) {
                                try {
                                    numValueOf = Integer.valueOf(str);
                                    break;
                                } catch (NumberFormatException unused) {
                                }
                            } else {
                                numValueOf = null;
                            }
                            C0684R0 c0684r8 = (C0684R0) this.f2061u;
                            boolean zContains = c0684r8.f1543g.f1973c.contains(c0589w0.f1287a);
                            boolean z2 = (c0684r8.f1549m == null || (!zContains && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !c0684r8.f1549m.m1584a();
                            if (zContains && !z2 && !c0589w0.m1352e() && numValueOf != null && numValueOf.intValue() > 0) {
                                numValueOf = 0;
                            }
                            boolean z3 = zContains && !z2;
                            if (z3) {
                                C0684R0.m1538n((C0684R0) this.f2061u, numValueOf);
                            }
                            synchronized (((C0684R0) this.f2061u).f1545i) {
                                try {
                                    C0684R0 c0684r9 = (C0684R0) this.f2061u;
                                    c0684r9.f1551o = c0684r9.f1551o.m1569b((C0709Z1) this.f2060t);
                                    if (z3) {
                                        C0684R0 c0684r10 = (C0684R0) this.f2061u;
                                        if (!c0684r10.m1557t(c0684r10.f1551o)) {
                                            if (!((C0684R0) this.f2061u).f1551o.f1612d.isEmpty()) {
                                            }
                                        }
                                        return;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } else {
                            C0717b2 c0717b2 = c0684r7.f1542f;
                            long nanos = 0;
                            if (c0717b2 == null) {
                                c0694u1 = new C0694U1(false, 0L);
                            } else {
                                boolean zContains2 = c0717b2.f1704f.contains(c0589w0.f1287a);
                                String str2 = (String) c0559h0.m1307c(C0684R0.f1530F);
                                if (str2 != null) {
                                    try {
                                        numValueOf = Integer.valueOf(str2);
                                        break;
                                    } catch (NumberFormatException unused2) {
                                    }
                                } else {
                                    numValueOf = null;
                                }
                                boolean z4 = (c0684r7.f1549m == null || (!zContains2 && (numValueOf == null || numValueOf.intValue() >= 0))) ? false : !c0684r7.f1549m.m1584a();
                                if (c0684r7.f1542f.f1699a <= ((C0709Z1) this.f2060t).f1660d + 1 || z4) {
                                    z = false;
                                } else if (numValueOf == null) {
                                    if (zContains2) {
                                        nanos = (long) (C0684R0.f1532H.nextDouble() * c0684r7.f1560x);
                                        double d = c0684r7.f1560x;
                                        C0717b2 c0717b3 = c0684r7.f1542f;
                                        c0684r7.f1560x = Math.min((long) (d * c0717b3.f1702d), c0717b3.f1701c);
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                } else if (numValueOf.intValue() >= 0) {
                                    nanos = TimeUnit.MILLISECONDS.toNanos(numValueOf.intValue());
                                    c0684r7.f1560x = c0684r7.f1542f.f1700b;
                                    z = true;
                                } else {
                                    z = false;
                                }
                                c0694u1 = new C0694U1(z, nanos);
                            }
                            if (c0694u1.f1587a) {
                                C0709Z1 c0709z1M1553p2 = ((C0684R0) this.f2061u).m1553p(((C0709Z1) this.f2060t).f1660d + 1, false);
                                if (c0709z1M1553p2 == null) {
                                    return;
                                }
                                synchronized (((C0684R0) this.f2061u).f1545i) {
                                    c0684r0 = (C0684R0) this.f2061u;
                                    c0637b0 = new C0637B0(c0684r0.f1545i);
                                    c0684r0.f1558v = c0637b0;
                                    break;
                                }
                                c0637b0.m1479a(c0684r0.f1540d.schedule(new RunnableC0703X1(this, c0709z1M1553p2, 0), c0694u1.f1588b, TimeUnit.NANOSECONDS));
                                return;
                            }
                        }
                    }
                }
                C0684R0 c0684r11 = (C0684R0) this.f2061u;
                RunnableC0668L1 runnableC0668L1M1552o3 = c0684r11.m1552o((C0709Z1) this.f2060t);
                if (runnableC0668L1M1552o3 != null) {
                    c0684r11.f1538b.execute(runnableC0668L1M1552o3);
                }
                if (((C0684R0) this.f2061u).f1551o.f1614f == ((C0709Z1) this.f2060t)) {
                    ((C0684R0) this.f2061u).m1558u(c0589w0, enumC0633A, c0559h0);
                    return;
                }
                return;
        }
    }

    @Override // p034T.InterfaceC0636B
    /* JADX INFO: renamed from: b */
    public void mo149b(C0559h0 c0559h0) {
        int i2;
        int i3;
        switch (this.f2059s) {
            case 2:
                ((InterfaceC0636B) this.f2060t).mo149b(c0559h0);
                break;
            default:
                if (((C0709Z1) this.f2060t).f1660d > 0) {
                    C0549c0 c0549c0 = C0684R0.f1529E;
                    c0559h0.m1305a(c0549c0);
                    c0559h0.m1310f(c0549c0, String.valueOf(((C0709Z1) this.f2060t).f1660d));
                }
                C0684R0 c0684r0 = (C0684R0) this.f2061u;
                C0709Z1 c0709z1 = (C0709Z1) this.f2060t;
                C0549c0 c0549c1 = C0684R0.f1529E;
                RunnableC0668L1 runnableC0668L1M1552o = c0684r0.m1552o(c0709z1);
                if (runnableC0668L1M1552o != null) {
                    c0684r0.f1538b.execute(runnableC0668L1M1552o);
                }
                if (((C0684R0) this.f2061u).f1551o.f1614f == ((C0709Z1) this.f2060t)) {
                    C0713a2 c0713a2 = ((C0684R0) this.f2061u).f1549m;
                    if (c0713a2 != null) {
                        AtomicInteger atomicInteger = c0713a2.f1672d;
                        do {
                            i2 = atomicInteger.get();
                            i3 = c0713a2.f1669a;
                            if (i2 == i3) {
                            }
                        } while (!atomicInteger.compareAndSet(i2, Math.min(c0713a2.f1671c + i2, i3)));
                    }
                    ((C0684R0) this.f2061u).f1539c.execute(new RunnableC0666L(22, this, c0559h0));
                }
                break;
        }
    }

    @Override // p034T.InterfaceC0636B
    /* JADX INFO: renamed from: c */
    public void mo150c(C0092r c0092r) {
        switch (this.f2059s) {
            case 2:
                ((InterfaceC0636B) this.f2060t).mo150c(c0092r);
                break;
            default:
                C0700W1 c0700w1 = ((C0684R0) this.f2061u).f1551o;
                AbstractC0076b.m139n(c0700w1.f1614f != null, "Headers should be received prior to messages.");
                if (c0700w1.f1614f == ((C0709Z1) this.f2060t)) {
                    ((C0684R0) this.f2061u).f1539c.execute(new RunnableC0666L(23, this, c0092r));
                } else {
                    Logger logger = AbstractC0759m0.f1919a;
                    while (true) {
                        InputStream inputStreamM165e = c0092r.m165e();
                        if (inputStreamM165e != null) {
                            AbstractC0759m0.m1621b(inputStreamM165e);
                        }
                    }
                }
                break;
        }
    }

    @Override // p034T.InterfaceC0636B
    /* JADX INFO: renamed from: d */
    public void mo151d() {
        switch (this.f2059s) {
            case 2:
                ((InterfaceC0636B) this.f2060t).mo151d();
                break;
            default:
                C0684R0 c0684r0 = (C0684R0) this.f2061u;
                if (c0684r0.isReady()) {
                    c0684r0.f1539c.execute(new RunnableC0706Y1(this, 1));
                    break;
                }
                break;
        }
    }

    public String toString() {
        switch (this.f2059s) {
            case 2:
                C0087m c0087mM143s = AbstractC0076b.m143s(this);
                c0087mM143s.m158b((InterfaceC0636B) this.f2060t, "delegate");
                return c0087mM143s.toString();
            default:
                return super.toString();
        }
    }

    public C0793u2() {
        this.f2059s = 0;
        this.f2061u = AbstractC0761m2.m1632n();
        this.f2060t = C0785s2.f2037t;
    }

    public C0793u2(String str) {
        this.f2059s = 1;
        C0540W c0540wM1273a = C0540W.m1273a();
        AbstractC0076b.m133h(c0540wM1273a, "registry");
        this.f2060t = c0540wM1273a;
        AbstractC0076b.m133h(str, "defaultPolicy");
        this.f2061u = str;
    }
}
