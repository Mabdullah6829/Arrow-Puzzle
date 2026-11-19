package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhlg {
    /* JADX INFO: renamed from: a */
    public static zzhdw m7506a() {
        try {
            zzhdw zzhdwVar = zzhff.f18584a;
            if (zzhlf.m7505a()) {
                throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
            }
            return zzhff.f18584a;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
