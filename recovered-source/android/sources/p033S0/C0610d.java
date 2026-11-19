package p033S0;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC6452k;
import p091y0.AbstractC6574d;

/* JADX INFO: renamed from: S0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0610d implements InterfaceC0603C {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f1334s;

    /* JADX INFO: renamed from: t */
    public final Object f1335t;

    /* JADX INFO: renamed from: u */
    public final Object f1336u;

    public /* synthetic */ C0610d(int i2, Object obj, Object obj2) {
        this.f1334s = i2;
        this.f1335t = obj;
        this.f1336u = obj2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f1334s) {
            case 0:
                C0602B c0602b = (C0602B) this.f1335t;
                try {
                    try {
                        ((C0610d) this.f1336u).close();
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
                ((InputStream) this.f1335t).close();
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    @Override // p033S0.InterfaceC0603C
    /* JADX INFO: renamed from: m */
    public final long mo1359m(C0613g sink, long j2) throws IOException {
        boolean z;
        int i2 = this.f1334s;
        Object obj = this.f1335t;
        Object obj2 = this.f1336u;
        AbstractC6452k.m12181e(sink, "sink");
        switch (i2) {
            case 0:
                C0602B c0602b = (C0602B) obj;
                try {
                    try {
                        long jMo1359m = ((C0610d) obj2).mo1359m(sink, j2);
                        if (c0602b.m1357b()) {
                            throw c0602b.m1358c(null);
                        }
                        return jMo1359m;
                    } catch (IOException e) {
                        if (c0602b.m1357b()) {
                            throw c0602b.m1358c(e);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    c0602b.m1357b();
                    throw th;
                }
            default:
                if (j2 == 0) {
                    return 0L;
                }
                if (j2 < 0) {
                    throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
                }
                try {
                    ((AbstractC0605E) obj2).mo1360a();
                    C0630x c0630xM1385M = sink.m1385M(1);
                    int i3 = ((InputStream) obj).read(c0630xM1385M.f1379a, c0630xM1385M.f1381c, (int) Math.min(j2, 8192 - c0630xM1385M.f1381c));
                    if (i3 == -1) {
                        if (c0630xM1385M.f1380b == c0630xM1385M.f1381c) {
                            sink.f1341s = c0630xM1385M.m1472a();
                            AbstractC0631y.m1476a(c0630xM1385M);
                        }
                        return -1L;
                    }
                    c0630xM1385M.f1381c += i3;
                    long j3 = i3;
                    sink.f1342t += j3;
                    return j3;
                } catch (AssertionError e2) {
                    int i4 = AbstractC0626t.f1370a;
                    if (e2.getCause() != null) {
                        String message = e2.getMessage();
                        z = message != null ? AbstractC6574d.m12226v(message, "getsockname failed") : false;
                    }
                    if (z) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
        }
    }

    public final String toString() {
        switch (this.f1334s) {
            case 0:
                return "AsyncTimeout.source(" + ((C0610d) this.f1336u) + ')';
            default:
                return "source(" + ((InputStream) this.f1335t) + ')';
        }
    }
}
