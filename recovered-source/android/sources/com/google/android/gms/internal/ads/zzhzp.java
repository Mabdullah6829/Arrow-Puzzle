package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhzp implements zziav {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f19529d = new zzhzo();

    /* JADX INFO: renamed from: a */
    public final SecretKeySpec f19530a;

    /* JADX INFO: renamed from: b */
    public final int f19531b;

    /* JADX INFO: renamed from: c */
    public final int f19532c;

    public zzhzp(byte[] bArr, int i2) throws GeneralSecurityException {
        if (!zzhle.m7504a(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzibi.m8045a(bArr.length);
        this.f19530a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f19529d.get()).getBlockSize();
        this.f19532c = blockSize;
        if (i2 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f19531b = i2;
    }
}
