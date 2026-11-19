package p044a0;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p001B.AbstractC0076b;
import p006D0.C0177l;
import p030R.AbstractC0538U;
import p030R.AbstractC0558h;
import p030R.C0535Q;
import p030R.C0544a;
import p030R.C0546b;
import p030R.C0589w0;
import p030R.C0594z;
import p030R.ExecutorC0517A0;
import p030R.RunnableC0591x0;
import p030R.RunnableC0593y0;
import p030R.RunnableC0595z0;
import p034T.C0757l2;
import p034T.C0785s2;

/* JADX INFO: renamed from: a0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0898t extends AbstractC0538U {

    /* JADX INFO: renamed from: n */
    public static final C0544a f2523n = new C0544a("addressTrackerKey");

    /* JADX INFO: renamed from: f */
    public final C0890l f2524f;

    /* JADX INFO: renamed from: g */
    public final ExecutorC0517A0 f2525g;

    /* JADX INFO: renamed from: h */
    public final C0883e f2526h;

    /* JADX INFO: renamed from: i */
    public final C0785s2 f2527i;

    /* JADX INFO: renamed from: j */
    public final ScheduledExecutorService f2528j;

    /* JADX INFO: renamed from: k */
    public C0177l f2529k;

    /* JADX INFO: renamed from: l */
    public Long f2530l;

    /* JADX INFO: renamed from: m */
    public final AbstractC0558h f2531m;

    public C0898t(AbstractC0558h abstractC0558h) {
        AbstractC0558h abstractC0558hMo1296b = abstractC0558h.mo1296b();
        this.f2531m = abstractC0558hMo1296b;
        this.f2526h = new C0883e(new C0882d(this, abstractC0558h));
        this.f2524f = new C0890l();
        ExecutorC0517A0 executorC0517A0Mo1298d = abstractC0558h.mo1298d();
        AbstractC0076b.m133h(executorC0517A0Mo1298d, "syncContext");
        this.f2525g = executorC0517A0Mo1298d;
        ScheduledExecutorService scheduledExecutorServiceMo1297c = abstractC0558h.mo1297c();
        AbstractC0076b.m133h(scheduledExecutorServiceMo1297c, "timeService");
        this.f2528j = scheduledExecutorServiceMo1297c;
        this.f2527i = C0785s2.f2037t;
        abstractC0558hMo1296b.mo1299f(1, "OutlierDetection lb created.");
    }

    /* JADX INFO: renamed from: g */
    public static boolean m1818g(List list) {
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((C0594z) it.next()).f1305a.size();
            if (size > 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static ArrayList m1819h(C0890l c0890l, int i2) {
        ArrayList arrayList = new ArrayList();
        for (C0889k c0889k : c0890l.f2496H.values()) {
            if (c0889k.m1813c() >= i2) {
                arrayList.add(c0889k);
            }
        }
        return arrayList;
    }

    @Override // p030R.AbstractC0538U
    /* JADX INFO: renamed from: a */
    public final C0589w0 mo1264a(C0535Q c0535q) {
        C0883e c0883e = this.f2526h;
        C0890l c0890l = this.f2524f;
        AbstractC0558h abstractC0558h = this.f2531m;
        abstractC0558h.mo1300g("Received resolution result: {0}", new Object[]{c0535q}, 1);
        C0893o c0893o = (C0893o) c0535q.f1142c;
        ArrayList arrayList = new ArrayList();
        Iterator it = c0535q.f1140a.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((C0594z) it.next()).f1305a);
        }
        c0890l.f2496H.keySet().retainAll(arrayList);
        Iterator it2 = c0890l.f2496H.values().iterator();
        while (it2.hasNext()) {
            ((C0889k) it2.next()).f2490a = c0893o;
        }
        HashMap map = c0890l.f2496H;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            SocketAddress socketAddress = (SocketAddress) obj;
            if (!map.containsKey(socketAddress)) {
                map.put(socketAddress, new C0889k(c0893o));
            }
        }
        C0757l2 c0757l2 = c0893o.f2510g;
        Long l2 = c0893o.f2504a;
        c0883e.m1810i(c0757l2.f1915a);
        if (c0893o.f2508e == null && c0893o.f2509f == null) {
            C0177l c0177l = this.f2529k;
            if (c0177l != null) {
                c0177l.m271c();
                this.f2530l = null;
                for (C0889k c0889k : c0890l.f2496H.values()) {
                    if (c0889k.m1814d()) {
                        c0889k.m1815e();
                    }
                    c0889k.f2494e = 0;
                }
            }
        } else {
            Long lValueOf = this.f2530l == null ? l2 : Long.valueOf(Math.max(0L, l2.longValue() - (this.f2527i.m1661e() - this.f2530l.longValue())));
            C0177l c0177l2 = this.f2529k;
            if (c0177l2 != null) {
                c0177l2.m271c();
                for (C0889k c0889k2 : c0890l.f2496H.values()) {
                    C0177l c0177l3 = c0889k2.f2491b;
                    ((AtomicLong) c0177l3.f333u).set(0L);
                    ((AtomicLong) c0177l3.f332t).set(0L);
                    C0177l c0177l4 = c0889k2.f2492c;
                    ((AtomicLong) c0177l4.f333u).set(0L);
                    ((AtomicLong) c0177l4.f332t).set(0L);
                }
            }
            ExecutorC0517A0 executorC0517A0 = this.f2525g;
            RunnableC0591x0 runnableC0591x0 = new RunnableC0591x0(this, c0893o, abstractC0558h, 6);
            long jLongValue = lValueOf.longValue();
            long jLongValue2 = l2.longValue();
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            ScheduledExecutorService scheduledExecutorService = this.f2528j;
            executorC0517A0.getClass();
            RunnableC0595z0 runnableC0595z0 = new RunnableC0595z0(runnableC0591x0);
            this.f2529k = new C0177l(runnableC0595z0, scheduledExecutorService.scheduleWithFixedDelay(new RunnableC0593y0(executorC0517A0, runnableC0595z0, runnableC0591x0, jLongValue2), jLongValue, jLongValue2, timeUnit));
        }
        C0546b c0546b = C0546b.f1154b;
        c0883e.mo1267d(new C0535Q(c0535q.f1140a, c0535q.f1141b, c0893o.f2510g.f1916b));
        return C0589w0.f1275e;
    }

    @Override // p030R.AbstractC0538U
    /* JADX INFO: renamed from: c */
    public final void mo1266c(C0589w0 c0589w0) {
        this.f2526h.mo1266c(c0589w0);
    }

    @Override // p030R.AbstractC0538U
    /* JADX INFO: renamed from: f */
    public final void mo1269f() {
        this.f2526h.mo1269f();
    }
}
