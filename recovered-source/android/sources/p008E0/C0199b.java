package p008E0;

import p000A0.AbstractC0069y;
import p000A0.EnumC0067w;
import p000A0.InterfaceC0066v;
import p004C0.C0151p;
import p004C0.EnumC0136a;
import p006D0.AbstractC0163C;
import p006D0.C0169d;
import p006D0.InterfaceC0171f;
import p011H.AbstractC0243G;
import p043a.AbstractC0878a;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: E0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0199b extends AbstractC6379i implements InterfaceC6502p {

    /* JADX INFO: renamed from: s */
    public int f394s;

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f395t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC0171f f396u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C0169d f397v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0199b(InterfaceC0171f interfaceC0171f, C0169d c0169d, InterfaceC6348c interfaceC6348c) {
        super(2, interfaceC6348c);
        this.f396u = interfaceC0171f;
        this.f397v = c0169d;
    }

    @Override // p066i0.AbstractC6371a
    public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
        C0199b c0199b = new C0199b(this.f396u, this.f397v, interfaceC6348c);
        c0199b.f395t = obj;
        return c0199b;
    }

    @Override // p078p0.InterfaceC6502p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0199b) create((InterfaceC0066v) obj, (InterfaceC6348c) obj2)).invokeSuspend(C6289k.f24318a);
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i2 = this.f394s;
        C6289k c6289k = C6289k.f24318a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0243G.m377o(obj);
            return c6289k;
        }
        AbstractC0243G.m377o(obj);
        InterfaceC0066v interfaceC0066v = (InterfaceC0066v) this.f395t;
        C0169d c0169d = this.f397v;
        InterfaceC6353h interfaceC6353h = c0169d.f304s;
        int i3 = c0169d.f305t;
        if (i3 == -3) {
            i3 = -2;
        }
        EnumC0136a enumC0136a = c0169d.f306u;
        EnumC0067w enumC0067w = EnumC0067w.f83u;
        InterfaceC6502p c0200c = new C0200c(c0169d, null);
        C0151p c0151p = new C0151p(AbstractC0069y.m112k(interfaceC0066v, interfaceC6353h), AbstractC0878a.m1795a(i3, enumC0136a, 4));
        c0151p.m36S(enumC0067w, c0151p, c0200c);
        this.f394s = 1;
        Object objM261c = AbstractC0163C.m261c(this.f396u, c0151p, true, this);
        if (objM261c != enumC6363a) {
            objM261c = c6289k;
        }
        return objM261c == enumC6363a ? enumC6363a : c6289k;
    }
}
