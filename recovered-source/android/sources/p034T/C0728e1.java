package p034T;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: renamed from: T.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0728e1 extends WeakReference {

    /* JADX INFO: renamed from: f */
    public static final boolean f1842f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

    /* JADX INFO: renamed from: g */
    public static final RuntimeException f1843g;

    /* JADX INFO: renamed from: a */
    public final ReferenceQueue f1844a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentMap f1845b;

    /* JADX INFO: renamed from: c */
    public final String f1846c;

    /* JADX INFO: renamed from: d */
    public final SoftReference f1847d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f1848e;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        f1843g = runtimeException;
    }

    public C0728e1(C0732f1 c0732f1, C0720c1 c0720c1, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(c0732f1, referenceQueue);
        this.f1848e = new AtomicBoolean();
        this.f1847d = new SoftReference(f1842f ? new RuntimeException("ManagedChannel allocation site") : f1843g);
        this.f1846c = c0720c1.toString();
        this.f1844a = referenceQueue;
        this.f1845b = concurrentMap;
        concurrentMap.put(this, this);
        m1609a(referenceQueue);
    }

    /* JADX INFO: renamed from: a */
    public static void m1609a(ReferenceQueue referenceQueue) {
        while (true) {
            C0728e1 c0728e1 = (C0728e1) referenceQueue.poll();
            if (c0728e1 == null) {
                return;
            }
            SoftReference softReference = c0728e1.f1847d;
            RuntimeException runtimeException = (RuntimeException) softReference.get();
            super.clear();
            c0728e1.f1845b.remove(c0728e1);
            softReference.clear();
            if (!c0728e1.f1848e.get()) {
                Level level = Level.SEVERE;
                Logger logger = C0732f1.f1861e;
                if (logger.isLoggable(level)) {
                    LogRecord logRecord = new LogRecord(level, "*~*~*~ Previous channel {0} was garbage collected without being shut down! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow()");
                    logRecord.setLoggerName(logger.getName());
                    logRecord.setParameters(new Object[]{c0728e1.f1846c});
                    logRecord.setThrown(runtimeException);
                    logger.log(logRecord);
                }
            }
        }
    }

    @Override // java.lang.ref.Reference
    public final void clear() {
        super.clear();
        this.f1845b.remove(this);
        this.f1847d.clear();
        m1609a(this.f1844a);
    }
}
