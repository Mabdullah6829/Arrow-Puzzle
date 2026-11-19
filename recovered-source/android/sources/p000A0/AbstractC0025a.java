package p000A0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6465x;
import kotlinx.coroutines.CompletionHandlerException;
import p010F0.AbstractC0215a;
import p011H.AbstractC0243G;
import p043a.AbstractC0878a;
import p057d0.AbstractC6285g;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;
import p064h0.EnumC6363a;
import p066i0.AbstractC6371a;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: A0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0025a extends C0034e0 implements InterfaceC6348c, InterfaceC0066v {

    /* JADX INFO: renamed from: u */
    public final InterfaceC6353h f26u;

    public AbstractC0025a(InterfaceC6353h interfaceC6353h, boolean z) {
        super(z);
        m47B((InterfaceC0022X) interfaceC6353h.get(C0065u.f80t));
        this.f26u = interfaceC6353h.plus(this);
    }

    @Override // p000A0.C0034e0
    /* JADX INFO: renamed from: A */
    public final void mo32A(CompletionHandlerException completionHandlerException) {
        AbstractC0069y.m109h(this.f26u, completionHandlerException);
    }

    @Override // p000A0.C0034e0
    /* JADX INFO: renamed from: I */
    public final void mo33I(Object obj) {
        if (!(obj instanceof C0055p)) {
            mo35R(obj);
            return;
        }
        C0055p c0055p = (C0055p) obj;
        mo34Q(C0055p.f67b.get(c0055p) != 0, c0055p.f68a);
    }

    /* JADX INFO: renamed from: S */
    public final void m36S(EnumC0067w enumC0067w, AbstractC0025a abstractC0025a, InterfaceC6502p interfaceC6502p) {
        Object objInvoke;
        int iOrdinal = enumC0067w.ordinal();
        C6289k c6289k = C6289k.f24318a;
        if (iOrdinal == 0) {
            try {
                AbstractC0215a.m302h(AbstractC0878a.m1802m(AbstractC0878a.m1798g(abstractC0025a, this, interfaceC6502p)), c6289k);
                return;
            } catch (Throwable th) {
                resumeWith(AbstractC0243G.m372j(th));
                throw th;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                AbstractC6452k.m12181e(interfaceC6502p, "<this>");
                AbstractC0878a.m1802m(AbstractC0878a.m1798g(abstractC0025a, this, interfaceC6502p)).resumeWith(c6289k);
                return;
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                InterfaceC6353h interfaceC6353h = this.f26u;
                Object objM306l = AbstractC0215a.m306l(interfaceC6353h, null);
                try {
                    if (interfaceC6502p instanceof AbstractC6371a) {
                        AbstractC6465x.m12191a(2, interfaceC6502p);
                        objInvoke = interfaceC6502p.invoke(abstractC0025a, this);
                    } else {
                        objInvoke = AbstractC0878a.m1805r(interfaceC6502p, abstractC0025a, this);
                    }
                    AbstractC0215a.m301g(interfaceC6353h, objM306l);
                    if (objInvoke != EnumC6363a.f24419s) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th2) {
                    AbstractC0215a.m301g(interfaceC6353h, objM306l);
                    throw th2;
                }
            } catch (Throwable th3) {
                resumeWith(AbstractC0243G.m372j(th3));
            }
        }
    }

    @Override // p062g0.InterfaceC6348c
    public final InterfaceC6353h getContext() {
        return this.f26u;
    }

    @Override // p000A0.InterfaceC0066v
    public final InterfaceC6353h getCoroutineContext() {
        return this.f26u;
    }

    @Override // p000A0.C0034e0
    /* JADX INFO: renamed from: p */
    public final String mo37p() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // p062g0.InterfaceC6348c
    public final void resumeWith(Object obj) {
        Throwable thM12075a = AbstractC6285g.m12075a(obj);
        if (thM12075a != null) {
            obj = new C0055p(false, thM12075a);
        }
        Object objM51F = m51F(obj);
        if (objM51F == AbstractC0069y.f90e) {
            return;
        }
        mo3l(objM51F);
    }

    /* JADX INFO: renamed from: R */
    public void mo35R(Object obj) {
    }

    /* JADX INFO: renamed from: Q */
    public void mo34Q(boolean z, Throwable th) {
    }
}
