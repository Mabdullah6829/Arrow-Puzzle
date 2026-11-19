package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhpy implements zzhou {
    /* JADX INFO: renamed from: a */
    public static zzhpy m7614a(zzhom zzhomVar, Provider provider) throws GeneralSecurityException {
        zzhpy zzhpyVar = new zzhpy();
        if (!zzhle.m7504a(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            zzhomVar.f19063c.m8051b();
            zzibm zzibmVar = zzhomVar.f19062b;
            zzhey zzheyVar = zzhey.f18574a;
            new SecretKeySpec(zzibmVar.f19616a.m8051b(), "AES");
            return zzhpyVar;
        } catch (NoSuchAlgorithmException e) {
            throw new GeneralSecurityException("AES-CMAC not available.", e);
        }
    }
}
