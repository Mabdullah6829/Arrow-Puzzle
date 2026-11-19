package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhkm implements zzhdr {

    /* JADX INFO: renamed from: a */
    public final byte[] f18892a;

    /* JADX INFO: renamed from: b */
    public final int f18893b;

    /* JADX INFO: renamed from: c */
    public final zzhqo f18894c;

    public zzhkm(byte[] bArr, zzibk zzibkVar, int i2) throws InvalidAlgorithmParameterException {
        zzhqn zzhqnVarM7616b = zzhqn.m7616b(bArr.length);
        zzhey zzheyVar = zzhey.f18574a;
        this.f18894c = zziax.m8040b(zzhqm.m7615c(zzhqnVarM7616b, new zzibm(zzibk.m8050a(bArr))));
        this.f18892a = zzibkVar.m8051b();
        this.f18893b = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    /* JADX INFO: renamed from: a */
    public final byte[] mo7400a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f18892a;
        int length2 = bArr3.length;
        int i2 = this.f18893b + length2;
        int i3 = i2 + 28;
        if (length < i3) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzhok.m7598c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i2);
        byte[] bArr4 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr5 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int length3 = bArrCopyOfRange.length;
        if (length3 > 12 || length3 < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArrCopyOfRange, 0, bArr4, 4, length3);
        System.arraycopy(bArrCopyOfRange, 0, bArr5, 4, length3);
        byte[] bArr6 = new byte[32];
        zzhqo zzhqoVar = this.f18894c;
        System.arraycopy(zzhqoVar.mo7617a(16, bArr4), 0, bArr6, 0, 16);
        System.arraycopy(zzhqoVar.mo7617a(16, bArr5), 0, bArr6, 16, 16);
        if (!zzhle.m7504a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        ThreadLocal threadLocal = zzhjh.f18843a;
        zzibi.m8045a(32);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr6, "AES");
        int i4 = i2 + 12;
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i2, i4);
        if (bArrCopyOfRange2.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (length < i3) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Objects.equals(System.getProperty("java.vendor"), "The Android Project");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArrCopyOfRange2, 0, 12);
        Cipher cipher = (Cipher) zzhjh.f18843a.get();
        cipher.init(2, secretKeySpec, gCMParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, i4, length - i4);
    }
}
