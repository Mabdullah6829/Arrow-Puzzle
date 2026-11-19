package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhki {
    /* JADX INFO: renamed from: a */
    public static byte[] m7495a(byte[] bArr, byte[] bArr2) {
        long jM7496b = m7496b(0, bArr) & 67108863;
        int i2 = 3;
        long jM7496b2 = (m7496b(3, bArr) >> 2) & 67108611;
        long jM7496b3 = (m7496b(6, bArr) >> 4) & 67092735;
        long jM7496b4 = (m7496b(9, bArr) >> 6) & 66076671;
        long jM7496b5 = (m7496b(12, bArr) >> 8) & 1048575;
        byte[] bArr3 = new byte[17];
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        int i3 = 0;
        while (true) {
            int length = bArr2.length;
            if (i3 >= length) {
                long j7 = j2 + (j3 >> 26);
                long j8 = j7 & 67108863;
                long j9 = j4 + (j7 >> 26);
                long j10 = j9 & 67108863;
                long j11 = j5 + (j9 >> 26);
                long j12 = j11 & 67108863;
                long j13 = ((j11 >> 26) * 5) + j6;
                long j14 = j13 >> 26;
                long j15 = j13 & 67108863;
                long j16 = j15 + 5;
                long j17 = (j3 & 67108863) + j14;
                long j18 = j17 + (j16 >> 26);
                long j19 = j8 + (j18 >> 26);
                long j20 = j10 + (j19 >> 26);
                long j21 = (j12 + (j20 >> 26)) - 67108864;
                long j22 = j21 >> 63;
                long j23 = ~j22;
                long j24 = (j17 & j22) | (j18 & 67108863 & j23);
                long j25 = (j8 & j22) | (j19 & 67108863 & j23);
                long j26 = (j10 & j22) | (j20 & 67108863 & j23);
                long jM7496b6 = m7496b(16, bArr) + (((j16 & 67108863 & j23) | (j15 & j22) | (j24 << 26)) & 4294967295L);
                long jM7496b7 = m7496b(20, bArr);
                long jM7496b8 = m7496b(24, bArr);
                long jM7496b9 = m7496b(28, bArr) + (((j26 >> 18) | (((j12 & j22) | (j21 & j23)) << 8)) & 4294967295L);
                byte[] bArr4 = new byte[16];
                m7497c(bArr4, jM7496b6 & 4294967295L, 0);
                long j27 = jM7496b7 + (((j24 >> 6) | (j25 << 20)) & 4294967295L) + (jM7496b6 >> 32);
                m7497c(bArr4, j27 & 4294967295L, 4);
                long j28 = jM7496b8 + (((j26 << 14) | (j25 >> 12)) & 4294967295L) + (j27 >> 32);
                m7497c(bArr4, j28 & 4294967295L, 8);
                m7497c(bArr4, (jM7496b9 + (j28 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i3);
            System.arraycopy(bArr2, i3, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long j29 = jM7496b5 * 5;
            long j30 = jM7496b4 * 5;
            long j31 = jM7496b3 * 5;
            long jM7496b10 = j6 + (m7496b(0, bArr3) & 67108863);
            long jM7496b11 = j3 + ((m7496b(i2, bArr3) >> 2) & 67108863);
            long jM7496b12 = j2 + ((m7496b(6, bArr3) >> 4) & 67108863);
            long jM7496b13 = j4 + ((m7496b(9, bArr3) >> 6) & 67108863);
            long j32 = jM7496b2;
            long jM7496b14 = j5 + (((m7496b(12, bArr3) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
            long j33 = jM7496b11 * jM7496b;
            long j34 = jM7496b11 * j32;
            long j35 = jM7496b12 * jM7496b;
            long j36 = jM7496b11 * jM7496b3;
            long j37 = jM7496b12 * j32;
            long j38 = jM7496b13 * jM7496b;
            long j39 = jM7496b11 * jM7496b4;
            long j40 = jM7496b12 * jM7496b3;
            long j41 = jM7496b13 * j32;
            long j42 = jM7496b14 * jM7496b;
            long j43 = (jM7496b2 * 5 * jM7496b14) + (jM7496b13 * j31) + (jM7496b12 * j30) + (jM7496b11 * j29) + (jM7496b10 * jM7496b);
            long j44 = j43 & 67108863;
            long j45 = jM7496b13 * j30;
            long j46 = j31 * jM7496b14;
            long j47 = j46 + j45 + (jM7496b12 * j29) + (jM7496b10 * j32) + j33 + (j43 >> 26);
            long j48 = j30 * jM7496b14;
            long j49 = j48 + (jM7496b13 * j29) + (jM7496b10 * jM7496b3) + j34 + j35 + (j47 >> 26);
            long j50 = (jM7496b14 * j29) + (jM7496b10 * jM7496b4) + j36 + j37 + j38 + (j49 >> 26);
            long j51 = (jM7496b10 * jM7496b5) + j39 + j40 + j41 + j42 + (j50 >> 26);
            long j52 = ((j51 >> 26) * 5) + j44;
            j3 = (j47 & 67108863) + (j52 >> 26);
            i3 += 16;
            j2 = j49 & 67108863;
            j4 = j50 & 67108863;
            j5 = j51 & 67108863;
            j6 = j52 & 67108863;
            jM7496b2 = j32;
            i2 = 3;
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m7496b(int i2, byte[] bArr) {
        int i3 = bArr[i2] & 255;
        int i4 = bArr[i2 + 1] & 255;
        int i5 = bArr[i2 + 2] & 255;
        return ((long) (((bArr[i2 + 3] & 255) << 24) | (i4 << 8) | i3 | (i5 << 16))) & 4294967295L;
    }

    /* JADX INFO: renamed from: c */
    public static void m7497c(byte[] bArr, long j2, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i2 + i3] = (byte) (255 & j2);
            j2 >>= 8;
        }
    }
}
