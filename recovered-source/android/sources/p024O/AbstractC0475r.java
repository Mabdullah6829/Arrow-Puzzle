package p024O;

import java.util.ArrayList;
import p072l.AbstractC6468c;

/* JADX INFO: renamed from: O.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0475r {

    /* JADX INFO: renamed from: a */
    public static final int[] f1000a = new int[0];

    /* JADX INFO: renamed from: a */
    public static int m1164a(int i2, int i3) {
        int i4 = i2 < 0 ? 5 : 0;
        if (i2 == 10) {
            i4 |= 1;
        }
        if (i3 < 0) {
            i4 |= 10;
        }
        if (i3 == 10) {
            i4 |= 2;
        }
        return m1167d(i2) != m1167d(i3) ? i4 | 16 : i4 | 32;
    }

    /* JADX INFO: renamed from: b */
    public static void m1165b(int i2, StringBuilder sb) {
        if (i2 > 255 ? m1166c(AbstractC0474q.f880I, i2) || m1166c(AbstractC0474q.f883J, i2) || m1166c(AbstractC0474q.f886K, i2) || m1166c(AbstractC0474q.f868E, i2) || m1166c(AbstractC0474q.f871F, i2) : (i2 >= 32 && i2 < 127) || (i2 >= 161 && i2 != 173)) {
            if ("\\.+*?()|[]{}^$".indexOf((char) i2) >= 0) {
                sb.append('\\');
            }
            sb.appendCodePoint(i2);
            return;
        }
        if (i2 == 12) {
            sb.append("\\f");
            return;
        }
        if (i2 == 13) {
            sb.append("\\r");
            return;
        }
        if (i2 == 34) {
            sb.append("\\\"");
            return;
        }
        if (i2 == 92) {
            sb.append("\\\\");
            return;
        }
        switch (i2) {
            case 8:
                sb.append("\\b");
                break;
            case 9:
                sb.append("\\t");
                break;
            case 10:
                sb.append("\\n");
                break;
            default:
                String hexString = Integer.toHexString(i2);
                if (i2 >= 256) {
                    sb.append("\\x{");
                    sb.append(hexString);
                    sb.append('}');
                } else {
                    sb.append("\\x");
                    if (hexString.length() == 1) {
                        sb.append('0');
                    }
                    sb.append(hexString);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m1166c(int[][] iArr, int i2) {
        if (i2 <= 255) {
            for (int[] iArr2 : iArr) {
                if (i2 <= iArr2[1]) {
                    int i3 = iArr2[0];
                    if (i2 >= i3 && (i2 - i3) % iArr2[2] == 0) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (iArr.length > 0 && i2 >= iArr[0][0]) {
            int length = iArr.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = ((length - i4) / 2) + i4;
                int[] iArr3 = iArr[i5];
                int i6 = iArr3[0];
                if (i6 > i2 || i2 > iArr3[1]) {
                    if (i2 < i6) {
                        length = i5;
                    } else {
                        i4 = i5 + 1;
                    }
                } else if ((i2 - i6) % iArr3[2] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1167d(int i2) {
        if (65 <= i2 && i2 <= 90) {
            return true;
        }
        if (97 > i2 || i2 > 122) {
            return (48 <= i2 && i2 <= 57) || i2 == 95;
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1168e(int i2) {
        if (48 <= i2 && i2 <= 57) {
            return true;
        }
        if (65 > i2 || i2 > 90) {
            return 97 <= i2 && i2 <= 122;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static int m1169f(int i2) {
        char c;
        char[] cArr = AbstractC0474q.f922a;
        if (i2 < cArr.length && (c = cArr[i2]) != 0) {
            return c;
        }
        int lowerCase = Character.toLowerCase(i2);
        return lowerCase != i2 ? lowerCase : Character.toUpperCase(i2);
    }

    /* JADX INFO: renamed from: g */
    public static C0473p m1170g(C0473p c0473p) {
        ArrayList arrayList;
        if (c0473p == null) {
            return null;
        }
        int i2 = 0;
        switch (AbstractC6468c.m12193b(c0473p.f847a)) {
            case 12:
            case 17:
            case 18:
                C0473p c0473p2 = c0473p;
                int i3 = 0;
                while (true) {
                    C0473p[] c0473pArr = c0473p.f849c;
                    if (i3 >= c0473pArr.length) {
                        return c0473p2;
                    }
                    C0473p c0473p3 = c0473pArr[i3];
                    C0473p c0473pM1170g = m1170g(c0473p3);
                    if (c0473p2 == c0473p && c0473pM1170g != c0473p3) {
                        c0473p2 = new C0473p();
                        c0473p2.f847a = c0473p.f847a;
                        c0473p2.f848b = c0473p.f848b;
                        c0473p2.f849c = c0473p.f849c;
                        c0473p2.f851e = c0473p.f851e;
                        c0473p2.f852f = c0473p.f852f;
                        c0473p2.f853g = c0473p.f853g;
                        c0473p2.f854h = c0473p.f854h;
                        c0473p2.f855i = c0473p.f855i;
                        c0473p2.f850d = null;
                        C0473p[] c0473pArr2 = c0473p.f849c;
                        c0473p2.f849c = C0469l.m1012v(c0473pArr2, 0, c0473pArr2.length);
                    }
                    if (c0473p2 != c0473p) {
                        c0473p2.f849c[i3] = c0473pM1170g;
                    }
                    i3++;
                }
                break;
            case 13:
            case 14:
            case 15:
                return m1171h(c0473p.f847a, c0473p.f848b, m1170g(c0473p.f849c[0]), c0473p);
            case 16:
                if (c0473p.f851e == 0 && c0473p.f852f == 0) {
                    return new C0473p(2);
                }
                C0473p c0473pM1170g2 = m1170g(c0473p.f849c[0]);
                int i4 = c0473p.f852f;
                if (i4 == -1) {
                    int i5 = c0473p.f851e;
                    if (i5 == 0) {
                        return m1171h(14, c0473p.f848b, c0473pM1170g2, null);
                    }
                    if (i5 == 1) {
                        return m1171h(15, c0473p.f848b, c0473pM1170g2, null);
                    }
                    C0473p c0473p4 = new C0473p(18);
                    ArrayList arrayList2 = new ArrayList();
                    while (i2 < c0473p.f851e - 1) {
                        arrayList2.add(c0473pM1170g2);
                        i2++;
                    }
                    arrayList2.add(m1171h(15, c0473p.f848b, c0473pM1170g2, null));
                    c0473p4.f849c = (C0473p[]) arrayList2.toArray(new C0473p[arrayList2.size()]);
                    return c0473p4;
                }
                int i6 = c0473p.f851e;
                if (i6 == 1 && i4 == 1) {
                    return c0473pM1170g2;
                }
                if (i6 > 0) {
                    arrayList = new ArrayList();
                    while (i2 < c0473p.f851e) {
                        arrayList.add(c0473pM1170g2);
                        i2++;
                    }
                } else {
                    arrayList = null;
                }
                if (c0473p.f852f > c0473p.f851e) {
                    C0473p c0473pM1171h = m1171h(16, c0473p.f848b, c0473pM1170g2, null);
                    for (int i7 = c0473p.f851e + 1; i7 < c0473p.f852f; i7++) {
                        C0473p c0473p5 = new C0473p(18);
                        c0473p5.f849c = new C0473p[]{c0473pM1170g2, c0473pM1171h};
                        c0473pM1171h = m1171h(16, c0473p.f848b, c0473p5, null);
                    }
                    if (arrayList == null) {
                        return c0473pM1171h;
                    }
                    arrayList.add(c0473pM1171h);
                }
                if (arrayList == null) {
                    return new C0473p(1);
                }
                C0473p c0473p6 = new C0473p(18);
                c0473p6.f849c = (C0473p[]) arrayList.toArray(new C0473p[arrayList.size()]);
                return c0473p6;
            default:
                return c0473p;
        }
    }

    /* JADX INFO: renamed from: h */
    public static C0473p m1171h(int i2, int i3, C0473p c0473p, C0473p c0473p2) {
        int i4 = c0473p.f847a;
        if (i4 == 2 || (i2 == i4 && (i3 & 32) == (c0473p.f848b & 32))) {
            return c0473p;
        }
        if (c0473p2 != null && c0473p2.f847a == i2 && (c0473p2.f848b & 32) == (i3 & 32) && c0473p == c0473p2.f849c[0]) {
            return c0473p2;
        }
        C0473p c0473p3 = new C0473p(i2);
        c0473p3.f848b = i3;
        c0473p3.f849c = new C0473p[]{c0473p};
        return c0473p3;
    }

    /* JADX INFO: renamed from: i */
    public static int m1172i(int i2) {
        if (48 <= i2 && i2 <= 57) {
            return i2 - 48;
        }
        if (97 <= i2 && i2 <= 102) {
            return i2 - 87;
        }
        if (65 > i2 || i2 > 70) {
            return -1;
        }
        return i2 - 55;
    }
}
