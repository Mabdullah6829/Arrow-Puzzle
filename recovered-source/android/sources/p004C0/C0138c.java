package p004C0;

import androidx.core.location.LocationRequestCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6465x;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import p000A0.AbstractC0069y;
import p000A0.C0039h;
import p000A0.InterfaceC0035f;
import p000A0.InterfaceC0064t0;
import p001B.C0084j;
import p010F0.AbstractC0215a;
import p010F0.AbstractC0216b;
import p010F0.AbstractC0232r;
import p010F0.AbstractC0233s;
import p011H.AbstractC0243G;
import p011H.AbstractC0271e0;
import p043a.AbstractC0878a;
import p057d0.C6289k;
import p058e0.AbstractC6306n;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p078p0.InterfaceC6498l;
import p091y0.AbstractC6574d;

/* JADX INFO: renamed from: C0.c */
/* JADX INFO: loaded from: classes.dex */
public class C0138c implements InterfaceC0142g {
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;

    /* JADX INFO: renamed from: s */
    public final int f231s;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ AtomicLongFieldUpdater f224t = AtomicLongFieldUpdater.newUpdater(C0138c.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ AtomicLongFieldUpdater f225u = AtomicLongFieldUpdater.newUpdater(C0138c.class, "receivers$volatile");

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ AtomicLongFieldUpdater f226v = AtomicLongFieldUpdater.newUpdater(C0138c.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ AtomicLongFieldUpdater f227w = AtomicLongFieldUpdater.newUpdater(C0138c.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f228x = AtomicReferenceFieldUpdater.newUpdater(C0138c.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f229y = AtomicReferenceFieldUpdater.newUpdater(C0138c.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f230z = AtomicReferenceFieldUpdater.newUpdater(C0138c.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: A */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f222A = AtomicReferenceFieldUpdater.newUpdater(C0138c.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: B */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f223B = AtomicReferenceFieldUpdater.newUpdater(C0138c.class, Object.class, "closeHandler$volatile");

    public C0138c(int i2) {
        this.f231s = i2;
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0271e0.m397e(i2, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        C0146k c0146k = AbstractC0140e.f233a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : LocationRequestCompat.PASSIVE_INTERVAL : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f226v.get(this);
        C0146k c0146k2 = new C0146k(0L, null, this, 3);
        this.sendSegment$volatile = c0146k2;
        this.receiveSegment$volatile = c0146k2;
        if (m242x()) {
            c0146k2 = AbstractC0140e.f233a;
            AbstractC6452k.m12179c(c0146k2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = c0146k2;
        this._closeCause$volatile = AbstractC0140e.f251s;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m213C(Object obj) {
        if (!(obj instanceof InterfaceC0035f)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        AbstractC6452k.m12179c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC0035f interfaceC0035f = (InterfaceC0035f) obj;
        C0146k c0146k = AbstractC0140e.f233a;
        C0084j c0084jMo71f = interfaceC0035f.mo71f(C6289k.f24318a, null);
        if (c0084jMo71f == null) {
            return false;
        }
        interfaceC0035f.mo72j(c0084jMo71f);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static final C0146k m214c(C0138c c0138c, long j2, C0146k c0146k) {
        Object objM296b;
        C0138c c0138c2;
        C0146k c0146k2 = AbstractC0140e.f233a;
        C0139d c0139d = C0139d.f232s;
        loop0: while (true) {
            objM296b = AbstractC0215a.m296b(c0146k, j2, c0139d);
            if (!AbstractC0215a.m299e(objM296b)) {
                AbstractC0232r abstractC0232rM297c = AbstractC0215a.m297c(objM296b);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f228x;
                    AbstractC0232r abstractC0232r = (AbstractC0232r) atomicReferenceFieldUpdater.get(c0138c);
                    if (abstractC0232r.f466c >= abstractC0232rM297c.f466c) {
                        break loop0;
                    }
                    if (!abstractC0232rM297c.m330i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(c0138c, abstractC0232r, abstractC0232rM297c)) {
                            if (!abstractC0232r.m328e()) {
                                break loop0;
                            }
                            abstractC0232r.m310d();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(c0138c) == abstractC0232r);
                    if (abstractC0232rM297c.m328e()) {
                        abstractC0232rM297c.m310d();
                    }
                }
            } else {
                break;
            }
        }
        boolean zM299e = AbstractC0215a.m299e(objM296b);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f225u;
        if (zM299e) {
            c0138c.m240v();
            if (c0146k.f466c * ((long) AbstractC0140e.f234b) < atomicLongFieldUpdater.get(c0138c)) {
                c0146k.m307a();
                return null;
            }
        } else {
            C0146k c0146k3 = (C0146k) AbstractC0215a.m297c(objM296b);
            long j3 = c0146k3.f466c;
            if (j3 <= j2) {
                return c0146k3;
            }
            long j4 = ((long) AbstractC0140e.f234b) * j3;
            while (true) {
                long j5 = f224t.get(c0138c);
                long j6 = 1152921504606846975L & j5;
                if (j6 >= j4) {
                    c0138c2 = c0138c;
                    break;
                }
                c0138c2 = c0138c;
                if (f224t.compareAndSet(c0138c2, j5, (((long) ((int) (j5 >> 60))) << 60) + j6)) {
                    break;
                }
                c0138c = c0138c2;
            }
            if (j3 * ((long) AbstractC0140e.f234b) < atomicLongFieldUpdater.get(c0138c2)) {
                c0146k3.m307a();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final void m215f(C0138c c0138c, Object obj, C0039h c0039h) {
        c0039h.resumeWith(AbstractC0243G.m372j(c0138c.m237r()));
    }

    /* JADX INFO: renamed from: h */
    public static final int m216h(C0138c c0138c, C0146k c0146k, int i2, Object obj, long j2, Object obj2, boolean z) {
        c0146k.m250m(i2, obj);
        if (z) {
            return c0138c.m221E(c0146k, i2, obj, j2, obj2, z);
        }
        Object objM248k = c0146k.m248k(i2);
        if (objM248k == null) {
            if (c0138c.m229j(j2)) {
                if (c0146k.m247j(i2, null, AbstractC0140e.f236d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c0146k.m247j(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (objM248k instanceof InterfaceC0064t0) {
            c0146k.m250m(i2, null);
            if (c0138c.m219B(objM248k, obj)) {
                c0146k.m251n(i2, AbstractC0140e.f241i);
                return 0;
            }
            C0084j c0084j = AbstractC0140e.f243k;
            if (c0146k.f259f.getAndSet((i2 * 2) + 1, c0084j) == c0084j) {
                return 5;
            }
            c0146k.m249l(i2, true);
            return 5;
        }
        return c0138c.m221E(c0146k, i2, obj, j2, obj2, z);
    }

    /* JADX INFO: renamed from: t */
    public static void m217t(C0138c c0138c) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f227w;
        if ((atomicLongFieldUpdater.addAndGet(c0138c, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(c0138c) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m218A(InterfaceC0064t0 interfaceC0064t0, boolean z) {
        if (interfaceC0064t0 instanceof InterfaceC0035f) {
            ((InterfaceC6348c) interfaceC0064t0).resumeWith(AbstractC0243G.m372j(z ? m236q() : m237r()));
            return;
        }
        if (!(interfaceC0064t0 instanceof C0137b)) {
            throw new IllegalStateException(("Unexpected waiter: " + interfaceC0064t0).toString());
        }
        C0137b c0137b = (C0137b) interfaceC0064t0;
        C0039h c0039h = c0137b.f220t;
        AbstractC6452k.m12178b(c0039h);
        c0137b.f220t = null;
        c0137b.f219s = AbstractC0140e.f244l;
        Throwable thM235p = c0137b.f221u.m235p();
        if (thM235p == null) {
            c0039h.resumeWith(Boolean.FALSE);
        } else {
            c0039h.resumeWith(AbstractC0243G.m372j(thM235p));
        }
    }

    /* JADX INFO: renamed from: B */
    public final boolean m219B(Object obj, Object obj2) {
        if (!(obj instanceof C0137b)) {
            if (!(obj instanceof InterfaceC0035f)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            AbstractC6452k.m12179c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0035f interfaceC0035f = (InterfaceC0035f) obj;
            C0146k c0146k = AbstractC0140e.f233a;
            C0084j c0084jMo71f = interfaceC0035f.mo71f(obj2, null);
            if (c0084jMo71f == null) {
                return false;
            }
            interfaceC0035f.mo72j(c0084jMo71f);
            return true;
        }
        AbstractC6452k.m12179c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        C0137b c0137b = (C0137b) obj;
        C0039h c0039h = c0137b.f220t;
        AbstractC6452k.m12178b(c0039h);
        c0137b.f220t = null;
        c0137b.f219s = obj2;
        Boolean bool = Boolean.TRUE;
        C0146k c0146k2 = AbstractC0140e.f233a;
        C0084j c0084jMo71f2 = c0039h.mo71f(bool, null);
        if (c0084jMo71f2 == null) {
            return false;
        }
        c0039h.mo72j(c0084jMo71f2);
        return true;
    }

    /* JADX INFO: renamed from: D */
    public final Object m220D(C0146k c0146k, int i2, long j2, Object obj) {
        AtomicReferenceArray atomicReferenceArray = c0146k.f259f;
        Object objM248k = c0146k.m248k(i2);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f224t;
        if (objM248k == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return AbstractC0140e.f246n;
                }
                if (c0146k.m247j(i2, objM248k, obj)) {
                    m233n();
                    return AbstractC0140e.f245m;
                }
            }
        } else if (objM248k == AbstractC0140e.f236d && c0146k.m247j(i2, objM248k, AbstractC0140e.f241i)) {
            m233n();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            c0146k.m250m(i2, null);
            return obj2;
        }
        while (true) {
            Object objM248k2 = c0146k.m248k(i2);
            if (objM248k2 == null || objM248k2 == AbstractC0140e.f237e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (c0146k.m247j(i2, objM248k2, AbstractC0140e.f240h)) {
                        m233n();
                        return AbstractC0140e.f247o;
                    }
                } else {
                    if (obj == null) {
                        return AbstractC0140e.f246n;
                    }
                    if (c0146k.m247j(i2, objM248k2, obj)) {
                        m233n();
                        return AbstractC0140e.f245m;
                    }
                }
            } else if (objM248k2 != AbstractC0140e.f236d) {
                C0084j c0084j = AbstractC0140e.f242j;
                if (objM248k2 == c0084j) {
                    return AbstractC0140e.f247o;
                }
                if (objM248k2 == AbstractC0140e.f240h) {
                    return AbstractC0140e.f247o;
                }
                if (objM248k2 == AbstractC0140e.f244l) {
                    m233n();
                    return AbstractC0140e.f247o;
                }
                if (objM248k2 != AbstractC0140e.f239g && c0146k.m247j(i2, objM248k2, AbstractC0140e.f238f)) {
                    boolean z = objM248k2 instanceof C0155t;
                    if (z) {
                        objM248k2 = ((C0155t) objM248k2).f270a;
                    }
                    if (m213C(objM248k2)) {
                        c0146k.m251n(i2, AbstractC0140e.f241i);
                        m233n();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        c0146k.m250m(i2, null);
                        return obj3;
                    }
                    c0146k.m251n(i2, c0084j);
                    c0146k.m329h();
                    if (z) {
                        m233n();
                    }
                    return AbstractC0140e.f247o;
                }
            } else if (c0146k.m247j(i2, objM248k2, AbstractC0140e.f241i)) {
                m233n();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                c0146k.m250m(i2, null);
                return obj4;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final int m221E(C0146k c0146k, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object objM248k = c0146k.m248k(i2);
            if (objM248k == null) {
                if (!m229j(j2) || z) {
                    if (z) {
                        if (c0146k.m247j(i2, null, AbstractC0140e.f242j)) {
                            c0146k.m329h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (c0146k.m247j(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (c0146k.m247j(i2, null, AbstractC0140e.f236d)) {
                    break;
                }
            } else {
                if (objM248k != AbstractC0140e.f237e) {
                    C0084j c0084j = AbstractC0140e.f243k;
                    if (objM248k == c0084j) {
                        c0146k.m250m(i2, null);
                        return 5;
                    }
                    if (objM248k == AbstractC0140e.f240h) {
                        c0146k.m250m(i2, null);
                        return 5;
                    }
                    if (objM248k == AbstractC0140e.f244l) {
                        c0146k.m250m(i2, null);
                        m240v();
                        return 4;
                    }
                    c0146k.m250m(i2, null);
                    if (objM248k instanceof C0155t) {
                        objM248k = ((C0155t) objM248k).f270a;
                    }
                    if (m219B(objM248k, obj)) {
                        c0146k.m251n(i2, AbstractC0140e.f241i);
                        return 0;
                    }
                    if (c0146k.f259f.getAndSet((i2 * 2) + 1, c0084j) != c0084j) {
                        c0146k.m249l(i2, true);
                    }
                    return 5;
                }
                if (c0146k.m247j(i2, objM248k, AbstractC0140e.f236d)) {
                    break;
                }
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: F */
    public final void m222F(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        C0138c c0138c = this;
        if (c0138c.m242x()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f226v;
            if (atomicLongFieldUpdater.get(c0138c) > j2) {
                break;
            } else {
                c0138c = this;
            }
        }
        int i2 = AbstractC0140e.f235c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f227w;
            if (i3 < i2) {
                long j3 = atomicLongFieldUpdater.get(c0138c);
                if (j3 == (4611686018427387903L & atomicLongFieldUpdater2.get(c0138c)) && j3 == atomicLongFieldUpdater.get(c0138c)) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    long j4 = atomicLongFieldUpdater2.get(c0138c);
                    if (atomicLongFieldUpdater2.compareAndSet(c0138c, j4, (j4 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        c0138c = this;
                    }
                }
                while (true) {
                    long j5 = atomicLongFieldUpdater.get(c0138c);
                    long j6 = atomicLongFieldUpdater2.get(c0138c);
                    long j7 = j6 & 4611686018427387903L;
                    boolean z = (j6 & 4611686018427387904L) != 0;
                    if (j5 == j7 && j5 == atomicLongFieldUpdater.get(c0138c)) {
                        break;
                    }
                    if (z) {
                        c0138c = this;
                    } else {
                        c0138c = this;
                        atomicLongFieldUpdater2.compareAndSet(c0138c, j6, 4611686018427387904L + j7);
                    }
                }
                while (true) {
                    long j8 = atomicLongFieldUpdater2.get(c0138c);
                    if (atomicLongFieldUpdater2.compareAndSet(c0138c, j8, j8 & 4611686018427387903L)) {
                        return;
                    } else {
                        c0138c = this;
                    }
                }
            }
        }
    }

    @Override // p004C0.InterfaceC0153r
    /* JADX INFO: renamed from: a */
    public final Object mo223a(InterfaceC6348c interfaceC6348c) throws Throwable {
        C0146k c0146kM234o;
        C0138c c0138c = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f229y;
        C0146k c0146k = (C0146k) atomicReferenceFieldUpdater.get(c0138c);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f224t;
            if (c0138c.m239u(true, atomicLongFieldUpdater.get(c0138c))) {
                Throwable thM236q = m236q();
                int i2 = AbstractC0233s.f467a;
                throw thM236q;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f225u;
            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(c0138c);
            long j2 = AbstractC0140e.f234b;
            long j3 = andIncrement / j2;
            int i3 = (int) (andIncrement % j2);
            if (c0146k.f466c != j3) {
                C0146k c0146kM234o2 = c0138c.m234o(j3, c0146k);
                if (c0146kM234o2 == null) {
                    continue;
                } else {
                    c0146k = c0146kM234o2;
                }
            }
            Object objM220D = c0138c.m220D(c0146k, i3, andIncrement, null);
            C0084j c0084j = AbstractC0140e.f245m;
            if (objM220D == c0084j) {
                throw new IllegalStateException("unexpected");
            }
            C0084j c0084j2 = AbstractC0140e.f247o;
            if (objM220D != c0084j2) {
                if (objM220D != AbstractC0140e.f246n) {
                    c0146k.m307a();
                    return objM220D;
                }
                C0039h c0039hM108g = AbstractC0069y.m108g(AbstractC0878a.m1802m(interfaceC6348c));
                C0138c c0138c2 = this;
                try {
                    Object objM220D2 = c0138c2.m220D(c0146k, i3, andIncrement, c0039hM108g);
                    if (objM220D2 == c0084j) {
                        c0039hM108g.mo78a(c0146k, i3);
                    } else if (objM220D2 == c0084j2) {
                        if (andIncrement < c0138c2.m238s()) {
                            c0146k.m307a();
                        }
                        C0146k c0146k2 = (C0146k) atomicReferenceFieldUpdater.get(c0138c2);
                        while (!c0138c2.m239u(true, atomicLongFieldUpdater.get(c0138c2))) {
                            long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(c0138c2);
                            long j4 = AbstractC0140e.f234b;
                            long j5 = andIncrement2 / j4;
                            int i4 = (int) (andIncrement2 % j4);
                            if (c0146k2.f466c != j5) {
                                c0146kM234o = c0138c2.m234o(j5, c0146k2);
                                if (c0146kM234o == null) {
                                }
                            } else {
                                c0146kM234o = c0146k2;
                            }
                            Object objM220D3 = c0138c2.m220D(c0146kM234o, i4, andIncrement2, c0039hM108g);
                            if (objM220D3 == AbstractC0140e.f245m) {
                                c0039hM108g.mo78a(c0146kM234o, i4);
                            } else if (objM220D3 == AbstractC0140e.f247o) {
                                if (andIncrement2 < m238s()) {
                                    c0146kM234o.m307a();
                                }
                                c0138c2 = this;
                                c0146k2 = c0146kM234o;
                            } else {
                                if (objM220D3 == AbstractC0140e.f246n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                c0146kM234o.m307a();
                                c0039hM108g.m92z(objM220D3, null);
                            }
                        }
                        c0039hM108g.resumeWith(AbstractC0243G.m372j(c0138c2.m236q()));
                    } else {
                        c0146k.m307a();
                        c0039hM108g.m92z(objM220D2, null);
                    }
                    Object objM85q = c0039hM108g.m85q();
                    EnumC6363a enumC6363a = EnumC6363a.f24419s;
                    return objM85q;
                } catch (Throwable th) {
                    c0039hM108g.m91y();
                    throw th;
                }
            }
            if (andIncrement < m238s()) {
                c0146k.m307a();
            }
            c0138c = this;
        }
    }

    @Override // p004C0.InterfaceC0153r
    /* JADX INFO: renamed from: b */
    public final Object mo224b() {
        C0146k c0146k;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f225u;
        long j2 = atomicLongFieldUpdater.get(this);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f224t;
        long j3 = atomicLongFieldUpdater2.get(this);
        if (m239u(true, j3)) {
            return new C0143h(m235p());
        }
        long j4 = j3 & 1152921504606846975L;
        C0144i c0144i = C0145j.f256b;
        if (j2 >= j4) {
            return c0144i;
        }
        Object obj = AbstractC0140e.f243k;
        C0146k c0146k2 = (C0146k) f229y.get(this);
        while (!m239u(true, atomicLongFieldUpdater2.get(this))) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j5 = AbstractC0140e.f234b;
            long j6 = andIncrement / j5;
            int i2 = (int) (andIncrement % j5);
            if (c0146k2.f466c != j6) {
                C0146k c0146kM234o = m234o(j6, c0146k2);
                if (c0146kM234o == null) {
                    continue;
                } else {
                    c0146k = c0146kM234o;
                }
            } else {
                c0146k = c0146k2;
            }
            Object objM220D = m220D(c0146k, i2, andIncrement, obj);
            C0146k c0146k3 = c0146k;
            if (objM220D == AbstractC0140e.f245m) {
                InterfaceC0064t0 interfaceC0064t0 = obj instanceof InterfaceC0064t0 ? (InterfaceC0064t0) obj : null;
                if (interfaceC0064t0 != null) {
                    interfaceC0064t0.mo78a(c0146k3, i2);
                }
                m222F(andIncrement);
                c0146k3.m329h();
                return c0144i;
            }
            if (objM220D != AbstractC0140e.f247o) {
                if (objM220D == AbstractC0140e.f246n) {
                    throw new IllegalStateException("unexpected");
                }
                c0146k3.m307a();
                return objM220D;
            }
            if (andIncrement < m238s()) {
                c0146k3.m307a();
            }
            c0146k2 = c0146k3;
        }
        return new C0143h(m235p());
    }

    @Override // p004C0.InterfaceC0154s
    /* JADX INFO: renamed from: d */
    public final boolean mo225d(Throwable th) {
        return m230k(false, th);
    }

    @Override // p004C0.InterfaceC0153r
    /* JADX INFO: renamed from: e */
    public final void mo226e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        m230k(true, cancellationException);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x007d A[SYNTHETIC] */
    @Override // p004C0.InterfaceC0154s
    /* JADX INFO: renamed from: g */
    public Object mo227g(Object obj) {
        int iM216h;
        C6289k c6289k;
        InterfaceC0064t0 interfaceC0064t0;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f224t;
        long j2 = atomicLongFieldUpdater.get(this);
        boolean z = false;
        long j3 = 1152921504606846975L;
        boolean z2 = m239u(false, j2) ? false : !m229j(j2 & 1152921504606846975L);
        C0144i c0144i = C0145j.f256b;
        if (z2) {
            return c0144i;
        }
        Object obj2 = AbstractC0140e.f242j;
        C0146k c0146k = (C0146k) f228x.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = andIncrement & j3;
            boolean zM239u = m239u(z, andIncrement);
            int i2 = AbstractC0140e.f234b;
            long j5 = i2;
            long j6 = j4 / j5;
            int i3 = (int) (j4 % j5);
            if (c0146k.f466c == j6) {
                iM216h = m216h(this, c0146k, i3, obj, j4, obj2, zM239u);
                c6289k = C6289k.f24318a;
                if (iM216h != 0) {
                    c0146k.m307a();
                    return c6289k;
                }
                if (iM216h != 1) {
                    return c6289k;
                }
                if (iM216h != 2) {
                    if (zM239u) {
                        c0146k.m329h();
                        return new C0143h(m237r());
                    }
                    if (obj2 instanceof InterfaceC0064t0) {
                        interfaceC0064t0 = (InterfaceC0064t0) obj2;
                    } else {
                        interfaceC0064t0 = null;
                    }
                    if (interfaceC0064t0 != null) {
                        interfaceC0064t0.mo78a(c0146k, i3 + i2);
                    }
                    c0146k.m329h();
                    return c0144i;
                }
                if (iM216h != 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (iM216h != 4) {
                    if (j4 < f225u.get(this)) {
                        c0146k.m307a();
                    }
                    return new C0143h(m237r());
                }
                if (iM216h == 5) {
                    c0146k.m307a();
                }
                z = false;
            } else {
                C0146k c0146kM214c = m214c(this, j6, c0146k);
                if (c0146kM214c != null) {
                    c0146k = c0146kM214c;
                    iM216h = m216h(this, c0146k, i3, obj, j4, obj2, zM239u);
                    c6289k = C6289k.f24318a;
                    if (iM216h != 0) {
                        c0146k.m307a();
                        return c6289k;
                    }
                    if (iM216h != 1) {
                        return c6289k;
                    }
                    if (iM216h != 2) {
                        if (zM239u) {
                            c0146k.m329h();
                            return new C0143h(m237r());
                        }
                        if (obj2 instanceof InterfaceC0064t0) {
                            interfaceC0064t0 = (InterfaceC0064t0) obj2;
                        } else {
                            interfaceC0064t0 = null;
                        }
                        if (interfaceC0064t0 != null) {
                            interfaceC0064t0.mo78a(c0146k, i3 + i2);
                        }
                        c0146k.m329h();
                        return c0144i;
                    }
                    if (iM216h != 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iM216h != 4) {
                        if (j4 < f225u.get(this)) {
                            c0146k.m307a();
                        }
                        return new C0143h(m237r());
                    }
                    if (iM216h == 5) {
                        c0146k.m307a();
                    }
                    z = false;
                } else {
                    if (zM239u) {
                        return new C0143h(m237r());
                    }
                    z = false;
                }
            }
            j3 = 1152921504606846975L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:92:0x0170  */
    /* JADX WARN: Code duplicated, block: B:94:0x0173 A[RETURN] */
    @Override // p004C0.InterfaceC0154s
    /* JADX INFO: renamed from: i */
    public Object mo228i(InterfaceC6348c interfaceC6348c, Object obj) throws Throwable {
        C6289k c6289k;
        Object objM85q;
        EnumC6363a enumC6363a;
        Object obj2;
        C0138c c0138c;
        C0146k c0146k;
        boolean z;
        C0138c c0138c2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f228x;
        C0146k c0146k2 = (C0146k) atomicReferenceFieldUpdater.get(c0138c2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f224t;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(c0138c2);
            long j2 = andIncrement & 1152921504606846975L;
            boolean zM239u = c0138c2.m239u(false, andIncrement);
            int i2 = AbstractC0140e.f234b;
            long j3 = i2;
            long j4 = j2 / j3;
            int i3 = (int) (j2 % j3);
            long j5 = c0146k2.f466c;
            c6289k = C6289k.f24318a;
            if (j5 != j4) {
                C0146k c0146kM214c = m214c(c0138c2, j4, c0146k2);
                if (c0146kM214c != null) {
                    c0146k2 = c0146kM214c;
                } else if (zM239u) {
                    Object objM244z = m244z(interfaceC6348c, obj);
                    if (objM244z != EnumC6363a.f24419s) {
                        break;
                    }
                    return objM244z;
                }
            }
            int iM216h = m216h(c0138c2, c0146k2, i3, obj, j2, null, zM239u);
            if (iM216h == 0) {
                c0146k2.m307a();
                return c6289k;
            }
            if (iM216h == 1) {
                break;
            }
            if (iM216h != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f225u;
                if (iM216h == 3) {
                    C0039h c0039hM108g = AbstractC0069y.m108g(AbstractC0878a.m1802m(interfaceC6348c));
                    Object obj3 = obj;
                    try {
                        int iM216h2 = m216h(c0138c2, c0146k2, i3, obj3, j2, c0039hM108g, false);
                        try {
                            if (iM216h2 != 0) {
                                if (iM216h2 == 1) {
                                    c0039hM108g.resumeWith(c6289k);
                                } else if (iM216h2 != 2) {
                                    if (iM216h2 != 4) {
                                        String str = "unexpected";
                                        if (iM216h2 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        c0146k2.m307a();
                                        C0146k c0146k3 = (C0146k) atomicReferenceFieldUpdater.get(c0138c2);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(c0138c2);
                                            long j6 = andIncrement2 & 1152921504606846975L;
                                            boolean zM239u2 = c0138c2.m239u(false, andIncrement2);
                                            int i4 = AbstractC0140e.f234b;
                                            atomicLongFieldUpdater = atomicLongFieldUpdater;
                                            long j7 = i4;
                                            str = str;
                                            long j8 = j6 / j7;
                                            int i5 = (int) (j6 % j7);
                                            atomicLongFieldUpdater2 = atomicLongFieldUpdater2;
                                            if (c0146k3.f466c != j8) {
                                                C0146k c0146kM214c2 = m214c(c0138c2, j8, c0146k3);
                                                if (c0146kM214c2 != null) {
                                                    z = zM239u2;
                                                    c0146k = c0146kM214c2;
                                                } else if (zM239u2) {
                                                    m215f(c0138c2, obj3, c0039hM108g);
                                                    break;
                                                }
                                            } else {
                                                c0146k = c0146k3;
                                                z = zM239u2;
                                            }
                                            int iM216h3 = m216h(c0138c2, c0146k, i5, obj3, j6, c0039hM108g, z);
                                            Object obj4 = obj3;
                                            c0138c = c0138c2;
                                            C0146k c0146k4 = c0146k;
                                            obj2 = obj4;
                                            if (iM216h3 == 0) {
                                                c0146k4.m307a();
                                            } else if (iM216h3 != 1) {
                                                if (iM216h3 == 2) {
                                                    if (!z) {
                                                        c0039hM108g.mo78a(c0146k4, i5 + i4);
                                                        break;
                                                    }
                                                    c0146k4.m329h();
                                                } else {
                                                    if (iM216h3 == 3) {
                                                        throw new IllegalStateException(str);
                                                    }
                                                    if (iM216h3 != 4) {
                                                        if (iM216h3 == 5) {
                                                            c0146k4.m307a();
                                                        }
                                                        c0146k3 = c0146k4;
                                                        c0138c2 = c0138c;
                                                        obj3 = obj2;
                                                    } else if (j6 < atomicLongFieldUpdater2.get(c0138c)) {
                                                        c0146k4.m307a();
                                                    }
                                                }
                                            }
                                        }
                                        c0039hM108g.m91y();
                                        throw th;
                                    }
                                    obj2 = obj3;
                                    c0138c = c0138c2;
                                    if (j2 < atomicLongFieldUpdater2.get(c0138c)) {
                                        c0146k2.m307a();
                                    }
                                    m215f(c0138c, obj2, c0039hM108g);
                                    break;
                                } else {
                                    c0039hM108g.mo78a(c0146k2, i3 + i2);
                                }
                                objM85q = c0039hM108g.m85q();
                                enumC6363a = EnumC6363a.f24419s;
                                if (objM85q != enumC6363a) {
                                    objM85q = c6289k;
                                }
                                if (objM85q == enumC6363a) {
                                    return objM85q;
                                }
                            } else {
                                c0146k2.m307a();
                            }
                            c0039hM108g.resumeWith(c6289k);
                            objM85q = c0039hM108g.m85q();
                            enumC6363a = EnumC6363a.f24419s;
                            if (objM85q != enumC6363a) {
                                objM85q = c6289k;
                            }
                            if (objM85q == enumC6363a) {
                                return objM85q;
                            }
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    if (iM216h == 4) {
                        if (j2 < atomicLongFieldUpdater2.get(c0138c2)) {
                            c0146k2.m307a();
                        }
                        Object objM244z2 = m244z(interfaceC6348c, obj);
                        if (objM244z2 != EnumC6363a.f24419s) {
                            break;
                        }
                        return objM244z2;
                    }
                    if (iM216h == 5) {
                        c0146k2.m307a();
                    }
                }
            } else if (zM239u) {
                c0146k2.m329h();
                Object objM244z3 = m244z(interfaceC6348c, obj);
                if (objM244z3 == EnumC6363a.f24419s) {
                    return objM244z3;
                }
            }
            return c6289k;
        }
        return c6289k;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m229j(long j2) {
        return j2 < f226v.get(this) || j2 < f225u.get(this) + ((long) this.f231s);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m230k(boolean z, Throwable th) {
        C0138c c0138c;
        boolean z2;
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f224t;
        if (!z) {
            c0138c = this;
            break;
        }
        do {
            j6 = atomicLongFieldUpdater.get(this);
            if (((int) (j6 >> 60)) != 0) {
                c0138c = this;
                break;
            }
            C0146k c0146k = AbstractC0140e.f233a;
            c0138c = this;
        } while (!atomicLongFieldUpdater.compareAndSet(c0138c, j6, (j6 & 1152921504606846975L) + (((long) 1) << 60)));
        C0084j c0084j = AbstractC0140e.f251s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f222A;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c0084j, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != c0084j) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                j5 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(c0138c, j5, (((long) 3) << 60) + (j5 & 1152921504606846975L)));
        } else {
            do {
                j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 >> 60);
                if (i2 == 0) {
                    j3 = j2 & 1152921504606846975L;
                    j4 = 2;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = j2 & 1152921504606846975L;
                    j4 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(c0138c, j2, (j4 << 60) + j3));
        }
        m240v();
        if (z2) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f223B;
                obj = atomicReferenceFieldUpdater2.get(this);
                C0084j c0084j2 = obj == null ? AbstractC0140e.f249q : AbstractC0140e.f250r;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, c0084j2)) {
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
            if (obj != null) {
                AbstractC6465x.m12191a(1, obj);
                ((InterfaceC6498l) obj).invoke(m235p());
                return z2;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: l */
    public final C0146k m231l(long j2) {
        Object objM300f;
        long j3;
        Object obj = f230z.get(this);
        C0146k c0146k = (C0146k) f228x.get(this);
        if (c0146k.f466c > ((C0146k) obj).f466c) {
            obj = c0146k;
        }
        C0146k c0146k2 = (C0146k) f229y.get(this);
        if (c0146k2.f466c > ((C0146k) obj).f466c) {
            obj = c0146k2;
        }
        AbstractC0216b abstractC0216b = (AbstractC0216b) obj;
        loop0: while (true) {
            abstractC0216b.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC0216b.f430a;
            Object obj2 = atomicReferenceFieldUpdater.get(abstractC0216b);
            C0084j c0084j = AbstractC0215a.f423a;
            objM300f = null;
            if (obj2 == c0084j) {
                break;
            }
            AbstractC0216b abstractC0216b2 = (AbstractC0216b) obj2;
            if (abstractC0216b2 == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(abstractC0216b, null, c0084j)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(abstractC0216b) == null);
            } else {
                abstractC0216b = abstractC0216b2;
            }
        }
        C0146k c0146k3 = (C0146k) abstractC0216b;
        if (mo241w()) {
            C0146k c0146k4 = c0146k3;
            loop2: while (true) {
                int i2 = AbstractC0140e.f234b - 1;
                while (true) {
                    if (-1 < i2) {
                        j3 = (c0146k4.f466c * ((long) AbstractC0140e.f234b)) + ((long) i2);
                        if (j3 >= f225u.get(this)) {
                            while (true) {
                                Object objM248k = c0146k4.m248k(i2);
                                if (objM248k != null && objM248k != AbstractC0140e.f237e) {
                                    if (objM248k != AbstractC0140e.f236d) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (c0146k4.m247j(i2, objM248k, AbstractC0140e.f244l)) {
                                    c0146k4.m329h();
                                    break;
                                }
                            }
                            i2--;
                        }
                    } else {
                        c0146k4 = (C0146k) ((AbstractC0216b) AbstractC0216b.f431b.get(c0146k4));
                        if (c0146k4 == null) {
                        }
                    }
                    j3 = -1;
                    break;
                }
            }
            if (j3 != -1) {
                m232m(j3);
            }
        }
        loop5: for (C0146k c0146k5 = c0146k3; c0146k5 != null; c0146k5 = (C0146k) ((AbstractC0216b) AbstractC0216b.f431b.get(c0146k5))) {
            for (int i3 = AbstractC0140e.f234b - 1; -1 < i3; i3--) {
                if ((c0146k5.f466c * ((long) AbstractC0140e.f234b)) + ((long) i3) < j2) {
                    break loop5;
                }
                while (true) {
                    Object objM248k2 = c0146k5.m248k(i3);
                    if (objM248k2 != null && objM248k2 != AbstractC0140e.f237e) {
                        if (!(objM248k2 instanceof C0155t)) {
                            if (!(objM248k2 instanceof InterfaceC0064t0)) {
                                break;
                            }
                            if (c0146k5.m247j(i3, objM248k2, AbstractC0140e.f244l)) {
                                objM300f = AbstractC0215a.m300f(objM300f, objM248k2);
                                c0146k5.m249l(i3, true);
                                break;
                            }
                        } else {
                            if (c0146k5.m247j(i3, objM248k2, AbstractC0140e.f244l)) {
                                objM300f = AbstractC0215a.m300f(objM300f, ((C0155t) objM248k2).f270a);
                                c0146k5.m249l(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (c0146k5.m247j(i3, objM248k2, AbstractC0140e.f244l)) {
                            c0146k5.m329h();
                            break;
                        }
                    }
                }
            }
        }
        if (objM300f != null) {
            if (!(objM300f instanceof ArrayList)) {
                m218A((InterfaceC0064t0) objM300f, true);
                return c0146k3;
            }
            ArrayList arrayList = (ArrayList) objM300f;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                m218A((InterfaceC0064t0) arrayList.get(size), true);
            }
        }
        return c0146k3;
    }

    /* JADX INFO: renamed from: m */
    public final void m232m(long j2) {
        C0146k c0146k = (C0146k) f229y.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f225u;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(((long) this.f231s) + j3, f226v.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, 1 + j3)) {
                long j4 = AbstractC0140e.f234b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (c0146k.f466c != j5) {
                    C0146k c0146kM234o = m234o(j5, c0146k);
                    if (c0146kM234o != null) {
                        c0146k = c0146kM234o;
                    }
                }
                C0146k c0146k2 = c0146k;
                if (m220D(c0146k2, i2, j3, null) != AbstractC0140e.f247o || j3 < m238s()) {
                    c0146k2.m307a();
                }
                c0146k = c0146k2;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m233n() {
        Object objM296b;
        if (m242x()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f230z;
        C0146k c0146k = (C0146k) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = f226v.getAndIncrement(this);
            long j2 = andIncrement / ((long) AbstractC0140e.f234b);
            if (m238s() <= andIncrement) {
                if (c0146k.f466c < j2 && c0146k.m308b() != null) {
                    m243y(j2, c0146k);
                }
                m217t(this);
                return;
            }
            if (c0146k.f466c != j2) {
                C0139d c0139d = C0139d.f232s;
                while (true) {
                    objM296b = AbstractC0215a.m296b(c0146k, j2, c0139d);
                    if (!AbstractC0215a.m299e(objM296b)) {
                        AbstractC0232r abstractC0232rM297c = AbstractC0215a.m297c(objM296b);
                        while (true) {
                            AbstractC0232r abstractC0232r = (AbstractC0232r) atomicReferenceFieldUpdater.get(this);
                            if (abstractC0232r.f466c >= abstractC0232rM297c.f466c) {
                                break;
                            }
                            if (!abstractC0232rM297c.m330i()) {
                                break;
                            }
                            do {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC0232r, abstractC0232rM297c)) {
                                    if (!abstractC0232r.m328e()) {
                                        break;
                                    }
                                    abstractC0232r.m310d();
                                    break;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == abstractC0232r);
                            if (abstractC0232rM297c.m328e()) {
                                abstractC0232rM297c.m310d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                C0146k c0146k2 = null;
                if (AbstractC0215a.m299e(objM296b)) {
                    m240v();
                    m243y(j2, c0146k);
                    m217t(this);
                } else {
                    C0146k c0146k3 = (C0146k) AbstractC0215a.m297c(objM296b);
                    long j3 = c0146k3.f466c;
                    if (j3 > j2) {
                        long j4 = j3 * ((long) AbstractC0140e.f234b);
                        if (f226v.compareAndSet(this, 1 + andIncrement, j4)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f227w;
                            if ((atomicLongFieldUpdater.addAndGet(this, j4 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            m217t(this);
                        }
                    } else {
                        c0146k2 = c0146k3;
                    }
                }
                if (c0146k2 == null) {
                    continue;
                } else {
                    c0146k = c0146k2;
                }
            }
            int i2 = (int) (andIncrement % ((long) AbstractC0140e.f234b));
            Object objM248k = c0146k.m248k(i2);
            boolean z = objM248k instanceof InterfaceC0064t0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f225u;
            if (!z || andIncrement < atomicLongFieldUpdater2.get(this) || !c0146k.m247j(i2, objM248k, AbstractC0140e.f239g)) {
                while (true) {
                    Object objM248k2 = c0146k.m248k(i2);
                    if (objM248k2 instanceof InterfaceC0064t0) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (c0146k.m247j(i2, objM248k2, new C0155t((InterfaceC0064t0) objM248k2))) {
                                m217t(this);
                                return;
                            }
                        } else if (c0146k.m247j(i2, objM248k2, AbstractC0140e.f239g)) {
                            if (!m213C(objM248k2)) {
                                c0146k.m251n(i2, AbstractC0140e.f242j);
                                c0146k.m329h();
                                break;
                            } else {
                                c0146k.m251n(i2, AbstractC0140e.f236d);
                                m217t(this);
                                return;
                            }
                        }
                    } else {
                        if (objM248k2 == AbstractC0140e.f242j) {
                            break;
                        }
                        if (objM248k2 == null) {
                            if (c0146k.m247j(i2, objM248k2, AbstractC0140e.f237e)) {
                                m217t(this);
                                return;
                            }
                        } else if (objM248k2 == AbstractC0140e.f236d || objM248k2 == AbstractC0140e.f240h || objM248k2 == AbstractC0140e.f241i || objM248k2 == AbstractC0140e.f243k || objM248k2 == AbstractC0140e.f244l) {
                            m217t(this);
                            return;
                        } else if (objM248k2 != AbstractC0140e.f238f) {
                            throw new IllegalStateException(("Unexpected cell state: " + objM248k2).toString());
                        }
                    }
                }
                m217t(this);
            } else if (m213C(objM248k)) {
                c0146k.m251n(i2, AbstractC0140e.f236d);
                m217t(this);
                return;
            } else {
                c0146k.m251n(i2, AbstractC0140e.f242j);
                c0146k.m329h();
                m217t(this);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final C0146k m234o(long j2, C0146k c0146k) {
        Object objM296b;
        long j3;
        C0146k c0146k2 = AbstractC0140e.f233a;
        C0139d c0139d = C0139d.f232s;
        loop0: while (true) {
            objM296b = AbstractC0215a.m296b(c0146k, j2, c0139d);
            if (!AbstractC0215a.m299e(objM296b)) {
                AbstractC0232r abstractC0232rM297c = AbstractC0215a.m297c(objM296b);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f229y;
                    AbstractC0232r abstractC0232r = (AbstractC0232r) atomicReferenceFieldUpdater.get(this);
                    if (abstractC0232r.f466c >= abstractC0232rM297c.f466c) {
                        break loop0;
                    }
                    if (!abstractC0232rM297c.m330i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC0232r, abstractC0232rM297c)) {
                            if (!abstractC0232r.m328e()) {
                                break loop0;
                            }
                            abstractC0232r.m310d();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == abstractC0232r);
                    if (abstractC0232rM297c.m328e()) {
                        abstractC0232rM297c.m310d();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC0215a.m299e(objM296b)) {
            m240v();
            if (c0146k.f466c * ((long) AbstractC0140e.f234b) < m238s()) {
                c0146k.m307a();
                return null;
            }
        } else {
            C0146k c0146k3 = (C0146k) AbstractC0215a.m297c(objM296b);
            long j4 = c0146k3.f466c;
            if (!m242x() && j2 <= f226v.get(this) / ((long) AbstractC0140e.f234b)) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f230z;
                    AbstractC0232r abstractC0232r2 = (AbstractC0232r) atomicReferenceFieldUpdater2.get(this);
                    if (abstractC0232r2.f466c >= j4 || !c0146k3.m330i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, abstractC0232r2, c0146k3)) {
                            if (!abstractC0232r2.m328e()) {
                                break loop3;
                            }
                            abstractC0232r2.m310d();
                            break loop3;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == abstractC0232r2);
                    if (c0146k3.m328e()) {
                        c0146k3.m310d();
                    }
                }
            }
            if (j4 <= j2) {
                return c0146k3;
            }
            long j5 = j4 * ((long) AbstractC0140e.f234b);
            do {
                j3 = f225u.get(this);
                if (j3 >= j5) {
                    break;
                }
            } while (!f225u.compareAndSet(this, j3, j5));
            if (j4 * ((long) AbstractC0140e.f234b) < m238s()) {
                c0146k3.m307a();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final Throwable m235p() {
        return (Throwable) f222A.get(this);
    }

    /* JADX INFO: renamed from: q */
    public final Throwable m236q() {
        Throwable thM235p = m235p();
        return thM235p == null ? new ClosedReceiveChannelException("Channel was closed") : thM235p;
    }

    /* JADX INFO: renamed from: r */
    public final Throwable m237r() {
        Throwable thM235p = m235p();
        return thM235p == null ? new ClosedSendChannelException("Channel was closed") : thM235p;
    }

    /* JADX INFO: renamed from: s */
    public final long m238s() {
        return f224t.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (f224t.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.f231s + ',');
        sb.append("data=[");
        int i3 = 0;
        boolean z = true;
        List listM12120r = AbstractC6306n.m12120r(f229y.get(this), f228x.get(this), f230z.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM12120r) {
            if (((C0146k) obj) != AbstractC0140e.f233a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j2 = ((C0146k) next).f466c;
            do {
                Object next2 = it.next();
                long j3 = ((C0146k) next2).f466c;
                if (j2 > j3) {
                    next = next2;
                    j2 = j3;
                }
            } while (it.hasNext());
        }
        C0146k c0146k = (C0146k) next;
        long j4 = f225u.get(this);
        long jM238s = m238s();
        loop2: while (true) {
            int i4 = AbstractC0140e.f234b;
            int i5 = i3;
            while (i5 < i4) {
                long j5 = (c0146k.f466c * ((long) AbstractC0140e.f234b)) + ((long) i5);
                if (j5 >= jM238s && j5 >= j4) {
                    break loop2;
                }
                Object objM248k = c0146k.m248k(i5);
                boolean z2 = z;
                Object obj2 = c0146k.f259f.get(i5 * 2);
                if (objM248k instanceof InterfaceC0035f) {
                    string = (j5 >= j4 || j5 < jM238s) ? (j5 >= jM238s || j5 < j4) ? "cont" : "send" : "receive";
                } else if (objM248k instanceof C0155t) {
                    string = "EB(" + objM248k + ')';
                } else if (AbstractC6452k.m12177a(objM248k, AbstractC0140e.f238f) || AbstractC6452k.m12177a(objM248k, AbstractC0140e.f239g)) {
                    string = "resuming_sender";
                } else {
                    if (objM248k != null && !objM248k.equals(AbstractC0140e.f237e) && !objM248k.equals(AbstractC0140e.f241i) && !objM248k.equals(AbstractC0140e.f240h) && !objM248k.equals(AbstractC0140e.f243k) && !objM248k.equals(AbstractC0140e.f242j) && !objM248k.equals(AbstractC0140e.f244l)) {
                        string = objM248k.toString();
                    }
                    i5++;
                    z = z2;
                }
                if (obj2 != null) {
                    sb.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb.append(string + ',');
                }
                i5++;
                z = z2;
            }
            boolean z3 = z;
            c0146k = (C0146k) c0146k.m308b();
            if (c0146k == null) {
                break;
            }
            z = z3;
            i3 = 0;
        }
        if (sb.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb.charAt(AbstractC6574d.m12227w(sb)) == ',') {
            AbstractC6452k.m12180d(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m239u(boolean z, long j2) {
        int i2 = (int) (j2 >> 60);
        if (i2 != 0 && i2 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f225u;
            if (i2 == 2) {
                m231l(1152921504606846975L & j2);
                if (z) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f229y;
                        C0146k c0146kM234o = (C0146k) atomicReferenceFieldUpdater.get(this);
                        long j3 = atomicLongFieldUpdater.get(this);
                        if (m238s() <= j3) {
                            break;
                        }
                        long j4 = AbstractC0140e.f234b;
                        long j5 = j3 / j4;
                        if (c0146kM234o.f466c != j5 && (c0146kM234o = m234o(j5, c0146kM234o)) == null) {
                            if (((C0146k) atomicReferenceFieldUpdater.get(this)).f466c < j5) {
                                break;
                            }
                        } else {
                            c0146kM234o.m307a();
                            int i3 = (int) (j3 % j4);
                            while (true) {
                                Object objM248k = c0146kM234o.m248k(i3);
                                if (objM248k != null && objM248k != AbstractC0140e.f237e) {
                                    if (objM248k != AbstractC0140e.f236d && (objM248k == AbstractC0140e.f242j || objM248k == AbstractC0140e.f244l || objM248k == AbstractC0140e.f241i || objM248k == AbstractC0140e.f240h || (objM248k != AbstractC0140e.f239g && (objM248k == AbstractC0140e.f238f || j3 != atomicLongFieldUpdater.get(this))))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else if (c0146kM234o.m247j(i3, objM248k, AbstractC0140e.f240h)) {
                                    m233n();
                                    break;
                                }
                            }
                            f225u.compareAndSet(this, j3, j3 + 1);
                        }
                    }
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException(AbstractC0271e0.m396d(i2, "unexpected close status: ").toString());
                }
                C0146k c0146kM231l = m231l(1152921504606846975L & j2);
                Object objM300f = null;
                loop0: do {
                    for (int i4 = AbstractC0140e.f234b - 1; -1 < i4; i4--) {
                        long j6 = (c0146kM231l.f466c * ((long) AbstractC0140e.f234b)) + ((long) i4);
                        while (true) {
                            Object objM248k2 = c0146kM231l.m248k(i4);
                            if (objM248k2 == AbstractC0140e.f241i) {
                                break loop0;
                            }
                            if (objM248k2 != AbstractC0140e.f236d) {
                                if (objM248k2 != AbstractC0140e.f237e && objM248k2 != null) {
                                    if (!(objM248k2 instanceof InterfaceC0064t0) && !(objM248k2 instanceof C0155t)) {
                                        C0084j c0084j = AbstractC0140e.f239g;
                                        if (objM248k2 == c0084j || objM248k2 == AbstractC0140e.f238f) {
                                            break loop0;
                                        }
                                        if (objM248k2 != c0084j) {
                                            break;
                                        }
                                    } else {
                                        if (j6 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        InterfaceC0064t0 interfaceC0064t0 = objM248k2 instanceof C0155t ? ((C0155t) objM248k2).f270a : (InterfaceC0064t0) objM248k2;
                                        if (c0146kM231l.m247j(i4, objM248k2, AbstractC0140e.f244l)) {
                                            objM300f = AbstractC0215a.m300f(objM300f, interfaceC0064t0);
                                            c0146kM231l.m250m(i4, null);
                                            c0146kM231l.m329h();
                                            break;
                                        }
                                    }
                                } else {
                                    if (c0146kM231l.m247j(i4, objM248k2, AbstractC0140e.f244l)) {
                                        c0146kM231l.m329h();
                                        break;
                                    }
                                }
                            } else {
                                if (j6 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (c0146kM231l.m247j(i4, objM248k2, AbstractC0140e.f244l)) {
                                    c0146kM231l.m250m(i4, null);
                                    c0146kM231l.m329h();
                                    break;
                                }
                            }
                        }
                    }
                    c0146kM231l = (C0146k) ((AbstractC0216b) AbstractC0216b.f431b.get(c0146kM231l));
                } while (c0146kM231l != null);
                if (objM300f != null) {
                    if (objM300f instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objM300f;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            m218A((InterfaceC0064t0) arrayList.get(size), false);
                        }
                    } else {
                        m218A((InterfaceC0064t0) objM300f, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m240v() {
        return m239u(false, f224t.get(this));
    }

    /* JADX INFO: renamed from: w */
    public boolean mo241w() {
        return false;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m242x() {
        long j2 = f226v.get(this);
        return j2 == 0 || j2 == LocationRequestCompat.PASSIVE_INTERVAL;
    }

    /* JADX INFO: renamed from: y */
    public final void m243y(long j2, C0146k c0146k) {
        C0146k c0146k2;
        C0146k c0146k3;
        while (c0146k.f466c < j2 && (c0146k3 = (C0146k) c0146k.m308b()) != null) {
            c0146k = c0146k3;
        }
        while (true) {
            if (!c0146k.mo309c() || (c0146k2 = (C0146k) c0146k.m308b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f230z;
                    AbstractC0232r abstractC0232r = (AbstractC0232r) atomicReferenceFieldUpdater.get(this);
                    if (abstractC0232r.f466c >= c0146k.f466c) {
                        return;
                    }
                    if (!c0146k.m330i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC0232r, c0146k)) {
                            if (abstractC0232r.m328e()) {
                                abstractC0232r.m310d();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == abstractC0232r);
                    if (c0146k.m328e()) {
                        c0146k.m310d();
                    }
                }
            } else {
                c0146k = c0146k2;
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final Object m244z(InterfaceC6348c interfaceC6348c, Object obj) {
        C0039h c0039h = new C0039h(1, AbstractC0878a.m1802m(interfaceC6348c));
        c0039h.m86r();
        c0039h.resumeWith(AbstractC0243G.m372j(m237r()));
        Object objM85q = c0039h.m85q();
        return objM85q == EnumC6363a.f24419s ? objM85q : C6289k.f24318a;
    }
}
