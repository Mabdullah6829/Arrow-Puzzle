package p006D0;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.AbstractC0069y;
import p000A0.C0057q;
import p004C0.EnumC0136a;
import p004C0.InterfaceC0152q;
import p008E0.AbstractC0205h;
import p008E0.C0199b;
import p008E0.C0201d;
import p008E0.C0210m;
import p008E0.InterfaceC0203f;
import p010F0.AbstractC0215a;
import p010F0.C0231q;
import p011H.AbstractC0271e0;
import p037U0.AbstractC0846b;
import p057d0.C6289k;
import p058e0.AbstractC6305m;
import p062g0.C6349d;
import p062g0.C6354i;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;
import p064h0.EnumC6363a;
import p066i0.AbstractC6379i;
import p078p0.InterfaceC6502p;

/* JADX INFO: renamed from: D0.d */
/* JADX INFO: loaded from: classes.dex */
public class C0169d implements InterfaceC0203f {

    /* JADX INFO: renamed from: s */
    public final InterfaceC6353h f304s;

    /* JADX INFO: renamed from: t */
    public final int f305t;

    /* JADX INFO: renamed from: u */
    public final EnumC0136a f306u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ int f307v;

    /* JADX INFO: renamed from: w */
    public final Object f308w;

    public C0169d(InterfaceC6353h interfaceC6353h, int i2, EnumC0136a enumC0136a) {
        this.f304s = interfaceC6353h;
        this.f305t = i2;
        this.f306u = enumC0136a;
    }

