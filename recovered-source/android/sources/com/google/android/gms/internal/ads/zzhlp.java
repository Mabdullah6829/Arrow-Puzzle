package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhlp {

    /* JADX INFO: renamed from: a */
    public static final zzhlk f18932a = new zzhlk(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* JADX INFO: renamed from: b */
    public static final zzhlm f18933b = new zzhlm(new zzhln(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* JADX INFO: renamed from: c */
    public static final byte[] f18934c = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    /* JADX INFO: renamed from: a */
    public static byte[] m7516a(byte[] bArr) {
        int i2;
        byte[] bArr2 = new byte[64];
        int i3 = 0;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = i3 + i3;
            bArr2[i4] = (byte) (bArr[i3] & 15);
            bArr2[i4 + 1] = (byte) ((bArr[i3] & 255) >> 4);
            i3++;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < 63) {
            byte b = (byte) (bArr2[i5] + i6);
            bArr2[i5] = b;
            int i7 = (b + 8) >> 4;
            bArr2[i5] = (byte) (b - (i7 << 4));
            i5++;
            i6 = i7;
        }
        bArr2[63] = (byte) (bArr2[63] + i6);
        zzhlm zzhlmVar = new zzhlm(0);
        zzhlo zzhloVar = new zzhlo();
        for (i2 = 1; i2 < 64; i2 += 2) {
            zzhlk zzhlkVar = new zzhlk(0);
            m7523h(zzhlkVar, i2 / 2, bArr2[i2]);
            zzhlo.m7515a(zzhloVar, zzhlmVar);
            m7519d(zzhlmVar, zzhloVar, zzhlkVar);
        }
        zzhln zzhlnVar = new zzhln();
        zzhln.m7513a(zzhlmVar, zzhlnVar);
        m7521f(zzhlmVar, zzhlnVar);
        zzhln.m7513a(zzhlmVar, zzhlnVar);
        m7521f(zzhlmVar, zzhlnVar);
        zzhln.m7513a(zzhlmVar, zzhlnVar);
        m7521f(zzhlmVar, zzhlnVar);
        zzhln.m7513a(zzhlmVar, zzhlnVar);
        m7521f(zzhlmVar, zzhlnVar);
        for (int i8 = 0; i8 < 64; i8 += 2) {
            zzhlk zzhlkVar2 = new zzhlk(0);
            m7523h(zzhlkVar2, i8 / 2, bArr2[i8]);
            zzhlo.m7515a(zzhloVar, zzhlmVar);
            m7519d(zzhlmVar, zzhloVar, zzhlkVar2);
        }
        zzhln zzhlnVar2 = new zzhln(zzhlmVar);
        long[] jArr = new long[10];
        zzhlw.m7547f(jArr, zzhlnVar2.f18927a);
        long[] jArr2 = new long[10];
        zzhlw.m7547f(jArr2, zzhlnVar2.f18928b);
        long[] jArr3 = new long[10];
        zzhlw.m7547f(jArr3, zzhlnVar2.f18929c);
        long[] jArr4 = new long[10];
        zzhlw.m7547f(jArr4, jArr3);
        long[] jArr5 = new long[10];
        zzhlw.m7543b(jArr5, jArr2, jArr);
        zzhlw.m7546e(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        zzhlw.m7546e(jArr6, jArr, jArr2);
        zzhlw.m7546e(jArr6, jArr6, zzhlr.f18937a);
        zzhlw.m7542a(jArr6, jArr6, jArr4);
        zzhlw.m7544c(jArr6, jArr6);
        if (MessageDigest.isEqual(zzhlw.m7549h(jArr5), zzhlw.m7549h(jArr6))) {
            return zzhlnVar2.m7514b();
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m7517b(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) zziak.f19575e.f19578a.zza("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        int i2 = bArrDigest[31] & 127;
        bArrDigest[31] = (byte) i2;
        bArrDigest[31] = (byte) (i2 | 64);
        return bArrDigest;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ boolean m7518c(long[] jArr) {
        long[] jArr2 = new long[11];
        System.arraycopy(jArr, 0, jArr2, 0, 10);
        zzhlw.m7545d(jArr2);
        byte[] bArrM7549h = zzhlw.m7549h(jArr2);
        for (int i2 = 0; i2 < 32; i2++) {
            if (bArrM7549h[i2] != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static void m7519d(zzhlm zzhlmVar, zzhlo zzhloVar, zzhlk zzhlkVar) {
        zzhln zzhlnVar = zzhloVar.f18930a;
        zzhln zzhlnVar2 = zzhlmVar.f18925a;
        long[] jArr = new long[10];
        long[] jArr2 = zzhlnVar2.f18927a;
        long[] jArr3 = zzhlnVar.f18928b;
        long[] jArr4 = zzhlnVar.f18927a;
        zzhlw.m7542a(jArr2, jArr3, jArr4);
        long[] jArr5 = zzhlnVar2.f18928b;
        zzhlw.m7543b(jArr5, jArr3, jArr4);
        zzhlw.m7546e(jArr5, jArr5, zzhlkVar.f18922b);
        long[] jArr6 = zzhlkVar.f18921a;
        long[] jArr7 = zzhlnVar2.f18929c;
        zzhlw.m7546e(jArr7, jArr2, jArr6);
        long[] jArr8 = zzhlmVar.f18926b;
        zzhlw.m7546e(jArr8, zzhloVar.f18931b, zzhlkVar.f18923c);
        zzhlkVar.mo7511a(jArr2, zzhlnVar.f18929c);
        zzhlw.m7542a(jArr, jArr2, jArr2);
        zzhlw.m7543b(jArr2, jArr7, jArr5);
        zzhlw.m7542a(jArr5, jArr7, jArr5);
        zzhlw.m7542a(jArr7, jArr, jArr8);
        zzhlw.m7543b(jArr8, jArr, jArr8);
    }

    /* JADX INFO: renamed from: e */
    public static void m7520e(zzhlm zzhlmVar, zzhlo zzhloVar, zzhlk zzhlkVar) {
        zzhln zzhlnVar = zzhloVar.f18930a;
        zzhln zzhlnVar2 = zzhlmVar.f18925a;
        long[] jArr = new long[10];
        long[] jArr2 = zzhlnVar2.f18927a;
        long[] jArr3 = zzhlnVar.f18928b;
        long[] jArr4 = zzhlnVar.f18927a;
        zzhlw.m7542a(jArr2, jArr3, jArr4);
        long[] jArr5 = zzhlnVar2.f18928b;
        zzhlw.m7543b(jArr5, jArr3, jArr4);
        zzhlw.m7546e(jArr5, jArr5, zzhlkVar.f18921a);
        long[] jArr6 = zzhlkVar.f18922b;
        long[] jArr7 = zzhlnVar2.f18929c;
        zzhlw.m7546e(jArr7, jArr2, jArr6);
        long[] jArr8 = zzhlmVar.f18926b;
        zzhlw.m7546e(jArr8, zzhloVar.f18931b, zzhlkVar.f18923c);
        zzhlkVar.mo7511a(jArr2, zzhlnVar.f18929c);
        zzhlw.m7542a(jArr, jArr2, jArr2);
        zzhlw.m7543b(jArr2, jArr7, jArr5);
        zzhlw.m7542a(jArr5, jArr7, jArr5);
        zzhlw.m7543b(jArr7, jArr, jArr8);
        zzhlw.m7542a(jArr8, jArr, jArr8);
    }

    /* JADX INFO: renamed from: f */
    public static void m7521f(zzhlm zzhlmVar, zzhln zzhlnVar) {
        zzhln zzhlnVar2 = zzhlmVar.f18925a;
        long[] jArr = zzhlnVar2.f18927a;
        long[] jArr2 = zzhlnVar.f18927a;
        long[] jArr3 = new long[10];
        zzhlw.m7547f(jArr, jArr2);
        long[] jArr4 = zzhlnVar2.f18929c;
        long[] jArr5 = zzhlnVar.f18928b;
        zzhlw.m7547f(jArr4, jArr5);
        long[] jArr6 = zzhlmVar.f18926b;
        zzhlw.m7547f(jArr6, zzhlnVar.f18929c);
        zzhlw.m7542a(jArr6, jArr6, jArr6);
        long[] jArr7 = zzhlnVar2.f18928b;
        zzhlw.m7542a(jArr7, jArr2, jArr5);
        zzhlw.m7547f(jArr3, jArr7);
        zzhlw.m7542a(jArr7, jArr4, jArr);
        zzhlw.m7543b(jArr4, jArr4, jArr);
        zzhlw.m7543b(jArr, jArr3, jArr7);
        zzhlw.m7543b(jArr6, jArr6, jArr4);
    }

    /* JADX INFO: renamed from: g */
    public static int m7522g(int i2, int i3) {
        int i4 = (~(i2 ^ i3)) & 255;
        int i5 = i4 & (i4 << 4);
        int i6 = i5 & (i5 << 2);
        return (i6 & (i6 + i6)) >> 7;
    }

    /* JADX INFO: renamed from: h */
    public static void m7523h(zzhlk zzhlkVar, int i2, byte b) {
        zzhlk[][] zzhlkVarArr = zzhlr.f18940d;
        int i3 = (b & 255) >> 7;
        int i4 = (-i3) & b;
        int i5 = b - (i4 + i4);
        zzhlkVar.m7512b(zzhlkVarArr[i2][0], m7522g(i5, 1));
        zzhlkVar.m7512b(zzhlkVarArr[i2][1], m7522g(i5, 2));
        zzhlkVar.m7512b(zzhlkVarArr[i2][2], m7522g(i5, 3));
        zzhlkVar.m7512b(zzhlkVarArr[i2][3], m7522g(i5, 4));
        zzhlkVar.m7512b(zzhlkVarArr[i2][4], m7522g(i5, 5));
        zzhlkVar.m7512b(zzhlkVarArr[i2][5], m7522g(i5, 6));
        zzhlkVar.m7512b(zzhlkVarArr[i2][6], m7522g(i5, 7));
        zzhlkVar.m7512b(zzhlkVarArr[i2][7], m7522g(i5, 8));
        long[] jArr = zzhlkVar.f18923c;
        long[] jArr2 = zzhlkVar.f18921a;
        long[] jArrCopyOf = Arrays.copyOf(zzhlkVar.f18922b, 10);
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
        long[] jArrCopyOf3 = Arrays.copyOf(jArr, 10);
        for (int i6 = 0; i6 < jArrCopyOf3.length; i6++) {
            jArrCopyOf3[i6] = -jArrCopyOf3[i6];
        }
        zzhlkVar.m7512b(new zzhlk(jArrCopyOf, jArrCopyOf2, jArrCopyOf3), i3);
    }

    /* JADX INFO: renamed from: i */
    public static byte[] m7524i(byte[] bArr) {
        int i2;
        byte[] bArr2 = new byte[256];
        for (int i3 = 0; i3 < 256; i3++) {
            bArr2[i3] = (byte) (1 & ((bArr[i3 >> 3] & 255) >> (i3 & 7)));
        }
        for (int i4 = 0; i4 < 256; i4++) {
            if (bArr2[i4] != 0) {
                for (int i5 = 1; i5 <= 6 && (i2 = i4 + i5) < 256; i5++) {
                    byte b = bArr2[i2];
                    if (b != 0) {
                        byte b2 = bArr2[i4];
                        int i6 = b << i5;
                        int i7 = b2 + i6;
                        if (i7 > 15) {
                            int i8 = b2 - i6;
                            if (i8 < -15) {
                                break;
                            }
                            bArr2[i4] = (byte) i8;
                            while (i2 < 256) {
                                if (bArr2[i2] == 0) {
                                    bArr2[i2] = 1;
                                    break;
                                }
                                bArr2[i2] = 0;
                                i2++;
                            }
                        } else {
                            bArr2[i4] = (byte) i7;
                            bArr2[i2] = 0;
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: j */
    public static long m7525j(int i2, byte[] bArr) {
        return (((long) (bArr[i2 + 2] & 255)) << 16) | (bArr[i2] & 255) | (((long) (bArr[i2 + 1] & 255)) << 8);
    }

    /* JADX INFO: renamed from: k */
    public static long m7526k(int i2, byte[] bArr) {
        return (((long) (bArr[i2 + 3] & 255)) << 24) | m7525j(i2, bArr);
    }
}
