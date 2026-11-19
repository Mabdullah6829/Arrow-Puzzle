package p000A0;

import p043a.AbstractC0878a;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;

/* JADX INFO: renamed from: A0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0051n extends C0034e0 implements InterfaceC0049m {
    /* JADX INFO: renamed from: Q */
    public final Object m95Q(InterfaceC6348c interfaceC6348c) {
        Object obj;
        Object objM117p;
        do {
            obj = C0034e0.f43s.get(this);
            if (!(obj instanceof InterfaceC0018T)) {
                if (obj instanceof C0055p) {
                    throw ((C0055p) obj).f68a;
                }
                objM117p = AbstractC0069y.m117p(obj);
            }
            EnumC6363a enumC6363a = EnumC6363a.f24419s;
            return objM117p;
        } while (m56M(obj) < 0);
        C0028b0 c0028b0 = new C0028b0(AbstractC0878a.m1802m(interfaceC6348c), this);
        c0028b0.m86r();
        c0028b0.m89u(new C0033e(AbstractC0069y.m110i(this, true, new C0043j(c0028b0, 2)), 2));
        objM117p = c0028b0.m85q();
        EnumC6363a enumC6363a2 = EnumC6363a.f24419s;
        EnumC6363a enumC6363a3 = EnumC6363a.f24419s;
        return objM117p;
    }
}
