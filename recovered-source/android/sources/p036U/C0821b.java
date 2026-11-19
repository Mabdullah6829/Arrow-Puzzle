package p036U;

import java.io.Closeable;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import p024O.C0458a;
import p033S0.C0613g;
import p033S0.C0628v;
import p033S0.C0630x;
import p039W.C0869i;
import p039W.C0870j;
import p039W.EnumC0861a;

/* JADX INFO: renamed from: U.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0821b implements Closeable {

    /* JADX INFO: renamed from: s */
    public final C0869i f2154s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ C0822c f2155t;

    public C0821b(C0822c c0822c, C0869i c0869i) {
        this.f2155t = c0822c;
        this.f2154s = c0869i;
    }

    /* JADX INFO: renamed from: c */
    public final void m1696c(C0458a c0458a) {
        this.f2155t.f2159D++;
        C0869i c0869i = this.f2154s;
        synchronized (c0869i) {
            if (c0869i.f2439w) {
                throw new IOException("closed");
            }
            int i2 = c0869i.f2438v;
            if ((c0458a.f783b & 32) != 0) {
                i2 = c0458a.f784c[5];
            }
            c0869i.f2438v = i2;
            c0869i.m1789c(0, 0, (byte) 4, (byte) 1);
            c0869i.f2435s.flush();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2154s.close();
    }

    /* JADX INFO: renamed from: e */
    public final void m1697e() {
        C0869i c0869i = this.f2154s;
        synchronized (c0869i) {
            try {
                if (c0869i.f2439w) {
                    throw new IOException("closed");
                }
                Logger logger = C0870j.f2440a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(">> CONNECTION " + C0870j.f2441b.mo1405f());
                }
                c0869i.f2435s.m1458e(C0870j.f2441b.mo1414s());
                c0869i.f2435s.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void flush() {
        C0869i c0869i = this.f2154s;
        synchronized (c0869i) {
            if (c0869i.f2439w) {
                throw new IOException("closed");
            }
            c0869i.f2435s.flush();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m1698h(EnumC0861a enumC0861a, byte[] bArr) {
        C0869i c0869i = this.f2154s;
        synchronized (c0869i) {
            try {
                if (c0869i.f2439w) {
                    throw new IOException("closed");
                }
                if (enumC0861a.f2398s == -1) {
                    Locale locale = Locale.US;
                    throw new IllegalArgumentException("errorCode.httpCode == -1");
                }
                c0869i.m1789c(0, bArr.length + 8, (byte) 7, (byte) 0);
                c0869i.f2435s.m1460i(0);
                c0869i.f2435s.m1460i(enumC0861a.f2398s);
                if (bArr.length > 0) {
                    c0869i.f2435s.m1458e(bArr);
                }
                c0869i.f2435s.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m1699i(int i2, int i3, boolean z) {
        if (z) {
            this.f2155t.f2159D++;
        }
        C0869i c0869i = this.f2154s;
        synchronized (c0869i) {
            if (c0869i.f2439w) {
                throw new IOException("closed");
            }
            c0869i.m1789c(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
            c0869i.f2435s.m1460i(i2);
            c0869i.f2435s.m1460i(i3);
            c0869i.f2435s.flush();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m1700j(int i2, EnumC0861a enumC0861a) {
        this.f2155t.f2159D++;
        C0869i c0869i = this.f2154s;
        synchronized (c0869i) {
            if (c0869i.f2439w) {
                throw new IOException("closed");
            }
            if (enumC0861a.f2398s == -1) {
                throw new IllegalArgumentException();
            }
            c0869i.m1789c(i2, 4, (byte) 3, (byte) 0);
            c0869i.f2435s.m1460i(enumC0861a.f2398s);
            c0869i.f2435s.flush();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1701l(C0458a c0458a) {
        int i2;
        C0869i c0869i = this.f2154s;
        synchronized (c0869i) {
            try {
                if (c0869i.f2439w) {
                    throw new IOException("closed");
                }
                int i3 = 0;
                c0869i.m1789c(0, Integer.bitCount(c0458a.f783b) * 6, (byte) 4, (byte) 0);
                while (i3 < 10) {
                    if (c0458a.m973g(i3)) {
                        if (i3 == 4) {
                            i2 = 3;
                        } else {
                            i2 = i3 == 7 ? 4 : i3;
                        }
                        C0628v c0628v = c0869i.f2435s;
                        if (c0628v.f1375u) {
                            throw new IllegalStateException("closed");
                        }
                        C0613g c0613g = c0628v.f1374t;
                        C0630x c0630xM1385M = c0613g.m1385M(2);
                        byte[] bArr = c0630xM1385M.f1379a;
                        int i4 = c0630xM1385M.f1381c;
                        bArr[i4] = (byte) ((i2 >>> 8) & 255);
                        bArr[i4 + 1] = (byte) (i2 & 255);
                        c0630xM1385M.f1381c = i4 + 2;
                        c0613g.f1342t += 2;
                        c0628v.m1457c();
                        c0869i.f2435s.m1460i(c0458a.f784c[i3]);
                    }
                    i3++;
                }
                c0869i.f2435s.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m1702n(int i2, long j2) {
        C0869i c0869i = this.f2154s;
        synchronized (c0869i) {
            if (c0869i.f2439w) {
                throw new IOException("closed");
            }
            if (j2 == 0 || j2 > 2147483647L) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j2);
            }
            c0869i.m1789c(i2, 4, (byte) 8, (byte) 0);
            c0869i.f2435s.m1460i((int) j2);
            c0869i.f2435s.flush();
        }
    }
}
