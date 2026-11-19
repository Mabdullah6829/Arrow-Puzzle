package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzibf implements zzhev {

    /* JADX INFO: renamed from: a */
    public final RSAPublicKey f19603a;

    /* JADX INFO: renamed from: b */
    public final zziat f19604b;

    /* JADX INFO: renamed from: c */
    public final zziat f19605c;

    /* JADX INFO: renamed from: d */
    public final int f19606d;

    /* JADX INFO: renamed from: e */
    public final byte[] f19607e;

    /* JADX INFO: renamed from: f */
    public final byte[] f19608f;

    public /* synthetic */ zzibf(RSAPublicKey rSAPublicKey, zziat zziatVar, zziat zziatVar2, int i2, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (zzhlf.m7505a()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzibi.m8046b(zziatVar);
        if (!zziatVar.equals(zziatVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        zzibi.m8047c(rSAPublicKey.getModulus().bitLength());
        zzibi.m8048d(rSAPublicKey.getPublicExponent());
        this.f19603a = rSAPublicKey;
        this.f19604b = zziatVar;
        this.f19605c = zziatVar2;
        this.f19606d = i2;
        this.f19607e = bArr;
        this.f19608f = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzhev
    /* JADX INFO: renamed from: a */
    public final void mo7422a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f19607e;
        int length = bArr3.length;
        if (length == 0) {
            m8043b(bArr, bArr2);
        } else {
            if (!zzhok.m7598c(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            m8043b(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8043b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        RSAPublicKey rSAPublicKey = this.f19603a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = modulus.bitLength() + 7;
        int iBitLength2 = modulus.bitLength() + 6;
        if (iBitLength / 8 != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] bArrM7508b = zzhlh.m7508b(bigInteger.modPow(publicExponent, modulus), iBitLength2 / 8);
        int iBitLength3 = modulus.bitLength() - 1;
        zziat zziatVar = this.f19604b;
        zzibi.m8046b(zziatVar);
        zziak zziakVar = zziak.f19575e;
        MessageDigest messageDigest = (MessageDigest) zziakVar.f19578a.zza(zzibh.m8044a(zziatVar));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f19608f;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int digestLength = messageDigest.getDigestLength();
        int length = bArrM7508b.length;
        int i2 = this.f19606d;
        if (length < digestLength + i2 + 2) {
            throw new GeneralSecurityException("inconsistent");
        }
        if (bArrM7508b[length - 1] != -68) {
            throw new GeneralSecurityException("inconsistent");
        }
        int i3 = length - digestLength;
        int i4 = i3 - 1;
        byte[] bArrCopyOf = Arrays.copyOf(bArrM7508b, i4);
        int length2 = bArrCopyOf.length;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrM7508b, length2, length2 + digestLength);
        int i5 = 0;
        while (true) {
            long j2 = (((long) length) * 8) - ((long) iBitLength3);
            if (i5 < j2) {
                if (((bArrCopyOf[i5 / 8] >> (7 - (i5 % 8))) & 1) != 0) {
                    throw new GeneralSecurityException("inconsistent");
                }
                i5++;
            } else {
                MessageDigest messageDigest2 = (MessageDigest) zziakVar.f19578a.zza(zzibh.m8044a(this.f19605c));
                int digestLength2 = messageDigest2.getDigestLength();
                byte[] bArr4 = new byte[i4];
                int i6 = 0;
                int i7 = 0;
                while (i6 <= (i3 - 2) / digestLength2) {
                    messageDigest2.reset();
                    messageDigest2.update(bArrCopyOfRange);
                    int i8 = i2;
                    messageDigest2.update(zzhlh.m7508b(BigInteger.valueOf(i6), 4));
                    byte[] bArrDigest2 = messageDigest2.digest();
                    int length3 = bArrDigest2.length;
                    System.arraycopy(bArrDigest2, 0, bArr4, i7, Math.min(length3, i4 - i7));
                    i7 += length3;
                    i6++;
                    i2 = i8;
                    messageDigest2 = messageDigest2;
                }
                int i9 = i2;
                byte[] bArr5 = new byte[i4];
                for (int i10 = 0; i10 < i4; i10++) {
                    bArr5[i10] = (byte) (bArr4[i10] ^ bArrCopyOf[i10]);
                }
                for (int i11 = 0; i11 <= j2; i11++) {
                    int i12 = i11 / 8;
                    bArr5[i12] = (byte) ((~(1 << (7 - (i11 % 8)))) & bArr5[i12]);
                }
                int i13 = 0;
                while (true) {
                    int i14 = (i3 - i9) - 2;
                    if (i13 >= i14) {
                        if (bArr5[i14] != 1) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr5, i4 - i9, i4);
                        int i15 = digestLength + 8;
                        byte[] bArr6 = new byte[i15 + i9];
                        System.arraycopy(bArrDigest, 0, bArr6, 8, bArrDigest.length);
                        System.arraycopy(bArrCopyOfRange2, 0, bArr6, i15, bArrCopyOfRange2.length);
                        if (!MessageDigest.isEqual(messageDigest.digest(bArr6), bArrCopyOfRange)) {
                            throw new GeneralSecurityException("inconsistent");
                        }
                        return;
                    }
                    if (bArr5[i13] != 0) {
                        throw new GeneralSecurityException("inconsistent");
                    }
                    i13++;
                }
            }
        }
    }
}
