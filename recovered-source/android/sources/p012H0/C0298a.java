package p012H0;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.C6462u;
import p001B.C0084j;

/* JADX INFO: renamed from: H0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0298a extends Thread {

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f582A = AtomicIntegerFieldUpdater.newUpdater(C0298a.class, "workerCtl$volatile");
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;

    /* JADX INFO: renamed from: s */
    public final C0310m f583s;

    /* JADX INFO: renamed from: t */
    public final C6462u f584t;

    /* JADX INFO: renamed from: u */
    public EnumC0299b f585u;

    /* JADX INFO: renamed from: v */
    public long f586v;

    /* JADX INFO: renamed from: w */
    public long f587w;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX INFO: renamed from: x */
    public int f588x;

    /* JADX INFO: renamed from: y */
    public boolean f589y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ ExecutorC0300c f590z;

    public C0298a(ExecutorC0300c executorC0300c, int i2) {
        this.f590z = executorC0300c;
        setDaemon(true);
        setContextClassLoader(ExecutorC0300c.class.getClassLoader());
        this.f583s = new C0310m();
        this.f584t = new C6462u();
        this.f585u = EnumC0299b.f594v;
        this.nextParkedWorker = ExecutorC0300c.f599C;
        int iNanoTime = (int) System.nanoTime();
        this.f588x = iNanoTime == 0 ? 42 : iNanoTime;
        m448f(i2);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractRunnableC0306i m443a(boolean z) {
        AbstractRunnableC0306i abstractRunnableC0306iM447e;
        AbstractRunnableC0306i abstractRunnableC0306iM447e2;
        long j2;
        EnumC0299b enumC0299b = this.f585u;
        EnumC0299b enumC0299b2 = EnumC0299b.f591s;
        ExecutorC0300c executorC0300c = this.f590z;
        AbstractRunnableC0306i abstractRunnableC0306i = null;
        C0310m c0310m = this.f583s;
        if (enumC0299b != enumC0299b2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0300c.f597A;
            do {
                j2 = atomicLongFieldUpdater.get(executorC0300c);
                if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                    c0310m.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0310m.f623b;
                        AbstractRunnableC0306i abstractRunnableC0306i2 = (AbstractRunnableC0306i) atomicReferenceFieldUpdater.get(c0310m);
                        if (abstractRunnableC0306i2 == null || !abstractRunnableC0306i2.f614t) {
                            int i2 = C0310m.f625d.get(c0310m);
                            int i3 = C0310m.f624c.get(c0310m);
                            while (i2 != i3 && C0310m.f626e.get(c0310m) != 0) {
                                i3--;
                                AbstractRunnableC0306i abstractRunnableC0306iM460c = c0310m.m460c(i3, true);
                                if (abstractRunnableC0306iM460c != null) {
                                    abstractRunnableC0306i = abstractRunnableC0306iM460c;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(c0310m, abstractRunnableC0306i2, null)) {
                                abstractRunnableC0306i = abstractRunnableC0306i2;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(c0310m) == abstractRunnableC0306i2);
                    }
                    if (abstractRunnableC0306i != null) {
                        return abstractRunnableC0306i;
                    }
                    AbstractRunnableC0306i abstractRunnableC0306i3 = (AbstractRunnableC0306i) executorC0300c.f606x.m320d();
                    return abstractRunnableC0306i3 == null ? m451i(1) : abstractRunnableC0306i3;
                }
            } while (!ExecutorC0300c.f597A.compareAndSet(executorC0300c, j2, j2 - 4398046511104L));
            this.f585u = EnumC0299b.f591s;
        }
        if (z) {
            boolean z2 = m446d(executorC0300c.f601s * 2) == 0;
            if (z2 && (abstractRunnableC0306iM447e2 = m447e()) != null) {
                return abstractRunnableC0306iM447e2;
            }
            c0310m.getClass();
            AbstractRunnableC0306i abstractRunnableC0306iM459b = (AbstractRunnableC0306i) C0310m.f623b.getAndSet(c0310m, null);
            if (abstractRunnableC0306iM459b == null) {
                abstractRunnableC0306iM459b = c0310m.m459b();
            }
            if (abstractRunnableC0306iM459b != null) {
                return abstractRunnableC0306iM459b;
            }
            if (!z2 && (abstractRunnableC0306iM447e = m447e()) != null) {
                return abstractRunnableC0306iM447e;
            }
        } else {
            AbstractRunnableC0306i abstractRunnableC0306iM447e3 = m447e();
            if (abstractRunnableC0306iM447e3 != null) {
                return abstractRunnableC0306iM447e3;
            }
        }
        return m451i(3);
    }

    /* JADX INFO: renamed from: b */
    public final int m444b() {
        return this.indexInArray;
    }

    /* JADX INFO: renamed from: c */
    public final Object m445c() {
        return this.nextParkedWorker;
    }

    /* JADX INFO: renamed from: d */
    public final int m446d(int i2) {
        int i3 = this.f588x;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f588x = i6;
        int i7 = i2 - 1;
        return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
    }

    /* JADX INFO: renamed from: e */
    public final AbstractRunnableC0306i m447e() {
        int iM446d = m446d(2);
        ExecutorC0300c executorC0300c = this.f590z;
        if (iM446d == 0) {
            AbstractRunnableC0306i abstractRunnableC0306i = (AbstractRunnableC0306i) executorC0300c.f605w.m320d();
            return abstractRunnableC0306i != null ? abstractRunnableC0306i : (AbstractRunnableC0306i) executorC0300c.f606x.m320d();
        }
        AbstractRunnableC0306i abstractRunnableC0306i2 = (AbstractRunnableC0306i) executorC0300c.f606x.m320d();
        return abstractRunnableC0306i2 != null ? abstractRunnableC0306i2 : (AbstractRunnableC0306i) executorC0300c.f605w.m320d();
    }

    /* JADX INFO: renamed from: f */
    public final void m448f(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f590z.f604v);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    /* JADX INFO: renamed from: g */
    public final void m449g(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m450h(EnumC0299b enumC0299b) {
        EnumC0299b enumC0299b2 = this.f585u;
        boolean z = enumC0299b2 == EnumC0299b.f591s;
        if (z) {
            ExecutorC0300c.f597A.addAndGet(this.f590z, 4398046511104L);
        }
        if (enumC0299b2 != enumC0299b) {
            this.f585u = enumC0299b;
        }
        return z;
    }

    /* JADX INFO: renamed from: i */
    public final AbstractRunnableC0306i m451i(int i2) {
        long j2;
        AbstractRunnableC0306i abstractRunnableC0306iM460c;
        long j3;
        long j4;
        AbstractRunnableC0306i abstractRunnableC0306i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0300c.f597A;
        ExecutorC0300c executorC0300c = this.f590z;
        int i3 = (int) (atomicLongFieldUpdater.get(executorC0300c) & 2097151);
        AbstractRunnableC0306i abstractRunnableC0306i2 = null;
        if (i3 < 2) {
            return null;
        }
        int iM446d = m446d(i3);
        int i4 = 0;
        long jMin = LocationRequestCompat.PASSIVE_INTERVAL;
        while (i4 < i3) {
            iM446d++;
            if (iM446d > i3) {
                iM446d = 1;
            }
            C0298a c0298a = (C0298a) executorC0300c.f607y.m326b(iM446d);
            if (c0298a != null && c0298a != this) {
                C0310m c0310m = c0298a.f583s;
                if (i2 != 3) {
                    c0310m.getClass();
                    int i5 = C0310m.f625d.get(c0310m);
                    int i6 = C0310m.f624c.get(c0310m);
                    boolean z = i2 == 1;
                    while (true) {
                        if (i5 != i6) {
                            j2 = 0;
                            if (!z || C0310m.f626e.get(c0310m) != 0) {
                                int i7 = i5 + 1;
                                abstractRunnableC0306iM460c = c0310m.m460c(i5, z);
                                if (abstractRunnableC0306iM460c != null) {
                                    break;
                                }
                                i5 = i7;
                            }
                        } else {
                            j2 = 0;
                        }
                        abstractRunnableC0306iM460c = abstractRunnableC0306i2;
                        break;
                    }
                } else {
                    abstractRunnableC0306iM460c = c0310m.m459b();
                    j2 = 0;
                }
                C6462u c6462u = this.f584t;
                if (abstractRunnableC0306iM460c == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0310m.f623b;
                        AbstractRunnableC0306i abstractRunnableC0306i3 = (AbstractRunnableC0306i) atomicReferenceFieldUpdater.get(c0310m);
                        if (abstractRunnableC0306i3 == null) {
                            j3 = -1;
                        } else {
                            j3 = -1;
                            if (((abstractRunnableC0306i3.f614t ? 1 : 2) & i2) != 0) {
                                AbstractC0308k.f621f.getClass();
                                C0310m c0310m2 = c0310m;
                                long jNanoTime = System.nanoTime() - abstractRunnableC0306i3.f613s;
                                long j5 = AbstractC0308k.f617b;
                                if (jNanoTime < j5) {
                                    j4 = j5 - jNanoTime;
                                    abstractRunnableC0306i = null;
                                    break;
                                }
                                do {
                                    abstractRunnableC0306i = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(c0310m2, abstractRunnableC0306i3, null)) {
                                        c6462u.f24636s = abstractRunnableC0306i3;
                                        j4 = -1;
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(c0310m2) == abstractRunnableC0306i3);
                                c0310m = c0310m2;
                                abstractRunnableC0306i2 = null;
                            }
                        }
                        j4 = -2;
                        abstractRunnableC0306i = abstractRunnableC0306i2;
                        break;
                    }
                } else {
                    c6462u.f24636s = abstractRunnableC0306iM460c;
                    abstractRunnableC0306i = abstractRunnableC0306i2;
                    j4 = -1;
                    j3 = -1;
                }
                if (j4 == j3) {
                    AbstractRunnableC0306i abstractRunnableC0306i4 = (AbstractRunnableC0306i) c6462u.f24636s;
                    c6462u.f24636s = abstractRunnableC0306i;
                    return abstractRunnableC0306i4;
                }
                if (j4 > j2) {
                    jMin = Math.min(jMin, j4);
                }
            }
            i4++;
            abstractRunnableC0306i2 = null;
        }
        if (jMin == LocationRequestCompat.PASSIVE_INTERVAL) {
            jMin = 0;
        }
        this.f587w = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j2;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (ExecutorC0300c.f598B.get(this.f590z) == 0) {
                    EnumC0299b enumC0299b = this.f585u;
                    EnumC0299b enumC0299b2 = EnumC0299b.f595w;
                    if (enumC0299b == enumC0299b2) {
                        break loop0;
                    }
                    AbstractRunnableC0306i abstractRunnableC0306iM443a = m443a(this.f589y);
                    if (abstractRunnableC0306iM443a != null) {
                        this.f587w = 0L;
                        ExecutorC0300c executorC0300c = this.f590z;
                        this.f586v = 0L;
                        if (this.f585u == EnumC0299b.f593u) {
                            this.f585u = EnumC0299b.f592t;
                        }
                        if (!abstractRunnableC0306iM443a.f614t) {
                            try {
                                abstractRunnableC0306iM443a.run();
                                break;
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                break;
                            }
                        }
                        if (m450h(EnumC0299b.f592t) && !executorC0300c.m457l() && !executorC0300c.m456j(ExecutorC0300c.f597A.get(executorC0300c))) {
                            executorC0300c.m457l();
                        }
                        try {
                            abstractRunnableC0306iM443a.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                        ExecutorC0300c.f597A.addAndGet(executorC0300c, -2097152L);
                        if (this.f585u == enumC0299b2) {
                            break;
                        }
                        this.f585u = EnumC0299b.f594v;
                        break;
                    }
                    this.f589y = false;
                    if (this.f587w == 0) {
                        Object obj = this.nextParkedWorker;
                        C0084j c0084j = ExecutorC0300c.f599C;
                        if (obj != c0084j) {
                            f582A.set(this, -1);
                            while (this.nextParkedWorker != ExecutorC0300c.f599C) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f582A;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                ExecutorC0300c executorC0300c2 = this.f590z;
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = ExecutorC0300c.f598B;
                                if (atomicIntegerFieldUpdater2.get(executorC0300c2) != 0) {
                                    break;
                                }
                                EnumC0299b enumC0299b3 = this.f585u;
                                EnumC0299b enumC0299b4 = EnumC0299b.f595w;
                                if (enumC0299b3 == enumC0299b4) {
                                    break;
                                }
                                m450h(EnumC0299b.f593u);
                                Thread.interrupted();
                                if (this.f586v == 0) {
                                    j2 = 2097151;
                                    this.f586v = System.nanoTime() + this.f590z.f603u;
                                } else {
                                    j2 = 2097151;
                                }
                                LockSupport.parkNanos(this.f590z.f603u);
                                if (System.nanoTime() - this.f586v >= 0) {
                                    this.f586v = 0L;
                                    ExecutorC0300c executorC0300c3 = this.f590z;
                                    synchronized (executorC0300c3.f607y) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(executorC0300c3) != 0)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0300c.f597A;
                                                if (((int) (atomicLongFieldUpdater.get(executorC0300c3) & j2)) > executorC0300c3.f601s) {
                                                    if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i2 = this.indexInArray;
                                                        m448f(0);
                                                        executorC0300c3.m455i(this, i2, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(executorC0300c3) & j2);
                                                        if (andDecrement != i2) {
                                                            Object objM326b = executorC0300c3.f607y.m326b(andDecrement);
                                                            AbstractC6452k.m12178b(objM326b);
                                                            C0298a c0298a = (C0298a) objM326b;
                                                            executorC0300c3.f607y.m327c(i2, c0298a);
                                                            c0298a.m448f(i2);
                                                            executorC0300c3.m455i(c0298a, andDecrement, i2);
                                                        }
                                                        executorC0300c3.f607y.m327c(andDecrement, null);
                                                        this.f585u = enumC0299b4;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                            }
                        } else {
                            ExecutorC0300c executorC0300c4 = this.f590z;
                            if (this.nextParkedWorker == c0084j) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = ExecutorC0300c.f600z;
                                while (true) {
                                    long j3 = atomicLongFieldUpdater2.get(executorC0300c4);
                                    int i3 = this.indexInArray;
                                    this.nextParkedWorker = executorC0300c4.f607y.m326b((int) (j3 & 2097151));
                                    ExecutorC0300c executorC0300c5 = executorC0300c4;
                                    if (ExecutorC0300c.f600z.compareAndSet(executorC0300c5, j3, ((j3 + 2097152) & (-2097152)) | ((long) i3))) {
                                        break;
                                    } else {
                                        executorC0300c4 = executorC0300c5;
                                    }
                                }
                            }
                        }
                    } else {
                        if (z) {
                            m450h(EnumC0299b.f593u);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f587w);
                            this.f587w = 0L;
                            break;
                        }
                        z = true;
                    }
                } else {
                    break loop0;
                }
            }
        }
        m450h(EnumC0299b.f595w);
    }
}
