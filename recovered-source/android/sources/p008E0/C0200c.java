package p008E0;

import p004C0.InterfaceC0152q;
import p006D0.C0169d;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: E0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0200c extends AbstractC6379i implements InterfaceC6502p {

    /* JADX INFO: renamed from: s */
    public int f398s;

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f399t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ C0169d f400u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0200c(C0169d c0169d, InterfaceC6348c interfaceC6348c) {
        super(2, interfaceC6348c);
        this.f400u = c0169d;
    }

    @Override // p066i0.AbstractC6371a
    public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
        C0200c c0200c = new C0200c(this.f400u, interfaceC6348c);
        c0200c.f399t = obj;
        return c0200c;
    }

    @Override // p078p0.InterfaceC6502p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0200c) create((InterfaceC0152q) obj, (InterfaceC6348c) obj2)).invokeSuspend(C6289k.f24318a);
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i2 = this.f398s;
        if (i2 == 0) {
            AbstractC0243G.m377o(obj);
            InterfaceC0152q interfaceC0152q = (InterfaceC0152q) this.f399t;
            this.f398s = 1;
            if (this.f400u.mo265c(interfaceC0152q, this) == enumC6363a) {
                return enumC6363a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0243G.m377o(obj);
        }
        return C6289k.f24318a;
    }
}
