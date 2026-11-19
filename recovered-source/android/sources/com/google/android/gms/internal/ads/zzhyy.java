package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhyy implements zzhev {

    /* JADX INFO: renamed from: f */
    public static final byte[] f19497f = new byte[0];

    /* JADX INFO: renamed from: g */
    public static final byte[] f19498g = {0};

    /* JADX INFO: renamed from: a */
    public final RSAPublicKey f19499a;

    /* JADX INFO: renamed from: b */
    public final String f19500b;

    /* JADX INFO: renamed from: c */
    public final byte[] f19501c;

    /* JADX INFO: renamed from: d */
    public final byte[] f19502d;

    /* JADX INFO: renamed from: e */
    public final Provider f19503e;

    public zzhyy(RSAPublicKey rSAPublicKey, zzhwv zzhwvVar, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhle.m7504a(2)) {
            throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzibi.m8047c(rSAPublicKey.getModulus().bitLength());
        zzibi.m8048d(rSAPublicKey.getPublicExponent());
        this.f19499a = rSAPublicKey;
        this.f19500b = m8011b(zzhwvVar);
        this.f19501c = bArr;
        this.f19502d = bArr2;
        this.f19503e = provider;
    }

    /* JADX INFO: renamed from: b */
    public static String m8011b(zzhwv zzhwvVar) throws GeneralSecurityException {
        if (zzhwvVar == zzhwv.f19314b) {
            return "SHA256withRSA";
        }
        if (zzhwvVar == zzhwv.f19315c) {
            return "SHA384withRSA";
        }
        if (zzhwvVar == zzhwv.f19316d) {
            return "SHA512withRSA";
        }
        throw new GeneralSecurityException("unknown hash type");
    }

    /* JADX INFO: renamed from: c */
    public static zzhyy m8012c(zzhxb zzhxbVar, Provider provider) throws NoSuchAlgorithmException {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", provider);
        BigInteger bigInteger = zzhxbVar.f19357b;
        zzhwx zzhwxVar = zzhxbVar.f19356a;
        return new zzhyy((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, zzhwxVar.f19325b)), zzhwxVar.f19327d, zzhxbVar.f19358c.m8051b(), zzhwxVar.f19326c.equals(zzhww.f19320d) ? f19498g : f19497f, provider);
    }

    @Override // com.google.android.gms.internal.ads.zzhev
    /* JADX INFO: renamed from: a */
    public final void mo7422a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f19501c;
        if (!zzhok.m7598c(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.f19500b, this.f19503e);
        signature.initVerify(this.f19499a);
        signature.update(bArr2);
        byte[] bArr4 = this.f19502d;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        try {
            if (signature.verify(Arrays.copyOfRange(bArr, bArr3.length, bArr.length))) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        throw new GeneralSecurityException("Invalid signature");
    }
}
