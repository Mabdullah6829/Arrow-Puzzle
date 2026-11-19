package p000A0;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC6452k;
import kotlinx.coroutines.CompletionHandlerException;
import p001B.C0084j;
import p010F0.AbstractC0215a;
import p010F0.AbstractC0232r;
import p010F0.C0219e;
import p057d0.AbstractC6285g;
import p057d0.C6289k;
import p058e0.C6301i;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;
import p064h0.EnumC6363a;
import p066i0.InterfaceC6374d;
import p078p0.InterfaceC6498l;
import p078p0.InterfaceC6503q;

/* JADX INFO: renamed from: A0.h */
/* JADX INFO: loaded from: classes.dex */
public class C0039h extends AbstractC0005F implements InterfaceC0035f, InterfaceC6374d, InterfaceC0064t0 {

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f48x = AtomicIntegerFieldUpdater.newUpdater(C0039h.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f49y = AtomicReferenceFieldUpdater.newUpdater(C0039h.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f50z = AtomicReferenceFieldUpdater.newUpdater(C0039h.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: v */
    public final InterfaceC6348c f51v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC6353h f52w;

    public C0039h(int i2, InterfaceC6348c interfaceC6348c) {
        super(i2);
        this.f51v = interfaceC6348c;
        this.f52w = interfaceC6348c.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0027b.f28a;
    }

    /* JADX INFO: renamed from: C */
    public static Object m74C(InterfaceC0042i0 interfaceC0042i0, Object obj, int i2, InterfaceC6503q interfaceC6503q) {
        if (obj instanceof C0055p) {
            return obj;
        }
        if (i2 != 1 && i2 != 2) {
            return obj;
        }
        if (interfaceC6503q != null || (interfaceC0042i0 instanceof C0033e)) {
            return new C0053o(obj, interfaceC0042i0 instanceof C0033e ? (C0033e) interfaceC0042i0 : null, interfaceC6503q, (CancellationException) null, 16);
        }
        return obj;
    }

    /* JADX INFO: renamed from: w */
    public static void m75w(InterfaceC0042i0 interfaceC0042i0, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + interfaceC0042i0 + ", already has " + obj).toString());
    }

    /* JADX INFO: renamed from: A */
    public final void m76A(Object obj, int i2, InterfaceC6503q interfaceC6503q) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f49y;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC0042i0)) {
                if (obj2 instanceof C0041i) {
                    C0041i c0041i = (C0041i) obj2;
                    c0041i.getClass();
                    if (C0041i.f54c.compareAndSet(c0041i, 0, 1)) {
                        if (interfaceC6503q != null) {
                            m80k(interfaceC6503q, c0041i.f68a, obj);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objM74C = m74C((InterfaceC0042i0) obj2, obj, i2, interfaceC6503q);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM74C)) {
                    if (!m90v()) {
                        m83n();
                    }
                    m84o(i2);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m77B(AbstractC0063t abstractC0063t) {
        InterfaceC6348c interfaceC6348c = this.f51v;
        C0219e c0219e = interfaceC6348c instanceof C0219e ? (C0219e) interfaceC6348c : null;
        m76A(C6289k.f24318a, (c0219e != null ? c0219e.f435v : null) == abstractC0063t ? 4 : this.f2u, null);
    }

    @Override // p000A0.InterfaceC0064t0
    /* JADX INFO: renamed from: a */
    public final void mo78a(AbstractC0232r abstractC0232r, int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f48x;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        m89u(abstractC0232r);
    }

    @Override // p000A0.AbstractC0005F
    /* JADX INFO: renamed from: b */
    public final void mo4b(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f49y;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof InterfaceC0042i0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C0055p) {
                return;
            }
            if (!(obj instanceof C0053o)) {
                cancellationException2 = cancellationException;
                C0053o c0053o = new C0053o(obj, (C0033e) null, (InterfaceC6503q) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0053o)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            C0053o c0053o2 = (C0053o) obj;
            if (c0053o2.f65e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0053o c0053oM96a = C0053o.m96a(c0053o2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c0053oM96a)) {
                    C0033e c0033e = c0053o2.f62b;
                    if (c0033e != null) {
                        m79i(c0033e, cancellationException);
                    }
                    InterfaceC6503q interfaceC6503q = c0053o2.f63c;
                    if (interfaceC6503q != null) {
                        m80k(interfaceC6503q, cancellationException, c0053o2.f61a);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
            cancellationException2 = cancellationException;
            cancellationException = cancellationException2;
        }
    }

    @Override // p000A0.AbstractC0005F
    /* JADX INFO: renamed from: c */
    public final InterfaceC6348c mo5c() {
        return this.f51v;
    }

    @Override // p000A0.AbstractC0005F
    /* JADX INFO: renamed from: d */
    public final Throwable mo6d(Object obj) {
        Throwable thMo6d = super.mo6d(obj);
        if (thMo6d != null) {
            return thMo6d;
        }
        return null;
    }

    @Override // p000A0.AbstractC0005F
    /* JADX INFO: renamed from: e */
    public final Object mo7e(Object obj) {
        return obj instanceof C0053o ? ((C0053o) obj).f61a : obj;
    }

    @Override // p000A0.InterfaceC0035f
    /* JADX INFO: renamed from: f */
    public final C0084j mo71f(Object obj, InterfaceC6503q interfaceC6503q) {
        C0084j c0084j = AbstractC0069y.f86a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f49y;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC0042i0)) {
                return null;
            }
            Object objM74C = m74C((InterfaceC0042i0) obj2, obj, this.f2u, interfaceC6503q);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objM74C)) {
                    if (!m90v()) {
                        m83n();
                    }
                    return c0084j;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // p066i0.InterfaceC6374d
    public final InterfaceC6374d getCallerFrame() {
        InterfaceC6348c interfaceC6348c = this.f51v;
        if (interfaceC6348c instanceof InterfaceC6374d) {
            return (InterfaceC6374d) interfaceC6348c;
        }
        return null;
    }

    @Override // p062g0.InterfaceC6348c
    public final InterfaceC6353h getContext() {
        return this.f52w;
    }

    @Override // p000A0.AbstractC0005F
    /* JADX INFO: renamed from: h */
    public final Object mo9h() {
        return f49y.get(this);
    }

    /* JADX INFO: renamed from: i */
    public final void m79i(C0033e c0033e, Throwable th) {
        try {
            switch (c0033e.f41a) {
                case 0:
                    ((ScheduledFuture) c0033e.f42b).cancel(false);
                    break;
                case 1:
                    ((InterfaceC6498l) c0033e.f42b).invoke(th);
                    break;
                default:
                    ((InterfaceC0008I) c0033e.f42b).dispose();
                    break;
            }
        } catch (Throwable th2) {
            AbstractC0069y.m109h(this.f52w, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // p000A0.InterfaceC0035f
    /* JADX INFO: renamed from: j */
    public final void mo72j(Object obj) {
        m84o(this.f2u);
    }

    /* JADX INFO: renamed from: k */
    public final void m80k(InterfaceC6503q interfaceC6503q, Throwable th, Object obj) {
        InterfaceC6353h interfaceC6353h = this.f52w;
        try {
            interfaceC6503q.invoke(th, obj, interfaceC6353h);
        } catch (Throwable th2) {
            AbstractC0069y.m109h(interfaceC6353h, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m81l(AbstractC0232r abstractC0232r, Throwable th) {
        InterfaceC6353h interfaceC6353h = this.f52w;
        int i2 = f48x.get(this) & 536870911;
        if (i2 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            abstractC0232r.mo246g(i2, interfaceC6353h);
        } catch (Throwable th2) {
            AbstractC0069y.m109h(interfaceC6353h, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m82m(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f49y;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC0042i0)) {
                return false;
            }
            C0041i c0041i = new C0041i(this, th, (obj instanceof C0033e) || (obj instanceof AbstractC0232r));
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c0041i)) {
                    InterfaceC0042i0 interfaceC0042i0 = (InterfaceC0042i0) obj;
                    if (interfaceC0042i0 instanceof C0033e) {
                        m79i((C0033e) obj, th);
                    } else if (interfaceC0042i0 instanceof AbstractC0232r) {
                        m81l((AbstractC0232r) obj, th);
                    }
                    if (!m90v()) {
                        m83n();
                    }
                    m84o(this.f2u);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m83n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f50z;
        InterfaceC0008I interfaceC0008I = (InterfaceC0008I) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0008I == null) {
            return;
        }
        interfaceC0008I.dispose();
        atomicReferenceFieldUpdater.set(this, C0040h0.f53s);
    }

    /* JADX INFO: renamed from: o */
    public final void m84o(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f48x;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i2 == 4;
                InterfaceC6348c interfaceC6348c = this.f51v;
                if (!z && (interfaceC6348c instanceof C0219e)) {
                    boolean z2 = i2 == 1 || i2 == 2;
                    int i5 = this.f2u;
                    if (z2 == (i5 == 1 || i5 == 2)) {
                        C0219e c0219e = (C0219e) interfaceC6348c;
                        AbstractC0063t abstractC0063t = c0219e.f435v;
                        InterfaceC6353h context = c0219e.f436w.getContext();
                        if (abstractC0063t.isDispatchNeeded(context)) {
                            abstractC0063t.dispatch(context, this);
                            return;
                        }
                        AbstractC0014O abstractC0014OM97a = AbstractC0054o0.m97a();
                        if (abstractC0014OM97a.f15s >= 4294967296L) {
                            C6301i c6301i = abstractC0014OM97a.f17u;
                            if (c6301i == null) {
                                c6301i = new C6301i();
                                abstractC0014OM97a.f17u = c6301i;
                            }
                            c6301i.addLast(this);
                            return;
                        }
                        abstractC0014OM97a.m22n(true);
                        try {
                            AbstractC0069y.m114m(this, interfaceC6348c, true);
                            do {
                            } while (abstractC0014OM97a.m23p());
                        } catch (Throwable th) {
                            try {
                                m8g(th);
                            } finally {
                                abstractC0014OM97a.m20j(true);
                            }
                        }
                        return;
                    }
                }
                AbstractC0069y.m114m(this, interfaceC6348c, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, BasicMeasure.EXACTLY + (536870911 & i3)));
    }

    /* JADX INFO: renamed from: p */
    public Throwable mo39p(C0034e0 c0034e0) {
        return c0034e0.m67u();
    }

    /* JADX INFO: renamed from: q */
    public final Object m85q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        InterfaceC0022X interfaceC0022X;
        boolean zM90v = m90v();
        do {
            atomicIntegerFieldUpdater = f48x;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zM90v) {
                    m91y();
                }
                Object obj = f49y.get(this);
                if (obj instanceof C0055p) {
                    throw ((C0055p) obj).f68a;
                }
                int i4 = this.f2u;
                if ((i4 != 1 && i4 != 2) || (interfaceC0022X = (InterfaceC0022X) this.f52w.get(C0065u.f80t)) == null || interfaceC0022X.mo28c()) {
                    return mo7e(obj);
                }
                CancellationException cancellationExceptionM67u = ((C0034e0) interfaceC0022X).m67u();
                mo4b(cancellationExceptionM67u);
                throw cancellationExceptionM67u;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((InterfaceC0008I) f50z.get(this)) == null) {
            m87s();
        }
        if (zM90v) {
            m91y();
        }
        return EnumC6363a.f24419s;
    }

    /* JADX INFO: renamed from: r */
    public final void m86r() {
        InterfaceC0008I interfaceC0008IM87s = m87s();
        if (interfaceC0008IM87s == null || (f49y.get(this) instanceof InterfaceC0042i0)) {
            return;
        }
        interfaceC0008IM87s.dispose();
        f50z.set(this, C0040h0.f53s);
    }

    @Override // p062g0.InterfaceC6348c
    public final void resumeWith(Object obj) {
        Throwable thM12075a = AbstractC6285g.m12075a(obj);
        if (thM12075a != null) {
            obj = new C0055p(false, thM12075a);
        }
        m76A(obj, this.f2u, null);
    }

    /* JADX INFO: renamed from: s */
    public final InterfaceC0008I m87s() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC0022X interfaceC0022X = (InterfaceC0022X) this.f52w.get(C0065u.f80t);
        if (interfaceC0022X == null) {
            return null;
        }
        InterfaceC0008I interfaceC0008IM110i = AbstractC0069y.m110i(interfaceC0022X, true, new C0043j(this, 0));
        do {
            atomicReferenceFieldUpdater = f50z;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC0008IM110i)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return interfaceC0008IM110i;
    }

    /* JADX INFO: renamed from: t */
    public final void m88t(InterfaceC6498l interfaceC6498l) {
        m89u(new C0033e(interfaceC6498l, 1));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(mo40x());
        sb.append('(');
        sb.append(AbstractC0069y.m116o(this.f51v));
        sb.append("){");
        Object obj = f49y.get(this);
        if (obj instanceof InterfaceC0042i0) {
            str = "Active";
        } else {
            str = obj instanceof C0041i ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(AbstractC0069y.m107f(this));
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m89u(InterfaceC0042i0 interfaceC0042i0) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f49y;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0027b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, interfaceC0042i0)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if ((obj instanceof C0033e) || (obj instanceof AbstractC0232r)) {
                m75w(interfaceC0042i0, obj);
                throw null;
            }
            if (obj instanceof C0055p) {
                C0055p c0055p = (C0055p) obj;
                c0055p.getClass();
                if (!C0055p.f67b.compareAndSet(c0055p, 0, 1)) {
                    m75w(interfaceC0042i0, obj);
                    throw null;
                }
                if (obj instanceof C0041i) {
                    if (obj == null) {
                        c0055p = null;
                    }
                    Throwable th = c0055p != null ? c0055p.f68a : null;
                    if (interfaceC0042i0 instanceof C0033e) {
                        m79i((C0033e) interfaceC0042i0, th);
                        return;
                    } else {
                        m81l((AbstractC0232r) interfaceC0042i0, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C0053o)) {
                if (interfaceC0042i0 instanceof AbstractC0232r) {
                    return;
                }
                C0053o c0053o = new C0053o(obj, (C0033e) interfaceC0042i0, (InterfaceC6503q) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0053o)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            C0053o c0053o2 = (C0053o) obj;
            if (c0053o2.f62b != null) {
                m75w(interfaceC0042i0, obj);
                throw null;
            }
            if (interfaceC0042i0 instanceof AbstractC0232r) {
                return;
            }
            C0033e c0033e = (C0033e) interfaceC0042i0;
            Throwable th2 = c0053o2.f65e;
            if (th2 != null) {
                m79i(c0033e, th2);
                return;
            }
            C0053o c0053oM96a = C0053o.m96a(c0053o2, c0033e, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0053oM96a)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m90v() {
        if (this.f2u != 2) {
            return false;
        }
        InterfaceC6348c interfaceC6348c = this.f51v;
        AbstractC6452k.m12179c(interfaceC6348c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return C0219e.f434z.get((C0219e) interfaceC6348c) != null;
    }

    /* JADX INFO: renamed from: x */
    public String mo40x() {
        return "CancellableContinuation";
    }

    /* JADX INFO: renamed from: y */
    public final void m91y() {
        InterfaceC6348c interfaceC6348c = this.f51v;
        Throwable th = null;
        C0219e c0219e = interfaceC6348c instanceof C0219e ? (C0219e) interfaceC6348c : null;
        if (c0219e != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0219e.f434z;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c0219e);
                C0084j c0084j = AbstractC0215a.f425c;
                if (obj != c0084j) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c0219e, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(c0219e) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(c0219e, c0084j, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(c0219e) == c0084j);
            }
            if (th == null) {
                return;
            }
            m83n();
            m82m(th);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m92z(Object obj, InterfaceC6503q interfaceC6503q) {
        m76A(obj, this.f2u, interfaceC6503q);
    }
}
