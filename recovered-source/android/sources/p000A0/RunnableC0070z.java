package p000A0;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: A0.z */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0070z extends AbstractC0013N implements Runnable {

    /* JADX INFO: renamed from: A */
    public static final long f96A;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: z */
    public static final RunnableC0070z f97z;

    static {
        Long l2;
        RunnableC0070z runnableC0070z = new RunnableC0070z();
        f97z = runnableC0070z;
        runnableC0070z.m22n(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f96A = timeUnit.toNanos(l2.longValue());
    }

    /* JADX INFO: renamed from: J */
    public final synchronized void m120J() {
        int i2 = debugStatus;
        if (i2 == 2 || i2 == 3) {
            debugStatus = 3;
            AbstractC0013N.f11w.set(this, null);
            AbstractC0013N.f12x.set(this, null);
            notifyAll();
        }
    }

    @Override // p000A0.AbstractC0014O
    /* JADX INFO: renamed from: l */
    public final Thread mo21l() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(f97z.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // p000A0.AbstractC0014O
    /* JADX INFO: renamed from: r */
    public final void mo24r(long j2, AbstractRunnableC0011L abstractRunnableC0011L) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0054o0.f66a.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 == 2 || i2 == 3) {
                    _thread = null;
                    m120J();
                    if (m15H()) {
                        return;
                    }
                    mo21l();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j2 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jMo17o = mo17o();
                    if (jMo17o == LocationRequestCompat.PASSIVE_INTERVAL) {
                        long jNanoTime = System.nanoTime();
                        if (j2 == LocationRequestCompat.PASSIVE_INTERVAL) {
                            j2 = f96A + jNanoTime;
                        }
                        long j3 = j2 - jNanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            m120J();
                            if (m15H()) {
                                return;
                            }
                            mo21l();
                            return;
                        }
                        if (jMo17o > j3) {
                            jMo17o = j3;
                        }
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (jMo17o > 0) {
                        int i3 = debugStatus;
                        if (i3 == 2 || i3 == 3) {
                            _thread = null;
                            m120J();
                            if (m15H()) {
                                return;
                            }
                            mo21l();
                            return;
                        }
                        LockSupport.parkNanos(this, jMo17o);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            m120J();
            if (!m15H()) {
                mo21l();
            }
            throw th;
        }
    }

    @Override // p000A0.AbstractC0013N, p000A0.AbstractC0014O
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // p000A0.AbstractC0063t
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // p000A0.AbstractC0013N
    /* JADX INFO: renamed from: u */
    public final void mo18u(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo18u(runnable);
    }
}
