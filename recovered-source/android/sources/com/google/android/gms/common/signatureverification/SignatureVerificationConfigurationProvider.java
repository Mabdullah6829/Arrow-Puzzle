package com.google.android.gms.common.signatureverification;

/* JADX INFO: loaded from: classes.dex */
public class SignatureVerificationConfigurationProvider {

    /* JADX INFO: renamed from: a */
    public static final SignatureVerificationConfiguration f4616a = null;

    static {
        synchronized (zzd.class) {
            if (zzd.f4617a == null) {
                zzb zzbVar = new zzb();
                synchronized (zzd.class) {
                    if (zzd.f4617a != null) {
                        throw new IllegalStateException("Redundantly setting SignatureVerificationConfiguration");
                    }
                    zzd.f4617a = zzbVar;
                }
            }
        }
    }

    private SignatureVerificationConfigurationProvider() {
    }
}
