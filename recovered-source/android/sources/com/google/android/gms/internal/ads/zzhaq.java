package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhaq extends zzhar {
    /* JADX INFO: renamed from: a */
    public static int m7304a(long j2) {
        int i2 = (int) j2;
        zzgtr.m7131d(j2, ((long) i2) == j2, "Out of range: %s");
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public static int m7305b(long j2) {
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }

    /* JADX INFO: renamed from: c */
    public static int m7306c(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    /* JADX INFO: renamed from: d */
    public static int[] m7307d(AbstractCollection abstractCollection) {
        if (abstractCollection instanceof zzhap) {
            zzhap zzhapVar = (zzhap) abstractCollection;
            return Arrays.copyOfRange(zzhapVar.f18433s, zzhapVar.f18434t, zzhapVar.f18435u);
        }
        Object[] array = abstractCollection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = array[i2];
            obj.getClass();
            iArr[i2] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: e */
    public static List m7308e(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new zzhap(iArr, 0, length);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    /* JADX INFO: renamed from: f */
    public static Integer m7309f(String str) {
        byte b;
        Long lValueOf;
        byte b2;
        str.getClass();
        if (!str.isEmpty()) {
            char cCharAt = str.charAt(0);
            int i2 = cCharAt == '-' ? 1 : 0;
            if (i2 != str.length()) {
                int i3 = i2 + 1;
                char cCharAt2 = str.charAt(i2);
                if (cCharAt2 < 128) {
                    b = zzhas.f18436a[cCharAt2];
                } else {
                    byte[] bArr = zzhas.f18436a;
                    b = -1;
                }
                if (b >= 0 && b < 10) {
                    long j2 = -b;
                    while (true) {
                        if (i3 >= str.length()) {
                            if (cCharAt != '-') {
                                if (j2 != Long.MIN_VALUE) {
                                    lValueOf = Long.valueOf(-j2);
                                    break;
                                }
                                break;
                            }
                            lValueOf = Long.valueOf(j2);
                            break;
                        }
                        int i4 = i3 + 1;
                        char cCharAt3 = str.charAt(i3);
                        if (cCharAt3 < 128) {
                            b2 = zzhas.f18436a[cCharAt3];
                        } else {
                            byte[] bArr2 = zzhas.f18436a;
                            b2 = -1;
                        }
                        if (b2 >= 0 && b2 < 10 && j2 >= -922337203685477580L) {
                            long j3 = j2 * 10;
                            long j4 = b2;
                            if (j3 >= Long.MIN_VALUE + j4) {
                                j2 = j3 - j4;
                                i3 = i4;
                            }
                        }
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = null;
                break;
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }
}
