package p033S0;

import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6452k;
import p022N.AbstractC0355G;
import p035T0.AbstractC0810b;
import p091y0.AbstractC6571a;
import p091y0.AbstractC6582l;

/* JADX INFO: renamed from: S0.j */
/* JADX INFO: loaded from: classes.dex */
public class C0616j implements Serializable, Comparable {

    /* JADX INFO: renamed from: v */
    public static final C0616j f1343v = new C0616j(new byte[0]);

    /* JADX INFO: renamed from: s */
    public final byte[] f1344s;

    /* JADX INFO: renamed from: t */
    public transient int f1345t;

    /* JADX INFO: renamed from: u */
    public transient String f1346u;

    public C0616j(byte[] data) {
        AbstractC6452k.m12181e(data, "data");
        this.f1344s = data;
    }

    /* JADX INFO: renamed from: h */
    public static int m1398h(C0616j c0616j, C0616j other) {
        c0616j.getClass();
        AbstractC6452k.m12181e(other, "other");
        return c0616j.mo1406g(0, other.mo1407i());
    }

    /* JADX INFO: renamed from: l */
    public static int m1399l(C0616j c0616j, C0616j other) {
        c0616j.getClass();
        AbstractC6452k.m12181e(other, "other");
        return c0616j.mo1409k(other.mo1407i());
    }

    /* JADX INFO: renamed from: m */
    public static final C0616j m1400m(byte... data) {
        AbstractC6452k.m12181e(data, "data");
        byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
        AbstractC6452k.m12180d(bArrCopyOf, "copyOf(this, size)");
        return new C0616j(bArrCopyOf);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ C0616j m1401q(C0616j c0616j, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i2 = 0;
        }
        if ((i4 & 2) != 0) {
            i3 = -1234567890;
        }
        return c0616j.mo1412p(i2, i3);
    }

