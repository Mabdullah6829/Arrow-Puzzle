package p034T;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.base.VerifyException;
import com.google.gson.stream.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001B.AbstractC0072B;
import p001B.AbstractC0076b;
import p001B.C0086l;
import p001B.C0096v;
import p030R.AbstractC0522D;
import p030R.AbstractC0558h;
import p030R.C0540W;
import p030R.C0569m0;
import p030R.C0571n0;
import p030R.C0589w0;
import p030R.C0594z;
import p030R.ExecutorC0517A0;
import p030R.InterfaceC0579r0;

/* JADX INFO: renamed from: T.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0719c0 extends AbstractC0522D {

    /* JADX INFO: renamed from: s */
    public static final Logger f1712s;

    /* JADX INFO: renamed from: t */
    public static final Set f1713t;

    /* JADX INFO: renamed from: u */
    public static final boolean f1714u;

    /* JADX INFO: renamed from: v */
    public static final boolean f1715v;

    /* JADX INFO: renamed from: w */
    public static final boolean f1716w;

    /* JADX INFO: renamed from: x */
    public static String f1717x;

    /* JADX INFO: renamed from: a */
    public final InterfaceC0579r0 f1718a;

    /* JADX INFO: renamed from: b */
    public final Random f1719b = new Random();

    /* JADX INFO: renamed from: c */
    public volatile EnumC0711a0 f1720c = EnumC0711a0.f1666s;

    /* JADX INFO: renamed from: d */
    public final AtomicReference f1721d = new AtomicReference();

    /* JADX INFO: renamed from: e */
    public final String f1722e;

    /* JADX INFO: renamed from: f */
    public final String f1723f;

    /* JADX INFO: renamed from: g */
    public final int f1724g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC0769o2 f1725h;

    /* JADX INFO: renamed from: i */
    public final long f1726i;

    /* JADX INFO: renamed from: j */
    public final ExecutorC0517A0 f1727j;

    /* JADX INFO: renamed from: k */
    public final C0096v f1728k;

    /* JADX INFO: renamed from: l */
    public boolean f1729l;

    /* JADX INFO: renamed from: m */
    public boolean f1730m;

    /* JADX INFO: renamed from: n */
    public Executor f1731n;

    /* JADX INFO: renamed from: o */
    public final boolean f1732o;

    /* JADX INFO: renamed from: p */
    public final C0733f2 f1733p;

    /* JADX INFO: renamed from: q */
    public boolean f1734q;

    /* JADX INFO: renamed from: r */
    public AbstractC0558h f1735r;

    static {
        Logger logger = Logger.getLogger(C0719c0.class.getName());
        f1712s = logger;
        f1713t = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f1714u = Boolean.parseBoolean(property);
        f1715v = Boolean.parseBoolean(property2);
        f1716w = Boolean.parseBoolean(property3);
        try {
            try {
                try {
                    if (Class.forName("T.E0", true, C0719c0.class.getClassLoader()).asSubclass(InterfaceC0715b0.class).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (Exception e) {
                    logger.log(Level.FINE, "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e);
                }
            } catch (Exception e2) {
                logger.log(Level.FINE, "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e2);
            }
        } catch (ClassCastException e3) {
            logger.log(Level.FINE, "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e3);
        } catch (ClassNotFoundException e4) {
            logger.log(Level.FINE, "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e4);
        }
    }

    public C0719c0(String str, C0569m0 c0569m0, InterfaceC0769o2 interfaceC0769o2, C0096v c0096v, boolean z) {
        AbstractC0076b.m133h(c0569m0, "args");
        this.f1725h = interfaceC0769o2;
        AbstractC0076b.m133h(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        URI uriCreate = URI.create("//".concat(str));
        AbstractC0076b.m129d("Invalid DNS name: %s", uriCreate.getHost() != null, str);
        String authority = uriCreate.getAuthority();
        AbstractC0076b.m134i(authority, "nameUri (%s) doesn't have an authority", uriCreate);
        this.f1722e = authority;
        this.f1723f = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.f1724g = c0569m0.f1209a;
        } else {
            this.f1724g = uriCreate.getPort();
        }
        InterfaceC0579r0 interfaceC0579r0 = c0569m0.f1210b;
        AbstractC0076b.m133h(interfaceC0579r0, "proxyDetector");
        this.f1718a = interfaceC0579r0;
        long nanos = 0;
        if (!z) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j2 = 30;
            if (property != null) {
                try {
                    j2 = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    f1712s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            nanos = j2 > 0 ? TimeUnit.SECONDS.toNanos(j2) : j2;
        }
        this.f1726i = nanos;
        this.f1728k = c0096v;
        ExecutorC0517A0 executorC0517A0 = c0569m0.f1211c;
        AbstractC0076b.m133h(executorC0517A0, "syncContext");
        this.f1727j = executorC0517A0;
        ExecutorC0690T0 executorC0690T0 = c0569m0.f1215g;
        this.f1731n = executorC0690T0;
        this.f1732o = executorC0690T0 == null;
        C0733f2 c0733f2 = c0569m0.f1212d;
        AbstractC0076b.m133h(c0733f2, "serviceConfigParser");
        this.f1733p = c0733f2;
    }

    /* JADX INFO: renamed from: s */
    public static Map m1593s(Map map, Random random, String str) {
        for (Map.Entry entry : map.entrySet()) {
            AbstractC0076b.m144t("Bad key: %s", f1713t.contains(entry.getKey()), entry);
        }
        List listM1508d = AbstractC0655H0.m1508d("clientLanguage", map);
        if (listM1508d != null && !listM1508d.isEmpty()) {
            Iterator it = listM1508d.iterator();
            while (it.hasNext()) {
                if ("java".equalsIgnoreCase((String) it.next())) {
                }
            }
            return null;
        }
        Double dM1509e = AbstractC0655H0.m1509e("percentage", map);
        if (dM1509e != null) {
            int iIntValue = dM1509e.intValue();
            AbstractC0076b.m144t("Bad percentage: %s", iIntValue >= 0 && iIntValue <= 100, dM1509e);
            if (random.nextInt(100) >= iIntValue) {
                return null;
            }
        }
        List listM1508d2 = AbstractC0655H0.m1508d("clientHostname", map);
        if (listM1508d2 != null && !listM1508d2.isEmpty()) {
            Iterator it2 = listM1508d2.iterator();
            while (it2.hasNext()) {
                if (((String) it2.next()).equals(str)) {
                }
            }
            return null;
        }
        Map mapM1511g = AbstractC0655H0.m1511g("serviceConfig", map);
        if (mapM1511g != null) {
            return mapM1511g;
        }
        throw new VerifyException(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    /* JADX INFO: renamed from: t */
    public static ArrayList m1594t() {
        List<String> list = Collections.EMPTY_LIST;
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.startsWith("grpc_config=")) {
                String strSubstring = str.substring(12);
                Logger logger = AbstractC0652G0.f1457a;
                JsonReader jsonReader = new JsonReader(new StringReader(strSubstring));
                try {
                    Object objM1504a = AbstractC0652G0.m1504a(jsonReader);
                    try {
                        jsonReader.close();
                    } catch (IOException e) {
                        logger.log(Level.WARNING, "Failed to close", (Throwable) e);
                    }
                    if (!(objM1504a instanceof List)) {
                        throw new ClassCastException("wrong type " + objM1504a);
                    }
                    List list2 = (List) objM1504a;
                    AbstractC0655H0.m1505a(list2);
                    arrayList.addAll(list2);
                } catch (Throwable th) {
                    try {
                        jsonReader.close();
                    } catch (IOException e2) {
                        logger.log(Level.WARNING, "Failed to close", (Throwable) e2);
                    }
                    throw th;
                }
            } else {
                f1712s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    @Override // p030R.AbstractC0522D
    /* JADX INFO: renamed from: j */
    public final String mo1244j() {
        return this.f1722e;
    }

    @Override // p030R.AbstractC0522D
    /* JADX INFO: renamed from: l */
    public final void mo1246l() {
        AbstractC0076b.m139n(this.f1735r != null, "not started");
        m1596u();
    }

    @Override // p030R.AbstractC0522D
    /* JADX INFO: renamed from: n */
    public final void mo1248n() {
        if (this.f1730m) {
            return;
        }
        this.f1730m = true;
        Executor executor = this.f1731n;
        if (executor == null || !this.f1732o) {
            return;
        }
        C0773p2.m1653b(this.f1725h, executor);
        this.f1731n = null;
    }

    @Override // p030R.AbstractC0522D
    /* JADX INFO: renamed from: o */
    public final void mo1249o(AbstractC0558h abstractC0558h) {
        AbstractC0076b.m139n(this.f1735r == null, "already started");
        if (this.f1732o) {
            this.f1731n = (Executor) C0773p2.m1652a(this.f1725h);
        }
        this.f1735r = abstractC0558h;
        m1596u();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX INFO: renamed from: r */
    public final C0086l m1595r() {
        boolean z;
        C0571n0 c0571n0;
        C0571n0 c0571n1;
        List listM1636u;
        C0571n0 c0571n2;
        String str = this.f1723f;
        C0086l c0086l = new C0086l(3);
        try {
            c0086l.f113u = m1597v();
            if (!f1716w) {
                return c0086l;
            }
            List list = Collections.EMPTY_LIST;
            int i2 = 0;
            if (!f1714u) {
                z = false;
            } else if ("localhost".equalsIgnoreCase(str)) {
                z = f1715v;
            } else if (str.contains(":")) {
                z = false;
            } else {
                boolean z2 = true;
                for (int i3 = 0; i3 < str.length(); i3++) {
                    char cCharAt = str.charAt(i3);
                    if (cCharAt != '.') {
                        z2 &= cCharAt >= '0' && cCharAt <= '9';
                    }
                }
                z = true ^ z2;
            }
            if (z && this.f1721d.get() != null) {
                throw new ClassCastException();
            }
            Object c0571n3 = null;
            if (list.isEmpty()) {
                f1712s.log(Level.FINE, "No TXT records found for {0}", new Object[]{str});
            } else {
                Random random = this.f1719b;
                if (f1717x == null) {
                    try {
                        f1717x = InetAddress.getLocalHost().getHostName();
                    } catch (UnknownHostException e) {
                        throw new RuntimeException(e);
                    }
                }
                String str2 = f1717x;
                try {
                    ArrayList arrayListM1594t = m1594t();
                    int size = arrayListM1594t.size();
                    Map mapM1593s = null;
                    while (i2 < size) {
                        Object obj = arrayListM1594t.get(i2);
                        i2++;
                        try {
                            mapM1593s = m1593s((Map) obj, random, str2);
                            if (mapM1593s != null) {
                                break;
                            }
                        } catch (RuntimeException e2) {
                            c0571n0 = new C0571n0(C0589w0.f1277g.m1354g("failed to pick service config choice").m1353f(e2));
                        }
                    }
                    c0571n0 = mapM1593s == null ? null : new C0571n0(mapM1593s);
                } catch (IOException | RuntimeException e3) {
                    c0571n0 = new C0571n0(C0589w0.f1277g.m1354g("failed to parse TXT records").m1353f(e3));
                }
                if (c0571n0 != null) {
                    C0589w0 c0589w0 = c0571n0.f1217a;
                    if (c0589w0 != null) {
                        c0571n3 = new C0571n0(c0589w0);
                    } else {
                        Map map = (Map) c0571n0.f1218b;
                        C0733f2 c0733f2 = this.f1733p;
                        c0733f2.getClass();
                        try {
                            C0793u2 c0793u2 = c0733f2.f1866d;
                            c0793u2.getClass();
                            if (map != null) {
                                try {
                                    listM1636u = AbstractC0761m2.m1636u(AbstractC0761m2.m1634p(map));
                                } catch (RuntimeException e4) {
                                    c0571n2 = new C0571n0(C0589w0.f1277g.m1354g("can't parse load balancer configuration").m1353f(e4));
                                }
                            } else {
                                listM1636u = null;
                            }
                            c0571n2 = (listM1636u == null || listM1636u.isEmpty()) ? null : AbstractC0761m2.m1635t(listM1636u, (C0540W) c0793u2.f2060t);
                            if (c0571n2 != null) {
                                C0589w0 c0589w1 = c0571n2.f1217a;
                                if (c0589w1 != null) {
                                    c0571n3 = new C0571n0(c0589w1);
                                } else {
                                    c0571n3 = c0571n2.f1218b;
                                }
                            }
                            c0571n1 = new C0571n0(C0744i1.m1615a(map, c0733f2.f1863a, c0733f2.f1864b, c0733f2.f1865c, c0571n3));
                        } catch (RuntimeException e5) {
                            c0571n1 = new C0571n0(C0589w0.f1277g.m1354g("failed to parse service config").m1353f(e5));
                        }
                        c0571n3 = c0571n1;
                    }
                }
            }
            c0086l.f114v = c0571n3;
            return c0086l;
        } catch (Exception e6) {
            c0086l.f112t = C0589w0.f1284n.m1354g("Unable to resolve host " + str).m1353f(e6);
            return c0086l;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m1596u() {
        if (this.f1734q || this.f1730m) {
            return;
        }
        if (this.f1729l) {
            long j2 = this.f1726i;
            if (j2 != 0) {
                if (j2 <= 0) {
                    return;
                }
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                if (this.f1728k.m168a() <= j2) {
                    return;
                }
            }
        }
        this.f1734q = true;
        this.f1731n.execute(new RunnableC0666L(this, this.f1735r));
    }

    /* JADX INFO: renamed from: v */
    public final List m1597v() {
        try {
            try {
                EnumC0711a0 enumC0711a0 = this.f1720c;
                String str = this.f1723f;
                enumC0711a0.getClass();
                List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
                ArrayList arrayList = new ArrayList(listUnmodifiableList.size());
                Iterator it = listUnmodifiableList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C0594z(new InetSocketAddress((InetAddress) it.next(), this.f1724g)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e) {
                Object obj = AbstractC0072B.f99a;
                if (e instanceof RuntimeException) {
                    throw ((RuntimeException) e);
                }
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                f1712s.log(Level.FINE, "Address resolution failure", (Throwable) null);
            }
            throw th;
        }
    }
}
