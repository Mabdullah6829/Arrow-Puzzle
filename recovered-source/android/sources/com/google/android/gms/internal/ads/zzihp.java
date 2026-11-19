package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
final class zzihp {

    /* JADX INFO: renamed from: a */
    public static final zzihn f19910a;

    static {
        int i2 = zzicy.f19697a;
        f19910a = new zzihn();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m8486a(byte[] bArr, int i2, int i3) {
        f19910a.getClass();
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return true;
        }
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                i2 = i4;
            } else if (b < -32) {
                if (i4 >= i3 || b < -62) {
                    return false;
                }
                i2 += 2;
                if (bArr[i4] > -65) {
                    return false;
                }
            } else if (b < -16) {
                if (i4 >= i3 - 1) {
                    return false;
                }
                int i5 = i2 + 2;
                byte b2 = bArr[i4];
                if (b2 > -65) {
                    return false;
                }
                if (b == -32 && b2 < -96) {
                    return false;
                }
                if (b == -19 && b2 >= -96) {
                    return false;
                }
                i2 += 3;
                if (bArr[i5] > -65) {
                    return false;
                }
            } else {
                if (i4 >= i3 - 2) {
                    return false;
                }
                int i6 = i2 + 2;
                byte b3 = bArr[i4];
                if (b3 > -65) {
                    return false;
                }
                if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                    return false;
                }
                int i7 = i2 + 3;
                if (bArr[i6] > -65) {
                    return false;
                }
                i2 += 4;
                if (bArr[i7] > -65) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static int m8487b(String str) {
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
                try {
                    int length2 = str.length();
                    while (i3 < length2) {
                        char cCharAt2 = str.charAt(i3);
                        if (cCharAt2 < 2048) {
                            i2 += (127 - cCharAt2) >>> 31;
                        } else {
                            i2 += 2;
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i3) < 65536) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 32 + String.valueOf(length2).length());
                                    sb.append("Unpaired surrogate at index ");
                                    sb.append(i3);
                                    sb.append(" of ");
                                    sb.append(length2);
                                    throw new zziho(sb.toString());
                                }
                                i3++;
                            }
                        }
                        i3++;
                    }
                    i4 += i2;
                    break;
                } catch (zziho unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
            i4 += (127 - cCharAt) >>> 31;
            i3++;
        }
        if (i4 >= length) {
            return i4;
        }
        long j2 = ((long) i4) + 4294967296L;
        StringBuilder sb2 = new StringBuilder(String.valueOf(j2).length() + 34);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(j2);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: renamed from: c */
    public static int m8488c(String str, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        int length;
        int i6;
        char cCharAt;
        int length2 = str.length();
        int i7 = 0;
        while (true) {
            i4 = i2 + i3;
            if (i7 >= length2 || (i6 = i7 + i2) >= i4 || (cCharAt = str.charAt(i7)) >= 128) {
                break;
            }
            bArr[i6] = (byte) cCharAt;
            i7++;
        }
        if (i7 == length2) {
            return i2 + length2;
        }
        int i8 = i2 + i7;
        while (i7 < length2) {
            char cCharAt2 = str.charAt(i7);
            if (cCharAt2 < 128 && i8 < i4) {
                bArr[i8] = (byte) cCharAt2;
                i8++;
            } else if (cCharAt2 < 2048 && i8 <= i4 - 2) {
                bArr[i8] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i8 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i8 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i8 > i4 - 3) {
                    if (i8 <= i4 - 4) {
                        i7++;
                        if (i7 != str.length()) {
                            char cCharAt3 = str.charAt(i7);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int i9 = i8 + 3;
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i8 += 4;
                                bArr[i9] = (byte) ((codePoint & 63) | 128);
                            }
                        }
                        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                        length = bytes.length;
                        if (length - i2 > i3) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes, 0, bArr, i2, length);
                    } else {
                        if (cCharAt2 < 55296 || cCharAt2 > 57343 || ((i5 = i7 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i5)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
                        length = bytes2.length;
                        if (length - i2 > i3) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes2, 0, bArr, i2, length);
                    }
                    return i2 + length;
                }
                bArr[i8] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i8 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i8 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i8 += 3;
            }
            i7++;
        }
        return i8;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0093  */
    /* JADX WARN: Code duplicated, block: B:44:0x0094 A[PHI: r4
  0x0094: PHI (r4v6 byte) = (r4v5 byte), (r4v9 byte) binds: [B:41:0x008f, B:43:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x009a  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ac A[SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static String m8489d(byte[] bArr, int i2, int i3) throws zzifh {
        if (i3 == 0) {
            return "";
        }
        int length = bArr.length;
        if ((((length - i2) - i3) | i2 | i3) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i4 = i2 + i3;
        char[] cArr = new char[i3];
        int i5 = 0;
        while (i2 < i4) {
            byte b = bArr[i2];
            if (b < 0) {
                break;
            }
            i2++;
            cArr[i5] = (char) b;
            i5++;
        }
        while (i2 < i4) {
            int i6 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                cArr[i5] = (char) b2;
                i5++;
                i2 = i6;
                while (i2 < i4) {
                    byte b3 = bArr[i2];
                    if (b3 < 0) {
                        break;
                    }
                    i2++;
                    cArr[i5] = (char) b3;
                    i5++;
                }
            } else {
                if (b2 >= -32) {
                    if (b2 >= -16) {
                        if (i6 >= i4 - 2) {
                            throw new zzifh("Protocol message had invalid UTF-8.");
                        }
                        byte b4 = bArr[i6];
                        int i7 = i2 + 3;
                        byte b5 = bArr[i2 + 2];
                        i2 += 4;
                        byte b6 = bArr[i7];
                        if (!zzihl.m8485a(b4)) {
                            if ((((b4 + 112) + (b2 << 28)) >> 30) == 0 && !zzihl.m8485a(b5) && !zzihl.m8485a(b6)) {
                                int i8 = ((b4 & 63) << 12) | ((b2 & 7) << 18) | ((b5 & 63) << 6) | (b6 & 63);
                                cArr[i5] = (char) ((i8 >>> 10) + 55232);
                                cArr[i5 + 1] = (char) ((i8 & 1023) + 56320);
                                i5 += 2;
                            }
                        }
                        throw new zzifh("Protocol message had invalid UTF-8.");
                    }
                    if (i6 >= i4 - 1) {
                        throw new zzifh("Protocol message had invalid UTF-8.");
                    }
                    int i9 = i5 + 1;
                    int i10 = i2 + 2;
                    byte b7 = bArr[i6];
                    i2 += 3;
                    byte b8 = bArr[i10];
                    if (!zzihl.m8485a(b7)) {
                        if (b2 != -32) {
                            if (b2 != -19) {
                                if (!zzihl.m8485a(b8)) {
                                    cArr[i5] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                                    i5 = i9;
                                }
                            } else if (b7 < -96) {
                                b2 = -19;
                                if (!zzihl.m8485a(b8)) {
                                    cArr[i5] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                                    i5 = i9;
                                }
                            }
                        } else if (b7 >= -96) {
                            b2 = -32;
                            if (b2 != -19) {
                                if (!zzihl.m8485a(b8)) {
                                    cArr[i5] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                                    i5 = i9;
                                }
                            } else if (b7 < -96) {
                                b2 = -19;
                                if (!zzihl.m8485a(b8)) {
                                    cArr[i5] = (char) (((b7 & 63) << 6) | ((b2 & 15) << 12) | (b8 & 63));
                                    i5 = i9;
                                }
                            }
                        }
                    }
                    throw new zzifh("Protocol message had invalid UTF-8.");
                }
                if (i6 >= i4) {
                    throw new zzifh("Protocol message had invalid UTF-8.");
                }
                int i11 = i5 + 1;
                i2 += 2;
                byte b9 = bArr[i6];
                if (b2 < -62 || zzihl.m8485a(b9)) {
                    throw new zzifh("Protocol message had invalid UTF-8.");
                }
                cArr[i5] = (char) ((b9 & 63) | ((b2 & 31) << 6));
                i5 = i11;
            }
        }
        return new String(cArr, 0, i5);
    }
}
