package p008E0;

import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6465x;
import p001B.C0084j;
import p010F0.AbstractC0215a;
import p043a.AbstractC0878a;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;
import p064h0.EnumC6363a;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: E0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0205h {

    /* JADX INFO: renamed from: a */
    public static final C0084j f407a = new C0084j("NULL", 1);

    /* JADX INFO: renamed from: a */
    public static final Object m292a(InterfaceC6353h interfaceC6353h, Object obj, Object obj2, InterfaceC6502p interfaceC6502p, InterfaceC6348c frame) {
        Object objInvoke;
        Object objM306l = AbstractC0215a.m306l(interfaceC6353h, obj2);
        try {
            C0211n c0211n = new C0211n(frame, interfaceC6353h);
            if (interfaceC6502p == null) {
                objInvoke = AbstractC0878a.m1805r(interfaceC6502p, obj, c0211n);
            } else {
                AbstractC6465x.m12191a(2, interfaceC6502p);
                objInvoke = interfaceC6502p.invoke(obj, c0211n);
            }
            AbstractC0215a.m301g(interfaceC6353h, objM306l);
            if (objInvoke == EnumC6363a.f24419s) {
                AbstractC6452k.m12181e(frame, "frame");
            }
            return objInvoke;
        } catch (Throwable th) {
            AbstractC0215a.m301g(interfaceC6353h, objM306l);
            throw th;
        }
    }
}
