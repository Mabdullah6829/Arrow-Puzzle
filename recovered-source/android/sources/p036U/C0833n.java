package p036U;

import androidx.core.internal.view.SupportMenu;
import androidx.core.location.LocationRequestCompat;
import androidx.datastore.preferences.protobuf.AbstractC1456a;
import androidx.webkit.ProxyConfig;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.grpc.StatusException;
import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.AbstractC6452k;
import p001B.AbstractC0076b;
import p001B.C0087m;
import p001B.C0092r;
import p001B.InterfaceC0097w;
import p003C.C0118i;
import p006D0.C0177l;
import p011H.AbstractC0271e0;
import p024O.C0458a;
import p024O.C0463f;
import p030R.AbstractC0570n;
import p030R.C0523E;
import p030R.C0529K;
import p030R.C0544a;
import p030R.C0546b;
import p030R.C0556g;
import p030R.C0559h0;
import p030R.C0567l0;
import p030R.C0589w0;
import p030R.EnumC0565k0;
import p030R.RunnableC0591x0;
import p033S0.AbstractC0608b;
import p033S0.C0610d;
import p033S0.C0613g;
import p033S0.C0616j;
import p033S0.C0628v;
import p033S0.C0630x;
import p034T.AbstractC0759m0;
import p034T.AbstractC0761m2;
import p034T.C0637B0;
import p034T.C0661J0;
import p034T.C0664K0;
import p034T.C0777q2;
import p034T.C0779r0;
import p034T.C0783s0;
import p034T.C0785s2;
import p034T.C0787t0;
import p034T.C0793u2;
import p034T.EnumC0633A;
import p034T.ExecutorC0749j2;
import p034T.InterfaceC0654H;
import p034T.InterfaceC0748j1;
import p034T.InterfaceC0806z;
import p034T.RunnableC0681Q;
import p034T.RunnableC0775q0;
import p035T0.AbstractC0809a;
import p035T0.AbstractC0810b;
import p038V.C0849c;
import p039W.C0869i;
import p039W.C0870j;
import p039W.EnumC0861a;
import p040X.C0872a;
import p058e0.AbstractC6298f;
import p091y0.AbstractC6571a;

