package p034T;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.firestore.remote.RunnableC5964g;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import p001B.AbstractC0076b;
import p001B.C0087m;
import p001B.C0092r;
import p001B.C0096v;
import p001B.InterfaceC0097w;
import p003C.AbstractC0119j;
import p003C.C0134y;
import p011H.AbstractC0271e0;
import p030R.AbstractC0536S;
import p030R.AbstractC0538U;
import p030R.AbstractC0539V;
import p030R.AbstractC0541X;
import p030R.AbstractC0562j;
import p030R.AbstractC0575p0;
import p030R.C0526H;
import p030R.C0529K;
import p030R.C0540W;
import p030R.C0556g;
import p030R.C0567l0;
import p030R.C0569m0;
import p030R.C0572o;
import p030R.C0576q;
import p030R.C0577q0;
import p030R.C0588w;
import p030R.C0589w0;
import p030R.C0592y;
import p030R.EnumC0578r;
import p030R.ExecutorC0517A0;
import p030R.InterfaceC0528J;
import p030R.RunnableC0591x0;
import p036U.C0826g;
import p036U.C0827h;
import p072l.AbstractC6468c;

/* JADX INFO: renamed from: T.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0720c1 extends AbstractC0541X implements InterfaceC0528J {

    /* JADX INFO: renamed from: d0 */
    public static final Logger f1736d0 = Logger.getLogger(C0720c1.class.getName());

    /* JADX INFO: renamed from: e0 */
    public static final Pattern f1737e0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* JADX INFO: renamed from: f0 */
    public static final C0589w0 f1738f0;

    /* JADX INFO: renamed from: g0 */
    public static final C0589w0 f1739g0;

    /* JADX INFO: renamed from: h0 */
    public static final C0589w0 f1740h0;

    /* JADX INFO: renamed from: i0 */
    public static final C0744i1 f1741i0;

    /* JADX INFO: renamed from: j0 */
    public static final C0673N0 f1742j0;

    /* JADX INFO: renamed from: k0 */
    public static final C0675O f1743k0;

    /* JADX INFO: renamed from: A */
    public final HashSet f1744A;

    /* JADX INFO: renamed from: B */
    public LinkedHashSet f1745B;

    /* JADX INFO: renamed from: C */
    public final Object f1746C;

    /* JADX INFO: renamed from: D */
    public final HashSet f1747D;

    /* JADX INFO: renamed from: E */
    public final C0695V f1748E;

    /* JADX INFO: renamed from: F */
    public final C0742i f1749F;

    /* JADX INFO: renamed from: G */
    public final AtomicBoolean f1750G;

    /* JADX INFO: renamed from: H */
    public boolean f1751H;

    /* JADX INFO: renamed from: I */
    public boolean f1752I;

    /* JADX INFO: renamed from: J */
    public volatile boolean f1753J;

    /* JADX INFO: renamed from: K */
    public final CountDownLatch f1754K;

    /* JADX INFO: renamed from: L */
    public final C0785s2 f1755L;

    /* JADX INFO: renamed from: M */
    public final C0742i f1756M;

    /* JADX INFO: renamed from: N */
    public final C0786t f1757N;

    /* JADX INFO: renamed from: O */
    public final C0778r f1758O;

    /* JADX INFO: renamed from: P */
    public final C0526H f1759P;

    /* JADX INFO: renamed from: Q */
    public final C0708Z0 f1760Q;

    /* JADX INFO: renamed from: R */
    public C0744i1 f1761R;

    /* JADX INFO: renamed from: S */
    public boolean f1762S;

    /* JADX INFO: renamed from: T */
    public final boolean f1763T;

    /* JADX INFO: renamed from: U */
    public final C0738h f1764U;

    /* JADX INFO: renamed from: V */
    public final long f1765V;

    /* JADX INFO: renamed from: W */
    public final long f1766W;

    /* JADX INFO: renamed from: X */
    public final boolean f1767X;

    /* JADX INFO: renamed from: Y */
    public final C0572o f1768Y;

    /* JADX INFO: renamed from: Z */
    public final C0787t0 f1769Z;

    /* JADX INFO: renamed from: a */
    public final C0529K f1770a;

    /* JADX INFO: renamed from: a0 */
    public final C0660J f1771a0;

    /* JADX INFO: renamed from: b */
    public final String f1772b;

    /* JADX INFO: renamed from: b0 */
    public final C0662J1 f1773b0;

    /* JADX INFO: renamed from: c */
    public final C0577q0 f1774c;

    /* JADX INFO: renamed from: c0 */
    public int f1775c0;

    /* JADX INFO: renamed from: d */
    public final C0569m0 f1776d;

    /* JADX INFO: renamed from: e */
    public final C0793u2 f1777e;

    /* JADX INFO: renamed from: f */
    public final C0774q f1778f;

    /* JADX INFO: renamed from: g */
    public final ScheduledExecutorServiceC0712a1 f1779g;

    /* JADX INFO: renamed from: h */
    public final Executor f1780h;

    /* JADX INFO: renamed from: i */
    public final C0092r f1781i;

    /* JADX INFO: renamed from: j */
    public final ExecutorC0690T0 f1782j;

    /* JADX INFO: renamed from: k */
    public final ExecutorC0690T0 f1783k;

    /* JADX INFO: renamed from: l */
    public final C0785s2 f1784l;

    /* JADX INFO: renamed from: m */
    public final ExecutorC0517A0 f1785m;

    /* JADX INFO: renamed from: n */
    public final C0592y f1786n;

    /* JADX INFO: renamed from: o */
    public final C0576q f1787o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC0097w f1788p;

    /* JADX INFO: renamed from: q */
    public final long f1789q;

    /* JADX INFO: renamed from: r */
    public final C0660J f1790r;

    /* JADX INFO: renamed from: s */
    public final C0785s2 f1791s;

    /* JADX INFO: renamed from: t */
    public final C0708Z0 f1792t;

    /* JADX INFO: renamed from: u */
    public final ArrayList f1793u;

    /* JADX INFO: renamed from: v */
    public C0729e2 f1794v;

    /* JADX INFO: renamed from: w */
    public boolean f1795w;

    /* JADX INFO: renamed from: x */
    public C0693U0 f1796x;

    /* JADX INFO: renamed from: y */
    public volatile AbstractC0536S f1797y;

    /* JADX INFO: renamed from: z */
    public boolean f1798z;

    static {
        C0589w0 c0589w0 = C0589w0.f1284n;
        f1738f0 = c0589w0.m1354g("Channel shutdownNow invoked");
        f1739g0 = c0589w0.m1354g("Channel shutdown invoked");
        f1740h0 = c0589w0.m1354g("Subchannel shutdown invoked");
        f1741i0 = new C0744i1(null, new HashMap(), new HashMap(), null, null, null);
        f1742j0 = new C0673N0();
        f1743k0 = new C0675O(1);
    }

    public C0720c1(C0724d1 c0724d1, C0826g c0826g, C0785s2 c0785s2, C0092r c0092r, InterfaceC0097w interfaceC0097w, ArrayList arrayList) {
        int i2;
        C0785s2 c0785s3 = C0785s2.f2037t;
        ExecutorC0517A0 executorC0517A0 = new ExecutorC0517A0(new C0682Q0(this));
        this.f1785m = executorC0517A0;
        C0660J c0660j = new C0660J();
        c0660j.f1473b = new ArrayList();
        c0660j.f1472a = EnumC0578r.f1235v;
        this.f1790r = c0660j;
        this.f1744A = new HashSet(16, 0.75f);
        this.f1746C = new Object();
        this.f1747D = new HashSet(1, 0.75f);
        C0742i c0742i = new C0742i();
        c0742i.f1889v = this;
        c0742i.f1886s = new Object();
        c0742i.f1887t = new HashSet();
        this.f1749F = c0742i;
        this.f1750G = new AtomicBoolean(false);
        this.f1754K = new CountDownLatch(1);
        this.f1775c0 = 1;
        this.f1761R = f1741i0;
        this.f1762S = false;
        this.f1764U = new C0738h(1);
        this.f1768Y = C0588w.f1267v;
        C0092r c0092r2 = new C0092r(this, 6);
        this.f1769Z = new C0787t0(this, 1);
        C0660J c0660j2 = new C0660J();
        c0660j2.f1473b = this;
        this.f1771a0 = c0660j2;
        String str = c0724d1.f1813f;
        AbstractC0076b.m133h(str, TypedValues.AttributesType.S_TARGET);
        this.f1772b = str;
        C0529K c0529k = new C0529K("Channel", str, C0529K.f1123d.incrementAndGet());
        this.f1770a = c0529k;
        this.f1784l = c0785s3;
        C0092r c0092r3 = c0724d1.f1808a;
        AbstractC0076b.m133h(c0092r3, "executorPool");
        this.f1781i = c0092r3;
        Executor executor = (Executor) C0773p2.m1652a((InterfaceC0769o2) c0092r3.f130t);
        AbstractC0076b.m133h(executor, "executor");
        this.f1780h = executor;
        C0092r c0092r4 = c0724d1.f1809b;
        AbstractC0076b.m133h(c0092r4, "offloadExecutorPool");
        ExecutorC0690T0 executorC0690T0 = new ExecutorC0690T0(c0092r4);
        this.f1783k = executorC0690T0;
        C0774q c0774q = new C0774q(c0826g, executorC0690T0);
        this.f1778f = c0774q;
        ScheduledExecutorServiceC0712a1 scheduledExecutorServiceC0712a1 = new ScheduledExecutorServiceC0712a1(c0826g.f2189v);
        this.f1779g = scheduledExecutorServiceC0712a1;
        C0786t c0786t = new C0786t(c0529k, c0785s3.m1661e(), AbstractC0271e0.m399g("Channel for '", str, "'"));
        this.f1757N = c0786t;
        C0778r c0778r = new C0778r(c0786t, c0785s3);
        this.f1758O = c0778r;
        C0644D1 c0644d1 = AbstractC0759m0.f1931m;
        boolean z = c0724d1.f1822o;
        this.f1767X = z;
        C0793u2 c0793u2 = new C0793u2(c0724d1.f1814g);
        this.f1777e = c0793u2;
        C0577q0 c0577q0 = c0724d1.f1811d;
        this.f1774c = c0577q0;
        C0733f2 c0733f2 = new C0733f2(z, c0724d1.f1818k, c0724d1.f1819l, c0793u2);
        C0827h c0827h = c0724d1.f1831x.f2179a;
        int iM12193b = AbstractC6468c.m12193b(c0827h.f2203g);
        if (iM12193b == 0) {
            i2 = 443;
        } else {
            if (iM12193b != 1) {
                throw new AssertionError(AbstractC0271e0.m416x(c0827h.f2203g).concat(" not handled"));
            }
            i2 = 80;
        }
        Integer numValueOf = Integer.valueOf(i2);
        c0644d1.getClass();
        C0569m0 c0569m0 = new C0569m0(numValueOf, c0644d1, executorC0517A0, c0733f2, scheduledExecutorServiceC0712a1, c0778r, executorC0690T0);
        this.f1776d = c0569m0;
        c0774q.f2014s.getClass();
        this.f1794v = m1598C(str, c0577q0, c0569m0, Collections.singleton(InetSocketAddress.class));
        this.f1782j = new ExecutorC0690T0(c0092r);
        C0695V c0695v = new C0695V(executor, executorC0517A0);
        this.f1748E = c0695v;
        c0695v.mo1562a(c0092r2);
        this.f1791s = c0785s2;
        boolean z2 = c0724d1.f1824q;
        this.f1763T = z2;
        C0708Z0 c0708z0 = new C0708Z0(this, this.f1794v.mo1244j());
        this.f1760Q = c0708z0;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            AbstractC0076b.m133h(null, "interceptor");
            throw null;
        }
        this.f1792t = c0708z0;
        this.f1793u = new ArrayList(c0724d1.f1812e);
        AbstractC0076b.m133h(interfaceC0097w, "stopwatchSupplier");
        this.f1788p = interfaceC0097w;
        long j2 = c0724d1.f1817j;
        if (j2 == -1) {
            this.f1789q = j2;
        } else {
            AbstractC0076b.m128c(j2, j2 >= C0724d1.f1801A, "invalid idleTimeoutMillis %s");
            this.f1789q = c0724d1.f1817j;
        }
        this.f1773b0 = new C0662J1(new RunnableC0676O0(this, 5), executorC0517A0, c0826g.f2189v, (C0096v) interfaceC0097w.get());
        C0592y c0592y = c0724d1.f1815h;
        AbstractC0076b.m133h(c0592y, "decompressorRegistry");
        this.f1786n = c0592y;
        C0576q c0576q = c0724d1.f1816i;
        AbstractC0076b.m133h(c0576q, "compressorRegistry");
        this.f1787o = c0576q;
        this.f1766W = c0724d1.f1820m;
        this.f1765V = c0724d1.f1821n;
        this.f1755L = new C0785s2(14);
        this.f1756M = new C0742i();
        C0526H c0526h = c0724d1.f1823p;
        c0526h.getClass();
        this.f1759P = c0526h;
        if (z2) {
            return;
        }
        this.f1762S = true;
    }

    /* JADX INFO: renamed from: C */
    public static C0729e2 m1598C(String str, C0577q0 c0577q0, C0569m0 c0569m0, Collection collection) {
        URI uri;
        AbstractC0575p0 abstractC0575p0;
        C0569m0 c0569m1;
        String str2;
        String str3;
        String str4;
        AbstractC0119j abstractC0119j;
        AbstractC0119j abstractC0119j2;
        StringBuilder sb = new StringBuilder();
        C0719c0 c0719c0 = null;
        try {
            uri = new URI(str);
        } catch (URISyntaxException e) {
            sb.append(e.getMessage());
            uri = null;
        }
        if (uri == null) {
            abstractC0575p0 = null;
        } else {
            String scheme = uri.getScheme();
            if (scheme == null) {
                c0577q0.getClass();
                abstractC0575p0 = null;
            } else {
                synchronized (c0577q0) {
                    abstractC0119j2 = c0577q0.f1231c;
                }
                abstractC0575p0 = (AbstractC0575p0) ((C0134y) abstractC0119j2).get(scheme.toLowerCase(Locale.US));
            }
        }
        if (abstractC0575p0 == null && !f1737e0.matcher(str).matches()) {
            try {
                synchronized (c0577q0) {
                    str4 = c0577q0.f1229a;
                }
                uri = new URI(str4, "", "/" + str, null);
                String scheme2 = uri.getScheme();
                if (scheme2 == null) {
                    abstractC0575p0 = null;
                } else {
                    synchronized (c0577q0) {
                        abstractC0119j = c0577q0.f1231c;
                    }
                    abstractC0575p0 = (AbstractC0575p0) ((C0134y) abstractC0119j).get(scheme2.toLowerCase(Locale.US));
                }
            } catch (URISyntaxException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        if (abstractC0575p0 == null) {
            if (sb.length() > 0) {
                str3 = " (" + ((Object) sb) + ")";
            } else {
                str3 = "";
            }
            throw new IllegalArgumentException(AbstractC0271e0.m399g("Could not find a NameResolverProvider for ", str, str3));
        }
        if (collection != null && !collection.containsAll(Collections.singleton(InetSocketAddress.class))) {
            throw new IllegalArgumentException("Address types of NameResolver '" + uri.getScheme() + "' for '" + str + "' not supported by transport");
        }
        if ("dns".equals(uri.getScheme())) {
            String path = uri.getPath();
            AbstractC0076b.m133h(path, "targetPath");
            if (!path.startsWith("/")) {
                throw new IllegalArgumentException(AbstractC0076b.m141p("the path component (%s) of the target (%s) must start with '/'", path, uri));
            }
            String strSubstring = path.substring(1);
            uri.getAuthority();
            c0569m1 = c0569m0;
            c0719c0 = new C0719c0(strSubstring, c0569m1, AbstractC0759m0.f1934p, new C0096v(), C0723d0.f1800a);
        } else {
            c0569m1 = c0569m0;
        }
        if (c0719c0 != null) {
            C0785s2 c0785s2 = new C0785s2(7);
            ScheduledExecutorServiceC0712a1 scheduledExecutorServiceC0712a1 = c0569m1.f1213e;
            if (scheduledExecutorServiceC0712a1 == null) {
                throw new IllegalStateException("ScheduledExecutorService not set in Builder");
            }
            ExecutorC0517A0 executorC0517A0 = c0569m1.f1211c;
            return new C0729e2(c0719c0, new C0762n(c0785s2, scheduledExecutorServiceC0712a1, executorC0517A0), executorC0517A0);
        }
        if (sb.length() > 0) {
            str2 = " (" + ((Object) sb) + ")";
        } else {
            str2 = "";
        }
        throw new IllegalArgumentException(AbstractC0271e0.m399g("cannot create a NameResolver for ", str, str2));
    }

    /* JADX INFO: renamed from: x */
    public static void m1599x(C0720c1 c0720c1) {
        c0720c1.m1606F(true);
        C0695V c0695v = c0720c1.f1748E;
        c0695v.m1567h(null);
        c0720c1.f1758O.mo1299f(2, "Entering IDLE state");
        c0720c1.f1790r.m1518b(EnumC0578r.f1235v);
        C0787t0 c0787t0 = c0720c1.f1769Z;
        Object[] objArr = {c0720c1.f1746C, c0695v};
        c0787t0.getClass();
        for (int i2 = 0; i2 < 2; i2++) {
            if (c0787t0.f2042a.contains(objArr[i2])) {
                c0720c1.m1603B();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m1600y(C0720c1 c0720c1) {
        if (c0720c1.f1751H) {
            for (C0643D0 c0643d0 : c0720c1.f1744A) {
                ExecutorC0517A0 executorC0517A0 = c0643d0.f1422k;
                C0589w0 c0589w0 = f1738f0;
                executorC0517A0.execute(new RunnableC0795v0(c0643d0, c0589w0, 0));
                executorC0517A0.execute(new RunnableC0795v0(c0643d0, c0589w0, 1));
            }
            Iterator it = c0720c1.f1747D.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static void m1601z(C0720c1 c0720c1) {
        if (!c0720c1.f1753J && c0720c1.f1750G.get() && c0720c1.f1744A.isEmpty() && c0720c1.f1747D.isEmpty()) {
            c0720c1.f1758O.mo1299f(2, "Terminated");
            C0092r c0092r = c0720c1.f1781i;
            C0773p2.m1653b((InterfaceC0769o2) c0092r.f130t, c0720c1.f1780h);
            ExecutorC0690T0 executorC0690T0 = c0720c1.f1782j;
            synchronized (executorC0690T0) {
                Executor executor = executorC0690T0.f1577t;
                if (executor != null) {
                    C0773p2.m1653b((InterfaceC0769o2) executorC0690T0.f1576s.f130t, executor);
                    executorC0690T0.f1577t = null;
                }
            }
            ExecutorC0690T0 executorC0690T1 = c0720c1.f1783k;
            synchronized (executorC0690T1) {
                Executor executor2 = executorC0690T1.f1577t;
                if (executor2 != null) {
                    C0773p2.m1653b((InterfaceC0769o2) executorC0690T1.f1576s.f130t, executor2);
                    executorC0690T1.f1577t = null;
                }
            }
            c0720c1.f1778f.close();
            c0720c1.f1753J = true;
            c0720c1.f1754K.countDown();
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m1602A(boolean z) {
        ScheduledFuture scheduledFuture;
        C0662J1 c0662j1 = this.f1773b0;
        c0662j1.f1480f = false;
        if (!z || (scheduledFuture = c0662j1.f1481g) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        c0662j1.f1481g = null;
    }

    /* JADX INFO: renamed from: B */
    public final void m1603B() {
        this.f1785m.m1237d();
        if (this.f1750G.get() || this.f1798z) {
            return;
        }
        if (this.f1769Z.f2042a.isEmpty()) {
            m1604D();
        } else {
            m1602A(false);
        }
        if (this.f1796x != null) {
            return;
        }
        this.f1758O.mo1299f(2, "Exiting idle mode");
        C0693U0 c0693u0 = new C0693U0(this);
        C0793u2 c0793u2 = this.f1777e;
        c0793u2.getClass();
        C0742i c0742i = new C0742i();
        c0742i.f1889v = c0793u2;
        c0742i.f1886s = c0693u0;
        C0540W c0540w = (C0540W) c0793u2.f2060t;
        String str = (String) c0793u2.f2061u;
        AbstractC0539V abstractC0539VM1274b = c0540w.m1274b(str);
        c0742i.f1888u = abstractC0539VM1274b;
        if (abstractC0539VM1274b == null) {
            throw new IllegalStateException(AbstractC0271e0.m399g("Could not find policy '", str, "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
        }
        c0742i.f1887t = abstractC0539VM1274b.mo1271b(c0693u0);
        c0693u0.f1585d = c0742i;
        this.f1796x = c0693u0;
        this.f1794v.mo1249o(new C0696V0(this, c0693u0, this.f1794v));
        this.f1795w = true;
    }

    /* JADX INFO: renamed from: D */
    public final void m1604D() {
        long j2 = this.f1789q;
        if (j2 == -1) {
            return;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C0662J1 c0662j1 = this.f1773b0;
        c0662j1.getClass();
        long nanos = timeUnit.toNanos(j2);
        C0096v c0096v = c0662j1.f1478d;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jM168a = c0096v.m168a() + nanos;
        c0662j1.f1480f = true;
        if (jM168a - c0662j1.f1479e < 0 || c0662j1.f1481g == null) {
            ScheduledFuture scheduledFuture = c0662j1.f1481g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            c0662j1.f1481g = c0662j1.f1475a.schedule(new RunnableC0659I1(c0662j1, 1), nanos, timeUnit2);
        }
        c0662j1.f1479e = jM168a;
    }

    /* JADX INFO: renamed from: E */
    public final void m1605E() {
        this.f1758O.mo1299f(1, "shutdown() called");
        if (this.f1750G.compareAndSet(false, true)) {
            RunnableC0676O0 runnableC0676O0 = new RunnableC0676O0(this, 3);
            ExecutorC0517A0 executorC0517A0 = this.f1785m;
            executorC0517A0.execute(runnableC0676O0);
            C0708Z0 c0708z0 = this.f1760Q;
            c0708z0.f1656d.f1785m.execute(new RunnableC0702X0(c0708z0, 0));
            executorC0517A0.execute(new RunnableC0676O0(this, 0));
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m1606F(boolean z) {
        this.f1785m.m1237d();
        if (z) {
            AbstractC0076b.m139n(this.f1795w, "nameResolver is not started");
            AbstractC0076b.m139n(this.f1796x != null, "lbHelper is null");
        }
        C0729e2 c0729e2 = this.f1794v;
        if (c0729e2 != null) {
            c0729e2.mo1248n();
            this.f1795w = false;
            if (z) {
                String str = this.f1772b;
                C0577q0 c0577q0 = this.f1774c;
                C0569m0 c0569m0 = this.f1776d;
                this.f1778f.f2014s.getClass();
                this.f1794v = m1598C(str, c0577q0, c0569m0, Collections.singleton(InetSocketAddress.class));
            } else {
                this.f1794v = null;
            }
        }
        C0693U0 c0693u0 = this.f1796x;
        if (c0693u0 != null) {
            C0742i c0742i = c0693u0.f1585d;
            ((AbstractC0538U) c0742i.f1887t).mo1269f();
            c0742i.f1887t = null;
            this.f1796x = null;
        }
        this.f1797y = null;
    }

    @Override // p030R.InterfaceC0528J
    /* JADX INFO: renamed from: d */
    public final C0529K mo1253d() {
        return this.f1770a;
    }

    @Override // p030R.AbstractC0522D
    /* JADX INFO: renamed from: k */
    public final AbstractC0562j mo1245k(C0567l0 c0567l0, C0556g c0556g) {
        return this.f1792t.mo1245k(c0567l0, c0556g);
    }

    @Override // p030R.AbstractC0541X
    /* JADX INFO: renamed from: r */
    public final boolean mo1276r(long j2) {
        return this.f1754K.await(j2, TimeUnit.SECONDS);
    }

    @Override // p030R.AbstractC0541X
    /* JADX INFO: renamed from: s */
    public final void mo1277s() {
        this.f1785m.execute(new RunnableC0676O0(this, 1));
    }

    @Override // p030R.AbstractC0541X
    /* JADX INFO: renamed from: t */
    public final EnumC0578r mo1278t() {
        EnumC0578r enumC0578r = (EnumC0578r) this.f1790r.f1472a;
        if (enumC0578r == null) {
            throw new UnsupportedOperationException("Channel state API is not implemented");
        }
        if (enumC0578r == EnumC0578r.f1235v) {
            this.f1785m.execute(new RunnableC0676O0(this, 2));
        }
        return enumC0578r;
    }

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m157a(this.f1770a.f1126c, "logId");
        c0087mM143s.m158b(this.f1772b, TypedValues.AttributesType.S_TARGET);
        return c0087mM143s.toString();
    }

    @Override // p030R.AbstractC0541X
    /* JADX INFO: renamed from: u */
    public final void mo1279u(EnumC0578r enumC0578r, RunnableC5964g runnableC5964g) {
        this.f1785m.execute(new RunnableC0591x0(this, runnableC5964g, enumC0578r, 3));
    }

    @Override // p030R.AbstractC0541X
    /* JADX INFO: renamed from: v */
    public final /* bridge */ /* synthetic */ AbstractC0541X mo1280v() {
        m1605E();
        return this;
    }

    @Override // p030R.AbstractC0541X
    /* JADX INFO: renamed from: w */
    public final AbstractC0541X mo1281w() {
        this.f1758O.mo1299f(1, "shutdownNow() called");
        m1605E();
        C0708Z0 c0708z0 = this.f1760Q;
        c0708z0.f1656d.f1785m.execute(new RunnableC0702X0(c0708z0, 1));
        this.f1785m.execute(new RunnableC0676O0(this, 4));
        return this;
    }
}
