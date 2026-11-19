package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhju implements zzhdr {

    /* JADX INFO: renamed from: d */
    public static final byte[] f18868d = zziau.m8039a("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");

    /* JADX INFO: renamed from: e */
    public static final byte[] f18869e = zziau.m8039a("070000004041424344454647");

    /* JADX INFO: renamed from: f */
    public static final byte[] f18870f = zziau.m8039a("a0784d7a4716f3feb4f64e7f4b39bf04");

    /* JADX INFO: renamed from: a */
    public final SecretKeySpec f18871a;

    /* JADX INFO: renamed from: b */
    public final byte[] f18872b;

    /* JADX INFO: renamed from: c */
    public final Provider f18873c;

    public zzhju(byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhle.m7504a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f18871a = new SecretKeySpec(bArr, "ChaCha20");
        this.f18872b = bArr2;
        this.f18873c = provider;
    }

    /* JADX INFO: renamed from: b */
    public static Cipher m7483b() throws GeneralSecurityException {
        Cipher cipher = (Cipher) zziak.f19572b.f19578a.zza("ChaCha20-Poly1305");
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f18869e);
            byte[] bArr = f18868d;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f18870f;
            if (cipher.doFinal(bArr2).length == 0) {
                cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
                if (cipher.doFinal(bArr2).length == 0) {
                    return cipher;
                }
            }
        } catch (GeneralSecurityException unused) {
        }
        throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    /* JADX INFO: renamed from: a */
    public final byte[] mo7400a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f18872b;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzhok.m7598c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, length2, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Cipher cipher = Cipher.getInstance("ChaCha20-Poly1305", this.f18873c);
        cipher.init(2, this.f18871a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
