package p033S0;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: renamed from: S0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0609c implements InterfaceC0601A {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f1331s = 0;

    /* JADX INFO: renamed from: t */
    public final C0602B f1332t;

    /* JADX INFO: renamed from: u */
    public final Object f1333u;

    public C0609c(OutputStream outputStream, C0602B c0602b) {
        this.f1333u = outputStream;
        this.f1332t = c0602b;
    }

    @Override // p033S0.InterfaceC0601A, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f1331s) {
            case 0:
                C0602B c0602b = this.f1332t;
                try {
                    try {
                        ((C0609c) this.f1333u).close();
                        if (c0602b.m1357b()) {
                            throw c0602b.m1358c(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!c0602b.m1357b()) {
                            throw e;
                        }
                        throw c0602b.m1358c(e);
                    }
                } catch (Throwable th) {
                    c0602b.m1357b();
                    throw th;
                }
            default:
                ((OutputStream) this.f1333u).close();
                return;
        }
    }

    @Override // p033S0.InterfaceC0601A, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f1331s) {
            case 0:
                C0602B c0602b = this.f1332t;
                try {
                    try {
                        ((C0609c) this.f1333u).flush();
                        if (c0602b.m1357b()) {
                            throw c0602b.m1358c(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!c0602b.m1357b()) {
                            throw e;
                        }
                        throw c0602b.m1358c(e);
                    }
                } catch (Throwable th) {
                    c0602b.m1357b();
                    throw th;
                }
            default:
                ((OutputStream) this.f1333u).flush();
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008c A[LOOP:1: B:12:0x0058->B:25:0x008c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x008e A[SYNTHETIC] */
    @Override // p033S0.InterfaceC0601A
    /* JADX INFO: renamed from: s */
    public final void mo1356s(C0613g c0613g, long j2) throws IOException {
        C0602B c0602b;
        switch (this.f1331s) {
            case 0:
                AbstractC0608b.m1370c(c0613g.f1342t, 0L, j2);
                long j3 = j2;
                while (true) {
                    long j4 = 0;
                    if (j3 <= 0) {
                        return;
                    }
                    C0630x c0630x = c0613g.f1341s;
                    AbstractC6452k.m12178b(c0630x);
                    try {
                        try {
                            while (j4 < 65536) {
                                j4 += (long) (c0630x.f1381c - c0630x.f1380b);
                                if (j4 >= j3) {
                                    j4 = j3;
                                    c0602b = this.f1332t;
                                    ((C0609c) this.f1333u).mo1356s(c0613g, j4);
                                    if (!c0602b.m1357b()) {
                                        throw c0602b.m1358c(null);
                                    }
                                    j3 -= j4;
                                } else {
                                    c0630x = c0630x.f1384f;
                                    AbstractC6452k.m12178b(c0630x);
                                }
                            }
                            ((C0609c) this.f1333u).mo1356s(c0613g, j4);
                            if (!c0602b.m1357b()) {
                                throw c0602b.m1358c(null);
                            }
                            j3 -= j4;
                        } catch (IOException e) {
                            if (!c0602b.m1357b()) {
                                throw e;
                            }
                            throw c0602b.m1358c(e);
                        }
                    } catch (Throwable th) {
                        c0602b.m1357b();
                        throw th;
                    }
                    c0602b = this.f1332t;
                }
                break;
            default:
                AbstractC0608b.m1370c(c0613g.f1342t, 0L, j2);
                while (j2 > 0) {
                    this.f1332t.mo1360a();
                    C0630x c0630x2 = c0613g.f1341s;
                    AbstractC6452k.m12178b(c0630x2);
                    int iMin = (int) Math.min(j2, c0630x2.f1381c - c0630x2.f1380b);
                    ((OutputStream) this.f1333u).write(c0630x2.f1379a, c0630x2.f1380b, iMin);
                    int i2 = c0630x2.f1380b + iMin;
                    c0630x2.f1380b = i2;
                    long j5 = iMin;
                    j2 -= j5;
                    c0613g.f1342t -= j5;
                    if (i2 == c0630x2.f1381c) {
                        c0613g.f1341s = c0630x2.m1472a();
                        AbstractC0631y.m1476a(c0630x2);
                    }
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f1331s) {
            case 0:
                return "AsyncTimeout.sink(" + ((C0609c) this.f1333u) + ')';
            default:
                return "sink(" + ((OutputStream) this.f1333u) + ')';
        }
    }

    public C0609c(C0602B c0602b, C0609c c0609c) {
        this.f1332t = c0602b;
        this.f1333u = c0609c;
    }
}
