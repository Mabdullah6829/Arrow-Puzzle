package com.google.protobuf;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.google.protobuf.g1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6232g1 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC6188N0 f24178a;

    static {
        f24178a = (AbstractC6223d1.f24166e && AbstractC6223d1.f24165d && !AbstractC6224e.m11876a()) ? new C6226e1(1) : new C6226e1(0);
    }

    /* JADX INFO: renamed from: a */
    public static int m11882a(byte[] bArr, int i2, int i3) {
        byte b = bArr[i2 - 1];
        int i4 = i3 - i2;
        if (i4 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i4 == 1) {
            return m11885d(b, bArr[i2]);
        }
        if (i4 == 2) {
            return m11886e(b, bArr[i2], bArr[i2 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: b */
    public static String m11883b(ByteBuffer byteBuffer, int i2, int i3) {
        AbstractC6188N0 abstractC6188N0 = f24178a;
        abstractC6188N0.getClass();
        if (byteBuffer.hasArray()) {
            return abstractC6188N0.mo11800j(byteBuffer.array(), byteBuffer.arrayOffset() + i2, i3);
        }
        return byteBuffer.isDirect() ? abstractC6188N0.mo11801l(byteBuffer, i2, i3) : AbstractC6188N0.m11790k(byteBuffer, i2, i3);
    }

    /* JADX INFO: renamed from: c */
    public static int m11884c(String str) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && str.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                while (i3 < length2) {
                    char cCharAt2 = str.charAt(i3);
                    if (cCharAt2 < 2048) {
                        i2 += (127 - cCharAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i3) < 65536) {
                                throw new C6229f1(i3, length2);
                            }
                            i3++;
                        }
                    }
                    i3++;
                }
                i4 += i2;
                break;
            }
            i4 += (127 - cCharAt) >>> 31;
            i3++;
        }
        if (i4 >= length) {
            return i4;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i4) + 4294967296L));
    }

    /* JADX INFO: renamed from: d */
    public static int m11885d(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    /* JADX INFO: renamed from: e */
    public static int m11886e(int i2, int i3, int i4) {
        if (i2 > -12 || i3 > -65 || i4 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i4 << 16);
    }
}
