package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhqs implements zzhqo {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f19156d = new zzhqr();

    /* JADX INFO: renamed from: a */
    public final SecretKeySpec f19157a;

    /* JADX INFO: renamed from: b */
    public final byte[] f19158b;

    /* JADX INFO: renamed from: c */
    public final byte[] f19159c;

    public zzhqs(byte[] bArr) throws GeneralSecurityException {
        zzibi.m8045a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f19157a = secretKeySpec;
        if (!zzhle.m7504a(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f19156d.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrM7613a = zzhpx.m7613a(cipher.doFinal(new byte[16]));
        this.f19158b = bArrM7613a;
        this.f19159c = zzhpx.m7613a(bArrM7613a);
    }

    @Override // com.google.android.gms.internal.ads.zzhqo
    /* JADX INFO: renamed from: a */
    public final byte[] mo7617a(int i2, byte[] bArr) throws GeneralSecurityException {
        byte[] bArrM8024b;
        if (i2 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!zzhle.m7504a(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f19156d.get();
        cipher.init(1, this.f19157a);
        int length = bArr.length;
        int i3 = length != 0 ? 1 + ((length - 1) >> 4) : 1;
        int i4 = i3 - 1;
        int i5 = i4 * 16;
        if (i3 * 16 == length) {
            bArrM8024b = zzhzw.m8024b(bArr, i5, this.f19158b);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i5, length);
            int length2 = bArrCopyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[length2] = -128;
            if (bArrCopyOf.length != 16) {
                throw new IllegalArgumentException("The lengths of x and y should match.");
            }
            bArrM8024b = zzhzw.m8024b(bArrCopyOf, 0, this.f19159c);
        }
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = i6 * 16;
            for (int i8 = 0; i8 < 16; i8++) {
                bArr3[i8] = (byte) (bArr2[i8] ^ bArr[i8 + i7]);
            }
            if (cipher.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        for (int i9 = 0; i9 < 16; i9++) {
            bArr3[i9] = (byte) (bArr2[i9] ^ bArrM8024b[i9]);
        }
        if (cipher.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return i2 == 16 ? bArr2 : Arrays.copyOf(bArr2, i2);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
