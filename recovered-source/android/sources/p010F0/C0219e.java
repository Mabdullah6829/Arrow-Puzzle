package p010F0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p000A0.AbstractC0005F;
import p000A0.AbstractC0014O;
import p000A0.AbstractC0054o0;
import p000A0.AbstractC0063t;
import p000A0.AbstractC0069y;
import p000A0.C0055p;
import p057d0.AbstractC6285g;
import p058e0.C6301i;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;
import p066i0.InterfaceC6374d;

/* JADX INFO: renamed from: F0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0219e extends AbstractC0005F implements InterfaceC6374d, InterfaceC6348c {

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f434z = AtomicReferenceFieldUpdater.newUpdater(C0219e.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: v */
    public final AbstractC0063t f435v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC6348c f436w;

    /* JADX INFO: renamed from: x */
    public Object f437x;

    /* JADX INFO: renamed from: y */
    public final Object f438y;

    public C0219e(AbstractC0063t abstractC0063t, InterfaceC6348c interfaceC6348c) {
        super(-1);
        this.f435v = abstractC0063t;
        this.f436w = interfaceC6348c;
        this.f437x = AbstractC0215a.f424b;
        this.f438y = AbstractC0215a.m305k(interfaceC6348c.getContext());
    }

    @Override // p066i0.InterfaceC6374d
    public final InterfaceC6374d getCallerFrame() {
        InterfaceC6348c interfaceC6348c = this.f436w;
        if (interfaceC6348c instanceof InterfaceC6374d) {
            return (InterfaceC6374d) interfaceC6348c;
        }
        return null;
    }

    @Override // p062g0.InterfaceC6348c
    public final InterfaceC6353h getContext() {
        return this.f436w.getContext();
    }

    @Override // p000A0.AbstractC0005F
    /* JADX INFO: renamed from: h */
    public final Object mo9h() {
        Object obj = this.f437x;
        this.f437x = AbstractC0215a.f424b;
        return obj;
    }

    @Override // p062g0.InterfaceC6348c
    public final void resumeWith(Object obj) {
        Throwable thM12075a = AbstractC6285g.m12075a(obj);
        Object c0055p = thM12075a == null ? obj : new C0055p(false, thM12075a);
        InterfaceC6348c interfaceC6348c = this.f436w;
        InterfaceC6353h context = interfaceC6348c.getContext();
        AbstractC0063t abstractC0063t = this.f435v;
        if (abstractC0063t.isDispatchNeeded(context)) {
            this.f437x = c0055p;
            this.f2u = 0;
            abstractC0063t.dispatch(interfaceC6348c.getContext(), this);
            return;
        }
        AbstractC0014O abstractC0014OM97a = AbstractC0054o0.m97a();
        if (abstractC0014OM97a.f15s >= 4294967296L) {
            this.f437x = c0055p;
            this.f2u = 0;
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
            InterfaceC6353h context2 = interfaceC6348c.getContext();
            Object objM306l = AbstractC0215a.m306l(context2, this.f438y);
            try {
                interfaceC6348c.resumeWith(obj);
                AbstractC0215a.m301g(context2, objM306l);
                while (abstractC0014OM97a.m23p()) {
                }
            } catch (Throwable th) {
                AbstractC0215a.m301g(context2, objM306l);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                m8g(th2);
            } finally {
                abstractC0014OM97a.m20j(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f435v + ", " + AbstractC0069y.m116o(this.f436w) + ']';
    }

    @Override // p000A0.AbstractC0005F
    /* JADX INFO: renamed from: c */
    public final InterfaceC6348c mo5c() {
        return this;
    }
}
