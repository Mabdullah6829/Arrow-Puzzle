package p008E0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6452k;
import p000A0.C0034e0;
import p000A0.C0057q;
import p000A0.C0065u;
import p000A0.InterfaceC0022X;
import p000A0.InterfaceC0045k;
import p006D0.InterfaceC0171f;
import p010F0.C0231q;
import p011H.AbstractC0271e0;
import p037U0.AbstractC0846b;
import p057d0.AbstractC6285g;
import p057d0.C6289k;
import p058e0.AbstractC6305m;
import p058e0.AbstractC6306n;
import p058e0.AbstractC6307o;
import p058e0.C6313u;
import p062g0.C6354i;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6351f;
import p062g0.InterfaceC6352g;
import p062g0.InterfaceC6353h;
import p064h0.EnumC6363a;
import p066i0.AbstractC6373c;
import p066i0.InterfaceC6374d;
import p078p0.InterfaceC6502p;
import p078p0.InterfaceC6503q;
import p091y0.AbstractC6574d;
import p091y0.C6572b;

/* JADX INFO: renamed from: E0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0206i extends AbstractC6373c implements InterfaceC0171f {

    /* JADX INFO: renamed from: s */
    public final InterfaceC0171f f408s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC6353h f409t;

    /* JADX INFO: renamed from: u */
    public final int f410u;

    /* JADX INFO: renamed from: v */
    public InterfaceC6353h f411v;

    /* JADX INFO: renamed from: w */
    public InterfaceC6348c f412w;

    public C0206i(InterfaceC0171f interfaceC0171f, InterfaceC6353h interfaceC6353h) {
        super(C0204g.f406s, C6354i.f24409s);
        this.f408s = interfaceC0171f;
        this.f409t = interfaceC6353h;
        this.f410u = ((Number) interfaceC6353h.fold(0, new C0057q(3))).intValue();
    }

    /* JADX INFO: renamed from: a */
    public final Object m293a(InterfaceC6348c interfaceC6348c, Object obj) {
        List listM1752k;
        Comparable comparable;
        String strSubstring;
        InterfaceC6353h context = interfaceC6348c.getContext();
        InterfaceC0022X interfaceC0022X = (InterfaceC0022X) context.get(C0065u.f80t);
        if (interfaceC0022X != null && !interfaceC0022X.mo28c()) {
            throw ((C0034e0) interfaceC0022X).m67u();
        }
        InterfaceC6353h interfaceC6353h = this.f411v;
        if (interfaceC6353h != context) {
            if (interfaceC6353h instanceof C0202e) {
                String str = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C0202e) interfaceC6353h).f405t + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                AbstractC6452k.m12181e(str, "<this>");
                C6572b c6572b = new C6572b(str);
                if (c6572b.hasNext()) {
                    Object next = c6572b.next();
                    if (c6572b.hasNext()) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (c6572b.hasNext()) {
                            arrayList.add(c6572b.next());
                        }
                        listM1752k = arrayList;
                    } else {
                        listM1752k = AbstractC0846b.m1752k(next);
                    }
                } else {
                    listM1752k = C6313u.f24338s;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : listM1752k) {
                    if (!AbstractC6574d.m12222A((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(AbstractC6307o.m12123u(arrayList2, 10));
                int size = arrayList2.size();
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    Object obj3 = arrayList2.get(i3);
                    i3++;
                    String str2 = (String) obj3;
                    int length = str2.length();
                    int length2 = 0;
                    while (true) {
                        if (length2 >= length) {
                            length2 = -1;
                            break;
                        }
                        char cCharAt = str2.charAt(length2);
                        if (!Character.isWhitespace(cCharAt) && !Character.isSpaceChar(cCharAt)) {
                            break;
                        }
                        length2++;
                    }
                    if (length2 == -1) {
                        length2 = str2.length();
                    }
                    arrayList3.add(Integer.valueOf(length2));
                }
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    comparable = (Comparable) it.next();
                    while (it.hasNext()) {
                        Comparable comparable2 = (Comparable) it.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                } else {
                    comparable = null;
                }
                Integer num = (Integer) comparable;
                int iIntValue = num != null ? num.intValue() : 0;
                int length3 = str.length();
                listM1752k.size();
                int iM12119q = AbstractC6306n.m12119q(listM1752k);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : listM1752k) {
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        AbstractC6306n.m12122t();
                        throw null;
                    }
                    String str3 = (String) obj4;
                    if ((i2 == 0 || i2 == iM12119q) && AbstractC6574d.m12222A(str3)) {
                        strSubstring = null;
                    } else {
                        AbstractC6452k.m12181e(str3, "<this>");
                        if (iIntValue < 0) {
                            throw new IllegalArgumentException(AbstractC0271e0.m397e(iIntValue, "Requested character count ", " is less than zero.").toString());
                        }
                        int length4 = str3.length();
                        if (iIntValue <= length4) {
                            length4 = iIntValue;
                        }
                        strSubstring = str3.substring(length4);
                        AbstractC6452k.m12180d(strSubstring, "substring(...)");
                    }
                    if (strSubstring != null) {
                        arrayList4.add(strSubstring);
                    }
                    i2 = i4;
                }
                StringBuilder sb = new StringBuilder(length3);
                AbstractC6305m.m12118z(arrayList4, sb, "\n", "", "", "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) context.fold(0, new InterfaceC6502p() { // from class: E0.l
                /* JADX WARN: Code duplicated, block: B:6:0x001d  */
                @Override // p078p0.InterfaceC6502p
                public final Object invoke(Object obj5, Object obj6) {
                    int iIntValue2 = ((Integer) obj5).intValue();
                    InterfaceC6351f interfaceC6351f = (InterfaceC6351f) obj6;
                    InterfaceC6352g key = interfaceC6351f.getKey();
                    InterfaceC6351f interfaceC6351f2 = this.f415s.f409t.get(key);
                    if (key == C0065u.f80t) {
                        InterfaceC0022X interfaceC0022X2 = (InterfaceC0022X) interfaceC6351f2;
                        InterfaceC0022X parent = (InterfaceC0022X) interfaceC6351f;
                        while (true) {
                            if (parent != null) {
                                if (parent == interfaceC0022X2 || !(parent instanceof C0231q)) {
                                    break;
                                }
                                InterfaceC0045k interfaceC0045k = (InterfaceC0045k) C0034e0.f44t.get((C0231q) parent);
                                parent = interfaceC0045k != null ? interfaceC0045k.getParent() : null;
                            } else {
                                parent = null;
                                break;
                            }
                        }
                        if (parent != interfaceC0022X2) {
                            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + interfaceC0022X2 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                        }
                        if (interfaceC0022X2 != null) {
                            iIntValue2++;
                        }
                    } else if (interfaceC6351f != interfaceC6351f2) {
                        iIntValue2 = Integer.MIN_VALUE;
                    } else {
                        iIntValue2++;
                    }
                    return Integer.valueOf(iIntValue2);
                }
            })).intValue() != this.f410u) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f409t + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f411v = context;
        }
        this.f412w = interfaceC6348c;
        InterfaceC6503q interfaceC6503q = AbstractC0208k.f414a;
        InterfaceC0171f interfaceC0171f = this.f408s;
        AbstractC6452k.m12179c(interfaceC0171f, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objInvoke = interfaceC6503q.invoke(interfaceC0171f, obj, this);
        if (!AbstractC6452k.m12177a(objInvoke, EnumC6363a.f24419s)) {
            this.f412w = null;
        }
        return objInvoke;
    }

    @Override // p006D0.InterfaceC0171f
    public final Object emit(Object obj, InterfaceC6348c interfaceC6348c) {
        try {
            Object objM293a = m293a(interfaceC6348c, obj);
            return objM293a == EnumC6363a.f24419s ? objM293a : C6289k.f24318a;
        } catch (Throwable th) {
            this.f411v = new C0202e(interfaceC6348c.getContext(), th);
            throw th;
        }
    }

    @Override // p066i0.AbstractC6371a, p066i0.InterfaceC6374d
    public final InterfaceC6374d getCallerFrame() {
        InterfaceC6348c interfaceC6348c = this.f412w;
        if (interfaceC6348c instanceof InterfaceC6374d) {
            return (InterfaceC6374d) interfaceC6348c;
        }
        return null;
    }

    @Override // p066i0.AbstractC6373c, p062g0.InterfaceC6348c
    public final InterfaceC6353h getContext() {
        InterfaceC6353h interfaceC6353h = this.f411v;
        return interfaceC6353h == null ? C6354i.f24409s : interfaceC6353h;
    }

    @Override // p066i0.AbstractC6371a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // p066i0.AbstractC6371a
    public final Object invokeSuspend(Object obj) {
        Throwable thM12075a = AbstractC6285g.m12075a(obj);
        if (thM12075a != null) {
            this.f411v = new C0202e(getContext(), thM12075a);
        }
        InterfaceC6348c interfaceC6348c = this.f412w;
        if (interfaceC6348c != null) {
            interfaceC6348c.resumeWith(obj);
        }
        return EnumC6363a.f24419s;
    }
}
