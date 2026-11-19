package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhyn implements zzhev {

    /* JADX INFO: renamed from: e */
    public static final byte[] f19466e = {48, 42, 48, 5, 6, 3, 43, 101, 112, 3, 33, 0};

    /* JADX INFO: renamed from: a */
    public final PublicKey f19467a;

    /* JADX INFO: renamed from: b */
    public final byte[] f19468b;

    /* JADX INFO: renamed from: c */
    public final byte[] f19469c;

    /* JADX INFO: renamed from: d */
    public final Provider f19470d;

    public zzhyn(byte[] bArr, byte[] bArr2, byte[] bArr3, Provider provider) throws GeneralSecurityException {
        if (!zzhle.m7504a(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Given public key's length is not 32.");
        }
        this.f19467a = KeyFactory.getInstance("Ed25519", provider).generatePublic(new X509EncodedKeySpec(zzhzw.m8023a(f19466e, bArr)));
        this.f19468b = bArr2;
        this.f19469c = bArr3;
        this.f19470d = provider;
    }

    /* JADX INFO: renamed from: b */
    public static zzhyn m8007b(zzhvw zzhvwVar) throws GeneralSecurityException {
        Provider providerM7509a = zzhli.m7509a();
        if (providerM7509a == null) {
            throw new NoSuchProviderException("Ed25519VerifyJce requires the Conscrypt provider.");
        }
        if (zzhle.m7504a(1)) {
            return new zzhyn(zzhvwVar.f19264b.m8051b(), zzhvwVar.f19265c.m8051b(), zzhvwVar.f19263a.f19250a.equals(zzhvo.f19247d) ? new byte[]{0} : new byte[0], providerM7509a);
        }
        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.ads.zzhev
    /* JADX INFO: renamed from: a */
    public final void mo7422a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f19468b;
        int length = bArr3.length;
        if (bArr.length != length + 64) {
            throw new GeneralSecurityException("Invalid signature length: 64");
        }
        if (!zzhok.m7598c(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        Signature signature = Signature.getInstance("Ed25519", this.f19470d);
        signature.initVerify(this.f19467a);
        signature.update(bArr2);
        signature.update(this.f19469c);
        try {
            if (signature.verify(bArr, length, 64)) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        throw new GeneralSecurityException("Signature check failed.");
    }
}
