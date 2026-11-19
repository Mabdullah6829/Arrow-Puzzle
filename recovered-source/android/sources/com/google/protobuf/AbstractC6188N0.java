package com.google.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.google.protobuf.N0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6188N0 {

    /* JADX INFO: renamed from: a */
    public static final C6184L0 f24111a = new C6184L0();

    /* JADX INFO: renamed from: b */
    public static final C6186M0 f24112b = new C6186M0();

    /* JADX INFO: renamed from: a */
    public static void m11781a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i2) throws InvalidProtocolBufferException {
        if (!m11796s(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m11796s(b3) && !m11796s(b4)) {
                int i3 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i2] = (char) ((i3 >>> 10) + 55232);
                cArr[i2 + 1] = (char) ((i3 & 1023) + 56320);
                return;
            }
        }
        throw InvalidProtocolBufferException.m11739c();
    }

    /* JADX INFO: renamed from: b */
    public static void m11782b(byte b, byte b2, char[] cArr, int i2) throws InvalidProtocolBufferException {
        if (b < -62 || m11796s(b2)) {
            throw InvalidProtocolBufferException.m11739c();
        }
        cArr[i2] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* JADX INFO: renamed from: c */
    public static void m11783c(byte b, byte b2, byte b3, char[] cArr, int i2) throws InvalidProtocolBufferException {
        if (m11796s(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m11796s(b3)))) {
            throw InvalidProtocolBufferException.m11739c();
        }
        cArr[i2] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* JADX INFO: renamed from: d */
    public static int m11784d(byte[] bArr, int i2, C6230g c6230g) throws InvalidProtocolBufferException {
        int iM11792n = m11792n(bArr, i2, c6230g);
        int i3 = c6230g.f24174a;
        if (i3 < 0) {
            throw InvalidProtocolBufferException.m11742f();
        }
        if (i3 > bArr.length - iM11792n) {
            throw InvalidProtocolBufferException.m11744h();
        }
        if (i3 == 0) {
            c6230g.f24176c = AbstractC6251n.f24219t;
            return iM11792n;
        }
        c6230g.f24176c = AbstractC6251n.m11896j(bArr, iM11792n, i3);
        return iM11792n + i3;
    }

    /* JADX INFO: renamed from: e */
    public static int m11785e(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: f */
    public static long m11786f(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: g */
    public static int m11787g(InterfaceC6178I0 interfaceC6178I0, byte[] bArr, int i2, int i3, int i4, C6230g c6230g) throws InvalidProtocolBufferException {
        Object objNewInstance = interfaceC6178I0.newInstance();
        int iM11797u = m11797u(objNewInstance, interfaceC6178I0, bArr, i2, i3, i4, c6230g);
        interfaceC6178I0.makeImmutable(objNewInstance);
        c6230g.f24176c = objNewInstance;
        return iM11797u;
    }

    /* JADX INFO: renamed from: h */
    public static int m11788h(InterfaceC6178I0 interfaceC6178I0, int i2, byte[] bArr, int i3, int i4, InterfaceC6210Z interfaceC6210Z, C6230g c6230g) throws InvalidProtocolBufferException {
        Object objNewInstance = interfaceC6178I0.newInstance();
        InterfaceC6178I0 interfaceC6178I1 = interfaceC6178I0;
        byte[] bArr2 = bArr;
        int i5 = i4;
        C6230g c6230g2 = c6230g;
        int iM11798v = m11798v(objNewInstance, interfaceC6178I1, bArr2, i3, i5, c6230g2);
        interfaceC6178I1.makeImmutable(objNewInstance);
        c6230g2.f24176c = objNewInstance;
        interfaceC6210Z.add(objNewInstance);
        while (iM11798v < i5) {
            C6230g c6230g3 = c6230g2;
            int i6 = i5;
            int iM11792n = m11792n(bArr2, iM11798v, c6230g3);
            if (i2 != c6230g3.f24174a) {
                break;
            }
            byte[] bArr3 = bArr2;
            InterfaceC6178I0 interfaceC6178I2 = interfaceC6178I1;
            Object objNewInstance2 = interfaceC6178I2.newInstance();
            iM11798v = m11798v(objNewInstance2, interfaceC6178I2, bArr3, iM11792n, i6, c6230g3);
            interfaceC6178I1 = interfaceC6178I2;
            bArr2 = bArr3;
            i5 = i6;
            c6230g2 = c6230g3;
            interfaceC6178I1.makeImmutable(objNewInstance2);
            c6230g2.f24176c = objNewInstance2;
            interfaceC6210Z.add(objNewInstance2);
        }
        return iM11798v;
    }

    /* JADX INFO: renamed from: i */
    public static int m11789i(int i2, byte[] bArr, int i3, int i4, C6201U0 c6201u0, C6230g c6230g) throws InvalidProtocolBufferException {
        if ((i2 >>> 3) == 0) {
            throw InvalidProtocolBufferException.m11738b();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int iM11794p = m11794p(bArr, i3, c6230g);
            c6201u0.m11828f(i2, Long.valueOf(c6230g.f24175b));
            return iM11794p;
        }
        if (i5 == 1) {
            c6201u0.m11828f(i2, Long.valueOf(m11786f(bArr, i3)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int iM11792n = m11792n(bArr, i3, c6230g);
            int i6 = c6230g.f24174a;
            if (i6 < 0) {
                throw InvalidProtocolBufferException.m11742f();
            }
            if (i6 > bArr.length - iM11792n) {
                throw InvalidProtocolBufferException.m11744h();
            }
            if (i6 == 0) {
                c6201u0.m11828f(i2, AbstractC6251n.f24219t);
            } else {
                c6201u0.m11828f(i2, AbstractC6251n.m11896j(bArr, iM11792n, i6));
            }
            return iM11792n + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw InvalidProtocolBufferException.m11738b();
            }
            c6201u0.m11828f(i2, Integer.valueOf(m11785e(bArr, i3)));
            return i3 + 4;
        }
        C6201U0 c6201u1 = new C6201U0();
        int i7 = (i2 & (-8)) | 4;
        int i8 = c6230g.f24177d + 1;
        c6230g.f24177d = i8;
        if (i8 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i9 = 0;
        while (i3 < i4) {
            int iM11792n2 = m11792n(bArr, i3, c6230g);
            i9 = c6230g.f24174a;
            if (i9 == i7) {
                i3 = iM11792n2;
                break;
            }
            i3 = m11789i(i9, bArr, iM11792n2, i4, c6201u1, c6230g);
        }
        c6230g.f24177d--;
        if (i3 > i4 || i9 != i7) {
            throw InvalidProtocolBufferException.m11743g();
        }
        c6201u0.m11828f(i2, c6201u1);
        return i3;
    }

    /* JADX INFO: renamed from: k */
    public static String m11790k(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
        if ((i2 | i3 | ((byteBuffer.limit() - i2) - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i4 = i2 + i3;
        char[] cArr = new char[i3];
        int i5 = 0;
        while (i2 < i4) {
            byte b = byteBuffer.get(i2);
            if (b < 0) {
                break;
            }
            i2++;
            cArr[i5] = (char) b;
            i5++;
        }
        int i6 = i5;
        while (i2 < i4) {
            int i7 = i2 + 1;
            byte b2 = byteBuffer.get(i2);
            if (b2 >= 0) {
                int i8 = i6 + 1;
                cArr[i6] = (char) b2;
                int i9 = i7;
                while (i9 < i4) {
                    byte b3 = byteBuffer.get(i9);
                    if (b3 < 0) {
                        break;
                    }
                    i9++;
                    cArr[i8] = (char) b3;
                    i8++;
                }
                i6 = i8;
                i2 = i9;
            } else if (b2 < -32) {
                if (i7 >= i4) {
                    throw InvalidProtocolBufferException.m11739c();
                }
                i2 += 2;
                m11782b(b2, byteBuffer.get(i7), cArr, i6);
                i6++;
            } else if (b2 < -16) {
                if (i7 >= i4 - 1) {
                    throw InvalidProtocolBufferException.m11739c();
                }
                int i10 = i2 + 2;
                i2 += 3;
                m11783c(b2, byteBuffer.get(i7), byteBuffer.get(i10), cArr, i6);
                i6++;
            } else {
                if (i7 >= i4 - 2) {
                    throw InvalidProtocolBufferException.m11739c();
                }
                byte b4 = byteBuffer.get(i7);
                int i11 = i2 + 3;
                byte b5 = byteBuffer.get(i2 + 2);
                i2 += 4;
                m11781a(b2, b4, b5, byteBuffer.get(i11), cArr, i6);
                i6 += 2;
            }
        }
        return new String(cArr, 0, i6);
    }

    /* JADX INFO: renamed from: m */
    public static int m11791m(int i2, byte[] bArr, int i3, C6230g c6230g) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b = bArr[i3];
        if (b >= 0) {
            c6230g.f24174a = i4 | (b << 7);
            return i5;
        }
        int i6 = i4 | ((b & 127) << 7);
        int i7 = i3 + 2;
        byte b2 = bArr[i5];
        if (b2 >= 0) {
            c6230g.f24174a = i6 | (b2 << 14);
            return i7;
        }
        int i8 = i6 | ((b2 & 127) << 14);
        int i9 = i3 + 3;
        byte b3 = bArr[i7];
        if (b3 >= 0) {
            c6230g.f24174a = i8 | (b3 << 21);
            return i9;
        }
        int i10 = i8 | ((b3 & 127) << 21);
        int i11 = i3 + 4;
        byte b4 = bArr[i9];
        if (b4 >= 0) {
            c6230g.f24174a = i10 | (b4 << 28);
            return i11;
        }
        int i12 = i10 | ((b4 & 127) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                c6230g.f24174a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m11792n(byte[] bArr, int i2, C6230g c6230g) {
        int i3 = i2 + 1;
        byte b = bArr[i2];
        if (b < 0) {
            return m11791m(b, bArr, i3, c6230g);
        }
        c6230g.f24174a = b;
        return i3;
    }

    /* JADX INFO: renamed from: o */
    public static int m11793o(int i2, byte[] bArr, int i3, int i4, InterfaceC6210Z interfaceC6210Z, C6230g c6230g) {
        C6193Q c6193q = (C6193Q) interfaceC6210Z;
        int iM11792n = m11792n(bArr, i3, c6230g);
        c6193q.addInt(c6230g.f24174a);
        while (iM11792n < i4) {
            int iM11792n2 = m11792n(bArr, iM11792n, c6230g);
            if (i2 != c6230g.f24174a) {
                break;
            }
            iM11792n = m11792n(bArr, iM11792n2, c6230g);
            c6193q.addInt(c6230g.f24174a);
        }
        return iM11792n;
    }

    /* JADX INFO: renamed from: p */
    public static int m11794p(byte[] bArr, int i2, C6230g c6230g) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            c6230g.f24175b = j2;
            return i3;
        }
        int i4 = i2 + 2;
        byte b = bArr[i3];
        long j3 = (j2 & 127) | (((long) (b & 127)) << 7);
        int i5 = 7;
        while (b < 0) {
            int i6 = i4 + 1;
            byte b2 = bArr[i4];
            i5 += 7;
            j3 |= ((long) (b2 & 127)) << i5;
            b = b2;
            i4 = i6;
        }
        c6230g.f24175b = j3;
        return i4;
    }

    /* JADX INFO: renamed from: r */
    public static String m11795r(AbstractC6251n abstractC6251n) {
        StringBuilder sb = new StringBuilder(abstractC6251n.size());
        for (int i2 = 0; i2 < abstractC6251n.size(); i2++) {
            byte bMo11719d = abstractC6251n.mo11719d(i2);
            if (bMo11719d == 34) {
                sb.append("\\\"");
            } else if (bMo11719d == 39) {
                sb.append("\\'");
            } else if (bMo11719d != 92) {
                switch (bMo11719d) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo11719d < 32 || bMo11719d > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo11719d >>> 6) & 3) + 48));
                            sb.append((char) (((bMo11719d >>> 3) & 7) + 48));
                            sb.append((char) ((bMo11719d & 7) + 48));
                        } else {
                            sb.append((char) bMo11719d);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: s */
    public static boolean m11796s(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: u */
    public static int m11797u(Object obj, InterfaceC6178I0 interfaceC6178I0, byte[] bArr, int i2, int i3, int i4, C6230g c6230g) throws InvalidProtocolBufferException {
        C6268v0 c6268v0 = (C6268v0) interfaceC6178I0;
        int i5 = c6230g.f24177d + 1;
        c6230g.f24177d = i5;
        if (i5 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iM12040C = c6268v0.m12040C(obj, bArr, i2, i3, i4, c6230g);
        c6230g.f24177d--;
        c6230g.f24176c = obj;
        return iM12040C;
    }

    /* JADX INFO: renamed from: v */
    public static int m11798v(Object obj, InterfaceC6178I0 interfaceC6178I0, byte[] bArr, int i2, int i3, C6230g c6230g) throws InvalidProtocolBufferException {
        int iM11791m = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iM11791m = m11791m(i4, bArr, iM11791m, c6230g);
            i4 = c6230g.f24174a;
        }
        int i5 = iM11791m;
        if (i4 < 0 || i4 > i3 - i5) {
            throw InvalidProtocolBufferException.m11744h();
        }
        int i6 = c6230g.f24177d + 1;
        c6230g.f24177d = i6;
        if (i6 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i7 = i5 + i4;
        interfaceC6178I0.mo11733c(obj, bArr, i5, i7, c6230g);
        c6230g.f24177d--;
        c6230g.f24176c = obj;
        return i7;
    }

    /* JADX INFO: renamed from: x */
    public static int m11799x(int i2, byte[] bArr, int i3, int i4, C6230g c6230g) throws InvalidProtocolBufferException {
        if ((i2 >>> 3) == 0) {
            throw InvalidProtocolBufferException.m11738b();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            return m11794p(bArr, i3, c6230g);
        }
        if (i5 == 1) {
            return i3 + 8;
        }
        if (i5 == 2) {
            return m11792n(bArr, i3, c6230g) + c6230g.f24174a;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                return i3 + 4;
            }
            throw InvalidProtocolBufferException.m11738b();
        }
        int i6 = (i2 & (-8)) | 4;
        int i7 = 0;
        while (i3 < i4) {
            i3 = m11792n(bArr, i3, c6230g);
            i7 = c6230g.f24174a;
            if (i7 == i6) {
                break;
            }
            i3 = m11799x(i7, bArr, i3, i4, c6230g);
        }
        if (i3 > i4 || i7 != i6) {
            throw InvalidProtocolBufferException.m11743g();
        }
        return i3;
    }

    /* JADX INFO: renamed from: j */
    public abstract String mo11800j(byte[] bArr, int i2, int i3);

    /* JADX INFO: renamed from: l */
    public abstract String mo11801l(ByteBuffer byteBuffer, int i2, int i3);

    /* JADX INFO: renamed from: q */
    public abstract int mo11802q(String str, byte[] bArr, int i2, int i3);

    /* JADX INFO: renamed from: t */
    public boolean m11803t(byte[] bArr, int i2, int i3) {
        return mo11804w(0, bArr, i2, i3) == 0;
    }

    /* JADX INFO: renamed from: w */
    public abstract int mo11804w(int i2, byte[] bArr, int i3, int i4);

    /* JADX INFO: renamed from: y */
    public abstract void mo11805y(byte[] bArr, int i2, int i3);
}
