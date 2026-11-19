package p000A0;

import p010F0.AbstractC0215a;
import p010F0.C0231q;
import p057d0.C6283e;
import p062g0.C6349d;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;

/* JADX INFO: renamed from: A0.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0060r0 extends C0231q {
    private volatile boolean threadLocalIsSet;

    /* JADX INFO: renamed from: w */
    public final ThreadLocal f75w;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0060r0(InterfaceC6348c interfaceC6348c, InterfaceC6353h interfaceC6353h) {
        C0062s0 c0062s0 = C0062s0.f78s;
        super(interfaceC6348c, interfaceC6353h.get(c0062s0) == null ? interfaceC6353h.plus(c0062s0) : interfaceC6353h);
        this.f75w = new ThreadLocal();
        if (interfaceC6348c.getContext().get(C6349d.f24408s) instanceof AbstractC0063t) {
            return;
        }
        Object objM306l = AbstractC0215a.m306l(interfaceC6353h, null);
        AbstractC0215a.m301g(interfaceC6353h, objM306l);
        m101U(interfaceC6353h, objM306l);
    }

    /* JADX INFO: renamed from: T */
    public final boolean m100T() {
        boolean z = this.threadLocalIsSet && this.f75w.get() == null;
        this.f75w.remove();
        return !z;
    }

    /* JADX INFO: renamed from: U */
    public final void m101U(InterfaceC6353h interfaceC6353h, Object obj) {
        this.threadLocalIsSet = true;
        this.f75w.set(new C6283e(interfaceC6353h, obj));
    }

    @Override // p010F0.C0231q, p000A0.C0034e0
    /* JADX INFO: renamed from: l */
    public final void mo3l(Object obj) {
        if (this.threadLocalIsSet) {
            C6283e c6283e = (C6283e) this.f75w.get();
            if (c6283e != null) {
                AbstractC0215a.m301g((InterfaceC6353h) c6283e.f24308s, c6283e.f24309t);
            }
            this.f75w.remove();
        }
        Object objM113l = AbstractC0069y.m113l(obj);
        InterfaceC6348c interfaceC6348c = this.f464v;
        InterfaceC6353h context = interfaceC6348c.getContext();
        Object objM306l = AbstractC0215a.m306l(context, null);
        C0060r0 c0060r0M118q = objM306l != AbstractC0215a.f426d ? AbstractC0069y.m118q(interfaceC6348c, context, objM306l) : null;
        try {
            this.f464v.resumeWith(objM113l);
        } finally {
            if (c0060r0M118q == null || c0060r0M118q.m100T()) {
                AbstractC0215a.m301g(context, objM306l);
            }
        }
    }
}
