package p024O;

import java.util.Arrays;
import p072l.AbstractC6468c;

/* JADX INFO: renamed from: O.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0461d {

    /* JADX INFO: renamed from: b */
    public static final int[] f791b = {0, 9, 11, 1114111};

    /* JADX INFO: renamed from: c */
    public static final int[] f792c = {0, 1114111};

    /* JADX INFO: renamed from: a */
    public Object f793a;

    /* JADX INFO: renamed from: a */
    public C0460c m976a(int i2) {
        C0460c c0460cM980e = m980e(3);
        int i3 = c0460cM980e.f789a;
        c0460cM980e.f790b = i3 << 1;
        C0471n c0471n = (C0471n) this.f793a;
        c0471n.f834a[i3].f796c = i2;
        int i4 = i2 + 1;
        if (c0471n.f837d < i4) {
            c0471n.f837d = i4;
        }
        return c0460cM980e;
    }

    /* JADX INFO: renamed from: b */
    public C0460c m977b(C0460c c0460c, C0460c c0460c2) {
        int i2;
        int i3 = c0460c.f789a;
        if (i3 == 0 || (i2 = c0460c2.f789a) == 0) {
            return new C0460c(0, 0);
        }
        ((C0471n) this.f793a).m1032b(c0460c.f790b, i2);
        return new C0460c(i3, c0460c2.f790b);
    }

    /* JADX INFO: renamed from: c */
    public C0460c m978c(C0473p c0473p) {
        int i2;
        C0471n c0471n = (C0471n) this.f793a;
        C0460c c0460cM977b = null;
        int i3 = 0;
        switch (AbstractC6468c.m12193b(c0473p.f847a)) {
            case 0:
                return new C0460c(0, 0);
            case 1:
                return m981f();
            case 2:
                int[] iArr = c0473p.f850d;
                if (iArr.length == 0) {
                    return m981f();
                }
                int length = iArr.length;
                while (i3 < length) {
                    C0460c c0460cM982g = m982g(c0473p.f848b, new int[]{iArr[i3]});
                    c0460cM977b = c0460cM977b == null ? c0460cM982g : m977b(c0460cM977b, c0460cM982g);
                    i3++;
                }
                return c0460cM977b;
            case 3:
                return m982g(c0473p.f848b, c0473p.f850d);
            case 4:
                return m982g(0, f791b);
            case 5:
                return m982g(0, f792c);
            case 6:
                return m979d(1);
            case 7:
                return m979d(2);
            case 8:
                return m979d(4);
            case 9:
                return m979d(8);
            case 10:
                return m979d(16);
            case 11:
                return m979d(32);
            case 12:
                return m977b(m977b(m976a(c0473p.f853g << 1), m978c(c0473p.f849c[0])), m976a((c0473p.f853g << 1) | 1));
            case 13:
                return m983h(m978c(c0473p.f849c[0]), (c0473p.f848b & 32) != 0);
            case 14:
                C0460c c0460cM978c = m978c(c0473p.f849c[0]);
                return new C0460c(c0460cM978c.f789a, m983h(c0460cM978c, (c0473p.f848b & 32) != 0).f790b);
            case 15:
                C0460c c0460cM978c2 = m978c(c0473p.f849c[0]);
                i3 = (c0473p.f848b & 32) != 0 ? 1 : 0;
                C0460c c0460cM980e = m980e(1);
                int i4 = c0460cM980e.f789a;
                C0462e c0462e = c0471n.f834a[i4];
                if (i3 != 0) {
                    c0462e.f796c = c0460cM978c2.f789a;
                    c0460cM980e.f790b = i4 << 1;
                } else {
                    c0462e.f795b = c0460cM978c2.f789a;
                    c0460cM980e.f790b = (i4 << 1) | 1;
                }
                c0460cM980e.f790b = c0471n.m1031a(c0460cM980e.f790b, c0460cM978c2.f790b);
                return c0460cM980e;
            case 16:
            default:
                throw new IllegalStateException("regexp: unhandled case in compile");
            case 17:
                C0473p[] c0473pArr = c0473p.f849c;
                if (c0473pArr.length == 0) {
                    return m981f();
                }
                int length2 = c0473pArr.length;
                while (i3 < length2) {
                    C0460c c0460cM978c3 = m978c(c0473pArr[i3]);
                    if (c0460cM977b != null) {
                        c0460cM978c3 = m977b(c0460cM977b, c0460cM978c3);
                    }
                    c0460cM977b = c0460cM978c3;
                    i3++;
                }
                return c0460cM977b;
            case 18:
                C0473p[] c0473pArr2 = c0473p.f849c;
                if (c0473pArr2.length == 0) {
                    return m981f();
                }
                int length3 = c0473pArr2.length;
                while (i3 < length3) {
                    C0460c c0460cM978c4 = m978c(c0473pArr2[i3]);
                    if (c0460cM977b == null || (i2 = c0460cM977b.f789a) == 0) {
                        c0460cM977b = c0460cM978c4;
                    } else if (c0460cM978c4.f789a != 0) {
                        C0460c c0460cM980e2 = m980e(1);
                        C0462e c0462e2 = c0471n.f834a[c0460cM980e2.f789a];
                        c0462e2.f795b = i2;
                        c0462e2.f796c = c0460cM978c4.f789a;
                        c0460cM980e2.f790b = c0471n.m1031a(c0460cM977b.f790b, c0460cM978c4.f790b);
                        c0460cM977b = c0460cM980e2;
                    }
                    i3++;
                }
                return c0460cM977b;
        }
    }

    /* JADX INFO: renamed from: d */
    public C0460c m979d(int i2) {
        C0460c c0460cM980e = m980e(4);
        C0471n c0471n = (C0471n) this.f793a;
        int i3 = c0460cM980e.f789a;
        c0471n.f834a[i3].f796c = i2;
        c0460cM980e.f790b = i3 << 1;
        return c0460cM980e;
    }

    /* JADX INFO: renamed from: e */
    public C0460c m980e(int i2) {
        C0471n c0471n = (C0471n) this.f793a;
        int i3 = c0471n.f835b;
        C0462e[] c0462eArr = c0471n.f834a;
        if (i3 >= c0462eArr.length) {
            c0471n.f834a = (C0462e[]) Arrays.copyOf(c0462eArr, c0462eArr.length * 2);
        }
        C0462e[] c0462eArr2 = c0471n.f834a;
        int i4 = c0471n.f835b;
        C0462e c0462e = new C0462e();
        c0462e.f794a = i2;
        c0462eArr2[i4] = c0462e;
        c0471n.f835b = i4 + 1;
        return new C0460c(i4, 0);
    }

    /* JADX INFO: renamed from: f */
    public C0460c m981f() {
        C0460c c0460cM980e = m980e(7);
        c0460cM980e.f790b = c0460cM980e.f789a << 1;
        return c0460cM980e;
    }

    /* JADX INFO: renamed from: g */
    public C0460c m982g(int i2, int[] iArr) {
        C0460c c0460cM980e = m980e(8);
        C0471n c0471n = (C0471n) this.f793a;
        int i3 = c0460cM980e.f789a;
        C0462e c0462e = c0471n.f834a[i3];
        c0462e.f797d = iArr;
        int i4 = i2 & 1;
        if (iArr.length != 1 || AbstractC0475r.m1169f(iArr[0]) == iArr[0]) {
            i4 = 0;
        }
        c0462e.f796c = i4;
        c0460cM980e.f790b = i3 << 1;
        if (((i4 & 1) == 0 && iArr.length == 1) || (iArr.length == 2 && iArr[0] == iArr[1])) {
            c0462e.f794a = 9;
            return c0460cM980e;
        }
        if (iArr.length == 2 && iArr[0] == 0 && iArr[1] == 1114111) {
            c0462e.f794a = 10;
            return c0460cM980e;
        }
        if (iArr.length == 4 && iArr[0] == 0 && iArr[1] == 9 && iArr[2] == 11 && iArr[3] == 1114111) {
            c0462e.f794a = 11;
        }
        return c0460cM980e;
    }

    /* JADX INFO: renamed from: h */
    public C0460c m983h(C0460c c0460c, boolean z) {
        C0460c c0460cM980e = m980e(1);
        C0471n c0471n = (C0471n) this.f793a;
        int i2 = c0460cM980e.f789a;
        C0462e c0462e = c0471n.f834a[i2];
        if (z) {
            c0462e.f796c = c0460c.f789a;
            c0460cM980e.f790b = i2 << 1;
        } else {
            c0462e.f795b = c0460c.f789a;
            c0460cM980e.f790b = (i2 << 1) | 1;
        }
        c0471n.m1032b(c0460c.f790b, i2);
        return c0460cM980e;
    }
}
