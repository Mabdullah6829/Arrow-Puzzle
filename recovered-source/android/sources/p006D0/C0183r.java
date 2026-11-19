package p006D0;

import kotlin.jvm.internal.C6459r;
import p008E0.AbstractC0205h;
import p008E0.C0212o;
import p010F0.AbstractC0215a;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;
import p064h0.EnumC6363a;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: D0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0183r implements InterfaceC0171f {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f354s = 1;

    /* JADX INFO: renamed from: t */
    public final Object f355t;

    /* JADX INFO: renamed from: u */
    public final Object f356u;

    /* JADX INFO: renamed from: v */
    public final InterfaceC6502p f357v;

    public C0183r(C6459r c6459r, InterfaceC0171f interfaceC0171f, InterfaceC6502p interfaceC6502p) {
        this.f355t = c6459r;
        this.f356u = interfaceC0171f;
        this.f357v = interfaceC6502p;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // p006D0.InterfaceC0171f
    public final Object emit(Object obj, InterfaceC6348c interfaceC6348c) throws Throwable {
        C0182q c0182q;
        C0183r c0183r;
        InterfaceC0171f interfaceC0171f;
        switch (this.f354s) {
            case 0:
                if (interfaceC6348c instanceof C0182q) {
                    c0182q = (C0182q) interfaceC6348c;
                    int i2 = c0182q.f353w;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0182q.f353w = i2 - Integer.MIN_VALUE;
                    } else {
                        c0182q = new C0182q(this, interfaceC6348c);
                    }
                } else {
                    c0182q = new C0182q(this, interfaceC6348c);
                }
                Object objInvoke = c0182q.f351u;
                EnumC6363a enumC6363a = EnumC6363a.f24419s;
                int i3 = c0182q.f353w;
                C6289k c6289k = C6289k.f24318a;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            obj = c0182q.f350t;
                            c0183r = c0182q.f349s;
                            AbstractC0243G.m377o(objInvoke);
                            if (!((Boolean) objInvoke).booleanValue()) {
                                ((C6459r) c0183r.f355t).f24633s = true;
                                interfaceC0171f = (InterfaceC0171f) c0183r.f356u;
                                c0182q.f349s = null;
                                c0182q.f350t = null;
                                c0182q.f353w = 3;
                                if (interfaceC0171f.emit(obj, c0182q) == enumC6363a) {
                                    return enumC6363a;
                                }
                            }
                        } else if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    AbstractC0243G.m377o(objInvoke);
                } else {
                    AbstractC0243G.m377o(objInvoke);
                    if (((C6459r) this.f355t).f24633s) {
                        InterfaceC0171f interfaceC0171f2 = (InterfaceC0171f) this.f356u;
                        c0182q.f353w = 1;
                        if (interfaceC0171f2.emit(obj, c0182q) == enumC6363a) {
                            return enumC6363a;
                        }
                    } else {
                        c0182q.f349s = this;
                        c0182q.f350t = obj;
                        c0182q.f353w = 2;
                        objInvoke = this.f357v.invoke(obj, c0182q);
                        if (objInvoke == enumC6363a) {
                            return enumC6363a;
                        }
                        c0183r = this;
                        if (!((Boolean) objInvoke).booleanValue()) {
                            ((C6459r) c0183r.f355t).f24633s = true;
                            interfaceC0171f = (InterfaceC0171f) c0183r.f356u;
                            c0182q.f349s = null;
                            c0182q.f350t = null;
                            c0182q.f353w = 3;
                            if (interfaceC0171f.emit(obj, c0182q) == enumC6363a) {
                                return enumC6363a;
                            }
                        }
                    }
                }
                return c6289k;
            default:
                Object objM292a = AbstractC0205h.m292a((InterfaceC6353h) this.f355t, obj, this.f356u, (C0212o) this.f357v, interfaceC6348c);
                return objM292a == EnumC6363a.f24419s ? objM292a : C6289k.f24318a;
        }
    }

    public C0183r(InterfaceC0171f interfaceC0171f, InterfaceC6353h interfaceC6353h) {
        this.f355t = interfaceC6353h;
        this.f356u = AbstractC0215a.m305k(interfaceC6353h);
        this.f357v = new C0212o(interfaceC0171f, null);
    }
}
