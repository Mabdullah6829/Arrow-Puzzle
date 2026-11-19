package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.spec.PKCS8EncodedKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhym implements zzheu {

    /* JADX INFO: renamed from: a */
    public static final byte[] f19465a = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 112, 4, 34, 4, 32};

    /* JADX INFO: renamed from: a */
    public static zzhym m8006a(zzhvq zzhvqVar) throws GeneralSecurityException {
        Provider providerM7509a = zzhli.m7509a();
        if (providerM7509a == null) {
            throw new NoSuchProviderException("Ed25519SignJce requires the Conscrypt provider.");
        }
        zzibm zzibmVar = zzhvqVar.f19252b;
        zzhvw zzhvwVar = zzhvqVar.f19251a;
        zzhey zzheyVar = zzhey.f18574a;
        byte[] bArrM8051b = zzibmVar.f19616a.m8051b();
        zzhvwVar.f19265c.m8051b();
        zzhvwVar.f19263a.f19250a.getClass();
        zzhym zzhymVar = new zzhym();
        if (!zzhle.m7504a(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArrM8051b.length != 32) {
            throw new IllegalArgumentException("Given private key's length is not 32");
        }
        KeyFactory.getInstance("Ed25519", providerM7509a).generatePrivate(new PKCS8EncodedKeySpec(zzhzw.m8023a(f19465a, bArrM8051b)));
        return zzhymVar;
    }
}
