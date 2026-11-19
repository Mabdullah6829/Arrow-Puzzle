package p000A0;

import androidx.core.location.LocationRequestCompat;
import com.google.firebase.firestore.FirebaseFirestoreException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC6452k;
import p001B.C0084j;
import p002B0.C0102b;
import p002B0.C0104d;
import p004C0.InterfaceC0152q;
import p010F0.AbstractC0215a;
import p010F0.C0217c;
import p010F0.C0219e;
import p010F0.C0231q;
import p011H.AbstractC0243G;
import p012H0.C0302e;
import p037U0.AbstractC0846b;
import p043a.AbstractC0878a;
import p057d0.AbstractC6285g;
import p057d0.C6289k;
import p062g0.C6349d;
import p062g0.C6354i;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;
import p064h0.EnumC6363a;
import p066i0.InterfaceC6374d;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: A0.y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0069y {

    /* JADX INFO: renamed from: a */
    public static final C0084j f86a = new C0084j("RESUME_TOKEN", 1);

    /* JADX INFO: renamed from: b */
    public static final C0084j f87b = new C0084j("REMOVED_TASK", 1);

    /* JADX INFO: renamed from: c */
    public static final C0084j f88c = new C0084j("CLOSED_EMPTY", 1);

    /* JADX INFO: renamed from: d */
    public static final C0084j f89d = new C0084j("COMPLETING_ALREADY", 1);

    /* JADX INFO: renamed from: e */
    public static final C0084j f90e = new C0084j("COMPLETING_WAITING_CHILDREN", 1);

    /* JADX INFO: renamed from: f */
    public static final C0084j f91f = new C0084j("COMPLETING_RETRY", 1);

    /* JADX INFO: renamed from: g */
    public static final C0084j f92g = new C0084j("TOO_LATE_TO_CANCEL", 1);

    /* JADX INFO: renamed from: h */
    public static final C0084j f93h = new C0084j("SEALED", 1);

    /* JADX INFO: renamed from: i */
    public static final C0009J f94i = new C0009J(false);

    /* JADX INFO: renamed from: j */
    public static final C0009J f95j = new C0009J(true);

    /* JADX INFO: renamed from: a */
    public static final C0217c m102a(InterfaceC6353h interfaceC6353h) {
        if (interfaceC6353h.get(C0065u.f80t) == null) {
            interfaceC6353h = interfaceC6353h.plus(new C0023Y());
        }
        return new C0217c(interfaceC6353h);
    }

    /* JADX INFO: renamed from: b */
    public static C0002C m103b(InterfaceC0066v interfaceC0066v, InterfaceC6502p interfaceC6502p, int i2) {
        EnumC0067w enumC0067w = EnumC0067w.f84v;
        if ((i2 & 2) != 0) {
            enumC0067w = EnumC0067w.f81s;
        }
        InterfaceC6353h interfaceC6353hM112k = m112k(interfaceC0066v, C6354i.f24409s);
        C0002C c0036f0 = enumC0067w == EnumC0067w.f82t ? new C0036f0(interfaceC6353hM112k, interfaceC6502p) : new C0002C(interfaceC6353hM112k, true);
        c0036f0.m36S(enumC0067w, c0036f0, interfaceC6502p);
        return c0036f0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final void m104c(InterfaceC0152q interfaceC0152q, String str, FirebaseFirestoreException firebaseFirestoreException) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(firebaseFirestoreException);
        InterfaceC0022X interfaceC0022X = (InterfaceC0022X) ((AbstractC0025a) interfaceC0152q).f26u.get(C0065u.f80t);
        if (interfaceC0022X != null) {
            interfaceC0022X.mo29e(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC0152q).toString());
        }
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC6353h m105d(InterfaceC6353h interfaceC6353h, InterfaceC6353h interfaceC6353h2, boolean z) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) interfaceC6353h.fold(bool, new C0057q(0))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC6353h2.fold(bool, new C0057q(0))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC6353h.plus(interfaceC6353h2);
        }
        C0057q c0057q = new C0057q(1);
        C6354i c6354i = C6354i.f24409s;
        InterfaceC6353h interfaceC6353h3 = (InterfaceC6353h) interfaceC6353h.fold(c6354i, c0057q);
        Object objFold = interfaceC6353h2;
        if (zBooleanValue2) {
            objFold = interfaceC6353h2.fold(c6354i, new C0057q(2));
        }
        return interfaceC6353h3.plus((InterfaceC6353h) objFold);
    }

    /* JADX INFO: renamed from: e */
    public static final AbstractC0063t m106e(Executor executor) {
        AbstractC0063t abstractC0063t;
        ExecutorC0006G executorC0006G = executor instanceof ExecutorC0006G ? (ExecutorC0006G) executor : null;
        return (executorC0006G == null || (abstractC0063t = executorC0006G.f3s) == null) ? new C0016Q(executor) : abstractC0063t;
    }

    /* JADX INFO: renamed from: f */
    public static final String m107f(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX INFO: renamed from: g */
    public static final C0039h m108g(InterfaceC6348c interfaceC6348c) {
        C0039h c0039h;
        C0039h c0039h2;
        if (!(interfaceC6348c instanceof C0219e)) {
            return new C0039h(1, interfaceC6348c);
        }
        C0219e c0219e = (C0219e) interfaceC6348c;
        C0084j c0084j = AbstractC0215a.f425c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0219e.f434z;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(c0219e);
            c0039h = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(c0219e, c0084j);
                c0039h2 = null;
                break;
            }
            if (obj instanceof C0039h) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(c0219e, obj, c0084j)) {
                        c0039h2 = (C0039h) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(c0219e) == obj);
            } else if (obj != c0084j && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0039h2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0039h.f49y;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0039h2);
            if (!(obj2 instanceof C0053o) || ((C0053o) obj2).f64d == null) {
                C0039h.f48x.set(c0039h2, 536870911);
                atomicReferenceFieldUpdater2.set(c0039h2, C0027b.f28a);
                c0039h = c0039h2;
            } else {
                c0039h2.m83n();
            }
            if (c0039h != null) {
                return c0039h;
            }
        }
        return new C0039h(2, interfaceC6348c);
    }

    /* JADX INFO: renamed from: h */
    public static final void m109h(InterfaceC6353h interfaceC6353h, Throwable th) {
        try {
            C0102b c0102b = (C0102b) interfaceC6353h.get(C0065u.f79s);
            if (c0102b != null) {
                c0102b.m171j(th);
            } else {
                AbstractC0215a.m298d(interfaceC6353h, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC0878a.m1796b(runtimeException, th);
                th = runtimeException;
            }
            AbstractC0215a.m298d(interfaceC6353h, th);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final InterfaceC0008I m110i(InterfaceC0022X interfaceC0022X, boolean z, AbstractC0026a0 abstractC0026a0) {
        if (interfaceC0022X instanceof C0034e0) {
            return ((C0034e0) interfaceC0022X).m48C(z, abstractC0026a0);
        }
        boolean zMo26j = abstractC0026a0.mo26j();
        C0024Z c0024z = new C0024Z(1, abstractC0026a0, AbstractC0026a0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        return ((C0034e0) interfaceC0022X).m48C(z, zMo26j ? new C0021W(c0024z) : new C0043j(c0024z, 1));
    }

    /* JADX INFO: renamed from: j */
    public static C0048l0 m111j(InterfaceC0066v interfaceC0066v, C0104d c0104d, InterfaceC6502p interfaceC6502p, int i2) {
        InterfaceC6353h interfaceC6353h = c0104d;
        if ((i2 & 1) != 0) {
            interfaceC6353h = C6354i.f24409s;
        }
        EnumC0067w enumC0067w = EnumC0067w.f81s;
        InterfaceC6353h interfaceC6353hM112k = m112k(interfaceC0066v, interfaceC6353h);
        EnumC0067w enumC0067w2 = EnumC0067w.f81s;
        C0048l0 c0048l0 = new C0048l0(interfaceC6353hM112k, true);
        c0048l0.m36S(enumC0067w, c0048l0, interfaceC6502p);
        return c0048l0;
    }

    /* JADX INFO: renamed from: k */
    public static final InterfaceC6353h m112k(InterfaceC0066v interfaceC0066v, InterfaceC6353h interfaceC6353h) {
        InterfaceC6353h interfaceC6353hM105d = m105d(interfaceC0066v.getCoroutineContext(), interfaceC6353h, true);
        C0302e c0302e = AbstractC0007H.f4a;
        return (interfaceC6353hM105d == c0302e || interfaceC6353hM105d.get(C6349d.f24408s) != null) ? interfaceC6353hM105d : interfaceC6353hM105d.plus(c0302e);
    }

    /* JADX INFO: renamed from: l */
    public static final Object m113l(Object obj) {
        return obj instanceof C0055p ? AbstractC0243G.m372j(((C0055p) obj).f68a) : obj;
    }

    /* JADX INFO: renamed from: m */
    public static final void m114m(C0039h c0039h, InterfaceC6348c interfaceC6348c, boolean z) {
        Object obj = C0039h.f49y.get(c0039h);
        Throwable thMo6d = c0039h.mo6d(obj);
        Object objM372j = thMo6d != null ? AbstractC0243G.m372j(thMo6d) : c0039h.mo7e(obj);
        if (!z) {
            interfaceC6348c.resumeWith(objM372j);
            return;
        }
        AbstractC6452k.m12179c(interfaceC6348c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C0219e c0219e = (C0219e) interfaceC6348c;
        InterfaceC6348c interfaceC6348c2 = c0219e.f436w;
        Object obj2 = c0219e.f438y;
        InterfaceC6353h context = interfaceC6348c2.getContext();
        Object objM306l = AbstractC0215a.m306l(context, obj2);
        C0060r0 c0060r0M118q = objM306l != AbstractC0215a.f426d ? m118q(interfaceC6348c2, context, objM306l) : null;
        try {
            interfaceC6348c2.resumeWith(objM372j);
        } finally {
            if (c0060r0M118q == null || c0060r0M118q.m100T()) {
                AbstractC0215a.m301g(context, objM306l);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static Object m115n(InterfaceC6502p interfaceC6502p) throws Throwable {
        Thread threadCurrentThread = Thread.currentThread();
        AbstractC0014O abstractC0014OM97a = AbstractC0054o0.m97a();
        InterfaceC6353h interfaceC6353hM105d = m105d(C6354i.f24409s, abstractC0014OM97a, true);
        C0302e c0302e = AbstractC0007H.f4a;
        if (interfaceC6353hM105d != c0302e && interfaceC6353hM105d.get(C6349d.f24408s) == null) {
            interfaceC6353hM105d = interfaceC6353hM105d.plus(c0302e);
        }
        C0029c c0029c = new C0029c(interfaceC6353hM105d, threadCurrentThread, abstractC0014OM97a);
        c0029c.m36S(EnumC0067w.f81s, c0029c, interfaceC6502p);
        AbstractC0014O abstractC0014O = c0029c.f31w;
        if (abstractC0014O != null) {
            int i2 = AbstractC0014O.f14v;
            abstractC0014O.m22n(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jMo17o = abstractC0014O != null ? abstractC0014O.mo17o() : LocationRequestCompat.PASSIVE_INTERVAL;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0034e0.f43s;
                if (!(atomicReferenceFieldUpdater.get(c0029c) instanceof InterfaceC0018T)) {
                    if (abstractC0014O != null) {
                        int i3 = AbstractC0014O.f14v;
                        abstractC0014O.m20j(false);
                    }
                    Object objM117p = m117p(atomicReferenceFieldUpdater.get(c0029c));
                    C0055p c0055p = objM117p instanceof C0055p ? (C0055p) objM117p : null;
                    if (c0055p == null) {
                        return objM117p;
                    }
                    throw c0055p.f68a;
                }
                LockSupport.parkNanos(c0029c, jMo17o);
            } catch (Throwable th) {
                if (abstractC0014O != null) {
                    int i4 = AbstractC0014O.f14v;
                    abstractC0014O.m20j(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0029c.m60m(interruptedException);
        throw interruptedException;
    }

    /* JADX INFO: renamed from: o */
    public static final String m116o(InterfaceC6348c interfaceC6348c) {
        Object objM372j;
        if (interfaceC6348c instanceof C0219e) {
            return ((C0219e) interfaceC6348c).toString();
        }
        try {
            objM372j = interfaceC6348c + '@' + m107f(interfaceC6348c);
        } catch (Throwable th) {
            objM372j = AbstractC0243G.m372j(th);
        }
        if (AbstractC6285g.m12075a(objM372j) != null) {
            objM372j = interfaceC6348c.getClass().getName() + '@' + m107f(interfaceC6348c);
        }
        return (String) objM372j;
    }

    /* JADX INFO: renamed from: p */
    public static final Object m117p(Object obj) {
        InterfaceC0018T interfaceC0018T;
        C0019U c0019u = obj instanceof C0019U ? (C0019U) obj : null;
        return (c0019u == null || (interfaceC0018T = c0019u.f20a) == null) ? obj : interfaceC0018T;
    }

    /* JADX INFO: renamed from: q */
    public static final C0060r0 m118q(InterfaceC6348c interfaceC6348c, InterfaceC6353h interfaceC6353h, Object obj) {
        C0060r0 c0060r0 = null;
        if ((interfaceC6348c instanceof InterfaceC6374d) && interfaceC6353h.get(C0062s0.f78s) != null) {
            InterfaceC6374d callerFrame = (InterfaceC6374d) interfaceC6348c;
            while (!(callerFrame instanceof C0004E) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof C0060r0) {
                    c0060r0 = (C0060r0) callerFrame;
                    break;
                }
            }
            if (c0060r0 != null) {
                c0060r0.m101U(interfaceC6353h, obj);
            }
        }
        return c0060r0;
    }

    /* JADX INFO: renamed from: r */
    public static final Object m119r(InterfaceC6502p interfaceC6502p, InterfaceC6353h interfaceC6353h, InterfaceC6348c interfaceC6348c) throws Throwable {
        Object objM117p;
        InterfaceC6353h context = interfaceC6348c.getContext();
        InterfaceC6353h interfaceC6353hPlus = !((Boolean) interfaceC6353h.fold(Boolean.FALSE, new C0057q(0))).booleanValue() ? context.plus(interfaceC6353h) : m105d(context, interfaceC6353h, false);
        InterfaceC0022X interfaceC0022X = (InterfaceC0022X) interfaceC6353hPlus.get(C0065u.f80t);
        if (interfaceC0022X != null && !interfaceC0022X.mo28c()) {
            throw ((C0034e0) interfaceC0022X).m67u();
        }
        if (interfaceC6353hPlus == context) {
            C0231q c0231q = new C0231q(interfaceC6348c, interfaceC6353hPlus);
            objM117p = AbstractC0846b.m1756o(c0231q, c0231q, interfaceC6502p);
        } else {
            C6349d c6349d = C6349d.f24408s;
            if (AbstractC6452k.m12177a(interfaceC6353hPlus.get(c6349d), context.get(c6349d))) {
                C0060r0 c0060r0 = new C0060r0(interfaceC6348c, interfaceC6353hPlus);
                InterfaceC6353h interfaceC6353h2 = c0060r0.f26u;
                Object objM306l = AbstractC0215a.m306l(interfaceC6353h2, null);
                try {
                    objM117p = AbstractC0846b.m1756o(c0060r0, c0060r0, interfaceC6502p);
                    AbstractC0215a.m301g(interfaceC6353h2, objM306l);
                } catch (Throwable th) {
                    AbstractC0215a.m301g(interfaceC6353h2, objM306l);
                    throw th;
                }
            } else {
                C0004E c0004e = new C0004E(interfaceC6348c, interfaceC6353hPlus);
                try {
                    AbstractC0215a.m302h(AbstractC0878a.m1802m(AbstractC0878a.m1798g(c0004e, c0004e, interfaceC6502p)), C6289k.f24318a);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0004E.f1w;
                    do {
                        int i2 = atomicIntegerFieldUpdater.get(c0004e);
                        if (i2 != 0) {
                            if (i2 != 2) {
                                throw new IllegalStateException("Already suspended");
                            }
                            objM117p = m117p(C0034e0.f43s.get(c0004e));
                            if (objM117p instanceof C0055p) {
                                throw ((C0055p) objM117p).f68a;
                            }
                        }
                    } while (!atomicIntegerFieldUpdater.compareAndSet(c0004e, 0, 1));
                    objM117p = EnumC6363a.f24419s;
                } catch (Throwable th2) {
                    c0004e.resumeWith(AbstractC0243G.m372j(th2));
                    throw th2;
                }
            }
        }
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        return objM117p;
    }
}
