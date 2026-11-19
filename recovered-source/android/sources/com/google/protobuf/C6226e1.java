package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.protobuf.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C6226e1 extends AbstractC6188N0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f24172c;

    public /* synthetic */ C6226e1(int i2) {
        this.f24172c = i2;
    }

    /* JADX INFO: renamed from: z */
    public static int m11877z(byte[] bArr, int i2, long j2, int i3) {
        if (i3 == 0) {
            AbstractC6188N0 abstractC6188N0 = AbstractC6232g1.f24178a;
            if (i2 > -12) {
                return -1;
            }
            return i2;
        }
        if (i3 == 1) {
            return AbstractC6232g1.m11885d(i2, AbstractC6223d1.m11866g(bArr, j2));
        }
        if (i3 == 2) {
            return AbstractC6232g1.m11886e(i2, AbstractC6223d1.m11866g(bArr, j2), AbstractC6223d1.m11866g(bArr, j2 + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d A[LOOP:2: B:24:0x0057->B:27:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x009f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x006d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0066 A[SYNTHETIC] */
    @Override // com.google.protobuf.AbstractC6188N0
    /* JADX INFO: renamed from: j */
    public final String mo11800j(byte[] bArr, int i2, int i3) throws InvalidProtocolBufferException {
        int i4;
        int i5;
        byte b;
        int i6;
        int i7;
        byte b2;
        switch (this.f24172c) {
            case 0:
                if ((i2 | i3 | ((bArr.length - i2) - i3)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
                }
                int i8 = i2 + i3;
                char[] cArr = new char[i3];
                int i9 = 0;
                while (i2 < i8) {
                    byte b3 = bArr[i2];
                    if (b3 < 0) {
                        i4 = i9;
                        while (i2 < i8) {
                            i5 = i2 + 1;
                            b = bArr[i2];
                            if (b >= 0) {
                                i6 = i4 + 1;
                                cArr[i4] = (char) b;
                                i7 = i5;
                                while (i7 < i8) {
                                    b2 = bArr[i7];
                                    if (b2 >= 0) {
                                        i7++;
                                        cArr[i6] = (char) b2;
                                        i6++;
                                    } else {
                                        i4 = i6;
                                        i2 = i7;
                                    }
                                }
                                i4 = i6;
                                i2 = i7;
                            } else if (b < -32) {
                                if (i5 < i8) {
                                    throw InvalidProtocolBufferException.m11739c();
                                }
                                i2 += 2;
                                AbstractC6188N0.m11782b(b, bArr[i5], cArr, i4);
                                i4++;
                            } else if (b < -16) {
                                if (i5 < i8 - 1) {
                                    throw InvalidProtocolBufferException.m11739c();
                                }
                                int i10 = i2 + 2;
                                i2 += 3;
                                AbstractC6188N0.m11783c(b, bArr[i5], bArr[i10], cArr, i4);
                                i4++;
                            } else {
                                if (i5 < i8 - 2) {
                                    throw InvalidProtocolBufferException.m11739c();
                                }
                                byte b4 = bArr[i5];
                                int i11 = i2 + 3;
                                byte b5 = bArr[i2 + 2];
                                i2 += 4;
                                AbstractC6188N0.m11781a(b, b4, b5, bArr[i11], cArr, i4);
                                i4 += 2;
                            }
                        }
                        return new String(cArr, 0, i4);
                    }
                    i2++;
                    cArr[i9] = (char) b3;
                    i9++;
                }
                i4 = i9;
                while (i2 < i8) {
                    i5 = i2 + 1;
                    b = bArr[i2];
                    if (b >= 0) {
                        i6 = i4 + 1;
                        cArr[i4] = (char) b;
                        i7 = i5;
                        while (i7 < i8) {
                            b2 = bArr[i7];
                            if (b2 >= 0) {
                                i7++;
                                cArr[i6] = (char) b2;
                                i6++;
                            } else {
                                i4 = i6;
                                i2 = i7;
                            }
                        }
                        i4 = i6;
                        i2 = i7;
                    } else if (b < -32) {
                        if (i5 < i8) {
                            throw InvalidProtocolBufferException.m11739c();
                        }
                        i2 += 2;
                        AbstractC6188N0.m11782b(b, bArr[i5], cArr, i4);
                        i4++;
                    } else if (b < -16) {
                        if (i5 < i8 - 1) {
                            throw InvalidProtocolBufferException.m11739c();
                        }
                        int i12 = i2 + 2;
                        i2 += 3;
                        AbstractC6188N0.m11783c(b, bArr[i5], bArr[i12], cArr, i4);
                        i4++;
                    } else {
                        if (i5 < i8 - 2) {
                            throw InvalidProtocolBufferException.m11739c();
                        }
                        byte b6 = bArr[i5];
                        int i13 = i2 + 3;
                        byte b7 = bArr[i2 + 2];
                        i2 += 4;
                        AbstractC6188N0.m11781a(b, b6, b7, bArr[i13], cArr, i4);
                        i4 += 2;
                    }
                }
                return new String(cArr, 0, i4);
            default:
                Charset charset = AbstractC6213a0.f24134a;
                String str = new String(bArr, i2, i3, charset);
                if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i2, i3 + i2))) {
                    throw InvalidProtocolBufferException.m11739c();
                }
                return str;
        }
    }

    @Override // com.google.protobuf.AbstractC6188N0
    /* JADX INFO: renamed from: l */
    public final String mo11801l(ByteBuffer byteBuffer, int i2, int i3) throws InvalidProtocolBufferException {
        long j2;
        byte bMo11836e;
        byte bMo11836e2;
        switch (this.f24172c) {
            case 0:
                return AbstractC6188N0.m11790k(byteBuffer, i2, i3);
            default:
                if ((i2 | i3 | ((byteBuffer.limit() - i2) - i3)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i2), Integer.valueOf(i3)));
                }
                long jM11853j = AbstractC6223d1.f24164c.m11853j(byteBuffer, AbstractC6223d1.f24168g) + ((long) i2);
                long j3 = ((long) i3) + jM11853j;
                char[] cArr = new char[i3];
                int i4 = 0;
                while (true) {
                    j2 = 1;
                    if (jM11853j < j3 && (bMo11836e2 = AbstractC6223d1.f24164c.mo11836e(jM11853j)) >= 0) {
                        jM11853j++;
                        cArr[i4] = (char) bMo11836e2;
                        i4++;
                    }
                }
                int i5 = i4;
                while (jM11853j < j3) {
                    long j4 = jM11853j + j2;
                    AbstractC6220c1 abstractC6220c1 = AbstractC6223d1.f24164c;
                    byte bMo11836e3 = abstractC6220c1.mo11836e(jM11853j);
                    if (bMo11836e3 >= 0) {
                        int i6 = i5 + 1;
                        cArr[i5] = (char) bMo11836e3;
                        while (j4 < j3 && (bMo11836e = AbstractC6223d1.f24164c.mo11836e(j4)) >= 0) {
                            j4 += j2;
                            cArr[i6] = (char) bMo11836e;
                            i6++;
                        }
                        i5 = i6;
                        jM11853j = j4;
                    } else if (bMo11836e3 < -32) {
                        if (j4 >= j3) {
                            throw InvalidProtocolBufferException.m11739c();
                        }
                        jM11853j += 2;
                        AbstractC6188N0.m11782b(bMo11836e3, abstractC6220c1.mo11836e(j4), cArr, i5);
                        i5++;
                    } else if (bMo11836e3 < -16) {
                        if (j4 >= j3 - j2) {
                            throw InvalidProtocolBufferException.m11739c();
                        }
                        long j5 = jM11853j + 2;
                        jM11853j += 3;
                        AbstractC6188N0.m11783c(bMo11836e3, abstractC6220c1.mo11836e(j4), abstractC6220c1.mo11836e(j5), cArr, i5);
                        i5++;
                    } else {
                        if (j4 >= j3 - 2) {
                            throw InvalidProtocolBufferException.m11739c();
                        }
                        byte bMo11836e4 = abstractC6220c1.mo11836e(j4);
                        long j6 = jM11853j + 3;
                        byte bMo11836e5 = abstractC6220c1.mo11836e(jM11853j + 2);
                        jM11853j += 4;
                        AbstractC6188N0.m11781a(bMo11836e3, bMo11836e4, bMo11836e5, abstractC6220c1.mo11836e(j6), cArr, i5);
                        i5 += 2;
                    }
                    j2 = 1;
                }
                return new String(cArr, 0, i5);
        }
    }

    @Override // com.google.protobuf.AbstractC6188N0
    /* JADX INFO: renamed from: q */
    public final int mo11802q(String str, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        char cCharAt;
        long j2;
        char c;
        long j3;
        long j4;
        char c2;
        int i6;
        char cCharAt2;
        switch (this.f24172c) {
            case 0:
                int length = str.length();
                int i7 = i3 + i2;
                int i8 = 0;
                while (i8 < length && (i5 = i8 + i2) < i7 && (cCharAt = str.charAt(i8)) < 128) {
                    bArr[i5] = (byte) cCharAt;
                    i8++;
                }
                if (i8 == length) {
                    return i2 + length;
                }
                int i9 = i2 + i8;
                while (i8 < length) {
                    char cCharAt3 = str.charAt(i8);
                    if (cCharAt3 < 128 && i9 < i7) {
                        bArr[i9] = (byte) cCharAt3;
                        i9++;
                    } else if (cCharAt3 < 2048 && i9 <= i7 - 2) {
                        int i10 = i9 + 1;
                        bArr[i9] = (byte) ((cCharAt3 >>> 6) | 960);
                        i9 += 2;
                        bArr[i10] = (byte) ((cCharAt3 & '?') | 128);
                    } else {
                        if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || i9 > i7 - 3) {
                            if (i9 > i7 - 4) {
                                if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i4 = i8 + 1) == str.length() || !Character.isSurrogatePair(cCharAt3, str.charAt(i4)))) {
                                    throw new C6229f1(i8, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt3 + " at index " + i9);
                            }
                            int i11 = i8 + 1;
                            if (i11 != str.length()) {
                                char cCharAt4 = str.charAt(i11);
                                if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                    int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                    bArr[i9] = (byte) ((codePoint >>> 18) | 240);
                                    bArr[i9 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                    int i12 = i9 + 3;
                                    bArr[i9 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                    i9 += 4;
                                    bArr[i12] = (byte) ((codePoint & 63) | 128);
                                    i8 = i11;
                                } else {
                                    i8 = i11;
                                }
                            }
                            throw new C6229f1(i8 - 1, length);
                        }
                        bArr[i9] = (byte) ((cCharAt3 >>> '\f') | 480);
                        int i13 = i9 + 2;
                        bArr[i9 + 1] = (byte) (((cCharAt3 >>> 6) & 63) | 128);
                        i9 += 3;
                        bArr[i13] = (byte) ((cCharAt3 & '?') | 128);
                    }
                    i8++;
                }
                return i9;
            default:
                long j5 = i2;
                long j6 = ((long) i3) + j5;
                int length2 = str.length();
                if (length2 > i3 || bArr.length - i3 < i2) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i2 + i3));
                }
                int i14 = 0;
                while (true) {
                    j2 = 1;
                    c = 128;
                    if (i14 < length2 && (cCharAt2 = str.charAt(i14)) < 128) {
                        AbstractC6223d1.m11870k(bArr, j5, (byte) cCharAt2);
                        i14++;
                        j5 = 1 + j5;
                    }
                }
                if (i14 == length2) {
                    return (int) j5;
                }
                while (i14 < length2) {
                    char cCharAt5 = str.charAt(i14);
                    if (cCharAt5 < c && j5 < j6) {
                        AbstractC6223d1.m11870k(bArr, j5, (byte) cCharAt5);
                        c2 = c;
                        j3 = j2;
                        j4 = j5 + j2;
                    } else if (cCharAt5 >= 2048 || j5 > j6 - 2) {
                        j3 = j2;
                        if ((cCharAt5 >= 55296 && 57343 >= cCharAt5) || j5 > j6 - 3) {
                            long j7 = j5;
                            if (j7 > j6 - 4) {
                                if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i6 = i14 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i6)))) {
                                    throw new C6229f1(i14, length2);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j7);
                            }
                            int i15 = i14 + 1;
                            if (i15 != length2) {
                                char cCharAt6 = str.charAt(i15);
                                if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                    int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                    AbstractC6223d1.m11870k(bArr, j7, (byte) ((codePoint2 >>> 18) | 240));
                                    c2 = 128;
                                    AbstractC6223d1.m11870k(bArr, j7 + j3, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                    AbstractC6223d1.m11870k(bArr, j7 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                    AbstractC6223d1.m11870k(bArr, j7 + 3, (byte) ((codePoint2 & 63) | 128));
                                    j4 = j7 + 4;
                                    i14 = i15;
                                } else {
                                    i14 = i15;
                                }
                            }
                            throw new C6229f1(i14 - 1, length2);
                        }
                        AbstractC6223d1.m11870k(bArr, j5, (byte) ((cCharAt5 >>> '\f') | 480));
                        long j8 = j5;
                        AbstractC6223d1.m11870k(bArr, j5 + j3, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                        j4 = j8 + 3;
                        AbstractC6223d1.m11870k(bArr, j8 + 2, (byte) ((cCharAt5 & '?') | 128));
                        c2 = 128;
                    } else {
                        j3 = j2;
                        AbstractC6223d1.m11870k(bArr, j5, (byte) ((cCharAt5 >>> 6) | 960));
                        AbstractC6223d1.m11870k(bArr, j5 + j3, (byte) ((cCharAt5 & '?') | c));
                        j4 = j5 + 2;
                        c2 = c;
                    }
                    i14++;
                    c = c2;
                    j5 = j4;
                    j2 = j3;
                }
                return (int) j5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x016c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0178  */
    /* JADX WARN: Code duplicated, block: B:113:0x0182  */
    /* JADX WARN: Code duplicated, block: B:115:0x018b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0193  */
    /* JADX WARN: Code duplicated, block: B:171:0x0255  */
    /* JADX WARN: Code duplicated, block: B:176:0x025f A[ADDED_TO_REGION, LOOP:6: B:176:0x025f->B:263:0x025f, LOOP_START, PHI: r2
  0x025f: PHI (r2v3 int) = (r2v2 int), (r2v7 int) binds: [B:174:0x025c, B:263:0x025f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:178:0x0263  */
    /* JADX WARN: Code duplicated, block: B:183:0x026f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x0271  */
    /* JADX WARN: Code duplicated, block: B:191:0x0283  */
    /* JADX WARN: Code duplicated, block: B:193:0x0289 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:203:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:205:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:207:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:209:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:214:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x012d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x019e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:242:? A[PHI: r2
  PHI (r2v1 int) = (r2v0 int), (r2v13 int), (r2v19 int), (r2v22 int) binds: [B:125:0x01ce, B:168:0x0250, B:149:0x020d, B:134:0x01e0] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x026d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x01e3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:253:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:254:0x0298 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:256:0x029c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:261:0x027a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x025f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x025f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0127  */
    /* JADX WARN: Code duplicated, block: B:85:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0130  */
    /* JADX WARN: Code duplicated, block: B:89:0x0134  */
    /* JADX WARN: Code duplicated, block: B:92:0x013e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0140  */
    /* JADX WARN: Code duplicated, block: B:95:0x0144  */
    /* JADX WARN: Code duplicated, block: B:98:0x014c  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (com.google.protobuf.AbstractC6223d1.m11866g(r24, r5) > (-65)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r5 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        if (com.google.protobuf.AbstractC6223d1.m11866g(r24, r5) > (-65)) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b4, code lost:
    
        if (com.google.protobuf.AbstractC6223d1.m11866g(r24, r5) > (-65)) goto L18;
     */
    @Override // com.google.protobuf.AbstractC6188N0
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo11804w(int r23, byte[] r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C6226e1.mo11804w(int, byte[], int, int):int");
    }
}
