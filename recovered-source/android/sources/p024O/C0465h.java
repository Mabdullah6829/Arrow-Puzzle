package p024O;

import java.util.Arrays;

/* JADX INFO: renamed from: O.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0465h {

    /* JADX INFO: renamed from: a */
    public final C0472o f805a;

    /* JADX INFO: renamed from: b */
    public final C0471n f806b;

    /* JADX INFO: renamed from: c */
    public final C0463f f807c;

    /* JADX INFO: renamed from: d */
    public final C0463f f808d;

    /* JADX INFO: renamed from: e */
    public C0464g[] f809e = new C0464g[10];

    /* JADX INFO: renamed from: f */
    public int f810f;

    /* JADX INFO: renamed from: g */
    public boolean f811g;

    /* JADX INFO: renamed from: h */
    public int[] f812h;

    /* JADX INFO: renamed from: i */
    public int f813i;

    public C0465h(C0472o c0472o) {
        C0471n c0471n = c0472o.f839b;
        this.f806b = c0471n;
        this.f805a = c0472o;
        this.f807c = new C0463f(c0471n.f835b);
        this.f808d = new C0463f(c0471n.f835b);
        int i2 = c0471n.f837d;
        this.f812h = new int[i2 < 2 ? 2 : i2];
    }

    /* JADX INFO: renamed from: a */
    public final C0464g m988a(C0463f c0463f, int i2, int i3, int[] iArr, int i4, C0464g c0464g) {
        C0464g c0464g2;
        int[] iArr2;
        C0464g c0464g3;
        if (i2 != 0) {
            int[] iArr3 = (int[]) c0463f.f802e;
            C0464g[] c0464gArr = (C0464g[]) c0463f.f800c;
            int[] iArr4 = (int[]) c0463f.f801d;
            int i5 = iArr3[i2];
            int i6 = c0463f.f799b;
            if (i5 >= i6 || iArr4[i5] != i2) {
                c0463f.f799b = i6 + 1;
                iArr3[i2] = i6;
                c0464gArr[i6] = null;
                iArr4[i6] = i2;
                C0462e c0462e = this.f806b.f834a[i2];
                switch (c0462e.f794a) {
                    case 1:
                    case 2:
                        return m988a(c0463f, c0462e.f796c, i3, iArr, i4, m988a(c0463f, c0462e.f795b, i3, iArr, i4, c0464g));
                    case 3:
                        int i7 = c0462e.f796c;
                        if (i7 >= this.f813i) {
                            return m988a(c0463f, c0462e.f795b, i3, iArr, i4, c0464g);
                        }
                        int i8 = iArr[i7];
                        iArr[i7] = i3;
                        m988a(c0463f, c0462e.f795b, i3, iArr, i4, null);
                        iArr[c0462e.f796c] = i8;
                        return c0464g;
                    case 4:
                        return (c0462e.f796c & (~i4)) == 0 ? m988a(c0463f, c0462e.f795b, i3, iArr, i4, c0464g) : c0464g;
                    case 5:
                        break;
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        if (c0464g == null) {
                            int i9 = this.f810f;
                            if (i9 > 0) {
                                int i10 = i9 - 1;
                                this.f810f = i10;
                                c0464g3 = this.f809e[i10];
                            } else {
                                int length = this.f812h.length;
                                c0464g3 = new C0464g();
                                c0464g3.f803a = new int[length];
                            }
                            c0464g2 = c0464g3;
                            c0464g2.f804b = c0462e;
                        } else {
                            c0464g.f804b = c0462e;
                            c0464g2 = c0464g;
                        }
                        int i11 = this.f813i;
                        if (i11 > 0 && (iArr2 = c0464g2.f803a) != iArr) {
                            System.arraycopy(iArr, 0, iArr2, 0, i11);
                        }
                        c0464gArr[i6] = c0464g2;
                        return null;
                    case 7:
                        return m988a(c0463f, c0462e.f795b, i3, iArr, i4, c0464g);
                    default:
                        throw new IllegalStateException("unhandled");
                }
            }
        }
        return c0464g;
    }

    /* JADX INFO: renamed from: b */
    public final void m989b(C0463f c0463f, int i2) {
        int i3 = this.f810f + (c0463f.f799b - i2);
        C0464g[] c0464gArr = this.f809e;
        if (c0464gArr.length < i3) {
            this.f809e = (C0464g[]) Arrays.copyOf(c0464gArr, Math.max(c0464gArr.length * 2, i3));
        }
        while (i2 < c0463f.f799b) {
            C0464g c0464g = ((C0464g[]) c0463f.f800c)[i2];
            if (c0464g != null) {
                C0464g[] c0464gArr2 = this.f809e;
                int i4 = this.f810f;
                c0464gArr2[i4] = c0464g;
                this.f810f = i4 + 1;
            }
            i2++;
        }
        c0463f.f799b = 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m990c(C0464g c0464g) {
        C0464g[] c0464gArr = this.f809e;
        if (c0464gArr.length <= this.f810f) {
            this.f809e = (C0464g[]) Arrays.copyOf(c0464gArr, c0464gArr.length * 2);
        }
        C0464g[] c0464gArr2 = this.f809e;
        int i2 = this.f810f;
        c0464gArr2[i2] = c0464g;
        this.f810f = i2 + 1;
    }
}
