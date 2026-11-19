package p034T;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001B.AbstractC0076b;
import p001B.C0086l;
import p001B.C0092r;
import p001B.C0096v;
import p006D0.C0177l;
import p030R.AbstractC0527I;
import p030R.AbstractC0538U;
import p030R.AbstractC0539V;
import p030R.AbstractC0558h;
import p030R.AbstractC0562j;
import p030R.C0523E;
import p030R.C0535Q;
import p030R.C0540W;
import p030R.C0544a;
import p030R.C0546b;
import p030R.C0559h0;
import p030R.C0571n0;
import p030R.C0573o0;
import p030R.C0580s;
import p030R.C0588w;
import p030R.C0589w0;
import p030R.C0592y;
import p030R.C0594z;
import p030R.EnumC0578r;
import p030R.ExecutorC0517A0;
import p030R.InterfaceC0574p;
import p041Y.C0873a;

/* JADX INFO: renamed from: T.L */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0666L implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f1495s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f1496t;

    /* JADX INFO: renamed from: u */
    public final Object f1497u;

    public /* synthetic */ RunnableC0666L(int i2, Object obj, Object obj2) {
        this.f1495s = i2;
        this.f1496t = obj;
        this.f1497u = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b6 A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:15:0x0058, B:36:0x00e7, B:18:0x0066, B:20:0x0086, B:22:0x0092, B:27:0x00a0, B:31:0x00b6, B:35:0x00da, B:34:0x00c5), top: B:290:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5 A[Catch: all -> 0x00b3, TryCatch #2 {all -> 0x00b3, blocks: (B:15:0x0058, B:36:0x00e7, B:18:0x0066, B:20:0x0086, B:22:0x0092, B:27:0x00a0, B:31:0x00b6, B:35:0x00da, B:34:0x00c5), top: B:290:0x0058 }] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        RunnableC0669M runnableC0669M;
        C0571n0 c0571n0;
        List listSingletonList;
        C0804y0 c0804y0;
        C0589w0 c0589w0Mo1264a;
        Object obj;
        C0700W1 c0700w1;
        C0086l c0086l = null;
        c0637b0 = null;
        C0637B0 c0637b0 = null;
        c0086l = null;
        c0086l = null;
        int i2 = 2;
        boolean z = true;
        char c = 1;
        char c2 = 1;
        int i3 = 0;
        switch (this.f1495s) {
            case 0:
                ((C0705Y0) this.f1496t).m1574a(C0589w0.f1278h.m1354g(((StringBuilder) this.f1497u).toString()), true);
                return;
            case 1:
                AbstractC0562j abstractC0562j = ((C0705Y0) this.f1496t).f1633f;
                C0589w0 c0589w0 = (C0589w0) this.f1497u;
                abstractC0562j.cancel(c0589w0.f1288b, c0589w0.f1289c);
                return;
            case 2:
                ((C0705Y0) this.f1496t).f1633f.sendMessage(this.f1497u);
                return;
            case 3:
                ((C0686S) this.f1496t).f1564a.onHeaders((C0559h0) this.f1497u);
                return;
            case 4:
                ((C0686S) this.f1496t).f1564a.onMessage(this.f1497u);
                return;
            case 5:
                AbstractC0076b.m139n(((C0720c1) ((C0695V) this.f1496t).f1596h.f130t).f1750G.get(), "Channel must have been shut down");
                return;
            case 6:
                ((C0707Z) this.f1496t).f1646c.mo1539a((InterfaceC0574p) this.f1497u);
                return;
            case 7:
                ((C0707Z) this.f1496t).f1646c.mo1547i((C0592y) this.f1497u);
                return;
            case 8:
                ((C0707Z) this.f1496t).f1646c.mo1546h((C0588w) this.f1497u);
                return;
            case 9:
                ((C0707Z) this.f1496t).f1646c.mo1549k((C0873a) this.f1497u);
                return;
            case 10:
                ((C0707Z) this.f1496t).f1646c.mo1548j((C0589w0) this.f1497u);
                return;
            case 11:
                ((C0704Y) this.f1496t).f1624s.mo150c((C0092r) this.f1497u);
                return;
            case 12:
                ((C0704Y) this.f1496t).f1624s.mo149b((C0559h0) this.f1497u);
                return;
            case 13:
                AbstractC0558h abstractC0558h = (AbstractC0558h) this.f1497u;
                C0719c0 c0719c0 = (C0719c0) this.f1496t;
                String str = c0719c0.f1723f;
                ExecutorC0517A0 executorC0517A0 = c0719c0.f1727j;
                Logger logger = C0719c0.f1712s;
                Level level = Level.FINER;
                if (logger.isLoggable(level)) {
                    logger.finer("Attempting DNS resolution of " + str);
                }
                try {
                    try {
                        C0523E c0523eMo1340a = c0719c0.f1718a.mo1340a(InetSocketAddress.createUnresolved(str, c0719c0.f1724g));
                        C0594z c0594z = c0523eMo1340a != null ? new C0594z(c0523eMo1340a) : null;
                        List list = Collections.EMPTY_LIST;
                        C0546b c0546b = C0546b.f1154b;
                        if (c0594z == null) {
                            C0086l c0086lM1595r = c0719c0.m1595r();
                            try {
                                C0589w0 c0589w1 = (C0589w0) c0086lM1595r.f112t;
                                if (c0589w1 != null) {
                                    abstractC0558h.mo1301h(c0589w1);
                                    runnableC0669M = new RunnableC0669M(this, ((C0589w0) c0086lM1595r.f112t) == null, i2);
                                } else {
                                    List list2 = (List) c0086lM1595r.f113u;
                                    if (list2 != null) {
                                        list = list2;
                                    }
                                    C0571n0 c0571n1 = (C0571n0) c0086lM1595r.f114v;
                                    c0571n0 = c0571n1 != null ? c0571n1 : null;
                                    c0086l = c0086lM1595r;
                                    listSingletonList = list;
                                }
                            } catch (IOException e) {
                                e = e;
                                c0086l = c0086lM1595r;
                                abstractC0558h.mo1301h(C0589w0.f1284n.m1354g("Unable to resolve host " + str).m1353f(e));
                                runnableC0669M = new RunnableC0669M(this, c0086l != null && ((C0589w0) c0086l.f112t) == null, i2);
                            } catch (Throwable th) {
                                th = th;
                                c0086l = c0086lM1595r;
                                executorC0517A0.execute(new RunnableC0669M(this, c0086l != null && ((C0589w0) c0086l.f112t) == null, i2));
                                throw th;
                            }
                            executorC0517A0.execute(runnableC0669M);
                            return;
                        }
                        if (logger.isLoggable(level)) {
                            logger.finer("Using proxy address " + c0594z);
                        }
                        listSingletonList = Collections.singletonList(c0594z);
                        c0571n0 = null;
                        abstractC0558h.mo1302i(new C0573o0(listSingletonList, c0546b, c0571n0));
                        runnableC0669M = new RunnableC0669M(this, c0086l != null && ((C0589w0) c0086l.f112t) == null, i2);
                    } catch (IOException e2) {
                        e = e2;
                    }
                    executorC0517A0.execute(runnableC0669M);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
            case 14:
                C0807z0 c0807z0 = ((C0643D0) this.f1496t).f1423l;
                SocketAddress socketAddress = (SocketAddress) ((C0594z) ((List) c0807z0.f2113a).get(c0807z0.f2114b)).f1305a.get(c0807z0.f2115c);
                C0807z0 c0807z1 = ((C0643D0) this.f1496t).f1423l;
                c0807z1.f2113a = (List) this.f1497u;
                c0807z1.m1680d();
                ((C0643D0) this.f1496t).f1424m = (List) this.f1497u;
                EnumC0578r enumC0578r = ((C0643D0) this.f1496t).f1434w.f1238a;
                EnumC0578r enumC0578r2 = EnumC0578r.f1233t;
                if (enumC0578r == enumC0578r2 || ((C0643D0) this.f1496t).f1434w.f1238a == EnumC0578r.f1232s) {
                    C0807z0 c0807z2 = ((C0643D0) this.f1496t).f1423l;
                    while (true) {
                        if (i3 < ((List) c0807z2.f2113a).size()) {
                            int iIndexOf = ((C0594z) ((List) c0807z2.f2113a).get(i3)).f1305a.indexOf(socketAddress);
                            if (iIndexOf == -1) {
                                i3++;
                            } else {
                                c0807z2.f2114b = i3;
                                c0807z2.f2115c = iIndexOf;
                            }
                        } else if (((C0643D0) this.f1496t).f1434w.f1238a == enumC0578r2) {
                            c0804y0 = ((C0643D0) this.f1496t).f1433v;
                            ((C0643D0) this.f1496t).f1433v = null;
                            ((C0643D0) this.f1496t).f1423l.m1680d();
                            C0643D0.m1484f((C0643D0) this.f1496t, EnumC0578r.f1235v);
                        } else {
                            ((C0643D0) this.f1496t).f1432u.mo1563b(C0589w0.f1284n.m1354g("InternalSubchannel closed pending transport due to address change"));
                            C0643D0 c0643d0 = (C0643D0) this.f1496t;
                            c0643d0.f1432u = null;
                            c0643d0.f1423l.m1680d();
                            C0643D0.m1485g((C0643D0) this.f1496t);
                        }
                        c0804y0 = null;
                    }
                } else {
                    c0804y0 = null;
                }
                if (c0804y0 != null) {
                    C0643D0 c0643d1 = (C0643D0) this.f1496t;
                    if (c0643d1.f1428q != null) {
                        c0643d1.f1429r.mo1563b(C0589w0.f1284n.m1354g("InternalSubchannel closed transport early due to address change"));
                        ((C0643D0) this.f1496t).f1428q.m271c();
                        C0643D0 c0643d2 = (C0643D0) this.f1496t;
                        c0643d2.f1428q = null;
                        c0643d2.f1429r = null;
                    }
                    C0643D0 c0643d3 = (C0643D0) this.f1496t;
                    c0643d3.f1429r = c0804y0;
                    c0643d3.f1428q = c0643d3.f1422k.m1236c(new RunnableC0681Q(this, i2), 5L, TimeUnit.SECONDS, c0643d3.f1417f);
                    return;
                }
                return;
            case 15:
                if (((C0643D0) ((C0637B0) this.f1496t).f1403u).f1434w.f1238a == EnumC0578r.f1236w) {
                    return;
                }
                C0804y0 c0804y1 = ((C0643D0) ((C0637B0) this.f1496t).f1403u).f1433v;
                C0637B0 c0637b1 = (C0637B0) this.f1496t;
                C0804y0 c0804y2 = (C0804y0) c0637b1.f1402t;
                if (c0804y1 == c0804y2) {
                    ((C0643D0) c0637b1.f1403u).f1433v = null;
                    ((C0643D0) ((C0637B0) this.f1496t).f1403u).f1423l.m1680d();
                    C0643D0.m1484f((C0643D0) ((C0637B0) this.f1496t).f1403u, EnumC0578r.f1235v);
                    return;
                }
                C0643D0 c0643d4 = (C0643D0) c0637b1.f1403u;
                if (c0643d4.f1432u == c0804y2) {
                    AbstractC0076b.m137l("Expected state is CONNECTING, actual state is %s", c0643d4.f1434w.f1238a == EnumC0578r.f1232s, ((C0643D0) ((C0637B0) this.f1496t).f1403u).f1434w.f1238a);
                    C0807z0 c0807z3 = ((C0643D0) ((C0637B0) this.f1496t).f1403u).f1423l;
                    C0594z c0594z2 = (C0594z) ((List) c0807z3.f2113a).get(c0807z3.f2114b);
                    int i4 = c0807z3.f2115c + 1;
                    c0807z3.f2115c = i4;
                    if (i4 >= c0594z2.f1305a.size()) {
                        c0807z3.f2114b++;
                        c0807z3.f2115c = 0;
                    }
                    C0807z0 c0807z4 = ((C0643D0) ((C0637B0) this.f1496t).f1403u).f1423l;
                    if (c0807z4.f2114b < ((List) c0807z4.f2113a).size()) {
                        C0643D0.m1485g((C0643D0) ((C0637B0) this.f1496t).f1403u);
                        return;
                    }
                    C0643D0 c0643d5 = (C0643D0) ((C0637B0) this.f1496t).f1403u;
                    c0643d5.f1432u = null;
                    c0643d5.f1423l.m1680d();
                    C0643D0 c0643d6 = (C0643D0) ((C0637B0) this.f1496t).f1403u;
                    C0589w0 c0589w2 = (C0589w0) this.f1497u;
                    c0643d6.f1422k.m1237d();
                    AbstractC0076b.m131f(!c0589w2.m1352e(), "The error status must not be OK");
                    c0643d6.m1487h(new C0580s(EnumC0578r.f1234u, c0589w2));
                    if (c0643d6.f1425n == null) {
                        c0643d6.f1414c.getClass();
                        c0643d6.f1425n = C0785s2.m1660h();
                    }
                    long jM1608a = c0643d6.f1425n.m1608a();
                    C0096v c0096v = c0643d6.f1426o;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    long jM168a = jM1608a - c0096v.m168a();
                    c0643d6.f1420i.mo1300g("TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", new Object[]{C0643D0.m1486i(c0589w2), Long.valueOf(jM168a)}, 2);
                    AbstractC0076b.m139n(c0643d6.f1427p == null, "previous reconnectTask is not done");
                    c0643d6.f1427p = c0643d6.f1422k.m1236c(new RunnableC0791u0(c0643d6, i3), jM168a, timeUnit, c0643d6.f1417f);
                    return;
                }
                return;
            case 16:
                C0696V0 c0696v0 = (C0696V0) this.f1496t;
                C0589w0 c0589w3 = (C0589w0) this.f1497u;
                Logger logger2 = C0720c1.f1736d0;
                Level level2 = Level.WARNING;
                C0720c1 c0720c1 = c0696v0.f1603f;
                logger2.log(level2, "[{0}] Failed to resolve name. status={1}", new Object[]{c0720c1.f1770a, c0589w3});
                C0708Z0 c0708z0 = c0720c1.f1760Q;
                if (c0708z0.f1653a.get() == C0720c1.f1742j0) {
                    c0708z0.m1583s(null);
                }
                if (c0720c1.f1775c0 != 3) {
                    c0720c1.f1758O.mo1300g("Failed to resolve name: {0}", new Object[]{c0589w3}, 3);
                    c0720c1.f1775c0 = 3;
                }
                C0693U0 c0693u0 = c0696v0.f1601d;
                if (c0693u0 != c0720c1.f1796x) {
                    return;
                }
                ((AbstractC0538U) c0693u0.f1585d.f1887t).mo1266c(c0589w3);
                return;
            case 17:
                C0544a c0544a = AbstractC0527I.f1122a;
                C0696V0 c0696v1 = (C0696V0) this.f1496t;
                C0720c1 c0720c2 = c0696v1.f1603f;
                if (c0720c2.f1794v != c0696v1.f1602e) {
                    return;
                }
                C0573o0 c0573o0 = (C0573o0) this.f1497u;
                List list3 = c0573o0.f1222a;
                c0720c2.f1758O.mo1300g("Resolved address: {0}, config={1}", new Object[]{list3, c0573o0.f1223b}, 1);
                C0720c1 c0720c3 = ((C0696V0) this.f1496t).f1603f;
                if (c0720c3.f1775c0 != 2) {
                    c0720c3.f1758O.mo1300g("Address resolved: {0}", new Object[]{list3}, 2);
                    ((C0696V0) this.f1496t).f1603f.f1775c0 = 2;
                }
                C0573o0 c0573o1 = (C0573o0) this.f1497u;
                C0571n0 c0571n2 = c0573o1.f1224c;
                C0721c2 c0721c2 = (C0721c2) c0573o1.f1223b.f1155a.get(C0729e2.f1849d);
                AbstractC0527I abstractC0527I = (AbstractC0527I) ((C0573o0) this.f1497u).f1223b.f1155a.get(c0544a);
                C0744i1 c0744i1 = (c0571n2 == null || (obj = c0571n2.f1218b) == null) ? null : (C0744i1) obj;
                C0589w0 c0589w4 = c0571n2 != null ? c0571n2.f1217a : null;
                C0720c1 c0720c4 = ((C0696V0) this.f1496t).f1603f;
                int i5 = 10;
                if (c0720c4.f1763T) {
                    if (c0744i1 != null) {
                        if (abstractC0527I != null) {
                            c0720c4.f1760Q.m1583s(abstractC0527I);
                            if (c0744i1.m1616b() != null) {
                                ((C0696V0) this.f1496t).f1603f.f1758O.mo1299f(1, "Method configs in service config will be discarded due to presence ofconfig-selector");
                            }
                        } else {
                            c0720c4.f1760Q.m1583s(c0744i1.m1616b());
                        }
                    } else if (c0589w4 == null) {
                        c0744i1 = C0720c1.f1741i0;
                        c0720c4.f1760Q.m1583s(null);
                    } else {
                        if (!c0720c4.f1762S) {
                            c0720c4.f1758O.mo1299f(2, "Fallback to error due to invalid first service config without default config");
                            ((C0696V0) this.f1496t).mo1301h(c0571n2.f1217a);
                            if (c0721c2 != null) {
                                C0589w0 c0589w5 = c0571n2.f1217a;
                                C0729e2 c0729e2 = c0721c2.f1799a;
                                C0762n c0762n = c0729e2.f1851b;
                                if (!c0589w5.m1352e()) {
                                    c0762n.m1638a(new RunnableC0681Q(c0729e2, i5));
                                    return;
                                }
                                ExecutorC0517A0 executorC0517A1 = c0762n.f1959b;
                                executorC0517A1.m1237d();
                                executorC0517A1.execute(new RunnableC0758m(c0762n, i3));
                                return;
                            }
                            return;
                        }
                        c0744i1 = c0720c4.f1761R;
                    }
                    if (!c0744i1.equals(((C0696V0) this.f1496t).f1603f.f1761R)) {
                        ((C0696V0) this.f1496t).f1603f.f1758O.mo1300g("Service config changed{0}", new Object[]{c0744i1 == C0720c1.f1741i0 ? " to empty" : ""}, 2);
                        C0720c1 c0720c5 = ((C0696V0) this.f1496t).f1603f;
                        c0720c5.f1761R = c0744i1;
                        c0720c5.f1771a0.f1472a = c0744i1.f1894d;
                    }
                    try {
                        ((C0696V0) this.f1496t).f1603f.f1762S = true;
                    } catch (RuntimeException e3) {
                        C0720c1.f1736d0.log(Level.WARNING, "[" + ((C0696V0) this.f1496t).f1603f.f1770a + "] Unexpected exception from parsing service config", (Throwable) e3);
                    }
                    break;
                } else {
                    if (c0744i1 != null) {
                        c0720c4.f1758O.mo1299f(2, "Service config from name resolver discarded by channel settings");
                    }
                    C0720c1 c0720c6 = ((C0696V0) this.f1496t).f1603f;
                    c0744i1 = C0720c1.f1741i0;
                    if (abstractC0527I != null) {
                        c0720c6.f1758O.mo1299f(2, "Config selector from name resolver discarded by channel settings");
                    }
                    ((C0696V0) this.f1496t).f1603f.f1760Q.m1583s(c0744i1.m1616b());
                }
                C0546b c0546b2 = ((C0573o0) this.f1497u).f1223b;
                C0696V0 c0696v2 = (C0696V0) this.f1496t;
                if (c0696v2.f1601d == c0696v2.f1603f.f1796x) {
                    c0546b2.getClass();
                    C0177l c0177l = new C0177l(c0546b2);
                    if (c0546b2.f1155a.containsKey(c0544a)) {
                        IdentityHashMap identityHashMap = new IdentityHashMap(((C0546b) c0177l.f333u).f1155a);
                        identityHashMap.remove(c0544a);
                        c0177l.f333u = new C0546b(identityHashMap);
                    }
                    IdentityHashMap identityHashMap2 = (IdentityHashMap) c0177l.f332t;
                    if (identityHashMap2 != null) {
                        identityHashMap2.remove(c0544a);
                    }
                    Map map = c0744i1.f1896f;
                    if (map != null) {
                        c0177l.m281m(AbstractC0538U.f1143b, map);
                        c0177l.m270a();
                    }
                    C0546b c0546bM270a = c0177l.m270a();
                    C0742i c0742i = ((C0696V0) this.f1496t).f1601d.f1585d;
                    C0546b c0546b3 = C0546b.f1154b;
                    C0535Q c0535q = new C0535Q(list3, c0546bM270a, c0744i1.f1895e);
                    C0693U0 c0693u1 = (C0693U0) c0742i.f1886s;
                    C0757l2 c0757l2 = (C0757l2) c0535q.f1142c;
                    if (c0757l2 == null) {
                        try {
                            C0793u2 c0793u2 = (C0793u2) c0742i.f1889v;
                            String str2 = (String) c0793u2.f2061u;
                            AbstractC0539V abstractC0539VM1274b = ((C0540W) c0793u2.f2060t).m1274b(str2);
                            if (abstractC0539VM1274b == null) {
                                throw new C0754l("Trying to load '" + str2 + "' because using default policy, but it's unavailable");
                            }
                            c0757l2 = new C0757l2(abstractC0539VM1274b, null);
                        } catch (C0754l e4) {
                            c0693u1.mo1304k(EnumC0578r.f1234u, new C0788t1(C0589w0.f1283m.m1354g(e4.getMessage())));
                            ((AbstractC0538U) c0742i.f1887t).mo1269f();
                            c0742i.f1888u = null;
                            c0742i.f1887t = new C0750k();
                            c0589w0Mo1264a = C0589w0.f1275e;
                        }
                    }
                    Object obj2 = c0757l2.f1916b;
                    AbstractC0539V abstractC0539V = c0757l2.f1915a;
                    if (((AbstractC0539V) c0742i.f1888u) == null || !abstractC0539V.mo1270a().equals(((AbstractC0539V) c0742i.f1888u).mo1270a())) {
                        c0693u1.mo1304k(EnumC0578r.f1232s, new C0746j(0));
                        ((AbstractC0538U) c0742i.f1887t).mo1269f();
                        c0742i.f1888u = abstractC0539V;
                        AbstractC0538U abstractC0538U = (AbstractC0538U) c0742i.f1887t;
                        c0742i.f1887t = abstractC0539V.mo1271b(c0693u1);
                        c0693u1.f1586e.f1758O.mo1300g("Load balancer changed from {0} to {1}", new Object[]{abstractC0538U.getClass().getSimpleName(), ((AbstractC0538U) c0742i.f1887t).getClass().getSimpleName()}, 2);
                    }
                    if (obj2 != null) {
                        c0693u1.f1586e.f1758O.mo1300g("Load-balancing config: {0}", new Object[]{obj2}, 1);
                    }
                    c0589w0Mo1264a = ((AbstractC0538U) c0742i.f1887t).mo1264a(new C0535Q(c0535q.f1140a, c0535q.f1141b, obj2));
                    if (c0721c2 != null) {
                        C0729e2 c0729e3 = c0721c2.f1799a;
                        C0762n c0762n2 = c0729e3.f1851b;
                        if (!c0589w0Mo1264a.m1352e()) {
                            c0762n2.m1638a(new RunnableC0681Q(c0729e3, i5));
                            return;
                        }
                        ExecutorC0517A0 executorC0517A2 = c0762n2.f1959b;
                        executorC0517A2.m1237d();
                        executorC0517A2.execute(new RunnableC0758m(c0762n2, i3));
                        return;
                    }
                    return;
                }
                return;
            case 18:
                C0705Y0 c0705y0 = (C0705Y0) this.f1496t;
                C0708Z0 c0708z1 = (C0708Z0) this.f1497u;
                C0720c1 c0720c7 = c0708z1.f1656d;
                if (c0708z1.f1653a.get() != C0720c1.f1742j0) {
                    c0705y0.m1577d();
                    return;
                }
                if (c0720c7.f1745B == null) {
                    c0720c7.f1745B = new LinkedHashSet();
                    c0720c7.f1769Z.m1664a(c0720c7.f1746C, true);
                }
                c0720c7.f1745B.add(c0705y0);
                return;
            case 19:
                ((C0797w) this.f1497u).run();
                C0705Y0 c0705y1 = (C0705Y0) this.f1496t;
                c0705y1.f1641n.f1656d.f1785m.execute(new RunnableC0672N(c0705y1, z ? 1 : 0));
                return;
            case 20:
                synchronized (((C0684R0) ((RunnableC0666L) this.f1496t).f1496t).f1545i) {
                    try {
                        RunnableC0666L runnableC0666L = (RunnableC0666L) this.f1496t;
                        if (!((C0637B0) runnableC0666L.f1497u).f1401s) {
                            C0684R0 c0684r0 = (C0684R0) runnableC0666L.f1496t;
                            c0684r0.f1551o = c0684r0.f1551o.m1568a((C0709Z1) this.f1497u);
                            C0684R0 c0684r1 = (C0684R0) ((RunnableC0666L) this.f1496t).f1496t;
                            if (c0684r1.m1557t(c0684r1.f1551o)) {
                                C0713a2 c0713a2 = ((C0684R0) ((RunnableC0666L) this.f1496t).f1496t).f1549m;
                                if (c0713a2 != null) {
                                    if (c0713a2.f1672d.get() <= c0713a2.f1670b) {
                                        c2 = 0;
                                    }
                                    if (c2 == 0) {
                                        C0684R0 c0684r2 = (C0684R0) ((RunnableC0666L) this.f1496t).f1496t;
                                        c0700w1 = c0684r2.f1551o;
                                        if (c0700w1.f1616h) {
                                            c0700w1 = new C0700W1(c0700w1.f1610b, c0700w1.f1611c, c0700w1.f1612d, c0700w1.f1614f, c0700w1.f1615g, c0700w1.f1609a, true, c0700w1.f1613e);
                                        }
                                        c0684r2.f1551o = c0700w1;
                                        ((C0684R0) ((RunnableC0666L) this.f1496t).f1496t).f1559w = null;
                                    }
                                }
                                C0684R0 c0684r3 = (C0684R0) ((RunnableC0666L) this.f1496t).f1496t;
                                c0637b0 = new C0637B0(c0684r3.f1545i);
                                c0684r3.f1559w = c0637b0;
                            } else {
                                C0684R0 c0684r4 = (C0684R0) ((RunnableC0666L) this.f1496t).f1496t;
                                c0700w1 = c0684r4.f1551o;
                                if (c0700w1.f1616h) {
                                    c0700w1 = new C0700W1(c0700w1.f1610b, c0700w1.f1611c, c0700w1.f1612d, c0700w1.f1614f, c0700w1.f1615g, c0700w1.f1609a, true, c0700w1.f1613e);
                                }
                                c0684r4.f1551o = c0700w1;
                                ((C0684R0) ((RunnableC0666L) this.f1496t).f1496t).f1559w = null;
                            }
                            c = 0;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                if (c != 0) {
                    C0709Z1 c0709z1 = (C0709Z1) this.f1497u;
                    c0709z1.f1657a.mo1550l(new C0793u2(4, (C0684R0) ((RunnableC0666L) this.f1496t).f1496t, c0709z1));
                    ((C0709Z1) this.f1497u).f1657a.mo1548j(C0589w0.f1276f.m1354g("Unneeded hedging"));
                    return;
                } else {
                    if (c0637b0 != null) {
                        C0684R0 c0684r5 = (C0684R0) ((RunnableC0666L) this.f1496t).f1496t;
                        c0637b0.m1479a(c0684r5.f1540d.schedule(new RunnableC0666L(21, c0684r5, c0637b0), c0684r5.f1543g.f1972b, TimeUnit.NANOSECONDS));
                    }
                    ((C0684R0) ((RunnableC0666L) this.f1496t).f1496t).m1555r((C0709Z1) this.f1497u);
                    return;
                }
            case 21:
                C0684R0 c0684r6 = (C0684R0) this.f1496t;
                C0709Z1 c0709z1M1553p = c0684r6.m1553p(c0684r6.f1551o.f1613e, false);
                if (c0709z1M1553p == null) {
                    return;
                }
                ((C0684R0) this.f1496t).f1538b.execute(new RunnableC0666L(20, this, c0709z1M1553p));
                return;
            case 22:
                ((C0684R0) ((C0793u2) this.f1496t).f2061u).f1557u.mo149b((C0559h0) this.f1497u);
                return;
            default:
                ((C0684R0) ((C0793u2) this.f1496t).f2061u).f1557u.mo150c((C0092r) this.f1497u);
                return;
        }
    }

    public RunnableC0666L(C0719c0 c0719c0, AbstractC0558h abstractC0558h) {
        this.f1495s = 13;
        this.f1496t = c0719c0;
        AbstractC0076b.m133h(abstractC0558h, "savedListener");
        this.f1497u = abstractC0558h;
    }

    public RunnableC0666L(C0708Z0 c0708z0, C0705Y0 c0705y0) {
        this.f1495s = 18;
        this.f1497u = c0708z0;
        this.f1496t = c0705y0;
    }
}
