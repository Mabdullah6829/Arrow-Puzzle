package p008E0;

import p006D0.InterfaceC0171f;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: E0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0212o extends AbstractC6379i implements InterfaceC6502p {

    /* JADX INFO: renamed from: s */
    public int f419s;

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f420t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC0171f f421u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0212o(InterfaceC0171f interfaceC0171f, InterfaceC6348c interfaceC6348c) {
        super(2, interfaceC6348c);
        this.f421u = interfaceC0171f;
    }

    @Override // p066i0.AbstractC6371a
    public final InterfaceC6348c create(Object obj, InterfaceC6348c interfaceC6348c) {
        C0212o c0212o = new C0212o(this.f421u, interfaceC6348c);
        c0212o.f420t = obj;
        return c0212o;
    }

    @Override // p078p0.InterfaceC6502p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0212o) create(obj, (InterfaceC6348c) obj2)).invokeSuspend(C6289k.f24318a);
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC6363a enumC6363a = EnumC6363a.f24419s;
        int i2 = this.f419s;
        if (i2 == 0) {
            AbstractC0243G.m377o(obj);
            Object obj2 = this.f420t;
            this.f419s = 1;
            if (this.f421u.emit(obj2, this) == enumC6363a) {
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
