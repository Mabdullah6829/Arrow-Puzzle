package p034T;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001B.AbstractC0076b;
import p001B.C0080f;
import p001B.C0084j;
import p011H.ThreadFactoryC0277h0;
import p030R.AbstractC0522D;
import p030R.AbstractC0530L;
import p030R.AbstractC0566l;
import p030R.AbstractC0570n;
import p030R.C0534P;
import p030R.C0549c0;
import p030R.C0555f0;
import p030R.C0556g;
import p030R.C0559h0;
import p030R.C0568m;
import p030R.C0572o;
import p030R.C0589w0;
import p030R.EnumC0587v0;

/* JADX INFO: renamed from: T.m0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0759m0 {

    /* JADX INFO: renamed from: a */
    public static final Logger f1919a = Logger.getLogger(AbstractC0759m0.class.getName());

    /* JADX INFO: renamed from: b */
    public static final Set f1920b = Collections.unmodifiableSet(EnumSet.of(EnumC0587v0.OK, EnumC0587v0.INVALID_ARGUMENT, EnumC0587v0.NOT_FOUND, EnumC0587v0.ALREADY_EXISTS, EnumC0587v0.FAILED_PRECONDITION, EnumC0587v0.ABORTED, EnumC0587v0.OUT_OF_RANGE, EnumC0587v0.DATA_LOSS));

    /* JADX INFO: renamed from: c */
    public static final C0549c0 f1921c;

    /* JADX INFO: renamed from: d */
    public static final C0549c0 f1922d;

    /* JADX INFO: renamed from: e */
    public static final C0555f0 f1923e;

    /* JADX INFO: renamed from: f */
    public static final C0549c0 f1924f;

    /* JADX INFO: renamed from: g */
    public static final C0555f0 f1925g;

    /* JADX INFO: renamed from: h */
    public static final C0549c0 f1926h;

    /* JADX INFO: renamed from: i */
    public static final C0549c0 f1927i;

    /* JADX INFO: renamed from: j */
    public static final C0549c0 f1928j;

    /* JADX INFO: renamed from: k */
    public static final C0549c0 f1929k;

    /* JADX INFO: renamed from: l */
    public static final long f1930l;

    /* JADX INFO: renamed from: m */
    public static final C0644D1 f1931m;

    /* JADX INFO: renamed from: n */
    public static final C0084j f1932n;

    /* JADX INFO: renamed from: o */
    public static final C0751k0 f1933o;

    /* JADX INFO: renamed from: p */
    public static final C0785s2 f1934p;

    /* JADX INFO: renamed from: q */
    public static final C0785s2 f1935q;

    /* JADX INFO: renamed from: r */
    public static final C0785s2 f1936r;

    static {
        Charset.forName("US-ASCII");
        f1921c = new C0549c0("grpc-timeout", new C0785s2(12));
        C0572o c0572o = C0559h0.f1187d;
        f1922d = new C0549c0("grpc-encoding", c0572o);
        f1923e = AbstractC0530L.m1255a("grpc-accept-encoding", new C0785s2(11));
        f1924f = new C0549c0("content-encoding", c0572o);
        f1925g = AbstractC0530L.m1255a("accept-encoding", new C0785s2(11));
        f1926h = new C0549c0("content-length", c0572o);
        f1927i = new C0549c0("content-type", c0572o);
        f1928j = new C0549c0("te", c0572o);
        f1929k = new C0549c0("user-agent", c0572o);
        C0080f.f106c.getClass();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f1930l = timeUnit.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        timeUnit.toNanos(20L);
        f1931m = new C0644D1();
        f1932n = new C0084j("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", 2);
        f1933o = new C0751k0();
        f1934p = new C0785s2(8);
        f1935q = new C0785s2(9);
        f1936r = new C0785s2(10);
    }

    /* JADX INFO: renamed from: a */
    public static URI m1620a(String str) {
        String str2;
        AbstractC0076b.m133h(str, "authority");
        try {
            str2 = str;
            try {
                return new URI(null, str2, null, null, null);
            } catch (URISyntaxException e) {
                e = e;
                throw new IllegalArgumentException("Invalid authority: ".concat(str2), e);
            }
        } catch (URISyntaxException e2) {
            e = e2;
            str2 = str;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1621b(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            f1919a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC0570n[] m1622c(C0556g c0556g, C0559h0 c0559h0, int i2, boolean z) {
        List list = c0556g.f1179e;
        int size = list.size();
        AbstractC0570n[] abstractC0570nArr = new AbstractC0570n[size + 1];
        C0556g c0556g2 = C0556g.f1174i;
        C0568m c0568m = new C0568m(c0556g, i2, z);
        for (int i3 = 0; i3 < list.size(); i3++) {
            abstractC0570nArr[i3] = ((AbstractC0566l) list.get(i3)).mo1316a(c0568m, c0559h0);
        }
        abstractC0570nArr[size] = f1933o;
        return abstractC0570nArr;
    }

    /* JADX INFO: renamed from: d */
    public static String m1623d(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", null).invoke(inetSocketAddress, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    /* JADX INFO: renamed from: e */
    public static ThreadFactoryC0277h0 m1624e(String str) {
        Boolean bool = Boolean.TRUE;
        String.format(Locale.ROOT, str, 0);
        return new ThreadFactoryC0277h0(Executors.defaultThreadFactory(), str, new AtomicLong(0L), bool);
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC0639C m1625f(C0534P c0534p, boolean z) {
        C0804y0 c0804y0;
        AbstractC0522D abstractC0522D = c0534p.f1136a;
        C0589w0 c0589w0 = c0534p.f1138c;
        if (abstractC0522D == null) {
            c0804y0 = null;
        } else {
            C0643D0 c0643d0 = (C0643D0) abstractC0522D.mo1243i();
            c0804y0 = c0643d0.f1433v;
            if (c0804y0 == null) {
                c0643d0.f1422k.execute(new RunnableC0791u0(c0643d0, 1));
                c0804y0 = null;
            }
        }
        if (c0804y0 != null) {
            AbstractC0566l abstractC0566l = c0534p.f1137b;
            return abstractC0566l == null ? c0804y0 : new C0735g0(abstractC0566l, c0804y0);
        }
        if (!c0589w0.m1352e()) {
            if (c0534p.f1139d) {
                return new C0735g0(m1627h(c0589w0), EnumC0633A.f1393u);
            }
            if (!z) {
                return new C0735g0(m1627h(c0589w0), EnumC0633A.f1391s);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0029  */
    /* JADX WARN: Code duplicated, block: B:25:0x0035  */
    /* JADX INFO: renamed from: g */
    public static C0589w0 m1626g(int i2) {
        EnumC0587v0 enumC0587v0;
        if ((i2 >= 100 && i2 < 200) || i2 == 400) {
            enumC0587v0 = EnumC0587v0.INTERNAL;
        } else if (i2 == 401) {
            enumC0587v0 = EnumC0587v0.UNAUTHENTICATED;
        } else if (i2 == 403) {
            enumC0587v0 = EnumC0587v0.PERMISSION_DENIED;
        } else if (i2 == 404) {
            enumC0587v0 = EnumC0587v0.UNIMPLEMENTED;
        } else if (i2 == 429) {
            enumC0587v0 = EnumC0587v0.UNAVAILABLE;
        } else if (i2 != 431) {
            switch (i2) {
                case TypedValues.PositionType.TYPE_DRAWPATH /* 502 */:
                case TypedValues.PositionType.TYPE_PERCENT_WIDTH /* 503 */:
                case TypedValues.PositionType.TYPE_PERCENT_HEIGHT /* 504 */:
                    enumC0587v0 = EnumC0587v0.UNAVAILABLE;
                    break;
                default:
                    enumC0587v0 = EnumC0587v0.UNKNOWN;
                    break;
            }
        } else {
            enumC0587v0 = EnumC0587v0.INTERNAL;
        }
        return enumC0587v0.m1345b().m1354g("HTTP status code " + i2);
    }

    /* JADX INFO: renamed from: h */
    public static C0589w0 m1627h(C0589w0 c0589w0) {
        AbstractC0076b.m130e(c0589w0 != null);
        if (!f1920b.contains(c0589w0.f1287a)) {
            return c0589w0;
        }
        return C0589w0.f1283m.m1354g("Inappropriate status code from control plane: " + c0589w0.f1287a + " " + c0589w0.f1288b).m1353f(c0589w0.f1289c);
    }
}