    /* JADX INFO: renamed from: a */
    public final Object m267a(InterfaceC0171f interfaceC0171f, InterfaceC6348c interfaceC6348c) {
        C0199b c0199b = new C0199b(interfaceC0171f, this, null);
        C0231q c0231q = new C0231q(interfaceC6348c, interfaceC6348c.getContext());
        Object objM1756o = AbstractC0846b.m1756o(c0231q, c0231q, c0199b);
        return objM1756o == EnumC6363a.f24419s ? objM1756o : C6289k.f24318a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // p008E0.InterfaceC0203f
    /* JADX INFO: renamed from: b */
    public final InterfaceC0170e mo258b(InterfaceC6353h interfaceC6353h, int i2, EnumC0136a enumC0136a) {
        InterfaceC6353h interfaceC6353h2 = this.f304s;
        InterfaceC6353h interfaceC6353hPlus = interfaceC6353h.plus(interfaceC6353h2);
        EnumC0136a enumC0136a2 = EnumC0136a.f215s;
        EnumC0136a enumC0136a3 = this.f306u;
        int i3 = this.f305t;
        if (enumC0136a == enumC0136a2) {
            if (i3 != -3) {
                if (i2 == -3) {
                    i2 = i3;
                } else if (i3 != -2) {
                    if (i2 == -2) {
                        i2 = i3;
                    } else {
                        i2 += i3;
                        if (i2 < 0) {
                            i2 = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            enumC0136a = enumC0136a3;
        }
        return (AbstractC6452k.m12177a(interfaceC6353hPlus, interfaceC6353h2) && i2 == i3 && enumC0136a == enumC0136a3) ? this : mo266d(interfaceC6353hPlus, i2, enumC0136a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [i0.i, p0.p] */
    /* JADX INFO: renamed from: c */
    public Object mo265c(InterfaceC0152q interfaceC0152q, InterfaceC6348c interfaceC6348c) {
        switch (this.f307v) {
            case 0:
                Object objInvoke = ((AbstractC6379i) this.f308w).invoke(interfaceC0152q, interfaceC6348c);
                return objInvoke == EnumC6363a.f24419s ? objInvoke : C6289k.f24318a;
            default:
                Object objCollect = ((InterfaceC0170e) this.f308w).collect(new C0210m(interfaceC0152q), interfaceC6348c);
                EnumC6363a enumC6363a = EnumC6363a.f24419s;
                C6289k c6289k = C6289k.f24318a;
                if (objCollect != enumC6363a) {
                    objCollect = c6289k;
                }
                return objCollect == enumC6363a ? objCollect : c6289k;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // p006D0.InterfaceC0170e
    public Object collect(InterfaceC0171f interfaceC0171f, InterfaceC6348c interfaceC6348c) {
        Object objM267a;
        switch (this.f307v) {
            case 1:
                int i2 = this.f305t;
                C6289k c6289k = C6289k.f24318a;
                if (i2 == -3) {
                    InterfaceC6353h context = interfaceC6348c.getContext();
                    Boolean bool = Boolean.FALSE;
                    C0057q c0057q = new C0057q(0);
                    InterfaceC6353h interfaceC6353h = this.f304s;
                    InterfaceC6353h interfaceC6353hPlus = !((Boolean) interfaceC6353h.fold(bool, c0057q)).booleanValue() ? context.plus(interfaceC6353h) : AbstractC0069y.m105d(context, interfaceC6353h, false);
                    if (AbstractC6452k.m12177a(interfaceC6353hPlus, context)) {
                        objM267a = ((InterfaceC0170e) this.f308w).collect(interfaceC0171f, interfaceC6348c);
                        EnumC6363a enumC6363a = EnumC6363a.f24419s;
                        if (objM267a != enumC6363a) {
                            objM267a = c6289k;
                        }
                        if (objM267a != enumC6363a) {
                            return c6289k;
                        }
                    } else {
                        C6349d c6349d = C6349d.f24408s;
                        if (AbstractC6452k.m12177a(interfaceC6353hPlus.get(c6349d), context.get(c6349d))) {
                            InterfaceC6353h context2 = interfaceC6348c.getContext();
                            if (!(interfaceC0171f instanceof C0210m)) {
                                interfaceC0171f = new C0183r(interfaceC0171f, context2);
                            }
                            objM267a = AbstractC0205h.m292a(interfaceC6353hPlus, interfaceC0171f, AbstractC0215a.m305k(interfaceC6353hPlus), new C0201d(this, null), interfaceC6348c);
                            if (objM267a != EnumC6363a.f24419s) {
                                return c6289k;
                            }
                        } else {
                            objM267a = m267a(interfaceC0171f, interfaceC6348c);
                            if (objM267a != EnumC6363a.f24419s) {
                                return c6289k;
                            }
                        }
                    }
                } else {
                    objM267a = m267a(interfaceC0171f, interfaceC6348c);
                    if (objM267a != EnumC6363a.f24419s) {
                        return c6289k;
                    }
                }
                return objM267a;
            default:
                return m267a(interfaceC0171f, interfaceC6348c);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [i0.i, p0.p] */
    /* JADX INFO: renamed from: d */
    public C0169d mo266d(InterfaceC6353h interfaceC6353h, int i2, EnumC0136a enumC0136a) {
        switch (this.f307v) {
            case 0:
                return new C0169d((InterfaceC6502p) this.f308w, interfaceC6353h, i2, enumC0136a);
            default:
                return new C0169d((InterfaceC0170e) this.f308w, interfaceC6353h, i2, enumC0136a);
        }
    }

    /* JADX INFO: renamed from: e */
    public final String m268e() {
        ArrayList arrayList = new ArrayList(4);
        C6354i c6354i = C6354i.f24409s;
        InterfaceC6353h interfaceC6353h = this.f304s;
        if (interfaceC6353h != c6354i) {
            arrayList.add("context=" + interfaceC6353h);
        }
        int i2 = this.f305t;
        if (i2 != -3) {
            arrayList.add("capacity=" + i2);
        }
        EnumC0136a enumC0136a = EnumC0136a.f215s;
        EnumC0136a enumC0136a2 = this.f306u;
        if (enumC0136a2 != enumC0136a) {
            arrayList.add("onBufferOverflow=" + enumC0136a2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return AbstractC0271e0.m401i(sb, AbstractC6305m.m12105A(arrayList, ", ", null, null, null, 62), ']');
    }

    public final String toString() {
        switch (this.f307v) {
            case 0:
                return "block[" + ((AbstractC6379i) this.f308w) + "] -> " + m268e();
            default:
                return ((InterfaceC0170e) this.f308w) + " -> " + m268e();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0169d(InterfaceC0170e interfaceC0170e, InterfaceC6353h interfaceC6353h, int i2, EnumC0136a enumC0136a) {
        this(interfaceC6353h, i2, enumC0136a);
        this.f307v = 1;
        this.f308w = interfaceC0170e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0169d(InterfaceC6502p interfaceC6502p, InterfaceC6353h interfaceC6353h, int i2, EnumC0136a enumC0136a) {
        this(interfaceC6353h, i2, enumC0136a);
        this.f307v = 0;
        this.f308w = (AbstractC6379i) interfaceC6502p;
    }
}