/* JADX INFO: renamed from: U.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0833n implements InterfaceC0654H {

    /* JADX INFO: renamed from: P */
    public static final Map f2239P;

    /* JADX INFO: renamed from: Q */
    public static final Logger f2240Q;

    /* JADX INFO: renamed from: A */
    public final SocketFactory f2241A;

    /* JADX INFO: renamed from: B */
    public final SSLSocketFactory f2242B;

    /* JADX INFO: renamed from: C */
    public int f2243C;

    /* JADX INFO: renamed from: D */
    public final LinkedList f2244D;

    /* JADX INFO: renamed from: E */
    public final C0849c f2245E;

    /* JADX INFO: renamed from: F */
    public C0664K0 f2246F;

    /* JADX INFO: renamed from: G */
    public boolean f2247G;

    /* JADX INFO: renamed from: H */
    public long f2248H;

    /* JADX INFO: renamed from: I */
    public long f2249I;

    /* JADX INFO: renamed from: J */
    public final RunnableC0681Q f2250J;

    /* JADX INFO: renamed from: K */
    public final int f2251K;

    /* JADX INFO: renamed from: L */
    public final C0793u2 f2252L;

    /* JADX INFO: renamed from: M */
    public final C0787t0 f2253M;

    /* JADX INFO: renamed from: N */
    public final C0523E f2254N;

    /* JADX INFO: renamed from: O */
    public final int f2255O;

    /* JADX INFO: renamed from: a */
    public final InetSocketAddress f2256a;

    /* JADX INFO: renamed from: b */
    public final String f2257b;

    /* JADX INFO: renamed from: c */
    public final String f2258c;

    /* JADX INFO: renamed from: d */
    public final Random f2259d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0097w f2260e;

    /* JADX INFO: renamed from: f */
    public final int f2261f;

    /* JADX INFO: renamed from: g */
    public final C0870j f2262g;

    /* JADX INFO: renamed from: h */
    public C0637B0 f2263h;

    /* JADX INFO: renamed from: i */
    public C0823d f2264i;

    /* JADX INFO: renamed from: j */
    public C0463f f2265j;

    /* JADX INFO: renamed from: k */
    public final Object f2266k;

    /* JADX INFO: renamed from: l */
    public final C0529K f2267l;

    /* JADX INFO: renamed from: m */
    public int f2268m;

    /* JADX INFO: renamed from: n */
    public final HashMap f2269n;

    /* JADX INFO: renamed from: o */
    public final Executor f2270o;

    /* JADX INFO: renamed from: p */
    public final ExecutorC0749j2 f2271p;

    /* JADX INFO: renamed from: q */
    public final ScheduledExecutorService f2272q;

    /* JADX INFO: renamed from: r */
    public final int f2273r;

    /* JADX INFO: renamed from: s */
    public int f2274s;

    /* JADX INFO: renamed from: t */
    public RunnableC0832m f2275t;

    /* JADX INFO: renamed from: u */
    public C0546b f2276u;

    /* JADX INFO: renamed from: v */
    public C0589w0 f2277v;

    /* JADX INFO: renamed from: w */
    public boolean f2278w;

    /* JADX INFO: renamed from: x */
    public C0779r0 f2279x;

    /* JADX INFO: renamed from: y */
    public boolean f2280y;

    /* JADX INFO: renamed from: z */
    public boolean f2281z;

    static {
        EnumMap enumMap = new EnumMap(EnumC0861a.class);
        C0589w0 c0589w0 = C0589w0.f1283m;
        enumMap.put(EnumC0861a.NO_ERROR, c0589w0.m1354g("No error: A GRPC status of OK should have been sent"));
        enumMap.put(EnumC0861a.PROTOCOL_ERROR, c0589w0.m1354g("Protocol error"));
        enumMap.put(EnumC0861a.INTERNAL_ERROR, c0589w0.m1354g("Internal error"));
        enumMap.put(EnumC0861a.FLOW_CONTROL_ERROR, c0589w0.m1354g("Flow control error"));
        enumMap.put(EnumC0861a.STREAM_CLOSED, c0589w0.m1354g("Stream closed"));
        enumMap.put(EnumC0861a.FRAME_TOO_LARGE, c0589w0.m1354g("Frame too large"));
        enumMap.put(EnumC0861a.REFUSED_STREAM, C0589w0.f1284n.m1354g("Refused stream"));
        enumMap.put(EnumC0861a.CANCEL, C0589w0.f1276f.m1354g("Cancelled"));
        enumMap.put(EnumC0861a.COMPRESSION_ERROR, c0589w0.m1354g("Compression error"));
        enumMap.put(EnumC0861a.CONNECT_ERROR, c0589w0.m1354g("Connect error"));
        enumMap.put(EnumC0861a.ENHANCE_YOUR_CALM, C0589w0.f1281k.m1354g("Enhance your calm"));
        enumMap.put(EnumC0861a.INADEQUATE_SECURITY, C0589w0.f1279i.m1354g("Inadequate security"));
        f2239P = Collections.unmodifiableMap(enumMap);
        f2240Q = Logger.getLogger(C0833n.class.getName());
    }

    public C0833n(C0826g c0826g, InetSocketAddress inetSocketAddress, String str, C0546b c0546b, C0523E c0523e, RunnableC0681Q runnableC0681Q) {
        C0785s2 c0785s2 = AbstractC0759m0.f1936r;
        C0870j c0870j = new C0870j();
        this.f2259d = new Random();
        Object obj = new Object();
        this.f2266k = obj;
        this.f2269n = new HashMap();
        this.f2243C = 0;
        this.f2244D = new LinkedList();
        this.f2253M = new C0787t0(this, 2);
        this.f2255O = 30000;
        AbstractC0076b.m133h(inetSocketAddress, "address");
        this.f2256a = inetSocketAddress;
        this.f2257b = str;
        this.f2273r = c0826g.f2193z;
        this.f2261f = c0826g.f2183D;
        Executor executor = c0826g.f2187t;
        AbstractC0076b.m133h(executor, "executor");
        this.f2270o = executor;
        this.f2271p = new ExecutorC0749j2(c0826g.f2187t);
        ScheduledExecutorService scheduledExecutorService = c0826g.f2189v;
        AbstractC0076b.m133h(scheduledExecutorService, "scheduledExecutorService");
        this.f2272q = scheduledExecutorService;
        this.f2268m = 3;
        this.f2241A = SocketFactory.getDefault();
        this.f2242B = c0826g.f2191x;
        C0849c c0849c = c0826g.f2192y;
        AbstractC0076b.m133h(c0849c, "connectionSpec");
        this.f2245E = c0849c;
        AbstractC0076b.m133h(c0785s2, "stopwatchFactory");
        this.f2260e = c0785s2;
        this.f2262g = c0870j;
        this.f2258c = "grpc-java-okhttp/1.62.2";
        this.f2254N = c0523e;
        this.f2250J = runnableC0681Q;
        this.f2251K = c0826g.f2184E;
        c0826g.f2190w.getClass();
        this.f2252L = new C0793u2();
        this.f2267l = C0529K.m1254a(C0833n.class, inetSocketAddress.toString());
        C0546b c0546b2 = C0546b.f1154b;
        C0544a c0544a = AbstractC0761m2.f1956b;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(c0544a, c0546b);
        for (Map.Entry entry : c0546b2.f1155a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((C0544a) entry.getKey(), entry.getValue());
            }
        }
        this.f2276u = new C0546b(identityHashMap);
        synchronized (obj) {
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m1715f(C0833n c0833n, String str) {
        EnumC0861a enumC0861a = EnumC0861a.PROTOCOL_ERROR;
        c0833n.m1728r(0, enumC0861a, m1718v(enumC0861a).m1351a(str));
    }

    /* JADX INFO: renamed from: g */
    public static Socket m1716g(C0833n c0833n, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws StatusException {
        SocketFactory socketFactory = c0833n.f2241A;
        Socket socket = null;
        try {
            Socket socketCreateSocket = inetSocketAddress2.getAddress() != null ? socketFactory.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : socketFactory.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            try {
                socketCreateSocket.setTcpNoDelay(true);
                socketCreateSocket.setSoTimeout(c0833n.f2255O);
                C0610d c0610dM1373f = AbstractC0608b.m1373f(socketCreateSocket);
                C0628v c0628v = new C0628v(AbstractC0608b.m1372e(socketCreateSocket));
                C0177l c0177lM1719h = c0833n.m1719h(inetSocketAddress, str, str2);
                C0092r c0092r = (C0092r) c0177lM1719h.f332t;
                C0872a c0872a = (C0872a) c0177lM1719h.f333u;
                Locale locale = Locale.US;
                c0628v.m1461j("CONNECT " + c0872a.f2446a + ":" + c0872a.f2447b + " HTTP/1.1");
                c0628v.m1461j("\r\n");
                String[] strArr = (String[]) c0092r.f130t;
                String[] strArr2 = (String[]) c0092r.f130t;
                int length = strArr.length / 2;
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = i2 * 2;
                    c0628v.m1461j((i3 < 0 || i3 >= strArr2.length) ? null : strArr2[i3]);
                    c0628v.m1461j(": ");
                    int i4 = i3 + 1;
                    c0628v.m1461j((i4 < 0 || i4 >= strArr2.length) ? null : strArr2[i4]);
                    c0628v.m1461j("\r\n");
                }
                c0628v.m1461j("\r\n");
                c0628v.flush();
                C0118i c0118iM197c = C0118i.m197c(m1717p(c0610dM1373f));
                int i5 = c0118iM197c.f174c;
                while (!m1717p(c0610dM1373f).equals("")) {
                }
                if (i5 >= 200 && i5 < 300) {
                    socketCreateSocket.setSoTimeout(0);
                    return socketCreateSocket;
                }
                C0613g c0613g = new C0613g();
                try {
                    socketCreateSocket.shutdownOutput();
                    c0610dM1373f.mo1359m(c0613g, 1024L);
                } catch (IOException e) {
                    c0613g.m1389Q("Unable to read body: " + e.toString());
                }
                try {
                    socketCreateSocket.close();
                } catch (IOException unused) {
                }
                Locale locale2 = Locale.US;
                throw new StatusException(C0589w0.f1284n.m1354g("Response returned from proxy was not successful (expected 2xx, got " + i5 + " " + ((String) c0118iM197c.f175d) + "). Response body:\n" + c0613g.m1381I(c0613g.f1342t, AbstractC6571a.f24799a)));
            } catch (IOException e2) {
                e = e2;
                socket = socketCreateSocket;
                if (socket != null) {
                    AbstractC0759m0.m1621b(socket);
                }
                throw new StatusException(C0589w0.f1284n.m1354g("Failed trying to connect with proxy").m1353f(e));
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    /* JADX INFO: renamed from: p */
    public static String m1717p(C0610d c0610d) throws EOFException {
        long j2;
        C0630x c0630x;
        long j3;
        long j4;
        long j5;
        long j6;
        C0613g c0613g = new C0613g();
        do {
            j2 = -1;
            if (c0610d.mo1359m(c0613g, 1L) == -1) {
                throw new EOFException("\\n not found: " + c0613g.m1397u(c0613g.f1342t).mo1405f());
            }
        } while (c0613g.m1392i(c0613g.f1342t - 1) != 10);
        long j7 = c0613g.f1342t;
        long j8 = LocationRequestCompat.PASSIVE_INTERVAL > j7 ? j7 : Long.MAX_VALUE;
        long j9 = 0;
        if (0 == j8 || (c0630x = c0613g.f1341s) == null) {
            j3 = j2;
            j4 = j9;
            j6 = j3;
        } else {
            if (j7 < 0) {
                while (j7 > 0) {
                    c0630x = c0630x.f1385g;
                    AbstractC6452k.m12178b(c0630x);
                    j7 -= (long) (c0630x.f1381c - c0630x.f1380b);
                }
                long j10 = 0;
                while (true) {
                    if (j7 < j8) {
                        byte[] bArr = c0630x.f1379a;
                        j3 = j2;
                        j4 = j9;
                        int iMin = (int) Math.min(c0630x.f1381c, (((long) c0630x.f1380b) + j8) - j7);
                        int i2 = (int) ((((long) c0630x.f1380b) + j10) - j7);
                        while (true) {
                            if (i2 >= iMin) {
                                j10 = j7 + ((long) (c0630x.f1381c - c0630x.f1380b));
                                c0630x = c0630x.f1384f;
                                AbstractC6452k.m12178b(c0630x);
                                j7 = j10;
                                j2 = j3;
                                j9 = j4;
                            } else if (bArr[i2] == 10) {
                                j5 = i2 - c0630x.f1380b;
                            } else {
                                i2++;
                            }
                        }
                    } else {
                        j3 = j2;
                        j4 = j9;
                        j6 = j3;
                    }
                }
            } else {
                j3 = -1;
                j4 = 0;
                j7 = 0;
                while (true) {
                    long j11 = ((long) (c0630x.f1381c - c0630x.f1380b)) + j7;
                    if (j11 > 0) {
                        break;
                    }
                    c0630x = c0630x.f1384f;
                    AbstractC6452k.m12178b(c0630x);
                    j7 = j11;
                }
                long j12 = 0;
                while (true) {
                    if (j7 < j8) {
                        byte[] bArr2 = c0630x.f1379a;
                        int iMin2 = (int) Math.min(c0630x.f1381c, (((long) c0630x.f1380b) + j8) - j7);
                        int i3 = (int) ((((long) c0630x.f1380b) + j12) - j7);
                        while (true) {
                            if (i3 >= iMin2) {
                                j12 = ((long) (c0630x.f1381c - c0630x.f1380b)) + j7;
                                c0630x = c0630x.f1384f;
                                AbstractC6452k.m12178b(c0630x);
                                j7 = j12;
                            } else if (bArr2[i3] == 10) {
                                j5 = i3 - c0630x.f1380b;
                            } else {
                                i3++;
                            }
                        }
                    } else {
                        j6 = j3;
                    }
                }
            }
            j6 = j5 + j7;
        }
        if (j6 != j3) {
            return AbstractC0809a.m1682a(c0613g, j6);
        }
        if (LocationRequestCompat.PASSIVE_INTERVAL < c0613g.f1342t && c0613g.m1392i(9223372036854775806L) == 13 && c0613g.m1392i(LocationRequestCompat.PASSIVE_INTERVAL) == 10) {
            return AbstractC0809a.m1682a(c0613g, LocationRequestCompat.PASSIVE_INTERVAL);
        }
        C0613g c0613g2 = new C0613g();
        long jMin = Math.min(32, c0613g.f1342t);
        long j13 = 0;
        AbstractC0608b.m1370c(c0613g.f1342t, 0L, jMin);
        if (jMin != j4) {
            c0613g2.f1342t += jMin;
            C0630x c0630x2 = c0613g.f1341s;
            while (true) {
                AbstractC6452k.m12178b(c0630x2);
                long j14 = c0630x2.f1381c - c0630x2.f1380b;
                if (j13 < j14) {
                    break;
                }
                j13 -= j14;
                c0630x2 = c0630x2.f1384f;
            }
            while (jMin > j4) {
                AbstractC6452k.m12178b(c0630x2);
                C0630x c0630xM1474c = c0630x2.m1474c();
                int i4 = c0630xM1474c.f1380b + ((int) j13);
                c0630xM1474c.f1380b = i4;
                c0630xM1474c.f1381c = Math.min(i4 + ((int) jMin), c0630xM1474c.f1381c);
                C0630x c0630x3 = c0613g2.f1341s;
                if (c0630x3 == null) {
                    c0630xM1474c.f1385g = c0630xM1474c;
                    c0630xM1474c.f1384f = c0630xM1474c;
                    c0613g2.f1341s = c0630xM1474c;
                } else {
                    C0630x c0630x4 = c0630x3.f1385g;
                    AbstractC6452k.m12178b(c0630x4);
                    c0630x4.m1473b(c0630xM1474c);
                }
                jMin -= (long) (c0630xM1474c.f1381c - c0630xM1474c.f1380b);
                c0630x2 = c0630x2.f1384f;
                j13 = j4;
            }
        }
        throw new EOFException("\\n not found: limit=" + Math.min(c0613g.f1342t, LocationRequestCompat.PASSIVE_INTERVAL) + " content=" + c0613g2.m1397u(c0613g2.f1342t).mo1405f() + (char) 8230);
    }

    /* JADX INFO: renamed from: v */
    public static C0589w0 m1718v(EnumC0861a enumC0861a) {
        C0589w0 c0589w0 = (C0589w0) f2239P.get(enumC0861a);
        if (c0589w0 != null) {
            return c0589w0;
        }
        return C0589w0.f1277g.m1354g("Unknown http2 error code: " + enumC0861a.f2398s);
    }

    @Override // p034T.InterfaceC0752k1
    /* JADX INFO: renamed from: a */
    public final Runnable mo1562a(InterfaceC0748j1 interfaceC0748j1) {
        this.f2263h = (C0637B0) interfaceC0748j1;
        if (this.f2247G) {
            C0664K0 c0664k0 = new C0664K0(new C0092r(this, 5), this.f2272q, this.f2248H, this.f2249I);
            this.f2246F = c0664k0;
            synchronized (c0664k0) {
            }
        }
        C0822c c0822c = new C0822c(this.f2271p, this);
        C0870j c0870j = this.f2262g;
        C0628v c0628v = new C0628v(c0822c);
        c0870j.getClass();
        C0821b c0821b = new C0821b(c0822c, new C0869i(c0628v));
        synchronized (this.f2266k) {
            C0823d c0823d = new C0823d(this, c0821b);
            this.f2264i = c0823d;
            this.f2265j = new C0463f(this, c0823d);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f2271p.execute(new RunnableC0591x0(this, countDownLatch, c0822c, 5));
        try {
            m1727q();
            countDownLatch.countDown();
            this.f2271p.execute(new RunnableC0681Q(this, 13));
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    @Override // p034T.InterfaceC0752k1
    /* JADX INFO: renamed from: b */
    public final void mo1563b(C0589w0 c0589w0) {
        synchronized (this.f2266k) {
            try {
                if (this.f2277v != null) {
                    return;
                }
                this.f2277v = c0589w0;
                this.f2263h.m1481c(c0589w0);
                m1731u();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p034T.InterfaceC0639C
    /* JADX INFO: renamed from: c */
    public final InterfaceC0806z mo1483c(C0567l0 c0567l0, C0559h0 c0559h0, C0556g c0556g, AbstractC0570n[] abstractC0570nArr) {
        C0830k c0830k;
        AbstractC0076b.m133h(c0567l0, FirebaseAnalytics.Param.METHOD);
        AbstractC0076b.m133h(c0559h0, "headers");
        C0546b c0546b = this.f2276u;
        C0777q2 c0777q2 = new C0777q2(abstractC0570nArr);
        for (AbstractC0570n abstractC0570n : abstractC0570nArr) {
            abstractC0570n.mo1334n(c0546b, c0559h0);
        }
        synchronized (this.f2266k) {
            c0830k = new C0830k(c0567l0, c0559h0, this.f2264i, this, this.f2265j, this.f2266k, this.f2273r, this.f2261f, this.f2257b, this.f2258c, c0777q2, this.f2252L, c0556g);
        }
        return c0830k;
    }

    @Override // p030R.InterfaceC0528J
    /* JADX INFO: renamed from: d */
    public final C0529K mo1253d() {
        return this.f2267l;
    }

    @Override // p034T.InterfaceC0752k1
    /* JADX INFO: renamed from: e */
    public final void mo1564e(C0589w0 c0589w0) {
        mo1563b(c0589w0);
        synchronized (this.f2266k) {
            try {
                Iterator it = this.f2269n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    it.remove();
                    ((C0830k) entry.getValue()).f2231n.m1591g(c0589w0, false, new C0559h0());
                    m1725n((C0830k) entry.getValue());
                }
                for (C0830k c0830k : this.f2244D) {
                    c0830k.f2231n.m1590f(c0589w0, EnumC0633A.f1394v, true, new C0559h0());
                    m1725n(c0830k);
                }
                this.f2244D.clear();
                m1731u();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p034T.InterfaceC0654H
    public final C0546b getAttributes() {
        return this.f2276u;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x026a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0296 A[LOOP:9: B:89:0x0252->B:116:0x0296, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:123:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:126:0x02b9 A[LOOP:4: B:122:0x02ab->B:126:0x02b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x0306 A[EDGE_INSN: B:141:0x0306->B:199:0x0481 BREAK  A[LOOP:11: B:186:0x045e->B:197:0x047d]] */
    /* JADX WARN: Code duplicated, block: B:142:0x0309  */
    /* JADX WARN: Code duplicated, block: B:144:0x0312  */
    /* JADX WARN: Code duplicated, block: B:147:0x0318  */
    /* JADX WARN: Code duplicated, block: B:149:0x031b  */
    /* JADX WARN: Code duplicated, block: B:156:0x032e  */
    /* JADX WARN: Code duplicated, block: B:161:0x033e  */
    /* JADX WARN: Code duplicated, block: B:167:0x0350  */
    /* JADX WARN: Code duplicated, block: B:170:0x0369  */
    /* JADX WARN: Code duplicated, block: B:171:0x037e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0403 A[LOOP:8: B:172:0x0401->B:173:0x0403, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:177:0x043d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0066  */
    /* JADX WARN: Code duplicated, block: B:22:0x006a  */
    /* JADX WARN: Code duplicated, block: B:238:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX WARN: Code duplicated, block: B:255:0x02bf A[EDGE_INSN: B:255:0x02bf->B:127:0x02bf BREAK  A[LOOP:4: B:122:0x02ab->B:126:0x02b9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x0330 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0075  */
    /* JADX WARN: Code duplicated, block: B:263:0x034e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x034a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x0342 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x033b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x009b  */
    /* JADX WARN: Code duplicated, block: B:273:0x020e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:40:0x0136  */
    /* JADX WARN: Code duplicated, block: B:43:0x0185  */
    /* JADX WARN: Code duplicated, block: B:48:0x0197  */
    /* JADX WARN: Code duplicated, block: B:50:0x019b  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:53:0x01af  */
    /* JADX WARN: Code duplicated, block: B:55:0x01c6  */
    /* JADX INFO: renamed from: h */
    public final C0177l m1719h(InetSocketAddress inetSocketAddress, String str, String str2) throws EOFException {
        int i2;
        int i3;
        String strSubstring;
        int i4;
        String strM1381I;
        int i5;
        InetAddress byAddress;
        byte[] address;
        int i6;
        int i7;
        int i8;
        int i9;
        C0613g c0613g;
        int i10;
        long j2;
        int i11;
        byte[] bArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        char cCharAt;
        int i21;
        int i22;
        int iM1794a;
        int i23;
        String str3;
        char[] cArr;
        int i24;
        int i25;
        int i26 = 0;
        C0118i c0118i = new C0118i(3, (byte) 0);
        int i27 = -1;
        c0118i.f174c = -1;
        c0118i.f173b = ProxyConfig.MATCH_HTTPS;
        String hostName = inetSocketAddress.getHostName();
        if (hostName == null) {
            throw new IllegalArgumentException("host == null");
        }
        int length = hostName.length();
        int iCharCount = 0;
        while (true) {
            int i28 = 2;
            if (iCharCount >= length) {
                i2 = 2;
                i3 = 1;
                strSubstring = hostName.substring(0, length);
                break;
            }
            i3 = 1;
            int i29 = 37;
            if (hostName.charAt(iCharCount) == '%') {
                C0613g c0613g2 = new C0613g();
                c0613g2.m1388P(iCharCount, hostName);
                while (iCharCount < length) {
                    int i30 = i26;
                    int iCodePointAt = hostName.codePointAt(iCharCount);
                    if (iCodePointAt == i29 && (i25 = iCharCount + 2) < length) {
                        int iM1794a2 = C0872a.m1794a(hostName.charAt(iCharCount + 1));
                        int iM1794a3 = C0872a.m1794a(hostName.charAt(i25));
                        if (iM1794a2 != i27 && iM1794a3 != i27) {
                            c0613g2.m1387O((iM1794a2 << 4) + iM1794a3);
                            i23 = i28;
                            iCharCount = i25;
                        } else if (iCodePointAt < 128) {
                            c0613g2.m1387O(iCodePointAt);
                            i23 = i28;
                        } else if (iCodePointAt < 2048) {
                            C0630x c0630xM1385M = c0613g2.m1385M(i28);
                            byte[] bArr2 = c0630xM1385M.f1379a;
                            int i31 = c0630xM1385M.f1381c;
                            i23 = i28;
                            bArr2[i31] = (byte) ((iCodePointAt >> 6) | 192);
                            bArr2[i31 + 1] = (byte) ((iCodePointAt & 63) | 128);
                            c0630xM1385M.f1381c = i31 + 2;
                            c0613g2.f1342t += 2;
                        } else {
                            i23 = i28;
                            if (55296 > iCodePointAt) {
                                if (iCodePointAt < 65536) {
                                    C0630x c0630xM1385M2 = c0613g2.m1385M(3);
                                    byte[] bArr3 = c0630xM1385M2.f1379a;
                                    int i32 = c0630xM1385M2.f1381c;
                                    bArr3[i32] = (byte) ((iCodePointAt >> 12) | 224);
                                    bArr3[i32 + 1] = (byte) (((iCodePointAt >> 6) & 63) | 128);
                                    bArr3[i32 + 2] = (byte) (128 | (iCodePointAt & 63));
                                    c0630xM1385M2.f1381c = i32 + 3;
                                    c0613g2.f1342t += 3;
                                } else {
                                    if (iCodePointAt > 1114111) {
                                        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
                                        if (iCodePointAt != 0) {
                                            char[] cArr2 = AbstractC0810b.f2119a;
                                            char c = cArr2[(iCodePointAt >> 28) & 15];
                                            char c2 = cArr2[(iCodePointAt >> 24) & 15];
                                            char c3 = cArr2[(iCodePointAt >> 20) & 15];
                                            char c4 = cArr2[(iCodePointAt >> 16) & 15];
                                            char c5 = cArr2[(iCodePointAt >> 12) & 15];
                                            char c6 = cArr2[(iCodePointAt >> 8) & 15];
                                            char c7 = cArr2[(iCodePointAt >> 4) & 15];
                                            char c8 = cArr2[iCodePointAt & 15];
                                            cArr = new char[8];
                                            cArr[i30] = c;
                                            cArr[1] = c2;
                                            cArr[i23] = c3;
                                            cArr[3] = c4;
                                            cArr[4] = c5;
                                            cArr[5] = c6;
                                            cArr[6] = c7;
                                            cArr[7] = c8;
                                            i24 = i30;
                                            while (i24 < 8) {
                                                i24++;
                                            }
                                            AbstractC6298f.Companion.getClass();
                                            if (i24 < 0) {
                                                StringBuilder sbM409q = AbstractC0271e0.m409q("startIndex: ", i24, ", endIndex: ", 8, ", size: ");
                                                sbM409q.append(8);
                                                throw new IndexOutOfBoundsException(sbM409q.toString());
                                            }
                                            if (i24 > 8) {
                                                throw new IllegalArgumentException(AbstractC1456a.m2443j(i24, 8, "startIndex: ", " > endIndex: "));
                                            }
                                            str3 = new String(cArr, i24, 8 - i24);
                                        } else {
                                            str3 = "0";
                                        }
                                        sb.append(str3);
                                        throw new IllegalArgumentException(sb.toString());
                                    }
                                    C0630x c0630xM1385M3 = c0613g2.m1385M(4);
                                    byte[] bArr4 = c0630xM1385M3.f1379a;
                                    int i33 = c0630xM1385M3.f1381c;
                                    bArr4[i33] = (byte) ((iCodePointAt >> 18) | 240);
                                    bArr4[i33 + 1] = (byte) (((iCodePointAt >> 12) & 63) | 128);
                                    bArr4[i33 + 2] = (byte) (((iCodePointAt >> 6) & 63) | 128);
                                    bArr4[i33 + 3] = (byte) (128 | (iCodePointAt & 63));
                                    c0630xM1385M3.f1381c = i33 + 4;
                                    c0613g2.f1342t += 4;
                                }
                            } else if (iCodePointAt < 65536) {
                                C0630x c0630xM1385M4 = c0613g2.m1385M(3);
                                byte[] bArr5 = c0630xM1385M4.f1379a;
                                int i34 = c0630xM1385M4.f1381c;
                                bArr5[i34] = (byte) ((iCodePointAt >> 12) | 224);
                                bArr5[i34 + 1] = (byte) (((iCodePointAt >> 6) & 63) | 128);
                                bArr5[i34 + 2] = (byte) (128 | (iCodePointAt & 63));
                                c0630xM1385M4.f1381c = i34 + 3;
                                c0613g2.f1342t += 3;
                            } else {
                                if (iCodePointAt > 1114111) {
                                    StringBuilder sb2 = new StringBuilder("Unexpected code point: 0x");
                                    if (iCodePointAt != 0) {
                                        char[] cArr3 = AbstractC0810b.f2119a;
                                        char c9 = cArr3[(iCodePointAt >> 28) & 15];
                                        char c10 = cArr3[(iCodePointAt >> 24) & 15];
                                        char c11 = cArr3[(iCodePointAt >> 20) & 15];
                                        char c12 = cArr3[(iCodePointAt >> 16) & 15];
                                        char c13 = cArr3[(iCodePointAt >> 12) & 15];
                                        char c14 = cArr3[(iCodePointAt >> 8) & 15];
                                        char c15 = cArr3[(iCodePointAt >> 4) & 15];
                                        char c16 = cArr3[iCodePointAt & 15];
                                        cArr = new char[8];
                                        cArr[i30] = c9;
                                        cArr[1] = c10;
                                        cArr[i23] = c11;
                                        cArr[3] = c12;
                                        cArr[4] = c13;
                                        cArr[5] = c14;
                                        cArr[6] = c15;
                                        cArr[7] = c16;
                                        i24 = i30;
                                        while (i24 < 8) {
                                            i24++;
                                        }
                                        AbstractC6298f.Companion.getClass();
                                        if (i24 < 0) {
                                            StringBuilder sbM409q2 = AbstractC0271e0.m409q("startIndex: ", i24, ", endIndex: ", 8, ", size: ");
                                            sbM409q2.append(8);
                                            throw new IndexOutOfBoundsException(sbM409q2.toString());
                                        }
                                        if (i24 > 8) {
                                            throw new IllegalArgumentException(AbstractC1456a.m2443j(i24, 8, "startIndex: ", " > endIndex: "));
                                        }
                                        str3 = new String(cArr, i24, 8 - i24);
                                    } else {
                                        str3 = "0";
                                    }
                                    sb2.append(str3);
                                    throw new IllegalArgumentException(sb2.toString());
                                }
                                C0630x c0630xM1385M5 = c0613g2.m1385M(4);
                                byte[] bArr6 = c0630xM1385M5.f1379a;
                                int i35 = c0630xM1385M5.f1381c;
                                bArr6[i35] = (byte) ((iCodePointAt >> 18) | 240);
                                bArr6[i35 + 1] = (byte) (((iCodePointAt >> 12) & 63) | 128);
                                bArr6[i35 + 2] = (byte) (((iCodePointAt >> 6) & 63) | 128);
                                bArr6[i35 + 3] = (byte) (128 | (iCodePointAt & 63));
                                c0630xM1385M5.f1381c = i35 + 4;
                                c0613g2.f1342t += 4;
                            }
                        }
                    } else if (iCodePointAt < 128) {
                        c0613g2.m1387O(iCodePointAt);
                        i23 = i28;
                    } else if (iCodePointAt < 2048) {
                        C0630x c0630xM1385M6 = c0613g2.m1385M(i28);
                        byte[] bArr7 = c0630xM1385M6.f1379a;
                        int i36 = c0630xM1385M6.f1381c;
                        i23 = i28;
                        bArr7[i36] = (byte) ((iCodePointAt >> 6) | 192);
                        bArr7[i36 + 1] = (byte) ((iCodePointAt & 63) | 128);
                        c0630xM1385M6.f1381c = i36 + 2;
                        c0613g2.f1342t += 2;
                    } else {
                        i23 = i28;
                        if (55296 > iCodePointAt && iCodePointAt < 57344) {
                            c0613g2.m1387O(63);
                        } else if (iCodePointAt < 65536) {
                            C0630x c0630xM1385M7 = c0613g2.m1385M(3);
                            byte[] bArr8 = c0630xM1385M7.f1379a;
                            int i37 = c0630xM1385M7.f1381c;
                            bArr8[i37] = (byte) ((iCodePointAt >> 12) | 224);
                            bArr8[i37 + 1] = (byte) (((iCodePointAt >> 6) & 63) | 128);
                            bArr8[i37 + 2] = (byte) (128 | (iCodePointAt & 63));
                            c0630xM1385M7.f1381c = i37 + 3;
                            c0613g2.f1342t += 3;
                        } else {
                            if (iCodePointAt > 1114111) {
                                StringBuilder sb3 = new StringBuilder("Unexpected code point: 0x");
                                if (iCodePointAt != 0) {
                                    char[] cArr4 = AbstractC0810b.f2119a;
                                    char c17 = cArr4[(iCodePointAt >> 28) & 15];
                                    char c18 = cArr4[(iCodePointAt >> 24) & 15];
                                    char c19 = cArr4[(iCodePointAt >> 20) & 15];
                                    char c110 = cArr4[(iCodePointAt >> 16) & 15];
                                    char c111 = cArr4[(iCodePointAt >> 12) & 15];
                                    char c112 = cArr4[(iCodePointAt >> 8) & 15];
                                    char c113 = cArr4[(iCodePointAt >> 4) & 15];
                                    char c114 = cArr4[iCodePointAt & 15];
                                    cArr = new char[8];
                                    cArr[i30] = c17;
                                    cArr[1] = c18;
                                    cArr[i23] = c19;
                                    cArr[3] = c110;
                                    cArr[4] = c111;
                                    cArr[5] = c112;
                                    cArr[6] = c113;
                                    cArr[7] = c114;
                                    i24 = i30;
                                    while (i24 < 8 && cArr[i24] == '0') {
                                        i24++;
                                    }
                                    AbstractC6298f.Companion.getClass();
                                    if (i24 < 0) {
                                        StringBuilder sbM409q3 = AbstractC0271e0.m409q("startIndex: ", i24, ", endIndex: ", 8, ", size: ");
                                        sbM409q3.append(8);
                                        throw new IndexOutOfBoundsException(sbM409q3.toString());
                                    }
                                    if (i24 > 8) {
                                        throw new IllegalArgumentException(AbstractC1456a.m2443j(i24, 8, "startIndex: ", " > endIndex: "));
                                    }
                                    str3 = new String(cArr, i24, 8 - i24);
                                } else {
                                    str3 = "0";
                                }
                                sb3.append(str3);
                                throw new IllegalArgumentException(sb3.toString());
                            }
                            C0630x c0630xM1385M8 = c0613g2.m1385M(4);
                            byte[] bArr9 = c0630xM1385M8.f1379a;
                            int i38 = c0630xM1385M8.f1381c;
                            bArr9[i38] = (byte) ((iCodePointAt >> 18) | 240);
                            bArr9[i38 + 1] = (byte) (((iCodePointAt >> 12) & 63) | 128);
                            bArr9[i38 + 2] = (byte) (((iCodePointAt >> 6) & 63) | 128);
                            bArr9[i38 + 3] = (byte) (128 | (iCodePointAt & 63));
                            c0630xM1385M8.f1381c = i38 + 4;
                            c0613g2.f1342t += 4;
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                    i26 = i30;
                    i28 = i23;
                    i27 = -1;
                    i29 = 37;
                }
                i2 = i28;
                strSubstring = c0613g2.m1381I(c0613g2.f1342t, AbstractC6571a.f24799a);
                break;
            }
            iCharCount++;
        }
        if (!strSubstring.startsWith("[") || !strSubstring.endsWith("]")) {
            try {
                String lowerCase = IDN.toASCII(strSubstring).toLowerCase(Locale.US);
                if (!lowerCase.isEmpty()) {
                    while (true) {
                        if (i4 >= lowerCase.length()) {
                            strM1381I = lowerCase;
                            break;
                        }
                        char cCharAt2 = lowerCase.charAt(i4);
                        i4 = (cCharAt2 > 31 && cCharAt2 < 127 && " #%/:?@[\\]".indexOf(cCharAt2) == -1) ? i4 + 1 : 0;
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            strM1381I = null;
            break;
        }
        int length2 = strSubstring.length() - 1;
        int i39 = 16;
        byte[] bArr10 = new byte[16];
        int i40 = i3;
        int i41 = 0;
        int i42 = -1;
        int i43 = -1;
        while (true) {
            try {
                if (i40 < length2) {
                    if (i41 != i39) {
                        int i44 = i40 + 2;
                        if (i44 <= length2) {
                            i17 = i41;
                            if (strSubstring.regionMatches(i40, "::", 0, i2)) {
                                if (i42 == -1) {
                                    i41 = i17 + 2;
                                    if (i44 == length2) {
                                        i42 = i41;
                                        i5 = 16;
                                    } else {
                                        i43 = i44;
                                        i42 = i41;
                                        i40 = i43;
                                        i21 = 0;
                                        while (i40 < length2) {
                                            iM1794a = C0872a.m1794a(strSubstring.charAt(i40));
                                            if (iM1794a == -1) {
                                                break;
                                            }
                                            i21 = (i21 << 4) + iM1794a;
                                            i40++;
                                        }
                                        i22 = i40 - i43;
                                        if (i22 == 0 && i22 <= 4) {
                                            int i45 = i41 + 1;
                                            bArr10[i41] = (byte) (255 & (i21 >>> 8));
                                            i41 += 2;
                                            bArr10[i45] = (byte) (i21 & 255);
                                            strSubstring = strSubstring;
                                            i39 = 16;
                                            i3 = 1;
                                            i2 = 2;
                                        }
                                    }
                                }
                            }
                        } else {
                            i17 = i41;
                        }
                        if (i17 != 0) {
                            int i46 = i3;
                            if (strSubstring.regionMatches(i40, ":", 0, i46)) {
                                i40++;
                            } else if (strSubstring.regionMatches(i40, ".", 0, i46)) {
                                int i47 = i17 - 2;
                                int i48 = i47;
                                while (true) {
                                    if (i43 >= length2) {
                                        if (i48 == i17 + 2) {
                                            i41 = i17 + 2;
                                            i5 = 16;
                                        }
                                        if (byAddress == null) {
                                            strM1381I = null;
                                            break;
                                        }
                                        address = byAddress.getAddress();
                                        i6 = 16;
                                        if (address.length == 16) {
                                            throw new AssertionError();
                                        }
                                        i7 = 0;
                                        i8 = 0;
                                        i9 = -1;
                                        while (i7 < address.length) {
                                            i15 = i7;
                                            while (i15 < i6 && address[i15] == 0 && address[i15 + 1] == 0) {
                                                i15 += 2;
                                                i6 = 16;
                                            }
                                            i16 = i15 - i7;
                                            if (i16 > i8) {
                                                i9 = i7;
                                                i8 = i16;
                                            }
                                            i7 = i15 + 2;
                                            i6 = 16;
                                        }
                                        c0613g = new C0613g();
                                        i10 = 0;
                                        while (i10 < address.length) {
                                            if (i10 == i9) {
                                                c0613g.m1387O(58);
                                                i10 += i8;
                                                if (i10 == 16) {
                                                    c0613g.m1387O(58);
                                                }
                                            } else {
                                                if (i10 > 0) {
                                                    c0613g.m1387O(58);
                                                }
                                                j2 = ((address[i10] & 255) << 8) | (address[i10 + 1] & 255);
                                                if (j2 == 0) {
                                                    c0613g.m1387O(48);
                                                    i14 = i9;
                                                } else {
                                                    long j3 = j2 | (j2 >>> 1);
                                                    long j4 = j3 | (j3 >>> 2);
                                                    long j5 = j4 | (j4 >>> 4);
                                                    long j6 = j5 | (j5 >>> 8);
                                                    long j7 = j6 | (j6 >>> 16);
                                                    long j8 = j7 | (j7 >>> 32);
                                                    long j9 = j8 - ((j8 >>> 1) & 6148914691236517205L);
                                                    long j10 = ((j9 >>> 2) & 3689348814741910323L) + (j9 & 3689348814741910323L);
                                                    long j11 = ((j10 >>> 4) + j10) & 1085102592571150095L;
                                                    long j12 = j11 + (j11 >>> 8);
                                                    long j13 = j12 + (j12 >>> 16);
                                                    i11 = i9;
                                                    int i49 = (int) ((((j13 & 63) + ((j13 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
                                                    C0630x c0630xM1385M9 = c0613g.m1385M(i49);
                                                    bArr = c0630xM1385M9.f1379a;
                                                    i12 = c0630xM1385M9.f1381c;
                                                    i13 = (i12 + i49) - 1;
                                                    while (i13 >= i12) {
                                                        byte[] bArr11 = bArr;
                                                        bArr11[i13] = AbstractC0809a.f2118a[(int) (j2 & 15)];
                                                        j2 >>>= 4;
                                                        i13--;
                                                        i11 = i11;
                                                        bArr = bArr11;
                                                    }
                                                    i14 = i11;
                                                    c0630xM1385M9.f1381c += i49;
                                                    c0613g.f1342t += (long) i49;
                                                }
                                                i10 += 2;
                                                address = address;
                                                i9 = i14;
                                            }
                                        }
                                        strM1381I = c0613g.m1381I(c0613g.f1342t, AbstractC6571a.f24799a);
                                    } else if (i48 != 16) {
                                        if (i48 == i47) {
                                            i18 = i43;
                                            i19 = 0;
                                            while (true) {
                                                if (i18 < length2) {
                                                    cCharAt = strSubstring.charAt(i18);
                                                    i20 = i47;
                                                    if (cCharAt < '0' && cCharAt <= '9') {
                                                        if ((i19 != 0 || i43 == i18) && (i19 = ((i19 * 10) + cCharAt) - 48) <= 255) {
                                                            i18++;
                                                            i47 = i20;
                                                        }
                                                    }
                                                } else {
                                                    i20 = i47;
                                                }
                                                if (i18 - i43 == 0) {
                                                    bArr10[i48] = (byte) i19;
                                                    i43 = i18;
                                                    i48++;
                                                    i47 = i20;
                                                }
                                            }
                                        } else if (strSubstring.charAt(i43) == '.') {
                                            i43++;
                                            i18 = i43;
                                            i19 = 0;
                                            while (true) {
                                                if (i18 < length2) {
                                                    cCharAt = strSubstring.charAt(i18);
                                                    i20 = i47;
                                                    if (cCharAt < '0') {
                                                    }
                                                } else {
                                                    i20 = i47;
                                                }
                                                if (i18 - i43 == 0) {
                                                    bArr10[i48] = (byte) i19;
                                                    i43 = i18;
                                                    i48++;
                                                    i47 = i20;
                                                }
                                                i18++;
                                                i47 = i20;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i43 = i40;
                        i41 = i17;
                        i40 = i43;
                        i21 = 0;
                        while (i40 < length2) {
                            iM1794a = C0872a.m1794a(strSubstring.charAt(i40));
                            if (iM1794a == -1) {
                                break;
                                break;
                            }
                            i21 = (i21 << 4) + iM1794a;
                            i40++;
                        }
                        i22 = i40 - i43;
                        if (i22 == 0) {
                        }
                    }
                    byAddress = null;
                    if (byAddress == null) {
                        strM1381I = null;
                        break;
                    }
                    address = byAddress.getAddress();
                    i6 = 16;
                    if (address.length == 16) {
                        throw new AssertionError();
                    }
                    i7 = 0;
                    i8 = 0;
                    i9 = -1;
                    while (i7 < address.length) {
                        i15 = i7;
                        while (i15 < i6) {
                            i15 += 2;
                            i6 = 16;
                        }
                        i16 = i15 - i7;
                        if (i16 > i8) {
                            i9 = i7;
                            i8 = i16;
                        }
                        i7 = i15 + 2;
                        i6 = 16;
                    }
                    c0613g = new C0613g();
                    i10 = 0;
                    while (i10 < address.length) {
                        if (i10 == i9) {
                            c0613g.m1387O(58);
                            i10 += i8;
                            if (i10 == 16) {
                                c0613g.m1387O(58);
                            }
                        } else {
                            if (i10 > 0) {
                                c0613g.m1387O(58);
                            }
                            j2 = ((address[i10] & 255) << 8) | (address[i10 + 1] & 255);
                            if (j2 == 0) {
                                c0613g.m1387O(48);
                                i14 = i9;
                            } else {
                                long j14 = j2 | (j2 >>> 1);
                                long j15 = j14 | (j14 >>> 2);
                                long j16 = j15 | (j15 >>> 4);
                                long j17 = j16 | (j16 >>> 8);
                                long j18 = j17 | (j17 >>> 16);
                                long j19 = j18 | (j18 >>> 32);
                                long j20 = j19 - ((j19 >>> 1) & 6148914691236517205L);
                                long j110 = ((j20 >>> 2) & 3689348814741910323L) + (j20 & 3689348814741910323L);
                                long j111 = ((j110 >>> 4) + j110) & 1085102592571150095L;
                                long j112 = j111 + (j111 >>> 8);
                                long j113 = j112 + (j112 >>> 16);
                                i11 = i9;
                                int i410 = (int) ((((j113 & 63) + ((j113 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
                                C0630x c0630xM1385M10 = c0613g.m1385M(i410);
                                bArr = c0630xM1385M10.f1379a;
                                i12 = c0630xM1385M10.f1381c;
                                i13 = (i12 + i410) - 1;
                                while (i13 >= i12) {
                                    byte[] bArr12 = bArr;
                                    bArr12[i13] = AbstractC0809a.f2118a[(int) (j2 & 15)];
                                    j2 >>>= 4;
                                    i13--;
                                    i11 = i11;
                                    bArr = bArr12;
                                }
                                i14 = i11;
                                c0630xM1385M10.f1381c += i410;
                                c0613g.f1342t += (long) i410;
                            }
                            i10 += 2;
                            address = address;
                            i9 = i14;
                        }
                    }
                    strM1381I = c0613g.m1381I(c0613g.f1342t, AbstractC6571a.f24799a);
                } else {
                    i5 = i39;
                }
                if (i41 != i5) {
                    if (i42 == -1) {
                        byAddress = null;
                    } else {
                        int i50 = i41 - i42;
                        System.arraycopy(bArr10, i42, bArr10, 16 - i50, i50);
                        Arrays.fill(bArr10, i42, (16 - i41) + i42, (byte) 0);
                    }
                    if (byAddress == null) {
                        strM1381I = null;
                        break;
                    }
                    address = byAddress.getAddress();
                    i6 = 16;
                    if (address.length == 16) {
                        throw new AssertionError();
                    }
                    i7 = 0;
                    i8 = 0;
                    i9 = -1;
                    while (i7 < address.length) {
                        i15 = i7;
                        while (i15 < i6) {
                            i15 += 2;
                            i6 = 16;
                        }
                        i16 = i15 - i7;
                        if (i16 > i8) {
                            i9 = i7;
                            i8 = i16;
                        }
                        i7 = i15 + 2;
                        i6 = 16;
                    }
                    c0613g = new C0613g();
                    i10 = 0;
                    while (i10 < address.length) {
                        if (i10 == i9) {
                            c0613g.m1387O(58);
                            i10 += i8;
                            if (i10 == 16) {
                                c0613g.m1387O(58);
                            }
                        } else {
                            if (i10 > 0) {
                                c0613g.m1387O(58);
                            }
                            j2 = ((address[i10] & 255) << 8) | (address[i10 + 1] & 255);
                            if (j2 == 0) {
                                c0613g.m1387O(48);
                                i14 = i9;
                            } else {
                                long j114 = j2 | (j2 >>> 1);
                                long j115 = j114 | (j114 >>> 2);
                                long j116 = j115 | (j115 >>> 4);
                                long j117 = j116 | (j116 >>> 8);
                                long j118 = j117 | (j117 >>> 16);
                                long j119 = j118 | (j118 >>> 32);
                                long j21 = j119 - ((j119 >>> 1) & 6148914691236517205L);
                                long j1110 = ((j21 >>> 2) & 3689348814741910323L) + (j21 & 3689348814741910323L);
                                long j1111 = ((j1110 >>> 4) + j1110) & 1085102592571150095L;
                                long j1112 = j1111 + (j1111 >>> 8);
                                long j1113 = j1112 + (j1112 >>> 16);
                                i11 = i9;
                                int i411 = (int) ((((j1113 & 63) + ((j1113 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
                                C0630x c0630xM1385M11 = c0613g.m1385M(i411);
                                bArr = c0630xM1385M11.f1379a;
                                i12 = c0630xM1385M11.f1381c;
                                i13 = (i12 + i411) - 1;
                                while (i13 >= i12) {
                                    byte[] bArr13 = bArr;
                                    bArr13[i13] = AbstractC0809a.f2118a[(int) (j2 & 15)];
                                    j2 >>>= 4;
                                    i13--;
                                    i11 = i11;
                                    bArr = bArr13;
                                }
                                i14 = i11;
                                c0630xM1385M11.f1381c += i411;
                                c0613g.f1342t += (long) i411;
                            }
                            i10 += 2;
                            address = address;
                            i9 = i14;
                        }
                    }
                    strM1381I = c0613g.m1381I(c0613g.f1342t, AbstractC6571a.f24799a);
                }
                byAddress = InetAddress.getByAddress(bArr10);
                if (byAddress == null) {
                    strM1381I = null;
                    break;
                }
                address = byAddress.getAddress();
                i6 = 16;
                if (address.length == 16) {
                    throw new AssertionError();
                }
                i7 = 0;
                i8 = 0;
                i9 = -1;
                while (i7 < address.length) {
                    i15 = i7;
                    while (i15 < i6) {
                        i15 += 2;
                        i6 = 16;
                    }
                    i16 = i15 - i7;
                    if (i16 > i8) {
                        i9 = i7;
                        i8 = i16;
                    }
                    i7 = i15 + 2;
                    i6 = 16;
                }
                c0613g = new C0613g();
                i10 = 0;
                while (i10 < address.length) {
                    if (i10 == i9) {
                        c0613g.m1387O(58);
                        i10 += i8;
                        if (i10 == 16) {
                            c0613g.m1387O(58);
                        }
                    } else {
                        if (i10 > 0) {
                            c0613g.m1387O(58);
                        }
                        j2 = ((address[i10] & 255) << 8) | (address[i10 + 1] & 255);
                        if (j2 == 0) {
                            c0613g.m1387O(48);
                            i14 = i9;
                        } else {
                            long j1114 = j2 | (j2 >>> 1);
                            long j1115 = j1114 | (j1114 >>> 2);
                            long j1116 = j1115 | (j1115 >>> 4);
                            long j1117 = j1116 | (j1116 >>> 8);
                            long j1118 = j1117 | (j1117 >>> 16);
                            long j1119 = j1118 | (j1118 >>> 32);
                            long j22 = j1119 - ((j1119 >>> 1) & 6148914691236517205L);
                            long j11110 = ((j22 >>> 2) & 3689348814741910323L) + (j22 & 3689348814741910323L);
                            long j11111 = ((j11110 >>> 4) + j11110) & 1085102592571150095L;
                            long j11112 = j11111 + (j11111 >>> 8);
                            long j11113 = j11112 + (j11112 >>> 16);
                            i11 = i9;
                            int i412 = (int) ((((j11113 & 63) + ((j11113 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
                            C0630x c0630xM1385M12 = c0613g.m1385M(i412);
                            bArr = c0630xM1385M12.f1379a;
                            i12 = c0630xM1385M12.f1381c;
                            i13 = (i12 + i412) - 1;
                            while (i13 >= i12) {
                                byte[] bArr14 = bArr;
                                bArr14[i13] = AbstractC0809a.f2118a[(int) (j2 & 15)];
                                j2 >>>= 4;
                                i13--;
                                i11 = i11;
                                bArr = bArr14;
                            }
                            i14 = i11;
                            c0630xM1385M12.f1381c += i412;
                            c0613g.f1342t += (long) i412;
                        }
                        i10 += 2;
                        address = address;
                        i9 = i14;
                    }
                }
                strM1381I = c0613g.m1381I(c0613g.f1342t, AbstractC6571a.f24799a);
            } catch (UnknownHostException unused2) {
                throw new AssertionError();
            }
        }
        if (strM1381I == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(hostName));
        }
        c0118i.f175d = strM1381I;
        int port = inetSocketAddress.getPort();
        if (port <= 0 || port > 65535) {
            throw new IllegalArgumentException(AbstractC0271e0.m396d(port, "unexpected port: "));
        }
        c0118i.f174c = port;
        if (((String) c0118i.f175d) == null) {
            throw new IllegalStateException("host == null");
        }
        C0872a c0872a = new C0872a(c0118i);
        C0177l c0177l = new C0177l(11);
        c0177l.f332t = new C0783s0(1, (byte) 0);
        c0177l.f333u = c0872a;
        c0177l.m273e("Host", c0872a.f2446a + ":" + c0872a.f2447b);
        c0177l.m273e("User-Agent", this.f2258c);
        if (str != null && str2 != null) {
            try {
                c0177l.m273e("Proxy-Authorization", "Basic " + C0616j.m1400m((str + ":" + str2).getBytes("ISO-8859-1")).mo1402b());
            } catch (UnsupportedEncodingException unused3) {
                throw new AssertionError();
            }
        }
        if (((C0872a) c0177l.f333u) != null) {
            return new C0177l(c0177l);
        }
        throw new IllegalStateException("url == null");
    }

    /* JADX INFO: renamed from: i */
    public final void m1720i(int i2, C0589w0 c0589w0, EnumC0633A enumC0633A, boolean z, EnumC0861a enumC0861a, C0559h0 c0559h0) {
        synchronized (this.f2266k) {
            try {
                C0830k c0830k = (C0830k) this.f2269n.remove(Integer.valueOf(i2));
                if (c0830k != null) {
                    if (enumC0861a != null) {
                        this.f2264i.m1707i(i2, EnumC0861a.CANCEL);
                    }
                    if (c0589w0 != null) {
                        C0829j c0829j = c0830k.f2231n;
                        if (c0559h0 == null) {
                            c0559h0 = new C0559h0();
                        }
                        c0829j.m1590f(c0589w0, enumC0633A, z, c0559h0);
                    }
                    if (!m1729s()) {
                        m1731u();
                        m1725n(c0830k);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final C0842w[] m1721j() {
        C0842w[] c0842wArr;
        C0842w c0842w;
        synchronized (this.f2266k) {
            c0842wArr = new C0842w[this.f2269n.size()];
            Iterator it = this.f2269n.values().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                int i3 = i2 + 1;
                C0829j c0829j = ((C0830k) it.next()).f2231n;
                synchronized (c0829j.f2222w) {
                    c0842w = c0829j.f2218J;
                }
                c0842wArr[i2] = c0842w;
                i2 = i3;
            }
        }
        return c0842wArr;
    }

    /* JADX INFO: renamed from: k */
    public final int m1722k() {
        URI uriM1620a = AbstractC0759m0.m1620a(this.f2257b);
        return uriM1620a.getPort() != -1 ? uriM1620a.getPort() : this.f2256a.getPort();
    }

    /* JADX INFO: renamed from: l */
    public final StatusException m1723l() {
        synchronized (this.f2266k) {
            try {
                C0589w0 c0589w0 = this.f2277v;
                if (c0589w0 != null) {
                    return new StatusException(c0589w0);
                }
                return new StatusException(C0589w0.f1284n.m1354g("Connection closed"));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x000c  */
    /* JADX INFO: renamed from: m */
    public final boolean m1724m(int i2) {
        boolean z;
        synchronized (this.f2266k) {
            if (i2 < this.f2268m) {
                z = true;
                if ((i2 & 1) != 1) {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: n */
    public final void m1725n(C0830k c0830k) {
        if (this.f2281z && this.f2244D.isEmpty() && this.f2269n.isEmpty()) {
            this.f2281z = false;
            C0664K0 c0664k0 = this.f2246F;
            if (c0664k0 != null) {
                synchronized (c0664k0) {
                    int i2 = c0664k0.f1488d;
                    if (i2 == 2 || i2 == 3) {
                        c0664k0.f1488d = 1;
                    }
                    if (c0664k0.f1488d == 4) {
                        c0664k0.f1488d = 5;
                    }
                }
            }
        }
        if (c0830k.f1708e) {
            this.f2253M.m1664a(c0830k, false);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m1726o(Exception exc) {
        m1728r(0, EnumC0861a.INTERNAL_ERROR, C0589w0.f1284n.m1353f(exc));
    }

    /* JADX INFO: renamed from: q */
    public final void m1727q() {
        synchronized (this.f2266k) {
            try {
                C0823d c0823d = this.f2264i;
                c0823d.getClass();
                try {
                    c0823d.f2171t.m1697e();
                } catch (IOException e) {
                    c0823d.f2170s.m1726o(e);
                }
                C0458a c0458a = new C0458a(1);
                c0458a.m974i(7, this.f2261f);
                C0823d c0823d2 = this.f2264i;
                c0823d2.f2172u.m279k(2, c0458a);
                try {
                    c0823d2.f2171t.m1701l(c0458a);
                } catch (IOException e2) {
                    c0823d2.f2170s.m1726o(e2);
                }
                int i2 = this.f2261f;
                if (i2 > 65535) {
                    this.f2264i.m1708j(0, i2 - SupportMenu.USER_MASK);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m1728r(int i2, EnumC0861a enumC0861a, C0589w0 c0589w0) {
        synchronized (this.f2266k) {
            try {
                if (this.f2277v == null) {
                    this.f2277v = c0589w0;
                    this.f2263h.m1481c(c0589w0);
                }
                if (enumC0861a != null && !this.f2278w) {
                    this.f2278w = true;
                    this.f2264i.m1705e(enumC0861a, new byte[0]);
                }
                Iterator it = this.f2269n.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Integer) entry.getKey()).intValue() > i2) {
                        it.remove();
                        ((C0830k) entry.getValue()).f2231n.m1590f(c0589w0, EnumC0633A.f1392t, false, new C0559h0());
                        m1725n((C0830k) entry.getValue());
                    }
                }
                for (C0830k c0830k : this.f2244D) {
                    c0830k.f2231n.m1590f(c0589w0, EnumC0633A.f1394v, true, new C0559h0());
                    m1725n(c0830k);
                }
                this.f2244D.clear();
                m1731u();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m1729s() {
        boolean z = false;
        while (true) {
            LinkedList linkedList = this.f2244D;
            if (linkedList.isEmpty() || this.f2269n.size() >= this.f2243C) {
                break;
            }
            m1730t((C0830k) linkedList.poll());
            z = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: t */
    public final void m1730t(C0830k c0830k) {
        boolean zM1589e;
        AbstractC0076b.m139n(c0830k.f2231n.f2219K == -1, "StreamId already assigned");
        this.f2269n.put(Integer.valueOf(this.f2268m), c0830k);
        if (!this.f2281z) {
            this.f2281z = true;
            C0664K0 c0664k0 = this.f2246F;
            if (c0664k0 != null) {
                c0664k0.m1522b();
            }
        }
        if (c0830k.f1708e) {
            this.f2253M.m1664a(c0830k, true);
        }
        C0829j c0829j = c0830k.f2231n;
        int i2 = this.f2268m;
        if (!(c0829j.f2219K == -1)) {
            throw new IllegalStateException(AbstractC0076b.m141p("the stream has been started with id %s", Integer.valueOf(i2)));
        }
        c0829j.f2219K = i2;
        C0463f c0463f = c0829j.f2214F;
        c0829j.f2218J = new C0842w(c0463f, i2, c0463f.f799b, c0829j);
        C0829j c0829j2 = c0829j.f2220L.f2231n;
        AbstractC0076b.m138m(c0829j2.f1682j != null);
        synchronized (c0829j2.f1674b) {
            AbstractC0076b.m139n(!c0829j2.f1678f, "Already allocated");
            c0829j2.f1678f = true;
        }
        synchronized (c0829j2.f1674b) {
            zM1589e = c0829j2.m1589e();
        }
        if (zM1589e) {
            c0829j2.f1682j.mo151d();
        }
        C0793u2 c0793u2 = c0829j2.f1675c;
        c0793u2.getClass();
        ((C0785s2) c0793u2.f2060t).m1661e();
        if (c0829j.f2216H) {
            C0823d c0823d = c0829j.f2213E;
            boolean z = c0829j.f2220L.f2234q;
            int i3 = c0829j.f2219K;
            ArrayList arrayList = c0829j.f2223x;
            c0823d.getClass();
            try {
                C0869i c0869i = c0823d.f2171t.f2154s;
                synchronized (c0869i) {
                    if (c0869i.f2439w) {
                        throw new IOException("closed");
                    }
                    c0869i.m1790e(i3, arrayList, z);
                }
            } catch (IOException e) {
                c0823d.f2170s.m1726o(e);
            }
            for (AbstractC0570n abstractC0570n : c0829j.f2220L.f2229l.f2019a) {
                abstractC0570n.mo1328h();
            }
            c0829j.f2223x = null;
            C0613g c0613g = c0829j.f2224y;
            if (c0613g.f1342t > 0) {
                c0829j.f2214F.m985a(c0829j.f2225z, c0829j.f2218J, c0613g, c0829j.f2209A);
            }
            c0829j.f2216H = false;
        }
        EnumC0565k0 enumC0565k0 = c0830k.f2227j.f1200a;
        if ((enumC0565k0 != EnumC0565k0.f1196s && enumC0565k0 != EnumC0565k0.f1197t) || c0830k.f2234q) {
            this.f2264i.flush();
        }
        int i4 = this.f2268m;
        if (i4 < 2147483645) {
            this.f2268m = i4 + 2;
        } else {
            this.f2268m = Integer.MAX_VALUE;
            m1728r(Integer.MAX_VALUE, EnumC0861a.NO_ERROR, C0589w0.f1284n.m1354g("Stream ids exhausted"));
        }
    }

    public final String toString() {
        C0087m c0087mM143s = AbstractC0076b.m143s(this);
        c0087mM143s.m157a(this.f2267l.f1126c, "logId");
        c0087mM143s.m158b(this.f2256a, "address");
        return c0087mM143s.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m1731u() {
        if (this.f2277v == null || !this.f2269n.isEmpty() || !this.f2244D.isEmpty() || this.f2280y) {
            return;
        }
        this.f2280y = true;
        C0664K0 c0664k0 = this.f2246F;
        if (c0664k0 != null) {
            synchronized (c0664k0) {
                try {
                    if (c0664k0.f1488d != 6) {
                        c0664k0.f1488d = 6;
                        ScheduledFuture scheduledFuture = c0664k0.f1489e;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        ScheduledFuture scheduledFuture2 = c0664k0.f1490f;
                        if (scheduledFuture2 != null) {
                            scheduledFuture2.cancel(false);
                            c0664k0.f1490f = null;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C0779r0 c0779r0 = this.f2279x;
        if (c0779r0 != null) {
            StatusException statusExceptionM1723l = m1723l();
            synchronized (c0779r0) {
                try {
                    if (!c0779r0.f2027d) {
                        c0779r0.f2027d = true;
                        c0779r0.f2028e = statusExceptionM1723l;
                        LinkedHashMap linkedHashMap = c0779r0.f2026c;
                        c0779r0.f2026c = null;
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            try {
                                ((Executor) entry.getValue()).execute(new RunnableC0775q0((C0661J0) entry.getKey(), statusExceptionM1723l));
                            } catch (Throwable th2) {
                                C0779r0.f2023g.log(Level.SEVERE, "Failed to execute PingCallback", th2);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            this.f2279x = null;
        }
        if (!this.f2278w) {
            this.f2278w = true;
            this.f2264i.m1705e(EnumC0861a.NO_ERROR, new byte[0]);
        }
        this.f2264i.close();
    }
}
