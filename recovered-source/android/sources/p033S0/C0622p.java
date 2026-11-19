package p033S0;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: S0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0622p implements Closeable {

    /* JADX INFO: renamed from: s */
    public final boolean f1365s;

    /* JADX INFO: renamed from: t */
    public boolean f1366t;

    /* JADX INFO: renamed from: u */
    public int f1367u;

    /* JADX INFO: renamed from: v */
    public final ReentrantLock f1368v = new ReentrantLock();

    /* JADX INFO: renamed from: w */
    public final RandomAccessFile f1369w;

    public C0622p(boolean z, RandomAccessFile randomAccessFile) {
        this.f1365s = z;
        this.f1369w = randomAccessFile;
    }

    /* JADX INFO: renamed from: c */
    public static C0617k m1418c(C0622p c0622p) {
        if (!c0622p.f1365s) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = c0622p.f1368v;
        reentrantLock.lock();
        try {
            if (c0622p.f1366t) {
                throw new IllegalStateException("closed");
            }
            c0622p.f1367u++;
            reentrantLock.unlock();
            return new C0617k(c0622p);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f1368v;
        reentrantLock.lock();
        try {
            if (this.f1366t) {
                reentrantLock.unlock();
                return;
            }
            this.f1366t = true;
            if (this.f1367u != 0) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.f1369w.close();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final C0618l m1419e(long j2) {
        ReentrantLock reentrantLock = this.f1368v;
        reentrantLock.lock();
        try {
            if (this.f1366t) {
                throw new IllegalStateException("closed");
            }
            this.f1367u++;
            reentrantLock.unlock();
            return new C0618l(this, j2);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void flush() {
        if (!this.f1365s) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f1368v;
        reentrantLock.lock();
        try {
            if (this.f1366t) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.f1369w.getFD().sync();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.f1368v;
        reentrantLock.lock();
        try {
            if (this.f1366t) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                length = this.f1369w.length();
            }
            return length;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
