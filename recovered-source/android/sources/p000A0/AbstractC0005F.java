package p000A0;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC6452k;
import p010F0.AbstractC0215a;
import p010F0.C0219e;
import p011H.AbstractC0243G;
import p012H0.AbstractRunnableC0306i;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;

/* JADX INFO: renamed from: A0.F */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0005F extends AbstractRunnableC0306i {

    /* JADX INFO: renamed from: u */
    public int f2u;

    public AbstractC0005F(int i2) {
        super(false, 0L);
        this.f2u = i2;
    }

    /* JADX INFO: renamed from: c */
    public abstract InterfaceC6348c mo5c();

    /* JADX INFO: renamed from: d */
    public Throwable mo6d(Object obj) {
        C0055p c0055p = obj instanceof C0055p ? (C0055p) obj : null;
        if (c0055p != null) {
            return c0055p.f68a;
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final void m8g(Throwable th) {
        AbstractC0069y.m109h(mo5c().getContext(), new C0068x("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX INFO: renamed from: h */
    public abstract Object mo9h();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC6348c interfaceC6348cMo5c = mo5c();
            AbstractC6452k.m12179c(interfaceC6348cMo5c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C0219e c0219e = (C0219e) interfaceC6348cMo5c;
            InterfaceC6348c interfaceC6348c = c0219e.f436w;
            Object obj = c0219e.f438y;
            InterfaceC6353h context = interfaceC6348c.getContext();
            Object objM306l = AbstractC0215a.m306l(context, obj);
            InterfaceC0022X interfaceC0022X = null;
            C0060r0 c0060r0M118q = objM306l != AbstractC0215a.f426d ? AbstractC0069y.m118q(interfaceC6348c, context, objM306l) : null;
            try {
                InterfaceC6353h context2 = interfaceC6348c.getContext();
                Object objMo9h = mo9h();
                Throwable thMo6d = mo6d(objMo9h);
                if (thMo6d == null) {
                    int i2 = this.f2u;
                    boolean z = true;
                    if (i2 != 1 && i2 != 2) {
                        z = false;
                    }
                    if (z) {
                        interfaceC0022X = (InterfaceC0022X) context2.get(C0065u.f80t);
                    }
                }
                if (interfaceC0022X != null && !interfaceC0022X.mo28c()) {
                    CancellationException cancellationExceptionM67u = ((C0034e0) interfaceC0022X).m67u();
                    mo4b(cancellationExceptionM67u);
                    interfaceC6348c.resumeWith(AbstractC0243G.m372j(cancellationExceptionM67u));
                } else if (thMo6d != null) {
                    interfaceC6348c.resumeWith(AbstractC0243G.m372j(thMo6d));
                } else {
                    interfaceC6348c.resumeWith(mo7e(objMo9h));
                }
            } finally {
                if (c0060r0M118q == null || c0060r0M118q.m100T()) {
                    AbstractC0215a.m301g(context, objM306l);
                }
            }
        } catch (Throwable th) {
            m8g(th);
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo4b(CancellationException cancellationException) {
    }

    /* JADX INFO: renamed from: e */
    public Object mo7e(Object obj) {
        return obj;
    }
}
