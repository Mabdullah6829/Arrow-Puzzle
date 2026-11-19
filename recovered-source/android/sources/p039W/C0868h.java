package p039W;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001B.C0096v;
import p006D0.C0177l;
import p011H.AbstractC0271e0;
import p024O.C0458a;
import p024O.C0463f;
import p030R.C0546b;
import p030R.C0559h0;
import p030R.C0589w0;
import p030R.EnumC0587v0;
import p033S0.C0613g;
import p033S0.C0616j;
import p033S0.C0629w;
import p034T.C0637B0;
import p034T.C0643D0;
import p034T.C0661J0;
import p034T.C0779r0;
import p034T.EnumC0633A;
import p034T.EnumC0755l0;
import p034T.RunnableC0634A0;
import p034T.RunnableC0775q0;
import p036U.C0823d;
import p036U.C0829j;
import p036U.C0830k;
import p036U.C0833n;
import p036U.C0842w;
import p036U.RunnableC0832m;
import p049b0.AbstractC1886b;
import p049b0.C1887c;

/* JADX INFO: renamed from: W.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0868h implements Closeable {

    /* JADX INFO: renamed from: s */
    public final C0629w f2432s;

    /* JADX INFO: renamed from: t */
    public final C0866f f2433t;

    /* JADX INFO: renamed from: u */
    public final C0863c f2434u;

    public C0868h(C0629w c0629w) {
        this.f2432s = c0629w;
        C0866f c0866f = new C0866f(c0629w);
        this.f2433t = c0866f;
        this.f2434u = new C0863c(c0866f);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1782c(RunnableC0832m runnableC0832m) throws IOException {
        boolean z;
        C0779r0 c0779r0;
        EnumC0861a enumC0861a;
        C0842w c0842w;
        int i2 = 0;
        try {
            this.f2432s.m1470p(9L);
            int iM1791a = C0870j.m1791a(this.f2432s);
            if (iM1791a < 0 || iM1791a > 16384) {
                C0870j.m1793c("FRAME_SIZE_ERROR: %s", Integer.valueOf(iM1791a));
                throw null;
            }
            byte bM1463e = (byte) (this.f2432s.m1463e() & 255);
            byte bM1463e2 = (byte) (this.f2432s.m1463e() & 255);
            int iM1465i = this.f2432s.m1465i() & Integer.MAX_VALUE;
            Logger logger = C0870j.f2440a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(AbstractC0867g.m1781a(true, iM1465i, iM1791a, bM1463e, bM1463e2));
            }
            switch (bM1463e) {
                case 0:
                    m1783e(runnableC0832m, iM1791a, bM1463e2, iM1465i);
                    return true;
                case 1:
                    m1785i(runnableC0832m, iM1791a, bM1463e2, iM1465i);
                    return true;
                case 2:
                    if (iM1791a != 5) {
                        C0870j.m1793c("TYPE_PRIORITY length: %d != 5", Integer.valueOf(iM1791a));
                        throw null;
                    }
                    if (iM1465i == 0) {
                        C0870j.m1793c("TYPE_PRIORITY streamId == 0", new Object[0]);
                        throw null;
                    }
                    C0629w c0629w = this.f2432s;
                    c0629w.m1465i();
                    c0629w.m1463e();
                    return true;
                case 3:
                    m1787l(runnableC0832m, iM1791a, iM1465i);
                    return true;
                case 4:
                    m1788n(runnableC0832m, iM1791a, bM1463e2, iM1465i);
                    return true;
                case 5:
                    m1786j(runnableC0832m, iM1791a, bM1463e2, iM1465i);
                    return true;
                case 6:
                    z = true;
                    if (iM1791a != 8) {
                        C0870j.m1793c("TYPE_PING length != 8: %s", Integer.valueOf(iM1791a));
                        throw null;
                    }
                    if (iM1465i != 0) {
                        C0870j.m1793c("TYPE_PING streamId != 0", new Object[0]);
                        throw null;
                    }
                    int iM1465i2 = this.f2432s.m1465i();
                    int iM1465i3 = this.f2432s.m1465i();
                    i2 = (bM1463e2 & 1) != 0 ? 1 : 0;
                    long j2 = (((long) iM1465i2) << 32) | (((long) iM1465i3) & 4294967295L);
                    runnableC0832m.f2235s.m277i(1, j2);
                    if (i2 != 0) {
                        synchronized (runnableC0832m.f2238v.f2266k) {
                            try {
                                C0833n c0833n = runnableC0832m.f2238v;
                                c0779r0 = c0833n.f2279x;
                                if (c0779r0 != null) {
                                    long j3 = c0779r0.f2024a;
                                    if (j3 == j2) {
                                        c0833n.f2279x = null;
                                    } else {
                                        Logger logger2 = C0833n.f2240Q;
                                        Level level = Level.WARNING;
                                        Locale locale = Locale.US;
                                        logger2.log(level, "Received unexpected ping ack. Expecting " + j3 + ", got " + j2);
                                    }
                                } else {
                                    C0833n.f2240Q.warning("Received unexpected ping ack. No ping outstanding");
                                }
                                c0779r0 = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                        if (c0779r0 != null) {
                            synchronized (c0779r0) {
                                try {
                                    if (!c0779r0.f2027d) {
                                        c0779r0.f2027d = true;
                                        C0096v c0096v = c0779r0.f2025b;
                                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                                        long jM168a = c0096v.m168a();
                                        c0779r0.f2029f = jM168a;
                                        LinkedHashMap linkedHashMap = c0779r0.f2026c;
                                        c0779r0.f2026c = null;
                                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                                            try {
                                                ((Executor) entry.getValue()).execute(new RunnableC0775q0((C0661J0) entry.getKey(), jM168a));
                                            } catch (Throwable th2) {
                                                C0779r0.f2023g.log(Level.SEVERE, "Failed to execute PingCallback", th2);
                                            }
                                        }
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        }
                        break;
                    } else {
                        synchronized (runnableC0832m.f2238v.f2266k) {
                            runnableC0832m.f2238v.f2264i.m1706h(iM1465i2, iM1465i3, true);
                            break;
                        }
                    }
                    return z;
                case 7:
                    C0629w c0629w2 = this.f2432s;
                    if (iM1791a < 8) {
                        C0870j.m1793c("TYPE_GOAWAY length < 8: %s", Integer.valueOf(iM1791a));
                        throw null;
                    }
                    if (iM1465i != 0) {
                        C0870j.m1793c("TYPE_GOAWAY streamId != 0", new Object[0]);
                        throw null;
                    }
                    int iM1465i4 = c0629w2.m1465i();
                    int iM1465i5 = c0629w2.m1465i();
                    int i3 = iM1791a - 8;
                    EnumC0861a[] enumC0861aArrValues = EnumC0861a.values();
                    int length = enumC0861aArrValues.length;
                    while (true) {
                        if (i2 < length) {
                            enumC0861a = enumC0861aArrValues[i2];
                            if (enumC0861a.f2398s != iM1465i5) {
                                i2++;
                            }
                        } else {
                            enumC0861a = null;
                        }
                    }
                    if (enumC0861a == null) {
                        C0870j.m1793c("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(iM1465i5));
                        throw null;
                    }
                    C0616j c0616jM1464h = C0616j.f1343v;
                    if (i3 > 0) {
                        c0616jM1464h = c0629w2.m1464h(i3);
                    }
                    C0833n c0833n2 = runnableC0832m.f2238v;
                    runnableC0832m.f2235s.m276h(1, iM1465i4, enumC0861a, c0616jM1464h);
                    if (enumC0861a == EnumC0861a.ENHANCE_YOUR_CALM) {
                        String strM1415t = c0616jM1464h.m1415t();
                        C0833n.f2240Q.log(Level.WARNING, runnableC0832m + ": Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: " + strM1415t);
                        if ("too_many_pings".equals(strM1415t)) {
                            c0833n2.f2250J.run();
                        }
                    }
                    long j4 = enumC0861a.f2398s;
                    EnumC0755l0[] enumC0755l0Arr = EnumC0755l0.f1906v;
                    EnumC0755l0 enumC0755l0 = (j4 >= ((long) enumC0755l0Arr.length) || j4 < 0) ? null : enumC0755l0Arr[(int) j4];
                    C0589w0 c0589w0M1351a = (enumC0755l0 == null ? C0589w0.m1349c(EnumC0755l0.f1905u.f1909t.f1287a.f1265s).m1354g("Unrecognized HTTP/2 error code: " + j4) : enumC0755l0.f1909t).m1351a("Received Goaway");
                    if (c0616jM1464h.mo1404e() > 0) {
                        c0589w0M1351a = c0589w0M1351a.m1351a(c0616jM1464h.m1415t());
                    }
                    Map map = C0833n.f2239P;
                    c0833n2.m1728r(iM1465i4, null, c0589w0M1351a);
                    return true;
                case 8:
                    if (iM1791a != 4) {
                        C0870j.m1793c("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(iM1791a));
                        throw null;
                    }
                    long jM1465i = ((long) this.f2432s.m1465i()) & 2147483647L;
                    if (jM1465i == 0) {
                        C0870j.m1793c("windowSizeIncrement was 0", new Object[0]);
                        throw null;
                    }
                    runnableC0832m.f2235s.m280l(jM1465i, 1, iM1465i);
                    if (jM1465i == 0) {
                        if (iM1465i == 0) {
                            C0833n.m1715f(runnableC0832m.f2238v, "Received 0 flow control window increment.");
                            return true;
                        }
                        runnableC0832m.f2238v.m1720i(iM1465i, C0589w0.f1283m.m1354g("Received 0 flow control window increment."), EnumC0633A.f1391s, false, EnumC0861a.PROTOCOL_ERROR, null);
                        return true;
                    }
                    z = true;
                    synchronized (runnableC0832m.f2238v.f2266k) {
                        try {
                            if (iM1465i == 0) {
                                runnableC0832m.f2238v.f2265j.m986b(null, (int) jM1465i);
                                return true;
                            }
                            C0830k c0830k = (C0830k) runnableC0832m.f2238v.f2269n.get(Integer.valueOf(iM1465i));
                            if (c0830k != null) {
                                C0463f c0463f = runnableC0832m.f2238v.f2265j;
                                C0829j c0829j = c0830k.f2231n;
                                synchronized (c0829j.f2222w) {
                                    c0842w = c0829j.f2218J;
                                    break;
                                }
                                c0463f.m986b(c0842w, (int) jM1465i);
                            } else if (!runnableC0832m.f2238v.m1724m(iM1465i)) {
                                i2 = 1;
                            }
                            if (i2 != 0) {
                                C0833n.m1715f(runnableC0832m.f2238v, "Received window_update for unknown stream: " + iM1465i);
                                return true;
                            }
                            return z;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                default:
                    this.f2432s.m1471r(iM1791a);
                    return true;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2432s.close();
    }

    /* JADX INFO: renamed from: e */
    public final void m1783e(RunnableC0832m runnableC0832m, int i2, byte b, int i3) throws IOException {
        C0830k c0830k;
        boolean z = (b & 1) != 0;
        if ((b & 32) != 0) {
            C0870j.m1793c("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        short sM1463e = (b & 8) != 0 ? (short) (this.f2432s.m1463e() & 255) : (short) 0;
        int iM1792b = C0870j.m1792b(i2, b, sM1463e);
        C0629w c0629w = this.f2432s;
        runnableC0832m.f2235s.m275g(1, i3, c0629w.f1377t, iM1792b, z);
        C0833n c0833n = runnableC0832m.f2238v;
        synchronized (c0833n.f2266k) {
            c0830k = (C0830k) c0833n.f2269n.get(Integer.valueOf(i3));
        }
        if (c0830k == null) {
            if (runnableC0832m.f2238v.m1724m(i3)) {
                synchronized (runnableC0832m.f2238v.f2266k) {
                    runnableC0832m.f2238v.f2264i.m1707i(i3, EnumC0861a.STREAM_CLOSED);
                }
                c0629w.m1471r(iM1792b);
            } else {
                C0833n.m1715f(runnableC0832m.f2238v, "Received data for unknown stream: " + i3);
            }
            this.f2432s.m1471r(sM1463e);
        }
        long j2 = iM1792b;
        c0629w.m1470p(j2);
        C0613g c0613g = new C0613g();
        c0613g.mo1356s(c0629w.f1377t, j2);
        C1887c c1887c = c0830k.f2231n.f2217I;
        AbstractC1886b.f2862a.getClass();
        synchronized (runnableC0832m.f2238v.f2266k) {
            c0830k.f2231n.m1713n(i2 - iM1792b, c0613g, z);
        }
        C0833n c0833n2 = runnableC0832m.f2238v;
        int i4 = c0833n2.f2274s + i2;
        c0833n2.f2274s = i4;
        if (i4 >= c0833n2.f2261f * 0.5f) {
            synchronized (c0833n2.f2266k) {
                C0833n c0833n3 = runnableC0832m.f2238v;
                c0833n3.f2264i.m1708j(0, c0833n3.f2274s);
            }
            runnableC0832m.f2238v.f2274s = 0;
        }
        this.f2432s.m1471r(sM1463e);
    }

    /* JADX INFO: renamed from: h */
    public final ArrayList m1784h(int i2, short s2, byte b, int i3) throws IOException {
        C0866f c0866f = this.f2433t;
        c0866f.f2427w = i2;
        c0866f.f2424t = i2;
        c0866f.f2428x = s2;
        c0866f.f2425u = b;
        c0866f.f2426v = i3;
        C0863c c0863c = this.f2434u;
        C0629w c0629w = c0863c.f2408b;
        ArrayList arrayList = c0863c.f2407a;
        while (!c0629w.m1462c()) {
            byte bM1463e = c0629w.m1463e();
            int i4 = bM1463e & 255;
            if (i4 == 128) {
                throw new IOException("index == 0");
            }
            if ((bM1463e & 128) == 128) {
                int iM1776e = c0863c.m1776e(i4, 127);
                int i5 = iM1776e - 1;
                if (i5 >= 0) {
                    C0862b[] c0862bArr = AbstractC0865e.f2421b;
                    if (i5 <= c0862bArr.length - 1) {
                        arrayList.add(c0862bArr[i5]);
                    }
                }
                int length = c0863c.f2412f + 1 + (i5 - AbstractC0865e.f2421b.length);
                if (length >= 0) {
                    C0862b[] c0862bArr2 = c0863c.f2411e;
                    if (length <= c0862bArr2.length - 1) {
                        arrayList.add(c0862bArr2[length]);
                    }
                }
                throw new IOException(AbstractC0271e0.m396d(iM1776e, "Header index too large "));
            }
            if (i4 == 64) {
                C0616j c0616jM1775d = c0863c.m1775d();
                AbstractC0865e.m1780a(c0616jM1775d);
                c0863c.m1774c(new C0862b(c0616jM1775d, c0863c.m1775d()));
            } else if ((bM1463e & 64) == 64) {
                c0863c.m1774c(new C0862b(c0863c.m1773b(c0863c.m1776e(i4, 63) - 1), c0863c.m1775d()));
            } else if ((bM1463e & 32) == 32) {
                int iM1776e2 = c0863c.m1776e(i4, 31);
                c0863c.f2410d = iM1776e2;
                if (iM1776e2 < 0 || iM1776e2 > c0863c.f2409c) {
                    throw new IOException("Invalid dynamic table size update " + c0863c.f2410d);
                }
                int i6 = c0863c.f2414h;
                if (iM1776e2 < i6) {
                    if (iM1776e2 == 0) {
                        Arrays.fill(c0863c.f2411e, (Object) null);
                        c0863c.f2412f = c0863c.f2411e.length - 1;
                        c0863c.f2413g = 0;
                        c0863c.f2414h = 0;
                    } else {
                        c0863c.m1772a(i6 - iM1776e2);
                    }
                }
            } else if (i4 == 16 || i4 == 0) {
                C0616j c0616jM1775d2 = c0863c.m1775d();
                AbstractC0865e.m1780a(c0616jM1775d2);
                arrayList.add(new C0862b(c0616jM1775d2, c0863c.m1775d()));
            } else {
                arrayList.add(new C0862b(c0863c.m1773b(c0863c.m1776e(i4, 15) - 1), c0863c.m1775d()));
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        return arrayList2;
    }

    /* JADX INFO: renamed from: i */
    public final void m1785i(RunnableC0832m runnableC0832m, int i2, byte b, int i3) throws IOException {
        C0589w0 c0589w0M1354g = null;
        boolean z = false;
        if (i3 == 0) {
            C0870j.m1793c("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }
        boolean z2 = (b & 1) != 0;
        short sM1463e = (b & 8) != 0 ? (short) (this.f2432s.m1463e() & 255) : (short) 0;
        if ((b & 32) != 0) {
            C0629w c0629w = this.f2432s;
            c0629w.m1465i();
            c0629w.m1463e();
            i2 -= 5;
        }
        ArrayList arrayListM1784h = m1784h(C0870j.m1792b(i2, b, sM1463e), sM1463e, b, i3);
        C0177l c0177l = runnableC0832m.f2235s;
        if (c0177l.m274f()) {
            ((Logger) c0177l.f333u).log((Level) c0177l.f332t, "INBOUND HEADERS: streamId=" + i3 + " headers=" + arrayListM1784h + " endStream=" + z2);
        }
        if (runnableC0832m.f2238v.f2251K != Integer.MAX_VALUE) {
            long jMo1404e = 0;
            for (int i4 = 0; i4 < arrayListM1784h.size(); i4++) {
                C0862b c0862b = (C0862b) arrayListM1784h.get(i4);
                jMo1404e += (long) (c0862b.f2405b.mo1404e() + c0862b.f2404a.mo1404e() + 32);
            }
            int iMin = (int) Math.min(jMo1404e, 2147483647L);
            int i5 = runnableC0832m.f2238v.f2251K;
            if (iMin > i5) {
                C0589w0 c0589w0 = C0589w0.f1281k;
                Locale locale = Locale.US;
                c0589w0M1354g = c0589w0.m1354g("Response " + (z2 ? "trailer" : "header") + " metadata larger than " + i5 + ": " + iMin);
            }
        }
        synchronized (runnableC0832m.f2238v.f2266k) {
            try {
                C0830k c0830k = (C0830k) runnableC0832m.f2238v.f2269n.get(Integer.valueOf(i3));
                if (c0830k == null) {
                    if (runnableC0832m.f2238v.m1724m(i3)) {
                        runnableC0832m.f2238v.f2264i.m1707i(i3, EnumC0861a.STREAM_CLOSED);
                    } else {
                        z = true;
                    }
                } else if (c0589w0M1354g == null) {
                    C1887c c1887c = c0830k.f2231n.f2217I;
                    AbstractC1886b.f2862a.getClass();
                    c0830k.f2231n.m1714o(arrayListM1784h, z2);
                } else {
                    if (!z2) {
                        runnableC0832m.f2238v.f2264i.m1707i(i3, EnumC0861a.CANCEL);
                    }
                    c0830k.f2231n.m1591g(c0589w0M1354g, false, new C0559h0());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            C0833n.m1715f(runnableC0832m.f2238v, "Received header for unknown stream: " + i3);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m1786j(RunnableC0832m runnableC0832m, int i2, byte b, int i3) throws IOException {
        if (i3 == 0) {
            C0870j.m1793c("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }
        short sM1463e = (b & 8) != 0 ? (short) (this.f2432s.m1463e() & 255) : (short) 0;
        int iM1465i = this.f2432s.m1465i() & Integer.MAX_VALUE;
        ArrayList arrayListM1784h = m1784h(C0870j.m1792b(i2 - 4, b, sM1463e), sM1463e, b, i3);
        C0177l c0177l = runnableC0832m.f2235s;
        if (c0177l.m274f()) {
            ((Logger) c0177l.f333u).log((Level) c0177l.f332t, "INBOUND PUSH_PROMISE: streamId=" + i3 + " promisedStreamId=" + iM1465i + " headers=" + arrayListM1784h);
        }
        synchronized (runnableC0832m.f2238v.f2266k) {
            runnableC0832m.f2238v.f2264i.m1707i(i3, EnumC0861a.PROTOCOL_ERROR);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1787l(RunnableC0832m runnableC0832m, int i2, int i3) throws IOException {
        EnumC0861a enumC0861a;
        if (i2 != 4) {
            C0870j.m1793c("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i2));
            throw null;
        }
        if (i3 == 0) {
            C0870j.m1793c("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
        int iM1465i = this.f2432s.m1465i();
        EnumC0861a[] enumC0861aArrValues = EnumC0861a.values();
        int length = enumC0861aArrValues.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                enumC0861a = null;
                break;
            }
            enumC0861a = enumC0861aArrValues[i4];
            if (enumC0861a.f2398s == iM1465i) {
                break;
            } else {
                i4++;
            }
        }
        if (enumC0861a == null) {
            C0870j.m1793c("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(iM1465i));
            throw null;
        }
        boolean z = true;
        runnableC0832m.f2235s.m278j(1, i3, enumC0861a);
        C0589w0 c0589w0M1351a = C0833n.m1718v(enumC0861a).m1351a("Rst Stream");
        EnumC0587v0 enumC0587v0 = c0589w0M1351a.f1287a;
        if (enumC0587v0 != EnumC0587v0.CANCELLED && enumC0587v0 != EnumC0587v0.DEADLINE_EXCEEDED) {
            z = false;
        }
        synchronized (runnableC0832m.f2238v.f2266k) {
            try {
                C0830k c0830k = (C0830k) runnableC0832m.f2238v.f2269n.get(Integer.valueOf(i3));
                if (c0830k != null) {
                    C1887c c1887c = c0830k.f2231n.f2217I;
                    AbstractC1886b.f2862a.getClass();
                    runnableC0832m.f2238v.m1720i(i3, c0589w0M1351a, enumC0861a == EnumC0861a.REFUSED_STREAM ? EnumC0633A.f1392t : EnumC0633A.f1391s, z, null, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m1788n(RunnableC0832m runnableC0832m, int i2, byte b, int i3) throws IOException {
        boolean z;
        if (i3 != 0) {
            C0870j.m1793c("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        }
        if ((b & 1) != 0) {
            if (i2 == 0) {
                return;
            }
            C0870j.m1793c("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            throw null;
        }
        if (i2 % 6 != 0) {
            C0870j.m1793c("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i2));
            throw null;
        }
        C0458a c0458a = new C0458a(1);
        int i4 = 0;
        while (true) {
            short s2 = 4;
            if (i4 >= i2) {
                runnableC0832m.f2235s.m279k(1, c0458a);
                synchronized (runnableC0832m.f2238v.f2266k) {
                    try {
                        if (c0458a.m973g(4)) {
                            runnableC0832m.f2238v.f2243C = c0458a.f784c[4];
                        }
                        if (c0458a.m973g(7)) {
                            int i5 = c0458a.f784c[7];
                            C0463f c0463f = runnableC0832m.f2238v.f2265j;
                            if (i5 < 0) {
                                c0463f.getClass();
                                throw new IllegalArgumentException(AbstractC0271e0.m396d(i5, "Invalid initial window size: "));
                            }
                            int i6 = i5 - c0463f.f799b;
                            c0463f.f799b = i5;
                            z = false;
                            for (C0842w c0842w : ((C0833n) c0463f.f800c).m1721j()) {
                                c0842w.m1738a(i6);
                            }
                            if (i6 > 0) {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                        if (runnableC0832m.f2237u) {
                            C0833n c0833n = runnableC0832m.f2238v;
                            C0637B0 c0637b0 = c0833n.f2263h;
                            C0546b c0546b = c0833n.f2276u;
                            Iterator it = ((C0643D0) c0637b0.f1403u).f1421j.iterator();
                            if (it.hasNext()) {
                                it.next().getClass();
                                throw new ClassCastException();
                            }
                            c0833n.f2276u = c0546b;
                            C0637B0 c0637b1 = runnableC0832m.f2238v.f2263h;
                            C0643D0 c0643d0 = (C0643D0) c0637b1.f1403u;
                            c0643d0.f1420i.mo1299f(2, "READY");
                            c0643d0.f1422k.execute(new RunnableC0634A0(c0637b1, 0));
                            runnableC0832m.f2237u = false;
                        }
                        C0823d c0823d = runnableC0832m.f2238v.f2264i;
                        C0177l c0177l = c0823d.f2172u;
                        if (c0177l.m274f()) {
                            ((Logger) c0177l.f333u).log((Level) c0177l.f332t, "OUTBOUND".concat(" SETTINGS: ack=true"));
                        }
                        try {
                            c0823d.f2171t.m1696c(c0458a);
                        } catch (IOException e) {
                            c0823d.f2170s.m1726o(e);
                        }
                        if (z) {
                            runnableC0832m.f2238v.f2265j.m987c();
                        }
                        runnableC0832m.f2238v.m1729s();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i7 = c0458a.f783b;
                if (((i7 & 2) != 0 ? c0458a.f784c[1] : -1) >= 0) {
                    C0863c c0863c = this.f2434u;
                    int i8 = (i7 & 2) != 0 ? c0458a.f784c[1] : -1;
                    c0863c.f2409c = i8;
                    c0863c.f2410d = i8;
                    int i9 = c0863c.f2414h;
                    if (i8 < i9) {
                        if (i8 != 0) {
                            c0863c.m1772a(i9 - i8);
                            return;
                        }
                        Arrays.fill(c0863c.f2411e, (Object) null);
                        c0863c.f2412f = c0863c.f2411e.length - 1;
                        c0863c.f2413g = 0;
                        c0863c.f2414h = 0;
                        return;
                    }
                    return;
                }
                return;
            }
            C0629w c0629w = this.f2432s;
            c0629w.m1470p(2L);
            short sM1380H = c0629w.f1377t.m1380H();
            int iM1465i = this.f2432s.m1465i();
            switch (sM1380H) {
                case 1:
                case 6:
                    s2 = sM1380H;
                    break;
                case 2:
                    if (iM1465i != 0 && iM1465i != 1) {
                        C0870j.m1793c("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        throw null;
                    }
                    s2 = sM1380H;
                    break;
                    break;
                case 3:
                    break;
                case 4:
                    if (iM1465i < 0) {
                        C0870j.m1793c("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        throw null;
                    }
                    s2 = 7;
                    break;
                    break;
                case 5:
                    if (iM1465i < 16384 || iM1465i > 16777215) {
                        C0870j.m1793c("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(iM1465i));
                        throw null;
                    }
                    s2 = sM1380H;
                    break;
                    break;
                default:
                    continue;
                    i4 += 6;
                    break;
            }
            c0458a.m974i(s2, iM1465i);
            i4 += 6;
        }
    }
}
