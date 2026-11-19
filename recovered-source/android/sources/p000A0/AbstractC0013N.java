package p000A0;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC6452k;
import p001B.C0084j;
import p010F0.C0226l;
import p010F0.C0235u;
import p058e0.C6301i;
import p062g0.InterfaceC6353h;

/* JADX INFO: renamed from: A0.N */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0013N extends AbstractC0014O implements InterfaceC0003D {

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11w = AtomicReferenceFieldUpdater.newUpdater(AbstractC0013N.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12x = AtomicReferenceFieldUpdater.newUpdater(AbstractC0013N.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13y = AtomicIntegerFieldUpdater.newUpdater(AbstractC0013N.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: A */
    public final boolean m14A(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11w;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f13y.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof C0226l)) {
                if (obj == AbstractC0069y.f88c) {
                    return false;
                }
                C0226l c0226l = new C0226l(8, true);
                c0226l.m321a((Runnable) obj);
                c0226l.m321a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0226l)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            C0226l c0226l2 = (C0226l) obj;
            int iM321a = c0226l2.m321a(runnable);
            if (iM321a == 0) {
                return true;
            }
            if (iM321a == 1) {
                C0226l c0226lM323c = c0226l2.m323c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0226lM323c) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iM321a == 2) {
                return false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0027  */
    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX WARN: Code duplicated, block: B:22:0x0034  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x004e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX INFO: renamed from: H */
    public final boolean m15H() {
        Object obj;
        long j2;
        C6301i c6301i = this.f17u;
        if (c6301i != null ? c6301i.isEmpty() : true) {
            C0012M c0012m = (C0012M) f12x.get(this);
            if (c0012m == null) {
                obj = f11w.get(this);
                if (obj != null) {
                    if (obj instanceof C0226l) {
                        j2 = C0226l.f453f.get((C0226l) obj);
                        if (((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == AbstractC0069y.f88c) {
                    }
                }
                return true;
            }
            if (C0235u.f469b.get(c0012m) == 0) {
                obj = f11w.get(this);
                if (obj != null) {
                    if (obj instanceof C0226l) {
                        j2 = C0226l.f453f.get((C0226l) obj);
                        if (((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == AbstractC0069y.f88c) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: I */
    public final void m16I(long j2, AbstractRunnableC0011L abstractRunnableC0011L) {
        int iM12c;
        Thread threadMo21l;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12x;
        AbstractRunnableC0011L abstractRunnableC0011L2 = null;
        if (f13y.get(this) != 0) {
            iM12c = 1;
        } else {
            C0012M c0012m = (C0012M) atomicReferenceFieldUpdater.get(this);
            if (c0012m == null) {
                C0012M c0012m2 = new C0012M();
                c0012m2.f10c = j2;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c0012m2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                AbstractC6452k.m12178b(obj);
                c0012m = (C0012M) obj;
            }
            iM12c = abstractRunnableC0011L.m12c(j2, c0012m, this);
        }
        if (iM12c != 0) {
            if (iM12c == 1) {
                mo24r(j2, abstractRunnableC0011L);
                return;
            } else {
                if (iM12c != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        C0012M c0012m3 = (C0012M) atomicReferenceFieldUpdater.get(this);
        if (c0012m3 != null) {
            synchronized (c0012m3) {
                AbstractRunnableC0011L[] abstractRunnableC0011LArr = c0012m3.f470a;
                abstractRunnableC0011L2 = abstractRunnableC0011LArr != null ? abstractRunnableC0011LArr[0] : null;
            }
        }
        if (abstractRunnableC0011L2 != abstractRunnableC0011L || Thread.currentThread() == (threadMo21l = mo21l())) {
            return;
        }
        LockSupport.unpark(threadMo21l);
    }

    @Override // p000A0.AbstractC0063t
    public final void dispatch(InterfaceC6353h interfaceC6353h, Runnable runnable) {
        mo18u(runnable);
    }

    @Override // p000A0.InterfaceC0003D
    /* JADX INFO: renamed from: i */
    public final void mo1i(long j2, C0039h c0039h) {
        long j3 = 0;
        if (j2 > 0) {
            j3 = j2 >= 9223372036854L ? LocationRequestCompat.PASSIVE_INTERVAL : 1000000 * j2;
        }
        if (j3 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            C0010K c0010k = new C0010K(this, j3 + jNanoTime, c0039h);
            m16I(jNanoTime, c0010k);
            c0039h.m89u(new C0033e(c0010k, 2));
        }
    }

    @Override // p000A0.AbstractC0014O
    /* JADX INFO: renamed from: o */
    public final long mo17o() {
        Runnable runnable;
        AbstractRunnableC0011L abstractRunnableC0011L;
        C0084j c0084j = AbstractC0069y.f88c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11w;
        if (!m23p()) {
            m19w();
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj != null) {
                    if (obj instanceof C0226l) {
                        C0226l c0226l = (C0226l) obj;
                        Object objM324d = c0226l.m324d();
                        if (objM324d != C0226l.f454g) {
                            runnable = (Runnable) objM324d;
                            break;
                        }
                        C0226l c0226lM323c = c0226l.m323c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0226lM323c) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (obj != c0084j) {
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                                runnable = (Runnable) obj;
                                break loop0;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == obj);
                    }
                }
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            C6301i c6301i = this.f17u;
            if (((c6301i == null || c6301i.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof C0226l) {
                        long j2 = C0226l.f453f.get((C0226l) obj2);
                        if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == c0084j) {
                        return LocationRequestCompat.PASSIVE_INTERVAL;
                    }
                }
                C0012M c0012m = (C0012M) f12x.get(this);
                if (c0012m != null) {
                    synchronized (c0012m) {
                        AbstractRunnableC0011L[] abstractRunnableC0011LArr = c0012m.f470a;
                        abstractRunnableC0011L = abstractRunnableC0011LArr != null ? abstractRunnableC0011LArr[0] : null;
                    }
                    if (abstractRunnableC0011L != null) {
                        long jNanoTime = abstractRunnableC0011L.f8s - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return LocationRequestCompat.PASSIVE_INTERVAL;
            }
        }
        return 0L;
    }

    @Override // p000A0.AbstractC0014O
    public void shutdown() {
        AbstractRunnableC0011L abstractRunnableC0011LM332b;
        AbstractC0054o0.f66a.set(null);
        f13y.set(this, 1);
        C0084j c0084j = AbstractC0069y.f88c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11w;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, c0084j)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof C0226l) {
                ((C0226l) obj).m322b();
                break;
            } else {
                if (obj == c0084j) {
                    break;
                }
                C0226l c0226l = new C0226l(8, true);
                c0226l.m321a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c0226l)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (mo17o() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C0012M c0012m = (C0012M) f12x.get(this);
            if (c0012m == null) {
                return;
            }
            synchronized (c0012m) {
                abstractRunnableC0011LM332b = C0235u.f469b.get(c0012m) > 0 ? c0012m.m332b(0) : null;
            }
            if (abstractRunnableC0011LM332b == null) {
                return;
            } else {
                mo24r(jNanoTime, abstractRunnableC0011LM332b);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void mo18u(Runnable runnable) {
        m19w();
        if (!m14A(runnable)) {
            RunnableC0070z.f97z.mo18u(runnable);
            return;
        }
        Thread threadMo21l = mo21l();
        if (Thread.currentThread() != threadMo21l) {
            LockSupport.unpark(threadMo21l);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m19w() {
        AbstractRunnableC0011L abstractRunnableC0011LM332b;
        C0012M c0012m = (C0012M) f12x.get(this);
        if (c0012m == null || C0235u.f469b.get(c0012m) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (c0012m) {
                try {
                    AbstractRunnableC0011L[] abstractRunnableC0011LArr = c0012m.f470a;
                    abstractRunnableC0011LM332b = null;
                    AbstractRunnableC0011L abstractRunnableC0011L = abstractRunnableC0011LArr != null ? abstractRunnableC0011LArr[0] : null;
                    if (abstractRunnableC0011L != null) {
                        abstractRunnableC0011LM332b = ((jNanoTime - abstractRunnableC0011L.f8s) > 0L ? 1 : ((jNanoTime - abstractRunnableC0011L.f8s) == 0L ? 0 : -1)) >= 0 ? m14A(abstractRunnableC0011L) : false ? c0012m.m332b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (abstractRunnableC0011LM332b != null);
    }
}
