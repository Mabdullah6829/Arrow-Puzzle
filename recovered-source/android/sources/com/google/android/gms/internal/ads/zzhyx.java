package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhyx implements zzheu {

    /* JADX INFO: renamed from: g */
    public static final byte[] f19488g = new byte[0];

    /* JADX INFO: renamed from: h */
    public static final byte[] f19489h = {0};

    /* JADX INFO: renamed from: i */
    public static final byte[] f19490i = {1, 2, 3};

    /* JADX INFO: renamed from: a */
    public final RSAPrivateCrtKey f19491a;

    /* JADX INFO: renamed from: b */
    public final String f19492b;

    /* JADX INFO: renamed from: c */
    public final byte[] f19493c;

    /* JADX INFO: renamed from: d */
    public final byte[] f19494d;

    /* JADX INFO: renamed from: e */
    public final zzhev f19495e;

    /* JADX INFO: renamed from: f */
    public final Provider f19496f;

    public zzhyx(RSAPrivateCrtKey rSAPrivateCrtKey, zzhwv zzhwvVar, byte[] bArr, byte[] bArr2, zzhev zzhevVar, Provider provider) throws GeneralSecurityException {
        if (!zzhle.m7504a(2)) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (zzhwvVar != zzhwv.f19314b && zzhwvVar != zzhwv.f19315c && zzhwvVar != zzhwv.f19316d) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(zzhwvVar)));
        }
        zzibi.m8047c(rSAPrivateCrtKey.getModulus().bitLength());
        zzibi.m8048d(rSAPrivateCrtKey.getPublicExponent());
        this.f19491a = rSAPrivateCrtKey;
        this.f19492b = zzhyy.m8011b(zzhwvVar);
        this.f19493c = bArr;
        this.f19494d = bArr2;
        this.f19495e = zzhevVar;
        this.f19496f = provider;
    }
}
