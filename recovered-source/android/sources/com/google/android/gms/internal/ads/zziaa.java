package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zziaa implements zzhev {

    /* JADX INFO: renamed from: a */
    public final byte[] f19555a;

    /* JADX INFO: renamed from: b */
    public final byte[] f19556b;

    /* JADX INFO: renamed from: c */
    public final byte[] f19557c;

    public zziaa(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!zzhle.m7504a(1)) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Given public key's length is not 32.");
        }
        this.f19555a = (byte[]) bArr.clone();
        this.f19556b = bArr2;
        this.f19557c = bArr3;
        if (zzhlr.f18937a == null) {
            throw new IllegalStateException("Could not initialize Ed25519.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhev
    /* JADX INFO: renamed from: a */
    public final void mo7422a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f19556b;
        int length = bArr3.length;
        byte[] bArr4 = this.f19557c;
        if (length == 0 && bArr4.length == 0) {
            m8034b(bArr, bArr2);
        } else {
            if (!zzhok.m7598c(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            if (bArr4.length != 0) {
                bArr2 = zzhzw.m8023a(bArr2, bArr4);
            }
            m8034b(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8034b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = bArr;
        if (bArr3.length != 64) {
            throw new GeneralSecurityException("The length of the signature is not 64.");
        }
        if (bArr3.length == 64) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr3, 32, 64);
            int i2 = 31;
            while (i2 >= 0) {
                int i3 = bArrCopyOfRange[i2] & 255;
                int i4 = zzhlp.f18934c[i2] & 255;
                if (i3 == i4) {
                    i2--;
                    bArr3 = bArr;
                } else if (i3 < i4) {
                    MessageDigest messageDigest = (MessageDigest) zziak.f19575e.f19578a.zza("SHA-512");
                    messageDigest.update(bArr3, 0, 32);
                    byte[] bArr4 = this.f19555a;
                    messageDigest.update(bArr4);
                    messageDigest.update(bArr2);
                    byte[] bArrDigest = messageDigest.digest();
                    long jM7525j = zzhlp.m7525j(0, bArrDigest) & 2097151;
                    long jM7526k = zzhlp.m7526k(2, bArrDigest) >> 5;
                    long jM7525j2 = zzhlp.m7525j(5, bArrDigest) >> 2;
                    long jM7526k2 = zzhlp.m7526k(7, bArrDigest) >> 7;
                    long jM7526k3 = zzhlp.m7526k(10, bArrDigest) >> 4;
                    long jM7525j3 = zzhlp.m7525j(13, bArrDigest) >> 1;
                    long jM7526k4 = zzhlp.m7526k(15, bArrDigest) >> 6;
                    long jM7525j4 = zzhlp.m7525j(18, bArrDigest) >> 3;
                    long jM7525j5 = zzhlp.m7525j(21, bArrDigest) & 2097151;
                    long jM7526k5 = zzhlp.m7526k(23, bArrDigest) >> 5;
                    long jM7525j6 = zzhlp.m7525j(26, bArrDigest) >> 2;
                    long jM7526k6 = zzhlp.m7526k(28, bArrDigest) >> 7;
                    long jM7526k7 = zzhlp.m7526k(31, bArrDigest) >> 4;
                    long jM7525j7 = zzhlp.m7525j(34, bArrDigest) >> 1;
                    long jM7526k8 = zzhlp.m7526k(36, bArrDigest) >> 6;
                    long jM7525j8 = zzhlp.m7525j(39, bArrDigest) >> 3;
                    long jM7525j9 = zzhlp.m7525j(42, bArrDigest) & 2097151;
                    long jM7526k9 = zzhlp.m7526k(44, bArrDigest) >> 5;
                    long jM7525j10 = (zzhlp.m7525j(47, bArrDigest) >> 2) & 2097151;
                    long jM7526k10 = (zzhlp.m7526k(49, bArrDigest) >> 7) & 2097151;
                    long jM7526k11 = (zzhlp.m7526k(52, bArrDigest) >> 4) & 2097151;
                    long jM7525j11 = (zzhlp.m7525j(55, bArrDigest) >> 1) & 2097151;
                    long jM7526k12 = (zzhlp.m7526k(57, bArrDigest) >> 6) & 2097151;
                    long jM7526k13 = zzhlp.m7526k(60, bArrDigest) >> 3;
                    long j2 = (jM7526k11 * 666643) + jM7525j5;
                    long j3 = (jM7526k10 * 666643) + jM7525j4;
                    long j4 = (jM7525j10 * 666643) + (jM7526k4 & 2097151);
                    long j5 = (j4 + 1048576) >> 21;
                    long j6 = j5 << 21;
                    long j7 = (jM7525j10 * 654183) + (jM7526k10 * 470296) + j2;
                    long j8 = (j7 + 1048576) >> 21;
                    long j9 = j8 << 21;
                    long j10 = (jM7525j10 * 136657) + (((jM7526k11 * 654183) + ((jM7525j11 * 470296) + ((jM7526k12 * 666643) + (jM7525j6 & 2097151)))) - (jM7526k10 * 997805));
                    long j11 = (j10 + 1048576) >> 21;
                    long j12 = j11 << 21;
                    long j13 = ((jM7526k11 * 136657) + (((jM7526k12 * 654183) + ((jM7526k13 * 470296) + (jM7526k7 & 2097151))) - (jM7525j11 * 997805))) - (jM7526k10 * 683901);
                    long j14 = (j13 + 1048576) >> 21;
                    long j15 = ((jM7526k12 * 136657) + ((jM7526k8 & 2097151) - (jM7526k13 * 997805))) - (jM7525j11 * 683901);
                    long j16 = (j15 + 1048576) >> 21;
                    long j17 = j16 << 21;
                    long j18 = jM7525j9 - (jM7526k13 * 683901);
                    long j19 = (j18 + 1048576) >> 21;
                    long j20 = (jM7525j10 * 470296) + j3 + j5;
                    long j21 = (j20 + 1048576) >> 21;
                    long j22 = j21 << 21;
                    long j23 = (((jM7526k10 * 654183) + ((jM7526k11 * 470296) + ((jM7525j11 * 666643) + (jM7526k5 & 2097151)))) - (jM7525j10 * 997805)) + j8;
                    long j24 = (j23 + 1048576) >> 21;
                    long j25 = j24 << 21;
                    long j26 = (((jM7526k10 * 136657) + (((jM7525j11 * 654183) + ((jM7526k12 * 470296) + ((jM7526k13 * 666643) + (jM7526k6 & 2097151)))) - (jM7526k11 * 997805))) - (jM7525j10 * 683901)) + j11;
                    long j27 = (j26 + 1048576) >> 21;
                    long j28 = j27 << 21;
                    long j29 = (((jM7525j11 * 136657) + (((jM7526k13 * 654183) + (jM7525j7 & 2097151)) - (jM7526k12 * 997805))) - (jM7526k11 * 683901)) + j14;
                    long j30 = (j29 + 1048576) >> 21;
                    long j31 = (((jM7526k13 * 136657) + jM7525j8) - (jM7526k12 * 683901)) + j16;
                    long j32 = (j31 + 1048576) >> 21;
                    long j33 = (j13 - (j14 << 21)) + j27;
                    long j34 = (j33 * 666643) + jM7525j;
                    long j35 = (j34 + 1048576) >> 21;
                    long j36 = j35 << 21;
                    long j37 = (j15 - j17) + j30;
                    long j38 = j29 - (j30 << 21);
                    long j39 = (j33 * 654183) + (j38 * 470296) + (j37 * 666643) + (jM7525j2 & 2097151);
                    long j40 = (j39 + 1048576) >> 21;
                    long j41 = j40 << 21;
                    long j42 = (j18 - (j19 << 21)) + j32;
                    long j43 = j31 - (j32 << 21);
                    long j44 = (j33 * 136657) + (((j37 * 654183) + ((j43 * 470296) + ((j42 * 666643) + (jM7526k3 & 2097151)))) - (j38 * 997805));
                    long j45 = (j44 + 1048576) >> 21;
                    long j46 = j45 << 21;
                    long j47 = (jM7526k9 & 2097151) + j19;
                    long j48 = ((j37 * 136657) + (((j42 * 654183) + ((j47 * 470296) + (j4 - j6))) - (j43 * 997805))) - (j38 * 683901);
                    long j49 = (j48 + 1048576) >> 21;
                    long j50 = j49 << 21;
                    long j51 = ((j42 * 136657) + (((j7 - j9) + j21) - (j47 * 997805))) - (j43 * 683901);
                    long j52 = (j51 + 1048576) >> 21;
                    long j53 = j52 << 21;
                    long j54 = ((j10 - j12) + j24) - (j47 * 683901);
                    long j55 = (j54 + 1048576) >> 21;
                    long j56 = j55 << 21;
                    long j57 = (j33 * 470296) + (j38 * 666643) + (jM7526k & 2097151) + j35;
                    long j58 = (j57 + 1048576) >> 21;
                    long j59 = (((j38 * 654183) + ((j37 * 470296) + ((j43 * 666643) + (jM7526k2 & 2097151)))) - (j33 * 997805)) + j40;
                    long j60 = (j59 + 1048576) >> 21;
                    long j61 = (((j38 * 136657) + (((j43 * 654183) + ((j42 * 470296) + ((j47 * 666643) + (jM7525j3 & 2097151)))) - (j37 * 997805))) - (j33 * 683901)) + j45;
                    long j62 = (j61 + 1048576) >> 21;
                    long j63 = (((j43 * 136657) + (((j47 * 654183) + (j20 - j22)) - (j42 * 997805))) - (j37 * 683901)) + j49;
                    long j64 = (j63 + 1048576) >> 21;
                    long j65 = (((j47 * 136657) + (j23 - j25)) - (j42 * 683901)) + j52;
                    long j66 = (j65 + 1048576) >> 21;
                    long j67 = (j26 - j28) + j55;
                    long j68 = (j67 + 1048576) >> 21;
                    long j69 = j68 << 21;
                    long j70 = (j68 * 666643) + (j34 - j36);
                    long j71 = j70 >> 21;
                    long j72 = j71 << 21;
                    long j73 = (j68 * 470296) + (j57 - (j58 << 21)) + j71;
                    long j74 = j73 >> 21;
                    long j75 = j74 << 21;
                    long j76 = (j68 * 654183) + (j39 - j41) + j58 + j74;
                    long j77 = j76 >> 21;
                    long j78 = j77 << 21;
                    long j79 = ((j59 - (j60 << 21)) - (j68 * 997805)) + j77;
                    long j80 = j79 >> 21;
                    long j81 = j80 << 21;
                    long j82 = (j68 * 136657) + (j44 - j46) + j60 + j80;
                    long j83 = j82 >> 21;
                    long j84 = j83 << 21;
                    long j85 = ((j61 - (j62 << 21)) - (j68 * 683901)) + j83;
                    long j86 = j85 >> 21;
                    long j87 = j86 << 21;
                    long j88 = (j48 - j50) + j62 + j86;
                    long j89 = j88 >> 21;
                    long j90 = j89 << 21;
                    long j91 = (j63 - (j64 << 21)) + j89;
                    long j92 = j91 >> 21;
                    long j93 = j92 << 21;
                    long j94 = (j51 - j53) + j64 + j92;
                    long j95 = j94 >> 21;
                    long j96 = j95 << 21;
                    long j97 = (j65 - (j66 << 21)) + j95;
                    long j98 = j97 >> 21;
                    long j99 = j98 << 21;
                    long j100 = (j54 - j56) + j66 + j98;
                    long j101 = j100 >> 21;
                    long j102 = j101 << 21;
                    long j103 = (j67 - j69) + j101;
                    long j104 = j103 >> 21;
                    long j105 = j104 << 21;
                    long j106 = (666643 * j104) + (j70 - j72);
                    long j107 = j106 >> 21;
                    long j108 = j107 << 21;
                    long j109 = (470296 * j104) + (j73 - j75) + j107;
                    long j110 = j109 >> 21;
                    long j111 = j110 << 21;
                    long j112 = (654183 * j104) + (j76 - j78) + j110;
                    long j113 = j112 >> 21;
                    long j114 = j113 << 21;
                    long j115 = ((j79 - j81) - (997805 * j104)) + j113;
                    long j116 = j115 >> 21;
                    long j117 = j116 << 21;
                    long j118 = (136657 * j104) + (j82 - j84) + j116;
                    long j119 = j118 >> 21;
                    long j120 = j119 << 21;
                    long j121 = ((j85 - j87) - (j104 * 683901)) + j119;
                    long j122 = j121 >> 21;
                    long j123 = j122 << 21;
                    long j124 = (j88 - j90) + j122;
                    long j125 = j124 >> 21;
                    long j126 = j125 << 21;
                    long j127 = (j91 - j93) + j125;
                    long j128 = j127 >> 21;
                    long j129 = j128 << 21;
                    long j130 = (j94 - j96) + j128;
                    long j131 = j130 >> 21;
                    long j132 = j131 << 21;
                    long j133 = (j97 - j99) + j131;
                    long j134 = j133 >> 21;
                    long j135 = j134 << 21;
                    long j136 = (j100 - j102) + j134;
                    long j137 = j136 >> 21;
                    long j138 = j106 - j108;
                    bArrDigest[0] = (byte) j138;
                    long j139 = j127 - j129;
                    long j140 = j124 - j126;
                    long j141 = j121 - j123;
                    long j142 = j118 - j120;
                    long j143 = j115 - j117;
                    long j144 = j112 - j114;
                    long j145 = j109 - j111;
                    bArrDigest[1] = (byte) (j138 >> 8);
                    bArrDigest[2] = (byte) ((j138 >> 16) | (j145 << 5));
                    bArrDigest[3] = (byte) (j145 >> 3);
                    bArrDigest[4] = (byte) (j145 >> 11);
                    bArrDigest[5] = (byte) ((j145 >> 19) | (j144 << 2));
                    bArrDigest[6] = (byte) (j144 >> 6);
                    bArrDigest[7] = (byte) ((j144 >> 14) | (j143 << 7));
                    bArrDigest[8] = (byte) (j143 >> 1);
                    bArrDigest[9] = (byte) (j143 >> 9);
                    bArrDigest[10] = (byte) ((j143 >> 17) | (j142 << 4));
                    bArrDigest[11] = (byte) (j142 >> 4);
                    bArrDigest[12] = (byte) (j142 >> 12);
                    bArrDigest[13] = (byte) ((j142 >> 20) | (j141 + j141));
                    bArrDigest[14] = (byte) (j141 >> 7);
                    bArrDigest[15] = (byte) ((j141 >> 15) | (j140 << 6));
                    bArrDigest[16] = (byte) (j140 >> 2);
                    bArrDigest[17] = (byte) (j140 >> 10);
                    bArrDigest[18] = (byte) ((j140 >> 18) | (j139 << 3));
                    long j146 = j136 - (j137 << 21);
                    long j147 = (j103 - j105) + j137;
                    long j148 = j133 - j135;
                    long j149 = j130 - j132;
                    bArrDigest[19] = (byte) (j139 >> 5);
                    bArrDigest[20] = (byte) (j139 >> 13);
                    bArrDigest[21] = (byte) j149;
                    bArrDigest[22] = (byte) (j149 >> 8);
                    bArrDigest[23] = (byte) ((j149 >> 16) | (j148 << 5));
                    bArrDigest[24] = (byte) (j148 >> 3);
                    bArrDigest[25] = (byte) (j148 >> 11);
                    bArrDigest[26] = (byte) ((j148 >> 19) | (j146 << 2));
                    bArrDigest[27] = (byte) (j146 >> 6);
                    bArrDigest[28] = (byte) ((j146 >> 14) | (j147 << 7));
                    bArrDigest[29] = (byte) (j147 >> 1);
                    bArrDigest[30] = (byte) (j147 >> 9);
                    bArrDigest[31] = (byte) (j147 >> 17);
                    long[] jArr = new long[10];
                    long[] jArrM7548g = zzhlw.m7548g(bArr4);
                    long[] jArr2 = new long[10];
                    jArr2[0] = 1;
                    long[] jArr3 = new long[10];
                    long[] jArr4 = new long[10];
                    long[] jArr5 = new long[10];
                    long[] jArr6 = new long[10];
                    long[] jArr7 = new long[10];
                    zzhlw.m7547f(jArr4, jArrM7548g);
                    zzhlw.m7546e(jArr5, jArr4, zzhlr.f18937a);
                    zzhlw.m7543b(jArr4, jArr4, jArr2);
                    zzhlw.m7542a(jArr5, jArr5, jArr2);
                    long[] jArr8 = new long[10];
                    zzhlw.m7547f(jArr8, jArr5);
                    zzhlw.m7546e(jArr8, jArr8, jArr5);
                    zzhlw.m7547f(jArr, jArr8);
                    zzhlw.m7546e(jArr, jArr, jArr5);
                    zzhlw.m7546e(jArr, jArr, jArr4);
                    long[] jArr9 = new long[10];
                    long[] jArr10 = new long[10];
                    long[] jArr11 = new long[10];
                    zzhlw.m7547f(jArr9, jArr);
                    zzhlw.m7547f(jArr10, jArr9);
                    zzhlw.m7547f(jArr10, jArr10);
                    zzhlw.m7546e(jArr10, jArr, jArr10);
                    zzhlw.m7546e(jArr9, jArr9, jArr10);
                    zzhlw.m7547f(jArr9, jArr9);
                    zzhlw.m7546e(jArr9, jArr10, jArr9);
                    zzhlw.m7547f(jArr10, jArr9);
                    for (int i5 = 1; i5 < 5; i5++) {
                        zzhlw.m7547f(jArr10, jArr10);
                    }
                    zzhlw.m7546e(jArr9, jArr10, jArr9);
                    zzhlw.m7547f(jArr10, jArr9);
                    for (int i6 = 1; i6 < 10; i6++) {
                        zzhlw.m7547f(jArr10, jArr10);
                    }
                    zzhlw.m7546e(jArr10, jArr10, jArr9);
                    zzhlw.m7547f(jArr11, jArr10);
                    for (int i7 = 1; i7 < 20; i7++) {
                        zzhlw.m7547f(jArr11, jArr11);
                    }
                    zzhlw.m7546e(jArr10, jArr11, jArr10);
                    zzhlw.m7547f(jArr10, jArr10);
                    for (int i8 = 1; i8 < 10; i8++) {
                        zzhlw.m7547f(jArr10, jArr10);
                    }
                    zzhlw.m7546e(jArr9, jArr10, jArr9);
                    zzhlw.m7547f(jArr10, jArr9);
                    for (int i9 = 1; i9 < 50; i9++) {
                        zzhlw.m7547f(jArr10, jArr10);
                    }
                    zzhlw.m7546e(jArr10, jArr10, jArr9);
                    zzhlw.m7547f(jArr11, jArr10);
                    for (int i10 = 1; i10 < 100; i10++) {
                        zzhlw.m7547f(jArr11, jArr11);
                    }
                    zzhlw.m7546e(jArr10, jArr11, jArr10);
                    zzhlw.m7547f(jArr10, jArr10);
                    for (int i11 = 1; i11 < 50; i11++) {
                        zzhlw.m7547f(jArr10, jArr10);
                    }
                    zzhlw.m7546e(jArr9, jArr10, jArr9);
                    zzhlw.m7547f(jArr9, jArr9);
                    zzhlw.m7547f(jArr9, jArr9);
                    zzhlw.m7546e(jArr, jArr9, jArr);
                    zzhlw.m7546e(jArr, jArr, jArr8);
                    zzhlw.m7546e(jArr, jArr, jArr4);
                    zzhlw.m7547f(jArr6, jArr);
                    zzhlw.m7546e(jArr6, jArr6, jArr5);
                    zzhlw.m7543b(jArr7, jArr6, jArr4);
                    if (zzhlp.m7518c(jArr7)) {
                        zzhlw.m7542a(jArr7, jArr6, jArr4);
                        if (zzhlp.m7518c(jArr7)) {
                            throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                        }
                        zzhlw.m7546e(jArr, jArr, zzhlr.f18939c);
                    }
                    if (!zzhlp.m7518c(jArr) && ((bArr4[31] & 255) >> 7) != 0) {
                        throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
                    }
                    int i12 = 255;
                    if ((zzhlw.m7549h(jArr)[0] & 1) == ((bArr4[31] & 255) >> 7)) {
                        for (int i13 = 0; i13 < 10; i13++) {
                            jArr[i13] = -jArr[i13];
                        }
                    }
                    zzhlw.m7546e(jArr3, jArr, jArrM7548g);
                    zzhln zzhlnVar = new zzhln(jArr, jArrM7548g, jArr2);
                    zzhll[] zzhllVarArr = new zzhll[8];
                    zzhllVarArr[0] = new zzhll(new zzhlo(zzhlnVar, jArr3));
                    zzhlm zzhlmVar = new zzhlm(new zzhln(), new long[10]);
                    zzhlp.m7521f(zzhlmVar, zzhlnVar);
                    zzhlo zzhloVar = new zzhlo(zzhlmVar);
                    for (int i14 = 1; i14 < 8; i14++) {
                        zzhlp.m7519d(zzhlmVar, zzhloVar, zzhllVarArr[i14 - 1]);
                        zzhllVarArr[i14] = new zzhll(new zzhlo(zzhlmVar));
                    }
                    byte[] bArrM7524i = zzhlp.m7524i(bArrDigest);
                    byte[] bArrM7524i2 = zzhlp.m7524i(bArrCopyOfRange);
                    zzhlm zzhlmVar2 = new zzhlm(0);
                    zzhlo zzhloVar2 = new zzhlo();
                    while (i12 >= 0 && bArrM7524i[i12] == 0 && bArrM7524i2[i12] == 0) {
                        i12--;
                    }
                    while (i12 >= 0) {
                        zzhlp.m7521f(zzhlmVar2, new zzhln(zzhlmVar2));
                        byte b = bArrM7524i[i12];
                        if (b > 0) {
                            zzhlo.m7515a(zzhloVar2, zzhlmVar2);
                            zzhlp.m7519d(zzhlmVar2, zzhloVar2, zzhllVarArr[bArrM7524i[i12] / 2]);
                        } else if (b < 0) {
                            zzhlo.m7515a(zzhloVar2, zzhlmVar2);
                            zzhlp.m7520e(zzhlmVar2, zzhloVar2, zzhllVarArr[(-bArrM7524i[i12]) / 2]);
                        }
                        byte b2 = bArrM7524i2[i12];
                        if (b2 > 0) {
                            zzhlo.m7515a(zzhloVar2, zzhlmVar2);
                            zzhlp.m7519d(zzhlmVar2, zzhloVar2, zzhlr.f18941e[bArrM7524i2[i12] / 2]);
                        } else if (b2 < 0) {
                            zzhlo.m7515a(zzhloVar2, zzhlmVar2);
                            zzhlp.m7520e(zzhlmVar2, zzhloVar2, zzhlr.f18941e[(-bArrM7524i2[i12]) / 2]);
                        }
                        i12--;
                    }
                    byte[] bArrM7514b = new zzhln(zzhlmVar2).m7514b();
                    for (int i15 = 0; i15 < 32; i15++) {
                        if (bArrM7514b[i15] == bArr[i15]) {
                        }
                    }
                    return;
                }
            }
        }
        throw new GeneralSecurityException("Signature check failed.");
    }
}
