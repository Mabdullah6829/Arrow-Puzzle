package p036U;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p006D0.C0177l;
import p033S0.C0613g;
import p033S0.C0616j;
import p039W.C0869i;
import p039W.EnumC0861a;

/* JADX INFO: renamed from: U.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0823d implements Closeable {

    /* JADX INFO: renamed from: v */
    public static final Logger f2169v = Logger.getLogger(C0833n.class.getName());

    /* JADX INFO: renamed from: s */
    public final C0833n f2170s;

    /* JADX INFO: renamed from: t */
    public final C0821b f2171t;

    /* JADX INFO: renamed from: u */
    public final C0177l f2172u;

    public C0823d(C0833n c0833n, C0821b c0821b) {
        Level level = Level.FINE;
        this.f2172u = new C0177l(10);
        this.f2170s = c0833n;
        this.f2171t = c0821b;
    }

    /* JADX INFO: renamed from: c */
    public final void m1704c(boolean z, int i2, C0613g c0613g, int i3) {
        C0177l c0177l = this.f2172u;
        c0613g.getClass();
        c0177l.m275g(2, i2, c0613g, i3, z);
        try {
            C0869i c0869i = this.f2171t.f2154s;
            synchronized (c0869i) {
                if (c0869i.f2439w) {
                    throw new IOException("closed");
                }
                c0869i.m1789c(i2, i3, (byte) 0, z ? (byte) 1 : (byte) 0);
                if (i3 > 0) {
                    c0869i.f2435s.mo1356s(c0613g, i3);
                }
            }
        } catch (IOException e) {
            this.f2170s.m1726o(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f2171t.close();
        } catch (IOException e) {
            f2169v.log(e.getClass().equals(IOException.class) ? Level.FINE : Level.INFO, "Failed closing connection", (Throwable) e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1705e(EnumC0861a enumC0861a, byte[] bArr) {
        C0821b c0821b = this.f2171t;
        this.f2172u.m276h(2, 0, enumC0861a, C0616j.m1400m(bArr));
        try {
            c0821b.m1698h(enumC0861a, bArr);
            c0821b.flush();
        } catch (IOException e) {
            this.f2170s.m1726o(e);
        }
    }

    public final void flush() {
        try {
            this.f2171t.flush();
        } catch (IOException e) {
            this.f2170s.m1726o(e);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m1706h(int i2, int i3, boolean z) {
        C0177l c0177l = this.f2172u;
        if (z) {
            long j2 = (4294967295L & ((long) i3)) | (((long) i2) << 32);
            if (c0177l.m274f()) {
                ((Logger) c0177l.f333u).log((Level) c0177l.f332t, "OUTBOUND PING: ack=true bytes=" + j2);
            }
        } else {
            c0177l.m277i(2, (4294967295L & ((long) i3)) | (((long) i2) << 32));
        }
        try {
            this.f2171t.m1699i(i2, i3, z);
        } catch (IOException e) {
            this.f2170s.m1726o(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m1707i(int i2, EnumC0861a enumC0861a) {
        this.f2172u.m278j(2, i2, enumC0861a);
        try {
            this.f2171t.m1700j(i2, enumC0861a);
        } catch (IOException e) {
            this.f2170s.m1726o(e);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m1708j(int i2, long j2) {
        this.f2172u.m280l(j2, 2, i2);
        try {
            this.f2171t.m1702n(i2, j2);
        } catch (IOException e) {
            this.f2170s.m1726o(e);
        }
    }
}
