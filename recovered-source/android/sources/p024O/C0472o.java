package p024O;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: renamed from: O.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0472o {

    /* JADX INFO: renamed from: a */
    public final String f838a;

    /* JADX INFO: renamed from: b */
    public final C0471n f839b;

    /* JADX INFO: renamed from: c */
    public final int f840c;

    /* JADX INFO: renamed from: d */
    public final int f841d;

    /* JADX INFO: renamed from: e */
    public final boolean f842e;

    /* JADX INFO: renamed from: f */
    public String f843f;

    /* JADX INFO: renamed from: g */
    public int f844g;

    /* JADX INFO: renamed from: h */
    public final ArrayDeque f845h = new ArrayDeque();

    public C0472o(String str, C0471n c0471n, int i2, boolean z) {
        this.f838a = str;
        this.f839b = c0471n;
        this.f841d = i2;
        int i3 = c0471n.f836c;
        int i4 = 0;
        while (true) {
            C0462e c0462e = c0471n.f834a[i3];
            int i5 = c0462e.f794a;
            if (i5 != 3) {
                if (i5 == 4) {
                    i4 |= c0462e.f796c;
                } else if (i5 == 5) {
                    i4 = -1;
                    break;
                } else if (i5 != 7) {
                    break;
                }
            }
            i3 = c0462e.f795b;
        }
        this.f840c = i4;
        this.f842e = z;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:103:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:109:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:116:0x020c  */
    /* JADX WARN: Code duplicated, block: B:117:0x020f  */
    /* JADX WARN: Code duplicated, block: B:121:0x021f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0224  */
    /* JADX WARN: Code duplicated, block: B:125:0x0232  */
    /* JADX WARN: Code duplicated, block: B:134:0x0250  */
    /* JADX WARN: Code duplicated, block: B:139:0x0261  */
    /* JADX WARN: Code duplicated, block: B:141:0x0265  */
    /* JADX WARN: Code duplicated, block: B:147:0x027a  */
    /* JADX WARN: Code duplicated, block: B:150:0x0281  */
    /* JADX WARN: Code duplicated, block: B:152:0x028b  */
    /* JADX WARN: Code duplicated, block: B:155:0x0290  */
    /* JADX WARN: Code duplicated, block: B:157:0x0298  */
    /* JADX WARN: Code duplicated, block: B:159:0x029e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:161:0x02a1 A[LOOP:3: B:158:0x029c->B:161:0x02a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:163:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:177:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:179:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:183:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:184:0x030a  */
    /* JADX WARN: Code duplicated, block: B:186:0x031f  */
    /* JADX WARN: Code duplicated, block: B:190:0x0332  */
    /* JADX WARN: Code duplicated, block: B:192:0x0336  */
    /* JADX WARN: Code duplicated, block: B:193:0x0338  */
    /* JADX WARN: Code duplicated, block: B:198:0x0344  */
    /* JADX WARN: Code duplicated, block: B:201:0x0352  */
    /* JADX WARN: Code duplicated, block: B:204:0x035c  */
    /* JADX WARN: Code duplicated, block: B:234:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:235:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:245:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x0361 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x02a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x0267 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x019d  */
    /* JADX INFO: renamed from: a */
    public final boolean m1033a(C0461d c0461d, int i2, int i3, int i4, int[] iArr, int i5) {
        C0465h c0465h;
        int i6;
        int i7;
        int i8;
        C0463f c0463f;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        C0463f c0463f2;
        int i15;
        int iM991a;
        int i16;
        boolean z;
        int i17;
        int i18;
        int i19;
        C0464g[] c0464gArr;
        C0471n c0471n;
        C0472o c0472o;
        C0463f c0463f3;
        C0463f c0463f4;
        int i20;
        int i21;
        int i22;
        int i23;
        C0464g c0464gM988a;
        int i24;
        C0462e c0462e;
        C0471n c0471n2;
        C0472o c0472o2;
        C0463f c0463f5;
        C0465h c0465h2;
        C0463f c0463f6;
        boolean z2;
        int i25;
        char c;
        int[] iArr2;
        int i26;
        int[] iArr3;
        int length;
        int i27;
        int i28;
        int i29;
        int[] iArr4;
        int i30;
        int i31;
        int iM1169f;
        boolean z3;
        CharSequence charSequence;
        int iIndexOf;
        int i32 = i2;
        int i33 = 0;
        if (i32 > i3) {
            return false;
        }
        C0466i c0466i = new C0466i((CharSequence) c0461d.f793a, i3);
        int i34 = 2;
        int i35 = i5 * 2;
        synchronized (this) {
            try {
                c0465h = !this.f845h.isEmpty() ? (C0465h) this.f845h.remove() : new C0465h(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        C0465h c0465h3 = c0465h;
        c0465h3.f813i = i35;
        if (i35 > c0465h3.f812h.length) {
            for (int i36 = 0; i36 < c0465h3.f810f; i36++) {
                c0465h3.f809e[i36].f803a = new int[i35];
            }
            c0465h3.f812h = new int[i35];
        } else {
            for (int i37 = 0; i37 < c0465h3.f810f; i37++) {
                Arrays.fill(c0465h3.f809e[i37].f803a, 0, i35, 0);
            }
        }
        C0471n c0471n3 = c0465h3.f806b;
        C0472o c0472o3 = c0465h3.f805a;
        int i38 = c0472o3.f840c;
        int[] iArrCopyOf = null;
        if (i38 != -1 && (!(i4 == 1 || i4 == 2) || i32 == 0)) {
            c0465h3.f811g = false;
            Arrays.fill(c0465h3.f812h, 0, c0471n3.f837d, -1);
            C0463f c0463f7 = c0465h3.f807c;
            C0463f c0463f8 = c0465h3.f808d;
            int iM1002l = c0466i.m1002l(i32);
            int i39 = iM1002l >> 3;
            int i40 = iM1002l & 7;
            int i41 = 1;
            if (iM1002l != -8) {
                int iM1002l2 = c0466i.m1002l(i32 + i40);
                i7 = iM1002l2 >> 3;
                i6 = iM1002l2 & 7;
            } else {
                i6 = 0;
                i7 = -1;
            }
            int iM1164a = i32 == 0 ? AbstractC0475r.m1164a(-1, i39) : c0466i.m991a(i32);
            C0463f c0463f9 = c0463f8;
            int i42 = i40;
            while (true) {
                if (c0463f7.f799b != 0) {
                    i34 = i34;
                    i8 = i33;
                    c0463f = c0463f7;
                    i9 = i32;
                    i10 = i6;
                    i11 = i39;
                    i12 = i7;
                    i13 = i42;
                    if (c0465h3.f811g && (i9 == 0 || i4 == 0)) {
                        if (c0465h3.f813i > 0) {
                            c0465h3.f812h[i8] = i9;
                        }
                        i14 = i12;
                        C0463f c0463f10 = c0463f;
                        c0465h3.m988a(c0463f10, c0471n3.f836c, i9, c0465h3.f812h, iM1164a, null);
                        c0463f2 = c0463f10;
                    } else {
                        i14 = i12;
                        c0463f2 = c0463f;
                    }
                    i15 = i9 + i13;
                    iM991a = c0466i.m991a(i15);
                    if (i9 == c0466i.f815b) {
                        i16 = i41;
                    } else {
                        i16 = i8;
                    }
                    z = c0472o3.f842e;
                    i17 = i8;
                    while (true) {
                        i18 = c0463f2.f799b;
                        i19 = i10;
                        c0464gArr = (C0464g[]) c0463f2.f800c;
                        if (i17 < i18) {
                            i23 = i17;
                            c0464gM988a = c0464gArr[i23];
                            if (c0464gM988a == null) {
                                i24 = i23;
                                if (!z && c0465h3.f811g && c0465h3.f813i > 0) {
                                    if (c0465h3.f812h[i8] < c0464gM988a.f803a[i8]) {
                                        c0465h3.m990c(c0464gM988a);
                                        i24 = i24;
                                    }
                                    i17 = i24 + 1;
                                    z = z2;
                                    c0471n3 = c0471n2;
                                    c0472o3 = c0472o2;
                                    i8 = 0;
                                    i34 = 2;
                                    c0463f9 = c0463f6;
                                    c0465h3 = c0465h2;
                                    c0463f2 = c0463f5;
                                    i10 = i19;
                                }
                                c0462e = c0464gM988a.f804b;
                                switch (c0462e.f794a) {
                                    case 6:
                                        i24 = i24;
                                        c0471n2 = c0471n3;
                                        c0472o2 = c0472o3;
                                        c0463f5 = c0463f2;
                                        c0465h2 = c0465h3;
                                        c0463f6 = c0463f9;
                                        z2 = z;
                                        if (i4 == i34 || i16 != 0) {
                                            i25 = c0465h2.f813i;
                                            if (i25 > 0) {
                                                if (z2 || !c0465h2.f811g) {
                                                    c = 1;
                                                } else {
                                                    c = 1;
                                                    if (c0465h2.f812h[1] < i9) {
                                                    }
                                                }
                                                int[] iArr5 = c0464gM988a.f803a;
                                                iArr5[c] = i9;
                                                int i43 = i8;
                                                System.arraycopy(iArr5, i43, c0465h2.f812h, i43, i25);
                                            }
                                            if (!z2) {
                                                c0465h2.m989b(c0463f5, i24 + 1);
                                            }
                                            c0465h2.f811g = true;
                                        }
                                        if (c0464gM988a != null) {
                                            c0465h2.m990c(c0464gM988a);
                                            c0464gArr[i24] = null;
                                        }
                                        i17 = i24 + 1;
                                        z = z2;
                                        c0471n3 = c0471n2;
                                        c0472o3 = c0472o2;
                                        i8 = 0;
                                        i34 = 2;
                                        c0463f9 = c0463f6;
                                        c0465h3 = c0465h2;
                                        c0463f2 = c0463f5;
                                        i10 = i19;
                                        break;
                                    case 7:
                                    default:
                                        throw new IllegalStateException("bad inst");
                                    case 8:
                                        iArr2 = c0462e.f797d;
                                        c0471n2 = c0471n3;
                                        if (iArr2.length == 1) {
                                            i31 = iArr2[i8];
                                            if (i11 != i31) {
                                                if ((c0462e.f796c & 1) != 0) {
                                                    iM1169f = AbstractC0475r.m1169f(i31);
                                                    while (true) {
                                                        if (iM1169f != i31) {
                                                            if (i11 == iM1169f) {
                                                                iM1169f = AbstractC0475r.m1169f(iM1169f);
                                                            }
                                                        }
                                                    }
                                                }
                                                c0472o2 = c0472o3;
                                                c0463f5 = c0463f2;
                                                c0465h2 = c0465h3;
                                                c0463f6 = c0463f9;
                                                z2 = z;
                                                if (c0464gM988a != null) {
                                                    c0465h2.m990c(c0464gM988a);
                                                    c0464gArr[i24] = null;
                                                }
                                                i17 = i24 + 1;
                                                z = z2;
                                                c0471n3 = c0471n2;
                                                c0472o3 = c0472o2;
                                                i8 = 0;
                                                i34 = 2;
                                                c0463f9 = c0463f6;
                                                c0465h3 = c0465h2;
                                                c0463f2 = c0463f5;
                                                i10 = i19;
                                            }
                                            c0472o2 = c0472o3;
                                            int i44 = i9;
                                            i24 = i24;
                                            c0463f5 = c0463f2;
                                            c0465h2 = c0465h3;
                                            c0463f6 = c0463f9;
                                            z2 = z;
                                            c0464gM988a = c0465h2.m988a(c0463f6, c0462e.f795b, i15, c0464gM988a.f803a, iM991a, c0464gM988a);
                                            i9 = i44;
                                            if (c0464gM988a != null) {
                                                c0465h2.m990c(c0464gM988a);
                                                c0464gArr[i24] = null;
                                            }
                                            i17 = i24 + 1;
                                            z = z2;
                                            c0471n3 = c0471n2;
                                            c0472o3 = c0472o2;
                                            i8 = 0;
                                            i34 = 2;
                                            c0463f9 = c0463f6;
                                            c0465h3 = c0465h2;
                                            c0463f2 = c0463f5;
                                            i10 = i19;
                                        } else {
                                            i26 = i8;
                                            while (true) {
                                                iArr3 = c0462e.f797d;
                                                c0472o2 = c0472o3;
                                                if (i26 < iArr3.length || i26 > 8) {
                                                    length = iArr3.length / 2;
                                                    i27 = i8;
                                                    while (true) {
                                                        if (i27 < length) {
                                                            i24 = i24;
                                                            c0463f5 = c0463f2;
                                                            c0465h2 = c0465h3;
                                                            c0463f6 = c0463f9;
                                                            z2 = z;
                                                            if (c0464gM988a != null) {
                                                                c0465h2.m990c(c0464gM988a);
                                                                c0464gArr[i24] = null;
                                                            }
                                                            i17 = i24 + 1;
                                                            z = z2;
                                                            c0471n3 = c0471n2;
                                                            c0472o3 = c0472o2;
                                                            i8 = 0;
                                                            i34 = 2;
                                                            c0463f9 = c0463f6;
                                                            c0465h3 = c0465h2;
                                                            c0463f2 = c0463f5;
                                                            i10 = i19;
                                                        } else {
                                                            i28 = ((length - i27) / 2) + i27;
                                                            i29 = length;
                                                            iArr4 = c0462e.f797d;
                                                            i30 = i28 * 2;
                                                            if (iArr4[i30] <= i11) {
                                                                i29 = i28;
                                                            } else if (i11 <= iArr4[i30 + 1]) {
                                                                int i45 = i9;
                                                                i24 = i24;
                                                                c0463f5 = c0463f2;
                                                                c0465h2 = c0465h3;
                                                                c0463f6 = c0463f9;
                                                                z2 = z;
                                                                c0464gM988a = c0465h2.m988a(c0463f6, c0462e.f795b, i15, c0464gM988a.f803a, iM991a, c0464gM988a);
                                                                i9 = i45;
                                                                if (c0464gM988a != null) {
                                                                    c0465h2.m990c(c0464gM988a);
                                                                    c0464gArr[i24] = null;
                                                                }
                                                                i17 = i24 + 1;
                                                                z = z2;
                                                                c0471n3 = c0471n2;
                                                                c0472o3 = c0472o2;
                                                                i8 = 0;
                                                                i34 = 2;
                                                                c0463f9 = c0463f6;
                                                                c0465h3 = c0465h2;
                                                                c0463f2 = c0463f5;
                                                                i10 = i19;
                                                            } else {
                                                                i27 = i28 + 1;
                                                            }
                                                            z = z;
                                                            i24 = i24;
                                                            c0463f9 = c0463f9;
                                                            c0465h3 = c0465h3;
                                                            c0463f2 = c0463f2;
                                                            length = i29;
                                                        }
                                                        break;
                                                    }
                                                } else if (i11 < iArr3[i26]) {
                                                    i24 = i24;
                                                    c0463f5 = c0463f2;
                                                    c0465h2 = c0465h3;
                                                    c0463f6 = c0463f9;
                                                    z2 = z;
                                                    if (c0464gM988a != null) {
                                                        c0465h2.m990c(c0464gM988a);
                                                        c0464gArr[i24] = null;
                                                    }
                                                    i17 = i24 + 1;
                                                    z = z2;
                                                    c0471n3 = c0471n2;
                                                    c0472o3 = c0472o2;
                                                    i8 = 0;
                                                    i34 = 2;
                                                    c0463f9 = c0463f6;
                                                    c0465h3 = c0465h2;
                                                    c0463f2 = c0463f5;
                                                    i10 = i19;
                                                } else if (i11 <= iArr3[i26 + 1]) {
                                                    int i46 = i9;
                                                    i24 = i24;
                                                    c0463f5 = c0463f2;
                                                    c0465h2 = c0465h3;
                                                    c0463f6 = c0463f9;
                                                    z2 = z;
                                                    c0464gM988a = c0465h2.m988a(c0463f6, c0462e.f795b, i15, c0464gM988a.f803a, iM991a, c0464gM988a);
                                                    i9 = i46;
                                                    if (c0464gM988a != null) {
                                                        c0465h2.m990c(c0464gM988a);
                                                        c0464gArr[i24] = null;
                                                    }
                                                    i17 = i24 + 1;
                                                    z = z2;
                                                    c0471n3 = c0471n2;
                                                    c0472o3 = c0472o2;
                                                    i8 = 0;
                                                    i34 = 2;
                                                    c0463f9 = c0463f6;
                                                    c0465h3 = c0465h2;
                                                    c0463f2 = c0463f5;
                                                    i10 = i19;
                                                } else {
                                                    i26 += 2;
                                                    c0472o3 = c0472o2;
                                                }
                                            }
                                        }
                                        break;
                                    case 9:
                                        if (i11 == c0462e.f797d[i8]) {
                                            c0471n2 = c0471n3;
                                            c0472o2 = c0472o3;
                                            int i47 = i9;
                                            i24 = i24;
                                            c0463f5 = c0463f2;
                                            c0465h2 = c0465h3;
                                            c0463f6 = c0463f9;
                                            z2 = z;
                                            c0464gM988a = c0465h2.m988a(c0463f6, c0462e.f795b, i15, c0464gM988a.f803a, iM991a, c0464gM988a);
                                            i9 = i47;
                                            if (c0464gM988a != null) {
                                                c0465h2.m990c(c0464gM988a);
                                                c0464gArr[i24] = null;
                                            }
                                            i17 = i24 + 1;
                                            z = z2;
                                            c0471n3 = c0471n2;
                                            c0472o3 = c0472o2;
                                            i8 = 0;
                                            i34 = 2;
                                            c0463f9 = c0463f6;
                                            c0465h3 = c0465h2;
                                            c0463f2 = c0463f5;
                                            i10 = i19;
                                        }
                                        c0471n2 = c0471n3;
                                        c0472o2 = c0472o3;
                                        c0463f5 = c0463f2;
                                        c0465h2 = c0465h3;
                                        c0463f6 = c0463f9;
                                        z2 = z;
                                        if (c0464gM988a != null) {
                                            c0465h2.m990c(c0464gM988a);
                                            c0464gArr[i24] = null;
                                        }
                                        i17 = i24 + 1;
                                        z = z2;
                                        c0471n3 = c0471n2;
                                        c0472o3 = c0472o2;
                                        i8 = 0;
                                        i34 = 2;
                                        c0463f9 = c0463f6;
                                        c0465h3 = c0465h2;
                                        c0463f2 = c0463f5;
                                        i10 = i19;
                                        break;
                                    case 10:
                                        c0471n2 = c0471n3;
                                        c0472o2 = c0472o3;
                                        int i48 = i9;
                                        i24 = i24;
                                        c0463f5 = c0463f2;
                                        c0465h2 = c0465h3;
                                        c0463f6 = c0463f9;
                                        z2 = z;
                                        c0464gM988a = c0465h2.m988a(c0463f6, c0462e.f795b, i15, c0464gM988a.f803a, iM991a, c0464gM988a);
                                        i9 = i48;
                                        if (c0464gM988a != null) {
                                            c0465h2.m990c(c0464gM988a);
                                            c0464gArr[i24] = null;
                                        }
                                        i17 = i24 + 1;
                                        z = z2;
                                        c0471n3 = c0471n2;
                                        c0472o3 = c0472o2;
                                        i8 = 0;
                                        i34 = 2;
                                        c0463f9 = c0463f6;
                                        c0465h3 = c0465h2;
                                        c0463f2 = c0463f5;
                                        i10 = i19;
                                        break;
                                    case 11:
                                        if (i11 != 10) {
                                            c0471n2 = c0471n3;
                                            c0472o2 = c0472o3;
                                            int i49 = i9;
                                            i24 = i24;
                                            c0463f5 = c0463f2;
                                            c0465h2 = c0465h3;
                                            c0463f6 = c0463f9;
                                            z2 = z;
                                            c0464gM988a = c0465h2.m988a(c0463f6, c0462e.f795b, i15, c0464gM988a.f803a, iM991a, c0464gM988a);
                                            i9 = i49;
                                            if (c0464gM988a != null) {
                                                c0465h2.m990c(c0464gM988a);
                                                c0464gArr[i24] = null;
                                            }
                                            i17 = i24 + 1;
                                            z = z2;
                                            c0471n3 = c0471n2;
                                            c0472o3 = c0472o2;
                                            i8 = 0;
                                            i34 = 2;
                                            c0463f9 = c0463f6;
                                            c0465h3 = c0465h2;
                                            c0463f2 = c0463f5;
                                            i10 = i19;
                                        }
                                        c0471n2 = c0471n3;
                                        c0472o2 = c0472o3;
                                        c0463f5 = c0463f2;
                                        c0465h2 = c0465h3;
                                        c0463f6 = c0463f9;
                                        z2 = z;
                                        if (c0464gM988a != null) {
                                            c0465h2.m990c(c0464gM988a);
                                            c0464gArr[i24] = null;
                                        }
                                        i17 = i24 + 1;
                                        z = z2;
                                        c0471n3 = c0471n2;
                                        c0472o3 = c0472o2;
                                        i8 = 0;
                                        i34 = 2;
                                        c0463f9 = c0463f6;
                                        c0465h3 = c0465h2;
                                        c0463f2 = c0463f5;
                                        i10 = i19;
                                        break;
                                }
                            } else {
                                i24 = i23;
                            }
                            c0471n2 = c0471n3;
                            c0472o2 = c0472o3;
                            c0463f5 = c0463f2;
                            c0465h2 = c0465h3;
                            c0463f6 = c0463f9;
                            z2 = z;
                            i17 = i24 + 1;
                            z = z2;
                            c0471n3 = c0471n2;
                            c0472o3 = c0472o2;
                            i8 = 0;
                            i34 = 2;
                            c0463f9 = c0463f6;
                            c0465h3 = c0465h2;
                            c0463f2 = c0463f5;
                            i10 = i19;
                        }
                    }
                    c0471n = c0471n3;
                    c0472o = c0472o3;
                    c0463f3 = c0463f2;
                    c0465h3 = c0465h3;
                    c0463f4 = c0463f9;
                    i20 = i8;
                    c0463f3.f799b = i20;
                    if (i13 != 0 && (c0465h3.f813i != 0 || !c0465h3.f811g)) {
                        i21 = i14;
                        if (i21 != -1) {
                            int iM1002l3 = c0466i.m1002l(i15 + i19);
                            i22 = iM1002l3 >> 3;
                            i6 = iM1002l3 & 7;
                        } else {
                            i6 = i19;
                            i22 = i21;
                        }
                        i41 = 1;
                        c0463f9 = c0463f3;
                        i32 = i15;
                        i33 = i20;
                        iM1164a = iM991a;
                        i7 = i22;
                        c0472o3 = c0472o;
                        i34 = 2;
                        i42 = i19;
                        i39 = i21;
                        c0463f7 = c0463f4;
                        c0471n3 = c0471n;
                    }
                } else if (((i38 & 4) == 0 || i32 == 0) && !c0465h3.f811g) {
                    if (c0472o3.f843f.isEmpty() || i7 == c0472o3.f844g) {
                        i34 = i34;
                        i8 = i33;
                        c0463f = c0463f7;
                        i9 = i32;
                        i10 = i6;
                        i11 = i39;
                        i12 = i7;
                    } else {
                        CharSequence charSequence2 = (CharSequence) c0466i.f816c;
                        String str = c0472o3.f843f;
                        if (charSequence2 instanceof String) {
                            iIndexOf = ((String) charSequence2).indexOf(str, i32);
                        } else {
                            if (charSequence2 instanceof StringBuilder) {
                                iIndexOf = ((StringBuilder) charSequence2).indexOf(str, i32);
                            } else {
                                if (i32 < charSequence2.length()) {
                                    int i50 = i32 < 0 ? i33 : i32;
                                    if (str.isEmpty()) {
                                        i32 = i32;
                                        i34 = i34;
                                        i8 = i33;
                                        c0463f = c0463f7;
                                    } else {
                                        char cCharAt = str.charAt(i33);
                                        int length2 = charSequence2.length() - str.length();
                                        while (true) {
                                            if (i50 <= length2) {
                                                i8 = i33;
                                                if (charSequence2.charAt(i50) != cCharAt) {
                                                    do {
                                                        i50++;
                                                        if (i50 <= length2) {
                                                        }
                                                    } while (charSequence2.charAt(i50) != cCharAt);
                                                }
                                                if (i50 <= length2) {
                                                    int i51 = i50 + 1;
                                                    i34 = i34;
                                                    int length3 = (str.length() + i51) - 1;
                                                    i32 = i32;
                                                    int i52 = i41;
                                                    while (true) {
                                                        if (i51 < length3) {
                                                            c0463f = c0463f7;
                                                            charSequence = charSequence2;
                                                            if (charSequence2.charAt(i51) == str.charAt(i52)) {
                                                                i51++;
                                                                i52++;
                                                                charSequence2 = charSequence;
                                                                c0463f7 = c0463f;
                                                            }
                                                        } else {
                                                            charSequence = charSequence2;
                                                            c0463f = c0463f7;
                                                        }
                                                    }
                                                    if (i51 == length3) {
                                                    }
                                                } else {
                                                    i32 = i32;
                                                    i34 = i34;
                                                    charSequence = charSequence2;
                                                    c0463f = c0463f7;
                                                }
                                                i50++;
                                                i32 = i32;
                                                charSequence2 = charSequence;
                                                i33 = i8;
                                                c0463f7 = c0463f;
                                                i34 = i34;
                                            }
                                        }
                                    }
                                    iIndexOf = i50;
                                } else if (str.isEmpty()) {
                                    iIndexOf = i33;
                                    i8 = iIndexOf;
                                    c0463f = c0463f7;
                                }
                                i32 = i32;
                                i34 = i34;
                                i8 = i33;
                                c0463f = c0463f7;
                                iIndexOf = -1;
                            }
                            if (iIndexOf >= 0) {
                                iIndexOf -= i32;
                            }
                            if (iIndexOf < 0) {
                                c0463f4 = c0463f9;
                                i20 = i8;
                            } else {
                                int i53 = i32 + iIndexOf;
                                int iM1002l4 = c0466i.m1002l(i53);
                                int i54 = iM1002l4 >> 3;
                                i42 = iM1002l4 & 7;
                                int iM1002l5 = c0466i.m1002l(i53 + i42);
                                int i55 = iM1002l5 >> 3;
                                i10 = iM1002l5 & 7;
                                i12 = i55;
                                i11 = i54;
                                i9 = i53;
                            }
                        }
                        i8 = i33;
                        c0463f = c0463f7;
                        if (iIndexOf >= 0) {
                            iIndexOf -= i32;
                        }
                        if (iIndexOf < 0) {
                            c0463f4 = c0463f9;
                            i20 = i8;
                        } else {
                            int i56 = i32 + iIndexOf;
                            int iM1002l6 = c0466i.m1002l(i56);
                            int i57 = iM1002l6 >> 3;
                            i42 = iM1002l6 & 7;
                            int iM1002l7 = c0466i.m1002l(i56 + i42);
                            int i58 = iM1002l7 >> 3;
                            i10 = iM1002l7 & 7;
                            i12 = i58;
                            i11 = i57;
                            i9 = i56;
                        }
                    }
                    i13 = i42;
                    if (c0465h3.f811g) {
                        i14 = i12;
                        c0463f2 = c0463f;
                    } else {
                        i14 = i12;
                        c0463f2 = c0463f;
                    }
                    i15 = i9 + i13;
                    iM991a = c0466i.m991a(i15);
                    if (i9 == c0466i.f815b) {
                        i16 = i41;
                    } else {
                        i16 = i8;
                    }
                    z = c0472o3.f842e;
                    i17 = i8;
                    while (true) {
                        i18 = c0463f2.f799b;
                        i19 = i10;
                        c0464gArr = (C0464g[]) c0463f2.f800c;
                        if (i17 < i18) {
                            i23 = i17;
                            c0464gM988a = c0464gArr[i23];
                            if (c0464gM988a == null) {
                                i24 = i23;
                                if (!z) {
                                }
                                c0462e = c0464gM988a.f804b;
                                switch (c0462e.f794a) {
                                    case 6:
                                        i24 = i24;
                                        c0471n2 = c0471n3;
                                        c0472o2 = c0472o3;
                                        c0463f5 = c0463f2;
                                        c0465h2 = c0465h3;
                                        c0463f6 = c0463f9;
                                        z2 = z;
                                        if (i4 == i34) {
                                            i25 = c0465h2.f813i;
                                            if (i25 > 0) {
                                                if (z2) {
                                                    c = 1;
                                                    int[] iArr6 = c0464gM988a.f803a;
                                                    iArr6[c] = i9;
                                                    int i410 = i8;
                                                    System.arraycopy(iArr6, i410, c0465h2.f812h, i410, i25);
                                                } else {
                                                    c = 1;
                                                    int[] iArr7 = c0464gM988a.f803a;
                                                    iArr7[c] = i9;
                                                    int i411 = i8;
                                                    System.arraycopy(iArr7, i411, c0465h2.f812h, i411, i25);
                                                }
                                            }
                                            if (!z2) {
                                                c0465h2.m989b(c0463f5, i24 + 1);
                                            }
                                            c0465h2.f811g = true;
                                        } else {
                                            i25 = c0465h2.f813i;
                                            if (i25 > 0) {
                                                if (z2) {
                                                    c = 1;
                                                    int[] iArr8 = c0464gM988a.f803a;
                                                    iArr8[c] = i9;
                                                    int i412 = i8;
                                                    System.arraycopy(iArr8, i412, c0465h2.f812h, i412, i25);
                                                } else {
                                                    c = 1;
                                                    int[] iArr9 = c0464gM988a.f803a;
                                                    iArr9[c] = i9;
                                                    int i413 = i8;
                                                    System.arraycopy(iArr9, i413, c0465h2.f812h, i413, i25);
                                                }
                                            }
                                            if (!z2) {
                                                c0465h2.m989b(c0463f5, i24 + 1);
                                            }
                                            c0465h2.f811g = true;
                                        }
                                        if (c0464gM988a != null) {
                                            c0465h2.m990c(c0464gM988a);
                                            c0464gArr[i24] = null;
                                        }
                                        i17 = i24 + 1;
                                        z = z2;
                                        c0471n3 = c0471n2;
                                        c0472o3 = c0472o2;
                                        i8 = 0;
                                        i34 = 2;
                                        c0463f9 = c0463f6;
                                        c0465h3 = c0465h2;
                                        c0463f2 = c0463f5;
                                        i10 = i19;
                                        break;
                                    case 7:
                                    default:
                                        throw new IllegalStateException("bad inst");
                                    case 8:
                                        iArr2 = c0462e.f797d;
                                        c0471n2 = c0471n3;
                                        if (iArr2.length == 1) {
                                            i31 = iArr2[i8];
                                            if (i11 != i31) {
                                                if ((c0462e.f796c & 1) != 0) {
                                                    iM1169f = AbstractC0475r.m1169f(i31);
                                                    while (true) {
                                                        if (iM1169f != i31) {
                                                            if (i11 == iM1169f) {
                                                                iM1169f = AbstractC0475r.m1169f(iM1169f);
                                                            }
                                                        }
                                                    }
                                                }
                                                c0472o2 = c0472o3;
                                                c0463f5 = c0463f2;
                                                c0465h2 = c0465h3;
                                                c0463f6 = c0463f9;
                                                z2 = z;
                                                if (c0464gM988a != null) {
                                                    c0465h2.m990c(c0464gM988a);
                                                    c0464gArr[i24] = null;
                                                }
                                                i17 = i24 + 1;
                                                z = z2;
                                                c0471n3 = c0471n2;
                                                c0472o3 = c0472o2;
                                                i8 = 0;
                                                i34 = 2;
                                                c0463f9 = c0463f6;
                                                c0465h3 = c0465h2;
                                                c0463f2 = c0463f5;
                                                i10 = i19;
                                            }
                                            c0472o2 = c0472o3;
                                            int i414 = i9;
                                            i24 = i24;
                                            c0463f5 = c0463f2;
                                            c0465h2 = c0465h3;
                                            c0463f6 = c0463f9;
                                            z2 = z;
                                            c0464gM988a = c0465h2.m988a(c0463f6, c0462e.f795b, i15, c0464gM988a.f803a, iM991a, c0464gM988a);
                                            i9 = i414;
                                            if (c0464gM988a != null) {
                                                c0465h2.m990c(c0464gM988a);
                                                c0464gArr[i24] = null;
                                            }
                                            i17 = i24 + 1;
                                            z = z2;
                                            c0471n3 = c0471n2;
                                            c0472o3 = c0472o2;
                                            i8 = 0;
                                            i34 = 2;
                                            c0463f9 = c0463f6;
                                            c0465h3 = c0465h2;
                                            c0463f2 = c0463f5;
                                            i10 = i19;
                                        } else {
                                            i26 = i8;
                                            while (true) {
                                                iArr3 = c0462e.f797d;
                                                c0472o2 = c0472o3;
                                                if (i26 < iArr3.length) {
                                                }
                                                length = iArr3.length / 2;
                                                i27 = i8;
                                                while (true) {
                                                    if (i27 < length) {
                                                        i24 = i24;
                                                        c0463f5 = c0463f2;
                                                        c0465h2 = c0465h3;
                                                        c0463f6 = c0463f9;
                                                        z2 = z;
                                                        if (c0464gM988a != null) {
                                                            c0465h2.m990c(c0464gM988a);
                                                            c0464gArr[i24] = null;
                                                        }
                                                        i17 = i24 + 1;
                                                        z = z2;
                                                        c0471n3 = c0471n2;
                                                        c0472o3 = c0472o2;
                                                        i8 = 0;
                                                        i34 = 2;
                                                        c0463f9 = c0463f6;
                                                        c0465h3 = c0465h2;
                                                        c0463f2 = c0463f5;
                                                        i10 = i19;
                                                    } else {
                                                        i28 = ((length - i27) / 2) + i27;
                                                        i29 = length;
                                                        iArr4 = c0462e.f797d;
                                                        i30 = i28 * 2;
                                                        if (iArr4[i30] <= i11) {
                                                            i29 = i28;
                                                        } else if (i11 <= iArr4[i30 + 1]) {
                                                            int i415 = i9;
                                                            i24 = i24;
                                                            c0463f5 = c0463f2;
                                                            c0465h2 = c0465h3;
                                                            c0463f6 = c0463f9;
                                                            z2 = z;
                                                            c0464gM988a = c0465h2.m988a(c0463f6, c0462e.f795b, i15, c0464gM988a.f803a, iM991a, c0464gM988a);
                                                            i9 = i415;
                                                            if (c0464gM988a != null) {
                                                                c0465h2.m990c(c0464gM988a);
                                                                c0464gArr[i24] = null;
                                                            }
                                                            i17 = i24 + 1;
                                                            z = z2;
                                                            c0471n3 = c0471n2;
                                                            c0472o3 = c0472o2;
                                                            i8 = 0;
                                                            i34 = 2;
                                                            c0463f9 = c0463f6;
                                                            c0465h3 = c0465h2;
                                                            c0463f2 = c0463f5;
                                                            i10 = i19;
                                                        } else {
                                                            i27 = i28 + 1;
                                                        }
                                                        z = z;
                                                        i24 = i24;
                                                        c0463f9 = c0463f9;
                                                        c0465h3 = c0465h3;
                                                        c0463f2 = c0463f2;
                                                        length = i29;
                                                    }
                                                    break;
                                                }
                                                i26 += 2;
                                                c0472o3 = c0472o2;
                                            }
                                        }
                                        break;
                                    case 9:
                                        if (i11 == c0462e.f797d[i8]) {
                                            c0471n2 = c0471n3;
                                            c0472o2 = c0472o3;
                                            int i416 = i9;
                                            i24 = i24;
                                            c0463f5 = c0463f2;
                                            c0465h2 = c0465h3;
                                            c0463f6 = c0463f9;
                                            z2 = z;
                                            c0464gM988a = c0465h2.m988a(c0463f6, c0462e.f795b, i15, c0464gM988a.f803a, iM991a, c0464gM988a);
                                            i9 = i416;
                                            if (c0464gM988a != null) {
                                                c0465h2.m990c(c0464gM988a);
                                                c0464gArr[i24] = null;
                                            }
                                            i17 = i24 + 1;
                                            z = z2;
                                            c0471n3 = c0471n2;
                                            c0472o3 = c0472o2;
                                            i8 = 0;
                                            i34 = 2;
                                            c0463f9 = c0463f6;
                                            c0465h3 = c0465h2;
                                            c0463f2 = c0463f5;
                                            i10 = i19;
                                        }
                                        c0471n2 = c0471n3;
                                        c0472o2 = c0472o3;
                                        c0463f5 = c0463f2;
                                        c0465h2 = c0465h3;
                                        c0463f6 = c0463f9;
                                        z2 = z;
                                        if (c0464gM988a != null) {
                                            c0465h2.m990c(c0464gM988a);
                                            c0464gArr[i24] = null;
                                        }
                                        i17 = i24 + 1;
                                        z = z2;
                                        c0471n3 = c0471n2;
                                        c0472o3 = c0472o2;
                                        i8 = 0;
                                        i34 = 2;
                                        c0463f9 = c0463f6;
                                        c0465h3 = c0465h2;
                                        c0463f2 = c0463f5;
                                        i10 = i19;
                                        break;
                                    case 10:
                                        c0471n2 = c0471n3;
                                        c0472o2 = c0472o3;
                                        int i417 = i9;
                                        i24 = i24;
                                        c0463f5 = c0463f2;
                                        c0465h2 = c0465h3;
                                        c0463f6 = c0463f9;
                                        z2 = z;
                                        c0464gM988a = c0465h2.m988a(c0463f6, c0462e.f795b, i15, c0464gM988a.f803a, iM991a, c0464gM988a);
                                        i9 = i417;
                                        if (c0464gM988a != null) {
                                            c0465h2.m990c(c0464gM988a);
                                            c0464gArr[i24] = null;
                                        }
                                        i17 = i24 + 1;
                                        z = z2;
                                        c0471n3 = c0471n2;
                                        c0472o3 = c0472o2;
                                        i8 = 0;
                                        i34 = 2;
                                        c0463f9 = c0463f6;
                                        c0465h3 = c0465h2;
                                        c0463f2 = c0463f5;
                                        i10 = i19;
                                        break;
                                    case 11:
                                        if (i11 != 10) {
                                            c0471n2 = c0471n3;
                                            c0472o2 = c0472o3;
                                            int i418 = i9;
                                            i24 = i24;
                                            c0463f5 = c0463f2;
                                            c0465h2 = c0465h3;
                                            c0463f6 = c0463f9;
                                            z2 = z;
                                            c0464gM988a = c0465h2.m988a(c0463f6, c0462e.f795b, i15, c0464gM988a.f803a, iM991a, c0464gM988a);
                                            i9 = i418;
                                            if (c0464gM988a != null) {
                                                c0465h2.m990c(c0464gM988a);
                                                c0464gArr[i24] = null;
                                            }
                                            i17 = i24 + 1;
                                            z = z2;
                                            c0471n3 = c0471n2;
                                            c0472o3 = c0472o2;
                                            i8 = 0;
                                            i34 = 2;
                                            c0463f9 = c0463f6;
                                            c0465h3 = c0465h2;
                                            c0463f2 = c0463f5;
                                            i10 = i19;
                                        }
                                        c0471n2 = c0471n3;
                                        c0472o2 = c0472o3;
                                        c0463f5 = c0463f2;
                                        c0465h2 = c0465h3;
                                        c0463f6 = c0463f9;
                                        z2 = z;
                                        if (c0464gM988a != null) {
                                            c0465h2.m990c(c0464gM988a);
                                            c0464gArr[i24] = null;
                                        }
                                        i17 = i24 + 1;
                                        z = z2;
                                        c0471n3 = c0471n2;
                                        c0472o3 = c0472o2;
                                        i8 = 0;
                                        i34 = 2;
                                        c0463f9 = c0463f6;
                                        c0465h3 = c0465h2;
                                        c0463f2 = c0463f5;
                                        i10 = i19;
                                        break;
                                }
                            } else {
                                i24 = i23;
                            }
                            c0471n2 = c0471n3;
                            c0472o2 = c0472o3;
                            c0463f5 = c0463f2;
                            c0465h2 = c0465h3;
                            c0463f6 = c0463f9;
                            z2 = z;
                            i17 = i24 + 1;
                            z = z2;
                            c0471n3 = c0471n2;
                            c0472o3 = c0472o2;
                            i8 = 0;
                            i34 = 2;
                            c0463f9 = c0463f6;
                            c0465h3 = c0465h2;
                            c0463f2 = c0463f5;
                            i10 = i19;
                        }
                    }
                    c0471n = c0471n3;
                    c0472o = c0472o3;
                    c0463f3 = c0463f2;
                    c0465h3 = c0465h3;
                    c0463f4 = c0463f9;
                    i20 = i8;
                    c0463f3.f799b = i20;
                    if (i13 != 0) {
                        i21 = i14;
                        if (i21 != -1) {
                            int iM1002l8 = c0466i.m1002l(i15 + i19);
                            i22 = iM1002l8 >> 3;
                            i6 = iM1002l8 & 7;
                        } else {
                            i6 = i19;
                            i22 = i21;
                        }
                        i41 = 1;
                        c0463f9 = c0463f3;
                        i32 = i15;
                        i33 = i20;
                        iM1164a = iM991a;
                        i7 = i22;
                        c0472o3 = c0472o;
                        i34 = 2;
                        i42 = i19;
                        i39 = i21;
                        c0463f7 = c0463f4;
                        c0471n3 = c0471n;
                    }
                } else {
                    i20 = i33;
                    c0463f4 = c0463f9;
                }
            }
            c0465h3.m989b(c0463f4, i20);
            z3 = c0465h3.f811g;
        } else {
            z3 = false;
        }
        if (z3) {
            int i59 = c0465h3.f813i;
            iArrCopyOf = i59 == 0 ? AbstractC0475r.f1000a : Arrays.copyOf(c0465h3.f812h, i59);
        }
        int[] iArr10 = iArrCopyOf;
        synchronized (this) {
            this.f845h.add(c0465h3);
        }
        if (iArr10 == null) {
            return false;
        }
        System.arraycopy(iArr10, 0, iArr, 0, iArr10.length);
        return true;
    }

    public final String toString() {
        return this.f838a;
    }
}