    /* JADX INFO: renamed from: b */
    public String mo1402b() {
        byte[] map = AbstractC0607a.f1330a;
        byte[] bArr = this.f1344s;
        AbstractC6452k.m12181e(bArr, "<this>");
        AbstractC6452k.m12181e(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            byte b = bArr[i2];
            int i4 = i2 + 2;
            byte b2 = bArr[i2 + 1];
            i2 += 3;
            byte b3 = bArr[i4];
            bArr2[i3] = map[(b & 255) >> 2];
            bArr2[i3 + 1] = map[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i5 = i3 + 3;
            bArr2[i3 + 2] = map[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i3 += 4;
            bArr2[i5] = map[b3 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i2];
            bArr2[i3] = map[(b4 & 255) >> 2];
            bArr2[i3 + 1] = map[(b4 & 3) << 4];
            bArr2[i3 + 2] = 61;
            bArr2[i3 + 3] = 61;
        } else if (length2 == 2) {
            int i6 = i2 + 1;
            byte b5 = bArr[i2];
            byte b6 = bArr[i6];
            bArr2[i3] = map[(b5 & 255) >> 2];
            bArr2[i3 + 1] = map[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr2[i3 + 2] = map[(b6 & 15) << 2];
            bArr2[i3 + 3] = 61;
        }
        return new String(bArr2, AbstractC6571a.f24799a);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0616j other) {
        AbstractC6452k.m12181e(other, "other");
        int iMo1404e = mo1404e();
        int iMo1404e2 = other.mo1404e();
        int iMin = Math.min(iMo1404e, iMo1404e2);
        for (int i2 = 0; i2 < iMin; i2++) {
            int iMo1408j = mo1408j(i2) & 255;
            int iMo1408j2 = other.mo1408j(i2) & 255;
            if (iMo1408j != iMo1408j2) {
                return iMo1408j < iMo1408j2 ? -1 : 1;
            }
        }
        if (iMo1404e == iMo1404e2) {
            return 0;
        }
        return iMo1404e < iMo1404e2 ? -1 : 1;
    }

    /* JADX INFO: renamed from: e */
    public int mo1404e() {
        return this.f1344s.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0616j) {
            C0616j c0616j = (C0616j) obj;
            int iMo1404e = c0616j.mo1404e();
            byte[] bArr = this.f1344s;
            if (iMo1404e == bArr.length && c0616j.mo1411o(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public String mo1405f() {
        byte[] bArr = this.f1344s;
        char[] cArr = new char[bArr.length * 2];
        int i2 = 0;
        for (byte b : bArr) {
            int i3 = i2 + 1;
            char[] cArr2 = AbstractC0810b.f2119a;
            cArr[i2] = cArr2[(b >> 4) & 15];
            i2 += 2;
            cArr[i3] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: g */
    public int mo1406g(int i2, byte[] other) {
        AbstractC6452k.m12181e(other, "other");
        byte[] bArr = this.f1344s;
        int length = bArr.length - other.length;
        int iMax = Math.max(i2, 0);
        if (iMax > length) {
            return -1;
        }
        while (!AbstractC0608b.m1368a(bArr, iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public int hashCode() {
        int i2 = this.f1345t;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = Arrays.hashCode(this.f1344s);
        this.f1345t = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public byte[] mo1407i() {
        return this.f1344s;
    }

    /* JADX INFO: renamed from: j */
    public byte mo1408j(int i2) {
        return this.f1344s[i2];
    }

    /* JADX INFO: renamed from: k */
    public int mo1409k(byte[] other) {
        AbstractC6452k.m12181e(other, "other");
        int iMo1404e = mo1404e();
        byte[] bArr = this.f1344s;
        for (int iMin = Math.min(iMo1404e, bArr.length - other.length); -1 < iMin; iMin--) {
            if (AbstractC0608b.m1368a(bArr, iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo1410n(int i2, C0616j other, int i3) {
        AbstractC6452k.m12181e(other, "other");
        return other.mo1411o(0, this.f1344s, i2, i3);
    }

    /* JADX INFO: renamed from: o */
    public boolean mo1411o(int i2, byte[] other, int i3, int i4) {
        AbstractC6452k.m12181e(other, "other");
        if (i2 < 0) {
            return false;
        }
        byte[] bArr = this.f1344s;
        return i2 <= bArr.length - i4 && i3 >= 0 && i3 <= other.length - i4 && AbstractC0608b.m1368a(bArr, i2, other, i3, i4);
    }

    /* JADX INFO: renamed from: p */
    public C0616j mo1412p(int i2, int i3) {
        if (i3 == -1234567890) {
            i3 = mo1404e();
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f1344s;
        if (i3 > bArr.length) {
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        if (i3 - i2 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i2 == 0 && i3 == bArr.length) {
            return this;
        }
        AbstractC0355G.m552e(i3, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i2, i3);
        AbstractC6452k.m12180d(bArrCopyOfRange, "copyOfRange(...)");
        return new C0616j(bArrCopyOfRange);
    }

    /* JADX INFO: renamed from: r */
    public C0616j mo1413r() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f1344s;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b = bArr[i2];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC6452k.m12180d(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i2] = (byte) (b + 32);
                for (int i3 = i2 + 1; i3 < bArrCopyOf.length; i3++) {
                    byte b2 = bArrCopyOf[i3];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i3] = (byte) (b2 + 32);
                    }
                }
                return new C0616j(bArrCopyOf);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: s */
    public byte[] mo1414s() {
        byte[] bArr = this.f1344s;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        AbstractC6452k.m12180d(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: t */
    public final String m1415t() {
        String str = this.f1346u;
        if (str != null) {
            return str;
        }
        byte[] bArrMo1407i = mo1407i();
        AbstractC6452k.m12181e(bArrMo1407i, "<this>");
        String str2 = new String(bArrMo1407i, AbstractC6571a.f24799a);
        this.f1346u = str2;
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:179:0x01b6 A[EDGE_INSN: B:179:0x01b6->B:180:0x01b7 BREAK  A[LOOP:0: B:7:0x000e->B:241:0x000e]] */
    public String toString() {
        C0616j c0616j;
        byte b;
        int i2;
        byte[] bArr = this.f1344s;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        loop0: while (i3 < length) {
            byte b2 = bArr[i3];
            if (b2 < 0) {
                if ((b2 >> 5) != -2) {
                    if ((b2 >> 4) != -2) {
                        if ((b2 >> 3) != -2) {
                            if (i5 == 64) {
                                break;
                            }
                            i4 = -1;
                            break;
                        }
                        int i6 = i3 + 3;
                        if (length > i6) {
                            byte b3 = bArr[i3 + 1];
                            if ((b3 & 192) != 128) {
                                if (i5 == 64) {
                                    break;
                                }
                                i4 = -1;
                                break;
                            }
                            byte b4 = bArr[i3 + 2];
                            if ((b4 & 192) != 128) {
                                if (i5 == 64) {
                                    break;
                                }
                                i4 = -1;
                                break;
                            }
                            byte b5 = bArr[i6];
                            if ((b5 & 192) != 128) {
                                if (i5 == 64) {
                                    break;
                                }
                                i4 = -1;
                                break;
                            }
                            int i7 = (((b5 ^ 3678080) ^ (b4 << 6)) ^ (b3 << 12)) ^ (b2 << 18);
                            if (i7 <= 1114111) {
                                if (55296 <= i7 && i7 < 57344) {
                                    if (i5 == 64) {
                                        break;
                                    }
                                    i4 = -1;
                                    break;
                                }
                                if (i7 >= 65536) {
                                    i2 = i5 + 1;
                                    if (i5 == 64) {
                                        break;
                                    }
                                    if ((i7 != 10 && i7 != 13 && ((i7 >= 0 && i7 < 32) || (127 <= i7 && i7 < 160))) || i7 == 65533) {
                                        i4 = -1;
                                        break;
                                    }
                                    i4 += i7 < 65536 ? 1 : 2;
                                    i3 += 4;
                                    i5 = i2;
                                } else {
                                    if (i5 == 64) {
                                        break;
                                    }
                                    i4 = -1;
                                    break;
                                }
                            } else {
                                if (i5 == 64) {
                                    break;
                                }
                                i4 = -1;
                                break;
                            }
                        } else {
                            if (i5 == 64) {
                                break;
                            }
                            i4 = -1;
                            break;
                        }
                    } else {
                        int i8 = i3 + 2;
                        if (length > i8) {
                            byte b6 = bArr[i3 + 1];
                            if ((b6 & 192) != 128) {
                                if (i5 == 64) {
                                    break;
                                }
                                i4 = -1;
                                break;
                            }
                            byte b7 = bArr[i8];
                            if ((b7 & 192) != 128) {
                                if (i5 == 64) {
                                    break;
                                }
                                i4 = -1;
                                break;
                            }
                            int i9 = ((b7 ^ (-123008)) ^ (b6 << 6)) ^ (b2 << 12);
                            if (i9 >= 2048) {
                                if (55296 <= i9 && i9 < 57344) {
                                    if (i5 == 64) {
                                        break;
                                    }
                                    i4 = -1;
                                    break;
                                }
                                i2 = i5 + 1;
                                if (i5 == 64) {
                                    break;
                                }
                                if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                    i4 = -1;
                                    break;
                                }
                                i4 += i9 < 65536 ? 1 : 2;
                                i3 += 3;
                                i5 = i2;
                            } else {
                                if (i5 == 64) {
                                    break;
                                }
                                i4 = -1;
                                break;
                            }
                        } else {
                            if (i5 == 64) {
                                break;
                            }
                            i4 = -1;
                            break;
                        }
                    }
                } else {
                    int i10 = i3 + 1;
                    if (length > i10) {
                        byte b8 = bArr[i10];
                        if ((b8 & 192) != 128) {
                            if (i5 == 64) {
                                break;
                            }
                            i4 = -1;
                            break;
                        }
                        int i11 = (b8 ^ 3968) ^ (b2 << 6);
                        if (i11 >= 128) {
                            i2 = i5 + 1;
                            if (i5 == 64) {
                                break;
                            }
                            if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                i4 = -1;
                                break;
                            }
                            i4 += i11 < 65536 ? 1 : 2;
                            i3 += 2;
                            i5 = i2;
                        } else {
                            if (i5 == 64) {
                                break;
                            }
                            i4 = -1;
                            break;
                        }
                    } else {
                        if (i5 == 64) {
                            break;
                        }
                        i4 = -1;
                        break;
                    }
                }
            } else {
                int i12 = i5 + 1;
                if (i5 == 64) {
                    break;
                }
                if ((b2 == 10 || b2 == 13 || ((b2 < 0 || b2 >= 32) && (127 > b2 || b2 >= 160))) && b2 != 65533) {
                    i4 += b2 < 65536 ? 1 : 2;
                    i3++;
                    while (true) {
                        i5 = i12;
                        if (i3 < length && (b = bArr[i3]) >= 0) {
                            i3++;
                            i12 = i5 + 1;
                            if (i5 == 64) {
                                break loop0;
                            }
                            if ((b == 10 || b == 13 || ((b < 0 || b >= 32) && (127 > b || b >= 160))) && b != 65533) {
                                i4 += b < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i4 = -1;
                break;
            }
        }
        if (i4 != -1) {
            String strM1415t = m1415t();
            String strSubstring = strM1415t.substring(0, i4);
            AbstractC6452k.m12180d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strM12235t = AbstractC6582l.m12235t(AbstractC6582l.m12235t(AbstractC6582l.m12235t(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i4 >= strM1415t.length()) {
                return "[text=" + strM12235t + ']';
            }
            return "[size=" + bArr.length + " text=" + strM12235t + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + mo1405f() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        if (64 == bArr.length) {
            c0616j = this;
        } else {
            AbstractC0355G.m552e(64, bArr.length);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 64);
            AbstractC6452k.m12180d(bArrCopyOfRange, "copyOfRange(...)");
            c0616j = new C0616j(bArrCopyOfRange);
        }
        sb.append(c0616j.mo1405f());
        sb.append("…]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public void mo1416u(C0613g c0613g, int i2) {
        c0613g.write(this.f1344s, 0, i2);
    }
}
