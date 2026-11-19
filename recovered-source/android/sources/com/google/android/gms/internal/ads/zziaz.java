package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zziaz implements zzhqo {

    /* JADX INFO: renamed from: a */
    public final ThreadLocal f19586a;

    /* JADX INFO: renamed from: b */
    public final String f19587b;

    /* JADX INFO: renamed from: c */
    public final SecretKeySpec f19588c;

    /* JADX INFO: renamed from: d */
    public final int f19589d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    public zziaz(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        byte b;
        int i2;
        zziay zziayVar = new zziay(this);
        this.f19586a = zziayVar;
        if (!zzhle.m7504a(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f19587b = str;
        this.f19588c = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str) {
            case "HMACSHA1":
                b = 0;
                break;
            case "HMACSHA224":
                b = 1;
                break;
            case "HMACSHA256":
                b = 2;
                break;
            case "HMACSHA384":
                b = 3;
                break;
            case "HMACSHA512":
                b = 4;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            i2 = 20;
        } else if (b == 1) {
            i2 = 28;
        } else if (b == 2) {
            i2 = 32;
        } else if (b == 3) {
            i2 = 48;
        } else {
            if (b != 4) {
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            }
            i2 = 64;
        }
        this.f19589d = i2;
        zziayVar.get();
    }

    @Override // com.google.android.gms.internal.ads.zzhqo
    /* JADX INFO: renamed from: a */
    public final byte[] mo7617a(int i2, byte[] bArr) throws InvalidAlgorithmParameterException {
        if (i2 > this.f19589d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ThreadLocal threadLocal = this.f19586a;
        ((Mac) threadLocal.get()).update(bArr);
        return Arrays.copyOf(((Mac) threadLocal.get()).doFinal(), i2);
    }
}
