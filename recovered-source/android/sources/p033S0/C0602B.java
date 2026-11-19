package p033S0;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AbstractC6452k;

/* JADX INFO: renamed from: S0.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0602B extends AbstractC0605E {

    /* JADX INFO: renamed from: d */
    public static final ReentrantLock f1322d;

    /* JADX INFO: renamed from: b */
    public boolean f1323b;

    /* JADX INFO: renamed from: c */
    public C0602B f1324c;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f1322d = reentrantLock;
        AbstractC6452k.m12180d(reentrantLock.newCondition(), "lock.newCondition()");
        TimeUnit.MILLISECONDS.toNanos(TimeUnit.SECONDS.toMillis(60L));
    }

    public C0602B(Socket socket) {
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1357b() {
        ReentrantLock reentrantLock = f1322d;
        reentrantLock.lock();
        try {
            if (!this.f1323b) {
                return false;
            }
            this.f1323b = false;
            C0602B c0602b = null;
            while (c0602b != null) {
                C0602B c0602b2 = c0602b.f1324c;
                if (c0602b2 == this) {
                    c0602b.f1324c = this.f1324c;
                    this.f1324c = null;
                    return false;
                }
                c0602b = c0602b2;
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: c */
    public final IOException m1358c(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
