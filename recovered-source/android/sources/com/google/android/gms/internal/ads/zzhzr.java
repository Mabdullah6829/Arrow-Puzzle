package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhzr implements zzhdr {

    /* JADX INFO: renamed from: e */
    public static final ThreadLocal f19533e = new zzhzq();

    /* JADX INFO: renamed from: a */
    public final byte[] f19534a;

    /* JADX INFO: renamed from: b */
    public final zzhqo f19535b;

    /* JADX INFO: renamed from: c */
    public final SecretKeySpec f19536c;

    /* JADX INFO: renamed from: d */
    public final int f19537d;

    public zzhzr(byte[] bArr, int i2, byte[] bArr2) throws GeneralSecurityException {
        if (!zzhle.m7504a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i2 != 12 && i2 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f19537d = i2;
        int length = bArr.length;
        zzibi.m8045a(length);
        this.f19536c = new SecretKeySpec(bArr, "AES");
        zzhqn zzhqnVarM7616b = zzhqn.m7616b(length);
        zzhey zzheyVar = zzhey.f18574a;
        this.f19535b = zziax.m8040b(zzhqm.m7615c(zzhqnVarM7616b, new zzibm(zzibk.m8050a(bArr))));
        this.f19534a = bArr2;
    }

    /* JADX INFO: renamed from: b */
    public static zzhzr m8020b(zzhfv zzhfvVar) throws GeneralSecurityException {
        if (!zzhle.m7504a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        zzhfvVar.getClass();
        zzibm zzibmVar = zzhfvVar.f18631b;
        zzhey zzheyVar = zzhey.f18574a;
        return new zzhzr(zzibmVar.f19616a.m8051b(), zzhfvVar.f18630a.f18648b, zzhfvVar.f18632c.m8051b());
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    /* JADX INFO: renamed from: a */
    public final byte[] mo7400a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f19534a;
        int length2 = bArr3.length;
        int i2 = this.f19537d;
        int i3 = ((length - length2) - i2) - 16;
        if (i3 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzhok.m7598c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrM8021c = m8021c(0, bArr, length2, i2);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrM8021c2 = m8021c(1, bArr2, 0, bArr2.length);
        byte[] bArrM8021c3 = m8021c(2, bArr, length2 + i2, i3);
        int i4 = length - 16;
        byte b = 0;
        for (int i5 = 0; i5 < 16; i5++) {
            b = (byte) (b | (((bArr[i4 + i5] ^ bArrM8021c2[i5]) ^ bArrM8021c[i5]) ^ bArrM8021c3[i5]));
        }
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher = (Cipher) f19533e.get();
        cipher.init(1, this.f19536c, new IvParameterSpec(bArrM8021c));
        return cipher.doFinal(bArr, bArr3.length + i2, i3);
    }

    /* JADX INFO: renamed from: c */
    public final byte[] m8021c(int i2, byte[] bArr, int i3, int i4) {
        byte[] bArr2 = new byte[i4 + 16];
        bArr2[15] = (byte) i2;
        System.arraycopy(bArr, i3, bArr2, 16, i4);
        return this.f19535b.mo7617a(16, bArr2);
    }
}
