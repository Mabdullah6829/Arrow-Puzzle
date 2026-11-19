package p011H;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: H.h0 */
/* JADX INFO: loaded from: classes2.dex */
public final class ThreadFactoryC0277h0 implements ThreadFactory {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ ThreadFactory f544s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ String f545t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ AtomicLong f546u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Boolean f547v;

    public ThreadFactoryC0277h0(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool) {
        this.f544s = threadFactory;
        this.f545t = str;
        this.f546u = atomicLong;
        this.f547v = bool;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f544s.newThread(runnable);
        Objects.requireNonNull(threadNewThread);
        String str = this.f545t;
        if (str != null) {
            AtomicLong atomicLong = this.f546u;
            Objects.requireNonNull(atomicLong);
            threadNewThread.setName(String.format(Locale.ROOT, str, Long.valueOf(atomicLong.getAndIncrement())));
        }
        Boolean bool = this.f547v;
        if (bool != null) {
            threadNewThread.setDaemon(bool.booleanValue());
        }
        return threadNewThread;
    }
}
