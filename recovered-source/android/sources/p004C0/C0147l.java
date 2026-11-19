package p004C0;

import p000A0.InterfaceC0066v;
import p011H.AbstractC0243G;
import p057d0.AbstractC6285g;
import p057d0.C6284f;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: C0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0147l extends AbstractC6379i implements InterfaceC6502p {

    /* JADX INFO: renamed from: s */
    public int f260s;

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f261t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC0154s f262u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ Object f263v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0147l(InterfaceC0154s interfaceC0154s, Object obj, InterfaceC6348c interfaceC6348c) {
        super(2, interfaceC6348c);
        this.f262u = interfaceC0154s;
        this.f263v = obj;
    }

    @Override // p066i0.AbstractC6371a
    public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
        C0147l c0147l = new C0147l(this.f262u, this.f263v, interfaceC6348c);
        c0147l.f261t = obj;
        return c0147l;
    }

    @Override // p078p0.InterfaceC6502p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0147l) create((InterfaceC0066v) obj, (InterfaceC6348c) obj2)).invokeSuspend(C6289k.f24318a);
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM372j;
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i2 = this.f260s;
        Object c0143h = C6289k.f24318a;
        try {
            if (i2 == 0) {
                AbstractC0243G.m377o(obj);
                InterfaceC0154s interfaceC0154s = this.f262u;
                Object obj2 = this.f263v;
                this.f260s = 1;
                if (interfaceC0154s.mo228i(this, obj2) == enumC6363a) {
                    return enumC6363a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0243G.m377o(obj);
            }
            objM372j = c0143h;
        } catch (Throwable th) {
            objM372j = AbstractC0243G.m372j(th);
        }
        if (objM372j instanceof C6284f) {
            c0143h = new C0143h(AbstractC6285g.m12075a(objM372j));
        }
        return new C0145j(c0143h);
    }
}
