package p014I0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p000A0.AbstractC0069y;
import p000A0.C0039h;
import p001B.C0084j;
import p043a.AbstractC0878a;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;

/* JADX INFO: renamed from: I0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0315d extends C0319h implements InterfaceC0312a {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f632g = AtomicReferenceFieldUpdater.newUpdater(C0315d.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile = AbstractC0316e.f633a;

    /* JADX INFO: renamed from: c */
    public final boolean m461c() {
        return Math.max(C0319h.f640f.get(this), 0) == 0;
    }

    /* JADX INFO: renamed from: d */
    public final Object m462d(InterfaceC6348c interfaceC6348c) {
        boolean zM463e = m463e(null);
        C6289k c6289k = C6289k.f24318a;
        if (!zM463e) {
            C0039h c0039hM108g = AbstractC0069y.m108g(AbstractC0878a.m1802m(interfaceC6348c));
            try {
                m466a(new C0314c(this, c0039hM108g));
                Object objM85q = c0039hM108g.m85q();
                EnumC6363a enumC6363a = EnumC6363a.f24419s;
                if (objM85q != enumC6363a) {
                    objM85q = c6289k;
                }
                if (objM85q == enumC6363a) {
                    return objM85q;
                }
            } catch (Throwable th) {
                c0039hM108g.m91y();
                throw th;
            }
        }
        return c6289k;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m463e(Object obj) {
        int i2;
        char c;
        char c2;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0319h.f640f;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 > 1) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1));
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f632g;
                if (i3 <= 0) {
                    if (obj != null) {
                        while (true) {
                            if (!m461c()) {
                                c2 = 0;
                                break;
                            }
                            Object obj2 = atomicReferenceFieldUpdater.get(this);
                            if (obj2 != AbstractC0316e.f633a) {
                                if (obj2 != obj) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 1;
                                break;
                            }
                        }
                        if (c2 == 1) {
                            c = 2;
                            break;
                        }
                        if (c2 != 2) {
                        }
                    }
                    c = 1;
                    break;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 - 1)) {
                    atomicReferenceFieldUpdater.set(this, obj);
                    c = 0;
                    break;
                }
            }
        }
        if (c == 0) {
            return true;
        }
        if (c == 1) {
            return false;
        }
        if (c != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    /* JADX INFO: renamed from: f */
    public final void m464f(Object obj) {
        while (m461c()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f632g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0084j c0084j = AbstractC0316e.f633a;
            if (obj2 != c0084j) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0084j)) {
                        m467b();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + AbstractC0069y.m107f(this) + "[isLocked=" + m461c() + ",owner=" + f632g.get(this) + ']';
    }
}
