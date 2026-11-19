package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class zzibb implements zzhev {

    /* JADX INFO: renamed from: a */
    public final RSAPublicKey f19596a;

    /* JADX INFO: renamed from: b */
    public final zziat f19597b;

    /* JADX INFO: renamed from: c */
    public final byte[] f19598c;

    /* JADX INFO: renamed from: d */
    public final byte[] f19599d;

    public /* synthetic */ zzibb(RSAPublicKey rSAPublicKey, zziat zziatVar, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (zzhlf.m7505a()) {
            throw new GeneralSecurityException("Conscrypt is not available, and we cannot use Java Implementation of RSA-PKCS1.5 in FIPS-mode.");
        }
        zzibi.m8046b(zziatVar);
        zzibi.m8047c(rSAPublicKey.getModulus().bitLength());
        zzibi.m8048d(rSAPublicKey.getPublicExponent());
        this.f19596a = rSAPublicKey;
        this.f19597b = zziatVar;
        this.f19598c = bArr;
        this.f19599d = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzhev
    /* JADX INFO: renamed from: a */
    public final void mo7422a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f19598c;
        int length = bArr3.length;
        if (length == 0) {
            m8041b(bArr, bArr2);
        } else {
            if (!zzhok.m7598c(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            m8041b(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8041b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrM8039a;
        int i2;
        RSAPublicKey rSAPublicKey = this.f19596a;
        BigInteger publicExponent = rSAPublicKey.getPublicExponent();
        BigInteger modulus = rSAPublicKey.getModulus();
        int iBitLength = (modulus.bitLength() + 7) / 8;
        if (iBitLength != bArr.length) {
            throw new GeneralSecurityException("invalid signature's length");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        if (bigInteger.compareTo(modulus) >= 0) {
            throw new GeneralSecurityException("signature out of range");
        }
        byte[] bArrM7508b = zzhlh.m7508b(bigInteger.modPow(publicExponent, modulus), iBitLength);
        zziat zziatVar = this.f19597b;
        zzibi.m8046b(zziatVar);
        MessageDigest messageDigest = (MessageDigest) zziak.f19575e.f19578a.zza(zzibh.m8044a(zziatVar));
        messageDigest.update(bArr2);
        byte[] bArr3 = this.f19599d;
        if (bArr3.length != 0) {
            messageDigest.update(bArr3);
        }
        byte[] bArrDigest = messageDigest.digest();
        int iOrdinal = zziatVar.ordinal();
        int i3 = 2;
        if (iOrdinal == 2) {
            bArrM8039a = zziau.m8039a("3031300d060960864801650304020105000420");
        } else if (iOrdinal == 3) {
            bArrM8039a = zziau.m8039a("3041300d060960864801650304020205000430");
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("Unsupported hash ".concat(zziatVar.toString()));
            }
            bArrM8039a = zziau.m8039a("3051300d060960864801650304020305000440");
        }
        int length = bArrM8039a.length + bArrDigest.length;
        if (iBitLength < length + 11) {
            throw new GeneralSecurityException("intended encoded message length too short");
        }
        byte[] bArr4 = new byte[iBitLength];
        bArr4[0] = 0;
        bArr4[1] = 1;
        int i4 = 0;
        while (true) {
            i2 = i3 + 1;
            if (i4 >= (iBitLength - length) - 3) {
                break;
            }
            bArr4[i3] = -1;
            i4++;
            i3 = i2;
        }
        bArr4[i3] = 0;
        int length2 = bArrM8039a.length;
        System.arraycopy(bArrM8039a, 0, bArr4, i2, length2);
        System.arraycopy(bArrDigest, 0, bArr4, i2 + length2, bArrDigest.length);
        if (!MessageDigest.isEqual(bArrM7508b, bArr4)) {
            throw new GeneralSecurityException("invalid signature");
        }
    }
}
