package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhjo implements zzhdr {

    /* JADX INFO: renamed from: d */
    public static final byte[] f18852d = zziau.m8039a("7a806c");

    /* JADX INFO: renamed from: e */
    public static final byte[] f18853e = zziau.m8039a("46bb91c3c5");

    /* JADX INFO: renamed from: f */
    public static final byte[] f18854f = zziau.m8039a("36864200e0eaf5284d884a0e77d31646");

    /* JADX INFO: renamed from: g */
    public static final byte[] f18855g = zziau.m8039a("bae8e37fc83441b16034566b");

    /* JADX INFO: renamed from: h */
    public static final byte[] f18856h = zziau.m8039a("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* JADX INFO: renamed from: a */
    public final zzhjn f18857a;

    /* JADX INFO: renamed from: b */
    public final SecretKeySpec f18858b;

    /* JADX INFO: renamed from: c */
    public final byte[] f18859c;

    public zzhjo(byte[] bArr, byte[] bArr2, zzhjn zzhjnVar) throws InvalidAlgorithmParameterException {
        this.f18859c = bArr2;
        zzibi.m8045a(bArr.length);
        this.f18858b = new SecretKeySpec(bArr, "AES");
        this.f18857a = zzhjnVar;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m7480b(Cipher cipher) {
        try {
            byte[] bArr = f18855g;
            cipher.init(2, new SecretKeySpec(f18854f, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(f18853e);
            byte[] bArr2 = f18856h;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), f18852d);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    /* JADX INFO: renamed from: a */
    public final byte[] mo7400a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f18859c;
        int length2 = bArr3.length;
        if (length < length2 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzhok.m7598c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipherZza = this.f18857a.zza();
        cipherZza.init(2, this.f18858b, new GCMParameterSpec(128, bArr, length2, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipherZza.updateAAD(bArr2);
        }
        return cipherZza.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}
