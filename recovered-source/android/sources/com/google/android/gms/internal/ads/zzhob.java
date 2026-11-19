package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
final class zzhob extends ThreadLocal {
    /* JADX WARN: Code duplicated, block: B:12:0x002a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        SecureRandom secureRandom;
        Provider provider;
        ThreadLocal threadLocal = zzhoc.f19044a;
        Provider providerM7509a = zzhli.m7509a();
        if (providerM7509a != null) {
            try {
                secureRandom = SecureRandom.getInstance("SHA1PRNG", providerM7509a);
            } catch (GeneralSecurityException unused) {
                provider = null;
                try {
                    provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
                } catch (Throwable unused2) {
                }
                if (provider != null) {
                    try {
                        secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
                    } catch (GeneralSecurityException unused3) {
                        secureRandom = new SecureRandom();
                    }
                } else {
                    secureRandom = new SecureRandom();
                }
            }
        } else {
            provider = null;
            provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
            if (provider != null) {
                secureRandom = SecureRandom.getInstance("SHA1PRNG", provider);
            } else {
                secureRandom = new SecureRandom();
            }
        }
        secureRandom.nextLong();
        return secureRandom;
    }
}
