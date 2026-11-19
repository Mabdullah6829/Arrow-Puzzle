package com.google.android.gms.internal.ads;

import android.os.Build;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhzg implements zzheu {
    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX INFO: renamed from: a */
    public static zzhzg m8016a(zzhxl zzhxlVar) throws GeneralSecurityException {
        Provider providerM7509a;
        int i2 = zzhok.f19057a;
        if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
            providerM7509a = (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).intValue() > 23 ? zzhli.m7509a() : null;
        }
        if (providerM7509a == null) {
            throw new NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        KeyFactory keyFactory = KeyFactory.getInstance("RSA", providerM7509a);
        zzhxn zzhxnVar = zzhxlVar.f19400a;
        zzhxj zzhxjVar = zzhxnVar.f19410a;
        BigInteger bigInteger = zzhxnVar.f19411b;
        BigInteger bigInteger2 = zzhxjVar.f19388b;
        zzibl zziblVar = zzhxlVar.f19401b;
        zzhey zzheyVar = zzhey.f18574a;
        RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger, bigInteger2, zziblVar.f19615a, zzhxlVar.f19402c.f19615a, zzhxlVar.f19403d.f19615a, zzhxlVar.f19404e.f19615a, zzhxlVar.f19405f.f19615a, zzhxlVar.f19406g.f19615a));
        zzhxh zzhxhVar = zzhxjVar.f19390d;
        zzhxh zzhxhVar2 = zzhxjVar.f19391e;
        int i3 = zzhxjVar.f19392f;
        zzhxnVar.f19412c.m8051b();
        zzhxjVar.f19389c.getClass();
        zzhzg zzhzgVar = new zzhzg();
        if (!zzhle.m7504a(2)) {
            throw new GeneralSecurityException("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzibi.m8047c(rSAPrivateCrtKey.getModulus().bitLength());
        zzibi.m8048d(rSAPrivateCrtKey.getPublicExponent());
        zzhzh.m8017b(zzhxhVar);
        zzhzh.m8018c(zzhxhVar, zzhxhVar2, i3);
        return zzhzgVar;
    }
}
