package p008E0;

import p006D0.C0169d;
import p006D0.InterfaceC0170e;
import p006D0.InterfaceC0171f;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: E0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0201d extends AbstractC6379i implements InterfaceC6502p {

    /* JADX INFO: renamed from: s */
    public int f401s;

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f402t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C0169d f403u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0201d(C0169d c0169d, InterfaceC6348c interfaceC6348c) {
        super(2, interfaceC6348c);
        this.f403u = c0169d;
    }

    @Override // p066i0.AbstractC6371a
    public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
        C0201d c0201d = new C0201d(this.f403u, interfaceC6348c);
        c0201d.f402t = obj;
        return c0201d;
    }

    @Override // p078p0.InterfaceC6502p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0201d) create((InterfaceC0171f) obj, (InterfaceC6348c) obj2)).invokeSuspend(C6289k.f24318a);
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i2 = this.f401s;
        C6289k c6289k = C6289k.f24318a;
        if (i2 == 0) {
            AbstractC0243G.m377o(obj);
            InterfaceC0171f interfaceC0171f = (InterfaceC0171f) this.f402t;
            this.f401s = 1;
            Object objCollect = ((InterfaceC0170e) this.f403u.f308w).collect(interfaceC0171f, this);
            if (objCollect != enumC6363a) {
                objCollect = c6289k;
            }
            if (objCollect == enumC6363a) {
                return enumC6363a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0243G.m377o(obj);
        }
        return c6289k;
    }
}
