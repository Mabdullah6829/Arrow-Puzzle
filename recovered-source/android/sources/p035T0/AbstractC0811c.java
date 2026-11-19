package p035T0;

import java.io.EOFException;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0271e0;
import p033S0.AbstractC0608b;
import p033S0.C0613g;
import p033S0.C0616j;
import p033S0.C0627u;
import p058e0.AbstractC6305m;
import p058e0.AbstractC6306n;

/* JADX INFO: renamed from: T0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0811c {

    /* JADX INFO: renamed from: a */
    public static final C0616j f2120a;

    /* JADX INFO: renamed from: b */
    public static final C0616j f2121b;

    /* JADX INFO: renamed from: c */
    public static final C0616j f2122c;

    /* JADX INFO: renamed from: d */
    public static final C0616j f2123d;

    /* JADX INFO: renamed from: e */
    public static final C0616j f2124e;

    static {
        C0616j c0616j = C0616j.f1343v;
        f2120a = AbstractC0608b.m1371d("/");
        f2121b = AbstractC0608b.m1371d("\\");
        f2122c = AbstractC0608b.m1371d("/\\");
        f2123d = AbstractC0608b.m1371d(".");
        f2124e = AbstractC0608b.m1371d("..");
    }

    /* JADX INFO: renamed from: a */
    public static final int m1689a(C0627u c0627u) {
        C0616j c0616j = c0627u.f1372s;
        if (c0616j.mo1404e() != 0) {
            if (c0616j.mo1408j(0) != 47) {
                if (c0616j.mo1408j(0) == 92) {
                    if (c0616j.mo1404e() > 2 && c0616j.mo1408j(1) == 92) {
                        C0616j other = f2121b;
                        AbstractC6452k.m12181e(other, "other");
                        int iMo1406g = c0616j.mo1406g(2, other.mo1407i());
                        return iMo1406g == -1 ? c0616j.mo1404e() : iMo1406g;
                    }
                } else if (c0616j.mo1404e() > 2 && c0616j.mo1408j(1) == 58 && c0616j.mo1408j(2) == 92) {
                    char cMo1408j = (char) c0616j.mo1408j(0);
                    if ('a' <= cMo1408j && cMo1408j < '{') {
                        return 3;
                    }
                    if ('A' <= cMo1408j && cMo1408j < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static final C0627u m1690b(C0627u c0627u, C0627u child, boolean z) {
        AbstractC6452k.m12181e(child, "child");
        if (m1689a(child) != -1 || child.m1456h() != null) {
            return child;
        }
        C0616j c0616jM1691c = m1691c(c0627u);
        if (c0616jM1691c == null && (c0616jM1691c = m1691c(child)) == null) {
            c0616jM1691c = m1694f(C0627u.f1371t);
        }
        C0613g c0613g = new C0613g();
        c0613g.m1386N(c0627u.f1372s);
        if (c0613g.f1342t > 0) {
            c0613g.m1386N(c0616jM1691c);
        }
        c0613g.m1386N(child.f1372s);
        return m1692d(c0613g, z);
    }

    /* JADX INFO: renamed from: c */
    public static final C0616j m1691c(C0627u c0627u) {
        C0616j c0616j = c0627u.f1372s;
        C0616j c0616j2 = f2120a;
        if (C0616j.m1398h(c0616j, c0616j2) != -1) {
            return c0616j2;
        }
        C0616j c0616j3 = c0627u.f1372s;
        C0616j c0616j4 = f2121b;
        if (C0616j.m1398h(c0616j3, c0616j4) != -1) {
            return c0616j4;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011b A[EDGE_INSN: B:101:0x011b->B:84:0x011b BREAK  A[LOOP:1: B:53:0x00ab->B:116:0x00ab], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:86:0x0122 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0124  */
    /* JADX WARN: Code duplicated, block: B:91:0x0139  */
    /* JADX INFO: renamed from: d */
    public static final C0627u m1692d(C0613g c0613g, boolean z) throws EOFException {
        C0616j c0616j;
        long j2;
        char cM1392i;
        boolean z2;
        ArrayList arrayList;
        boolean zM1391e;
        C0616j c0616j2;
        int size;
        int i2;
        long jM1393l;
        C0616j c0616jM1397u;
        C0616j c0616j3;
        C0613g c0613g2 = new C0613g();
        C0616j c0616jM1693e = null;
        int i3 = 0;
        while (true) {
            if (!c0613g.m1394o(f2120a)) {
                c0616j = f2121b;
                if (!c0613g.m1394o(c0616j)) {
                    break;
                }
            }
            byte bM1395p = c0613g.m1395p();
            if (c0616jM1693e == null) {
                c0616jM1693e = m1693e(bM1395p);
            }
            i3++;
        }
        boolean z3 = i3 >= 2 && AbstractC6452k.m12177a(c0616jM1693e, c0616j);
        C0616j c0616j4 = f2122c;
        if (z3) {
            AbstractC6452k.m12178b(c0616jM1693e);
            c0613g2.m1386N(c0616jM1693e);
            c0613g2.m1386N(c0616jM1693e);
        } else {
            if (i3 <= 0) {
                long jM1393l2 = c0613g.m1393l(c0616j4);
                if (c0616jM1693e == null) {
                    c0616jM1693e = jM1393l2 == -1 ? m1694f(C0627u.f1371t) : m1693e(c0613g.m1392i(jM1393l2));
                }
                if (AbstractC6452k.m12177a(c0616jM1693e, c0616j) && c0613g.f1342t >= 2) {
                    j2 = -1;
                    if (c0613g.m1392i(1L) == 58 && (('a' <= (cM1392i = (char) c0613g.m1392i(0L)) && cM1392i < '{') || ('A' <= cM1392i && cM1392i < '['))) {
                        if (jM1393l2 == 2) {
                            c0613g2.mo1356s(c0613g, 3L);
                        } else {
                            c0613g2.mo1356s(c0613g, 2L);
                        }
                    }
                }
                if (c0613g2.f1342t > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList = new ArrayList();
                while (true) {
                    zM1391e = c0613g.m1391e();
                    c0616j2 = f2123d;
                    if (!zM1391e) {
                        break;
                    }
                    jM1393l = c0613g.m1393l(c0616j4);
                    if (jM1393l == j2) {
                        c0616jM1397u = c0613g.m1397u(c0613g.f1342t);
                    } else {
                        c0616jM1397u = c0613g.m1397u(jM1393l);
                        c0613g.m1395p();
                    }
                    c0616j3 = f2124e;
                    if (AbstractC6452k.m12177a(c0616jM1397u, c0616j3)) {
                        if (z2 || !arrayList.isEmpty()) {
                            if (z || (!z2 && (arrayList.isEmpty() || AbstractC6452k.m12177a(AbstractC6305m.m12106B(arrayList), c0616j3)))) {
                                arrayList.add(c0616jM1397u);
                            } else if (!z3 || arrayList.size() != 1) {
                                if (!arrayList.isEmpty()) {
                                    arrayList.remove(AbstractC6306n.m12119q(arrayList));
                                }
                            }
                        }
                    } else if (AbstractC6452k.m12177a(c0616jM1397u, c0616j2) && !AbstractC6452k.m12177a(c0616jM1397u, C0616j.f1343v)) {
                        arrayList.add(c0616jM1397u);
                    }
                }
                size = arrayList.size();
                for (i2 = 0; i2 < size; i2++) {
                    if (i2 > 0) {
                        c0613g2.m1386N(c0616jM1693e);
                    }
                    c0613g2.m1386N((C0616j) arrayList.get(i2));
                }
                if (c0613g2.f1342t == 0) {
                    c0613g2.m1386N(c0616j2);
                }
                return new C0627u(c0613g2.m1397u(c0613g2.f1342t));
            }
            AbstractC6452k.m12178b(c0616jM1693e);
            c0613g2.m1386N(c0616jM1693e);
        }
        j2 = -1;
        if (c0613g2.f1342t > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        arrayList = new ArrayList();
        while (true) {
            zM1391e = c0613g.m1391e();
            c0616j2 = f2123d;
            if (!zM1391e) {
                break;
                break;
            }
            jM1393l = c0613g.m1393l(c0616j4);
            if (jM1393l == j2) {
                c0616jM1397u = c0613g.m1397u(c0613g.f1342t);
            } else {
                c0616jM1397u = c0613g.m1397u(jM1393l);
                c0613g.m1395p();
            }
            c0616j3 = f2124e;
            if (AbstractC6452k.m12177a(c0616jM1397u, c0616j3)) {
                if (z2) {
                }
                if (z) {
                }
                arrayList.add(c0616jM1397u);
            } else if (AbstractC6452k.m12177a(c0616jM1397u, c0616j2)) {
            }
        }
        size = arrayList.size();
        while (i2 < size) {
            if (i2 > 0) {
                c0613g2.m1386N(c0616jM1693e);
            }
            c0613g2.m1386N((C0616j) arrayList.get(i2));
        }
        if (c0613g2.f1342t == 0) {
            c0613g2.m1386N(c0616j2);
        }
        return new C0627u(c0613g2.m1397u(c0613g2.f1342t));
    }

    /* JADX INFO: renamed from: e */
    public static final C0616j m1693e(byte b) {
        if (b == 47) {
            return f2120a;
        }
        if (b == 92) {
            return f2121b;
        }
        throw new IllegalArgumentException(AbstractC0271e0.m396d(b, "not a directory separator: "));
    }

    /* JADX INFO: renamed from: f */
    public static final C0616j m1694f(String str) {
        if (AbstractC6452k.m12177a(str, "/")) {
            return f2120a;
        }
        if (AbstractC6452k.m12177a(str, "\\")) {
            return f2121b;
        }
        throw new IllegalArgumentException(AbstractC0271e0.m398f("not a directory separator: ", str));
    }
}
