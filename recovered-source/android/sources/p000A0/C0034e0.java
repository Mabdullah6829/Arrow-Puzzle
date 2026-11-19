package p000A0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC6452k;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import p001B.C0084j;
import p010F0.C0221g;
import p010F0.C0223i;
import p037U0.AbstractC0846b;
import p043a.AbstractC0878a;
import p062g0.C6354i;
import p062g0.InterfaceC6351f;
import p062g0.InterfaceC6352g;
import p062g0.InterfaceC6353h;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: A0.e0 */
/* JADX INFO: loaded from: classes.dex */
public class C0034e0 implements InterfaceC0022X, InterfaceC0044j0 {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43s = AtomicReferenceFieldUpdater.newUpdater(C0034e0.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f44t = AtomicReferenceFieldUpdater.newUpdater(C0034e0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public C0034e0(boolean z) {
        this._state$volatile = z ? AbstractC0069y.f95j : AbstractC0069y.f94i;
    }

    /* JADX INFO: renamed from: G */
    public static C0047l m45G(C0223i c0223i) {
        while (c0223i.mo73h()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0223i.f448t;
            C0223i c0223iM314e = c0223i.m314e();
            if (c0223iM314e == null) {
                Object obj = atomicReferenceFieldUpdater.get(c0223i);
                while (true) {
                    c0223i = (C0223i) obj;
                    if (!c0223i.mo73h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c0223i);
                }
            } else {
                c0223i = c0223iM314e;
            }
        }
        while (true) {
            c0223i = c0223i.m316g();
            if (!c0223i.mo73h()) {
                if (c0223i instanceof C0047l) {
                    return (C0047l) c0223i;
                }
                if (c0223i instanceof C0038g0) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public static String m46N(Object obj) {
        if (!(obj instanceof C0032d0)) {
            if (obj instanceof InterfaceC0018T) {
                return ((InterfaceC0018T) obj).mo10c() ? "Active" : "New";
            }
            return obj instanceof C0055p ? "Cancelled" : "Completed";
        }
        C0032d0 c0032d0 = (C0032d0) obj;
        if (c0032d0.m43e()) {
            return "Cancelling";
        }
        return C0032d0.f37t.get(c0032d0) != 0 ? "Completing" : "Active";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [A0.a0, A0.l, F0.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [A0.I, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v8, types: [A0.g0, F0.i] */
    /* JADX INFO: renamed from: B */
    public final void m47B(InterfaceC0022X interfaceC0022X) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        int iM56M;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f44t;
        C0040h0 c0040h0 = C0040h0.f53s;
        if (interfaceC0022X == null) {
            atomicReferenceFieldUpdater2.set(this, c0040h0);
            return;
        }
        C0034e0 c0034e0 = (C0034e0) interfaceC0022X;
        do {
            atomicReferenceFieldUpdater = f43s;
            iM56M = c0034e0.m56M(atomicReferenceFieldUpdater.get(c0034e0));
            if (iM56M == 0) {
                break;
            }
        } while (iM56M != 1);
        ?? c0047l = new C0047l(this);
        c0047l.f27v = c0034e0;
        loop1: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(c0034e0);
            if (!(obj instanceof C0009J)) {
                Throwable thM42b = null;
                if (obj instanceof InterfaceC0018T) {
                    ?? Mo11d = ((InterfaceC0018T) obj).mo11d();
                    if (Mo11d != 0) {
                        if (!Mo11d.m313a(c0047l, 7)) {
                            boolean zM313a = Mo11d.m313a(c0047l, 3);
                            Object obj2 = atomicReferenceFieldUpdater.get(c0034e0);
                            if (obj2 instanceof C0032d0) {
                                thM42b = ((C0032d0) obj2).m42b();
                            } else {
                                C0055p c0055p = obj2 instanceof C0055p ? (C0055p) obj2 : null;
                                if (c0055p != null) {
                                    thM42b = c0055p.f68a;
                                }
                            }
                            c0047l.mo27k(thM42b);
                            if (!zM313a) {
                                break;
                            } else {
                                break;
                            }
                        }
                        break;
                    }
                    AbstractC6452k.m12179c(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    c0034e0.m55L((AbstractC0026a0) obj);
                } else {
                    Object obj3 = atomicReferenceFieldUpdater.get(c0034e0);
                    C0055p c0055p2 = obj3 instanceof C0055p ? (C0055p) obj3 : null;
                    c0047l.mo27k(c0055p2 != null ? c0055p2.f68a : null);
                }
                c0047l = c0040h0;
                break;
            }
            C0009J c0009j = (C0009J) obj;
            if (c0009j.f5s) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(c0034e0, obj, c0047l)) {
                        break loop1;
                    }
                } while (atomicReferenceFieldUpdater.get(c0034e0) == obj);
            } else {
                c0034e0.m54K(c0009j);
            }
        }
        atomicReferenceFieldUpdater2.set(this, c0047l);
        if (atomicReferenceFieldUpdater.get(this) instanceof InterfaceC0018T) {
            return;
        }
        c0047l.dispose();
        atomicReferenceFieldUpdater2.set(this, c0040h0);
    }

    /* JADX INFO: renamed from: C */
    public final InterfaceC0008I m48C(boolean z, AbstractC0026a0 abstractC0026a0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z2;
        boolean zM313a;
        abstractC0026a0.f27v = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f43s;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof C0009J;
            C0040h0 c0040h0 = C0040h0.f53s;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof InterfaceC0018T)) {
                    z2 = false;
                    break;
                }
                InterfaceC0018T interfaceC0018T = (InterfaceC0018T) obj;
                C0038g0 c0038g0Mo11d = interfaceC0018T.mo11d();
                if (c0038g0Mo11d == null) {
                    AbstractC6452k.m12179c(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    m55L((AbstractC0026a0) obj);
                } else {
                    if (abstractC0026a0.mo26j()) {
                        C0032d0 c0032d0 = interfaceC0018T instanceof C0032d0 ? (C0032d0) interfaceC0018T : null;
                        Throwable thM42b = c0032d0 != null ? c0032d0.m42b() : null;
                        if (thM42b == null) {
                            zM313a = c0038g0Mo11d.m313a(abstractC0026a0, 5);
                        } else if (z) {
                            abstractC0026a0.mo27k(thM42b);
                            return c0040h0;
                        }
                    } else {
                        zM313a = c0038g0Mo11d.m313a(abstractC0026a0, 1);
                    }
                    if (zM313a) {
                        break;
                    }
                }
            } else {
                C0009J c0009j = (C0009J) obj;
                if (c0009j.f5s) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC0026a0)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                } else {
                    m54K(c0009j);
                }
            }
            return c0040h0;
        }
        if (z2) {
            return abstractC0026a0;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0055p c0055p = obj2 instanceof C0055p ? (C0055p) obj2 : null;
            abstractC0026a0.mo27k(c0055p != null ? c0055p.f68a : null);
        }
        return c0040h0;
    }

    /* JADX INFO: renamed from: D */
    public boolean mo49D() {
        return this instanceof C0029c;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m50E(Object obj) {
        Object objM57O;
        do {
            objM57O = m57O(f43s.get(this), obj);
            if (objM57O == AbstractC0069y.f89d) {
                return false;
            }
            if (objM57O == AbstractC0069y.f90e) {
                return true;
            }
        } while (objM57O == AbstractC0069y.f91f);
        mo2k(objM57O);
        return true;
    }

    /* JADX INFO: renamed from: F */
    public final Object m51F(Object obj) {
        Object objM57O;
        do {
            objM57O = m57O(f43s.get(this), obj);
            if (objM57O == AbstractC0069y.f89d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0055p c0055p = obj instanceof C0055p ? (C0055p) obj : null;
                throw new IllegalStateException(str, c0055p != null ? c0055p.f68a : null);
            }
        } while (objM57O == AbstractC0069y.f91f);
        return objM57O;
    }

    /* JADX INFO: renamed from: H */
    public final void m52H(C0038g0 c0038g0, Throwable th) {
        c0038g0.m313a(new C0221g(4), 4);
        Object obj = C0223i.f447s.get(c0038g0);
        AbstractC6452k.m12179c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (C0223i c0223iM316g = (C0223i) obj; !c0223iM316g.equals(c0038g0); c0223iM316g = c0223iM316g.m316g()) {
            if ((c0223iM316g instanceof AbstractC0026a0) && ((AbstractC0026a0) c0223iM316g).mo26j()) {
                try {
                    ((AbstractC0026a0) c0223iM316g).mo27k(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        AbstractC0878a.m1796b(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + c0223iM316g + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo32A(completionHandlerException);
        }
        m62o(th);
    }

    /* JADX INFO: renamed from: K */
    public final void m54K(C0009J c0009j) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0038g0 c0038g0 = new C0038g0();
        Object c0017s = c0038g0;
        if (!c0009j.f5s) {
            c0017s = new C0017S(c0038g0);
        }
        do {
            atomicReferenceFieldUpdater = f43s;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c0009j, c0017s)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == c0009j);
    }

    /* JADX INFO: renamed from: L */
    public final void m55L(AbstractC0026a0 abstractC0026a0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0038g0 c0038g0 = new C0038g0();
        abstractC0026a0.getClass();
        C0223i.f448t.set(c0038g0, abstractC0026a0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0223i.f447s;
        atomicReferenceFieldUpdater2.set(c0038g0, abstractC0026a0);
        loop0: while (atomicReferenceFieldUpdater2.get(abstractC0026a0) == abstractC0026a0) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(abstractC0026a0, abstractC0026a0, c0038g0)) {
                    c0038g0.m315f(abstractC0026a0);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(abstractC0026a0) == abstractC0026a0);
        }
        C0223i c0223iM316g = abstractC0026a0.m316g();
        do {
            atomicReferenceFieldUpdater = f43s;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC0026a0, c0223iM316g)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC0026a0);
    }

    /* JADX INFO: renamed from: M */
    public final int m56M(Object obj) {
        boolean z = obj instanceof C0009J;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43s;
        if (z) {
            if (((C0009J) obj).f5s) {
                return 0;
            }
            C0009J c0009j = AbstractC0069y.f95j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0009j)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            mo53J();
            return 1;
        }
        if (!(obj instanceof C0017S)) {
            return 0;
        }
        C0038g0 c0038g0 = ((C0017S) obj).f19s;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0038g0)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        mo53J();
        return 1;
    }

    /* JADX INFO: renamed from: O */
    public final Object m57O(Object obj, Object obj2) {
        if (!(obj instanceof InterfaceC0018T)) {
            return AbstractC0069y.f89d;
        }
        if (((obj instanceof C0009J) || (obj instanceof AbstractC0026a0)) && !(obj instanceof C0047l) && !(obj2 instanceof C0055p)) {
            InterfaceC0018T interfaceC0018T = (InterfaceC0018T) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43s;
            Object c0019u = obj2 instanceof InterfaceC0018T ? new C0019U((InterfaceC0018T) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0018T, c0019u)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC0018T) {
                    return AbstractC0069y.f91f;
                }
            }
            mo33I(obj2);
            m64r(interfaceC0018T, obj2);
            return obj2;
        }
        InterfaceC0018T interfaceC0018T2 = (InterfaceC0018T) obj;
        C0038g0 c0038g0M69y = m69y(interfaceC0018T2);
        if (c0038g0M69y == null) {
            return AbstractC0069y.f91f;
        }
        C0032d0 c0032d0 = interfaceC0018T2 instanceof C0032d0 ? (C0032d0) interfaceC0018T2 : null;
        if (c0032d0 == null) {
            c0032d0 = new C0032d0(c0038g0M69y, null);
        }
        synchronized (c0032d0) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0032d0.f37t;
            if (atomicIntegerFieldUpdater.get(c0032d0) != 0) {
                return AbstractC0069y.f89d;
            }
            atomicIntegerFieldUpdater.set(c0032d0, 1);
            if (c0032d0 != interfaceC0018T2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f43s;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC0018T2, c0032d0)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC0018T2) {
                        return AbstractC0069y.f91f;
                    }
                }
            }
            boolean zM43e = c0032d0.m43e();
            C0055p c0055p = obj2 instanceof C0055p ? (C0055p) obj2 : null;
            if (c0055p != null) {
                c0032d0.m41a(c0055p.f68a);
            }
            Throwable thM42b = zM43e ? null : c0032d0.m42b();
            if (thM42b != null) {
                m52H(c0038g0M69y, thM42b);
            }
            C0047l c0047lM45G = m45G(c0038g0M69y);
            if (c0047lM45G != null && m58P(c0032d0, c0047lM45G, obj2)) {
                return AbstractC0069y.f90e;
            }
            c0038g0M69y.m313a(new C0221g(2), 2);
            C0047l c0047lM45G2 = m45G(c0038g0M69y);
            return (c0047lM45G2 == null || !m58P(c0032d0, c0047lM45G2, obj2)) ? m66t(c0032d0, obj2) : AbstractC0069y.f90e;
        }
    }

    /* JADX INFO: renamed from: P */
    public final boolean m58P(C0032d0 c0032d0, C0047l c0047l, Object obj) {
        while (AbstractC0069y.m110i(c0047l.f60w, false, new C0030c0(this, c0032d0, c0047l, obj)) == C0040h0.f53s) {
            c0047l = m45G(c0047l);
            if (c0047l == null) {
                return false;
            }
        }
        return true;
    }

    @Override // p000A0.InterfaceC0022X
    /* JADX INFO: renamed from: c */
    public boolean mo28c() {
        Object obj = f43s.get(this);
        return (obj instanceof InterfaceC0018T) && ((InterfaceC0018T) obj).mo10c();
    }

    @Override // p000A0.InterfaceC0022X
    /* JADX INFO: renamed from: e */
    public void mo29e(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo37p(), null, this);
        }
        mo61n(cancellationException);
    }

    @Override // p062g0.InterfaceC6353h
    public final Object fold(Object obj, InterfaceC6502p interfaceC6502p) {
        return interfaceC6502p.invoke(obj, this);
    }

    @Override // p062g0.InterfaceC6353h
    public final InterfaceC6351f get(InterfaceC6352g interfaceC6352g) {
        return AbstractC0846b.m1749h(this, interfaceC6352g);
    }

    @Override // p062g0.InterfaceC6351f
    public final InterfaceC6352g getKey() {
        return C0065u.f80t;
    }

    /* JADX INFO: renamed from: h */
    public Object m59h() throws Throwable {
        Object obj = f43s.get(this);
        if (obj instanceof InterfaceC0018T) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof C0055p) {
            throw ((C0055p) obj).f68a;
        }
        return AbstractC0069y.m117p(obj);
    }

    /* JADX INFO: renamed from: l */
    public void mo3l(Object obj) {
        mo2k(obj);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[PHI: r0
  0x0041: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0008, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067 A[Catch: all -> 0x006d, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x0052, B:29:0x0067, B:34:0x006f, B:36:0x0078, B:37:0x007c), top: B:81:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x006f A[Catch: all -> 0x006d, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x0052, B:29:0x0067, B:34:0x006f, B:36:0x0078, B:37:0x007c), top: B:81:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0078 A[Catch: all -> 0x006d, TryCatch #0 {, blocks: (B:24:0x0052, B:29:0x0067, B:34:0x006f, B:36:0x0078, B:37:0x007c), top: B:81:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x008b  */
    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
    /* JADX WARN: Code duplicated, block: B:46:0x009b  */
    /* JADX WARN: Code duplicated, block: B:48:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00db  */
    /* JADX WARN: Code duplicated, block: B:78:0x010b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x010c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[LOOP:2: B:56:0x00ba->B:98:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0045, please report this as an issue */
    /* JADX INFO: renamed from: m */
    public final boolean m60m(Object obj) {
        Throwable thM65s;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2;
        C0032d0 c0032d0;
        boolean z;
        Throwable thM42b;
        C0084j c0084j;
        InterfaceC0018T interfaceC0018T;
        C0038g0 c0038g0M69y;
        C0032d0 c0032d1;
        Object objM57O;
        Object objM57O2 = AbstractC0069y.f89d;
        if (mo31x()) {
            do {
                Object obj3 = f43s.get(this);
                if (obj3 instanceof InterfaceC0018T) {
                    if (obj3 instanceof C0032d0) {
                        C0032d0 c0032d2 = (C0032d0) obj3;
                        c0032d2.getClass();
                        if (C0032d0.f37t.get(c0032d2) != 0) {
                        }
                    }
                    objM57O2 = m57O(obj3, new C0055p(false, m65s(obj)));
                }
                objM57O2 = AbstractC0069y.f89d;
                break;
            } while (objM57O2 == AbstractC0069y.f91f);
            if (objM57O2 != AbstractC0069y.f90e) {
                if (objM57O2 == AbstractC0069y.f89d) {
                    thM65s = null;
                    loop1: while (true) {
                        atomicReferenceFieldUpdater = f43s;
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 instanceof C0032d0) {
                            synchronized (obj2) {
                                c0032d0 = (C0032d0) obj2;
                                c0032d0.getClass();
                                if (C0032d0.f39v.get(c0032d0) == AbstractC0069y.f93h) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    c0084j = AbstractC0069y.f92g;
                                } else {
                                    boolean zM43e = ((C0032d0) obj2).m43e();
                                    if (thM65s == null) {
                                        thM65s = m65s(obj);
                                    }
                                    ((C0032d0) obj2).m41a(thM65s);
                                    thM42b = zM43e ? null : ((C0032d0) obj2).m42b();
                                    if (thM42b != null) {
                                        m52H(((C0032d0) obj2).f40s, thM42b);
                                    }
                                    c0084j = AbstractC0069y.f89d;
                                }
                            }
                        } else if (obj2 instanceof InterfaceC0018T) {
                            if (thM65s == null) {
                                thM65s = m65s(obj);
                            }
                            interfaceC0018T = (InterfaceC0018T) obj2;
                            if (interfaceC0018T.mo10c()) {
                                c0038g0M69y = m69y(interfaceC0018T);
                                if (c0038g0M69y == null) {
                                    continue;
                                } else {
                                    c0032d1 = new C0032d0(c0038g0M69y, thM65s);
                                    while (true) {
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0018T, c0032d1)) {
                                            m52H(c0038g0M69y, thM65s);
                                            c0084j = AbstractC0069y.f89d;
                                        } else if (atomicReferenceFieldUpdater.get(this) != interfaceC0018T) {
                                        }
                                    }
                                }
                            } else {
                                objM57O = m57O(obj2, new C0055p(false, thM65s));
                                if (objM57O != AbstractC0069y.f89d) {
                                    throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                                }
                                if (objM57O != AbstractC0069y.f91f) {
                                    objM57O2 = objM57O;
                                    break;
                                }
                            }
                        } else {
                            c0084j = AbstractC0069y.f92g;
                        }
                        objM57O2 = c0084j;
                        break;
                    }
                }
                if (objM57O2 != AbstractC0069y.f89d && objM57O2 != AbstractC0069y.f90e) {
                    if (objM57O2 == AbstractC0069y.f92g) {
                        return false;
                    }
                    mo2k(objM57O2);
                    return true;
                }
            }
        } else {
            if (objM57O2 == AbstractC0069y.f89d) {
                thM65s = null;
                loop1: while (true) {
                    atomicReferenceFieldUpdater = f43s;
                    obj2 = atomicReferenceFieldUpdater.get(this);
                    if (obj2 instanceof C0032d0) {
                        synchronized (obj2) {
                            c0032d0 = (C0032d0) obj2;
                            c0032d0.getClass();
                            if (C0032d0.f39v.get(c0032d0) == AbstractC0069y.f93h) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                c0084j = AbstractC0069y.f92g;
                            } else {
                                boolean zM43e2 = ((C0032d0) obj2).m43e();
                                if (thM65s == null) {
                                    thM65s = m65s(obj);
                                }
                                ((C0032d0) obj2).m41a(thM65s);
                                if (zM43e2) {
                                }
                                if (thM42b != null) {
                                    m52H(((C0032d0) obj2).f40s, thM42b);
                                }
                                c0084j = AbstractC0069y.f89d;
                            }
                        }
                    } else if (obj2 instanceof InterfaceC0018T) {
                        if (thM65s == null) {
                            thM65s = m65s(obj);
                        }
                        interfaceC0018T = (InterfaceC0018T) obj2;
                        if (interfaceC0018T.mo10c()) {
                            c0038g0M69y = m69y(interfaceC0018T);
                            if (c0038g0M69y == null) {
                                continue;
                            } else {
                                c0032d1 = new C0032d0(c0038g0M69y, thM65s);
                                while (true) {
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0018T, c0032d1)) {
                                        m52H(c0038g0M69y, thM65s);
                                        c0084j = AbstractC0069y.f89d;
                                    } else if (atomicReferenceFieldUpdater.get(this) != interfaceC0018T) {
                                    }
                                }
                            }
                        } else {
                            objM57O = m57O(obj2, new C0055p(false, thM65s));
                            if (objM57O != AbstractC0069y.f89d) {
                                throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                            }
                            if (objM57O != AbstractC0069y.f91f) {
                                objM57O2 = objM57O;
                                break;
                            }
                        }
                    } else {
                        c0084j = AbstractC0069y.f92g;
                    }
                    objM57O2 = c0084j;
                    break;
                }
            }
            if (objM57O2 != AbstractC0069y.f89d) {
                if (objM57O2 == AbstractC0069y.f92g) {
                    return false;
                }
                mo2k(objM57O2);
                return true;
            }
        }
        return true;
    }

    @Override // p062g0.InterfaceC6353h
    public final InterfaceC6353h minusKey(InterfaceC6352g interfaceC6352g) {
        return AbstractC0846b.m1753l(this, interfaceC6352g);
    }

    /* JADX INFO: renamed from: n */
    public void mo61n(CancellationException cancellationException) {
        m60m(cancellationException);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m62o(Throwable th) {
        if (mo49D()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC0045k interfaceC0045k = (InterfaceC0045k) f44t.get(this);
        if (interfaceC0045k == null || interfaceC0045k == C0040h0.f53s) {
            return z;
        }
        return interfaceC0045k.mo93b(th) || z;
    }

    /* JADX INFO: renamed from: p */
    public String mo37p() {
        return "Job was cancelled";
    }

    @Override // p062g0.InterfaceC6353h
    public final InterfaceC6353h plus(InterfaceC6353h context) {
        AbstractC6452k.m12181e(context, "context");
        return context == C6354i.f24409s ? this : (InterfaceC6353h) context.fold(this, new C0057q(10));
    }

    /* JADX INFO: renamed from: q */
    public boolean mo63q(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m60m(th) && mo30w();
    }

    /* JADX INFO: renamed from: r */
    public final void m64r(InterfaceC0018T interfaceC0018T, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f44t;
        InterfaceC0045k interfaceC0045k = (InterfaceC0045k) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0045k != null) {
            interfaceC0045k.dispose();
            atomicReferenceFieldUpdater.set(this, C0040h0.f53s);
        }
        CompletionHandlerException completionHandlerException = null;
        C0055p c0055p = obj instanceof C0055p ? (C0055p) obj : null;
        Throwable th = c0055p != null ? c0055p.f68a : null;
        if (interfaceC0018T instanceof AbstractC0026a0) {
            try {
                ((AbstractC0026a0) interfaceC0018T).mo27k(th);
                return;
            } catch (Throwable th2) {
                mo32A(new CompletionHandlerException("Exception in completion handler " + interfaceC0018T + " for " + this, th2));
                return;
            }
        }
        C0038g0 c0038g0Mo11d = interfaceC0018T.mo11d();
        if (c0038g0Mo11d != null) {
            c0038g0Mo11d.m313a(new C0221g(1), 1);
            Object obj2 = C0223i.f447s.get(c0038g0Mo11d);
            AbstractC6452k.m12179c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (C0223i c0223iM316g = (C0223i) obj2; !c0223iM316g.equals(c0038g0Mo11d); c0223iM316g = c0223iM316g.m316g()) {
                if (c0223iM316g instanceof AbstractC0026a0) {
                    try {
                        ((AbstractC0026a0) c0223iM316g).mo27k(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            AbstractC0878a.m1796b(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + c0223iM316g + " for " + this, th3);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                mo32A(completionHandlerException);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final Throwable m65s(Object obj) {
        Throwable thM42b;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        C0034e0 c0034e0 = (C0034e0) ((InterfaceC0044j0) obj);
        Object obj2 = f43s.get(c0034e0);
        if (obj2 instanceof C0032d0) {
            thM42b = ((C0032d0) obj2).m42b();
        } else if (obj2 instanceof C0055p) {
            thM42b = ((C0055p) obj2).f68a;
        } else {
            if (obj2 instanceof InterfaceC0018T) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            thM42b = null;
        }
        CancellationException cancellationException = thM42b instanceof CancellationException ? (CancellationException) thM42b : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(m46N(obj2)), thM42b, c0034e0) : cancellationException;
    }

    /* JADX INFO: renamed from: t */
    public final Object m66t(C0032d0 c0032d0, Object obj) {
        Throwable thM68v;
        C0055p c0055p = obj instanceof C0055p ? (C0055p) obj : null;
        Throwable th = c0055p != null ? c0055p.f68a : null;
        synchronized (c0032d0) {
            c0032d0.m43e();
            ArrayList arrayListM44f = c0032d0.m44f(th);
            thM68v = m68v(c0032d0, arrayListM44f);
            if (thM68v != null && arrayListM44f.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM44f.size()));
                int size = arrayListM44f.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayListM44f.get(i2);
                    i2++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != thM68v && th2 != thM68v && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        AbstractC0878a.m1796b(thM68v, th2);
                    }
                }
            }
        }
        if (thM68v != null && thM68v != th) {
            obj = new C0055p(false, thM68v);
        }
        if (thM68v != null && (m62o(thM68v) || mo70z(thM68v))) {
            AbstractC6452k.m12179c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0055p.f67b.compareAndSet((C0055p) obj, 0, 1);
        }
        mo33I(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f43s;
        Object c0019u = obj instanceof InterfaceC0018T ? new C0019U((InterfaceC0018T) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c0032d0, c0019u) && atomicReferenceFieldUpdater.get(this) == c0032d0) {
        }
        m64r(c0032d0, obj);
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + m46N(f43s.get(this)) + '}');
        sb.append('@');
        sb.append(AbstractC0069y.m107f(this));
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final CancellationException m67u() {
        CancellationException cancellationException;
        Object obj = f43s.get(this);
        if (!(obj instanceof C0032d0)) {
            if (obj instanceof InterfaceC0018T) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof C0055p)) {
                return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0055p) obj).f68a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new JobCancellationException(mo37p(), th, this) : cancellationException;
        }
        Throwable thM42b = ((C0032d0) obj).m42b();
        if (thM42b == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thM42b instanceof CancellationException ? (CancellationException) thM42b : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = mo37p();
        }
        return new JobCancellationException(strConcat, thM42b, this);
    }

    /* JADX INFO: renamed from: v */
    public final Throwable m68v(C0032d0 c0032d0, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (c0032d0.m43e()) {
                return new JobCancellationException(mo37p(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        do {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i3);
            i3++;
        } while (((Throwable) obj) instanceof CancellationException);
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            int size2 = arrayList.size();
            while (i2 < size2) {
                Object obj3 = arrayList.get(i2);
                i2++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    /* JADX INFO: renamed from: w */
    public boolean mo30w() {
        return true;
    }

    /* JADX INFO: renamed from: x */
    public boolean mo31x() {
        return this instanceof C0051n;
    }

    /* JADX INFO: renamed from: y */
    public final C0038g0 m69y(InterfaceC0018T interfaceC0018T) {
        C0038g0 c0038g0Mo11d = interfaceC0018T.mo11d();
        if (c0038g0Mo11d != null) {
            return c0038g0Mo11d;
        }
        if (interfaceC0018T instanceof C0009J) {
            return new C0038g0();
        }
        if (interfaceC0018T instanceof AbstractC0026a0) {
            m55L((AbstractC0026a0) interfaceC0018T);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC0018T).toString());
    }

    /* JADX INFO: renamed from: z */
    public boolean mo70z(Throwable th) {
        return false;
    }

    /* JADX INFO: renamed from: J */
    public void mo53J() {
    }

    /* JADX INFO: renamed from: A */
    public void mo32A(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    /* JADX INFO: renamed from: I */
    public void mo33I(Object obj) {
    }

    /* JADX INFO: renamed from: k */
    public void mo2k(Object obj) {
    }
}
