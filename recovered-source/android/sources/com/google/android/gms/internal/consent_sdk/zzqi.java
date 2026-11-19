package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
final class zzqi implements zzro {

    /* JADX INFO: renamed from: a */
    public static final zzqi f21740a = new zzqi();

    private zzqi() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzro
    /* JADX INFO: renamed from: a */
    public final zzrn mo9215a(Class cls) {
        if (!zzqm.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzrn) zzqm.m9218f(cls.asSubclass(zzqm.class)).mo9141e(3);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzro
    /* JADX INFO: renamed from: b */
    public final boolean mo9216b(Class cls) {
        return zzqm.class.isAssignableFrom(cls);
    }
}
