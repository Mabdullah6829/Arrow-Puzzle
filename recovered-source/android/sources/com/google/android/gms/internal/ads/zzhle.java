package com.google.android.gms.internal.ads;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhle {
    /* JADX INFO: renamed from: a */
    public static boolean m7504a(int i2) {
        Boolean bool;
        if (i2 - 1 == 0) {
            return !zzhlf.m7505a();
        }
        if (!zzhlf.m7505a()) {
            return true;
        }
        try {
            bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            zzhlf.f18918a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            bool = Boolean.FALSE;
        }
        return bool.booleanValue();
    }
}
