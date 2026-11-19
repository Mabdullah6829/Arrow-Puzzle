package p006D0;

import kotlin.jvm.internal.C6462u;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import p011H.AbstractC0243G;
import p057d0.C6289k;
import p062g0.InterfaceC6348c;
import p064h0.EnumC6363a;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: D0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0181p implements InterfaceC0171f {

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ int f346s = 0;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC0171f f347t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Object f348u;

    public C0181p(InterfaceC0171f interfaceC0171f, C6462u c6462u) {
        this.f347t = interfaceC0171f;
        this.f348u = c6462u;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0093  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p006D0.InterfaceC0171f
    public final Object emit(Object obj, InterfaceC6348c interfaceC6348c) throws Throwable {
        C0180o c0180o;
        C0181p c0181p;
        C0185t c0185t;
        Object obj2;
        Object obj3;
        C0181p c0181p2;
        switch (this.f346s) {
            case 0:
                if (interfaceC6348c instanceof C0180o) {
                    c0180o = (C0180o) interfaceC6348c;
                    int i2 = c0180o.f345v;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0180o.f345v = i2 - Integer.MIN_VALUE;
                    } else {
                        c0180o = new C0180o(this, interfaceC6348c);
                    }
                } else {
                    c0180o = new C0180o(this, interfaceC6348c);
                }
                Object obj4 = c0180o.f343t;
                EnumC6363a enumC6363a = EnumC6363a.f24419s;
                int i3 = c0180o.f345v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0181p = c0180o.f342s;
                    try {
                        AbstractC0243G.m377o(obj4);
                        return C6289k.f24318a;
                    } catch (Throwable th) {
                        th = th;
                        ((C6462u) c0181p.f348u).f24636s = th;
                        throw th;
                    }
                }
                AbstractC0243G.m377o(obj4);
                try {
                    InterfaceC0171f interfaceC0171f = this.f347t;
                    c0180o.f342s = this;
                    c0180o.f345v = 1;
                    if (interfaceC0171f.emit(obj, c0180o) == enumC6363a) {
                        return enumC6363a;
                    }
                    return C6289k.f24318a;
                } catch (Throwable th2) {
                    th = th2;
                    c0181p = this;
                    ((C6462u) c0181p.f348u).f24636s = th;
                    throw th;
                }
            default:
                if (interfaceC6348c instanceof C0185t) {
                    c0185t = (C0185t) interfaceC6348c;
                    int i4 = c0185t.f364u;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c0185t.f364u = i4 - Integer.MIN_VALUE;
                    } else {
                        c0185t = new C0185t(this, interfaceC6348c);
                    }
                } else {
                    c0185t = new C0185t(this, interfaceC6348c);
                }
                Object obj5 = c0185t.f363t;
                EnumC6363a enumC6363a2 = EnumC6363a.f24419s;
                int i5 = c0185t.f364u;
                boolean z = true;
                if (i5 != 0) {
                    if (i5 == 1) {
                        Object obj6 = c0185t.f366w;
                        C0181p c0181p3 = c0185t.f362s;
                        AbstractC0243G.m377o(obj5);
                        obj3 = obj6;
                        c0181p2 = c0181p3;
                        obj2 = obj5;
                    } else {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0181p2 = c0185t.f362s;
                        AbstractC0243G.m377o(obj5);
                    }
                    if (z) {
                        return C6289k.f24318a;
                    }
                    throw new AbortFlowException(c0181p2);
                }
                AbstractC0243G.m377o(obj5);
                InterfaceC6502p interfaceC6502p = (InterfaceC6502p) this.f348u;
                c0185t.f362s = this;
                c0185t.f366w = obj;
                c0185t.f364u = 1;
                Object objInvoke = interfaceC6502p.invoke(obj, c0185t);
                if (objInvoke == enumC6363a2) {
                    return enumC6363a2;
                }
                obj2 = objInvoke;
                obj3 = obj;
                c0181p2 = this;
                if (((Boolean) obj2).booleanValue()) {
                    InterfaceC0171f interfaceC0171f2 = c0181p2.f347t;
                    c0185t.f362s = c0181p2;
                    c0185t.f366w = null;
                    c0185t.f364u = 2;
                    if (interfaceC0171f2.emit(obj3, c0185t) == enumC6363a2) {
                        return enumC6363a2;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    return C6289k.f24318a;
                }
                throw new AbortFlowException(c0181p2);
        }
    }

    public C0181p(InterfaceC6502p interfaceC6502p, InterfaceC0171f interfaceC0171f) {
        this.f348u = interfaceC6502p;
        this.f347t = interfaceC0171f;
    }
}
