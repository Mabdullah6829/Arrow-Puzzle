package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhzs implements zzhdr {

    /* JADX INFO: renamed from: a */
    public final SecretKeySpec f19538a;

    /* JADX INFO: renamed from: b */
    public final byte[] f19539b;

    public zzhzs(byte[] bArr, zzibk zzibkVar) throws GeneralSecurityException {
        if (!zzhle.m7504a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        ThreadLocal threadLocal = zzhjh.f18843a;
        zzibi.m8045a(bArr.length);
        this.f19538a = new SecretKeySpec(bArr, "AES");
        this.f19539b = zzibkVar.m8051b();
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    /* JADX INFO: renamed from: a */
    public final byte[] mo7400a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f19539b;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzhok.m7598c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        ThreadLocal threadLocal = zzhjh.f18843a;
        Objects.equals(System.getProperty("java.vendor"), "The Android Project");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, length2, 12);
        Cipher cipher = (Cipher) zzhjh.f18843a.get();
        cipher.init(2, this.f19538a, gCMParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
