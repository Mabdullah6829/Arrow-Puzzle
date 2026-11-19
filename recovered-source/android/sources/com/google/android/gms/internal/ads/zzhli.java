package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Security;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhli {

    /* JADX INFO: renamed from: a */
    public static final String[] f18920a = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    /* JADX INFO: renamed from: a */
    public static Provider m7509a() {
        for (int i2 = 0; i2 < 3; i2++) {
            Provider provider = Security.getProvider(f18920a[i2]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }
}
