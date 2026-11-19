package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: loaded from: classes2.dex */
final class zzrg implements zzro {

    /* JADX INFO: renamed from: a */
    public final zzro[] f21768a;

    public zzrg(zzro... zzroVarArr) {
        this.f21768a = zzroVarArr;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzro
    /* JADX INFO: renamed from: a */
    public final zzrn mo9215a(Class cls) {
        for (int i2 = 0; i2 < 2; i2++) {
            zzro zzroVar = this.f21768a[i2];
            if (zzroVar.mo9216b(cls)) {
                return zzroVar.mo9215a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzro
    /* JADX INFO: renamed from: b */
    public final boolean mo9216b(Class cls) {
        for (int i2 = 0; i2 < 2; i2++) {
            if (this.f21768a[i2].mo9216b(cls)) {
                return true;
            }
        }
        return false;
    }
}
