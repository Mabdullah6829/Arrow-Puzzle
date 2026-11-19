package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
final class zzsy {
    static {
        if (zzsw.f21827e && zzsw.f21826d) {
            int i2 = zzpc.f21705a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m9297a(String str, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        char cCharAt;
        int length = str.length();
        int i7 = 0;
        while (true) {
            i4 = i2 + i3;
            if (i7 >= length || (i6 = i7 + i2) >= i4 || (cCharAt = str.charAt(i7)) >= 128) {
                break;
            }
            bArr[i6] = (byte) cCharAt;
            i7++;
        }
        if (i7 == length) {
            return i2 + length;
        }
        int i8 = i2 + i7;
        while (i7 < length) {
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
                    if (i8 > i4 - 4) {
                        if (cCharAt2 < 55296 || cCharAt2 > 57343 || ((i5 = i7 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i5)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        throw new zzsx(i7, length);
                    }
                    int i9 = i7 + 1;
                    if (i9 != str.length()) {
                        char cCharAt3 = str.charAt(i9);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i10 = i8 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i8 += 4;
                            bArr[i10] = (byte) ((codePoint & 63) | 128);
                            i7 = i9;
                        } else {
                            i7 = i9;
                        }
                    }
                    throw new zzsx(i7 - 1, length);
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

    /* JADX INFO: renamed from: b */
    public static int m9298b(String str) {
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
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i3) < 65536) {
                                throw new zzsx(i3, length2);
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
}
