package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
final class zzhlr {

    /* JADX INFO: renamed from: a */
    public static final long[] f18937a;

    /* JADX INFO: renamed from: b */
    public static final long[] f18938b;

    /* JADX INFO: renamed from: c */
    public static final long[] f18939c;

    /* JADX INFO: renamed from: d */
    public static final zzhlk[][] f18940d;

    /* JADX INFO: renamed from: e */
    public static final zzhlk[] f18941e;

    /* JADX INFO: renamed from: f */
    public static final BigInteger f18942f;

    /* JADX INFO: renamed from: g */
    public static final BigInteger f18943g;

    /* JADX INFO: renamed from: h */
    public static final BigInteger f18944h;

    static {
        BigInteger bigIntegerSubtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f18942f = bigIntegerSubtract;
        BigInteger bigIntegerMod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        f18943g = bigIntegerMod;
        BigInteger bigIntegerMod2 = BigInteger.valueOf(2L).multiply(bigIntegerMod).mod(bigIntegerSubtract);
        f18944h = bigIntegerMod2;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger bigIntegerModPow = bigIntegerValueOf.modPow(bigIntegerSubtract.subtract(bigInteger).divide(BigInteger.valueOf(4L)), bigIntegerSubtract);
        zzhlq zzhlqVar = new zzhlq();
        BigInteger bigIntegerMod3 = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(bigIntegerSubtract)).mod(bigIntegerSubtract);
        zzhlqVar.f18936b = bigIntegerMod3;
        BigInteger bigIntegerMultiply = bigIntegerMod3.pow(2).subtract(bigInteger).multiply(bigIntegerMod.multiply(bigIntegerMod3.pow(2)).add(bigInteger).modInverse(bigIntegerSubtract));
        BigInteger bigIntegerModPow2 = bigIntegerMultiply.modPow(bigIntegerSubtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigIntegerSubtract);
        if (!bigIntegerModPow2.pow(2).subtract(bigIntegerMultiply).mod(bigIntegerSubtract).equals(BigInteger.ZERO)) {
            bigIntegerModPow2 = bigIntegerModPow2.multiply(bigIntegerModPow).mod(bigIntegerSubtract);
        }
        if (bigIntegerModPow2.testBit(0)) {
            bigIntegerModPow2 = bigIntegerSubtract.subtract(bigIntegerModPow2);
        }
        zzhlqVar.f18935a = bigIntegerModPow2;
        f18937a = zzhlw.m7548g(m7528b(bigIntegerMod));
        f18938b = zzhlw.m7548g(m7528b(bigIntegerMod2));
        f18939c = zzhlw.m7548g(m7528b(bigIntegerModPow));
        f18940d = (zzhlk[][]) Array.newInstance((Class<?>) zzhlk.class, 32, 8);
        zzhlq zzhlqVarM7527a = zzhlqVar;
        for (int i2 = 0; i2 < 32; i2++) {
            zzhlq zzhlqVarM7527a2 = zzhlqVarM7527a;
            for (int i3 = 0; i3 < 8; i3++) {
                f18940d[i2][i3] = m7529c(zzhlqVarM7527a2);
                zzhlqVarM7527a2 = m7527a(zzhlqVarM7527a2, zzhlqVarM7527a);
            }
            for (int i4 = 0; i4 < 8; i4++) {
                zzhlqVarM7527a = m7527a(zzhlqVarM7527a, zzhlqVarM7527a);
            }
        }
        zzhlq zzhlqVarM7527a3 = m7527a(zzhlqVar, zzhlqVar);
        f18941e = new zzhlk[8];
        for (int i5 = 0; i5 < 8; i5++) {
            f18941e[i5] = m7529c(zzhlqVar);
            zzhlqVar = m7527a(zzhlqVar, zzhlqVarM7527a3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static zzhlq m7527a(zzhlq zzhlqVar, zzhlq zzhlqVar2) {
        zzhlq zzhlqVar3 = new zzhlq();
        BigInteger bigIntegerMultiply = f18943g.multiply(zzhlqVar.f18935a.multiply(zzhlqVar2.f18935a).multiply(zzhlqVar.f18936b).multiply(zzhlqVar2.f18936b));
        BigInteger bigInteger = f18942f;
        BigInteger bigIntegerMod = bigIntegerMultiply.mod(bigInteger);
        BigInteger bigIntegerAdd = zzhlqVar.f18935a.multiply(zzhlqVar2.f18936b).add(zzhlqVar2.f18935a.multiply(zzhlqVar.f18936b));
        BigInteger bigInteger2 = BigInteger.ONE;
        zzhlqVar3.f18935a = bigIntegerAdd.multiply(bigInteger2.add(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        zzhlqVar3.f18936b = zzhlqVar.f18936b.multiply(zzhlqVar2.f18936b).add(zzhlqVar.f18935a.multiply(zzhlqVar2.f18935a)).multiply(bigInteger2.subtract(bigIntegerMod).modInverse(bigInteger)).mod(bigInteger);
        return zzhlqVar3;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m7528b(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i2 = 0; i2 < 16; i2++) {
            byte b = bArr[i2];
            int i3 = 31 - i2;
            bArr[i2] = bArr[i3];
            bArr[i3] = b;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: c */
    public static zzhlk m7529c(zzhlq zzhlqVar) {
        BigInteger bigIntegerAdd = zzhlqVar.f18936b.add(zzhlqVar.f18935a);
        BigInteger bigInteger = f18942f;
        return new zzhlk(zzhlw.m7548g(m7528b(bigIntegerAdd.mod(bigInteger))), zzhlw.m7548g(m7528b(zzhlqVar.f18936b.subtract(zzhlqVar.f18935a).mod(bigInteger))), zzhlw.m7548g(m7528b(f18944h.multiply(zzhlqVar.f18935a).multiply(zzhlqVar.f18936b).mod(bigInteger))));
    }
}
