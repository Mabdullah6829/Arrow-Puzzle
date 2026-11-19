package p033S0;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC6452k;
import p011H.AbstractC0271e0;
import p058e0.AbstractC6302j;

/* JADX INFO: renamed from: S0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0613g implements InterfaceC0615i, InterfaceC0614h, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: s */
    public C0630x f1341s;

    /* JADX INFO: renamed from: t */
    public long f1342t;

    /* JADX INFO: renamed from: A */
    public final int m1377A() throws EOFException {
        if (this.f1342t < 4) {
            throw new EOFException();
        }
        C0630x c0630x = this.f1341s;
        AbstractC6452k.m12178b(c0630x);
        int i2 = c0630x.f1380b;
        int i3 = c0630x.f1381c;
        if (i3 - i2 < 4) {
            return ((m1395p() & 255) << 24) | ((m1395p() & 255) << 16) | ((m1395p() & 255) << 8) | (m1395p() & 255);
        }
        byte[] bArr = c0630x.f1379a;
        int i4 = i2 + 3;
        int i5 = ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 2] & 255) << 8);
        int i6 = i2 + 4;
        int i7 = (bArr[i4] & 255) | i5;
        this.f1342t -= 4;
        if (i6 != i3) {
            c0630x.f1380b = i6;
            return i7;
        }
        this.f1341s = c0630x.m1472a();
        AbstractC0631y.m1476a(c0630x);
        return i7;
    }

    @Override // p033S0.InterfaceC0614h
    /* JADX INFO: renamed from: E */
    public final OutputStream mo1378E() {
        return new C0612f(this, 0);
    }

    @Override // p033S0.InterfaceC0615i
    /* JADX INFO: renamed from: G */
    public final InputStream mo1379G() {
        return new C0611e(this, 0);
    }

    /* JADX INFO: renamed from: H */
    public final short m1380H() throws EOFException {
        if (this.f1342t < 2) {
            throw new EOFException();
        }
        C0630x c0630x = this.f1341s;
        AbstractC6452k.m12178b(c0630x);
        int i2 = c0630x.f1380b;
        int i3 = c0630x.f1381c;
        if (i3 - i2 < 2) {
            return (short) (((m1395p() & 255) << 8) | (m1395p() & 255));
        }
        byte[] bArr = c0630x.f1379a;
        int i4 = i2 + 1;
        int i5 = (bArr[i2] & 255) << 8;
        int i6 = i2 + 2;
        int i7 = (bArr[i4] & 255) | i5;
        this.f1342t -= 2;
        if (i6 == i3) {
            this.f1341s = c0630x.m1472a();
            AbstractC0631y.m1476a(c0630x);
        } else {
            c0630x.f1380b = i6;
        }
        return (short) i7;
    }

    /* JADX INFO: renamed from: I */
    public final String m1381I(long j2, Charset charset) throws EOFException {
        AbstractC6452k.m12181e(charset, "charset");
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f1342t < j2) {
            throw new EOFException();
        }
        if (j2 == 0) {
            return "";
        }
        C0630x c0630x = this.f1341s;
        AbstractC6452k.m12178b(c0630x);
        int i2 = c0630x.f1380b;
        if (((long) i2) + j2 > c0630x.f1381c) {
            return new String(m1396r(j2), charset);
        }
        int i3 = (int) j2;
        String str = new String(c0630x.f1379a, i2, i3, charset);
        int i4 = c0630x.f1380b + i3;
        c0630x.f1380b = i4;
        this.f1342t -= j2;
        if (i4 == c0630x.f1381c) {
            this.f1341s = c0630x.m1472a();
            AbstractC0631y.m1476a(c0630x);
        }
        return str;
    }

    /* JADX INFO: renamed from: J */
    public final void m1382J(long j2) throws EOFException {
        while (j2 > 0) {
            C0630x c0630x = this.f1341s;
            if (c0630x == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j2, c0630x.f1381c - c0630x.f1380b);
            long j3 = iMin;
            this.f1342t -= j3;
            j2 -= j3;
            int i2 = c0630x.f1380b + iMin;
            c0630x.f1380b = i2;
            if (i2 == c0630x.f1381c) {
                this.f1341s = c0630x.m1472a();
                AbstractC0631y.m1476a(c0630x);
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public final C0616j m1383K() {
        long j2 = this.f1342t;
        if (j2 <= 2147483647L) {
            return m1384L((int) j2);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f1342t).toString());
    }

    /* JADX INFO: renamed from: L */
    public final C0616j m1384L(int i2) {
        if (i2 == 0) {
            return C0616j.f1343v;
        }
        AbstractC0608b.m1370c(this.f1342t, 0L, i2);
        C0630x c0630x = this.f1341s;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            AbstractC6452k.m12178b(c0630x);
            int i6 = c0630x.f1381c;
            int i7 = c0630x.f1380b;
            if (i6 == i7) {
                throw new AssertionError("s.limit == s.pos");
            }
            i4 += i6 - i7;
            i5++;
            c0630x = c0630x.f1384f;
        }
        byte[][] bArr = new byte[i5][];
        int[] iArr = new int[i5 * 2];
        C0630x c0630x2 = this.f1341s;
        int i8 = 0;
        while (i3 < i2) {
            AbstractC6452k.m12178b(c0630x2);
            bArr[i8] = c0630x2.f1379a;
            i3 += c0630x2.f1381c - c0630x2.f1380b;
            iArr[i8] = Math.min(i3, i2);
            iArr[i8 + i5] = c0630x2.f1380b;
            c0630x2.f1382d = true;
            i8++;
            c0630x2 = c0630x2.f1384f;
        }
        return new C0632z(bArr, iArr);
    }

    /* JADX INFO: renamed from: M */
    public final C0630x m1385M(int i2) {
        if (i2 < 1 || i2 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        C0630x c0630x = this.f1341s;
        if (c0630x == null) {
            C0630x c0630xM1477b = AbstractC0631y.m1477b();
            this.f1341s = c0630xM1477b;
            c0630xM1477b.f1385g = c0630xM1477b;
            c0630xM1477b.f1384f = c0630xM1477b;
            return c0630xM1477b;
        }
        C0630x c0630x2 = c0630x.f1385g;
        AbstractC6452k.m12178b(c0630x2);
        if (c0630x2.f1381c + i2 <= 8192 && c0630x2.f1383e) {
            return c0630x2;
        }
        C0630x c0630xM1477b2 = AbstractC0631y.m1477b();
        c0630x2.m1473b(c0630xM1477b2);
        return c0630xM1477b2;
    }

    /* JADX INFO: renamed from: N */
    public final void m1386N(C0616j byteString) {
        AbstractC6452k.m12181e(byteString, "byteString");
        byteString.mo1416u(this, byteString.mo1404e());
    }

    /* JADX INFO: renamed from: O */
    public final void m1387O(int i2) {
        C0630x c0630xM1385M = m1385M(1);
        byte[] bArr = c0630xM1385M.f1379a;
        int i3 = c0630xM1385M.f1381c;
        c0630xM1385M.f1381c = i3 + 1;
        bArr[i3] = (byte) i2;
        this.f1342t++;
    }

    /* JADX INFO: renamed from: P */
    public final void m1388P(int i2, String string) {
        char cCharAt;
        AbstractC6452k.m12181e(string, "string");
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0271e0.m397e(i2, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (i2 > string.length()) {
            StringBuilder sbM404l = AbstractC0271e0.m404l(i2, "endIndex > string.length: ", " > ");
            sbM404l.append(string.length());
            throw new IllegalArgumentException(sbM404l.toString().toString());
        }
        int i3 = 0;
        while (i3 < i2) {
            char cCharAt2 = string.charAt(i3);
            if (cCharAt2 < 128) {
                C0630x c0630xM1385M = m1385M(1);
                byte[] bArr = c0630xM1385M.f1379a;
                int i4 = c0630xM1385M.f1381c - i3;
                int iMin = Math.min(i2, 8192 - i4);
                int i5 = i3 + 1;
                bArr[i3 + i4] = (byte) cCharAt2;
                while (true) {
                    i3 = i5;
                    if (i3 >= iMin || (cCharAt = string.charAt(i3)) >= 128) {
                        break;
                    }
                    i5 = i3 + 1;
                    bArr[i3 + i4] = (byte) cCharAt;
                }
                int i6 = c0630xM1385M.f1381c;
                int i7 = (i4 + i3) - i6;
                c0630xM1385M.f1381c = i6 + i7;
                this.f1342t += (long) i7;
            } else {
                if (cCharAt2 < 2048) {
                    C0630x c0630xM1385M2 = m1385M(2);
                    byte[] bArr2 = c0630xM1385M2.f1379a;
                    int i8 = c0630xM1385M2.f1381c;
                    bArr2[i8] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i8 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    c0630xM1385M2.f1381c = i8 + 2;
                    this.f1342t += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    C0630x c0630xM1385M3 = m1385M(3);
                    byte[] bArr3 = c0630xM1385M3.f1379a;
                    int i9 = c0630xM1385M3.f1381c;
                    bArr3[i9] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i9 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i9 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    c0630xM1385M3.f1381c = i9 + 3;
                    this.f1342t += 3;
                } else {
                    int i10 = i3 + 1;
                    char cCharAt3 = i10 < i2 ? string.charAt(i10) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        m1387O(63);
                        i3 = i10;
                    } else {
                        int i11 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        C0630x c0630xM1385M4 = m1385M(4);
                        byte[] bArr4 = c0630xM1385M4.f1379a;
                        int i12 = c0630xM1385M4.f1381c;
                        bArr4[i12] = (byte) ((i11 >> 18) | 240);
                        bArr4[i12 + 1] = (byte) (((i11 >> 12) & 63) | 128);
                        bArr4[i12 + 2] = (byte) (((i11 >> 6) & 63) | 128);
                        bArr4[i12 + 3] = (byte) ((i11 & 63) | 128);
                        c0630xM1385M4.f1381c = i12 + 4;
                        this.f1342t += 4;
                        i3 += 2;
                    }
                }
                i3++;
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m1389Q(String string) {
        AbstractC6452k.m12181e(string, "string");
        m1388P(string.length(), string);
    }

    /* JADX INFO: renamed from: c */
    public final long m1390c() {
        long j2 = this.f1342t;
        if (j2 == 0) {
            return 0L;
        }
        C0630x c0630x = this.f1341s;
        AbstractC6452k.m12178b(c0630x);
        C0630x c0630x2 = c0630x.f1385g;
        AbstractC6452k.m12178b(c0630x2);
        int i2 = c0630x2.f1381c;
        return (i2 >= 8192 || !c0630x2.f1383e) ? j2 : j2 - ((long) (i2 - c0630x2.f1380b));
    }

    public final Object clone() {
        C0613g c0613g = new C0613g();
        if (this.f1342t == 0) {
            return c0613g;
        }
        C0630x c0630x = this.f1341s;
        AbstractC6452k.m12178b(c0630x);
        C0630x c0630xM1474c = c0630x.m1474c();
        c0613g.f1341s = c0630xM1474c;
        c0630xM1474c.f1385g = c0630xM1474c;
        c0630xM1474c.f1384f = c0630xM1474c;
        for (C0630x c0630x2 = c0630x.f1384f; c0630x2 != c0630x; c0630x2 = c0630x2.f1384f) {
            C0630x c0630x3 = c0630xM1474c.f1385g;
            AbstractC6452k.m12178b(c0630x3);
            AbstractC6452k.m12178b(c0630x2);
            c0630x3.m1473b(c0630x2.m1474c());
        }
        c0613g.f1342t = this.f1342t;
        return c0613g;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1391e() {
        return this.f1342t == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0613g)) {
            return false;
        }
        long j2 = this.f1342t;
        C0613g c0613g = (C0613g) obj;
        if (j2 != c0613g.f1342t) {
            return false;
        }
        if (j2 == 0) {
            return true;
        }
        C0630x c0630x = this.f1341s;
        AbstractC6452k.m12178b(c0630x);
        C0630x c0630x2 = c0613g.f1341s;
        AbstractC6452k.m12178b(c0630x2);
        int i2 = c0630x.f1380b;
        int i3 = c0630x2.f1380b;
        long j3 = 0;
        while (j3 < this.f1342t) {
            long jMin = Math.min(c0630x.f1381c - i2, c0630x2.f1381c - i3);
            long j4 = 0;
            while (j4 < jMin) {
                int i4 = i2 + 1;
                int i5 = i3 + 1;
                if (c0630x.f1379a[i2] != c0630x2.f1379a[i3]) {
                    return false;
                }
                j4++;
                i2 = i4;
                i3 = i5;
            }
            if (i2 == c0630x.f1381c) {
                c0630x = c0630x.f1384f;
                AbstractC6452k.m12178b(c0630x);
                i2 = c0630x.f1380b;
            }
            if (i3 == c0630x2.f1381c) {
                c0630x2 = c0630x2.f1384f;
                AbstractC6452k.m12178b(c0630x2);
                i3 = c0630x2.f1380b;
            }
            j3 += jMin;
        }
        return true;
    }

    public final int hashCode() {
        C0630x c0630x = this.f1341s;
        if (c0630x == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = c0630x.f1381c;
            for (int i4 = c0630x.f1380b; i4 < i3; i4++) {
                i2 = (i2 * 31) + c0630x.f1379a[i4];
            }
            c0630x = c0630x.f1384f;
            AbstractC6452k.m12178b(c0630x);
        } while (c0630x != this.f1341s);
        return i2;
    }

    /* JADX INFO: renamed from: i */
    public final byte m1392i(long j2) {
        AbstractC0608b.m1370c(this.f1342t, j2, 1L);
        C0630x c0630x = this.f1341s;
        if (c0630x == null) {
            AbstractC6452k.m12178b(null);
            throw null;
        }
        long j3 = this.f1342t;
        if (j3 - j2 < j2) {
            while (j3 > j2) {
                c0630x = c0630x.f1385g;
                AbstractC6452k.m12178b(c0630x);
                j3 -= (long) (c0630x.f1381c - c0630x.f1380b);
            }
            return c0630x.f1379a[(int) ((((long) c0630x.f1380b) + j2) - j3)];
        }
        long j4 = 0;
        while (true) {
            int i2 = c0630x.f1381c;
            int i3 = c0630x.f1380b;
            long j5 = ((long) (i2 - i3)) + j4;
            if (j5 > j2) {
                return c0630x.f1379a[(int) ((((long) i3) + j2) - j4)];
            }
            c0630x = c0630x.f1384f;
            AbstractC6452k.m12178b(c0630x);
            j4 = j5;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final long m1393l(C0616j targetBytes) {
        int i2;
        int i3;
        AbstractC6452k.m12181e(targetBytes, "targetBytes");
        C0630x c0630x = this.f1341s;
        if (c0630x == null) {
            return -1L;
        }
        long j2 = this.f1342t;
        long j3 = 0;
        if (j2 < 0) {
            while (j2 > 0) {
                c0630x = c0630x.f1385g;
                AbstractC6452k.m12178b(c0630x);
                j2 -= (long) (c0630x.f1381c - c0630x.f1380b);
            }
            if (targetBytes.mo1404e() == 2) {
                byte bMo1408j = targetBytes.mo1408j(0);
                byte bMo1408j2 = targetBytes.mo1408j(1);
                while (j2 < this.f1342t) {
                    byte[] bArr = c0630x.f1379a;
                    i2 = (int) ((((long) c0630x.f1380b) + j3) - j2);
                    int i4 = c0630x.f1381c;
                    while (true) {
                        if (i2 >= i4) {
                            j3 = ((long) (c0630x.f1381c - c0630x.f1380b)) + j2;
                            c0630x = c0630x.f1384f;
                            AbstractC6452k.m12178b(c0630x);
                            j2 = j3;
                        } else {
                            byte b = bArr[i2];
                            if (b == bMo1408j || b == bMo1408j2) {
                                i3 = c0630x.f1380b;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                return -1L;
            }
            byte[] bArrMo1407i = targetBytes.mo1407i();
            while (j2 < this.f1342t) {
                byte[] bArr2 = c0630x.f1379a;
                i2 = (int) ((((long) c0630x.f1380b) + j3) - j2);
                int i5 = c0630x.f1381c;
                while (true) {
                    if (i2 < i5) {
                        byte b2 = bArr2[i2];
                        int length = bArrMo1407i.length;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= length) {
                                i2++;
                            } else if (b2 == bArrMo1407i[i6]) {
                                i3 = c0630x.f1380b;
                            } else {
                                i6++;
                            }
                        }
                    } else {
                        j3 = ((long) (c0630x.f1381c - c0630x.f1380b)) + j2;
                        c0630x = c0630x.f1384f;
                        AbstractC6452k.m12178b(c0630x);
                        j2 = j3;
                    }
                }
            }
            return -1L;
        }
        j2 = 0;
        while (true) {
            long j4 = ((long) (c0630x.f1381c - c0630x.f1380b)) + j2;
            if (j4 > 0) {
                break;
            }
            c0630x = c0630x.f1384f;
            AbstractC6452k.m12178b(c0630x);
            j2 = j4;
        }
        if (targetBytes.mo1404e() == 2) {
            byte bMo1408j3 = targetBytes.mo1408j(0);
            byte bMo1408j4 = targetBytes.mo1408j(1);
            while (j2 < this.f1342t) {
                byte[] bArr3 = c0630x.f1379a;
                i2 = (int) ((((long) c0630x.f1380b) + j3) - j2);
                int i7 = c0630x.f1381c;
                while (true) {
                    if (i2 >= i7) {
                        j3 = ((long) (c0630x.f1381c - c0630x.f1380b)) + j2;
                        c0630x = c0630x.f1384f;
                        AbstractC6452k.m12178b(c0630x);
                        j2 = j3;
                    } else {
                        byte b3 = bArr3[i2];
                        if (b3 == bMo1408j3 || b3 == bMo1408j4) {
                            i3 = c0630x.f1380b;
                        } else {
                            i2++;
                        }
                    }
                }
            }
            return -1L;
        }
        byte[] bArrMo1407i2 = targetBytes.mo1407i();
        while (j2 < this.f1342t) {
            byte[] bArr4 = c0630x.f1379a;
            i2 = (int) ((((long) c0630x.f1380b) + j3) - j2);
            int i8 = c0630x.f1381c;
            while (true) {
                if (i2 < i8) {
                    byte b4 = bArr4[i2];
                    int length2 = bArrMo1407i2.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= length2) {
                            i2++;
                        } else if (b4 == bArrMo1407i2[i9]) {
                            i3 = c0630x.f1380b;
                        } else {
                            i9++;
                        }
                    }
                } else {
                    j3 = ((long) (c0630x.f1381c - c0630x.f1380b)) + j2;
                    c0630x = c0630x.f1384f;
                    AbstractC6452k.m12178b(c0630x);
                    j2 = j3;
                }
            }
        }
        return -1L;
        return ((long) (i2 - i3)) + j2;
    }

    @Override // p033S0.InterfaceC0603C
    /* JADX INFO: renamed from: m */
    public final long mo1359m(C0613g sink, long j2) {
        AbstractC6452k.m12181e(sink, "sink");
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        long j3 = this.f1342t;
        if (j3 == 0) {
            return -1L;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        sink.mo1356s(this, j2);
        return j2;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m1394o(C0616j bytes) {
        AbstractC6452k.m12181e(bytes, "bytes");
        int iMo1404e = bytes.mo1404e();
        if (iMo1404e >= 0 && this.f1342t >= iMo1404e && bytes.mo1404e() >= iMo1404e) {
            for (int i2 = 0; i2 < iMo1404e; i2++) {
                if (m1392i(i2) == bytes.mo1408j(i2)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public final byte m1395p() throws EOFException {
        if (this.f1342t == 0) {
            throw new EOFException();
        }
        C0630x c0630x = this.f1341s;
        AbstractC6452k.m12178b(c0630x);
        int i2 = c0630x.f1380b;
        int i3 = c0630x.f1381c;
        int i4 = i2 + 1;
        byte b = c0630x.f1379a[i2];
        this.f1342t--;
        if (i4 != i3) {
            c0630x.f1380b = i4;
            return b;
        }
        this.f1341s = c0630x.m1472a();
        AbstractC0631y.m1476a(c0630x);
        return b;
    }

    /* JADX INFO: renamed from: r */
    public final byte[] m1396r(long j2) throws EOFException {
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f1342t < j2) {
            throw new EOFException();
        }
        int i2 = (int) j2;
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int i4 = read(bArr, i3, i2 - i3);
            if (i4 == -1) {
                throw new EOFException();
            }
            i3 += i4;
        }
        return bArr;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        AbstractC6452k.m12181e(sink, "sink");
        C0630x c0630x = this.f1341s;
        if (c0630x == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), c0630x.f1381c - c0630x.f1380b);
        sink.put(c0630x.f1379a, c0630x.f1380b, iMin);
        int i2 = c0630x.f1380b + iMin;
        c0630x.f1380b = i2;
        this.f1342t -= (long) iMin;
        if (i2 == c0630x.f1381c) {
            this.f1341s = c0630x.m1472a();
            AbstractC0631y.m1476a(c0630x);
        }
        return iMin;
    }

    @Override // p033S0.InterfaceC0601A
    /* JADX INFO: renamed from: s */
    public final void mo1356s(C0613g source, long j2) {
        C0630x c0630xM1477b;
        AbstractC6452k.m12181e(source, "source");
        if (source == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC0608b.m1370c(source.f1342t, 0L, j2);
        while (j2 > 0) {
            C0630x c0630x = source.f1341s;
            AbstractC6452k.m12178b(c0630x);
            int i2 = c0630x.f1381c;
            C0630x c0630x2 = source.f1341s;
            AbstractC6452k.m12178b(c0630x2);
            long j3 = i2 - c0630x2.f1380b;
            int i3 = 0;
            if (j2 < j3) {
                C0630x c0630x3 = this.f1341s;
                C0630x c0630x4 = c0630x3 != null ? c0630x3.f1385g : null;
                if (c0630x4 != null && c0630x4.f1383e) {
                    if ((((long) c0630x4.f1381c) + j2) - ((long) (c0630x4.f1382d ? 0 : c0630x4.f1380b)) <= 8192) {
                        C0630x c0630x5 = source.f1341s;
                        AbstractC6452k.m12178b(c0630x5);
                        c0630x5.m1475d(c0630x4, (int) j2);
                        source.f1342t -= j2;
                        this.f1342t += j2;
                        return;
                    }
                }
                C0630x c0630x6 = source.f1341s;
                AbstractC6452k.m12178b(c0630x6);
                int i4 = (int) j2;
                if (i4 <= 0 || i4 > c0630x6.f1381c - c0630x6.f1380b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i4 >= 1024) {
                    c0630xM1477b = c0630x6.m1474c();
                } else {
                    c0630xM1477b = AbstractC0631y.m1477b();
                    byte[] bArr = c0630x6.f1379a;
                    byte[] bArr2 = c0630xM1477b.f1379a;
                    int i5 = c0630x6.f1380b;
                    AbstractC6302j.m12099u(bArr, 0, bArr2, i5, i5 + i4);
                }
                c0630xM1477b.f1381c = c0630xM1477b.f1380b + i4;
                c0630x6.f1380b += i4;
                C0630x c0630x7 = c0630x6.f1385g;
                AbstractC6452k.m12178b(c0630x7);
                c0630x7.m1473b(c0630xM1477b);
                source.f1341s = c0630xM1477b;
            }
            C0630x c0630x8 = source.f1341s;
            AbstractC6452k.m12178b(c0630x8);
            long j4 = c0630x8.f1381c - c0630x8.f1380b;
            source.f1341s = c0630x8.m1472a();
            C0630x c0630x9 = this.f1341s;
            if (c0630x9 == null) {
                this.f1341s = c0630x8;
                c0630x8.f1385g = c0630x8;
                c0630x8.f1384f = c0630x8;
            } else {
                C0630x c0630x10 = c0630x9.f1385g;
                AbstractC6452k.m12178b(c0630x10);
                c0630x10.m1473b(c0630x8);
                C0630x c0630x11 = c0630x8.f1385g;
                if (c0630x11 == c0630x8) {
                    throw new IllegalStateException("cannot compact");
                }
                AbstractC6452k.m12178b(c0630x11);
                if (c0630x11.f1383e) {
                    int i6 = c0630x8.f1381c - c0630x8.f1380b;
                    C0630x c0630x12 = c0630x8.f1385g;
                    AbstractC6452k.m12178b(c0630x12);
                    int i7 = 8192 - c0630x12.f1381c;
                    C0630x c0630x13 = c0630x8.f1385g;
                    AbstractC6452k.m12178b(c0630x13);
                    if (!c0630x13.f1382d) {
                        C0630x c0630x14 = c0630x8.f1385g;
                        AbstractC6452k.m12178b(c0630x14);
                        i3 = c0630x14.f1380b;
                    }
                    if (i6 <= i7 + i3) {
                        C0630x c0630x15 = c0630x8.f1385g;
                        AbstractC6452k.m12178b(c0630x15);
                        c0630x8.m1475d(c0630x15, i6);
                        c0630x8.m1472a();
                        AbstractC0631y.m1476a(c0630x8);
                    }
                }
            }
            source.f1342t -= j4;
            this.f1342t += j4;
            j2 -= j4;
        }
    }

    public final String toString() {
        return m1383K().toString();
    }

    /* JADX INFO: renamed from: u */
    public final C0616j m1397u(long j2) throws EOFException {
        if (j2 < 0 || j2 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j2).toString());
        }
        if (this.f1342t < j2) {
            throw new EOFException();
        }
        if (j2 < 4096) {
            return new C0616j(m1396r(j2));
        }
        C0616j c0616jM1384L = m1384L((int) j2);
        m1382J(j2);
        return c0616jM1384L;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        AbstractC6452k.m12181e(source, "source");
        int iRemaining = source.remaining();
        int i2 = iRemaining;
        while (i2 > 0) {
            C0630x c0630xM1385M = m1385M(1);
            int iMin = Math.min(i2, 8192 - c0630xM1385M.f1381c);
            source.get(c0630xM1385M.f1379a, c0630xM1385M.f1381c, iMin);
            i2 -= iMin;
            c0630xM1385M.f1381c += iMin;
        }
        this.f1342t += (long) iRemaining;
        return iRemaining;
    }

    public final void write(byte[] source, int i2, int i3) {
        AbstractC6452k.m12181e(source, "source");
        long j2 = i3;
        AbstractC0608b.m1370c(source.length, i2, j2);
        int i4 = i3 + i2;
        while (i2 < i4) {
            C0630x c0630xM1385M = m1385M(1);
            int iMin = Math.min(i4 - i2, 8192 - c0630xM1385M.f1381c);
            int i5 = i2 + iMin;
            AbstractC6302j.m12099u(source, c0630xM1385M.f1381c, c0630xM1385M.f1379a, i2, i5);
            c0630xM1385M.f1381c += iMin;
            i2 = i5;
        }
        this.f1342t += j2;
    }

    public final int read(byte[] sink, int i2, int i3) {
        AbstractC6452k.m12181e(sink, "sink");
        AbstractC0608b.m1370c(sink.length, i2, i3);
        C0630x c0630x = this.f1341s;
        if (c0630x == null) {
            return -1;
        }
        int iMin = Math.min(i3, c0630x.f1381c - c0630x.f1380b);
        byte[] bArr = c0630x.f1379a;
        int i4 = c0630x.f1380b;
        AbstractC6302j.m12099u(bArr, i2, sink, i4, i4 + iMin);
        int i5 = c0630x.f1380b + iMin;
        c0630x.f1380b = i5;
        this.f1342t -= (long) iMin;
        if (i5 == c0630x.f1381c) {
            this.f1341s = c0630x.m1472a();
            AbstractC0631y.m1476a(c0630x);
        }
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, p033S0.InterfaceC0601A
    public final void close() {
    }

    @Override // p033S0.InterfaceC0601A, java.io.Flushable
    public final void flush() {
    }
}
