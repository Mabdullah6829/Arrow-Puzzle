package p035T0;

import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC6452k;
import kotlin.jvm.internal.C6459r;
import kotlin.jvm.internal.C6461t;
import kotlin.jvm.internal.C6462u;
import p011H.AbstractC0242F;
import p011H.AbstractC0271e0;
import p033S0.C0613g;
import p033S0.C0619m;
import p033S0.C0627u;
import p033S0.C0629w;
import p033S0.C0632z;
import p049b0.C1887c;
import p057d0.C6283e;
import p058e0.AbstractC6305m;
import p058e0.AbstractC6318z;
import p078p0.InterfaceC6502p;
import p091y0.AbstractC6574d;
import p091y0.AbstractC6582l;

/* JADX INFO: renamed from: T0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0810b {

    /* JADX INFO: renamed from: a */
    public static final char[] f2119a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: a */
    public static final LinkedHashMap m1683a(ArrayList arrayList) {
        String str = C0627u.f1371t;
        C0627u c0627uM2718e = C1887c.m2718e("/", false);
        C6283e[] c6283eArr = {new C6283e(c0627uM2718e, new C0816h(c0627uM2718e))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC6318z.m12126t(1));
        AbstractC6318z.m12129w(linkedHashMap, c6283eArr);
        for (C0816h c0816h : AbstractC6305m.m12110F(arrayList, new C0817i())) {
            if (((C0816h) linkedHashMap.put(c0816h.f2134a, c0816h)) == null) {
                while (true) {
                    C0627u c0627u = c0816h.f2134a;
                    C0627u c0627uM1453e = c0627u.m1453e();
                    if (c0627uM1453e == null) {
                        break;
                    }
                    C0816h c0816h2 = (C0816h) linkedHashMap.get(c0627uM1453e);
                    if (c0816h2 != null) {
                        c0816h2.f2141h.add(c0627u);
                        break;
                    }
                    C0816h c0816h3 = new C0816h(c0627uM1453e);
                    linkedHashMap.put(c0627uM1453e, c0816h3);
                    c0816h3.f2141h.add(c0627u);
                    c0816h = c0816h3;
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: b */
    public static final String m1684b(int i2) {
        AbstractC0242F.m346a(16);
        String string = Integer.toString(i2, 16);
        AbstractC6452k.m12180d(string, "toString(this, checkRadix(radix))");
        return "0x".concat(string);
    }

    /* JADX INFO: renamed from: c */
    public static final C0816h m1685c(C0629w c0629w) throws IOException {
        Long lValueOf;
        int iM1466j = c0629w.m1466j();
        if (iM1466j != 33639248) {
            throw new IOException("bad zip: expected " + m1684b(33639248) + " but was " + m1684b(iM1466j));
        }
        c0629w.m1471r(4L);
        short sM1468n = c0629w.m1468n();
        int i2 = sM1468n & 65535;
        if ((sM1468n & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + m1684b(i2));
        }
        int iM1468n = c0629w.m1468n() & 65535;
        short sM1468n2 = c0629w.m1468n();
        int i3 = sM1468n2 & 65535;
        short sM1468n3 = c0629w.m1468n();
        int i4 = sM1468n3 & 65535;
        if (i3 == -1) {
            lValueOf = null;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(((i4 >> 9) & 127) + 1980, ((i4 >> 5) & 15) - 1, sM1468n3 & 31, (i3 >> 11) & 31, (i3 >> 5) & 63, (sM1468n2 & 31) << 1);
            lValueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
        }
        Long l2 = lValueOf;
        c0629w.m1466j();
        C6461t c6461t = new C6461t();
        c6461t.f24635s = ((long) c0629w.m1466j()) & 4294967295L;
        C6461t c6461t2 = new C6461t();
        c6461t2.f24635s = ((long) c0629w.m1466j()) & 4294967295L;
        int iM1468n2 = c0629w.m1468n() & 65535;
        int iM1468n3 = c0629w.m1468n() & 65535;
        int iM1468n4 = c0629w.m1468n() & 65535;
        c0629w.m1471r(8L);
        C6461t c6461t3 = new C6461t();
        c6461t3.f24635s = ((long) c0629w.m1466j()) & 4294967295L;
        String strM1469o = c0629w.m1469o(iM1468n2);
        AbstractC6452k.m12181e(strM1469o, "<this>");
        if (AbstractC6574d.m12229y(strM1469o, (char) 0, 0, 2) >= 0) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j2 = c6461t2.f24635s == 4294967295L ? 8 : 0L;
        if (c6461t.f24635s == 4294967295L) {
            j2 += (long) 8;
        }
        if (c6461t3.f24635s == 4294967295L) {
            j2 += (long) 8;
        }
        C6459r c6459r = new C6459r();
        m1686d(c0629w, iM1468n3, new C0818j(c6459r, j2, c6461t2, c0629w, c6461t, c6461t3));
        if (j2 > 0 && !c6459r.f24633s) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String strM1469o2 = c0629w.m1469o(iM1468n4);
        String str = C0627u.f1371t;
        return new C0816h(C1887c.m2718e("/", false).m1454f(strM1469o), AbstractC6582l.m12233r(strM1469o, "/", false), strM1469o2, c6461t.f24635s, c6461t2.f24635s, iM1468n, l2, c6461t3.f24635s);
    }

    /* JADX INFO: renamed from: d */
    public static final void m1686d(C0629w c0629w, int i2, InterfaceC6502p interfaceC6502p) throws IOException {
        C0613g c0613g = c0629w.f1377t;
        long j2 = i2;
        while (j2 != 0) {
            if (j2 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iM1468n = c0629w.m1468n() & 65535;
            long jM1468n = ((long) c0629w.m1468n()) & 65535;
            long j3 = j2 - ((long) 4);
            if (j3 < jM1468n) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            c0629w.m1470p(jM1468n);
            long j4 = c0613g.f1342t;
            interfaceC6502p.invoke(Integer.valueOf(iM1468n), Long.valueOf(jM1468n));
            long j5 = (c0613g.f1342t + jM1468n) - j4;
            if (j5 < 0) {
                throw new IOException(AbstractC0271e0.m396d(iM1468n, "unsupported zip: too many bytes processed for "));
            }
            if (j5 > 0) {
                c0613g.m1382J(j5);
            }
            j2 = j3 - jM1468n;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C0619m m1687e(C0629w c0629w, C0619m c0619m) throws IOException {
        C6462u c6462u = new C6462u();
        c6462u.f24636s = c0619m != null ? c0619m.f1357e : null;
        C6462u c6462u2 = new C6462u();
        C6462u c6462u3 = new C6462u();
        int iM1466j = c0629w.m1466j();
        if (iM1466j != 67324752) {
            throw new IOException("bad zip: expected " + m1684b(67324752) + " but was " + m1684b(iM1466j));
        }
        c0629w.m1471r(2L);
        short sM1468n = c0629w.m1468n();
        int i2 = sM1468n & 65535;
        if ((sM1468n & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + m1684b(i2));
        }
        c0629w.m1471r(18L);
        long jM1468n = ((long) c0629w.m1468n()) & 65535;
        int iM1468n = c0629w.m1468n() & 65535;
        c0629w.m1471r(jM1468n);
        if (c0619m == null) {
            c0629w.m1471r(iM1468n);
            return null;
        }
        m1686d(c0629w, iM1468n, new C0819k(c0629w, c6462u, c6462u2, c6462u3));
        return new C0619m(c0619m.f1353a, c0619m.f1354b, c0619m.f1355c, (Long) c6462u3.f24636s, (Long) c6462u.f24636s, (Long) c6462u2.f24636s);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    /* JADX INFO: renamed from: f */
    public static final int m1688f(C0632z c0632z, int i2) {
        int i3;
        int[] iArr = c0632z.f1390x;
        int i4 = i2 + 1;
        int length = c0632z.f1389w.length;
        AbstractC6452k.m12181e(iArr, "<this>");
        int i5 = length - 1;
        int i6 = 0;
        while (i6 <= i5) {
            i3 = (i6 + i5) >>> 1;
            int i7 = iArr[i3];
            if (i7 < i4) {
                i6 = i3 + 1;
            } else {
                if (i7 <= i4) {
                    if (i3 >= 0) {
                        return i3;
                    }
                    return ~i3;
                }
                i5 = i3 - 1;
            }
        }
        i3 = (-i6) - 1;
        if (i3 >= 0) {
            return i3;
        }
        return ~i3;
    }
}
