package p033S0;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: renamed from: S0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0618l implements InterfaceC0603C {

    /* JADX INFO: renamed from: s */
    public final C0622p f1350s;

    /* JADX INFO: renamed from: t */
    public long f1351t;

    /* JADX INFO: renamed from: u */
    public boolean f1352u;

    public C0618l(C0622p c0622p, long j2) {
        this.f1350s = c0622p;
        this.f1351t = j2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0622p c0622p = this.f1350s;
        if (this.f1352u) {
            return;
        }
        this.f1352u = true;
        ReentrantLock reentrantLock = c0622p.f1368v;
        reentrantLock.lock();
        try {
            int i2 = c0622p.f1367u - 1;
            c0622p.f1367u = i2;
            if (i2 == 0 && c0622p.f1366t) {
                reentrantLock.unlock();
                synchronized (c0622p) {
                    c0622p.f1369w.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p033S0.InterfaceC0603C
    /* JADX INFO: renamed from: m */
    public final long mo1359m(C0613g sink, long j2) {
        long j3;
        long j4;
        int i2;
        AbstractC6452k.m12181e(sink, "sink");
        if (this.f1352u) {
            throw new IllegalStateException("closed");
        }
        C0622p c0622p = this.f1350s;
        long j5 = this.f1351t;
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        long j6 = j2 + j5;
        long j7 = j5;
        while (true) {
            if (j7 < j6) {
                C0630x c0630xM1385M = sink.m1385M(1);
                byte[] array = c0630xM1385M.f1379a;
                int i3 = c0630xM1385M.f1381c;
                j3 = -1;
                int iMin = (int) Math.min(j6 - j7, 8192 - i3);
                synchronized (c0622p) {
                    AbstractC6452k.m12181e(array, "array");
                    c0622p.f1369w.seek(j7);
                    i2 = 0;
                    while (true) {
                        if (i2 < iMin) {
                            int i4 = c0622p.f1369w.read(array, i3, iMin - i2);
                            if (i4 != -1) {
                                i2 += i4;
                            } else if (i2 == 0) {
                                i2 = -1;
                                break;
                            }
                        }
                        break;
                    }
                }
                if (i2 == -1) {
                    if (c0630xM1385M.f1380b == c0630xM1385M.f1381c) {
                        sink.f1341s = c0630xM1385M.m1472a();
                        AbstractC0631y.m1476a(c0630xM1385M);
                    }
                    if (j5 == j7) {
                        j4 = -1;
                        break;
                    }
                } else {
                    c0630xM1385M.f1381c += i2;
                    long j8 = i2;
                    j7 += j8;
                    sink.f1342t += j8;
                }
            } else {
                j3 = -1;
            }
            j4 = j7 - j5;
            break;
        }
        if (j4 != j3) {
            this.f1351t += j4;
        }
        return j4;
    }
}
