package com.google.android.gms.internal.ads;

import android.os.Build;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhzh implements zzhev {

    /* JADX INFO: renamed from: g */
    public static final byte[] f19519g = new byte[0];

    /* JADX INFO: renamed from: h */
    public static final byte[] f19520h = {0};

    /* JADX INFO: renamed from: a */
    public final RSAPublicKey f19521a;

    /* JADX INFO: renamed from: b */
    public final String f19522b;

    /* JADX INFO: renamed from: c */
    public final PSSParameterSpec f19523c;

    /* JADX INFO: renamed from: d */
    public final byte[] f19524d;

    /* JADX INFO: renamed from: e */
    public final byte[] f19525e;

    /* JADX INFO: renamed from: f */
    public final Provider f19526f;

    public zzhzh(RSAPublicKey rSAPublicKey, zzhxh zzhxhVar, zzhxh zzhxhVar2, int i2, byte[] bArr, byte[] bArr2, Provider provider) throws GeneralSecurityException {
        if (!zzhle.m7504a(2)) {
            throw new GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (!zzhxhVar.equals(zzhxhVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        zzibi.m8047c(rSAPublicKey.getModulus().bitLength());
        zzibi.m8048d(rSAPublicKey.getPublicExponent());
        this.f19521a = rSAPublicKey;
        this.f19522b = m8017b(zzhxhVar);
        this.f19523c = m8018c(zzhxhVar, zzhxhVar2, i2);
        this.f19524d = bArr;
        this.f19525e = bArr2;
        this.f19526f = provider;
    }

    /* JADX INFO: renamed from: b */
    public static String m8017b(zzhxh zzhxhVar) {
        if (zzhxhVar == zzhxh.f19377b) {
            return "SHA256withRSA/PSS";
        }
        if (zzhxhVar == zzhxh.f19378c) {
            return "SHA384withRSA/PSS";
        }
        if (zzhxhVar == zzhxh.f19379d) {
            return "SHA512withRSA/PSS";
        }
        throw new IllegalArgumentException("Unsupported hash: ".concat(String.valueOf(zzhxhVar)));
    }

    /* JADX INFO: renamed from: c */
    public static PSSParameterSpec m8018c(zzhxh zzhxhVar, zzhxh zzhxhVar2, int i2) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        zzhxh zzhxhVar3 = zzhxh.f19379d;
        zzhxh zzhxhVar4 = zzhxh.f19378c;
        zzhxh zzhxhVar5 = zzhxh.f19377b;
        if (zzhxhVar == zzhxhVar5) {
            str = "SHA-256";
        } else if (zzhxhVar == zzhxhVar4) {
            str = "SHA-384";
        } else {
            if (zzhxhVar != zzhxhVar3) {
                throw new IllegalArgumentException("Unsupported MD hash: ".concat(String.valueOf(zzhxhVar)));
            }
            str = "SHA-512";
        }
        if (zzhxhVar2 == zzhxhVar5) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (zzhxhVar2 == zzhxhVar4) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (zzhxhVar2 != zzhxhVar3) {
                throw new IllegalArgumentException("Unsupported MGF1 hash: ".concat(String.valueOf(zzhxhVar2)));
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        }
        return new PSSParameterSpec(str, "MGF1", mGF1ParameterSpec, i2, 1);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    /* JADX INFO: renamed from: d */
    public static zzhzh m8019d(zzhxn zzhxnVar) throws NoSuchAlgorithmException, NoSuchProviderException {
        Provider providerM7509a;
        int i2 = zzhok.f19057a;
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            providerM7509a = (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).intValue() > 23 ? zzhli.m7509a() : null;
        }
        Provider provider = providerM7509a;
        if (provider == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", provider);
        BigInteger bigInteger = zzhxnVar.f19411b;
        zzhxj zzhxjVar = zzhxnVar.f19410a;
        return new zzhzh((RSAPublicKey) keyFactory.generatePublic(new RSAPublicKeySpec(bigInteger, zzhxjVar.f19388b)), zzhxjVar.f19390d, zzhxjVar.f19391e, zzhxjVar.f19392f, zzhxnVar.f19412c.m8051b(), zzhxjVar.f19389c.equals(zzhxi.f19383d) ? f19520h : f19519g, provider);
    }

    @Override // com.google.android.gms.internal.ads.zzhev
    /* JADX INFO: renamed from: a */
    public final void mo7422a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f19524d;
        if (!zzhok.m7598c(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance(this.f19522b, this.f19526f);
        signature.initVerify(this.f19521a);
        signature.setParameter(this.f19523c);
        signature.update(bArr2);
        byte[] bArr4 = this.f19525e;
        if (bArr4.length > 0) {
            signature.update(bArr4);
        }
        int length = bArr.length;
        int length2 = bArr3.length;
        if (!signature.verify(bArr, length2, length - length2)) {
            throw new GeneralSecurityException("signature verification failed");
        }
    }
}
