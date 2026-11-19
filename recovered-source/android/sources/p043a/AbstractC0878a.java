package p043a;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.AbstractC6465x;
import p004C0.C0138c;
import p004C0.C0141f;
import p004C0.C0148m;
import p004C0.EnumC0136a;
import p004C0.InterfaceC0142g;
import p009F.AbstractC0214b;
import p011H.AbstractC0271e0;
import p011H.AbstractC0290s;
import p011H.C0274g;
import p011H.C0289r;
import p021M0.InterfaceC0339d;
import p025O0.C0490o;
import p062g0.C6354i;
import p062g0.InterfaceC6348c;
import p062g0.InterfaceC6353h;
import p064h0.C6364b;
import p064h0.C6365c;
import p064h0.C6366d;
import p064h0.C6367e;
import p066i0.AbstractC6371a;
import p066i0.AbstractC6373c;
import p070k0.AbstractC6441a;
import p073l0.AbstractC6473a;
import p078p0.InterfaceC6502p;
import p088w0.InterfaceC6548c;
import p089x0.C6564g;

/* JADX INFO: renamed from: a.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0878a {
    /* JADX INFO: renamed from: a */
    public static C0138c m1795a(int i2, EnumC0136a enumC0136a, int i3) {
        if ((i3 & 2) != 0) {
            enumC0136a = EnumC0136a.f215s;
        }
        if (i2 == -2) {
            if (enumC0136a != EnumC0136a.f215s) {
                return new C0148m(1, enumC0136a);
            }
            InterfaceC0142g.f254a.getClass();
            return new C0138c(C0141f.f253b);
        }
        if (i2 == -1) {
            if (enumC0136a == EnumC0136a.f215s) {
                return new C0148m(1, EnumC0136a.f216t);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i2 == 0) {
            return enumC0136a == EnumC0136a.f215s ? new C0138c(0) : new C0148m(1, enumC0136a);
        }
        if (i2 != Integer.MAX_VALUE) {
            return enumC0136a == EnumC0136a.f215s ? new C0138c(i2) : new C0148m(i2, enumC0136a);
        }
        return new C0138c(Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: b */
    public static void m1796b(Throwable th, Throwable exception) {
        AbstractC6452k.m12181e(th, "<this>");
        AbstractC6452k.m12181e(exception, "exception");
        if (th != exception) {
            Integer num = AbstractC6473a.f24655a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(exception);
                return;
            }
            Method method = AbstractC6441a.f24626a;
            if (method != null) {
                method.invoke(th, exception);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m1797f(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                m1796b(th, th2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static InterfaceC6348c m1798g(InterfaceC6348c interfaceC6348c, InterfaceC6348c interfaceC6348c2, InterfaceC6502p interfaceC6502p) {
        AbstractC6452k.m12181e(interfaceC6502p, "<this>");
        if (interfaceC6502p instanceof AbstractC6371a) {
            return ((AbstractC6371a) interfaceC6502p).create(interfaceC6348c, interfaceC6348c2);
        }
        InterfaceC6353h context = interfaceC6348c2.getContext();
        return context == C6354i.f24409s ? new C6364b(interfaceC6348c2, interfaceC6348c, interfaceC6502p) : new C6365c(interfaceC6348c2, context, interfaceC6502p, interfaceC6348c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r0 > 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r4 > 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r4 < 0) goto L19;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m1799h(int r4, int r5) {
        /*
            java.math.RoundingMode r0 = java.math.RoundingMode.CEILING
            r0.getClass()
            if (r5 == 0) goto L4c
            int r1 = r4 / r5
            int r2 = r5 * r1
            int r2 = r4 - r2
            if (r2 != 0) goto L10
            goto L43
        L10:
            r4 = r4 ^ r5
            int r4 = r4 >> 31
            r4 = r4 | 1
            int[] r3 = p009F.AbstractC0214b.f422a
            int r0 = r0.ordinal()
            r0 = r3[r0]
            switch(r0) {
                case 1: goto L41;
                case 2: goto L43;
                case 3: goto L3d;
                case 4: goto L3f;
                case 5: goto L3a;
                case 6: goto L26;
                case 7: goto L26;
                case 8: goto L26;
                default: goto L20;
            }
        L20:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L26:
            int r0 = java.lang.Math.abs(r2)
            int r5 = java.lang.Math.abs(r5)
            int r5 = r5 - r0
            int r0 = r0 - r5
            if (r0 != 0) goto L37
            java.math.RoundingMode r4 = java.math.RoundingMode.HALF_UP
            java.math.RoundingMode r4 = java.math.RoundingMode.HALF_EVEN
            goto L43
        L37:
            if (r0 <= 0) goto L43
            goto L3f
        L3a:
            if (r4 <= 0) goto L43
            goto L3f
        L3d:
            if (r4 >= 0) goto L43
        L3f:
            int r1 = r1 + r4
            return r1
        L41:
            if (r2 != 0) goto L44
        L43:
            return r1
        L44:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r5 = "mode was UNNECESSARY, but rounding was necessary"
            r4.<init>(r5)
            throw r4
        L4c:
            java.lang.ArithmeticException r4 = new java.lang.ArithmeticException
            java.lang.String r5 = "/ by zero"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p043a.AbstractC0878a.m1799h(int, int):int");
    }

    /* JADX INFO: renamed from: k */
    public static final InterfaceC6548c m1800k(InterfaceC0339d interfaceC0339d) {
        AbstractC6452k.m12181e(interfaceC0339d, "<this>");
        if (interfaceC0339d instanceof C0490o) {
            return m1800k(((C0490o) interfaceC0339d).f1037a);
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static Object m1801l(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException();
        }
        return arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: m */
    public static InterfaceC6348c m1802m(InterfaceC6348c interfaceC6348c) {
        InterfaceC6348c interfaceC6348cIntercepted;
        AbstractC6452k.m12181e(interfaceC6348c, "<this>");
        AbstractC6373c abstractC6373c = interfaceC6348c instanceof AbstractC6373c ? (AbstractC6373c) interfaceC6348c : null;
        return (abstractC6373c == null || (interfaceC6348cIntercepted = abstractC6373c.intercepted()) == null) ? interfaceC6348c : interfaceC6348cIntercepted;
    }

    /* JADX INFO: renamed from: n */
    public static C6564g m1803n(InterfaceC6502p interfaceC6502p) {
        C6564g c6564g = new C6564g();
        c6564g.f24791v = m1798g(c6564g, c6564g, interfaceC6502p);
        return c6564g;
    }

    /* JADX INFO: renamed from: o */
    public static int m1804o(int i2) {
        RoundingMode roundingMode = RoundingMode.UNNECESSARY;
        if (i2 <= 0) {
            throw new IllegalArgumentException(AbstractC0271e0.m397e(i2, "x (", ") must be > 0"));
        }
        switch (AbstractC0214b.f422a[roundingMode.ordinal()]) {
            case 1:
                if (!((i2 > 0) & (((i2 + (-1)) & i2) == 0))) {
                    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                }
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 32 - Integer.numberOfLeadingZeros(i2 - 1);
            case 6:
            case 7:
            case 8:
                int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i2);
                return (31 - iNumberOfLeadingZeros) + ((~(~(((-1257966797) >>> iNumberOfLeadingZeros) - i2))) >>> 31);
            default:
                throw new AssertionError();
        }
        return 31 - Integer.numberOfLeadingZeros(i2);
    }

    /* JADX INFO: renamed from: r */
    public static Object m1805r(InterfaceC6502p interfaceC6502p, Object obj, InterfaceC6348c interfaceC6348c) {
        AbstractC6452k.m12181e(interfaceC6502p, "<this>");
        InterfaceC6353h context = interfaceC6348c.getContext();
        Object c6366d = context == C6354i.f24409s ? new C6366d(interfaceC6348c) : new C6367e(interfaceC6348c, context);
        AbstractC6465x.m12191a(2, interfaceC6502p);
        return interfaceC6502p.invoke(obj, c6366d);
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo418c(AbstractC0290s abstractC0290s, C0274g c0274g, C0274g c0274g2);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo419d(AbstractC0290s abstractC0290s, Object obj, Object obj2);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo420e(AbstractC0290s abstractC0290s, C0289r c0289r, C0289r c0289r2);

    /* JADX INFO: renamed from: i */
    public abstract C0274g mo421i(AbstractC0290s abstractC0290s);

    /* JADX INFO: renamed from: j */
    public abstract C0289r mo422j(AbstractC0290s abstractC0290s);

    /* JADX INFO: renamed from: p */
    public abstract void mo423p(C0289r c0289r, C0289r c0289r2);

    /* JADX INFO: renamed from: q */
    public abstract void mo424q(C0289r c0289r, Thread thread);
}
