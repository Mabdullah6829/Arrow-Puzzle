package p024O;

/* JADX INFO: renamed from: O.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0458a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f782a;

    /* JADX INFO: renamed from: b */
    public int f783b;

    /* JADX INFO: renamed from: c */
    public int[] f784c;

    public C0458a(int[] iArr) {
        this.f782a = 0;
        this.f784c = iArr;
        this.f783b = iArr.length;
    }

    /* JADX INFO: renamed from: h */
    public static void m966h(int[] iArr, int i2, int i3) {
        int i4 = ((i2 + i3) / 2) & (-2);
        int i5 = iArr[i4];
        int i6 = iArr[i4 + 1];
        int i7 = i2;
        int i8 = i3;
        while (i7 <= i8) {
            while (i7 < i3) {
                int i9 = iArr[i7] - i5;
                if (i9 == 0) {
                    i9 = i6 - iArr[i7 + 1];
                }
                if (i9 >= 0) {
                    break;
                } else {
                    i7 += 2;
                }
            }
            while (i8 > i2) {
                int i10 = iArr[i8] - i5;
                if (i10 == 0) {
                    i10 = i6 - iArr[i8 + 1];
                }
                if (i10 <= 0) {
                    break;
                } else {
                    i8 -= 2;
                }
            }
            if (i7 <= i8) {
                if (i7 != i8) {
                    int i11 = iArr[i7];
                    iArr[i7] = iArr[i8];
                    iArr[i8] = i11;
                    int i12 = i7 + 1;
                    int i13 = iArr[i12];
                    int i14 = i8 + 1;
                    iArr[i12] = iArr[i14];
                    iArr[i14] = i13;
                }
                i7 += 2;
                i8 -= 2;
            }
        }
        if (i2 < i8) {
            m966h(iArr, i2, i8);
        }
        if (i7 < i3) {
            m966h(iArr, i7, i3);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m967a(int i2, int[] iArr) {
        int i3 = 0;
        if (i2 >= 0) {
            while (i3 < iArr.length) {
                m970d(iArr[i3], iArr[i3 + 1]);
                i3 += 2;
            }
            return;
        }
        int i4 = 0;
        while (i3 < iArr.length) {
            int i5 = iArr[i3];
            int i6 = iArr[i3 + 1];
            int i7 = i5 - 1;
            if (i4 <= i7) {
                m970d(i4, i7);
            }
            i4 = i6 + 1;
            i3 += 2;
        }
        if (i4 <= 1114111) {
            m970d(i4, 1114111);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m968b(int i2, int i3) {
        if (i2 <= 65 && i3 >= 66639) {
            m970d(i2, i3);
            return;
        }
        if (i3 < 65 || i2 > 66639) {
            m970d(i2, i3);
            return;
        }
        if (i2 < 65) {
            m970d(i2, 64);
            i2 = 65;
        }
        if (i3 > 66639) {
            m970d(66640, i3);
            i3 = 66639;
        }
        while (i2 <= i3) {
            m970d(i2, i2);
            for (int iM1169f = AbstractC0475r.m1169f(i2); iM1169f != i2; iM1169f = AbstractC0475r.m1169f(iM1169f)) {
                m970d(iM1169f, iM1169f);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m969c(C0459b c0459b, boolean z) {
        int[] iArrM975j = c0459b.f788b;
        if (z) {
            C0458a c0458a = new C0458a(0);
            for (int i2 = 0; i2 < iArrM975j.length; i2 += 2) {
                c0458a.m968b(iArrM975j[i2], iArrM975j[i2 + 1]);
            }
            c0458a.m972f();
            iArrM975j = c0458a.m975j();
        }
        m967a(c0459b.f787a, iArrM975j);
    }

    /* JADX INFO: renamed from: d */
    public void m970d(int i2, int i3) {
        if (this.f783b > 0) {
            for (int i4 = 2; i4 <= 4; i4 += 2) {
                int i5 = this.f783b;
                if (i5 >= i4) {
                    int[] iArr = this.f784c;
                    int i6 = i5 - i4;
                    int i7 = iArr[i6];
                    int i8 = i6 + 1;
                    int i9 = iArr[i8];
                    if (i2 <= i9 + 1 && i7 <= i3 + 1) {
                        if (i2 < i7) {
                            iArr[i6] = i2;
                        }
                        if (i3 > i9) {
                            iArr[i8] = i3;
                            return;
                        }
                        return;
                    }
                }
            }
        }
        int i10 = this.f783b;
        int i11 = i10 + 2;
        int[] iArr2 = this.f784c;
        if (iArr2.length < i11) {
            int i12 = i10 * 2;
            if (i11 < i12) {
                i11 = i12;
            }
            int[] iArr3 = new int[i11];
            System.arraycopy(iArr2, 0, iArr3, 0, i10);
            this.f784c = iArr3;
        }
        int[] iArr4 = this.f784c;
        int i13 = this.f783b;
        int i14 = i13 + 1;
        this.f783b = i14;
        iArr4[i13] = i2;
        this.f783b = i13 + 2;
        iArr4[i14] = i3;
    }

    /* JADX INFO: renamed from: e */
    public void m971e(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = iArr2[2];
            if (i4 == 1) {
                m970d(i2, i3);
            } else {
                while (i2 <= i3) {
                    m970d(i2, i2);
                    i2 += i4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m972f() {
        int i2 = this.f783b;
        if (i2 < 4) {
            return;
        }
        m966h(this.f784c, 0, i2 - 2);
        int i3 = 2;
        for (int i4 = 2; i4 < this.f783b; i4 += 2) {
            int[] iArr = this.f784c;
            int i5 = iArr[i4];
            int i6 = iArr[i4 + 1];
            int i7 = i3 - 1;
            int i8 = iArr[i7];
            if (i5 > i8 + 1) {
                iArr[i3] = i5;
                iArr[i3 + 1] = i6;
                i3 += 2;
            } else if (i6 > i8) {
                iArr[i7] = i6;
            }
        }
        this.f783b = i3;
    }

    /* JADX INFO: renamed from: g */
    public boolean m973g(int i2) {
        return ((1 << i2) & this.f783b) != 0;
    }

    /* JADX INFO: renamed from: i */
    public void m974i(int i2, int i3) {
        int[] iArr = this.f784c;
        if (i2 >= iArr.length) {
            return;
        }
        this.f783b = (1 << i2) | this.f783b;
        iArr[i2] = i3;
    }

    /* JADX INFO: renamed from: j */
    public int[] m975j() {
        int i2 = this.f783b;
        int[] iArr = this.f784c;
        if (i2 == iArr.length) {
            return iArr;
        }
        int[] iArr2 = new int[i2];
        System.arraycopy(iArr, 0, iArr2, 0, i2);
        return iArr2;
    }

    public String toString() {
        switch (this.f782a) {
            case 0:
                int[] iArr = this.f784c;
                int i2 = this.f783b;
                StringBuilder sb = new StringBuilder("[");
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (i3 > 0) {
                        sb.append(' ');
                    }
                    int i4 = iArr[i3];
                    int i5 = iArr[i3 + 1];
                    if (i4 == i5) {
                        sb.append("0x");
                        sb.append(Integer.toHexString(i4));
                    } else {
                        sb.append("0x");
                        sb.append(Integer.toHexString(i4));
                        sb.append("-0x");
                        sb.append(Integer.toHexString(i5));
                    }
                }
                sb.append(']');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C0458a(int i2) {
        this.f782a = i2;
        switch (i2) {
            case 1:
                this.f784c = new int[10];
                break;
            default:
                this.f784c = AbstractC0475r.f1000a;
                this.f783b = 0;
                break;
        }
    }
}
