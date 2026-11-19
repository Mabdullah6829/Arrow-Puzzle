package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhqt implements zzhqo {

    /* JADX INFO: renamed from: a */
    public final SecretKeySpec f19160a;

    /* JADX INFO: renamed from: b */
    public final Provider f19161b;

    public zzhqt(byte[] bArr, Provider provider) throws GeneralSecurityException {
        if (!zzhle.m7504a(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
        }
        this.f19160a = new SecretKeySpec(bArr, "AES");
        this.f19161b = provider;
    }

    @Override // com.google.android.gms.internal.ads.zzhqo
    /* JADX INFO: renamed from: a */
    public final byte[] mo7617a(int i2, byte[] bArr) throws NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (i2 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength must not be larger than 16");
        }
        Mac mac = Mac.getInstance("AESCMAC", this.f19161b);
        mac.init(this.f19160a);
        byte[] bArrDoFinal = mac.doFinal(bArr);
        return i2 == bArrDoFinal.length ? bArrDoFinal : Arrays.copyOf(bArrDoFinal, i2);
    }
}
