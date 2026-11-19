package p030R;

import com.google.firebase.firestore.remote.RunnableC5964g;
import io.grpc.StatusException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p001B.AbstractC0076b;
import p003C.AbstractC0116g;
import p003C.C0112c;
import p003C.C0113d;
import p006D0.C0177l;
import p033S0.AbstractC0608b;
import p033S0.C0629w;
import p034T.AbstractC0759m0;
import p034T.AbstractC0761m2;
import p034T.C0657I;
import p034T.C0660J;
import p034T.C0686S;
import p034T.C0693U0;
import p034T.C0705Y0;
import p034T.C0720c1;
import p036U.AbstractC0839t;
import p036U.C0822c;
import p036U.C0831l;
import p036U.C0833n;
import p036U.RunnableC0832m;
import p039W.C0868h;
import p039W.EnumC0861a;
import p044a0.C0889k;
import p044a0.C0890l;
import p044a0.C0891m;
import p044a0.C0892n;
import p044a0.C0893o;
import p044a0.C0898t;

/* JADX INFO: renamed from: R.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0591x0 implements Runnable {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f1292s;

    /* JADX INFO: renamed from: t */
    public final Object f1293t;

    /* JADX INFO: renamed from: u */
    public final Object f1294u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f1295v;

    public /* synthetic */ RunnableC0591x0(Object obj, Object obj2, Object obj3, int i2) {
        this.f1292s = i2;
        this.f1295v = obj;
        this.f1293t = obj2;
        this.f1294u = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0833n c0833n;
        RunnableC0832m runnableC0832m;
        Socket socketM1716g;
        SSLSession session;
        Socket socket;
        C0113d c0113d;
        int i2;
        double d;
        switch (this.f1292s) {
            case 0:
                ((ExecutorC0517A0) this.f1295v).execute((RunnableC0595z0) this.f1293t);
                return;
            case 1:
                ((C0705Y0) this.f1295v).f1633f.start((AbstractC0560i) this.f1293t, (C0559h0) this.f1294u);
                return;
            case 2:
                ((C0686S) this.f1295v).f1564a.onClose((C0589w0) this.f1293t, (C0559h0) this.f1294u);
                return;
            case 3:
                C0720c1 c0720c1 = (C0720c1) this.f1295v;
                C0660J c0660j = c0720c1.f1790r;
                RunnableC5964g runnableC5964g = (RunnableC5964g) this.f1293t;
                Executor executor = c0720c1.f1780h;
                EnumC0578r enumC0578r = (EnumC0578r) this.f1294u;
                c0660j.getClass();
                AbstractC0076b.m133h(executor, "executor");
                AbstractC0076b.m133h(enumC0578r, "source");
                C0657I c0657i = new C0657I(runnableC5964g, executor);
                if (((EnumC0578r) c0660j.f1472a) != enumC0578r) {
                    executor.execute(runnableC5964g);
                    return;
                } else {
                    ((ArrayList) c0660j.f1473b).add(c0657i);
                    return;
                }
            case 4:
                EnumC0578r enumC0578r2 = (EnumC0578r) this.f1294u;
                AbstractC0536S abstractC0536S = (AbstractC0536S) this.f1293t;
                C0693U0 c0693u0 = (C0693U0) this.f1295v;
                C0720c1 c0720c2 = c0693u0.f1586e;
                if (c0693u0 != c0720c2.f1796x) {
                    return;
                }
                c0720c2.f1797y = abstractC0536S;
                c0720c2.f1748E.m1567h(abstractC0536S);
                if (enumC0578r2 != EnumC0578r.f1236w) {
                    c0693u0.f1586e.f1758O.mo1300g("Entering {0} state with picker: {1}", new Object[]{enumC0578r2, abstractC0536S}, 2);
                    c0693u0.f1586e.f1790r.m1518b(enumC0578r2);
                    return;
                }
                return;
            case 5:
                try {
                    ((CountDownLatch) this.f1293t).await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                C0629w c0629wM1369b = AbstractC0608b.m1369b(new C0831l());
                try {
                    try {
                        C0833n c0833n2 = (C0833n) this.f1295v;
                        C0523E c0523e = c0833n2.f2254N;
                        if (c0523e == null) {
                            socketM1716g = c0833n2.f2241A.createSocket(c0833n2.f2256a.getAddress(), ((C0833n) this.f1295v).f2256a.getPort());
                        } else {
                            SocketAddress socketAddress = c0523e.f1105s;
                            if (!(socketAddress instanceof InetSocketAddress)) {
                                throw new StatusException(C0589w0.f1283m.m1354g("Unsupported SocketAddress implementation " + ((C0833n) this.f1295v).f2254N.f1105s.getClass()));
                            }
                            socketM1716g = C0833n.m1716g(c0833n2, c0523e.f1106t, (InetSocketAddress) socketAddress, c0523e.f1107u, c0523e.f1108v);
                        }
                        C0833n c0833n3 = (C0833n) this.f1295v;
                        SSLSocketFactory sSLSocketFactory = c0833n3.f2242B;
                        if (sSLSocketFactory != null) {
                            String host = c0833n3.f2257b;
                            URI uriM1620a = AbstractC0759m0.m1620a(host);
                            if (uriM1620a.getHost() != null) {
                                host = uriM1620a.getHost();
                            }
                            SSLSocket sSLSocketM1736a = AbstractC0839t.m1736a(sSLSocketFactory, socketM1716g, host, ((C0833n) this.f1295v).m1722k(), ((C0833n) this.f1295v).f2245E);
                            session = sSLSocketM1736a.getSession();
                            socket = sSLSocketM1736a;
                        } else {
                            session = null;
                            socket = socketM1716g;
                        }
                        socket.setTcpNoDelay(true);
                        C0629w c0629wM1369b2 = AbstractC0608b.m1369b(AbstractC0608b.m1373f(socket));
                        ((C0822c) this.f1294u).m1703c(AbstractC0608b.m1372e(socket), socket);
                        C0833n c0833n4 = (C0833n) this.f1295v;
                        C0546b c0546b = c0833n4.f2276u;
                        c0546b.getClass();
                        C0177l c0177l = new C0177l(c0546b);
                        c0177l.m281m(AbstractC0558h.f1183a, socket.getRemoteSocketAddress());
                        c0177l.m281m(AbstractC0558h.f1184b, socket.getLocalSocketAddress());
                        c0177l.m281m(AbstractC0558h.f1185c, session);
                        c0177l.m281m(AbstractC0761m2.f1955a, session == null ? EnumC0581s0.f1240s : EnumC0581s0.f1241t);
                        c0833n4.f2276u = c0177l.m270a();
                        C0833n c0833n5 = (C0833n) this.f1295v;
                        c0833n5.f2262g.getClass();
                        c0833n5.f2275t = new RunnableC0832m(c0833n5, new C0868h(c0629wM1369b2));
                        synchronized (((C0833n) this.f1295v).f2266k) {
                            if (session != null) {
                                try {
                                    new C0572o(session);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            break;
                        }
                        return;
                    } catch (StatusException e) {
                        ((C0833n) this.f1295v).m1728r(0, EnumC0861a.INTERNAL_ERROR, e.f24446s);
                        c0833n = (C0833n) this.f1295v;
                        c0833n.f2262g.getClass();
                        runnableC0832m = new RunnableC0832m(c0833n, new C0868h(c0629wM1369b));
                        c0833n.f2275t = runnableC0832m;
                        return;
                    } catch (Exception e2) {
                        ((C0833n) this.f1295v).m1726o(e2);
                        c0833n = (C0833n) this.f1295v;
                        c0833n.f2262g.getClass();
                        runnableC0832m = new RunnableC0832m(c0833n, new C0868h(c0629wM1369b));
                        c0833n.f2275t = runnableC0832m;
                        return;
                    }
                } catch (Throwable th2) {
                    C0833n c0833n6 = (C0833n) this.f1295v;
                    c0833n6.f2262g.getClass();
                    c0833n6.f2275t = new RunnableC0832m(c0833n6, new C0868h(c0629wM1369b));
                    throw th2;
                }
                break;
            default:
                C0898t c0898t = (C0898t) this.f1295v;
                c0898t.f2530l = Long.valueOf(c0898t.f2527i.m1661e());
                for (C0889k c0889k : ((C0898t) this.f1295v).f2524f.f2496H.values()) {
                    C0177l c0177l2 = c0889k.f2492c;
                    ((AtomicLong) c0177l2.f333u).set(0L);
                    ((AtomicLong) c0177l2.f332t).set(0L);
                    C0177l c0177l3 = c0889k.f2491b;
                    c0889k.f2491b = c0889k.f2492c;
                    c0889k.f2492c = c0177l3;
                }
                C0893o c0893o = (C0893o) this.f1293t;
                AbstractC0558h abstractC0558h = (AbstractC0558h) this.f1294u;
                C0112c c0112cM192n = AbstractC0116g.m192n();
                if (c0893o.f2508e != null) {
                    c0112cM192n.m185a(new C0891m(c0893o, abstractC0558h, 1));
                }
                if (c0893o.f2509f != null) {
                    c0112cM192n.m185a(new C0891m(c0893o, abstractC0558h, 0));
                }
                C0113d c0113dListIterator = c0112cM192n.m187d().listIterator(0);
                while (c0113dListIterator.hasNext()) {
                    C0891m c0891m = (C0891m) c0113dListIterator.next();
                    C0898t c0898t2 = (C0898t) this.f1295v;
                    C0890l c0890l = c0898t2.f2524f;
                    long jLongValue = c0898t2.f2530l.longValue();
                    switch (c0891m.f2497a) {
                        case 0:
                            c0113d = c0113dListIterator;
                            C0893o c0893o2 = c0891m.f2498b;
                            ArrayList arrayListM1819h = C0898t.m1819h(c0890l, c0893o2.f2509f.f2503d.intValue());
                            int size = arrayListM1819h.size();
                            C0892n c0892n = c0893o2.f2509f;
                            if (size >= c0892n.f2502c.intValue() && arrayListM1819h.size() != 0) {
                                int size2 = arrayListM1819h.size();
                                int i3 = 0;
                                while (i3 < size2) {
                                    Object obj = arrayListM1819h.get(i3);
                                    i3++;
                                    C0889k c0889k2 = (C0889k) obj;
                                    if (c0890l.m1816q() >= c0893o2.f2507d.intValue()) {
                                    }
                                    if (c0889k2.m1813c() >= c0892n.f2503d.intValue()) {
                                        int i4 = size2;
                                        C0890l c0890l2 = c0890l;
                                        if (((AtomicLong) c0889k2.f2492c.f332t).get() / c0889k2.m1813c() > ((double) c0892n.f2500a.intValue()) / 100.0d) {
                                            c0891m.f2499c.mo1300g("FailurePercentage algorithm detected outlier: {0}, failureRate={1}", new Object[]{c0889k2, Double.valueOf(((AtomicLong) c0889k2.f2492c.f332t).get() / c0889k2.m1813c())}, 1);
                                            if (new Random().nextInt(100) < c0892n.f2501b.intValue()) {
                                                c0889k2.m1812b(jLongValue);
                                            }
                                        }
                                        c0890l = c0890l2;
                                        size2 = i4;
                                    }
                                    break;
                                }
                            }
                            break;
                        default:
                            C0893o c0893o3 = c0891m.f2498b;
                            ArrayList arrayListM1819h2 = C0898t.m1819h(c0890l, c0893o3.f2508e.f2503d.intValue());
                            int size3 = arrayListM1819h2.size();
                            C0892n c0892n2 = c0893o3.f2508e;
                            if (size3 < c0892n2.f2502c.intValue() || arrayListM1819h2.size() == 0) {
                                c0113d = c0113dListIterator;
                            }
                            ArrayList arrayList = new ArrayList();
                            int size4 = arrayListM1819h2.size();
                            for (int i5 = 0; i5 < size4; i5++) {
                                C0889k c0889k3 = (C0889k) arrayListM1819h2.get(i5);
                                arrayList.add(Double.valueOf(((AtomicLong) c0889k3.f2492c.f333u).get() / c0889k3.m1813c()));
                            }
                            int size5 = arrayList.size();
                            int i6 = 0;
                            double dDoubleValue = 0.0d;
                            while (i6 < size5) {
                                Object obj2 = arrayList.get(i6);
                                i6++;
                                dDoubleValue = ((Double) obj2).doubleValue() + dDoubleValue;
                            }
                            double size6 = dDoubleValue / ((double) arrayList.size());
                            int size7 = arrayList.size();
                            int i7 = 0;
                            double d2 = 0.0d;
                            while (i7 < size7) {
                                Object obj3 = arrayList.get(i7);
                                i7++;
                                double dDoubleValue2 = ((Double) obj3).doubleValue() - size6;
                                d2 = (dDoubleValue2 * dDoubleValue2) + d2;
                            }
                            double dSqrt = Math.sqrt(d2 / ((double) arrayList.size()));
                            double dIntValue = size6 - (((double) (c0892n2.f2500a.intValue() / 1000.0f)) * dSqrt);
                            int size8 = arrayListM1819h2.size();
                            int i8 = 0;
                            while (true) {
                                if (i8 >= size8) {
                                    c0113d = c0113dListIterator;
                                }
                                Object obj4 = arrayListM1819h2.get(i8);
                                int i9 = i8 + 1;
                                C0889k c0889k4 = (C0889k) obj4;
                                c0113d = c0113dListIterator;
                                ArrayList arrayList2 = arrayListM1819h2;
                                if (c0890l.m1816q() >= c0893o3.f2507d.intValue()) {
                                }
                                if (((AtomicLong) c0889k4.f2492c.f333u).get() / c0889k4.m1813c() < dIntValue) {
                                    d = dIntValue;
                                    i2 = size8;
                                    c0891m.f2499c.mo1300g("SuccessRate algorithm detected outlier: {0}. Parameters: successRate={1}, mean={2}, stdev={3}, requiredSuccessRate={4}", new Object[]{c0889k4, Double.valueOf(((AtomicLong) c0889k4.f2492c.f333u).get() / c0889k4.m1813c()), Double.valueOf(size6), Double.valueOf(dSqrt), Double.valueOf(d)}, 1);
                                    if (new Random().nextInt(100) < c0892n2.f2501b.intValue()) {
                                        c0889k4.m1812b(jLongValue);
                                    }
                                } else {
                                    i2 = size8;
                                    d = dIntValue;
                                }
                                c0113dListIterator = c0113d;
                                dIntValue = d;
                                arrayListM1819h2 = arrayList2;
                                i8 = i9;
                                size8 = i2;
                                break;
                                break;
                            }
                            break;
                            break;
                    }
                    c0113dListIterator = c0113d;
                }
                C0898t c0898t3 = (C0898t) this.f1295v;
                C0890l c0890l3 = c0898t3.f2524f;
                Long l2 = c0898t3.f2530l;
                for (C0889k c0889k5 : c0890l3.f2496H.values()) {
                    if (!c0889k5.m1814d()) {
                        int i10 = c0889k5.f2494e;
                        c0889k5.f2494e = i10 == 0 ? 0 : i10 - 1;
                    }
                    if (c0889k5.m1814d()) {
                        if (l2.longValue() > Math.min(c0889k5.f2490a.f2505b.longValue() * ((long) c0889k5.f2494e), Math.max(c0889k5.f2490a.f2505b.longValue(), c0889k5.f2490a.f2506c.longValue())) + c0889k5.f2493d.longValue()) {
                            c0889k5.m1815e();
                        }
                    }
                }
                return;
        }
    }

    public String toString() {
        switch (this.f1292s) {
            case 0:
                return ((Runnable) this.f1294u).toString() + "(scheduled in SynchronizationContext)";
            default:
                return super.toString();
        }
    }
}
