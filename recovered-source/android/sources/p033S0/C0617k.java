package p033S0;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: renamed from: S0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0617k implements InterfaceC0601A {

    /* JADX INFO: renamed from: s */
    public final C0622p f1347s;

    /* JADX INFO: renamed from: t */
    public long f1348t;

    /* JADX INFO: renamed from: u */
    public boolean f1349u;

    public C0617k(C0622p fileHandle) {
        AbstractC6452k.m12181e(fileHandle, "fileHandle");
        this.f1347s = fileHandle;
        this.f1348t = 0L;
    }

    @Override // p033S0.InterfaceC0601A, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0622p c0622p = this.f1347s;
        if (this.f1349u) {
            return;
        }
        this.f1349u = true;
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

    @Override // p033S0.InterfaceC0601A, java.io.Flushable
    public final void flush() {
        if (this.f1349u) {
            throw new IllegalStateException("closed");
        }
        C0622p c0622p = this.f1347s;
        synchronized (c0622p) {
            c0622p.f1369w.getFD().sync();
        }
    }

    @Override // p033S0.InterfaceC0601A
    /* JADX INFO: renamed from: s */
    public final void mo1356s(C0613g c0613g, long j2) {
        if (this.f1349u) {
            throw new IllegalStateException("closed");
        }
        C0622p c0622p = this.f1347s;
        long j3 = this.f1348t;
        c0622p.getClass();
        AbstractC0608b.m1370c(c0613g.f1342t, 0L, j2);
        long j4 = j3 + j2;
        while (j3 < j4) {
            C0630x c0630x = c0613g.f1341s;
            AbstractC6452k.m12178b(c0630x);
            int iMin = (int) Math.min(j4 - j3, c0630x.f1381c - c0630x.f1380b);
            byte[] array = c0630x.f1379a;
            int i2 = c0630x.f1380b;
            synchronized (c0622p) {
                AbstractC6452k.m12181e(array, "array");
                c0622p.f1369w.seek(j3);
                c0622p.f1369w.write(array, i2, iMin);
            }
            int i3 = c0630x.f1380b + iMin;
            c0630x.f1380b = i3;
            long j5 = iMin;
            j3 += j5;
            c0613g.f1342t -= j5;
            if (i3 == c0630x.f1381c) {
                c0613g.f1341s = c0630x.m1472a();
                AbstractC0631y.m1476a(c0630x);
            }
        }
        this.f1348t += j2;
    }
}
