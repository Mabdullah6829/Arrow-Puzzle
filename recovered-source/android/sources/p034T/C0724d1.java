package p034T;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.location.LocationRequestCompat;
import androidx.webkit.Profile;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import p001B.AbstractC0076b;
import p001B.C0092r;
import p011H.AbstractC0271e0;
import p030R.AbstractC0522D;
import p030R.AbstractC0541X;
import p030R.AbstractC0542Y;
import p030R.AbstractC0558h;
import p030R.AbstractC0575p0;
import p030R.C0526H;
import p030R.C0572o;
import p030R.C0576q;
import p030R.C0577q0;
import p030R.C0592y;
import p036U.C0825f;
import p036U.C0826g;
import p036U.C0827h;
import p038V.C0857k;
import p072l.AbstractC6468c;

/* JADX INFO: renamed from: T.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0724d1 extends AbstractC0542Y {

    /* JADX INFO: renamed from: E */
    public static final Method f1805E;

    /* JADX INFO: renamed from: a */
    public final C0092r f1808a;

    /* JADX INFO: renamed from: b */
    public final C0092r f1809b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f1810c;

    /* JADX INFO: renamed from: d */
    public final C0577q0 f1811d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f1812e;

    /* JADX INFO: renamed from: f */
    public final String f1813f;

    /* JADX INFO: renamed from: g */
    public final String f1814g;

    /* JADX INFO: renamed from: h */
    public final C0592y f1815h;

    /* JADX INFO: renamed from: i */
    public final C0576q f1816i;

    /* JADX INFO: renamed from: j */
    public final long f1817j;

    /* JADX INFO: renamed from: k */
    public final int f1818k;

    /* JADX INFO: renamed from: l */
    public final int f1819l;

    /* JADX INFO: renamed from: m */
    public final long f1820m;

    /* JADX INFO: renamed from: n */
    public final long f1821n;

    /* JADX INFO: renamed from: o */
    public final boolean f1822o;

    /* JADX INFO: renamed from: p */
    public final C0526H f1823p;

    /* JADX INFO: renamed from: q */
    public final boolean f1824q;

    /* JADX INFO: renamed from: r */
    public final boolean f1825r;

    /* JADX INFO: renamed from: s */
    public final boolean f1826s;

    /* JADX INFO: renamed from: t */
    public final boolean f1827t;

    /* JADX INFO: renamed from: u */
    public final boolean f1828u;

    /* JADX INFO: renamed from: v */
    public final boolean f1829v;

    /* JADX INFO: renamed from: w */
    public final C0825f f1830w;

    /* JADX INFO: renamed from: x */
    public final C0825f f1831x;

    /* JADX INFO: renamed from: y */
    public static final Logger f1806y = Logger.getLogger(C0724d1.class.getName());

    /* JADX INFO: renamed from: z */
    public static final long f1807z = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: A */
    public static final long f1801A = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: B */
    public static final C0092r f1802B = new C0092r(AbstractC0759m0.f1934p, 8);

    /* JADX INFO: renamed from: C */
    public static final C0592y f1803C = C0592y.f1297d;

    /* JADX INFO: renamed from: D */
    public static final C0576q f1804D = C0576q.f1225b;

    static {
        Method declaredMethod;
        try {
            Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
            Class cls2 = Boolean.TYPE;
            declaredMethod = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e) {
            f1806y.log(Level.FINE, "Unable to apply census stats", (Throwable) e);
            declaredMethod = null;
        } catch (NoSuchMethodException e2) {
            f1806y.log(Level.FINE, "Unable to apply census stats", (Throwable) e2);
            declaredMethod = null;
        }
        f1805E = declaredMethod;
    }

    public C0724d1(String str, C0825f c0825f, C0825f c0825f2) {
        C0577q0 c0577q0;
        C0092r c0092r = f1802B;
        this.f1808a = c0092r;
        this.f1809b = c0092r;
        this.f1810c = new ArrayList();
        Logger logger = C0577q0.f1227d;
        synchronized (C0577q0.class) {
            try {
                if (C0577q0.f1228e == null) {
                    ArrayList arrayList = new ArrayList();
                    try {
                        boolean z = C0723d0.f1800a;
                        arrayList.add(C0723d0.class);
                    } catch (ClassNotFoundException e) {
                        C0577q0.f1227d.log(Level.FINE, "Unable to find DNS NameResolver", (Throwable) e);
                    }
                    List<AbstractC0575p0> listM1294e = AbstractC0558h.m1294e(AbstractC0575p0.class, Collections.unmodifiableList(arrayList), AbstractC0575p0.class.getClassLoader(), new C0572o(9));
                    if (listM1294e.isEmpty()) {
                        C0577q0.f1227d.warning("No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                    }
                    C0577q0.f1228e = new C0577q0();
                    for (AbstractC0575p0 abstractC0575p0 : listM1294e) {
                        C0577q0.f1227d.fine("Service loader found " + abstractC0575p0);
                        C0577q0 c0577q1 = C0577q0.f1228e;
                        synchronized (c0577q1) {
                            abstractC0575p0.getClass();
                            c0577q1.f1230b.add(abstractC0575p0);
                        }
                    }
                    C0577q0.f1228e.m1339a();
                }
                c0577q0 = C0577q0.f1228e;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f1811d = c0577q0;
        this.f1812e = new ArrayList();
        this.f1814g = "pick_first";
        this.f1815h = f1803C;
        this.f1816i = f1804D;
        this.f1817j = f1807z;
        this.f1818k = 5;
        this.f1819l = 5;
        this.f1820m = 16777216L;
        this.f1821n = 1048576L;
        this.f1822o = true;
        this.f1823p = C0526H.f1118e;
        this.f1824q = true;
        this.f1825r = true;
        this.f1826s = true;
        this.f1827t = true;
        this.f1828u = true;
        this.f1829v = true;
        AbstractC0076b.m133h(str, TypedValues.AttributesType.S_TARGET);
        this.f1813f = str;
        this.f1830w = c0825f;
        this.f1831x = c0825f2;
    }

    @Override // p030R.AbstractC0542Y
    /* JADX INFO: renamed from: a */
    public final AbstractC0541X mo1232a() {
        SSLSocketFactory sSLSocketFactory;
        Method method;
        C0827h c0827h = this.f1830w.f2179a;
        boolean z = c0827h.f2204h != LocationRequestCompat.PASSIVE_INTERVAL;
        C0092r c0092r = c0827h.f2199c;
        C0092r c0092r2 = c0827h.f2200d;
        int iM12193b = AbstractC6468c.m12193b(c0827h.f2203g);
        if (iM12193b == 0) {
            try {
                if (c0827h.f2201e == null) {
                    c0827h.f2201e = SSLContext.getInstance(Profile.DEFAULT_PROFILE_NAME, C0857k.f2368d.f2369a).getSocketFactory();
                }
                sSLSocketFactory = c0827h.f2201e;
            } catch (GeneralSecurityException e) {
                throw new RuntimeException("TLS Provider failure", e);
            }
        } else {
            if (iM12193b != 1) {
                throw new RuntimeException("Unknown negotiation type: ".concat(AbstractC0271e0.m416x(c0827h.f2203g)));
            }
            sSLSocketFactory = null;
        }
        C0826g c0826g = new C0826g(c0092r, c0092r2, sSLSocketFactory, c0827h.f2202f, c0827h.f2207k, z, c0827h.f2204h, c0827h.f2205i, c0827h.f2206j, c0827h.f2208l, c0827h.f2198b);
        C0785s2 c0785s2 = new C0785s2(7);
        C0092r c0092r3 = new C0092r(AbstractC0759m0.f1934p, 8);
        C0785s2 c0785s3 = AbstractC0759m0.f1936r;
        ArrayList arrayList = new ArrayList(this.f1810c);
        synchronized (AbstractC0522D.class) {
        }
        if (this.f1825r && (method = f1805E) != null) {
            try {
                if (method.invoke(null, Boolean.valueOf(this.f1826s), Boolean.valueOf(this.f1827t), Boolean.FALSE, Boolean.valueOf(this.f1828u)) != null) {
                    throw new ClassCastException();
                }
            } catch (IllegalAccessException e2) {
                f1806y.log(Level.FINE, "Unable to apply census stats", (Throwable) e2);
            } catch (InvocationTargetException e3) {
                f1806y.log(Level.FINE, "Unable to apply census stats", (Throwable) e3);
            }
        }
        if (this.f1829v) {
            try {
                if (Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getClientInterceptor", null).invoke(null, null) != null) {
                    throw new ClassCastException();
                }
            } catch (ClassNotFoundException e4) {
                f1806y.log(Level.FINE, "Unable to apply census stats", (Throwable) e4);
            } catch (IllegalAccessException e5) {
                f1806y.log(Level.FINE, "Unable to apply census stats", (Throwable) e5);
            } catch (NoSuchMethodException e6) {
                f1806y.log(Level.FINE, "Unable to apply census stats", (Throwable) e6);
            } catch (InvocationTargetException e7) {
                f1806y.log(Level.FINE, "Unable to apply census stats", (Throwable) e7);
            }
        }
        return new C0732f1(new C0720c1(this, c0826g, c0785s2, c0092r3, c0785s3, arrayList));
    }
}
