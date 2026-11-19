package p034T;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import p001B.AbstractC0076b;
import p001B.C0087m;
import p001B.C0096v;
import p001B.InterfaceC0097w;
import p006D0.C0177l;
import p030R.AbstractC0558h;
import p030R.C0523E;
import p030R.C0526H;
import p030R.C0529K;
import p030R.C0546b;
import p030R.C0580s;
import p030R.C0589w0;
import p030R.C0594z;
import p030R.EnumC0578r;
import p030R.EnumC0587v0;
import p030R.ExecutorC0517A0;
import p030R.InterfaceC0528J;
import p030R.InterfaceC0537T;

/* JADX INFO: renamed from: T.D0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0643D0 implements InterfaceC0528J {

    /* JADX INFO: renamed from: a */
    public final C0529K f1412a;

    /* JADX INFO: renamed from: b */
    public final String f1413b;

    /* JADX INFO: renamed from: c */
    public final C0785s2 f1414c;

    /* JADX INFO: renamed from: d */
    public final C0793u2 f1415d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0645E f1416e;

    /* JADX INFO: renamed from: f */
    public final ScheduledExecutorService f1417f;

    /* JADX INFO: renamed from: g */
    public final C0526H f1418g;

    /* JADX INFO: renamed from: h */
    public final C0742i f1419h;

    /* JADX INFO: renamed from: i */
    public final AbstractC0558h f1420i;

    /* JADX INFO: renamed from: j */
    public final List f1421j;

    /* JADX INFO: renamed from: k */
    public final ExecutorC0517A0 f1422k;

    /* JADX INFO: renamed from: l */
    public final C0807z0 f1423l;

    /* JADX INFO: renamed from: m */
    public volatile List f1424m;

    /* JADX INFO: renamed from: n */
    public C0727e0 f1425n;

    /* JADX INFO: renamed from: o */
    public final C0096v f1426o;

    /* JADX INFO: renamed from: p */
    public C0177l f1427p;

    /* JADX INFO: renamed from: q */
    public C0177l f1428q;

    /* JADX INFO: renamed from: r */
    public InterfaceC0752k1 f1429r;

    /* JADX INFO: renamed from: u */
    public C0804y0 f1432u;

    /* JADX INFO: renamed from: v */
    public volatile C0804y0 f1433v;

    /* JADX INFO: renamed from: x */
    public C0589w0 f1435x;

    /* JADX INFO: renamed from: s */
    public final ArrayList f1430s = new ArrayList();

    /* JADX INFO: renamed from: t */
    public final C0787t0 f1431t = new C0787t0(this, 0);

    /* JADX INFO: renamed from: w */
    public volatile C0580s f1434w = C0580s.m1341a(EnumC0578r.f1235v);

    public C0643D0(List list, String str, C0785s2 c0785s2, C0774q c0774q, ScheduledExecutorService scheduledExecutorService, InterfaceC0097w interfaceC0097w, ExecutorC0517A0 executorC0517A0, C0793u2 c0793u2, C0526H c0526h, C0742i c0742i, C0786t c0786t, C0529K c0529k, AbstractC0558h abstractC0558h, ArrayList arrayList) {
        AbstractC0076b.m133h(list, "addressGroups");
        AbstractC0076b.m131f(!list.isEmpty(), "addressGroups is empty");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC0076b.m133h(it.next(), "addressGroups contains null entry");
        }
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f1424m = listUnmodifiableList;
        C0807z0 c0807z0 = new C0807z0();
        c0807z0.f2113a = listUnmodifiableList;
        this.f1423l = c0807z0;
        this.f1413b = str;
        this.f1414c = c0785s2;
        this.f1416e = c0774q;
        this.f1417f = scheduledExecutorService;
        this.f1426o = (C0096v) interfaceC0097w.get();
        this.f1422k = executorC0517A0;
        this.f1415d = c0793u2;
        this.f1418g = c0526h;
        this.f1419h = c0742i;
        AbstractC0076b.m133h(c0786t, "channelTracer");
        AbstractC0076b.m133h(c0529k, "logId");
        this.f1412a = c0529k;
        AbstractC0076b.m133h(abstractC0558h, "channelLogger");
        this.f1420i = abstractC0558h;
        this.f1421j = arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static void m1484f(C0643D0 c0643d0, EnumC0578r enumC0578r) {
        c0643d0.f1422k.m1237d();
        c0643d0.m1487h(C0580s.m1341a(enumC0578r));
    }

    /* JADX INFO: renamed from: g */
    public static void m1485g(C0643D0 c0643d0) {
        SocketAddress socketAddress;
        C0523E c0523e;
        C0807z0 c0807z0 = c0643d0.f1423l;
        ExecutorC0517A0 executorC0517A0 = c0643d0.f1422k;
        executorC0517A0.m1237d();
        AbstractC0076b.m139n(c0643d0.f1427p == null, "Should have no reconnectTask scheduled");
        if (c0807z0.f2114b == 0 && c0807z0.f2115c == 0) {
            C0096v c0096v = c0643d0.f1426o;
            c0096v.f139b = false;
            c0096v.m169b();
        }
        SocketAddress socketAddress2 = (SocketAddress) ((C0594z) ((List) c0807z0.f2113a).get(c0807z0.f2114b)).f1305a.get(c0807z0.f2115c);
        if (socketAddress2 instanceof C0523E) {
            c0523e = (C0523E) socketAddress2;
            socketAddress = c0523e.f1106t;
        } else {
            socketAddress = socketAddress2;
            c0523e = null;
        }
        C0546b c0546b = ((C0594z) ((List) c0807z0.f2113a).get(c0807z0.f2114b)).f1306b;
        String str = (String) c0546b.f1155a.get(C0594z.f1304d);
        C0642D c0642d = new C0642D();
        c0642d.f1409a = "unknown-authority";
        c0642d.f1410b = C0546b.f1154b;
        if (str == null) {
            str = c0643d0.f1413b;
        }
        AbstractC0076b.m133h(str, "authority");
        c0642d.f1409a = str;
        c0642d.f1410b = c0546b;
        c0642d.f1411c = c0523e;
        C0640C0 c0640c0 = new C0640C0();
        c0640c0.f1405d = c0643d0.f1412a;
        C0804y0 c0804y0 = new C0804y0(c0643d0.f1416e.mo1488D(socketAddress, c0642d, c0640c0), c0643d0.f1419h);
        c0640c0.f1405d = c0804y0.mo1253d();
        c0643d0.f1432u = c0804y0;
        c0643d0.f1430s.add(c0804y0);
        Runnable runnableMo1562a = c0804y0.mo1562a(new C0637B0(c0643d0, c0804y0));
        if (runnableMo1562a != null) {
            executorC0517A0.m1235b(runnableMo1562a);
        }
        c0643d0.f1420i.mo1300g("Started transport {0}", new Object[]{c0640c0.f1405d}, 2);
    }

    /* JADX INFO: renamed from: i */
    public static String m1486i(C0589w0 c0589w0) {
        StringBuilder sb = new StringBuilder();
        EnumC0587v0 enumC0587v0 = c0589w0.f1287a;
        Throwable th = c0589w0.f1289c;
        sb.append(enumC0587v0);
        String str = c0589w0.f1288b;
        if (str != null) {
            sb.append("(");
            sb.append(str);
            sb.append(")");
        }
        if (th != null) {
            sb.append("[");
            sb.append(th);
            sb.append("]");
        }
        return sb.toString();
    }

    @Override // p030R.InterfaceC0528J
    /* JADX INFO: renamed from: d */
    public final C0529K mo1253d() {
        return this.f1412a;
    }

    /* JADX INFO: renamed from: h */
    public final void m1487h(C0580s c0580s) {
        this.f1422k.m1237d();
        if (this.f1434w.f1238a != c0580s.f1238a) {
            AbstractC0076b.m139n(this.f1434w.f1238a != EnumC0578r.f1236w, "Cannot transition out of SHUTDOWN to " + c0580s);
            this.f1434w = c0580s;
            ((InterfaceC0537T) this.f1415d.f2060t).mo1263a(c0580s);
        }
    }

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m157a(this.f1412a.f1126c, "logId");
        c0087mM143s.m158b(this.f1424m, "addressGroups");
        return c0087mM143s.toString();
    }
}
