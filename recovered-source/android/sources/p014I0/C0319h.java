package p014I0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p000A0.C0037g;
import p000A0.C0039h;
import p000A0.InterfaceC0035f;
import p001B.C0084j;
import p010F0.AbstractC0215a;
import p010F0.AbstractC0232r;
import p057d0.C6289k;

/* JADX INFO: renamed from: I0.h */
/* JADX INFO: loaded from: classes.dex */
public class C0319h {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f636b = AtomicReferenceFieldUpdater.newUpdater(C0319h.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicLongFieldUpdater f637c = AtomicLongFieldUpdater.newUpdater(C0319h.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f638d = AtomicReferenceFieldUpdater.newUpdater(C0319h.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicLongFieldUpdater f639e = AtomicLongFieldUpdater.newUpdater(C0319h.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f640f = AtomicIntegerFieldUpdater.newUpdater(C0319h.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a */
    public final C0037g f641a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public C0319h() {
        C0321j c0321j = new C0321j(0L, null, 2);
        this.head$volatile = c0321j;
        this.tail$volatile = c0321j;
        this._availablePermits$volatile = 1;
        this.f641a = new C0037g(this, 2);
    }

    /* JADX INFO: renamed from: a */
    public final void m466a(C0314c c0314c) {
        Object objM296b;
        C0321j c0321j;
        C0039h c0039h = c0314c.f630s;
        C0315d c0315d = c0314c.f631t;
        while (true) {
            int andDecrement = f640f.getAndDecrement(this);
            if (andDecrement <= 1) {
                C6289k c6289k = C6289k.f24318a;
                if (andDecrement > 0) {
                    C0315d.f632g.set(c0315d, null);
                    c0039h.m76A(c6289k, c0039h.f2u, new C0037g(new C0313b(c0315d, c0314c), 0));
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f638d;
                C0321j c0321j2 = (C0321j) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f639e.getAndIncrement(this);
                C0317f c0317f = C0317f.f634s;
                long j2 = andIncrement / ((long) AbstractC0320i.f647f);
                while (true) {
                    objM296b = AbstractC0215a.m296b(c0321j2, j2, c0317f);
                    if (AbstractC0215a.m299e(objM296b)) {
                        break;
                    }
                    AbstractC0232r abstractC0232rM297c = AbstractC0215a.m297c(objM296b);
                    while (true) {
                        AbstractC0232r abstractC0232r = (AbstractC0232r) atomicReferenceFieldUpdater.get(this);
                        c0321j = c0321j2;
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
                        c0321j2 = c0321j;
                    }
                    c0321j2 = c0321j;
                }
                C0321j c0321j3 = (C0321j) AbstractC0215a.m297c(objM296b);
                AtomicReferenceArray atomicReferenceArray = c0321j3.f648e;
                int i2 = (int) (andIncrement % ((long) AbstractC0320i.f647f));
                do {
                    if (atomicReferenceArray.compareAndSet(i2, null, c0314c)) {
                        c0314c.mo78a(c0321j3, i2);
                        return;
                    }
                } while (atomicReferenceArray.get(i2) == null);
                C0084j c0084j = AbstractC0320i.f643b;
                C0084j c0084j2 = AbstractC0320i.f644c;
                do {
                    if (atomicReferenceArray.compareAndSet(i2, c0084j, c0084j2)) {
                        C0315d.f632g.set(c0315d, null);
                        c0039h.m76A(c6289k, c0039h.f2u, new C0037g(new C0313b(c0315d, c0314c), 0));
                        return;
                    }
                } while (atomicReferenceArray.get(i2) == c0084j);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX INFO: renamed from: b */
    public final void m467b() {
        boolean z;
        int i2;
        Object objM296b;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f640f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z = true;
            if (andIncrement >= 1) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f636b;
            C0321j c0321j = (C0321j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f637c.getAndIncrement(this);
            long j2 = andIncrement2 / ((long) AbstractC0320i.f647f);
            C0318g c0318g = C0318g.f635s;
            while (true) {
                objM296b = AbstractC0215a.m296b(c0321j, j2, c0318g);
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
            C0321j c0321j2 = (C0321j) AbstractC0215a.m297c(objM296b);
            AtomicReferenceArray atomicReferenceArray = c0321j2.f648e;
            c0321j2.m307a();
            boolean z2 = false;
            if (c0321j2.f466c <= j2) {
                int i3 = (int) (andIncrement2 % ((long) AbstractC0320i.f647f));
                Object andSet = atomicReferenceArray.getAndSet(i3, AbstractC0320i.f643b);
                if (andSet == null) {
                    int i4 = AbstractC0320i.f642a;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= i4) {
                            C0084j c0084j = AbstractC0320i.f643b;
                            C0084j c0084j2 = AbstractC0320i.f645d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i3, c0084j, c0084j2)) {
                                    z2 = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i3) == c0084j);
                            z = true ^ z2;
                            break;
                        }
                        if (atomicReferenceArray.get(i3) == AbstractC0320i.f644c) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                } else if (andSet == AbstractC0320i.f646e) {
                    z = false;
                } else {
                    if (!(andSet instanceof InterfaceC0035f)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    InterfaceC0035f interfaceC0035f = (InterfaceC0035f) andSet;
                    C0084j c0084jMo71f = interfaceC0035f.mo71f(C6289k.f24318a, this.f641a);
                    if (c0084jMo71f != null) {
                        interfaceC0035f.mo72j(c0084jMo71f);
                    } else {
                        z = false;
                    }
                }
            } else {
                z = false;
            }
        } while (!z);
    }
}
