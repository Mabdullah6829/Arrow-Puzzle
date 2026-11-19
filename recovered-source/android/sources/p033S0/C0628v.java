package p033S0;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: renamed from: S0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0628v implements InterfaceC0614h {

    /* JADX INFO: renamed from: s */
    public final InterfaceC0601A f1373s;

    /* JADX INFO: renamed from: t */
    public final C0613g f1374t = new C0613g();

    /* JADX INFO: renamed from: u */
    public boolean f1375u;

    public C0628v(InterfaceC0601A interfaceC0601A) {
        this.f1373s = interfaceC0601A;
    }

    @Override // p033S0.InterfaceC0614h
    /* JADX INFO: renamed from: E */
    public final OutputStream mo1378E() {
        return new C0612f(this, 1);
    }

    /* JADX INFO: renamed from: c */
    public final void m1457c() {
        if (this.f1375u) {
            throw new IllegalStateException("closed");
        }
        C0613g c0613g = this.f1374t;
        long jM1390c = c0613g.m1390c();
        if (jM1390c > 0) {
            this.f1373s.mo1356s(c0613g, jM1390c);
        }
    }

    @Override // p033S0.InterfaceC0601A, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InterfaceC0601A interfaceC0601A = this.f1373s;
        if (this.f1375u) {
            return;
        }
        C0613g c0613g = this.f1374t;
        long j2 = c0613g.f1342t;
        if (j2 > 0) {
            interfaceC0601A.mo1356s(c0613g, j2);
        }
        th = null;
        try {
            interfaceC0601A.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f1375u = true;
        if (th != null) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC0614h m1458e(byte[] source) {
        AbstractC6452k.m12181e(source, "source");
        if (this.f1375u) {
            throw new IllegalStateException("closed");
        }
        this.f1374t.write(source, 0, source.length);
        m1457c();
        return this;
    }

    @Override // p033S0.InterfaceC0601A, java.io.Flushable
    public final void flush() {
        if (this.f1375u) {
            throw new IllegalStateException("closed");
        }
        C0613g c0613g = this.f1374t;
        long j2 = c0613g.f1342t;
        InterfaceC0601A interfaceC0601A = this.f1373s;
        if (j2 > 0) {
            interfaceC0601A.mo1356s(c0613g, j2);
        }
        interfaceC0601A.flush();
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC0614h m1459h(int i2) {
        if (this.f1375u) {
            throw new IllegalStateException("closed");
        }
        this.f1374t.m1387O(i2);
        m1457c();
        return this;
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC0614h m1460i(int i2) {
        if (this.f1375u) {
            throw new IllegalStateException("closed");
        }
        C0613g c0613g = this.f1374t;
        C0630x c0630xM1385M = c0613g.m1385M(4);
        byte[] bArr = c0630xM1385M.f1379a;
        int i3 = c0630xM1385M.f1381c;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        bArr[i3 + 1] = (byte) ((i2 >>> 16) & 255);
        bArr[i3 + 2] = (byte) ((i2 >>> 8) & 255);
        bArr[i3 + 3] = (byte) (i2 & 255);
        c0630xM1385M.f1381c = i3 + 4;
        c0613g.f1342t += 4;
        m1457c();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f1375u;
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC0614h m1461j(String string) {
        AbstractC6452k.m12181e(string, "string");
        if (this.f1375u) {
            throw new IllegalStateException("closed");
        }
        this.f1374t.m1389Q(string);
        m1457c();
        return this;
    }

    @Override // p033S0.InterfaceC0601A
    /* JADX INFO: renamed from: s */
    public final void mo1356s(C0613g source, long j2) {
        AbstractC6452k.m12181e(source, "source");
        if (this.f1375u) {
            throw new IllegalStateException("closed");
        }
        this.f1374t.mo1356s(source, j2);
        m1457c();
    }

    public final String toString() {
        return "buffer(" + this.f1373s + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        AbstractC6452k.m12181e(source, "source");
        if (this.f1375u) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f1374t.write(source);
        m1457c();
        return iWrite;
    }
}
