package p012H0;

import androidx.datastore.preferences.protobuf.AbstractC1456a;
import androidx.work.WorkRequest;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractC0069y;
import p001B.C0084j;
import p010F0.C0230p;
import p011H.AbstractC0271e0;

/* JADX INFO: renamed from: H0.c */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0300c implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: s */
    public final int f601s;

    /* JADX INFO: renamed from: t */
    public final int f602t;

    /* JADX INFO: renamed from: u */
    public final long f603u;

    /* JADX INFO: renamed from: v */
    public final String f604v;

    /* JADX INFO: renamed from: w */
    public final C0303f f605w;

    /* JADX INFO: renamed from: x */
    public final C0303f f606x;

    /* JADX INFO: renamed from: y */
    public final C0230p f607y;

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ AtomicLongFieldUpdater f600z = AtomicLongFieldUpdater.newUpdater(ExecutorC0300c.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ AtomicLongFieldUpdater f597A = AtomicLongFieldUpdater.newUpdater(ExecutorC0300c.class, "controlState$volatile");

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f598B = AtomicIntegerFieldUpdater.newUpdater(ExecutorC0300c.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: C */
    public static final C0084j f599C = new C0084j("NOT_IN_STACK", 1);

    public ExecutorC0300c(int i2, int i3, long j2, String str) {
        this.f601s = i2;
        this.f602t = i3;
        this.f603u = j2;
        this.f604v = str;
        if (i2 < 1) {
            throw new IllegalArgumentException(AbstractC0271e0.m397e(i2, "Core pool size ", " should be at least 1").toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(AbstractC1456a.m2443j(i3, i2, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i3 > 2097150) {
            throw new IllegalArgumentException(AbstractC0271e0.m397e(i3, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j2 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.f605w = new C0303f();
        this.f606x = new C0303f();
        this.f607y = new C0230p((i2 + 1) * 2);
        this.controlState$volatile = ((long) i2) << 42;
        this._isTerminated$volatile = 0;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m452h(ExecutorC0300c executorC0300c, Runnable runnable, int i2) {
        executorC0300c.m454e(runnable, false, (i2 & 4) == 0);
    }

    /* JADX INFO: renamed from: c */
    public final int m453c() {
        synchronized (this.f607y) {
            try {
                if (f598B.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f597A;
                long j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 & 2097151);
                int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.f601s) {
                    return 0;
                }
                if (i2 >= this.f602t) {
                    return 0;
                }
                int i4 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i4 <= 0 || this.f607y.m326b(i4) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                C0298a c0298a = new C0298a(this, i4);
                this.f607y.m327c(i4, c0298a);
                if (i4 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i5 = i3 + 1;
                c0298a.start();
                return i5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i2;
        AbstractRunnableC0306i abstractRunnableC0306iM443a;
        if (f598B.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            C0298a c0298a = threadCurrentThread instanceof C0298a ? (C0298a) threadCurrentThread : null;
            if (c0298a == null || !AbstractC6452k.m12177a(c0298a.f590z, this)) {
                c0298a = null;
            }
            synchronized (this.f607y) {
                i2 = (int) (f597A.get(this) & 2097151);
            }
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    Object objM326b = this.f607y.m326b(i3);
                    AbstractC6452k.m12178b(objM326b);
                    C0298a c0298a2 = (C0298a) objM326b;
                    if (c0298a2 != c0298a) {
                        while (c0298a2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(c0298a2);
                            c0298a2.join(WorkRequest.MIN_BACKOFF_MILLIS);
                        }
                        C0310m c0310m = c0298a2.f583s;
                        C0303f c0303f = this.f606x;
                        c0310m.getClass();
                        AbstractRunnableC0306i abstractRunnableC0306i = (AbstractRunnableC0306i) C0310m.f623b.getAndSet(c0310m, null);
                        if (abstractRunnableC0306i != null) {
                            c0303f.m317a(abstractRunnableC0306i);
                        }
                        while (true) {
                            AbstractRunnableC0306i abstractRunnableC0306iM459b = c0310m.m459b();
                            if (abstractRunnableC0306iM459b == null) {
                                break;
                            } else {
                                c0303f.m317a(abstractRunnableC0306iM459b);
                            }
                        }
                    }
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.f606x.m318b();
            this.f605w.m318b();
            while (true) {
                if (c0298a != null) {
                    abstractRunnableC0306iM443a = c0298a.m443a(true);
                    if (abstractRunnableC0306iM443a == null) {
                        abstractRunnableC0306iM443a = (AbstractRunnableC0306i) this.f605w.m320d();
                        if (abstractRunnableC0306iM443a == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    abstractRunnableC0306iM443a = (AbstractRunnableC0306i) this.f605w.m320d();
                    if (abstractRunnableC0306iM443a == null && (abstractRunnableC0306iM443a = (AbstractRunnableC0306i) this.f606x.m320d()) == null) {
                        break;
                    }
                }
                try {
                    abstractRunnableC0306iM443a.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (c0298a != null) {
                c0298a.m450h(EnumC0299b.f595w);
            }
            f600z.set(this, 0L);
            f597A.set(this, 0L);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m454e(Runnable runnable, boolean z, boolean z2) {
        AbstractRunnableC0306i c0307j;
        EnumC0299b enumC0299b;
        AbstractC0308k.f621f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC0306i) {
            c0307j = (AbstractRunnableC0306i) runnable;
            c0307j.f613s = jNanoTime;
            c0307j.f614t = z;
        } else {
            c0307j = new C0307j(runnable, jNanoTime, z);
        }
        boolean z3 = c0307j.f614t;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f597A;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C0298a c0298a = threadCurrentThread instanceof C0298a ? (C0298a) threadCurrentThread : null;
        if (c0298a == null || !AbstractC6452k.m12177a(c0298a.f590z, this)) {
            c0298a = null;
        }
        if (c0298a != null && (enumC0299b = c0298a.f585u) != EnumC0299b.f595w && (c0307j.f614t || enumC0299b != EnumC0299b.f592t)) {
            c0298a.f589y = true;
            C0310m c0310m = c0298a.f583s;
            if (z2) {
                c0307j = c0310m.m458a(c0307j);
            } else {
                c0310m.getClass();
                AbstractRunnableC0306i abstractRunnableC0306i = (AbstractRunnableC0306i) C0310m.f623b.getAndSet(c0310m, c0307j);
                c0307j = abstractRunnableC0306i == null ? null : c0310m.m458a(abstractRunnableC0306i);
            }
        }
        if (c0307j != null) {
            if (!(c0307j.f614t ? this.f606x.m317a(c0307j) : this.f605w.m317a(c0307j))) {
                throw new RejectedExecutionException(AbstractC0271e0.m403k(new StringBuilder(), this.f604v, " was terminated"));
            }
        }
        boolean z4 = z2 && c0298a != null;
        if (z3) {
            if (z4 || m457l() || m456j(jAddAndGet)) {
                return;
            }
            m457l();
            return;
        }
        if (z4 || m457l() || m456j(atomicLongFieldUpdater.get(this))) {
            return;
        }
        m457l();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m452h(this, runnable, 6);
    }

    /* JADX INFO: renamed from: i */
    public final void m455i(C0298a c0298a, int i2, int i3) {
        while (true) {
            long j2 = f600z.get(this);
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i4 == i2) {
                if (i3 == 0) {
                    Object objM445c = c0298a.m445c();
                    while (true) {
                        if (objM445c == f599C) {
                            i4 = -1;
                            break;
                        }
                        if (objM445c == null) {
                            i4 = 0;
                            break;
                        }
                        C0298a c0298a2 = (C0298a) objM445c;
                        int iM444b = c0298a2.m444b();
                        if (iM444b != 0) {
                            i4 = iM444b;
                            break;
                        }
                        objM445c = c0298a2.m445c();
                    }
                } else {
                    i4 = i3;
                }
            }
            if (i4 >= 0) {
                if (f600z.compareAndSet(this, j2, ((long) i4) | j3)) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m456j(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.f601s;
        if (i2 < i3) {
            int iM453c = m453c();
            if (iM453c == 1 && i3 > 1) {
                m453c();
            }
            if (iM453c > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m457l() {
        C0084j c0084j;
        int iM444b;
        while (true) {
            long j2 = f600z.get(this);
            C0298a c0298a = (C0298a) this.f607y.m326b((int) (2097151 & j2));
            if (c0298a == null) {
                c0298a = null;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                Object objM445c = c0298a.m445c();
                while (true) {
                    c0084j = f599C;
                    if (objM445c == c0084j) {
                        iM444b = -1;
                        break;
                    }
                    if (objM445c == null) {
                        iM444b = 0;
                        break;
                    }
                    C0298a c0298a2 = (C0298a) objM445c;
                    iM444b = c0298a2.m444b();
                    if (iM444b != 0) {
                        break;
                    }
                    objM445c = c0298a2.m445c();
                }
                if (iM444b >= 0) {
                    if (f600z.compareAndSet(this, j2, ((long) iM444b) | j3)) {
                        c0298a.m449g(c0084j);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (c0298a == null) {
                return false;
            }
            if (C0298a.f582A.compareAndSet(c0298a, -1, 0)) {
                LockSupport.unpark(c0298a);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C0230p c0230p = this.f607y;
        int iM325a = c0230p.m325a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < iM325a; i7++) {
            C0298a c0298a = (C0298a) c0230p.m326b(i7);
            if (c0298a != null) {
                C0310m c0310m = c0298a.f583s;
                c0310m.getClass();
                int i8 = C0310m.f623b.get(c0310m) != null ? (C0310m.f624c.get(c0310m) - C0310m.f625d.get(c0310m)) + 1 : C0310m.f624c.get(c0310m) - C0310m.f625d.get(c0310m);
                int iOrdinal = c0298a.f585u.ordinal();
                if (iOrdinal == 0) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i8);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i3++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i8);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i4++;
                } else if (iOrdinal == 3) {
                    i5++;
                    if (i8 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i8);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i6++;
                }
            }
        }
        long j2 = f597A.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f604v);
        sb4.append('@');
        sb4.append(AbstractC0069y.m107f(this));
        sb4.append("[Pool Size {core = ");
        int i9 = this.f601s;
        sb4.append(i9);
        sb4.append(", max = ");
        sb4.append(this.f602t);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i2);
        sb4.append(", blocking = ");
        sb4.append(i3);
        sb4.append(", parked = ");
        sb4.append(i4);
        sb4.append(", dormant = ");
        sb4.append(i5);
        sb4.append(", terminated = ");
        sb4.append(i6);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f605w.m319c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f606x.m319c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j2));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j2) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i9 - ((int) ((j2 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
