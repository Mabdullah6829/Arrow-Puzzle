package p024O;

import com.google.re2j.PatternSyntaxException;
import java.util.HashMap;
import p006D0.C0177l;
import p072l.AbstractC6468c;

/* JADX INFO: renamed from: O.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0469l {

    /* JADX INFO: renamed from: g */
    public static final int[][] f825g = {new int[]{0, 1114111, 1}};

    /* JADX INFO: renamed from: a */
    public final String f826a;

    /* JADX INFO: renamed from: b */
    public int f827b;

    /* JADX INFO: renamed from: d */
    public C0473p f829d;

    /* JADX INFO: renamed from: c */
    public final C0468k f828c = new C0468k();

    /* JADX INFO: renamed from: e */
    public int f830e = 0;

    /* JADX INFO: renamed from: f */
    public final HashMap f831f = new HashMap();

    public C0469l(String str, int i2) {
        this.f826a = str;
        this.f827b = i2;
    }

    /* JADX INFO: renamed from: b */
    public static void m1006b(C0473p c0473p) {
        if (c0473p.f847a == 4) {
            int[] iArr = c0473p.f850d;
            int length = iArr.length;
            if (length >= 4) {
                C0458a.m966h(iArr, 0, length - 2);
                int i2 = 2;
                for (int i3 = 2; i3 < length; i3 += 2) {
                    int i4 = iArr[i3];
                    int i5 = iArr[i3 + 1];
                    int i6 = i2 - 1;
                    int i7 = iArr[i6];
                    if (i4 > i7 + 1) {
                        iArr[i2] = i4;
                        iArr[i2 + 1] = i5;
                        i2 += 2;
                    } else if (i5 > i7) {
                        iArr[i6] = i5;
                    }
                }
                length = i2;
            }
            if (length != iArr.length) {
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                iArr = iArr2;
            }
            c0473p.f850d = iArr;
            if (iArr.length == 2 && iArr[0] == 0 && iArr[1] == 1114111) {
                c0473p.f850d = null;
                c0473p.f847a = 6;
            } else if (iArr.length == 4 && iArr[0] == 0 && iArr[1] == 9 && iArr[2] == 11 && iArr[3] == 1114111) {
                c0473p.f850d = null;
                c0473p.f847a = 5;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1007e(C0473p c0473p) {
        int i2 = c0473p.f847a;
        return (i2 == 3 && c0473p.f850d.length == 1) || i2 == 4 || i2 == 5 || i2 == 6;
    }

    /* JADX INFO: renamed from: h */
    public static void m1008h(C0473p c0473p, C0473p c0473p2) {
        int iM12193b = AbstractC6468c.m12193b(c0473p.f847a);
        int i2 = 0;
        if (iM12193b == 2) {
            int i3 = c0473p2.f850d[0];
            int i4 = c0473p.f850d[0];
            if (i3 == i4 && c0473p2.f848b == c0473p.f848b) {
                return;
            }
            c0473p.f847a = 4;
            C0458a c0458a = new C0458a(0);
            if ((c0473p.f848b & 1) != 0) {
                c0458a.m968b(i4, i4);
            } else {
                c0458a.m970d(i4, i4);
            }
            int i5 = c0473p2.f850d[0];
            if ((c0473p2.f848b & 1) != 0) {
                c0458a.m968b(i5, i5);
            } else {
                c0458a.m970d(i5, i5);
            }
            c0473p.f850d = c0458a.m975j();
            return;
        }
        if (iM12193b == 3) {
            if (c0473p2.f847a == 3) {
                C0458a c0458a2 = new C0458a(c0473p.f850d);
                int i6 = c0473p2.f850d[0];
                if ((c0473p2.f848b & 1) != 0) {
                    c0458a2.m968b(i6, i6);
                } else {
                    c0458a2.m970d(i6, i6);
                }
                c0473p.f850d = c0458a2.m975j();
                return;
            }
            C0458a c0458a3 = new C0458a(c0473p.f850d);
            int[] iArr = c0473p2.f850d;
            while (i2 < iArr.length) {
                c0458a3.m970d(iArr[i2], iArr[i2 + 1]);
                i2 += 2;
            }
            c0473p.f850d = c0458a3.m975j();
            return;
        }
        if (iM12193b != 4) {
            return;
        }
        int iM12193b2 = AbstractC6468c.m12193b(c0473p2.f847a);
        if (iM12193b2 == 2) {
            int[] iArr2 = c0473p2.f850d;
            if (iArr2.length != 1 || iArr2[0] != 10) {
                return;
            }
        } else if (iM12193b2 == 3) {
            while (true) {
                int[] iArr3 = c0473p2.f850d;
                if (i2 >= iArr3.length) {
                    return;
                }
                if (iArr3[i2] > 10 || 10 > iArr3[i2 + 1]) {
                    i2 += 2;
                }
            }
        } else if (iM12193b2 == 4 || iM12193b2 != 5) {
            return;
        }
        c0473p.f847a = 6;
    }

    /* JADX INFO: renamed from: k */
    public static int m1009k(C0466i c0466i, int i2) {
        if (c0466i.m996f()) {
            return c0466i.m994d('\\') ? m1010l(c0466i) : c0466i.m998h();
        }
        throw new PatternSyntaxException("missing closing ]", c0466i.m993c(i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
    
        if (r6.m997g() <= 55) goto L29;
     */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m1010l(p024O.C0466i r6) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p024O.C0469l.m1010l(O.i):int");
    }

    /* JADX INFO: renamed from: m */
    public static int m1011m(C0466i c0466i) {
        int iM997g;
        int i2 = c0466i.f815b;
        while (c0466i.m996f() && (iM997g = c0466i.m997g()) >= 48 && iM997g <= 57) {
            c0466i.m1001k(1);
        }
        String strM993c = c0466i.m993c(i2);
        if (strM993c.isEmpty()) {
            return -1;
        }
        if (strM993c.length() > 1 && strM993c.charAt(0) == '0') {
            return -1;
        }
        if (strM993c.length() > 8) {
            return -2;
        }
        return Integer.valueOf(strM993c, 10).intValue();
    }

    /* JADX INFO: renamed from: v */
    public static C0473p[] m1012v(C0473p[] c0473pArr, int i2, int i3) {
        C0473p[] c0473pArr2 = new C0473p[i3 - i2];
        for (int i4 = i2; i4 < i3; i4++) {
            c0473pArr2[i4 - i2] = c0473pArr[i4];
        }
        return c0473pArr2;
    }

    /* JADX INFO: renamed from: a */
    public final void m1013a() {
        C0473p[] c0473pArrM1023q = m1023q();
        if (c0473pArrM1023q.length > 0) {
            m1006b(c0473pArrM1023q[c0473pArrM1023q.length - 1]);
        }
        if (c0473pArrM1023q.length == 0) {
            m1024r(m1018i(1));
        } else {
            m1024r(m1014c(c0473pArrM1023q, 19));
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x019f  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:69:0x0110  */
    /* JADX INFO: renamed from: c */
    public final C0473p m1014c(C0473p[] c0473pArr, int i2) {
        int i3;
        int i4;
        C0473p c0473p;
        int i5;
        int length;
        int[] iArr;
        int i6;
        int i7 = 0;
        int i8 = 1;
        if (c0473pArr.length == 1) {
            return c0473pArr[0];
        }
        int length2 = 0;
        for (C0473p c0473p2 : c0473pArr) {
            length2 += c0473p2.f847a == i2 ? c0473p2.f849c.length : 1;
        }
        C0473p[] c0473pArrM1012v = new C0473p[length2];
        int length3 = 0;
        for (C0473p c0473p3 : c0473pArr) {
            if (c0473p3.f847a == i2) {
                C0473p[] c0473pArr2 = c0473p3.f849c;
                System.arraycopy(c0473pArr2, 0, c0473pArrM1012v, length3, c0473pArr2.length);
                length3 += c0473p3.f849c.length;
                m1027u(c0473p3);
            } else {
                c0473pArrM1012v[length3] = c0473p3;
                length3++;
            }
        }
        C0473p c0473pM1018i = m1018i(i2);
        c0473pM1018i.f849c = c0473pArrM1012v;
        if (i2 == 19) {
            if (length2 < 2) {
                i3 = 0;
            } else {
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int[] iArr2 = null;
                while (i9 <= length2) {
                    int i14 = i7;
                    if (i9 < length2) {
                        C0473p c0473p4 = c0473pArrM1012v[i9];
                        i5 = i8;
                        if (c0473p4.f847a == 18) {
                            C0473p[] c0473pArr3 = c0473p4.f849c;
                            if (c0473pArr3.length > 0) {
                                c0473p4 = c0473pArr3[i14];
                            }
                        }
                        if (c0473p4.f847a == 3) {
                            iArr = c0473p4.f850d;
                            length = iArr.length;
                            i7 = c0473p4.f848b & 1;
                        } else {
                            i7 = i14;
                            length = i7;
                            iArr = null;
                        }
                        if (i7 == i11) {
                            int i15 = i14;
                            while (i15 < i12 && i15 < length && iArr2[i15] == iArr[i15]) {
                                i15++;
                            }
                            if (i15 > 0) {
                                i12 = i15;
                            }
                        }
                        i9++;
                        i7 = i14;
                        i8 = i5;
                    } else {
                        i5 = i8;
                        length = i7;
                        iArr = null;
                    }
                    if (i9 != i13) {
                        if (i9 == i13 + 1) {
                            i6 = i10 + 1;
                            c0473pArrM1012v[i10] = c0473pArrM1012v[i13];
                        } else {
                            C0473p c0473pM1018i2 = m1018i(3);
                            c0473pM1018i2.f848b = i11;
                            int[] iArr3 = new int[i12];
                            for (int i16 = i14; i16 < i12; i16++) {
                                iArr3[i16] = iArr2[i16];
                            }
                            c0473pM1018i2.f850d = iArr3;
                            for (int i17 = i13; i17 < i9; i17++) {
                                c0473pArrM1012v[i17] = m1025s(c0473pArrM1012v[i17], i12);
                            }
                            C0473p c0473pM1014c = m1014c(m1012v(c0473pArrM1012v, i13, i9), 19);
                            C0473p c0473pM1018i3 = m1018i(18);
                            c0473pM1018i3.f849c = new C0473p[]{c0473pM1018i2, c0473pM1014c};
                            i6 = i10 + 1;
                            c0473pArrM1012v[i10] = c0473pM1018i3;
                        }
                        i10 = i6;
                    }
                    iArr2 = iArr;
                    i11 = i7;
                    i12 = length;
                    i13 = i9;
                    i9++;
                    i7 = i14;
                    i8 = i5;
                }
                int i18 = i7;
                int i19 = i8;
                int i20 = i18;
                int i21 = i20;
                int i22 = i21;
                C0473p c0473p5 = null;
                while (i20 <= i10) {
                    if (i20 < i10) {
                        c0473p = c0473pArrM1012v[i20];
                        int i23 = c0473p.f847a;
                        if (i23 == 2) {
                            c0473p = null;
                        } else if (i23 == 18) {
                            C0473p[] c0473pArr4 = c0473p.f849c;
                            if (c0473pArr4.length > 0) {
                                c0473p = c0473pArr4[i18];
                                if (c0473p.f847a == 2) {
                                    c0473p = null;
                                }
                            }
                        }
                        if (c0473p5 == null || !c0473p5.equals(c0473p) || (!m1007e(c0473p5) && (c0473p5.f847a != 17 || c0473p5.f851e != c0473p5.f852f || !m1007e(c0473p5.f849c[i18])))) {
                        }
                        i20++;
                        i19 = 1;
                    } else {
                        c0473p = null;
                    }
                    if (i20 != i22) {
                        if (i20 == i22 + 1) {
                            c0473pArrM1012v[i21] = c0473pArrM1012v[i22];
                            i21++;
                        } else {
                            int i24 = i22;
                            while (i24 < i20) {
                                int i25 = i24 != i22 ? i19 : i18;
                                C0473p c0473pM1018i4 = c0473pArrM1012v[i24];
                                if (c0473pM1018i4.f847a == 18) {
                                    C0473p[] c0473pArr5 = c0473pM1018i4.f849c;
                                    if (c0473pArr5.length > 0) {
                                        if (i25 != 0) {
                                            m1027u(c0473pArr5[i18]);
                                        }
                                        C0473p[] c0473pArr6 = c0473pM1018i4.f849c;
                                        int i26 = i19;
                                        C0473p[] c0473pArrM1012v2 = m1012v(c0473pArr6, i26, c0473pArr6.length);
                                        c0473pM1018i4.f849c = c0473pArrM1012v2;
                                        int length4 = c0473pArrM1012v2.length;
                                        if (length4 == 0) {
                                            c0473pM1018i4.f847a = 2;
                                            c0473pM1018i4.f849c = C0473p.f846j;
                                        } else if (length4 == i26) {
                                            C0473p c0473p6 = c0473pArrM1012v2[i18];
                                            m1027u(c0473pM1018i4);
                                            c0473pM1018i4 = c0473p6;
                                        }
                                    } else {
                                        if (i25 != 0) {
                                            m1027u(c0473pM1018i4);
                                        }
                                        c0473pM1018i4 = m1018i(2);
                                    }
                                } else {
                                    if (i25 != 0) {
                                        m1027u(c0473pM1018i4);
                                    }
                                    c0473pM1018i4 = m1018i(2);
                                }
                                c0473pArrM1012v[i24] = c0473pM1018i4;
                                i24++;
                                i19 = 1;
                            }
                            C0473p c0473pM1014c2 = m1014c(m1012v(c0473pArrM1012v, i22, i20), 19);
                            C0473p c0473pM1018i5 = m1018i(18);
                            c0473pM1018i5.f849c = new C0473p[]{c0473p5, c0473pM1014c2};
                            c0473pArrM1012v[i21] = c0473pM1018i5;
                            i21++;
                        }
                    }
                    i22 = i20;
                    c0473p5 = c0473p;
                    i20++;
                    i19 = 1;
                }
                int i27 = i18;
                int i28 = i27;
                int i29 = i28;
                while (i27 <= i21) {
                    if (i27 >= i21 || !m1007e(c0473pArrM1012v[i27])) {
                        if (i27 != i29) {
                            int i30 = i29 + 1;
                            if (i27 == i30) {
                                i4 = i28 + 1;
                                c0473pArrM1012v[i28] = c0473pArrM1012v[i29];
                            } else {
                                int i31 = i29;
                                for (int i32 = i30; i32 < i27; i32++) {
                                    C0473p c0473p7 = c0473pArrM1012v[i31];
                                    C0473p c0473p8 = c0473pArrM1012v[i32];
                                    if (AbstractC6468c.m12193b(c0473p7.f847a) < AbstractC6468c.m12193b(c0473p8.f847a) || (c0473p7.f847a == c0473p8.f847a && c0473p7.f850d.length < c0473p8.f850d.length)) {
                                        i31 = i32;
                                    }
                                }
                                C0473p c0473p9 = c0473pArrM1012v[i29];
                                c0473pArrM1012v[i29] = c0473pArrM1012v[i31];
                                c0473pArrM1012v[i31] = c0473p9;
                                while (i30 < i27) {
                                    m1008h(c0473pArrM1012v[i29], c0473pArrM1012v[i30]);
                                    m1027u(c0473pArrM1012v[i30]);
                                    i30++;
                                }
                                m1006b(c0473pArrM1012v[i29]);
                                i4 = i28 + 1;
                                c0473pArrM1012v[i28] = c0473pArrM1012v[i29];
                            }
                            i28 = i4;
                        }
                        if (i27 < i21) {
                            c0473pArrM1012v[i28] = c0473pArrM1012v[i27];
                            i28++;
                        }
                        i29 = i27 + 1;
                    }
                    i27++;
                }
                int i33 = i18;
                int i34 = i33;
                while (i33 < i28) {
                    int i35 = i33 + 1;
                    if (i35 >= i28 || c0473pArrM1012v[i33].f847a != 2 || c0473pArrM1012v[i35].f847a != 2) {
                        c0473pArrM1012v[i34] = c0473pArrM1012v[i33];
                        i34++;
                    }
                    i33 = i35;
                }
                i3 = i18;
                c0473pArrM1012v = m1012v(c0473pArrM1012v, i3, i34);
            }
            c0473pM1018i.f849c = c0473pArrM1012v;
            if (c0473pArrM1012v.length == 1) {
                C0473p c0473p10 = c0473pArrM1012v[i3];
                m1027u(c0473pM1018i);
                return c0473p10;
            }
        }
        return c0473pM1018i;
    }

    /* JADX INFO: renamed from: d */
    public final void m1015d() {
        m1017g(-1, 0);
        C0473p[] c0473pArrM1023q = m1023q();
        if (c0473pArrM1023q.length == 0) {
            m1024r(m1018i(2));
        } else {
            m1024r(m1014c(c0473pArrM1023q, 18));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m1016f(int i2) {
        int i3 = this.f827b;
        C0473p c0473pM1018i = m1018i(3);
        c0473pM1018i.f848b = i3;
        if ((i3 & 1) != 0 && i2 >= 65 && i2 <= 66639) {
            int i4 = i2;
            for (int iM1169f = AbstractC0475r.m1169f(i2); iM1169f != i2; iM1169f = AbstractC0475r.m1169f(iM1169f)) {
                if (i4 > iM1169f) {
                    i4 = iM1169f;
                }
            }
            i2 = i4;
        }
        c0473pM1018i.f850d = new int[]{i2};
        m1024r(c0473pM1018i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final boolean m1017g(int i2, int i3) {
        C0468k c0468k = this.f828c;
        int size = c0468k.size();
        if (size >= 2) {
            C0473p c0473p = (C0473p) c0468k.get(size - 1);
            C0473p c0473p2 = (C0473p) c0468k.get(size - 2);
            if (c0473p.f847a == 3 && c0473p2.f847a == 3 && (c0473p.f848b & 1) == (c0473p2.f848b & 1)) {
                int[] iArr = c0473p2.f850d;
                int[] iArr2 = c0473p.f850d;
                int[] iArr3 = new int[iArr.length + iArr2.length];
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                c0473p2.f850d = iArr3;
                if (i2 >= 0) {
                    c0473p.f850d = new int[]{i2};
                    c0473p.f848b = i3;
                    return true;
                }
                m1022p();
                m1027u(c0473p);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final C0473p m1018i(int i2) {
        C0473p[] c0473pArr;
        C0473p c0473p = this.f829d;
        if (c0473p == null || (c0473pArr = c0473p.f849c) == null || c0473pArr.length <= 0) {
            return new C0473p(i2);
        }
        this.f829d = c0473pArr[0];
        c0473p.f848b = 0;
        c0473p.f849c = C0473p.f846j;
        c0473p.f850d = null;
        c0473p.f852f = 0;
        c0473p.f851e = 0;
        c0473p.f853g = 0;
        c0473p.f854h = null;
        c0473p.f847a = i2;
        return c0473p;
    }

    /* JADX INFO: renamed from: j */
    public final C0473p m1019j(int i2) {
        C0473p c0473pM1018i = m1018i(i2);
        c0473pM1018i.f848b = this.f827b;
        return m1024r(c0473pM1018i);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m1020n(C0466i c0466i, C0458a c0458a) {
        int i2 = c0466i.f815b;
        if ((this.f827b & 64) != 0 && c0466i.m996f() && c0466i.m998h() == 92 && c0466i.m996f()) {
            c0466i.m998h();
            C0459b c0459b = (C0459b) C0459b.f785c.get(c0466i.m993c(i2));
            if (c0459b != null) {
                c0458a.m969c(c0459b, (this.f827b & 1) != 0);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m1021o(C0466i c0466i, C0458a c0458a) {
        String strSubstring;
        C0177l c0177l;
        C0177l c0177l2;
        int i2 = c0466i.f815b;
        if ((this.f827b & 128) == 0 || !(c0466i.m995e("\\p") || c0466i.m995e("\\P"))) {
            return false;
        }
        c0466i.m1001k(1);
        int i3 = c0466i.m998h() == 80 ? -1 : 1;
        if (!c0466i.m996f()) {
            c0466i.f815b = i2;
            throw new PatternSyntaxException("invalid character class range", c0466i.m1000j());
        }
        int iM998h = c0466i.m998h();
        if (iM998h != 123) {
            char c = (char) iM998h;
            strSubstring = iM998h == c ? String.valueOf(c) : new String(Character.toChars(c));
        } else {
            String strM1000j = c0466i.m1000j();
            int iIndexOf = strM1000j.indexOf(125);
            if (iIndexOf < 0) {
                c0466i.f815b = i2;
                throw new PatternSyntaxException("invalid character class range", c0466i.m1000j());
            }
            strSubstring = strM1000j.substring(0, iIndexOf);
            c0466i.f815b = strSubstring.length() + c0466i.f815b;
            c0466i.m1001k(1);
        }
        if (!strSubstring.isEmpty() && strSubstring.charAt(0) == '^') {
            i3 = -i3;
            strSubstring = strSubstring.substring(1);
        }
        if (strSubstring.equals("Any")) {
            int[][] iArr = f825g;
            c0177l = new C0177l(6, iArr, iArr);
        } else {
            int[][] iArr2 = (int[][]) AbstractC0474q.f867D1.get(strSubstring);
            if (iArr2 != null) {
                c0177l2 = new C0177l(6, iArr2, AbstractC0474q.f897N1.get(strSubstring));
            } else {
                int[][] iArr3 = (int[][]) AbstractC0474q.f870E1.get(strSubstring);
                if (iArr3 != null) {
                    c0177l2 = new C0177l(6, iArr3, AbstractC0474q.f882I1.get(strSubstring));
                } else {
                    c0177l = null;
                }
            }
            c0177l = c0177l2;
        }
        if (c0177l == null) {
            throw new PatternSyntaxException("invalid character class range", c0466i.m993c(i2));
        }
        int[][] iArr4 = (int[][]) c0177l.f333u;
        int[][] iArr5 = (int[][]) c0177l.f332t;
        if ((this.f827b & 1) != 0 && iArr5 != null) {
            C0458a c0458a2 = new C0458a(0);
            c0458a2.m971e(iArr4);
            c0458a2.m971e(iArr5);
            c0458a2.m972f();
            c0458a.m967a(i3, c0458a2.m975j());
            return true;
        }
        if (i3 >= 0) {
            c0458a.m971e(iArr4);
            return true;
        }
        int i4 = 0;
        for (int[] iArr6 : iArr4) {
            int i5 = iArr6[0];
            int i6 = iArr6[1];
            int i7 = iArr6[2];
            if (i7 == 1) {
                int i8 = i5 - 1;
                if (i4 <= i8) {
                    c0458a.m970d(i4, i8);
                }
                i4 = i6 + 1;
            } else {
                while (i5 <= i6) {
                    int i9 = i5 - 1;
                    if (i4 <= i9) {
                        c0458a.m970d(i4, i9);
                    }
                    i4 = i5 + 1;
                    i5 += i7;
                }
            }
        }
        if (i4 <= 1114111) {
            c0458a.m970d(i4, 1114111);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public final C0473p m1022p() {
        C0468k c0468k = this.f828c;
        return (C0473p) c0468k.remove(c0468k.size() - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final C0473p[] m1023q() {
        C0468k c0468k = this.f828c;
        int size = c0468k.size();
        int i2 = size;
        while (i2 > 0 && AbstractC6468c.m12193b(((C0473p) c0468k.get(i2 - 1)).f847a) < 19) {
            i2--;
        }
        C0473p[] c0473pArr = (C0473p[]) c0468k.subList(i2, size).toArray(new C0473p[size - i2]);
        c0468k.removeRange(i2, size);
        return c0473pArr;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x006b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0075  */
    /* JADX WARN: Code duplicated, block: B:33:0x007f  */
    /* JADX WARN: Code duplicated, block: B:35:0x008c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x008e  */
    /* JADX INFO: renamed from: r */
    public final C0473p m1024r(C0473p c0473p) {
        int[] iArr;
        int i2;
        int iM1169f;
        int i3;
        int[] iArr2;
        int i4;
        int i5;
        int i6 = c0473p.f847a;
        if (i6 == 4) {
            int[] iArr3 = c0473p.f850d;
            if (iArr3.length == 2 && (i5 = iArr3[0]) == iArr3[1]) {
                if (m1017g(i5, this.f827b & (-2))) {
                    return null;
                }
                c0473p.f847a = 3;
                c0473p.f850d = new int[]{c0473p.f850d[0]};
                c0473p.f848b = this.f827b & (-2);
            } else if (i6 == 4) {
                iArr2 = c0473p.f850d;
                if (iArr2.length != 4 && (i4 = iArr2[0]) == iArr2[1] && iArr2[2] == iArr2[3]) {
                    int iM1169f2 = AbstractC0475r.m1169f(i4);
                    int i7 = c0473p.f850d[2];
                    if (iM1169f2 != i7 || AbstractC0475r.m1169f(i7) != c0473p.f850d[0]) {
                        if (c0473p.f847a == 4) {
                            iArr = c0473p.f850d;
                            if (iArr.length == 2) {
                                i2 = iArr[0];
                                if (i2 + 1 == iArr[1]) {
                                    iM1169f = AbstractC0475r.m1169f(i2);
                                    i3 = c0473p.f850d[1];
                                    if (iM1169f != i3) {
                                    }
                                }
                            }
                        }
                        m1017g(-1, 0);
                    } else {
                        if (m1017g(c0473p.f850d[0], this.f827b | 1)) {
                            return null;
                        }
                        c0473p.f847a = 3;
                        c0473p.f850d = new int[]{c0473p.f850d[0]};
                        c0473p.f848b = this.f827b | 1;
                    }
                } else {
                    if (c0473p.f847a == 4) {
                        iArr = c0473p.f850d;
                        if (iArr.length == 2) {
                            i2 = iArr[0];
                            if (i2 + 1 == iArr[1]) {
                                iM1169f = AbstractC0475r.m1169f(i2);
                                i3 = c0473p.f850d[1];
                                if (iM1169f != i3 && AbstractC0475r.m1169f(i3) == c0473p.f850d[0]) {
                                    if (m1017g(c0473p.f850d[0], this.f827b | 1)) {
                                        return null;
                                    }
                                    c0473p.f847a = 3;
                                    c0473p.f850d = new int[]{c0473p.f850d[0]};
                                    c0473p.f848b = this.f827b | 1;
                                }
                            }
                        }
                    }
                    m1017g(-1, 0);
                }
            } else {
                if (c0473p.f847a == 4) {
                    iArr = c0473p.f850d;
                    if (iArr.length == 2) {
                        i2 = iArr[0];
                        if (i2 + 1 == iArr[1]) {
                            iM1169f = AbstractC0475r.m1169f(i2);
                            i3 = c0473p.f850d[1];
                            if (iM1169f != i3) {
                            }
                        }
                    }
                }
                m1017g(-1, 0);
            }
        } else if (i6 == 4) {
            iArr2 = c0473p.f850d;
            if (iArr2.length != 4) {
                if (c0473p.f847a == 4) {
                    iArr = c0473p.f850d;
                    if (iArr.length == 2) {
                        i2 = iArr[0];
                        if (i2 + 1 == iArr[1]) {
                            iM1169f = AbstractC0475r.m1169f(i2);
                            i3 = c0473p.f850d[1];
                            if (iM1169f != i3) {
                            }
                        }
                    }
                }
                m1017g(-1, 0);
            } else {
                if (c0473p.f847a == 4) {
                    iArr = c0473p.f850d;
                    if (iArr.length == 2) {
                        i2 = iArr[0];
                        if (i2 + 1 == iArr[1]) {
                            iM1169f = AbstractC0475r.m1169f(i2);
                            i3 = c0473p.f850d[1];
                            if (iM1169f != i3) {
                            }
                        }
                    }
                }
                m1017g(-1, 0);
            }
        } else {
            if (c0473p.f847a == 4) {
                iArr = c0473p.f850d;
                if (iArr.length == 2) {
                    i2 = iArr[0];
                    if (i2 + 1 == iArr[1]) {
                        iM1169f = AbstractC0475r.m1169f(i2);
                        i3 = c0473p.f850d[1];
                        if (iM1169f != i3) {
                        }
                    }
                }
            }
            m1017g(-1, 0);
        }
        this.f828c.add(c0473p);
        return c0473p;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0049 A[LOOP:0: B:22:0x0047->B:23:0x0049, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX INFO: renamed from: s */
    public final C0473p m1025s(C0473p c0473p, int i2) {
        int[] iArr;
        int length;
        int i3;
        int[] iArr2;
        int i4;
        int i5 = c0473p.f847a;
        if (i5 == 18) {
            C0473p[] c0473pArr = c0473p.f849c;
            if (c0473pArr.length > 0) {
                C0473p c0473pM1025s = m1025s(c0473pArr[0], i2);
                c0473p.f849c[0] = c0473pM1025s;
                if (c0473pM1025s.f847a == 2) {
                    m1027u(c0473pM1025s);
                    C0473p[] c0473pArr2 = c0473p.f849c;
                    int length2 = c0473pArr2.length;
                    if (length2 == 0 || length2 == 1) {
                        c0473p.f847a = 2;
                        c0473p.f849c = null;
                        return c0473p;
                    }
                    if (length2 != 2) {
                        c0473p.f849c = m1012v(c0473pArr2, 1, c0473pArr2.length);
                        return c0473p;
                    }
                    C0473p c0473p2 = c0473pArr2[1];
                    m1027u(c0473p);
                    return c0473p2;
                }
            } else if (i5 == 3) {
                iArr = c0473p.f850d;
                length = iArr.length;
                i3 = length - i2;
                iArr2 = new int[i3];
                for (i4 = i2; i4 < length; i4++) {
                    iArr2[i4 - i2] = iArr[i4];
                }
                c0473p.f850d = iArr2;
                if (i3 == 0) {
                    c0473p.f847a = 2;
                }
            }
        } else if (i5 == 3) {
            iArr = c0473p.f850d;
            length = iArr.length;
            i3 = length - i2;
            iArr2 = new int[i3];
            while (i4 < length) {
                iArr2[i4 - i2] = iArr[i4];
            }
            c0473p.f850d = iArr2;
            if (i3 == 0) {
                c0473p.f847a = 2;
            }
        }
        return c0473p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public final void m1026t(int i2, int i3, int i4, int i5, C0466i c0466i, int i6) {
        int i7 = this.f827b;
        if ((i7 & 64) != 0) {
            if (c0466i.m996f() && c0466i.m994d('?')) {
                c0466i.m1001k(1);
                i7 ^= 32;
            }
            if (i6 != -1) {
                throw new PatternSyntaxException("invalid nested repetition operator", c0466i.m993c(i6));
            }
        }
        C0468k c0468k = this.f828c;
        int size = c0468k.size();
        if (size == 0) {
            throw new PatternSyntaxException("missing argument to repetition operator", c0466i.m993c(i5));
        }
        int i8 = size - 1;
        C0473p c0473p = (C0473p) c0468k.get(i8);
        if (AbstractC6468c.m12193b(c0473p.f847a) >= 19) {
            throw new PatternSyntaxException("missing argument to repetition operator", c0466i.m993c(i5));
        }
        C0473p c0473pM1018i = m1018i(i2);
        c0473pM1018i.f851e = i3;
        c0473pM1018i.f852f = i4;
        c0473pM1018i.f848b = i7;
        c0473pM1018i.f849c = new C0473p[]{c0473p};
        c0468k.set(i8, c0473pM1018i);
    }

    /* JADX INFO: renamed from: u */
    public final void m1027u(C0473p c0473p) {
        C0473p[] c0473pArr = c0473p.f849c;
        if (c0473pArr != null && c0473pArr.length > 0) {
            c0473pArr[0] = this.f829d;
        }
        this.f829d = c0473p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public final boolean m1028w() {
        C0468k c0468k = this.f828c;
        int size = c0468k.size();
        if (size >= 3 && ((C0473p) c0468k.get(size - 2)).f847a == 21) {
            int i2 = size - 1;
            if (m1007e((C0473p) c0468k.get(i2))) {
                int i3 = size - 3;
                if (m1007e((C0473p) c0468k.get(i3))) {
                    C0473p c0473p = (C0473p) c0468k.get(i2);
                    C0473p c0473p2 = (C0473p) c0468k.get(i3);
                    if (AbstractC6468c.m12193b(c0473p.f847a) > AbstractC6468c.m12193b(c0473p2.f847a)) {
                        c0468k.set(i3, c0473p);
                    } else {
                        c0473p2 = c0473p;
                        c0473p = c0473p2;
                    }
                    m1008h(c0473p, c0473p2);
                    m1027u(c0473p2);
                    m1022p();
                    return true;
                }
            }
        }
        if (size < 2) {
            return false;
        }
        int i4 = size - 1;
        C0473p c0473p3 = (C0473p) c0468k.get(i4);
        int i5 = size - 2;
        C0473p c0473p4 = (C0473p) c0468k.get(i5);
        if (c0473p4.f847a != 21) {
            return false;
        }
        if (size >= 3) {
            m1006b((C0473p) c0468k.get(size - 3));
        }
        c0468k.set(i5, c0473p3);
        c0468k.set(i4, c0473p4);
        return true;
    }
}
