package p004C0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.JobCancellationException;
import p000A0.AbstractC0025a;
import p000A0.AbstractC0069y;
import p000A0.C0032d0;
import p000A0.C0034e0;
import p000A0.C0055p;
import p001B.C0084j;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;

/* JADX INFO: renamed from: C0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0151p extends AbstractC0025a implements InterfaceC0152q, InterfaceC0142g {

    /* JADX INFO: renamed from: v */
    public final C0138c f269v;

    public C0151p(InterfaceC6353h interfaceC6353h, C0138c c0138c) {
        super(interfaceC6353h, true);
        this.f269v = c0138c;
    }

    @Override // p000A0.AbstractC0025a
    /* JADX INFO: renamed from: Q */
    public final void mo34Q(boolean z, Throwable th) {
        if (this.f269v.m230k(false, th) || z) {
            return;
        }
        AbstractC0069y.m109h(this.f26u, th);
    }

    @Override // p000A0.AbstractC0025a
    /* JADX INFO: renamed from: R */
    public final void mo35R(Object obj) {
        this.f269v.m230k(false, null);
    }

    /* JADX INFO: renamed from: T */
    public final void m253T(C0150o c0150o) {
        C0138c c0138c = this.f269v;
        c0138c.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0138c.f223B;
        while (!atomicReferenceFieldUpdater.compareAndSet(c0138c, null, c0150o)) {
            if (atomicReferenceFieldUpdater.get(c0138c) != null) {
                while (true) {
                    Object obj = atomicReferenceFieldUpdater.get(c0138c);
                    C0084j c0084j = AbstractC0140e.f249q;
                    if (obj != c0084j) {
                        if (obj == AbstractC0140e.f250r) {
                            throw new IllegalStateException("Another handler was already registered and successfully invoked");
                        }
                        throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                    }
                    C0084j c0084j2 = AbstractC0140e.f250r;
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(c0138c, c0084j, c0084j2)) {
                            c0150o.invoke(c0138c.m235p());
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(c0138c) == c0084j);
                }
            }
        }
    }

    @Override // p004C0.InterfaceC0153r
    /* JADX INFO: renamed from: a */
    public final Object mo223a(InterfaceC6348c interfaceC6348c) {
        return this.f269v.mo223a(interfaceC6348c);
    }

    @Override // p004C0.InterfaceC0153r
    /* JADX INFO: renamed from: b */
    public final Object mo224b() {
        return this.f269v.mo224b();
    }

    @Override // p004C0.InterfaceC0154s
    /* JADX INFO: renamed from: d */
    public final boolean mo225d(Throwable th) {
        return this.f269v.m230k(false, th);
    }

    @Override // p000A0.C0034e0, p000A0.InterfaceC0022X
    /* JADX INFO: renamed from: e */
    public final void mo29e(CancellationException cancellationException) {
        Object obj = C0034e0.f43s.get(this);
        if (obj instanceof C0055p) {
            return;
        }
        if ((obj instanceof C0032d0) && ((C0032d0) obj).m43e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo37p(), null, this);
        }
        mo61n(cancellationException);
    }

    @Override // p004C0.InterfaceC0154s
    /* JADX INFO: renamed from: g */
    public final Object mo227g(Object obj) {
        return this.f269v.mo227g(obj);
    }

    @Override // p004C0.InterfaceC0154s
    /* JADX INFO: renamed from: i */
    public final Object mo228i(InterfaceC6348c interfaceC6348c, Object obj) {
        return this.f269v.mo228i(interfaceC6348c, obj);
    }

    @Override // p000A0.C0034e0
    /* JADX INFO: renamed from: n */
    public final void mo61n(CancellationException cancellationException) {
        this.f269v.m230k(true, cancellationException);
        m60m(cancellationException);
    }
}
