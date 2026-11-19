package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zziaf implements zzhdr {

    /* JADX INFO: renamed from: a */
    public final zzhzp f19565a;

    /* JADX INFO: renamed from: b */
    public final zziba f19566b;

    /* JADX INFO: renamed from: c */
    public final int f19567c;

    /* JADX INFO: renamed from: d */
    public final byte[] f19568d;

    public zziaf(zzhzp zzhzpVar, zziba zzibaVar, int i2, byte[] bArr) {
        this.f19565a = zzhzpVar;
        this.f19566b = zzibaVar;
        this.f19567c = i2;
        this.f19568d = bArr;
    }

    /* JADX INFO: renamed from: b */
    public static zziaf m8037b(zzhfl zzhflVar) {
        zzibm zzibmVar = zzhflVar.f18593b;
        zzhey zzheyVar = zzhey.f18574a;
        byte[] bArrM8051b = zzibmVar.f19616a.m8051b();
        zzhft zzhftVar = zzhflVar.f18592a;
        zzhzp zzhzpVar = new zzhzp(bArrM8051b, zzhftVar.f18623c);
        String strValueOf = String.valueOf(zzhftVar.f18626f);
        zziaz zziazVar = new zziaz("HMAC".concat(strValueOf), new SecretKeySpec(zzhflVar.f18594c.f19616a.m8051b(), "HMAC"));
        int i2 = zzhftVar.f18624d;
        return new zziaf(zzhzpVar, new zziba(zziazVar, i2), i2, zzhflVar.f18595d.m8051b());
    }

    @Override // com.google.android.gms.internal.ads.zzhdr
    /* JADX INFO: renamed from: a */
    public final byte[] mo7400a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f19568d;
        int length2 = bArr3.length;
        int i2 = this.f19567c;
        if (length < i2 + length2) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!zzhok.m7598c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i3 = length - i2;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, length2, i3);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i3, length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrM8023a = zzhzw.m8023a(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8));
        zziba zzibaVar = this.f19566b;
        int i4 = zzibaVar.f19593b;
        zzhqo zzhqoVar = zzibaVar.f19592a;
        byte[] bArr4 = zzibaVar.f19594c;
        byte[] bArr5 = zzibaVar.f19595d;
        if (!MessageDigest.isEqual(bArr5.length > 0 ? zzhzw.m8023a(bArr4, zzhqoVar.mo7617a(i4, zzhzw.m8023a(bArrM8023a, bArr5))) : zzhzw.m8023a(bArr4, zzhqoVar.mo7617a(i4, bArrM8023a)), bArrCopyOfRange2)) {
            throw new GeneralSecurityException("invalid MAC");
        }
        int length3 = bArrCopyOfRange.length;
        zzhzp zzhzpVar = this.f19565a;
        int i5 = zzhzpVar.f19531b;
        if (length3 < i5) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr6 = new byte[i5];
        System.arraycopy(bArrCopyOfRange, 0, bArr6, 0, i5);
        int i6 = length3 - i5;
        byte[] bArr7 = new byte[i6];
        Cipher cipher = (Cipher) zzhzp.f19529d.get();
        byte[] bArr8 = new byte[zzhzpVar.f19532c];
        System.arraycopy(bArr6, 0, bArr8, 0, i5);
        cipher.init(2, zzhzpVar.f19530a, new IvParameterSpec(bArr8));
        if (cipher.doFinal(bArrCopyOfRange, i5, i6, bArr7, 0) == i6) {
            return bArr7;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
